@merchant-ios
Feature: As a Merchant PWA (MP) user, I want be able to top up my wallet via EFT transfer or bank card

  @pwa-test
  Scenario Outline: Add Nedbank Account
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see top up tab
    When MP User select Top Up
    Then add Money screen is displayed
    And MP User select manage sources
    And MP User select add Nedbank account option
    And MP User select continue button
    Then login screen is displayed
    When MP User enter MP User id "<User id>" as MP User id
    And MP User enter password "<password>" as password
    And MP User select subMPt button
    #And MP User select account - in case MP User has multiple account
    And MP User select add account button
    Then MP User can see add confirmation screen

    Examples:
      |pin|User id|password|
      | 12345 |test |password|

  @pwa-test
  Scenario Outline: Add funds via ATM
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see top up tab
    When MP User select Top Up
    Then add Money screen is displayed
    And MP User select manage sources
    And MP User select Add funds via ATM option
    And MP User select continue button
    Then Add funds via ATM details screen is displayed

    Examples:
      |pin|
      | 12345 |

  @pwa-test
  Scenario Outline: EFT from another bank account
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see top up tab
    When MP User select Top Up
    Then add Money screen is displayed
    And MP User select manage sources
    And MP User select EFT from another bank account option
    And MP User select continue button
    Then Wallet account details screen is displayed
    Then Name field is displayed
    Then Account number is displayed
    Then Bank Name is displayed
    Then Branch Code is displayed
    Then Reference is displayed

    Examples:
      |pin|
      | 12345 |

  @pwa-test
  Scenario Outline: Top Up without account setup
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see top up tab
    When MP User select Top Up
    Then instantly add money screen is displayed
    And MP User select add nedbank account option
    And MP User select Continue
    Then login screen is displayed
    When MP User enter MP User id "<User id>" as MP User id
    And MP User enter password "<password>" as password
    And MP User select subMPt button
     #And MP User select account - in case MP User has multiple account
    And MP User select add account button
    Then MP User can see add confirmation screen
    And MP User select top up my wallet
    When MP User enter amount "<amount>" as amount
    And MP User select account to pay from
    And MP User select continue button
    Then MP User can see authentication screen
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    Then MP User can see a confirmation screen with top up details

    Examples:
     |pin|User id|password|amount|
     |12345|Userid |password|100|

  @pwa-test
  Scenario Outline: Top Up with account already setup
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see top up tab
    When MP User select Top Up
    Then add Money screen is displayed
    When MP User enter amount "<amount>" as amount
    And MP User select continue button
    Then MP User can see authentication screen
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    Then MP User can see a confirmation screen with top up details

    Examples:
      |pin|amount|
      |12345|100 |

  @pwa-test
  Scenario Outline: Remove Account
    Given MP User launch the Merchant app
    Then MP User can see Use PIN link
    When MP User select on Use PIN link
    And MP User enter pin "<pin>" as PIN
    When MP User select on confirm button
    Then MP user can see wallet balance
    When MP User select on my money
    Then MP User is able to see top up tab
    When MP User select Top Up
    Then add Money screen is displayed
    And MP User select manage sources
    And MP User select delete
    Then delete confirmation screen is displayed
    And MP User select delete option
    Then MP User can see a delete confirmation screen

    Examples:
      |pin|
      |12345|


