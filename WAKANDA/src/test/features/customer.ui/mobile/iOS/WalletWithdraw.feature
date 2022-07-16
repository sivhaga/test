@customer-ios
Feature: Wallet Withdraw - As a Customer iOS (CI) user, I want be able to withdraw funds from my wallet to any SA bank account or via ATM

  @ios-test @wallet
  Scenario Outline: Withdraw funds via Nedbank ATM in cash
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see withdrawal tab
    When CI user select withdrawal
    Then CI user is on withdrawal page
    When CI user enter amount "<amount>" as amount
    And CI user select continue button
    Then CI user is on authentication page
    And CI user enter pin "<pin>" to authenticate
    When CI user select confirm button
    Then CI user can see a confirmation page with withdrawal details
    Then CI user select close button

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @ios-test @wallet
  Scenario: Find suitable Nedbank ATM location
    Given CI user launch the customer ios app
    Then CI user can see wallet balance
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see withdrawal tab
    When CI user select withdrawal
    Then CI user is on withdrawal page
    And CI user select ATM locator link
    Then CI user can see map with ATMs page
    Then CI user select close button

