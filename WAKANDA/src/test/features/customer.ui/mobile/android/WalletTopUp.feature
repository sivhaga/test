@customer-android
Feature: Wallet top up - As a Customer Android (CA) user, I want be able to top up my wallet via EFT transfer or bank card

  @android-test @wallet
  Scenario Outline: Top up with account already setup
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user can see a confirmation screen with top up details
    Then CA user select close button

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @android-test @wallet
  Scenario Outline: Top up without account setup
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then instantly add money screen is displayed
    And CA user select add Nedbank account option
    And CA user select continue
    Then login screen is displayed
    When CA user enter CA user id "<User id>" as CA user id
    And CA user enter password "<password>" as password
    And CA user select submit button
     #And CA user select account - in case CA user has multiple account
    And CA user select add account button
    Then CA user can see add confirmation page
    And CA user select top up my wallet
    When CA user enter amount "<amount>" as amount
    And CA user select account to pay from
    And CA user select continue button
    #Then CA user can see authentication page
    #When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation page with top up details
    Then CA user select close button

    Examples:
      | pin   | User id | password | amount |
      | 12345 | Userid  | password | 100    |

  @android-test @wallet
  Scenario Outline: Add Nedbank Account
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    When CA user select manage sources
    And CA user select add Nedbank account option
    And CA user select continue button
    Then login page is displayed
    When CA user enter CA user id "<User id>" as CA user id
    And CA user enter password "<password>" as password
    And CA user select submit button
    #And CA user select account - in case CA user has multiple account
    And CA user select add account button
    Then CA user can see add confirmation page
    Then CA user select close button

    Examples:
      | pin   | User id | password |
      | 12345 | test    | password |

  @android-test @wallet
  Scenario Outline: Add funds via ATM
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    When CA user select manage sources
    And CA user select Add funds via ATM option
    And CA user select continue button
    Then CA user is on Add funds via ATM details page
    Then CA user select close button

    Examples:
      | pin   |
      | 12345 |

  @android-test @wallet
  Scenario Outline: EFT from another bank account
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    When CA user select manage sources
    And CA user select EFT from another bank account option
    And CA user select continue button
    Then CA user is on Wallet account details page
    Then CA user can see name label
    Then CA user can see account number label
    Then CA user can see bank name label
    Then CA user can see branch code label
    Then CA user can see reference label
    Then CA user select close button

    Examples:
      | pin   |
      | 12345 |

  @android-test @wallet
  Scenario Outline: Remove Account
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    And CA user select manage sources
    And CA user select delete
    Then CA user is on delete confirmation page
    And CA user select delete option
    Then CA user can see a delete confirmation page
    Then CA user select close button

    Examples:
      | pin   |
      | 12345 |