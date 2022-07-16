@customer-pwa
Feature: As a Customer PWA(CP) user, I want be able to top up my wallet via EFT transfer or bank card

  @pwa-test
  Scenario Outline: Add Nedbank Account
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then add Money screen is displayed
    And CP user select manage sources
    And CP user select add Nedbank account option
    And CP user select continue button
    Then login screen is displayed
    When CP user enter CP user id "<User id>" as CP user id
    And CP user enter password "<password>" as password
    And CP user select submit button
    #And CP user select account - in case CP user has multiple account
    And CP user select add account button
    Then CP user can see add confirmation screen

    Examples:
      | pin   | User id | password |
      | 12345 | test    | password |

  @pwa-test
  Scenario Outline: Add funds via ATM
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then add Money screen is displayed
    And CP user select manage sources
    And CP user select Add funds via ATM option
    And CP user select continue button
    Then Add funds via ATM details screen is displayed

    Examples:
      | pin   |
      | 12345 |

  @pwa-test
  Scenario Outline: EFT from another bank account
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then add Money screen is displayed
    And CP user select manage sources
    And CP user select EFT from another bank account option
    And CP user select continue button
    Then Wallet account details screen is displayed
    Then Name field is displayed
    Then Account number is displayed
    Then Bank Name is displayed
    Then Branch Code is displayed
    Then Reference is displayed

    Examples:
      | pin   |
      | 12345 |

  @pwa-test
  Scenario Outline: Top Up without account setup
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then instantly add money screen is displayed
    And CP user select add nedbank account option
    And CP user select Continue
    Then login screen is displayed
    When CP user enter CP user id "<User id>" as CP user id
    And CP user enter password "<password>" as password
    And CP user select submit button
     #And CP user select account - in case CP user has multiple account
    And CP user select add account button
    Then CP user can see add confirmation screen
    And CP user select top up my wallet
    When CP user enter amount "<amount>" as amount
    And CP user select account to pay from
    And CP user select continue button
    Then CP user can see authentication screen
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    Then CP user can see a confirmation screen with top up details

    Examples:
      | pin   | User id | password | amount |
      | 12345 | Userid  | password | 100    |

  @pwa-test
  Scenario Outline: Top Up with account already setup
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then add Money screen is displayed
    When CP user enter amount "<amount>" as amount
    And CP user select continue button
    Then CP user can see authentication screen
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    Then CP user can see a confirmation screen with top up details

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @pwa-test
  Scenario Outline: Remove Account
    Given CP user launch the customer web
    Then CP user can see Use PIN link
    When CP user select on Use PIN link
    And CP user enter pin "<pin>" as PIN
    When CP user select on confirm button
    Then CP user is able to see wallet balance
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then add Money screen is displayed
    And CP user select manage sources
    And CP user select delete
    Then delete confirmation screen is displayed
    And CP user select delete option
    Then CP user can see a delete confirmation screen

    Examples:
      | pin   |
      | 12345 |