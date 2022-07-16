Feature: As a user I want to be able to make chat service calls

  Background:
#    * def baseChatURL = 'https://stage-api.wakago.net/users'
    * def securityToken = read('TokenStore/SecurityToken.txt')
    * def tempAccessToken = read('TokenStore/TempAccessToken.txt')
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
    * def locationName = 'TestArea_' + getCurrentTimeStamp('yyMMddHHMM')

  @Users
  Scenario Outline: User Initial Activation Start
    Given url baseChatURL
    And path '/auth/api/public/activation/v1/start'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "clientId": "<clientId>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response.activationPayload != ''

    Examples:
      | clientId                             |
      | d6a84d64-24dc-4577-b6e0-341139c7adc3 |

  @Users
  Scenario Outline: User Initial Activation Finish
    Given url baseChatURL
    And path '/auth/api/public/activation/v1/finish'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "clientId": "<clientId>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response.activationPayload != ''

    Examples:
      | clientId                             |
      | d6a84d64-24dc-4577-b6e0-341139c7adc3 |

  @Users
  Scenario Outline: User Login Start
    Given url baseChatURL
    And path '/auth/api/public/login/v1/start'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "clientId": "<clientId>",
      "responseType": "<responseType>",
      "scope": "<scope>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And def tempToken = response.temporaryAccessToken
    And def saveActivationId = saveId(tempToken, 'src/test/features/api/TokenStore/TemporaryAccessToken.txt')

    Examples:
      | clientId                             | responseType | scope      |
      | d6a84d64-24dc-4577-b6e0-341139c7adc3 | TOKEN        | enrollment |

  @Users
  Scenario Outline: User Login Authenticate
    Given url baseChatURL
    And def tempToken = read('TokenStore/TemporaryAccessToken.txt')
    And path '/auth/api/public/login/v1/authenticate'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "authToken": {
        "username": {
          "secretPayload":"",
          "username":"<username>"
        }
      },
      "temporaryAccessToken":"#(tempToken)"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | username |
      | test1    |


  @Users
  Scenario Outline: User Temporary Login
    Given url baseChatURL
    And def tempToken = read('TokenStore/TemporaryAccessToken.txt')
    And path '/auth/api/public/activation/v1/authenticate'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "authToken": {
        "username": {
          "secretPayload":"<secretPayload>",
          "username":"<username>"
        }
      },
      "temporaryAccessToken":"#(tempToken)"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | username | secretPayload |
      | test1    | Heslo123       |

  @Users
  Scenario: Validate Token
    Given url baseChatURL
    And def tempToken = read('TokenStore/TemporaryAccessToken.txt')
    And path '/spt/validate'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "token": "#(tempToken)"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

  @Users
  Scenario Outline: Activate New Device
    Given url baseChatURL
    And path '/spt/validate'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "clientId": "<clientId>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
    | clientId |
    | 12345    |

  @Users
  Scenario Outline: Complete New Device Activation
    Given url baseChatURL
    And path '/auth/api/public/activation/v1/finish'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "deviceName": "<deviceName>",
      "deviceVerificationKeys": {
        "additionalProp1": "string"
      },
      "deviceInfo": {
        "additionalProp1": "string"
      },
      "activationPayload": "string"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And match response.activationId != 0
    And def activationId = response.activationId
    And def saveActivationId = saveId(activationId, 'src/test/features/api/TokenStore/Activation_Id.txt')

    Examples:
      | deviceName  |
      | WakaAPITest |

  @Users
  Scenario Outline: Update Activated Device Info
    Given url baseChatURL
    And path '/auth/api/public/activation/update/v1/start'
    And header Content-Type = 'application/json'
    And def activationId = read('TokenStore/Activation_Id.txt')
    And def reqMsg =
    """
    {
      "activationId": "#(activationId)",
      "deviceName": "<deviceName>",
      "deviceVerificationKeys": {
        "additionalProp1": "string"
      },
      "deviceInfo": {
        "additionalProp1": "string"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | deviceName  |
      | WakaAPITest |

  @Users
  Scenario: Authenticate Device Information Update
    Given url baseChatURL
    And path '/auth/api/public/activation/update/v1/authenticate'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "authToken": {
        "additionalProp1": "string"
      },
      "payload": "string"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

  @Users
  Scenario Outline: Complete Device Information Update
    Given url baseChatURL
    And path '/auth/api/public/activation/update/v1/authenticate'
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "payload": "string",
      "deviceName": "<deviceName>",
      "deviceVerificationKeys": {
        "additionalProp1": "string"
      },
      "deviceInfo": {
        "additionalProp1": "string"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | deviceName  |
      | WakaAPITest |