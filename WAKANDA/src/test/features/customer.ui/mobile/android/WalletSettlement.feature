@customer-android
Feature: Wallet Settlement - As a Customer Android(CA) user, I want be able to settle account

  @android-test @wallet
  Scenario Outline: Settle Account with account already setup
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see settlement button
    When CA user select settlement button
    Then CA user is on settlement page
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user is on authentication page
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation screen with settlement details
    Then CA user select close button

    Examples:
      | pin   | amount |
      | 12345 | 100    |

  @android-test @wallet
  Scenario Outline: Settle funds to Nedbank account
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see settlement button
    When CA user select settlement button
    Then CA user is on settlement page
    When CA user select view other sources
    And CA user select plus sign
    And CA user select to a nedbank account option
    Then CA user is on nedbank login page
    When CA user enter Nedbank id username "<Nedbank ID username>" and password "<Nedbank ID password>"
    And CA user select verify button
    And CA user select account for payment
    And CA user select add account
    Then CA user can see verification page is displayed
    When CA user select settle now button
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user is on authentication page
#    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation screen with settlement details
    Then CA user select close button

    Examples:
      | pin   | amount | Nedbank ID username | Nedbank ID password |
      | 12345 | 100    | test                | password            |

  @android-test @wallet
  Scenario Outline: Settle funds to outside bank account
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see settlement button
    When CA user select settlement button
    Then CA user is on settlement page
    When CA user select view other sources
    And CA user select plus sign
    And CA user select other bank option
    When CA user select bank name
    And CA user enter account number "<account number>" as account number
    And CA user enter account holder name "<account holder name>" as account holder name
    And CA user select account for payment type
    And CA user enter reference "<reference>"
    And CA user select save button
    Then CA user can see verification page is displayed
    When CA user select settle now button
    When CA user enter amount "<amount>" as amount
    And CA user select continue button
    Then CA user is on authentication page
#    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    Then CA user can see a confirmation screen with settlement details
    Then CA user select close button

    Examples:
      | pin   | amount | account number | account holder name | reference |
      | 12345 | 100    | 1234567890     | accountholdername   | reference |