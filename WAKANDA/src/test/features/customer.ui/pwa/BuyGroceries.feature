@customer-pwa
Feature: As a Customer PWA (CP) user, I want to be able to buy groceries

  @pwa-test
  Scenario Outline: Signup to one cart
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page
    And CP user can see one cart icon
    And CP user can see your first delivery is on us promo
    When CP user select one cart icon
    Then CP user can see continue button
    When CP user select continue button
    Then CP user is on one cart onboarding page
    When CP user select register new account
    Then CP user is on one cart new account registration page
    When CP user enter one cart first name "<first name>"
    When CP user enter one cart last name "<last name>"
    When CP user enter one cart email "<email>"
    When CP user enter one cart password "<one cart password>"
    When CP user confirm one cart password "<one cart confirm password>"
    When CP user accept one cart terms and conditions
    When CP user select one cart sign up button
    Then CP user is on one cart dashboard page

    Examples:
      | username | password | first name | last name | one cart password | one cart confirm password |
      | test     | test     | Hom        |           |                   |                           |

  @pwa-test
  Scenario Outline: Search for groceries
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page
    And CP user can see one cart icon
    And CP user can see your first delivery is on us promo
    When CP user select one cart icon
    Then CP user can see continue button
    When CP user select continue button
    Then CP user is on one cart onboarding page
    When CP user login with one cart username "<one car username>" and password  "<one cart password>"
    And CP user select one cart sign in button
    Then CP user is on one cart dashboard page

    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |


  @pwa-test
  Scenario Outline: Select grocery supplier for shopping
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page


    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |

  @pwa-test
  Scenario Outline: Shop for groceries on the One Cart App
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page


    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |

  @pwa-test
  Scenario Outline: Pay for my groceries  using my Waka wallet on the Wakanda app
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page


    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |

  @pwa-test
  Scenario Outline: Track my grocery order on wakanda app
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page


    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |


  @pwa-test
  Scenario Outline: Re-order from my order history on Wakanda app with a redirect to One Cart App
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select groceries icon
    Then CP user is on groceries page


    Examples:
      | username | password | shopping category | shopping subcategory | add to cart |
      | test     | test     | Hom               |                      |             |

