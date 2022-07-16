@merchant-MI
Feature: Refund Payment - As a Merchant ios(MI) user, I want to be able to make a refund

   @ios-test-THIS-IS-NOT-YET-DEVELOPED
   Scenario Outline: Refund payment merchant to customer based payment received
     Given MI user launch the merchant ios app
     Then MI user is on authentication page
     #When MI user select on Use PIN link
     When MI user enter pin "<pin>" to authenticate
     When MI user select on confirm button
     Then MI user is on dashboard page
     When MI user select on my money
     Then MI user is on my wallet page
     When MI user select incoming
     And MI user select job
     And MI user select on refund button
     Then MI user is on initiate refund page
     When MI user enter amount "<amount>" to refund
     And MI user select on refund button
     Then MI user can see refund success message
    #When MI user select close button
    #Then MI user is on my wallet page

     Examples:
     |pin|amount|
     |12345|30  |

  @ios-test-THIS-IS-NOT-YET-DEVELOPED
  Scenario Outline: Refund payment merchant to customer based completed job
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select my past projects
    Then MI user is on my project page
    When MI user select completed
    Then MI user can see completed projects
    When MI user select on completed project
    And MI user select on initiate refund button
    Then MI user is on initiate refund page
    When MI user enter amount "<amount>" to refund
    And MI user select on refund button
    Then MI user can see refund success message
    #When MI user select close button
    #Then MI user is on my wallet page

    Examples:
      |pin|amount|
      |12345|30  |


