Feature: As a Merchant Service User I want to be able to manage product engine service

  Background:
#    * def baseEshopURL = 'https://stage-api.wakago.net/eshop/v1/buy/'
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
  Scenario: Get Product Category List
    Given path 'category'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def categoryId = responseJson[0].id
    And match responseJson != ''
    And def saveCategoryId = saveId(categoryId, 'src/test/features/api/TokenStore/Buy_Product_Category_Id.txt')


  @Product-Engine
  Scenario:  Get Product Category by Id
    Given def categoryId = read('TokenStore/Buy_Product_Category_Id.txt')
    And path 'category/', categoryId
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.id == categoryId

  @Product-Engine
  Scenario: Get Product List by Id
    Given def categoryId = read('TokenStore/Buy_Product_Category_Id.txt')
    And path 'product/list/', categoryId
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def productId =  responseJson.products[0].sku
    And match responseJson.products[0].sku != ''
    And def saveProductId = saveId(productId, 'src/test/features/api/TokenStore/Product_Id.txt')

  @Product-Engine
  Scenario: Get Product by Id
    Given def productId = read('TokenStore/Product_Id.txt')
    And path 'product/', productId
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match productId == responseJson.sku

  @Product-Engine
  Scenario: Get Product Reviews by Id
    Given def productId = read('TokenStore/Product_Id.txt')
    And path 'product/', productId, '/reviews'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match productId == responseJson.sku

  @Product-Engine
  Scenario: Favourite Product Reviews by Id
    Given def productId = read('TokenStore/Product_Id.txt')
    And path 'product/', productId, '/fa'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match productId == responseJson.sku

  @Product-Engine
  Scenario:  Get screen-box HORIZONTAL_PRODUCT_SCROLLER data
    Given path '/screen-box/HORIZONTAL_PRODUCT_SCROLLER/data'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

  @Product-Engine
  Scenario:  Get screen-box VERTICAL_FILTER data
    Given path '/screen-box/VERTICAL_FILTER/data'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

  @Product-Engine
  Scenario:  Get screen-box GRID_FILTER_LIST data
    Given path '/screen-box/GRID_FILTER_LIST/data'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    
  @Product-Engine
  Scenario Outline: Buy a Product Search
    Given path '/v1/buy/search'
    And param query = <queryString>
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.productDetail.id = productId

    Examples:
    | queryString |
    | Hair        |

  @Product-Engine
  Scenario Outline: Buy a Product
    Given path '/v1/buy/item'
    And def productId = read('TokenStore/Product_Id.txt')
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "productId": "#(productId)",
      "qty": <qty>,
      "quoteId": "<quoteId>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
      | qty | quoteId |
      | 2   | 123     |

  @Product-Engine
  Scenario Outline: Add a Product to Favourites
    Given path '/v1/buy/favourites'
    And def productId = read('TokenStore/Product_Id.txt')
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "productId": "#(productId)",
      "qty": <qty>,
      "quoteId": "<quoteId>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
      | qty | quoteId |
      | 2   | 123     |

  @Product-Engine
  Scenario: Fetch the list of Product Favourites
    Given path '/v1/buy/favourites'
    And def productId = read('TokenStore/Product_Id.txt')
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.items[0].id contains productId

  @Product-Engine
  Scenario: Add a Product to Saved Items
    Given path '/v1/buy/savedItems'
    And def productId = read('TokenStore/Product_Id.txt')
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {

    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

  @Product-Engine
  Scenario: Get Product In Saved Items
    Given path '/v1/buy/savedItems'
    And def productId = read('TokenStore/Product_Id.txt')
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

  @Product-Engine
  Scenario Outline: Buy Tv License
    Given path '/v1/buy/customer/tvLicense'
    And def productId = read('TokenStore/Product_Id.txt')
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "idPassportNo": "<idPassportNo>",
      "type": "DOMESTIC"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
    | idPassportNo  |
    | 9213106478176 |

  @Product-Engine
  Scenario Outline: Add Item to Cart
    Given def cartId = read('TokenStore/Cart_Id.txt')
    And def productId = read('TokenStore/Product_Id.txt')
    And path '/v1/buy/cart/', cartId, '/addItem'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "productId": "#(productId)",
      "qty": <qty>,
      "quoteId": "<quoteId>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
      | qty | quoteId |
      | 2   | 123     |

  @Product-Engine
  Scenario: Get Items in Cart
    Given def cartId = read('TokenStore/Cart_Id.txt')
    And path '/v1/buy/cart/', cartId
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

  @Product-Engine
  Scenario: Get Items Shipping Options
    Given def cartId = read('TokenStore/Cart_Id.txt')
    And path '/v1/buy/cart/', cartId, '/shippingOptions'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

  @Product-Engine
  Scenario Outline: Update Shipping Options
    Given def cartId = read('TokenStore/Cart_Id.txt')
    And path '/v1/buy/cart/', cartId, '/shippingOptions'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "id": "<id>",
      "regionId": "<regionId>",
      "region": "<region>",
      "country": "<country>",
      "street": [
        "<street>"
      ],
      "company": "<company>",
      "telephone": "<telephone>",
      "fax": "<fax>",
      "postcode": "<postcode>",
      "city": "<city>",
      "vatId": "<vatId>",
      "email": "<email>",
      "firstName": "<firstName>",
      "lastName": "<lastName>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
    | id | regionId | region | country | street            | company | telephone | fax | postcode | city    | vatId | email     | firstName | lastName |
    | 12 | 12       | 12     | ZA      | 14 Riverside Road | NedBank | 099999999 |     | 2192     | Sandton |       | abc@de.cv | Waka      | Nda      |

  @Product-Engine
  Scenario Outline: Add Coupon Code
    Given def cartId = read('TokenStore/Cart_Id.txt')
    And path '/v1/buy/pay/cart/', cartId, '/coupon/<couponCode>'
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
    }
    """
    And request reqMsg
    When method put
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
      | couponCode  |
      | xs1234bfve  |

  @Product-Engine
  Scenario Outline: Pay a Cart
    Given def cartId = read('TokenStore/Cart_Id.txt')
    And path '/v1/buy/pay/cart/', cartId
    And url baseEshopURL
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "amount": {
        "amount": <amount>,
        "currencyCode": "<currencyCode>"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.itemId != ''

    Examples:
      | amount  | currencyCode |
      | 20000   | ZAR          |