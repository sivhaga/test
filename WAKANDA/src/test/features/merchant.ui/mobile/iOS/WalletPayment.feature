@merchant-MI
Feature: Wallet Payment - As a Merchant ios(MI) user, I want to be able to make a payment to another (Wakanda or non-Wakanda) MI user

  @Test
  Scenario Outline: Payment to Wakanda MI user
    Given MI user launch the merchant ios app
    #Then MI user can see Use PIN links
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my wallet page
    When MI user select pay tab
    Then MI user is on search recipient page
    When MI user select search icon
    And MI user enter name "<name>" as recipient name
    Then MI user can see recipient with initials and images
    When MI user enter phone number "<phone number>" as phone number
    Then MI user can see phone with initials and images
    When MI user select recipient
    #Then MI user is on payment page WE NEED ACCESSIBILITY ID
    And MI user enter amount "<amount>" as amount
    And MI user enter description "<description>"
    And MI user select continue button
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    When MI user select on confirm button
    Then MI user can see wallet success message
    #Then MI user is able to share payments details DEFECT SD-188
    #When MI user select close button DEFECT SD-122
    #Then MI user is on my wallet page

    Examples:
      | name     | phone number |amount|description|pin|
      | Kate Bell| 564-8583     |50   |Project_Name|12345|


  @Test
  Scenario Outline: Payment to a non-Wakanda user
    Given MI user launch the merchant ios app
    Then MI user can see Use PIN link
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    When MI user select pay tab
    Then MI user is on search recipient page
    When MI user enter name "<name>" as recipient name
    Then MI user can see recipient with initials and images
    When MI user enter phone number "<phone number>" as phone number
    Then MI user is able to see no match is found
    And MI user select continue button
    When MI user select recipient
    #Then MI user is on payment page WE NEED ACCESSIBILITY ID
    And MI user enter amount "<amount>" as amount
    And MI user enter description "<description>" as description
    #Then MI user can see doesn’t have wakanda Wallet text DEFECT SD-164
    And MI user select continue button
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    When MI user select on confirm button
    Then MI user can see wallet success message
    #Then MI user is able to share payments details DEFECT SD-188
    #When MI user select close button DEFECT SD-122
    #Then MI user is on my wallet page

    Examples:
      | name| phone number  |amount|description|pin|
      | Kate Bell| 564-8583 |50    |Project_Name|12345|

  @ios-test
  Scenario: Payment based on a request from another Wakanda user
    #We need steps as not clearly specified
    Given MI user launch the merchant ios app
    Then MI user can see Use PIN link
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is able to see requests
    And MI user select on request
    Then MI user is able to view request details about the payment
    And MI user select continue button
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate for transactions
    When MI user select on confirm button
    Then MI user can see wallet success message
    #Then MI user is able to share payments details
    #When MI user select close button
    #Then MI user is on my wallet page

  #Scenario: Payment using payment link received from another Wakanda user(Merchant) with app installed
  #We need steps as it is not clearly specified but dont think this can be automated because link keeps changing#


  #Scenario: Payment using payment link received from another Wakanda user(Merchant) without app installed
  #We need steps as it is not clearly specified - please show us wireframes with flows#

