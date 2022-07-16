Feature: As a user I want to be able to make chat service calls

  Background:
#    * def baseChatURL = 'https://stage-api.wakago.net/chat'
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

  @Chat
  Scenario Outline: Start a new chat
    Given url baseChatURL
    And path '/v1/chat/<entity>/<entityId>/<chatTarget>'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response

    Examples:
    | entity    | entityId | chatTarget |
    | ORDER     | 1234     | AGENT      |
    | JOB       | 1234     | MERCHANT   |
    | JOB_OFFER | 1234     | MERCHANT   |
    | SUPPORT   | 123      | AGENT      |

    @Chat
    Scenario: Get Room ID
      Given url baseChatURL
      And path '/v1/chat/service'
      And header Content-Type = 'application/json'
      And header authorization = 'Bearer ' + securityToken
      When method get
      Then status 200
      And print response

  @Chat
  Scenario: Synchronize Chat
    Given url baseChatURL
    And path '/v1/client/sync'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response

  @Chat
  Scenario: Synchronize Chat
    Given url baseChatURL
    And path '/v1/client/sync'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response