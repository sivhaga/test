@merchant-android
Feature: Wallet Statements - As a merchant Android (MA) user,  I want to be able to view my available balance, recent transactions and be able to perform basic actions like Request wallets payments / Pay to wallet / View statement / Settle to pre-configured bank accounts / Withdraw (from ATM) and Top Up wallet from pre-configured bank account/s.

  @android-test
  Scenario Outline: No transactions made yet
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user is on my money page
    And MA user can see the no transactions yet message

    Examples:
      | pin |
      | 12345    |

  @android-test
  Scenario Outline: Transactions have been made
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user is on my money page
    And MA user can see a list of transaction made

    Examples:
      | pin |
      | 12345    |

  @android-test
  Scenario Outline: Downloading transaction statement
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user is on my money page
    And MA user can see a list of transaction made
    Then MA user can see download floating button
    When MA user select download floating button
    And MA user select statement download format "<download format>"
    And MA user select download button
    Then MA user can see download successful message

    Examples:
      | pin | download format |
      |  12345   |  pdf               |

  @android-test
  Scenario Outline: Share transaction statement
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user is on my money page
    And MA user can see a list of transaction made
    Then MA user can see share floating button
    When MA user select share floating button
    Then MA user can see all the sharing options
    When MA user select a sharing option "<sharing option>"
    And MA user select share button
    Then MA user can see shared successfully message

    Examples:
      | pin | sharing option |
      | 12345    |   email             |

  @android-test
  Scenario Outline: Filter statement by date
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user is on my money page
    And MA user can see a list of transaction made
    And MA user select start date "<start date>"
    And MA user select start date "<end date>"
    And MA user select apply filter button
    Then MA user can see download floating button
    When MA user select download floating button
    And MA user select statement download format "<download format>"
    And MA user select download button

    Examples:
      | pin | start date | end date | download format |
      |   12345  |            |          |                 |

  @android-test
  Scenario Outline: View transaction details
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user is on my money page
    And MA user can see a list of transaction made
    When MA user select a wallet transaction "<transaction>" from result list
    Then MA user is on transaction details page
    Then MA user can see download floating button
    Then MA user can see share floating button

    Examples:
      | pin | transaction |
      |   12345  |             |