@merchant-ios
Feature: Wallet Statements - As a Merchant IOS (MI) user,  I want to be able to view my available balance, recent transactions and be able to perform basic actions like Request wallets payments / Pay to wallet / View statement / Settle to pre-configured bank accounts / Withdraw (from ATM) and Top Up wallet from pre-configured bank account/s.

  @ios-test
  Scenario Outline: No transactions made yet
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my money page
    And MI user can see the no transactions yet message

    Examples:
      | pin |
      |     |
  @ios-test
  Scenario Outline: Transactions have been made
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my money page
    And MI user can see a list of transaction made

    Examples:
      | pin |
      |     |

  @ios-test
  Scenario Outline: Downloading transaction statement
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my money page
    And MI user can see a list of transaction made
    Then MI user can see download floating button
    When MI user select download floating button
    And MI user select statement download format "<download format>"
    And MI user select download button
    Then MI user can see download successful message

    Examples:
      | pin | download format |
      |     |                 |

  @ios-test
  Scenario Outline: Share transaction statement
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my money page
    And MI user can see a list of transaction made
    Then MI user can see share floating button
    When MI user select share floating button
    Then MI user can see all the sharing options
    When MI user select a sharing option "<sharing option>"
    And MI user select share button
    Then MI user can see shared successfully message

    Examples:
      | pin | sharing option |
      |     |                |

  @ios-test
  Scenario Outline: Filter statement by date
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my money page
    And MI user can see a list of transaction made
    And MI user select start date "<start date>"
    And MI user select start date "<end date>"
    And MI user select apply filter button
    Then MI user can see download floating button
    When MI user select download floating button
    And MI user select statement download format "<download format>"
    And MI user select download button

    Examples:
      | pin | start date | end date | download format |
      |     |            |          |                 |

  @ios-test
  Scenario Outline: View transaction details
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my money page
    And MI user can see a list of transaction made
    When MI user select a wallet transaction "<transaction>" from result list
    Then MI user is on transaction details page
    Then MI user can see download floating button
    Then MI user can see share floating button

    Examples:
      | pin | transaction |
      |     |             |