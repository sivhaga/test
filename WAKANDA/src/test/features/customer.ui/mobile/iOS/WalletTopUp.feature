@customer-ios
Feature: Wallet top up - As a Customer iOS (CI) user, I want be able to top up my wallet via EFT transfer or bank card

  @ios-test @wallet
  Scenario Outline: Top up with account already setup
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on wallet top up page
    Then CI user is on add money page
    When CI user enter amount "<amount>" as amount
    And CI user select continue button
    And CI user enter pin "<pin>" to authenticate
    When CI user select confirm button
    Then CI user can see a confirmation screen with top up details
    Then CI user select close button

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @ios-test @wallet
  Scenario Outline: Top up without account setup
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on wallet top up page
    And CI user select add Nedbank account option
    Then CI user is on nedbank login page
    When CI user enter CI user id "<User id>" as CI user id
    And CI user enter password "<password>" as password
    And CI user select verify button
     #And CI user select account - in case CI user has multiple account
    And CI user select add account button
    Then CI user can see add confirmation page
    And CI user select top up my wallet
    When CI user enter amount "<amount>" as amount
    And CI user select account to pay from
    And CI user select continue button
    #Then CI user can see authentication page
    #When CI user select on Use PIN link
    And CI user enter pin "<pin>" to authenticate
    When CI user select confirm button
    Then CI user can see a confirmation page with top up details
    Then CI user select close button

    Examples:
      | pin   | User id | password | amount |
      | 12345 | Userid  | password | 100    |

  @ios-test @wallet
  Scenario Outline: Add Nedbank Account
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on wallet top up page
    And CI user select add Nedbank account option
    Then CI user is on nedbank id login page
    When CI user enter CI user id "<User id>" as CI user id
    And CI user enter password "<password>" as password
    And CI user select verify button
    #And CI user select account - in case CI user has multiple account
    And CI user select add account button
    Then CI user can see add confirmation page
    Then CI user select close button

    Examples:
      | pin   | User id | password |
      | 12345 | test    | password |


  @ios-test @wallet
  Scenario Outline: Add funds via ATM
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on wallet top up page
    When CI user select add cash via atm menu
    Then CI user is on add funds via atm page
    When CI user select use atm locator button
    Then CI user is on atm locator page

    Examples:
      | pin   |
      | 12345 |


  @ios-test @wallet
  Scenario Outline: EFT from another bank account
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on wallet top up page
    And CI user select EFT from another bank account option
    Then CI user is on Wallet account details page
#    Then CI user can see name label
#    Then CI user can see account number label
#    Then CI user can see bank name label
#    Then CI user can see branch code label
#    Then CI user can see reference label
    When CI user select close button
    Then CI user is on wallet pay page

    Examples:
      | pin   |
      | 12345 |

  @ios-test @wallet
  Scenario Outline: Remove Account
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on add money page
    And CI user select manage sources
    And CI user select delete
    Then CI user is on delete confirmation page
    And CI user select delete option
    Then CI user can see a delete confirmation page
    Then CI user select close button

    Examples:
      | pin   |
      | 12345 |