@customer-android
Feature: As a Customer Android(CA) user, I want to be able to buy groceries

  @android-test @buy-groceries
  Scenario Outline: Signup to one cart
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select groceries icon
    Then CA user is on groceries page
    And CA user can see your first delivery is on us promo
    And CA user can see one cart icon
    When CA user select one cart icon
    When CA user select continue button
    Then CA user is on one cart onboarding page
    When CA user select register new account
    Then CA user is on one cart new account registration page
    When CA user enter one cart first name "<first name>"
    When CA user enter one cart last name "<last name>"
    When CA user enter one cart email "<email>"
    When CA user enter one cart password "<one cart password>"
    When CA user confirm one cart password "<one cart confirm password>"
    When CA user accept one cart terms and conditions
    When CA user select one cart sign up button
    Then CA user is on one cart dashboard page

    Examples:
      | first name | last name | email | one cart password | one cart confirm password |
      | Hom        |           |       |                   |                           |

  @android-test @buy-groceries
  Scenario Outline: Search for groceries
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select groceries icon
    Then CA user is on groceries page
    And CA user can see one cart icon
    And CA user can see your first delivery is on us promo
    When CA user select one cart icon
    When CA user select continue button
    Then CA user is on one cart onboarding page
    When CA user login with one cart username "<one cart username>" and password  "<one cart password>"
    And CA user select one cart sign in button
    Then CA user is on one cart dashboard page

    Examples:
      | one cart username | one cart password |
      | Hom               |                   |

  @android-test @buy-groceries
  Scenario Outline: Select grocery supplier for shopping
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select groceries icon
    Then CA user is on groceries page
    And CA user can see first delivery is on us message
    And CA user can see one cart icon
    Then CA user can see we will user your information message
    Then CA user is on one cart onboarding page
    And CA user select one cart sign in button
    Then CA user is on one cart login page
    When CA user login with one cart username "<one cart username>" and password  "<one cart password>"
    And CA user select one cart sign in button
    Then CA user is on one cart dashboard page
    When CA user select grocery supplier store "<store>"
    Then CA is on grocery supplier page

    Examples:
      | one cart username | one cart password | store |
      |                   |                   |       |

  @android-test @buy-groceries
  Scenario Outline: Shop for groceries on the One Cart App
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select groceries icon
    Then CA user is on groceries page
    And CA user can see first delivery is on us message
    When CA select one cart icon
    Then CA user can see we will user your information message
    When CA user select continue button
    Then CA user is on one cart onboarding page
    And CA user select one cart sign in button
    Then CA user is on one cart login page
    When CA user login with one cart username "<one cart username>" and password  "<one cart password>"
    And CA user select one cart sign in button
    Then CA user is on one cart dashboard page
    When CA user select grocery supplier store "<store>"
    Then CA user is on grocery supplier page
    When CA user add item to buy to cart
    And CA user navigate to one cart cart page
    Then CA user on on one cart cart page
    When CA user select pay with MobiMoney Wallet
    Then CA user is on wakanda payment page
    And CA user can see to total payable amount
    And CA user select pay button
    Then CA user is on successful payment page
    And CA user can see delivery details for selected store "<store>"
    And CA user can see your order details button
    And CA user can see exit button
    And CA user select exit button
    Then CA user is on dashboard page

    Examples:
      | one cart username | one cart password | store |
      |                   |                   |       |

  @android-test @buy-groceries
  Scenario Outline: Pay for my groceries  using my Waka wallet on the Wakanda app
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select groceries icon
    Then CA user is on groceries page
    And CA user can see one cart icon
    Then CA user can see we will user your information message
    When CA user select continue button
    Then CA user is on one cart onboarding page
    And CA user select one cart sign in button
    Then CA user is on one cart login page
    When CA user login with one cart username "<one cart username>" and password  "<one cart password>"
    And CA user select one cart sign in button
    Then CA user is on one cart dashboard page
    When CA user select grocery supplier store "<store>"
    Then CA user is on grocery supplier page
    When CA user add item to buy to cart
    And CA user navigate to one cart cart page
    Then CA user on on one cart cart page
    When CA user select pay with MobiMoney Wallet tab
    Then CA user is on wakanda payment page
    And CA user can see to total payable amount
    And CA user select pay button
    Then CA user is on successful payment page
    And CA user can see delivery details for selected store "<store>"
    And CA user can see your order details button
    And CA user can see exit button
    And CA user select exit button
    Then CA user is on dashboard page

    Examples:
      | one cart username | one cart password | store |
      |                   |                   |       |

  @android-test @buy-groceries
  Scenario: Track my grocery order on wakanda app
    Given CA user launch the customer android app
    When CA user select login button
    Then CA user is on the dashboard page
    And CA user can see your order from one cart card
    When CA user select your order from one cart card
    Then CA user is on order history page
    And CA user can see ongoing orders button
    And CA user can see past orders button
    When CA user select ongoing orders button
    Then CA user can see ongoing order from one cart
    When CA user select an ongoing order from one cart
    Then CA user is on ongoing order details page
    And CA user can see track your shipment button
    When CA user select track your shipment button
    Then CA user can see order tracking status

  @android-test @buy-groceries
  Scenario: Re-order from my order history on Wakanda app with a redirect to One Cart App
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    And CA user can see your order from one cart card
    When CA user select your order from one cart card
    Then CA user is on order history page
    And CA user can see ongoing orders button
    And CA user can see past orders button
    When CA user select past orders button
    Then CA user can see past order from one cart
    When CA user select a past order from one cart
    Then CA user is on past order details page
    And CA user can see reorder button
    When CA user select reorder button
    Then CA user can see pay with MobiMoney Wallet tab