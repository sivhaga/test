@customer-pwa
Feature: As a Customer PWA (CP) user, I want to be able to add a product to cart and make a payment

  @pwa-test
  Scenario Outline: Add product to cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    And CP user can see number of products left
    When CP user select number of products "<add to cart>" to add to cart
    Then CP user can see if number of products to add to cart "<add to cart>" is not more than number of products left
    When CP user select add to cart button
    Then CP user can see number of products "<add to cart>" added to cart

    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |

  @pwa-test
  Scenario Outline: View product(s) in my cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Increase number of products in my cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user is on product detail page
    When CP user select add button "<number of times>"  times
    Then CP user can see product cart count "<number of times>" times

    Examples:
      | username | password | number of times |
      | test     | test     | Hom             |

  @pwa-test
  Scenario Outline: Decrease number of products in my cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user is on product detail page
    When CP user select minus button "<number of times>" times
    Then CP user can see product cart count is decreased "<number of times>" times

    Examples:
      | username | password | number of times |
      | test     | test     | Hom             |

  @pwa-test
  Scenario Outline: Delete product in my cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select delete product button
    Then number of products from the cart is reduced by one

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Move product to wishlist
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select move product to wishlist button
    Then CP user can see number of products from the cart is reduced by one
    And CP user can see new product is added to wishlist

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: View product details from cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user is on product detail page

    Examples:
      | username | password |
      | test     | test     |

  Scenario Outline: View product details save for later
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user is on product detail page
    And CP user can see number of items in a cart is great than zero
    When CP user select save for later button
    Then product is saved in cart for later checkout

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Apply promotion code
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user acn see apply promo code section
    When CP user select continue button
    Then CP user can see promo code discount applied to total cart amount
    # to be confirmed

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Add delivery address - maps
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user can see apply promo code section
    When CP user apply the promotion code
    Then CP user can see promo code discount applied to total cart amount
    When CP user select continue button
    Then CP user is on delivery method page
    When CP user select add new address option
    Then CP user is on search address page
    When CP user search and select delivery address "<delivery address>" from the map
    And CP user select delivery location from the map
    Then CP user can see delivery address "<delivery address>" is saved

    Examples:
      | username | password | delivery address |
      | test     | test     | 70 hill street   |


  @pwa-test
  Scenario Outline: Scenario Outline: select existing address
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user can see apply promo code section
    When CP user apply the promotion code
    Then CP user can see promo code discount applied to total cart amount
    When CP user select continue button
    Then CP user is on delivery method page
    When CP user select add new address option
    Then CP user is on search address page
    When CP user select delivery address "<delivery address>" from saved addresses
    Then CP user can see delivery address "<delivery address>" is saved

    Examples:
      | username | password | delivery address |
      | test     | test     | 70 hill street   |


  @pwa-test
  Scenario Outline: Pick from a store near you
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user can see apply promo code section
    When CP user apply the promotion code
    Then CP user can see promo code discount applied to total cart amount
    When CP user select continue button
    Then CP user is on delivery method page
    When CP user select pick from a store near you option
    Then CP user is on select pickup location page
    When CP user search and select pickup address "<pickup address>" from the map
    And CP user select pickup location from the map
    Then CP user can see pickup address "<pickup address>" is saved

    Examples:
      | username | password | pickup address |
      | test     | test     | 70 hill street |

  @pwa-test
  Scenario Outline: View total payable and proceed to payout - Sufficient Wallet Balance
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user can see apply promo code section
    When CP user apply the promotion code
    Then CP user can see promo code discont applied to total cart amount
    When CP user select continue button
    Then CP user is on delivery method page
    When CP user select add address option
    Then CP user is on search address page
    When CP user search and select delivery address "<delivery address>" from the map
    And CP user select delivery location from the map
    Then CP user can see delivery address "<delivery address>" is saved
    And CP user is on payment page
    And CP user can available wallet balance
    And CP user can amount payable "<amount payable>"for order
    When CP user select pay button
#    Then CP user can see pin or biometric authentication
#    When CP user authenticate themselves
    Then CP user is on payment options page
    When CP user select add another payment source
    Then CP user can see payment source page
    When CP user select another payment source "<payment source>"
    When CP user select continue button
    Then CP user can payment success page
    # to be confirmed

    Examples:
      | username | password | delivery address | amount payable | payment source |
      | test     | test     | Hom              |                |                |

  @pwa-test
  Scenario Outline: View total payable and proceed to payout - Insufficient wallet balance
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    And CP user can see number of items in a cart is great than zero
    And CP user can see number of items matches the product list
    When CP user select a product from cart list
    Then CP user can see apply promo code section
    When CP user apply the promotion code
    Then CP user can see promo code discont applied to total cart amount
    When CP user select continue button
    Then CP user is on delivery method page
    When CP user select add address option
    Then CP user is on search address page
    When CP user search and select delivery address "<delivery address>" from the map
    And CP user select delivery location from the map
    Then CP user can see delivery address "<delivery address>" is saved
    And CP user is on payment page
    And CP user can available wallet balance
    And CP user can amount payable "<amount payable>"for order
    When CP user select pay button
#    Then CP user can see pin or biometric authentication
#    When CP user authenticate themselves
    Then CP user is on payment options page
    When CP user select add another payment source
    Then CP user can see payment source page
    When CP user select another payment source "<payment source>"
    When CP user select continue button
    # to be confirmed

    Examples:
      | username | password | delivery address | amount payable | payment source |
      | test     | test     | Hom              |                |                |
