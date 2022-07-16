@merchant-android
Feature: Wallet Settlement - As a Merchant Android(MA) user, I want be able to settle account

  @android-test
  Scenario Outline: Settle Account with account already setup
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    #When MA user select on Use PIN link
    When MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see settlement tab
    When MA user select settlement
    Then MA user is on settlement page
    When MA user enter amount "<amount>" as amount
    And MA user select continue button
    Then MA user is on authentication page
#    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    Then MA user can see a confirmation screen with settlement details
    Then MA user select close

    Examples:
      |pin|amount|
      |12345|100 |

  @android-test
  Scenario Outline: Settle funds to Nedbank account
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see settlement tab
    When MA user select settlement
    Then MA user is on settlement page
    When MA user select view other sources
    And MA user select plus sign
    And MA user select to a nedbank account option
    Then MA user is on nedbank login page
    When MA user enter Nedbank id username "<Nedbank ID username>" and password "<Nedbank ID password>"
    And MA user select verify button
    And MA user select account for payment
    And MA user select add account
    Then MA user can see verification page is displayed
    When MA user select settle now button
    When MA user enter amount "<amount>" as amount
    And MA user select continue button
    Then MA user is on authentication page
#    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    Then MA user can see a confirmation screen with settlement details
    Then MA user select close testklsdflksandklsadnklsa

    Examples:
      |pin|amount|Nedbank ID username|Nedbank ID password|
      | 12345 |100|test              |password           |

  @android-test
  Scenario Outline: Settle funds to outside bank account
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see settlement tab
    When MA user select settlement
    Then MA user is on settlement page
    When MA user select view other sources
    And MA user select plus sign
    And MA user select other bank option
    When MA user select bank name
    And MA user enter account number "<account number>" as account number
    And MA user enter account holder name "<account holder name>" as account holder name
    And MA user select account for payment type
    And MA user enter reference "<reference>"
    And MA user select save button
    Then MA user can see verification page is displayed
    When MA user select settle now button
    When MA user enter amount "<amount>" as amount
    And MA user select continue button
    Then MA user is on authentication page
#    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    Then MA user can see a confirmation screen with settlement details
    Then MA user select close

    Examples:
      |pin|amount|account number|account holder name|reference|
      | 12345 |100|1234567890   |accountholdername|reference|