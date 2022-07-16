Feature: As a user I should be able to get API Marketplace Token

  Background:
    * def baseURL = 'https://q-api.wakago.net/apimarket/live'
#    * configure proxy = proxy
    * def clientId = 'bb748243-5c02-46dc-86a6-175e91144f73'
    * def clientSecret = 'R4vL6aN4tW2uE6lR3eQ2wH0bX7qO8eU4bV7oO8hR4iN5mD0lF0'
    * def redirectUri = 'https://google.com'
    * def securityToken = read('TokenStore/AccessToken.txt')
    * def NationalProfileSchema = {"FirstName": #string, "Surname": #string, "Photo": #string}
    * def BankStatusSchema = {"usableNedbankId": #boolean, "hasNedbankRecord": #boolean, "partyTypeIndicator": #string, "ficaStatus": #string, "partyId": #string, "walletId": #string, "walletExists": #boolean }
    * def saveId =
      """
        function(arg1, arg2) {
          var KarateUtil = Java.type('za.co.nedbank.dfl.digital.enablement.platform.test.api.KarateUtil');
          var kUtil = new KarateUtil;
          return kUtil.saveIds(arg1, arg2);
        }
        """

    * def WebAuthToken =
    """
      function(arg1, arg2, arg3, arg4, arg5) {
        var wToken = Java.type('za.co.nedbank.dfl.digital.enablement.platform.test.api.WebAuthToken');
        var webToken = new wToken();
        return webToken.platform_get_Auth_AccessToken_Via_Web(arg1, arg2, arg3, arg4, arg5);
      }
      """

  @securityToken
  Scenario Outline: Get Light Token
    Given path '/nboauth/oauth20/token'
    And header Content-Type = 'application/x-www-form-urlencoded'
    And form field scope = "<scope>"
    And form field grant_type = "<grant_type>"
    And form field client_secret = clientSecret
    And form field client_id = clientId
    And url baseURL
    When method post
    Then status 200
    And print response
    And def accessToken = response.access_token
    And def savedData = saveId(accessToken, 'src/test/features/ApiMarketPlace/TokenStore/AccessToken.txt')

    Examples:
    | scope                 | grant_type         |
    | tpp_client_credential | client_credentials |

  @securityToken
  Scenario: Create Intent
    Given path '/open-banking/v1/subscriptions'
    And url baseURL
    And def lightToken = read('TokenStore/AccessToken.txt')
    And header Content-Type = "application/json"
    And header Authorization = 'Bearer '+ lightToken
    And header x-fapi-financial-id = "OB/2017/001"
    And configure charset = null
    And header x-fapi-interaction-id = "1234543645"
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And def reqMsg =
    """
    {
     "Data": {
       "Permissions": [
         "PERFORM_ONBOARDING",
         "CUSTOMER_MANAGEMENT"

       ],
       "ExpirationDateTime": "2020-05-06T00:00:00-00:00"
     },
     "Risk": {}
    }
    """
    And request reqMsg
    When method post
    Then status 201
    And print response
    And def intentID = response.Data.subscription_id
    And def savedData = saveId(intentID, 'src/test/features/ApiMarketPlace/TokenStore/Intent_Id.txt')

  Scenario Outline:Get National Profile with an Invalid ID Number
    Given url baseURL
    And def intentId = read('TokenStore/Intent_Id.txt')
    And path '/nb-identity/api/identity/v1/<Id>/national-profile'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    When method get
    Then status 400
    And print response
    And match response.error.statusCode == '<expectedErrorCode>'
    And match response.error.additionalInfo == '<expectedAdditionalInfo>'

    Examples:
      | Id   | expectedErrorCode | expectedAdditionalInfo |
      | 1234 | 400               | Invalid IDN            |

  Scenario Outline:Get National Profile
    Given url baseURL
    And def intentId = read('TokenStore/Intent_Id.txt')
    And path '/nb-identity/api/identity/v1/<Id>/national-profile'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    When method get
    Then status 200
    And print response
    And match response contains NationalProfileSchema
    And match response.FirstName != ""
    And match response.Surname != ""
    And match response.Photo != ""


    Examples:
      | Id            |
      | 9203180417082 |

  Scenario Outline: Invalid Name Verification
    Given url baseURL
    And def intentId = read('TokenStore/Intent_Id.txt')
    And path '/nb-identity/api/identity/v1/<Id>/name-verification'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    And def reqMsg =
    """
      {
          "FirstName":"<firstName>",
          "Surname":"<surname>"
      }
    """
    And request reqMsg
    When method post
    Then status 400
    And print response
    And match response.Status == 'Failed'


    Examples:
      | Id            | firstName       | surname   |
      | 9203180417082 | KGOTHATSO SOPHY | TTTTTTTTT |
      | 9203180417082 | Fortunate       | BAPELA    |

  Scenario Outline: Name Verification
    Given url baseURL
    And def intentId = read('TokenStore/Intent_Id.txt')
    And path '/nb-identity/api/identity/v1/<Id>/name-verification'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    And def reqMsg =
    """
      {
          "FirstName":"KGOTHATSO SOPHY",
          "Surname":"BAPELA"
      }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response.Status == 'Success'


    Examples:
      | Id            |
      | 9203180417082 |

  Scenario Outline: Create Customer with Invalid Data
    Given url baseURL
    And def intentId = read('TokenStore/Intent_Id.txt')
    And path '/bus/customers'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    And def reqMsg =
    """
      {
        "FirstName": "<FirstName>",
        "LastName": "<LastName>",
        "GovernmentId": "<GovernmentId>",
        "MobileNumber": "<MobileNumber>",
        "OccupationCode": "1261",
        "SourceOfFundsCode": "1017",
        "HasTaxObligations": "N",
        "ResidentialAddress": "105 west street, sandton",
        "Email": "rennay@gmail.com",
        "BirthDate":"1992-03-18T00:00:00.002"
      }
    """
    And request reqMsg
    When method post
    Then status 400
    And print response
    And match response.PartyID == ''
    And match response.NedbankID == ''


    Examples:
      | FirstName         | LastName | GovernmentId  | MobileNumber |
      | KGOTHATSO Biscuit | BAPELA   | 9203180417082 | 0826741820   |

  Scenario Outline: Create Customer
    Given url baseURL
    And def intentId = read('TokenStore/Intent_Id.txt')
    And path '/bus/customers'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    And def reqMsg =
    """
      {
        "FirstName": "<FirstName>",
        "LastName": "<LastName>",
        "GovernmentId": "<GovernmentId>",
        "MobileNumber": "<MobileNumber>",
        "OccupationCode": "1261",
        "SourceOfFundsCode": "1017",
        "HasTaxObligations": "N",
        "ResidentialAddress": "105 west street, sandton",
        "Email": "rennay@gmail.com",
        "BirthDate":"1992-03-18T00:00:00.002"
      }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response.PartyID != ''
    And match response.NedbankID != ''
    And def partyId = response.PartyID
    And def savedDate = saveId(partyId, 'src/test/features/ApiMarketPlace/TokenStore/Party_Id.txt')

    Examples:
      | FirstName       | LastName | GovernmentId  | MobileNumber |
      | KGOTHATSO SOPHY | BAPELA   | 9203180417082 | 0826741820   |

  @securityToken
  Scenario: Get Heavy Token (NB Token)
    Given path '/nb-identity/api/identity/v1/nb-token'
    And header Authorization = 'Bearer '+ securityToken
    And def intentId = read('TokenStore/Intent_Id.txt')
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header x-nb-subscription-id = intentId
    And header Content-Type = 'application/x-www-form-urlencoded'
    And form field grant_type = "urn:ietf:params:oauth:grant-type:jwt-bearer"
    And form field scope = "openid,bcustomers,onboarding"
    And form field redirect_uri = "https://google.com"
    And url baseURL
    When method post
    Then status 200
    And print response
    And def accessToken = response.access_token
    And def savedDate = saveId(accessToken, 'src/test/features/ApiMarketPlace/TokenStore/heavy_token.txt')

  Scenario Outline:Get Complaince Status with an Invalid Party ID
    Given def heavyToken = ('TokenStore/heavy_token.txt')
    And url baseURL
    And path '/bus/customers/<partyId>/compliance-status'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 400
    And print response

    Examples:
      | partyId |
      | 1234    |

  Scenario:Get Compliance Status
    Given def heavyToken = ('TokenStore/heavy_token.txt')
    And def partyId = read('TokenStore/Party_Id.txt')
    And url baseURL
    And path '/bus/customers/', partyId, '/compliance-status'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response.FICAStatus == 'full'
    And match response.PartyTypeIndicator == 'P-PRIVATE INDIVIDUALS'
    And match response.ErrorDescription == 'OK'

  Scenario Outline:Get Juristic Status with Invalid party Id
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And path '/bus/customers/<partyId>/juristic-status'
    And param company-registration = <companyRegistrationDate>
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response.PartyTypeIndicator == ''
    And match response.CompanyPartyID == ''

    Examples:
      | partyId | companyRegistrationDate |
      | 1234    | 201912080107            |

  Scenario Outline:Get Juristic Status
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And def partyId = read('TokenStore/Party_Id.txt')
    And path '/bus/customers/', partyId, '/juristic-status'
    And param company-registration = '<companyRegistrationDate>'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response.PartyTypeIndicator != ''
    And match response.CompanyPartyID == partyId

    Examples:
      | companyRegistrationDate |
      | 201912080107            |

  Scenario Outline:Get Bank Status
    Given url baseURL
    And path '/nb-identity/api/identity/v1/<Id>/nb-status'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response contains BankStatusSchema


    Examples:
      | Id            |
      | 9203180417082 |

  Scenario Outline:Get Bank Status with invalid ID
    Given url baseURL
    And path '/nb-identity/api/identity/v1/<Id>/nb-status'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 400
    And print response
    And match response.hasNedbankRecord == false


    Examples:
      | Id   |
      | 1234 |

  Scenario Outline:Check and Set Onboarding Using Invalid Party
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And path '/nb-onboarding/api/nb/v1/onboarding/<partyId>/check-set-onboarding'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header content-type = 'application/json'
    And def reqMsg =
    """
    [{
          "ConsentType":"WWW",
          "ConsentDate":"",
          "Consent": true
      },
      {
          "ConsentType":"MARKETING",
          "ConsentDate":"",
          "Consent": true
      },{
          "ConsentType":"NID",
          "ConsentDate":"",
          "Consent": true
      }]
    """
    And request reqMsg
    When method post
    Then status 400
    And print response

    Examples:
      | partyId |
      | 1234    |

  Scenario:Check and Set Onboarding Using Party
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And def partyId = read('TokenStore/Party_Id.txt')
    And path '/nb-onboarding/api/nb/v1/onboarding/', partyId, '/check-set-onboarding'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And def reqMsg =
    """
    [{
          "ConsentType":"WWW",
          "ConsentDate":"",
          "Consent": true
      },
      {
          "ConsentType":"MARKETING",
          "ConsentDate":"",
          "Consent": true
      },{
          "ConsentType":"NID",
          "ConsentDate":"",
          "Consent": true
      }]
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response != ''

  Scenario Outline: Finish Onboarding Using Invalid Party
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And path '/nb-onboarding/api/nb/v1/onboarding/<partyId>/finish-onboarding'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header content-type = 'application/json'
    And def reqMsg =
    """
    {}
    """
    And request reqMsg
    When method post
    Then status 400
    And print response

    Examples:
      | partyId |
      | 1234    |

  Scenario: Finish Onboarding Using Party
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And def partyId = read('TokenStore/Party_Id.txt')
    And path '/nb-onboarding/api/nb/v1/onboarding/', partyId, '/finish-onboarding'
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And def reqMsg =
    """
    {}
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response != ''

  Scenario: Maintain Party
    Given url baseURL
    And def heavyToken = ('TokenStore/heavy_token.txt')
    And def partyId = read('TokenStore/Party_Id.txt')
    And path '/bus/customers/', partyId
    And header Authorization = 'Bearer '+ heavyToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    And header content-type = 'application/json'
    And header x-fapi-financial-id = "OB/2017/001"
    And def reqMsg =
    """
    {
      "Gender": "M",
      "TitleCode": "1068",
      "TitleValue": "MS",
      "IndustryCode": "1277",
      "SourceOfFundsCode": "1017",
      "OccupationCode": "1001",
      "ResidentialAddress": {
        "AddressLine1": "7846 LOVEDALE",
        "AddressLine2": "VALLEYVIEW",
        "City": "SANDTON",
        "PostalCode": "02196",
        "Suburb": "SANDTON",
        "Country": "SOUTH AFRICA",
        "CountryCode": "ZA"
      },
      "Email": "brights@nedbank.co.za"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response != ''