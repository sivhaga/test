@customer-android
Feature: As a Customer Android(CA) user, I want to be able to use the app as a guest user without login in

  @android-test @guest-user
  Scenario: Guest user home page
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    And CA user can see login and sign up buttons

  @android-test @guest-user
  Scenario: Guest user categories page
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select categories menu
    Then CA user is on categories page


  @android-test @guest-user
  Scenario: Guest user scan page
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select scan qr code menu
    Then CA user can see login sign up prompt message

  @android-test @guest-user
  Scenario: Guest user my money page
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select my money menu
    Then CA user is on my money page
    Then CA user can see login sign up prompt message


  @android-test @guest-user
  Scenario: Guest user more page
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see sign in button
    Then CA user can see refer a friend profile menu
    Then CA user can see help and support profile menu
    Then CA user can see terms and conditions profile menu
    Then CA user can see rate aus profile menu
    Then CA user can see about us profile menu


  @android-test @guest-user
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
#    When CA user select number of products "<add to cart>" to add to cart
#    Then CA user can see if number of products to add to cart "<add to cart>" is not more than number of products left
    When CA user select favourite button
    Then CA user can see login sign up prompt message
    When CA user select device back button
    Then CA user is on product detail page
    When CA user select add to cart button
    Then CA user can see login sign up prompt message
    When CA user select device back button
    Then CA user is on product detail page
    When CA user select buy now button
    Then CA user can see login sign up prompt message


    Examples:
      | shopping category |
      | Tech              |


  @android-test @guest-user
  Scenario Outline: Creating a job card
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select services menu
    And CA user can see send job request button
    When CA user select send job request button
    Then CA user is on create job page
    When CA user update job name "<job name>"
    And CA user update job urgency "<job urgency>" option
    When CA user update job description "<job description>"
    Then CA user can see attach photos button
    When CA user select attach photos button
    Then CA user can see set a location button
    When CA user select add location button
    Then CA user can see login sign up prompt message

    Examples:
      | job name    | job urgency | job description |
      | Fix my sink | yes         | fix it now      |

  @android-test @guest-user
  Scenario Outline: Buy airtime - enter amount
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select prepaids menu
    Then CA user is on prepaids page
    When CA user select airtime and bundles button
    Then CA user is on select contact page
#    And CA user can see recent transactions
    When CA user search for and select contact "<contact>"
    Then CA user can see selected recipient
    And CA user can see prepaid service providers
    When CA user select prepaid service provider "<service provider>"
    Then CA user can see selected prepaid service provider "<service provider>"
    When CA user select prepaid topup option "<topup option>"
    Then CA user can see selected prepaid topup option "<topup option>"
    And CA user can see available MobiMoney balance label
    When CA user select enter amount link
    Then CA user can see enter prepaid amount label
    When CA user enter prepaid amount "<amount>"
    Then CA user can see purchase now button
    Then CA user can see login sign up prompt message

    Examples:
      | contact    | service provider | topup option | amount |
      | 0731254585 | mtn              | airtime      | 15     |

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


  @android-test @guest-user
  Scenario: Guest user categories page
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select categories menu
    Then CA user is on categories page
    When CA user select travel sub category
    Then CA user is on travel sub category page
