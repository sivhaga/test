Feature: As a Merchant Service User I want to be able to manage escrow calls

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

#  @Merchant-Escrows
#  Scenario Outline: Submit Merchant Escrow Location
#    Given path '/customer/location'
#    And url baseMerchantWalletURL
#    And header Content-Type = 'application/json'
#    And def customerLocationRequest =
#    """
#      {
#        "Id": 0,
#        "PayerWalletId": 0,
#        "RecipientWalletId": 0,
#        "AmountStillInEscrow": 0,
#        "Currency": "string",
#        "Created": "2019-08-05T11:38:37.945Z",
#        "LastModified": "2019-08-05T11:38:37.945Z",
#        "Expires": "2019-08-05T11:38:37.945Z",
#        "Items": [
#          {
#            "Id": 0,
#            "Description": "string",
#            "Charges": [
#              {
#                "Description": "string",
#                "Amount": 0,
#                "ExternalUniqueId": "string",
#                "Created": "2019-08-05T11:38:37.945Z",
#                "ChargeWalletId": 0
#              }
#            ],
#            "ItemReceived": true,
#            "ItemAccepted": true,
#            "ItemDisputed": true,
#            "ItemReserved": true,
#            "State": "string",
#            "amount": 0
#          }
#        ],
#        "Payments": [
#          {
#            "Amount": 0,
#            "ExternalUniqueId": "string",
#            "Created": "2019-08-05T11:38:37.945Z"
#          }
#        ],
#        "ExternalUniqueId": "string",
#        "Status": "string"
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
#    Examples:


  @Merchant-Escrows
  Scenario Outline: Get Merchant Escrow List
    And path '/escrows'
    And param limit = <limit>
    And url baseMerchantWalletURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''
    And print 'response_count' + response.count()

    Examples:
    | limit |
    | 20    |
