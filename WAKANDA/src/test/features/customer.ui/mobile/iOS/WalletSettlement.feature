#@customer-ios
#Feature: Wallet Settlement - As a Customer iOS (CI) user, I want be able to settle account
#
#  @ios-test @wallet
#  Scenario Outline: Settle Account with account already setup
#    Given CI user launch the customer ios app
#    Then CI user is on authentication page
#    #When CI user select on Use PIN link
#    When CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on dashboard page
#    When CI user select wallet menu
#    Then CI user is on my money page
#    Then CI user is able to see settlement tab
#    When CI user select settlement
#    Then CI user is on settlement page
#    When CI user enter amount "<amount>" as amount
#    And CI user select continue button
#    Then CI user is on authentication page
##    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    Then CI user can see a confirmation screen with settlement details
#    Then CI user select close button
#
#    Examples:
#      | pin   | amount |
#      | 12345 | 100    |
#
#  @ios-test @wallet
#  Scenario Outline: Settle funds to Nedbank account
#    Given CI user launch the customer ios app
#    Then CI user is on authentication page
#    #When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on dashboard page
#    When CI user select wallet menu
#    Then CI user is on my money page
#    Then CI user is able to see settlement tab
#    When CI user select settlement
#    Then CI user is on settlement page
#    When CI user select view other sources
#    And CI user select plus sign
#    And CI user select to a nedbank account option
#    Then CI user is on nedbank login page
#    When CI user enter Nedbank id username "<Nedbank ID username>" and password "<Nedbank ID password>"
#    And CI user select verify button
#    And CI user select account for payment
#    And CI user select add account
#    Then CI user can see verification page is displayed
#    When CI user select settle now button
#    When CI user enter amount "<amount>" as amount
#    And CI user select continue button
#    Then CI user is on authentication page
##    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    Then CI user can see a confirmation screen with settlement details
#    Then CI user select close button
#
#    Examples:
#      | pin   | amount | Nedbank ID username | Nedbank ID password |
#      | 12345 | 100    | test                | password            |
#
#  @ios-test @wallet
#  Scenario Outline: Settle funds to outside bank account
#    Given CI user launch the customer ios app
#    Then CI user is on authentication page
#    #When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on dashboard page
#    When CI user select wallet menu
#    Then CI user is on my money page
#    Then CI user is able to see settlement tab
#    When CI user select settlement
#    Then CI user is on settlement page
#    When CI user select view other sources
#    And CI user select plus sign
#    And CI user select other bank option
#    When CI user select bank name
#    And CI user enter account number "<account number>" as account number
#    And CI user enter account holder name "<account holder name>" as account holder name
#    And CI user select account for payment type
#    And CI user enter reference "<reference>"
#    And CI user select save button
#    Then CI user can see verification page is displayed
#    When CI user select settle now button
#    When CI user enter amount "<amount>" as amount
#    And CI user select continue button
#    Then CI user is on authentication page
##    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    Then CI user can see a confirmation screen with settlement details
#    Then CI user select close button
#
#    Examples:
#      | pin   | amount | account number | account holder name | reference |
#      | 12345 | 100    | 1234567890     | accountholdername   | reference |