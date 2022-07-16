@merchant-ios
Feature: As a Merchant PWA (MP) user, I want to be able to make a payment to another (Wakanda or non-Wakanda) MI user

  @Test
  Scenario Outline:	Payment to Wakanda MI user
    Given MI user launches merchant app
    Then wallet is visible
    Then MI user clicks wallet
    When MP user select Pay
    Then MP search recipient page is displayed
#   Then back icon is visible
    When MP user enter name "<name>" as recipient name
    #Then recipient "<name>" is visible with initials and images
    When MP user enter phone number "<phone number>" as phone number
    #Then phone number "<phone number" is visible with initials and images
    When MP user select recipient
    And MP user enter amount "<amount>" as amount
    And MP user enter description "<description>" as description
    And MP user clicks continue button

#    Then oTP screen is displayed with finger print link
#    And MP user enter OTP
#    And MP user click confirm button
#    Then confirmation screen is displayed with success message
#    Then payments details are shared successfully

    Examples:
      | name| phone number |amount|description|
      | Peter | 0123456789 |50   |Project_Name|

  @pwa-test
  Scenario Outline: Payment to Wakanda MP user
    Given MP user launch the Merchant app
    Then MP user can see Use PIN link
    When MP user select on Use PIN link
    And MP user enter pin "<pin>" as PIN
    When MP user select on confirm button
    Then MP user can see wallet balance
    When MP user clicks on my money
    When MP user select Pay
    Then search recipient page is displayed
    Then back icon is visible
    When MP user enter name "<name>" as recipient name
    Then recipient "<name>" is visible with initials and images
    When MP user enter phone number "<phone number>" as phone number
    Then phone number "<phone number" is visible with initials and images
    When MP user select recipient
    And MP user enter amount "<amount>" as amount
    And MP user enter description "<description>" as description
    And MP user clicks continue button
    Then MP user can see authentication screen
    When MP user select on Use PIN link
    And MP user enter pin "<pin>" as PIN
    When MP user select on confirm button
    Then success message is displayed
    Then payments details are shared successfully

    Examples:
      | name| phone number |amount|description|pin|
      | Peter | 0123456789 |50   |Project_Name|12345|

  @pwa-test
  Scenario Outline: Payment to a non-Wakanda user
    Given MP user launch the Merchant app
    Then MP user can see Use PIN link
    When MP user select on Use PIN link
    And MP user enter pin "<pin>" as PIN
    When MP user select on confirm button
    Then MP user can see wallet balance
    When MP user clicks on my money
    When MP user select Pay
    Then search recipient page is displayed
    Then back icon is visible
    When MP user enter name "<name>" as recipient name
    Then recipient "<name>" is visible with initials and images
    When MP user enter phone number "<phone number>" as phone number
    Then No match is found
    And MP user clicks continue button
    When MP user select recipient
    And MP user enter amount "<amount>" as amount
    And MP user enter description "<description>" as description
    Then This MP user doesn’t have a Wakanda Wallet text is visible
    And MP user clicks continue button
    Then MP user can see authentication screen
    When MP user select on Use PIN link
    And MP user enter pin "<pin>" as PIN
    When MP user select on confirm button
    Then success message is displayed
    Then payments details are shared successfully

    Examples:
      | name| phone number |amount|description|pin|
      | Peter | 0123456789 |50   |Project_Name|12345|

  @pwa-test
  Scenario: Payment based on a request from another Wakanda user
    #We need steps as it is not clearly specified
    Given MP user launches Merchant App
    When MP user clicks on my money option
    Then MP user is able to see requests
    And MP user clicks on request
    Then MP user is able to view request details about the payment
    And MP user clicks continue button
    Then MP user can see authentication screen
    When MP user select on Use PIN link
    And MP user enter pin "<pin>" as PIN
    When MP user select on confirm button
    Then success message is displayed
    Then payments details are shared successfully

  @pwa-test
  Scenario: Payment using payment link received from another Wakanda user(Merchant) with app installed
  #We need steps as it is not clearly specified but dont think this can be automated because link keeps changing#

  @pwa-test
  Scenario: Payment using payment link received from another Wakanda user(Merchant) without app installed
  #We need steps as it is not clearly specified - please show us wireframes with flows#

  @pwa-test
   Scenario : Refund payment (merchant to customer)
   #We need steps as it is not clearly specified - please show us wireframes with flows#