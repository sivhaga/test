@customer-android
Feature: Wallet Statements - As a Customer Android (CA) user,  I want to be able to view my available balance, recent transactions and be able to perform basic actions like Request wallets payments / Pay to wallet / View statement / Settle to pre-configured bank accounts / Withdraw (from ATM) and Top Up wallet from pre-configured bank account/s.

  @android-test @wallet
  Scenario Outline: No transactions made yet
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    And CA user can see the no transactions yet message

    Examples:
      | pin   |
      | 12345 |

  @android-test @wallet
  Scenario Outline: Transactions have been made
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    And CA user can see a list of transaction made

    Examples:
      | pin   |
      | 12345 |

  @android-test1 @wallet
  Scenario Outline: Downloading transaction statement
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    And CA user can see a list of transaction made
    Then CA user can see download floating button
    When CA user select download floating button
    And CA user select statement download format "<download format>"
    And CA user select download button
    Then CA user can see download successful message

    Examples:
      | pin   | download format |
      | 12345 | pdf             |

  @android-test @wallet
  Scenario Outline: Share transaction statement
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    And CA user can see a list of transaction made
    Then CA user can see share floating button
    When CA user select share floating button
    Then CA user can see all the sharing options
    When CA user select a sharing option "<sharing option>"
    And CA user select share button
    Then CA user can see shared successfully message

    Examples:
      | pin   | sharing option |
      | 12345 | email          |

  @android-test @wallet
  Scenario Outline: Filter statement by date
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    And CA user can see a list of transaction made
    And CA user select start date "<start date>"
    And CA user select start date "<end date>"
    And CA user select apply filter button
    Then CA user can see download floating button
    When CA user select download floating button
    And CA user select statement download format "<download format>"
    And CA user select download button

    Examples:
      | pin   | start date | end date | download format |
      | 12345 |            |          |                 |

  @android-test @wallet
  Scenario Outline: View transaction details
    Given CA user launch the customer android app
#
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    And CA user can see a list of transaction made
    When CA user select a wallet transaction from result list
    Then CA user is on transaction details page
    Then CA user can see download floating button
    Then CA user can see share floating button

    Examples:
      | pin   | transaction |
      | 12345 |             |