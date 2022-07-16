@merchant-android
Feature: Wallet Withdraw - As a Merchant Android (MA) user, I want be able to withdraw funds from my wallet to any SA bank account or via ATM

  @android-test
  Scenario Outline: Withdraw funds via Nedbank ATM in cash
    Given MA user launch the merchant android app
    Then MA user can see Use PIN link
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see withdrawal tab
    When MA user select withdrawal
    Then MA user is on withdrawal page
    When MA user enter amount "<amount>" as amount
    And MA user select continue button
    Then MA user is on authentication page
#    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    Then MA user can see a confirmation page with withdrawal details
    When MA user select close button
    Then MA user is on dashboard page

    Examples:
      |pin|amount|
      | 12345 |100|

  @android-test
  Scenario Outline: Amount greater than available balance
    Given MA user launch the merchant android app
    Then MA user can see Use PIN link
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see withdrawal tab
    When MA user select withdrawal
    Then MA user is on withdrawal page
    When MA user enter amount "<amount>" as amount
    And MA user select continue button
    Then MA user can see error message

    Examples:
      |pin|amount|
      | 12345 |1000000|

  @android-test
  Scenario Outline: Find suitable Nedbank ATM location
    Given MA user launch the merchant android app
    Then MA user can see Use PIN link
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see withdrawal tab
    When MA user select withdrawal
    Then MA user is on withdrawal page
    And MA user select ATM locator link
    Then MA user can see map with ATMs page
    When MA user select close button
    Then MA user is on dashboard page



    Examples:
      |pin|
      | 12345 |