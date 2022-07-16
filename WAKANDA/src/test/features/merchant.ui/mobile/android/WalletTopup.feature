@merchant-android
Feature: Wallet top up - As a Merchant Android (MA) user, I want be able to top up my wallet via EFT transfer or bank card

  @android-test
  Scenario Outline: Top up with account already setup
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    #When MA user select on Use PIN link
    When MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see top up tab
    When MA user select top up
    Then MA user is on add money page
    When MA user enter amount "<amount>" as amount
    And MA user select continue button
#    Then MA user is on authentication page
#    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    Then MA user can see a confirmation screen with top up details
    When MA user select close button
    Then MA user is on dashboard page

    Examples:
      |pin|amount|
      |12345|100 |

  @android-test
  Scenario Outline: Top up without account setup
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see top up tab
    When MA user select top up
    Then MA user is on instantly add money screen
    And MA user select add Nedbank account option
    And MA user select continue
    Then MA user is on login page
    When MA user enter MA user id "<User id>" as MA user id
    And MA user enter password "<password>" as password
    And MA user select verify button
    And MA user select nedbank account
    And MA user select add account button
    Then MA user can see add confirmation page
    And MA user select top up my wallet
    When MA user enter amount "<amount>" as amount
    And MA user select account to pay from
    And MA user select continue button
    #Then MA user can see authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    And MI user select on confirm button
    Then MA user can see a confirmation page with top up details
    When MA user select close button
    Then MA user is on dashboard page

    Examples:
      |pin|User id|password|amount|
      |12345|Userid |password|100|

  @android-test
  Scenario Outline: Add Nedbank Account
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see top up tab
    When MA user select top up
    Then MA user is on add money page
    When MA user select manage sources
    And MA user select add Nedbank account option
    And MA user select continue button
    Then MA user is on login page
    When MA user enter MA user id "<User id>" as MA user id
    And MA user enter password "<password>" as password
    And MA user select submit button
    #And MA user select account
    And MA user select add account button
    Then MA user can see add confirmation page
    When MA user select close
    Then MA user is on dashboard page

    Examples:
      |pin|User id|password|
      | 12345 |test |password|


  @android-test
  Scenario Outline: Add cash via Nedbank ATM
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see top up tab
    When MA user select top up
    Then MA user is on add money page
    When MA user select manage sources
    And MA user select Add funds via ATM option
    Then MA user is able to see all instructions
    When MA user select close button
    Then MA user is on dashboard page


    Examples:
      |pin|
      | 12345 |


  @android-test
  Scenario Outline: EFT from another bank account
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see top up tab
    When MA user select top up
    Then MA user is on add money page
    When MA user select manage sources
    And MA user select EFT from another bank account option
    Then MA user is on Wallet account details page
    Then MA user can see name label
    Then MA user can see account number label
    Then MA user can see bank name label
    Then MA user can see branch code label
    Then MA user can see reference label
    When MA user select close button
    Then MA user is on dashboard page

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Remove Account
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see top up tab
    When MA user select top up
    Then MA user is on add money page
    And MA user select manage sources
    And MA user select delete
    Then MA user is on delete confirmation page
    And MA user select delete option
    Then MA user can see a delete confirmation page
    When MA user select close button
    Then MA user is on dashboard page

    Examples:
      |pin|
      |12345|