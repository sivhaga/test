Feature: As a user I should be able to get property favourites max limit

  Background:
    * def baseURL = 'https://stage-api.wakago.net'
    * def saveGeneratedAuthToken =
    """
      function(arg) {
        var AuthenticationManager = Java.type('za.co.nedbank.dfl.digital.enablement.test.api.AuthenticationTokenManager');
        var authManager = new AuthenticationManager();
        return authManager.saveAuthToken(arg);
      }
      """
  @securityToken
    Scenario Outline: Login into our profile
      Given url baseURL
      And path '/auth/api/public/login/v1/authenticate'
      And def requestMsg =
      """
      {
        "authToken": {
          "usernamePasswordToken": {
          "password": "<password>",
          "secretPayload": "",
          "username": "<username>"
          }
        },
        "temporaryAccessToken": ""
      }
      """
      And request requestMsg
      When method post
      Then status 200
    And print response
      And def securityToken = response
      And match securityToken.lenght != 0
      And print securityToken
      And def result = call saveGeneratedAuthToken securityToken

      Examples:
      | username    | password  |
      | test1       | Heslo123  |

