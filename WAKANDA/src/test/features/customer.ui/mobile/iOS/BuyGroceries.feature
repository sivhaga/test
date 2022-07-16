@customer-ios
Feature: As a Customer IOS(CI) user, I want to be able to buy groceries

  @ios-test @buy-groceries
  Scenario Outline: Signup to one cart
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select groceries icon
    Then CI user is on groceries page
    And CI user can see one cart logo
    And CI user can see your first delivery is on us promo
    When CI user select one cart logo
    Then CI user is on one cart redirect page
    Then CI user can see on cart logo on redirect page
    When CI user select shop groceries button
    Then CI user is on one cart home page
    When CI user select register new account
    Then CI user is on one cart new account registration page
    When CI user enter one cart first name "<first name>"
    When CI user enter one cart last name "<last name>"
    When CI user enter one cart email "<email>"
    When CI user enter one cart password "<one cart password>"
    When CI user confirm one cart password "<one cart confirm password>"
    When CI user accept one cart terms and conditions
    When CI user select one cart sign up button
    Then CI user is on one cart dashboard page

    Examples:
      | pin   | first name | last name | email | one cart password | one cart confirm password |
      | 12345 | Hom        |           |       |                   |                           |

  @ios-test @buy-groceries
  Scenario Outline: Search for groceries
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select groceries icon
    Then CI user is on groceries page
    And CI user can see one cart logo
    And CI user can see your first delivery is on us promo
    When CI user select one cart logo
    Then CI user is on one cart redirect page
    Then CI user can see on cart logo on redirect page
    When CI user select shop groceries button
    Then CI user is on one cart home page
    When CI user login with one cart username "<one cart username>" and password  "<one cart password>"
    And CI user select one cart sign in button
    Then CI user is on one cart dashboard page

    Examples:
      | pin   | one cart username | one cart password |
      | 12345 | Hom               |                   |


  @ios-test @buy-groceries
  Scenario Outline: Select grocery supplier for shopping
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select groceries icon
    Then CI user is on groceries page
    And CI user can see one cart logo
    And CI user can see your first delivery is on us promo
    When CI user select one cart logo
    Then CI user is on one cart redirect page
    Then CI user can see on cart logo on redirect page
    When CI user select shop groceries button
    Then CI user is on one cart home page
    When CI user select grocery supplier store "<store>"
    Then CI is on grocery supplier "<store>" page

    Examples:
      | store          |
      | Jacksons       |
      | Woolworths     |
      | Pick n Pay     |
      | Dis-chem       |
      | FLM            |
      | Fruits & Roots |


  @ios-test @buy-groceries
  Scenario Outline: Shop for groceries on the One Cart App
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select groceries icon
    Then CI user is on groceries page
    And CI user can see one cart logo
    And CI user can see your first delivery is on us promo
    When CI user select one cart logo
#    Then CI user is on one cart redirect page
#    Then CI user can see on cart logo on redirect page
#    When CI user select shop groceries button

    Then CI user is on search address page
    When CI user search and select delivery address "<delivery address>" from the map
    And CI user select delivery location from the map
    When CI user enter delivery complex name "<complex name>"
    And CI user enter delivery house number "<house number>"
    And CI user enter delivery nick name "<nick name>"
    And CI user select save location button
    Then CI user can see delivery address "<delivery address>" is saved
    Then CI user is on one cart home page
    Then CI user is on groceries page
    When CI user select one cart logo

#    And CI user select one cart sign in button
#    Then CI user is on one cart login page
#    When CI user login with one cart username "<one cart username>" and password  "<one cart password>"
#    And CI user select one cart sign in button
    Then CI user is on one cart dashboard page
    When CI user select grocery supplier store "<store>"
    Then CI is on grocery supplier "<store>" page
    When CI user add item to buy to cart
    And CI user navigate to one cart cart page
    Then CI user on on one cart cart page
    When CI user select proceed to checkout button
    Then CI user is on one cart checkout page

    When CI user enter one cart contact details
    And CI user select one cart continue to delivery button

    And CI user enter one cart delivery details
    And CI user select one cart continue to refunds button

    And CI user select one cart continue to loyalty cards button
    And CI user select one cart skip loyalty cards button
#    Then CI user can see complete payment using wakanda wallet message
#    And CI user select pay with wakanda wallet button
    When CI user select pay with wakanda wallet
    Then CI user is on wakanda payment page
    And CI user can see to total payable amount label
#    When CI user select apply promo code label
#    And CI user enter promo code "<promo>"
    When CI user select get your pre approved loan button
    Then CI user is on instant loan page
    When CI user select device back button
    Then CI user is on wakanda payment page
    When CI user select use your wakanda points button
    When CI user select groceries pay button
    Then CI user is on successful payment page
    And CI user can see delivery details for selected store "<store>"
    And CI user can see your order details button
    And CI user can see exit button
    And CI user select exit button
    Then CI user is on dashboard page

    Examples:
      | delivery address | complex name | house number | nick name    | store      |
      | 105 West         | B-Block      | 105          | Work Address | Woolworths |

  @ios-test @buy-groceries
  Scenario Outline: Pay for my groceries  using my Waka wallet on the Wakanda app
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select groceries icon
    Then CI user is on groceries page
    And CI user can see one cart logo
    And CI user can see your first delivery is on us promo
    When CI user select one cart logo
    Then CI user is on one cart redirect page
    Then CI user can see on cart logo on redirect page
    When CI user select shop groceries button
    Then CI user is on one cart home page
#    And CI user select one cart sign in button
#    Then CI user is on one cart login page
#    When CI user login with one cart username "<one cart username>" and password  "<one cart password>"
#    And CI user select one cart sign in button
#    Then CI user is on one cart dashboard page
#    When CI user select grocery supplier store "<store>"
#    Then CI user is on grocery supplier page
#    When CI user add item to buy to cart
#    And CI user navigate to one cart cart page
#    Then CI user on on one cart cart page
#    When CI user select pay with MobiMoney Wallet
    Then CI user is on wakanda payment page
    And CI user can see to total payable amount label
#    When CI user select apply promo code label
#    And CI user enter promo code "<promo>"
    When CI user select get your pre approved loan button
    Then CI user is on instant loan page
    When CI user select device back button
    Then CI user is on wakanda payment page
    When CI user select use your wakanda points button
    When CI user select groceries pay button
    Then CI user is on successful payment page
    And CI user can see delivery details for selected store "<store>"
    And CI user can see your order details button
    And CI user can see exit button
    And CI user select exit button
    Then CI user is on dashboard page

    Examples:
      | pin   | one cart username | one cart password | store |
      | 12345 | Hom               |                   |       |

  @ios-test @buy-groceries
  Scenario Outline: Track my grocery order on wakanda app
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see your order from one cart card
    When CI user select your order from one cart card
    Then CI user is on order history page
    And CI user can see ongoing orders button
    And CI user can see past orders button
    When CI user select ongoing orders button
    Then CI user can see ongoing order from one cart
    When CI user select an ongoing order from one cart
    Then CI user is on ongoing order details page
    And CI user can see track your shipment button
    When CI user select track your shipment button
    Then CI user can see order tracking status

    Examples:
      | pin   |
      | 12345 |


  @ios-test @buy-groceries
  Scenario Outline: Re-order from my order history on Wakanda app with a redirect to One Cart App
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see your order from one cart card
    When CI user select your order from one cart card
    Then CI user is on order history page
    And CI user can see ongoing orders button
    And CI user can see past orders button
    When CI user select past orders button
    Then CI user can see past order from one cart
    When CI user select a past order from one cart
    Then CI user is on past order details page
    And CI user can see reorder button
    When CI user select reorder button
    Then CI user can see pay with MobiMoney Wallet tab

    Examples:
      | pin   |
      | 12345 |