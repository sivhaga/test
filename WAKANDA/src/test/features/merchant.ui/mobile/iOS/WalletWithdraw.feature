@merchant-ios
Feature: Wallet Withdraw - As a Merchant ios (MI) user, I want be able to withdraw funds from my wallet to any SA bank account or via ATM

  @Not-yet-developed
  Scenario Outline: Withdraw funds via Nedbank ATM in cash
    Given MI user launch the merchant ios app
    Then MI user can see Use PIN link
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see withdrawal tab
    When MI user select withdrawal
    Then MI user is on withdrawal page
    When MI user enter amount "<amount>" as amount
    And MI user select continue button
    Then MI user is on authentication page
#    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    Then MI user can see a confirmation page with withdrawal details
    Then MI user select close button
    Then MI user is on my wallet page

    Examples:
      |pin|amount|
      | 12345 |100|

  @Not-yet-developed
  Scenario Outline: Find suitable Nedbank ATM location
    Given MI user launch the merchant ios app
    Then MI user can see Use PIN link
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user can see wallet balance
    When MI user select on my money
    Then MI user is able to see withdrawal tab
    When MI user select withdrawal
    Then MI user is on withdrawal page
    And MI user select ATM locator link
    Then MI user can see map with ATMs page
    Then MI user select close button
    Then MI user is on my wallet page


    Examples:
      |pin|
      | 12345 |