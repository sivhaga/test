@merchant-ios
Feature: As a Merchant PWA (MP) user, I want be able to withdraw funds from my wallet to any SA bank account or via ATM

  @pwa-test
  Scenario Outline: Withdraw funds via Nedbank ATM in cash
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see Withdraw tab
    When MP User select Withdraw
    Then Withdraw screen is displayed
    When MP User enter amount "<amount>" as amount
    And MP User select Withdraw cash from a Nedbank ATM option
    And MP User select continue button
    Then MP User can see authentication screen
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    Then MP User can see a secret ATM code generated

    Examples:
      |pin|amount|
      | 12345 |100|
    
  @pwa-test  
  Scenario Outline: Find suitable Nedbank ATM location
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see Withdraw tab
    When MP User select Withdraw
    Then Withdraw screen is displayed
    When MP User select Withdraw cash from a Nedbank ATM option
    And MP User select ATM locator link
    Then Map is displayed with ATMs


    Examples:
      |pin|
      | 12345 |

  @pwa-test  
  Scenario Outline: Settle funds to Nedbank account
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see Withdraw tab
    When MP User select Withdraw
    Then Withdraw screen is displayed
    When MP User enter amount "<amount>" as amount
    And MP User select to a nedbank account option
    Then login screen is displayed
    When MP User enter MP User id "<User id>" as MP User id
    And MP User enter password "<password>" as password
    And MP User select submit button
    Then MP User can see confirmation screen
    When MP User select settle now button
    Then MP User can see authentication screen
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    Then MP User can see a confirmation screen with money settled details

    Examples:
      |pin|amount|
      | 12345 |100|

  @pwa-test
  Scenario Outline: Settle funds to outside bank account
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see Withdraw tab
    When MP User select Withdraw
    Then Withdraw screen is displayed
    When MP User enter amount "<amount>" as amount
    And MP User select a different bank account option
    Then adding a bank account screen is displayed
    When MP User select bank name
    And  MP User enter account number "<account number>" as account number
    And  MP User enter account holder name "<account holder name>" as account holder name
    And  MP User enter account type "<account type>" as account type
    And  MP User enter reference "<reference>" as reference
    And  MP User select save button
    Then MP User can see settlement confirmation screen with details is displayed

    Examples:
      |pin|amount|account number|account holder name|account type|reference|
      | 12345 |100|1234567890   |account holder name|account type|reference|






