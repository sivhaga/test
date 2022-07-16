@customer-ios
Feature: As a Customer iOS (CI) user, I want to be able to add a product to cart and make a payment

  @ios-test @buy-product @smoke
  Scenario Outline: Add product to cart
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    And CI user can see number of products left
    When CI user scroll the page down
    When CI user select add to cart button
    Then CI user can see no error dialog shown

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product @smoke
  Scenario: View product(s) in my cart
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see earn loyalty points message

  @ios-test @buy-product
  Scenario: Increase number of products in my cart
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    When CI user scroll the page down
    Then CI can see eshop cart number per item
    When CI user select plus button
    Then CI user can see product cart total increased by one


  @ios-test @buy-product
  Scenario: Decrease number of products in my cart
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    When CI user select minus button
    Then CI can see eshop cart number per item


  @ios-test @buy-product
  Scenario: Delete product in my cart
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    When CI user select delete product button
    Then CI user can see no error dialog shown
    And CI user can see all products deleted from the cart


  @ios-test @buy-product
  Scenario: Move product to wish list
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    When CI user select move product to wish list button
    Then CI user can see number of products from the cart is reduced by one
    And CI user can see new product is added to wish list


  @ios-test @buy-product
  Scenario Outline: View product details from cart and write review
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    When CI user select a product from cart list
    Then CI user is on product detail page
    When CI user select write a review button
    Then CI user is on rate the product page
    When CI user select rating buttons
    And CI user enter review message "<message>"
#    And CI user select submit button
    Then CI user can see customer review added

    Examples:
      | message         |
      | awasome product |

  @ios-test @buy-product
  Scenario: View product details save for later
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    When CI user select save for later button
    Then CI user can see no error dialog shown
    And product is saved in cart for later checkout

  @ios-test @buy-product
  Scenario Outline: Apply promotion code
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    Then CI user can see apply promo code section
    When CI user select apply promo code label
    Then CI user is on promo code page
    When CI user enter promo code "<promo code>"
    And CI user select apply promo code button
    Then CI user is on shopping cart page
    Then CI user can see promo code discount applied to total cart amount
    # to be confirmed

    Examples:
      | promo code |
      | 12345      |

  @ios-test @buy-product
  Scenario Outline: Add delivery address - maps
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    And CI user can see number of items matches the product list
    When CI user select a product from cart list
    Then CI user can see apply promo code section
    When CI user apply the promotion code
    Then CI user can see promo code discount applied to total cart amount
    When CI user select checkout button
    Then CI user is on delivery method page
    When CI user select add address option
    Then CI user is on search address page
    When CI user search and select delivery address "<delivery address>" from the map
    And CI user select delivery location from the map
    When CI user enter delivery complex name "<complex name>"
    And CI user enter delivery house number "<house number>"
    And CI user enter delivery nick name "<nick name>"
    And CI user select save location button
    Then CI user can see delivery address "<delivery address>" is saved

    Examples:
      | delivery address | complex name | house number | nick name    |
      | 105 West         | B-Block      | 105          | Work Address |

  @ios-test @buy-product
  Scenario Outline: Pick from a store near you
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    Then CI user can see apply promo code section
    When CI user select checkout button
    Then CI user is on delivery method page
    And CI user can see pickup address label
    When CI user select pickup from a store near "<pickup address>" option
    And CI user select deliver here button
    Then CI user is on shipment page
    When CI user select proceed to payment button
    And CI user is on payment page
    And CI user can available wallet balance

    Examples:
      | pickup address | pickup address                                         |
      | 70 hill street | 05 Wiliam Rd Ave, Sandown, Sandton, 2196, South Africa |

  @ios-test1 @buy-product @smoke
  Scenario Outline: View total payable and proceed to payout - Sufficient Wallet Balance
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping icon
    Then CI user is on shopping page

    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    And CI user can see number of products left
    When CI user scroll the page down
    When CI user select add to cart button

    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    And CI user can see number of items matches the product list
    When CI user select checkout button
    Then CI user is on delivery method page
    When CI user select deliver here button
    Then CI user is on shipment page
    When CI user select proceed to payment button
    And CI user is on payment page
    And CI user can see apply promo code section
    And CI user can see get personal loan tip
    And CI user can see use your waka points message
    When CI user select cart pay button
    Then CI user can see enter pin label
    When CI user authenticate themselves
    And CI user can available wallet balance
    Then CI user is on payment options page
    When CI user select add another payment source
    Then CI user is order confirmation page
    # to be confirmed

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product
  Scenario Outline: View total payable and proceed to payout - Insufficient wallet balance
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    And CI user can see number of items in a cart is great than zero
    And CI user can see number of items matches the product list
    When CI user select a product from cart list
    Then CI user can see apply promo code section
    When CI user apply the promotion code
    Then CI user can see promo code discount applied to total cart amount
    When CI user select checkout button
    Then CI user is on delivery method page
    When CI user select deliver here button
    Then CI user is on shipment page
    And CI user can see proceed to payment button
    When CI user select proceed to payment button
    Then CI user is on payment page
    And CI user can see apply promo code section
    And CI user can see get personal loan tip
    And CI user can see use your waka points message
#    And CI user can available wallet balance
#    And CI user can amount payable "<amount payable>"for order
    When CI user select cart pay button
    Then CI user can see enter pin label
    When CI user authenticate themselves
    Then CI user is on payment options page
    When CI user select add another payment source
    Then CI user can see payment source page
#    When CI user select another payment source "<payment source>"
    When CI user select cart pay button

    Examples:
      | delivery address | amount payable | payment source | complex name | house number | nick name    |
      | 105 West         |                |                | B-Block      | 105          | Work Address |
