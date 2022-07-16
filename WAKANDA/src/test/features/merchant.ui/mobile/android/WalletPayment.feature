@merchant-android
Feature: Wallet Payment - As a Merchant android(MA) user, I want to be able to make a payment to another (Wakanda or non-Wakanda) MA user

  @Testkjhgkj
  Scenario Outline: Payment to Wakanda MA user
    Given MA user launch the merchant android app
    Then MA user can see Use PIN link
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    When MA user select pay tab
    #Then MA user is on search recipient page
    When MA user select search icon
    And MA user enter name "<name>" as recipient name
    #Then MA user can see recipient with initials and images
    #When MA user enter phone number "<phone number>" as phone number
    #Then MA user can see phone with initials and images
    When MA user select recipient
    And MA user enter amount "<amount>" as amount
    And MA user enter description "<description>"
    And MA user select continue button
    Then MI user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    When MA user select on confirm button
    Then MA user can see success message
    Then MA user is able to share payments details

    Examples:
      | name| phone number |amount|description|pin|
      | Peter | 0123456789 |50   |Project_Name|12345|

    # Then OTP screen is displayed with finger print link
    # And MA user enter OTP
    # And MA user click confirm button
    # Then confirmation screen is displayed with success message
    # Then payments details are shared successfully

  @android-test
  Scenario Outline: Payment to a non-Wakanda user
    Given MA user launch the merchant android app
    Then MA user can see Use PIN link
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    When MA user select pay tab
    Then MA user is on search recipient page
    When MA user enter name "<name>" as recipient name
    Then MA user can see recipient with initials and images
    When MA user enter phone number "<phone number>" as phone number
    Then MA user is able to see no match is found
    And MA user select continue button
    When MA user select recipient
    And MA user enter amount "<amount>" as amount
    And MA user enter description "<description>"
    Then MA user can see doesn’t have wakanda Wallet text
    And MA user select continue button
    Then MI user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    When MA user select on confirm button
    Then MA user can see success message
    Then MA user is able to share payments details 

    Examples:
      | name| phone number |amount|description|pin|
      | Peter | 0123456789 |50   |Project_Name|12345|

  @android-test
  Scenario: Payment based on a request from another Wakanda user
    #We need steps as not clearly specified
    Given MA user launch the merchant android app
    Then MA user can see Use PIN link
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money
    Then MA user is able to see requests
    And MA user select on request
    Then MA user is able to view request details about the payment
    And MA user select continue button
    Then MI user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate for transactions
    When MA user select on confirm button
    Then MA user can see success message
    Then MA user is able to share payments details 

  #Scenario: Payment using payment link received from another Wakanda user(Merchant) with app installed
  #We need steps as it is not clearly specified but dont think this can be automated because link keeps changing#


  #Scenario: Payment using payment link received from another Wakanda user(Merchant) without app installed
  #We need steps as it is not clearly specified - please show us wireframes with flows#


   #Scenario : Refund payment merchant to customer
   #We need steps as it is not clearly specified - please show us wireframes with flows#