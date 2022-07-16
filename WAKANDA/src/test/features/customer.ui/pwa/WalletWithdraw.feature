@customer-pwa
Feature: As a Customer PWA (CP) user, I want be able to withdraw funds from my wallet to any SA bank account or via ATM

  @pwa-test
  Scenario Outline: Withdraw funds via Nedbank ATM in cash
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see Withdraw tab
    When CP user select Withdraw
    Then Withdraw screen is displayed
    When CP user enter amount "<amount>" as amount
    And CP user select Withdraw cash from a Nedbank ATM option
    And CP user select continue button
    Then CP user can see authentication screen
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    Then CP user can see a secret ATM code generated

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @pwa-test
  Scenario Outline: Find suitable Nedbank ATM location
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see Withdraw tab
    When CP user select Withdraw
    Then Withdraw screen is displayed
    When CP user select Withdraw cash from a Nedbank ATM option
    And CP user select ATM locator link
    Then Map is displayed with ATMs

    Examples:
      | pin   |
      | 12345 |

  @pwa-test
  Scenario Outline: Settle funds to Nedbank account
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see Withdraw tab
    When CP user select Withdraw
    Then Withdraw screen is displayed
    When CP user enter amount "<amount>" as amount
    And CP user select to a nedbank account option
    Then login screen is displayed
    When CP user enter CP user id "<CP user id>" as CP user id
    And CP user enter password "<password>" as password
    And CP user select submit button
    Then CP user can see confirmation screen
    When CP user select settle now button
    Then CP user can see authentication screen
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    Then CP user can see a confirmation screen with money settled details

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @pwa-test
  Scenario Outline: Settle funds to outside bank account
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see Withdraw tab
    When CP user select Withdraw
    Then Withdraw screen is displayed
    When CP user enter amount "<amount>" as amount
    And CP user select a different bank account option
    Then adding a bank account screen is displayed
    When CP user select bank name
    And  CP user enter account number "<account number>" as account number
    And  CP user enter account holder name "<account holder name>" as account holder name
    And  CP user enter account type "<account type>" as account type
    And  CP user enter reference "<reference>" as reference
    And  CP user select save button
    Then CP user can see settlement confirmation screen with details is displayed

    Examples:
      | pin   | amount | account number | account holder name | account type | reference |
      | 12345 | 100    | 1234567890     | account holder name | account type | reference |





