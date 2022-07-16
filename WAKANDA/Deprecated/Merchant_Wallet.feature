Feature: As a Merchant Service User I want to be able to manage wallet calls

  Background:
#    * def baseMerchantWalletURL = 'https://api.wakago.net/stage/wep/wakanda-conductor/rest/v1'
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

  @Merchant-Escrows
  Scenario: Submit a payment request
    And path '/wallets/payment-requests'
    And url baseMerchantWalletURL
    And header Content-Type = 'application/json'
    And def paymentRequest =
    """
      {
        "Re  "RequestingWalletId": 0,
        "PayingUserId": "string",
        "Amount": 0,
        "SupplementaryData": [
          {
            "Att": "string",
            "Val": "string"
          }
        ],
        "UnpaidTriggerDates": [
          "2019-08-06T14:03:57.528Z"
        ],
        "UnpaidTriggerDestination": "string",
        "ExternalUniqueId": "string",
        "Expires": "2019-08-06T14:03:57.528Z"
      }
          """
    And request paymentRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''
    And def locationId = read('TokenStore/Merchant_Customer_Location_Id.txt')
    And match responseJson[*].locationId contains locationId

#  @Merchant-Service
#  @Merchant-Service-Customer-Location
#  Scenario Outline: Create Customer Location
#    Given path '/wallets/customer/location'
#    And url baseMerchantWalletURL
#    And header Content-Type = 'application/json'
#    And def customerLocationRequest =
#    """
#      {
#        "locationName": "#(locationName)",
#        "location": {
#          "latitude": <latitude>,
#          "longitude": <longitude>
#        },
#        "address": {
#          "addressString": "<addressString>",
#          "streetName": "<streetName>",
#          "streetNumber": "<streetNumber>",
#          "locality": "<locality>",
#          "postalCode": "<postalCode>",
#          "city": "<city>"
#        }
#      }
#    """
#    And request customerLocationRequest
#    When method post
#    Then status 201
#    And json responseJson = response
#    And print responseJson
#    And def locationId = responseJson.locationId
#    And print locationId
#    And def saveAppId = saveId(locationId, 'src/test/features/api/TokenStore/Merchant_Customer_Location_Id.txt')
#
#  Examples:
#    | latitude  | longitude | addressString                                | streetName      | streetNumber | locality      | postalCode | city      |
#    | 2.3040304 | 2.3040304 | 14 Riverside Road, Platberg Street Centurion | Platberg Street | 14           | Clubview      | 0157       | Centurion |
#    | 2.3040304 | 2.3040304 | 15 Riverside Road, Platberg Street Centurion | Platberg Street | 15           | Clubview West | 0157       | Centurion |
#
