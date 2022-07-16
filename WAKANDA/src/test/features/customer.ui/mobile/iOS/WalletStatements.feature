@customer-ios
Feature: Wallet Statements - As a Customer IOS (CI) user,  I want to be able to view my available balance, recent transactions and be able to perform basic actions like Request wallets payments / Pay to wallet / View statement / Settle to pre-configured bank accounts / Withdraw (from ATM) and Top Up wallet from pre-configured bank account/s.

  @ios-test @wallet
  Scenario: No transactions made yet
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select my money menu
    Then CI user is on my money page
    And CI user can see the no transactions yet message

  @ios-test @wallet
  Scenario: Transactions have been made
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see a list of transaction made


  @ios-test @wallet
  Scenario Outline: Downloading transaction statement
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see a list of transaction made
    Then CI user can see download floating button
    When CI user select download floating button
    And CI user select statement download format "<download format>"
    And CI user select download button
    Then CI user can see download successful message

    Examples:
      | download format |
      |                 |

  @ios-test @wallet
  Scenario Outline: Share transaction statement
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see a list of transaction made
    Then CI user can see share floating button
    When CI user select share floating button
    Then CI user can see all the sharing options
    When CI user select a sharing option "<sharing option>"
    And CI user select share button
    Then CI user can see shared successfully message

    Examples:
      | sharing option |
      |                |

  @ios-test @wallet
  Scenario Outline: Filter statement by date
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see a list of transaction made
    When CI user select wallet statement filter button
    When CI user filter statement by date "<filter by>"
    And CI user enter received from name "<received from>"
    And CI user enter sent to name "<sent to>"
    And CI user select view statement button
    Then CI user is on wallet statement page

    Examples:
      | filter by | received from | sent to | download format |
      |           |               |         |                 |

  @ios-test @wallet
  Scenario Outline: Filter statement by advanced filters
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see a list of transaction made
    When CI user select wallet statement filter button
    When CI user filter statement by advanced filter "<filter by>"
    And CI user enter received from name "<received from>"
    And CI user enter sent to name "<sent to>"
    And CI user select view statement button
    Then CI user is on wallet statement page

    Examples:
      | filter by | received from | sent to | download format |
      |           |               |         |                 |

  @ios-test @wallet
  Scenario Outline: View transaction details
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see a list of transaction made
    When CI user select a wallet transaction "<transaction>" from result list
    Then CI user is on transaction details page
    Then CI user can see download floating button
    Then CI user can see share floating button

    Examples:
      | transaction |
      |             |