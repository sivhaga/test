Feature: As a Merchant Service User I want to be able to manage job

  Background:
#    * def baseMerchantOrderServiceURL = 'https://api.wakago.net/stage/order-service/v1/'
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
  @Merchant-Job
  Scenario: Get Merchant Job List
    Given path '/job'
    And url baseURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def requestIdToStore = responseJson[0].id
    And print requestIdToStore
    And def saveAppId = saveId(requestIdToStore, 'src/test/features/api/TokenStore/Merchant_Job_Id.txt')


  @Merchant-Service
  @Merchant-Job
  Scenario: Get Merchant Job By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/detail'
    And url baseURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.id == jobId

  @Merchant-Service
  @Merchant-Job
  Scenario: Get Merchant Job Cancel Reason By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/cancel/reason'
    And url baseURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''

  @Merchant-Service
  @Merchant-Job
  Scenario: Get Merchant Complete Job By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/complete'
    And url baseURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''

  @Merchant-Service
  @Merchant-Job
  Scenario: Update Merchant Job Complete By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/complete'
    And url baseURL
    And header Content-Type = 'application/json'
    And def rejectReason = 'Testing_' + getCurrentTimeStamp('yyyyMMddHHMM')
    And def jobCompleteRequest =
    """
      {
        "customerRating": 5,
        "note": "Test Rating"
      }
    """
    And request jobCompleteRequest
    When method put
    Then status 200
    And print response
    And match response != ''

  @Merchant-Service
  @Merchant-Job
  Scenario Outline: Update Merchant Job Cancel By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/cancel'
    And url baseURL
    And header Content-Type = 'application/json'
    And def cancelReason = 'Testing_' + getCurrentTimeStamp('yyyyMMddHHMM')
    And def cancelReasonRequest =
    """
      {
        "cancelReason": "<cancelReason>"
      }
    """
    And request cancelReasonRequest
    When method put
    Then status 200
    And print response
    And match response != ''

    Examples:
    | cancelReason |
    | on-vacation  |


  @Merchant-Service
  @Merchant-Job
  Scenario: Update Merchant Job to Start By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/start'
    And url baseURL
    And header Content-Type = 'application/json'
    And def startReasonRequest =
    """
      {
      }
    """
    And request startReasonRequest
    When method put
    Then status 200
    And print response
    And match response != ''

  @Merchant-Service
  @Merchant-Job
  Scenario Outline: Update Merchant Job Additional Charge By Id
    Given def jobId = read('TokenStore/Merchant_Job_Id.txt')
    And path '/job/', jobId, '/additionalcharge'
    And url baseURL
    And header Content-Type = 'application/json'
    And def startReasonRequest =
    """
      {
        "chargeAmount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "note": "<note>"
      }
    """
    And request startReasonRequest
    When method put
    Then status 200
    And print response
    And match response != ''

    Examples:
      | amount | currencyCode | note           |
      | 80     | ZAR          | Testing Charge |