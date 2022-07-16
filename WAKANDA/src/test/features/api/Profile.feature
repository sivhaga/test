Feature: As a user I want to be able to make chat service calls

  Background:
#    * def baseProfileURL = 'https://stage-api.wakago.net/profile'
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
    * def locationName = 'TestArea_' + getCurrentTimeStamp('yyMMddHHMM')

  @Profile
  Scenario: Get User Info
    Given url baseProfileURL
    And path '/v1/user/info'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response

  @Profile
  Scenario: Get User Review
    Given url baseProfileURL
    And path '/v1/user/review'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response
    And def reviewId = response[0].id
    And def saveChatId = saveId(reviewId, 'src/test/features/api/TokenStore/Review_Id.txt')

  @Profile
  Scenario: Get User Review by Id
    Given url baseProfileURL
    And def reviewId = ('TokenStore/Review_Id.txt')
    And path '/v1/user/review/', reviewId
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response

  @Profile
  Scenario Outline: Add User Business
    Given url baseProfileURL
    And def reviewId = ('TokenStore/Review_Id.txt')
    And path '/v1/user/review/business'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "description": "<description>",
      "tradingName": "<tradingName>",
      "email": "<email>",
      "mobile": "<mobile>",
      "category": "<category>",
      "subCategories": [
        "<subCategories1>"
      ]
    }
    """
    And request reqMsg
    When method put
    Then status 200
    And print response

    Examples:
    | description | tradingName | email    | mobile    | category | subCategories1 |
    | desc1       | trad1       |abs@d.com | 099999999 | cat1     | subCat1        |

  @Profile
  Scenario: Get User Business
    Given url baseProfileURL
    And def reviewId = ('TokenStore/Review_Id.txt')
    And path '/v1/user/review/business'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response