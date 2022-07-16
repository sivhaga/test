Feature: As a wakanda User I want to be able to make Search API calls

  Background:
#    * def baseDashboardURL = 'https://stage-api.wakago.net/dashboard'
#    * def baseDashboardURL = 'https://api.soko.life/dashboard'
    * def securityToken = read('TokenStore/TempAccessToken.txt')
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

    @Search
    Scenario: Fetch Recent Search
      Given path '/v1/search/recent'
      And url baseDashboardURL
      And header Authorization = 'Bearer '+ securityToken
      When method get
      Then status 200
      And print response
      And match response != ''

  @Search
  Scenario Outline: Fetch Suggested Search
    Given path '/v1/search/suggestion'
    And url baseDashboardURL
    And param query = '<queryString>'
    And header Authorization = 'Bearer '+ securityToken
    When method get
    Then status 200
    And print response
    And match response.suggestions.size() != 0

    Examples:
      | queryString |
      | plum        |

  @Search
  Scenario Outline: Fetch List of Category Search
    Given path '/v1/search'
    And url baseDashboardURL
    And param query = '<queryString>'
    And header Authorization = 'Bearer '+ securityToken
    When method get
    Then status 200
    And print response
    And print response != ''

    Examples:
    | queryString |
    | plum        |