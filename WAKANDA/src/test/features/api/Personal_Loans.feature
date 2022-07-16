Feature: As a Merchant Service User I want to be able to manage wallet calls

  Background:
#    * def basePersonalLoanURL = 'https://stage-api.wakago.net/wallet'
    * def securityToken = read('TokenStore/SecurityToken.txt')
    * def saveId =
      """
        function(arg1, arg2) {
          var KarateUtil = Java.type('za.co.nedbank.dfl.digital.enablement.platform.test.api.KarateUtil');
          var kUtil = new KarateUtil;
          return kUtil.saveIds(arg1, arg2);
        }
      """
      * def getCurrentTimeStamp =
      """
         function(arg1) {
        var SimpleDateFormat = Java.type('java.text.SimpleDateFormat');
        var sdf = new SimpleDateFormat(arg1);
        var date = new java.util.Date();
        return sdf.format(date);
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
    * def locationName = 'TestArea_' + getCurrentTimeStamp('yyMMddHHMM')

  @Personal-Loans
  Scenario Outline: Get Authorization URL for NedBank Authentication and save the code
    Given path '/v1/loan/nedbankId'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "loanAmount": {
        "amount": <amount>,
        "currencyCode": "<currencyCode>"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def reqId = responseJson.requestId
    And def save =  saveId(reqId, 'src/test/features/api/TokenStore/Personal_Loans_Request_Id.txt')
    And def auth_URL = responseJson.authorizeUrl
    And def save = saveId(auth_URL, 'src/test/features/api/TokenStore/Personal_Loans_Auth_URL.txt')
    And def wToken = WebAuthToken("ghoststaff37", "Mfc@vaf1", auth_URL, "ops-loans", "")

    Examples:
      | amount | currencyCode |
      | 10000  | ZAR          |

  @Personal-Loans
  Scenario: Get or Make Loan Request
    Given path '/v1/loan/start'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.limitMax.amount != '0'
    And match responseJson.limitMin.amount != '0'
    And match responseJson.limitMin.currencyCode == 'ZAR'
    And match responseJson.limitMax.currencyCode == 'ZAR'

  @Personal-Loans
  Scenario: Store Code After Successful Authentication
    Given def reqId = read('TokenStore/Personal_Loans_Request_Id.txt')
    And def Code = read('TokenStore/Access_token_web.txt')
    And path '/v1/loan/nedbankIdSuccess'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "requestId": "#(reqId)",
      "code": "#(Code)"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def offerId = responseJson[0].offerId
    And def save =  saveId(offerId, 'src/test/features/api/TokenStore/Personal_Loans_Offer_Id.txt')
    And def term = responseJson[0].term
    And def save =  saveId(offerId, 'src/test/features/api/TokenStore/Personal_Loans_Offer_Term.txt')

  @Personal-Loans
  Scenario Outline: Update Financial Information
    Given path '/v1/loan/financialinfo'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "financialInfo": {
        "fixed": true,
        "netIncome": {
          "amount": <netIncome>,
          "currencyCode": "<currencyCode>"
        },
        "totalExpense": {
          "amount": <totalExpense>,
          "currencyCode": "<currencyCode>"
        },
        "debt": {
          "amount": <debt>,
          "currencyCode": "<currencyCode>"
        },
        "livingExpense": {
          "amount": <livingExpense>,
          "currencyCode": "<currencyCode>"
        }
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
    | netIncome | totalExpense | debt | livingExpense | currencyCode |
    | 20000     | 4000         | 2000 | 2500          | ZAR          |

  @Personal-Loans
  Scenario Outline: Calculate Loan
    Given def offerId = read('TokenStore/Personal_Loans_Offer_Id.txt')
    And path '/v1/loan/calculate'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "offerId": "#(offerId)",
      "amount": {
        "amount": <amount>,
        "currencyCode": "<currencyCode>"
      },
      "installments": <installments>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.monthlyPayment.amount != 0
    And match responseJson.monthlyPayment.currencyCode == 'ZAR'

    Examples:
      | amount | currencyCode | installments |
      | 2000   | ZAR          | 0            |


  @Personal-Loans
  Scenario Outline: Validate Loan
    Given def offerId = read('TokenStore/Personal_Loans_Offer_Id.txt')
    And path '/v1/loan/validate'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "offerId": "#(offerId)",
      "amount": {
        "amount": <amount>,
        "currencyCode": "<currencyCode>"
      },
      "installments": <installments>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.monthlyPayment.amount != 0
    And match responseJson.monthlyPayment.currencyCode == 'ZAR'

    Examples:
      | amount | currencyCode | installments |
      | 2000   | ZAR          | 0            |

  @Personal-Loans
  Scenario Outline: Confirm Loan
    Given def offerId = read('TokenStore/Personal_Loans_Offer_Id.txt')
    And path '/v1/loan'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "offerId": "#(offerId)",
      "amount": {
        "amount": <amount>,
        "currencyCode": "<currencyCode>"
      },
      "installments": <installments>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | amount | currencyCode | installments |
      | 2000   | ZAR          | 0            |

  @Personal-Loans
  Scenario Outline: Decline Loan
    Given def offerId = read('TokenStore/Personal_Loans_Offer_Id.txt')
    And path '/v1/loan/decline'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "offerId": "#(offerId)",
      "reasonId": "<reasonId>",
      "description": "<description>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | reasonId | description            |
      | 1        | Waka Loan Decline Test |

  @Personal-Loans
  Scenario: Get Decline Loan List
    Given def offerId = read('TokenStore/Personal_Loans_Offer_Id.txt')
    And path '/v1/loan/decline'
    And url basePersonalLoanURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    #validation required here for the list

