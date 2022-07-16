Feature: As a Merchant Service User I want to be able to manage service requests

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
  @Merchant-Service-Request
  Scenario: Get Merchant Service List
    Given path '/request'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def requestIdToStore = responseJson[0].id
    And print requestIdToStore
    And def saveAppId = saveId(requestIdToStore, 'src/test/features/api/TokenStore/Merchant_Service_Id.txt')


  @Merchant-Service
  @Merchant-Service-Request
  Scenario: Get Merchant Service By Request Id
    Given def requestId = read('TokenStore/Merchant_Service_Id.txt')
    And path '/request/', requestId, '/detail'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.id == requestId

  @Merchant-Service
  @Merchant-Service-Request
  Scenario: Get Merchant Service Reject Reason By Request Id
    Given def requestId = read('TokenStore/Merchant_Service_Id.txt')
    And path '/request/', requestId, '/reject/reason'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''

  @Merchant-Service
  @Merchant-Service-Request
  Scenario: Update Merchant Service Reject Reason By Request Id
    Given def requestId = read('TokenStore/Merchant_Service_Id.txt')
    And path '/request/', requestId, '/reject'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    And def rejectReason = 'Testing_' + getCurrentTimeStamp('yyyyMMddHHMM')
    And def rejectReasonRequest =
    """
      {
        "rejectionReason": "#(rejectReason)"
      }
    """
    And request rejectReasonRequest
    When method put
    Then status 200
    And print response
    And match response != ''

  @Merchant-Service
  @Merchant-Service-Request
  Scenario Outline: Update Merchant Service Quote By Request Id
    Given def requestId = read('TokenStore/Merchant_Service_Id.txt')
    And path '/request/', requestId, '/quote'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    And def rejectReason = 'Testing_' + getCurrentTimeStamp('yyyyMMddHHMM')
    And def rejectReasonRequest =
    """
      {
        "quote": {
          "totalQuote": {
            "amount": <totalQuoteAmount>,
            "currencyCode": "<totalQuoteACurrencyCode>"
          },
          "quote": {
            "amount": <quoteAmount>,
            "currencyCode": "<quoteCurrencyCode>"
          },
          "calloutFee": {
            "amount": <callOutFeeAmount>,
            "currencyCode": "<callOutFeeCurrencyCode>"
          },
          "availabilityDate": "2019-06-20",
          "note": "<note>"
        }
      }
    """
    And request rejectReasonRequest
    When method put
    Then status 200
    And print response
    And match response != ''

    Examples:
    | totalQuoteAmount | totalQuoteACurrencyCode | quoteAmount | quoteCurrencyCode | callOutFeeAmount | callOutFeeCurrencyCode | note                 |
    | 9800             | ZAR                     | 9000        | ZAR               | 800              | ZAR                    | Testing Quote Update |

  @Merchant-Service
  @Merchant-Service-Request
  Scenario Outline: Update Merchant Service Assessment By Request Id
    Given def requestId = read('TokenStore/Merchant_Service_Id.txt')
    And path '/request/', requestId, '/assessment'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    And def rejectReason = 'Testing_' + getCurrentTimeStamp('yyyyMMddHHMM')
    And def rejectReasonRequest =
    """
      {
        "calloutFee": {
          "amount": <callOutFeeAmount>,
          "currencyCode": "<callOutFeeCurrencyCode>"
        },
        "availabilityDate": "2019-06-20",
        "note": "<note>"
      }
    """
    And request rejectReasonRequest
    When method put
    Then status 200
    And print response
    And match response != ''

    Examples:
      | callOutFeeAmount | callOutFeeCurrencyCode | note                      |
      | 800              | ZAR                    | Testing Assessment Update |