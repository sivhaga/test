Feature: As a Merchant Service User I want to be able to manage product engine common service

  Background:
#    * def baseDocumentURL = 'https://api.wakago.net/stage/eshop/v1/documents'
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

  @Product-Engine
  @Product-Engine-Common-Api
  Scenario Outline: Get Product List by Id
    Given path '/'
    And url baseDocumentURL
    And header Content-Type = 'application/json'
    And def documentRequest =
    """
    {
      "document": {
        "name": "<name>",
        "relations": [
          {
            "entity": "<entity>",
            "entityId": "<entityId>",
            "entityExternalReference": "<entityExternalReference>"
          }
        ],
        "type": "<type>",
        "metadata": {
          "additionalProp1": {},
          "additionalProp2": {},
          "additionalProp3": {}
        }
      }
    }
    """
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
    | name | entity | entityId | entityExternalReference | type |


  @Product-Engine
  @Product-Engine-Common-Api
  Scenario Outline: Get Product by Id
    Given path '/product/<productId>'
    And url baseDocumentURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | productId |
      | 1         |


  @Product-Engine
  @Product-Engine-Common-Api
  Scenario:  Get screen-box HORIZONTAL_PRODUCT_SCROLLER data
    Given path '/screen-box/HORIZONTAL_PRODUCT_SCROLLER/data'
    And url baseDocumentURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

  @Product-Engine
  @Product-Engine-Common-Api
  Scenario:  Get screen-box VERTICAL_FILTER data
    Given path '/screen-box/VERTICAL_FILTER/data'
    And url baseDocumentURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

  @Product-Engine
  @Product-Engine-Common-Api
  Scenario:  Get screen-box GRID_FILTER_LIST data
    Given path '/screen-box/GRID_FILTER_LIST/data'
    And url baseDocumentURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson