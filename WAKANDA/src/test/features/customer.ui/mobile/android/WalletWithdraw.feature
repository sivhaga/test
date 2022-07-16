@customer-android
Feature: Wallet Withdraw - As a Customer Android (CA) user, I want be able to withdraw funds from my wallet to any SA bank account or via ATM

  @android-test @wallet
  Scenario Outline: Withdraw funds via Nedbank ATM in cash
    Given CA user launch the customer android app
    Then CA user can see Use PIN link
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see withdrawal button
    When CA user select withdrawal button
    Then CA user is on withdrawal page
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user is on authentication page
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation page with withdrawal details
    When CA user select close button
    Then CA user is able to see withdrawal button


    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @android-test @wallet
  Scenario Outline: Withdraw funds via Nedbank ATM in cash - above daily limit
    Given CA user launch the customer android app
    Then CA user can see Use PIN link
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see withdrawal button
    When CA user select withdrawal button
    Then CA user is on withdrawal page
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user is on authentication page
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation page with withdrawal details
    When CA user select close button
    Then CA user is able to see withdrawal button


    Examples:
      | pin   | amount |
      | 12345 | 4500   |

  @android-test @wallet
  Scenario Outline: Withdraw funds via Nedbank ATM in cash - blocked for 24 hours after first card funding
    Given CA user launch the customer android app
    Then CA user can see Use PIN link
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see withdrawal button
    When CA user select withdrawal button
    Then CA user is on withdrawal page
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user is on authentication page
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation page with withdrawal details
    When CA user select close button
    Then CA user is able to see withdrawal button


    Examples:
      | pin   | amount |
      | 12345 | 4500   |

  @android-test @wallet
  Scenario Outline: Find suitable Nedbank ATM location
    Given CA user launch the customer android app
    Then CA user can see Use PIN link
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user can see wallet balance
    When CA user select wallet menu
    Then CA user is able to see withdrawal button
    When CA user select withdrawal button
    Then CA user is on withdrawal page
    And CA user select ATM locator link
    Then CA user can see map with ATMs page
    When CA user select close button
    Then CA user is able to see withdrawal button

    Examples:
      | pin   |
      | 12345 |