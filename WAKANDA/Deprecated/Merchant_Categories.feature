Feature: As a Merchant Service User I want to be able to manage service categories

  Background:
#    * def baseMerchantOrderServiceURL = 'https://api.wakago.net/stage/order-service/v1/service'
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

  @Merchant-Service
  @Merchant-Service-Categories
  Scenario: Get Merchant Service Category Search List
    Given path '/category/search'
    And param query = 'A'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def categoryIdToStore = responseJson[0].categoryId
    And print categoryIdToStore
    And def saveAppId = saveId(categoryIdToStore, 'src/test/features/api/TokenStore/Merchant_Service_Category_Id.txt')


  @Merchant-Service
  @Merchant-Service-Categories
  Scenario: Get Merchant Service By Category Id
    Given def categoryId = read('TokenStore/Merchant_Service_Category_Id.txt')
    And path '/category/', categoryId
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.categoryId == categoryId

  @Merchant-Service
  @Merchant-Service-Categories
  Scenario: Get Merchant Service Popular Category
    And path '/category/popular'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''
