@merchant-ios
Feature: Wallet Top Up - As a Merchant ios (MA) user, I want be able to top up my wallet via EFT transfer or bank card

  @ios-test
  Scenario Outline: Top up with account already setup
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    When MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see top up tab
    When MI user select top up
    Then MI user is on add money page
    When MI user enter amount "<amount>" as amount
    And MI user select continue button
#    Then MI user is on authentication page
#    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    Then MI user can see a confirmation page with top up details
    Then MI user select close button
    Then MI user is on my wallet page

    Examples:
      |pin|amount|
      |12345|100 |

  @Need-NedID
  Scenario Outline: Top up without account setup
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    And MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see top up tab
    When MI user select top up
    Then MI user is on instantly add money screen
    And MI user select add Nedbank account option
    Then MI user is on login page
    When MI user enter MI user id "<User id>" as MI user id
    And MI user enter password "<password>" as password
    And MI user select verify button
    And MI user select nedbank account
    And MI user select add account button
    Then MI user is on add confirmation page
    And MI user select top up my wallet
    When MI user enter amount "<amount>" as amount
    And MI user select account to pay from
    And MI user select continue button
    #Then MI user can see authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    And MI user select on confirm button
    Then MI user can see a confirmation page with top up details
    Then MI user select close button
    Then MI user is on my wallet page

    Examples:
      |pin|User id|password|amount|
      |12345|Userid |password|100|

  @Need-NedID
  Scenario Outline: Add Nedbank Account
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    And MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see top up tab
    When MI user select top up
    Then MI user is on instantly add money screen
    And MI user select add Nedbank account option
    Then MI user is on login page
    When MI user enter MI user id "<User id>" as MI user id
    And MI user enter password "<password>" as password
    And MI user select verify button
    And MI user select nedbank account
    And MI user select add account button
    Then MI user is on add confirmation page
    Then MI user select close button


    Examples:
      |pin|User id|password|
      | 12345 |test |password|


  @ios-test
  Scenario Outline: Add cash via Nedbank ATM
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see top up tab
    When MI user select top up
    Then MI user is on instantly add money screen
    And MI user select Add funds via ATM option
    Then MI user is able to see all instructions
    Then MI user select close button


    Examples:
      |pin|
      | 12345 |


  @Test
  Scenario Outline: EFT from another bank account
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see top up tab
    When MI user select top up
    Then MI user is on instantly add money screen
    And MI user select EFT from another bank account option
    Then MI user can see name label
    Then MI user can see account number label
    Then MI user can see bank name label
    Then MI user can see branch code label
    Then MI user can see reference label
    #Then MI user select close button
    #Then MI user is on my wallet page

    Examples:
      |pin|
      | 12345 |

  @Not-yet-developed
  Scenario Outline: Remove Account
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see top up tab
    When MI user select top up
    Then MI user is on add money page
    And MI user select manage sources
    And MI user select delete
    Then MI user is on delete confirmation page
    And MI user select delete option
    Then MI user can see a delete confirmation page
    Then MI user select close button
    Then MI user is on my wallet page

    Examples:
      |pin|
      |12345|