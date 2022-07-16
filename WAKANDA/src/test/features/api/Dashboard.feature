Feature: As a wakanda User I want to be able to make Search API calls

  Background:
#    * def baseDashboardURL = 'https://stage-api.wakago.net/dashboard'
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

    @Dashboard
    Scenario: Fetch Dashboard Widgets
      Given path '/v1/dashboard'
      And url baseDashboardURL
      And header authorization = 'Bearer ' + securityToken
      When method get
      Then status 200
      And print response
      And match response.widgets.size() != 0

  @Dashboard
  Scenario: Fetch Wallet Information on Dashboard
    Given path '/v1/dashboard/wallet'
    And url baseDashboardURL
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response
    And match response.walletId != ''
    And match response.balance.currencyCode == 'ZAR'

  @Dashboard
  @Merchant-Dashboard-Job
  Scenario: Get Merchant Job List
    Given path '/v1/dashboard/job/request'
    And url baseDashboardURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.size() != 0

  @Dashboard
  @Merchant-Dashboard-Job
  Scenario: Get Merchant Active Job List
    Given path '/v1/dashboard/job/active'
    And url baseDashboardURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.size() != 0

  @Dashboard
  @Merchant-Dashboard-Job
  Scenario Outline: Get Merchant Payments by Period -> <period>
    Given path '/v1/dashboard/payments/<period>'
    And url baseDashboardURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.pendingPayments.currencyCode == 'ZAR'
    And match responseJson.incomingPayments.currencyCode == 'ZAR'
    And match responseJson.settledPayments.currencyCode == 'ZAR'

    Examples:
    | period     |
    | TODAY      |
    | THIS_WEEK  |
    | THIS_MONTH |

