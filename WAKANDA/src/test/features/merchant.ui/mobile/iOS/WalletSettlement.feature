@merchant-ios
Feature: Wallet Settlement - As a Merchant ios(MA) user, I want be able to settle account

  @Not-yet-developed
  Scenario Outline: Settle Account with account already setup
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    When MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see settlement tab
    When MI user select settlement
    Then MI user is on settlement page
    When MI user enter amount "<amount>" as amount
    And MI user select continue button
    Then MI user is on authentication page
#    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    Then MI user can see a confirmation screen with settlement details
    Then MI user select close
    Then MI user is on my wallet page

    Examples:
      |pin|amount|
      |12345|100 |

  @Not-yet-developed
  Scenario Outline: Settle funds to Nedbank account
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see settlement tab
    When MI user select settlement
    Then MI user is on settlement page
    When MI user select view other sources
    And MI user select plus sign
    And MI user select to a nedbank account option
    Then MI user is on nedbank login page
    When MI user enter Nedbank id username "<Nedbank ID username>" and password "<Nedbank ID password>"
    And MI user select verify button
    And MI user select account for payment
    And MI user select add account
    Then MI user can see verification page is displayed
    When MI user select settle now button
    When MI user enter amount "<amount>" as amount
    And MI user select continue button
    Then MI user is on authentication page
#    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    Then MI user can see a confirmation screen with settlement details
    Then MI user select close
    Then MI user is on my wallet page

    Examples:
      |pin|amount|Nedbank ID username|Nedbank ID password|
      | 12345 |100|test              |password           |

  @Not-yet-developed
  Scenario Outline: Settle funds to outside bank account
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see settlement tab
    When MI user select settlement
    Then MI user is on settlement page
    When MI user select view other sources
    And MI user select plus sign
    And MI user select other bank option
    When MI user select bank name
    And MI user enter account number "<account number>" as account number
    And MI user enter account holder name "<account holder name>" as account holder name
    And MI user select account for payment type
    And MI user enter reference "<reference>"
    And MI user select save button
    Then MI user can see verification page is displayed
    When MI user select settle now button
    When MI user enter amount "<amount>" as amount
    And MI user select continue button
    Then MI user is on authentication page
#    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    Then MI user can see a confirmation screen with settlement details
    Then MI user select close
    Then MI user is on my wallet page

    Examples:
      |pin|amount|account number|account holder name|reference|
      | 12345 |100|1234567890   |accountholdername|reference|