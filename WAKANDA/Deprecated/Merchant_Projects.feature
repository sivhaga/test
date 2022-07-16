Feature: As a Merchant Service User I want to be able to manage job

  Background:
    * def baseMerchantOrderServiceURL = 'https://api.wakago.net/stage/order-service/v1'
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
    * def projectName = 'TestProject' +  getCurrentTimeStamp('yyMMddHHMM')
    * def locationName = 'TestArea_' + getCurrentTimeStamp('yyMMddHHMM')
    * def locationId = 'TestLoc_' + getCurrentTimeStamp('yyMMddHHMM')

  @Merchant-Service
  @Merchant-Product
  Scenario Outline: Create new products
    Given def serviceId = read('TokenStore/Merchant_Service_Id.txt')
    And path '/project/request'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    And def projectRequest =
    """
      {
        "serviceId": "#(serviceId)",
        "projectName": "#(projectName)",
        "expectedBudget": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "urgent": true,
        "expectedDate": "2019-04-20",
        "projectDescription": "<projectDescription>",
        "location": {
          "locationId": "#(locationId)",
          "locationName": "#(locationName)",
          "location": {
            "latitude": <latitude>,
            "longitude": <longitude>
          },
          "address": {
            "addressString": "<addressString>",
            "streetName": "<streetName>",
            "streetNumber": "<streetNumber>",
            "locality": "<locality>",
            "postalCode": "<postalCode>",
            "city": "<city>"
          }
        }
        },
        "pictures": [
          {
            "pictureId": "<pictureId>",
            "url": "<url>"
          }
        ]
      }
    """
    And request projectRequest
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def requestIdToStore = responseJson.id
    And print requestIdToStore
    And def saveAppId = saveId(requestIdToStore, 'src/test/features/api/TokenStore/Merchant_Project_Id.txt')

    Examples:
    | amount | currencyCode | projectDescription | latitude   | longitude  | addressString                            | streetName      | streetNumber | locality      | postalCode | city      | pictureId | url             |
    | 10000  | ZAR          | QA or Test Project | -2.3040304 | -2.3040304 | 18 River Road, Platberg Street Centurion | Platberg Street | 18           | Clubview      | 0157       | Centurion | TestPic   | img/TestPic.jpg |

  @Merchant-Service
  @Merchant-Product
  Scenario Outline: Update products attachment
    Given def projectId = read('TokenStore/Merchant_Project_Id.txt')
    And path '/project/', projectId, '/attachment'
    And url baseMerchantOrderServiceURL
    And multipart file file = { read: '<fileLocation>'}
    And header Content-Type = 'multipart/form-data'
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def requestIdToStore = responseJson.id
    And print requestIdToStore
    And def saveAppId = saveId(requestIdToStore, 'src/test/features/api/TokenStore/Merchant_Project_Attachment_Id.txt')

    Examples:
      | fileLocation                  |
      | TokenStore/AttachmentFile.txt |

  @Merchant-Service
  @Merchant-Product
  Scenario: Get products attachment
    Given def projectId = read('TokenStore/Merchant_Project_Id.txt')
    Given def attachmentId = read('TokenStore/Merchant_Project_Attachment_Id.txt')
    And path '/project/', projectId, '/attachment', attachmentId
    And url baseMerchantOrderServiceURL
    When method get
    Then status 200
    And print response

  @Merchant-Service
  @Merchant-Product
  Scenario: Get Merchant Project By Id
    Given def projectId = read('TokenStore/Merchant_Project_Id.txt')
    And path '/project', projectId, '/detail'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.projectId == projectId

  @Merchant-Service
  @Merchant-Product
  Scenario: Get Merchant Product Job
    Given path '/job/'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''

  @Merchant-Service
  @Merchant-Product
  Scenario: Get Merchant Product Job by Product Id
    Given def projectId = read('TokenStore/Merchant_Project_Id.txt')
    And path '/job/', projectId, '/detail'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''

  @Merchant-Service
  @Merchant-Product
  Scenario: Update Merchant Project Job to Reject By Id
    Given def projectId = read('TokenStore/Merchant_Project_Id.txt')
    And path '/job/', projectId, '/reject'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    And def projectJobRejectRequest =
    """
      {
      }
    """
    And request projectJobRejectRequest
    When method put
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''

  @Merchant-Service
  @Merchant-Product
  Scenario: Update Merchant Project Job Quote  By Id
    Given def projectId = read('TokenStore/Merchant_Project_Id.txt')
    And path '/job/', projectId, '/quote'
    And url baseMerchantOrderServiceURL
    And header Content-Type = 'application/json'
    And def projectJobRejectRequest =
    """
      {
      }
    """
    And request projectJobRejectRequest
    When method put
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson != ''
