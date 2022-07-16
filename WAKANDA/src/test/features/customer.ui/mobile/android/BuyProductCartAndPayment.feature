@customer-android
Feature: As a Customer Android (CA) user, I want to be able to add a product to cart and make a payment

  @android-test @buy-product @smoke
  Scenario Outline: Add product to cart
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
#    And CA user can see deals of the day section
#    And CA user can see recommendations section
#    And CA user can see shop by brand section
#    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
#    Then CA user is on shopping category "<shopping category>" page
#    And CA user can see subcategories under a shopping category "<shopping category>"
    #And CA user can see shop by brands section
#    And CA user can see sale section
#    When CA user select a shopping subcategory "<shopping subcategory>"
#    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    When CA user select shop now button
    And CA user can see a product list catalogue
    When CA user select a product from the catalogue
    Then CA user is on product detail page
    And CA user can see number of products left
#    When CA user select number of products "<add to cart>" to add to cart
#    Then CA user can see if number of products to add to cart "<add to cart>" is not more than number of products left
    When CA user select add to cart button
    Then CA user can see product added to cart message

    Examples:
      | shopping category |
      | Tech              |

  @android-test @buy-product @smoke
  Scenario: View product(s) in my cart
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page


#  @android-test @buy-product
#  Scenario Outline: Increase number of products in my cart
#    Given CA user launch the customer android app
#    Then CA user is on dashboard page
#    When CA user select shopping icon
#    Then CA user is on shopping page
#    When CA user select shopping icon
#    Then CA user is on shopping page
#    When CA user select shopping cart icon
#    Then CA user is on shopping cart page
##    And CA user can see number of items in a cart is great than zero
##    And CA user can see number of items matches the product list
#    When CA user select a product from cart list
#    Then CA user is on product detail page
#    When CA user select add button "<number of times>" times
#    Then CA user can see product cart count "<number of times>" times
#
#    Examples:
#      | number of times |
#      |                 |
#
#  @android-test @buy-product
#  Scenario Outline: Decrease number of products in my cart
#    Given CA user launch the customer android app
#    Then CA user is on dashboard page
#    When CA user select shopping icon
#    Then CA user is on shopping page
#    When CA user select shopping icon
#    Then CA user is on shopping page
#    When CA user select shopping cart icon
#    Then CA user is on shopping cart page
#    And CA user can see number of items in a cart is great than zero
#    And CA user can see number of items matches the product list
#    When CA user select a product from cart list
#    Then CA user is on product detail page
#    When CA user select minus button "<number of times>" times
#    Then CA user can see product cart count is decreased "<number of times>" times
#
#    Examples:
#      | number of times |
#      | 1               |


  @android-test @buy-product
  Scenario: View product details from cart
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    When CA user select a product from cart list
    Then CA user is on product detail page

  @android-test @buy-product
  Scenario: View product details save for later
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    When CA user select a product from cart list
    Then CA user is on product detail page

  @android-test @buy-product
  Scenario Outline: Apply promotion code
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    Then CA user can see apply promo code section
    When CA user select apply the promotion code label
    Then CA user is on apply promo page
    When CA user enter "<promo code>" promo code
    And CA user select apply promo code button
    Then CA user is on shopping cart page

    Examples:
      | promo code |
      | 12345      |

  @android-test @buy-product
  Scenario Outline: Add delivery address - maps
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    And CA user can see cart delete button
    When CA user select checkout button
    Then CA user is on delivery method page
    When CA user select add new address option
    Then CA user is on search address page
    When CA user search and select delivery address "<delivery address>" from the map
    And CA user select delivery location from the map
    Then CA user can see delivery address "<delivery address>" is saved

    Examples:
      | pin | delivery address |
      |     | 70 hill street   |


  @android-test @buy-product
  Scenario Outline: Scenario Outline: select existing address
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    When CA user select a product from cart list
    Then CA user can see apply promo code section
    When CA user is on apply promo page
    Then CA user can see promo code discount applied to total cart amount
    When CA user select continue button
    Then CA user is on delivery method page
    When CA user select add new address option
    Then CA user is on search address page
    When CA user select delivery address "<delivery address>" from saved addresses
    Then CA user can see delivery address "<delivery address>" is saved

    Examples:
      | pin | delivery address |
      |     | 70 hill street   |


  @android-test @buy-product
  Scenario Outline: Pick from a store near you
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    When CA user select a product from cart list
    Then CA user can see apply promo code section
    When CA user select apply the promotion code
    Then CA user can see promo code discount applied to total cart amount
    When CA user select continue button
    Then CA user is on delivery method page
    When CA user select pick from a store near you option
    Then CA user is on select pickup location page
    When CA user search and select pickup address "<pickup address>" from the map
    And CA user select pickup location from the map
    Then CA user can see pickup address "<pickup address>" is saved

    Examples:
      | pin | pickup address |
      |     | 70 hill street |

  @android-test1 @buy-product @smoke
  Scenario Outline: View total payable and proceed to payout - Sufficient Wallet Balance
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
#    When CA user select a product from cart list
#    Then CA user can see apply promo code section
#    When CA user select apply the promotion code
#    Then CA user can see promo code discount applied to total cart amount
    When CA user select checkout button
#    Then CA user is on delivery method page
#    When CA user select add address option
#    Then CA user is on search address page
#    When CA user search and select delivery address "<delivery address>" from the map
#    And CA user select delivery location from the map
#    Then CA user can see delivery address "<delivery address>" is saved
#    And CA user is on payment page
    When CA user select deliver here button
    Then CA user is on shipment page
    When CA user select proceed to payment button
    Then CA user is on payment page
    And CA user can see personal loan button
    And CA user can see MobiMoney button
    And CA user can available wallet balance
    And CA user can see amount payable "<amount payable>"for order
    When CA user select cart reserve button
    Then CA user can see pin or biometric authentication
    When CA user authenticate themselves
    Then CA user is on payment options page
    When CA user select add another payment source
    Then CA user can see payment source page
    When CA user select another payment source "<payment source>"
    When CA user select continue button
    Then CA user can payment success page
    # to be confirmed

    Examples:
      | pin | delivery address | amount payable | payment source |
      |     | Hom              |                |                |

  @android-test @buy-product
  Scenario Outline: View total payable and proceed to payout - Insufficient wallet balance
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    And CA user can see number of items matches the product list
    When CA user select a product from cart list
    Then CA user can see apply promo code section
    When CA user apply the promotion code
    Then CA user can see promo code discount applied to total cart amount
    When CA user select continue button
    Then CA user is on delivery method page
    When CA user select add address option
    Then CA user is on search address page
    When CA user search and select delivery address "<delivery address>" from the map
    And CA user select delivery location from the map
    Then CA user can see delivery address "<delivery address>" is saved
    And CA user is on payment page
    And CA user can available wallet balance
    And CA user can amount payable "<amount payable>"for order
    When CA user select pay button
    Then CA user can see pin or biometric authentication
    When CA user authenticate themselves
    Then CA user is on payment options page
    When CA user select add another payment source
    Then CA user can see payment source page
    When CA user select another payment source "<payment source>"
    When CA user select continue button
    # to be confirmed

    Examples:
      | pin | delivery address | amount payable | payment source |
      |     | Hom              |                |                |


  @android-test @buy-product
  Scenario: Move product to wish list
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see number of items in a cart is great than zero
    When CA user select move product to wish list button
    And CA user can see new product is added to wish list

  @android-test @buy-product
  Scenario: Delete product in my cart
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    And CA user can see cart delete button
    When CA user select delete product button
    Then all products from the cart are deleted
