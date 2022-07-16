@iosTest
Feature: Login Feature

    Scenario Outline: Successful Login to Merchant Application using PIN
      Given user launch the Merchant app
      Then user can see Use PIN link
      When user select on Use PIN link
      And user enter pin "<pin>" as PIN
      When user select on confirm button
      Then user is able to see wallet balance

      Examples:
        | pin |
        |12345|

    Scenario: Successfully login on Merchant app using finger print
      Given user launch the Merchant app
      Then user can see Fingerprint Authentication text
      When user scan the finger
      Then user is able to see wallet balance

    Scenario Outline: Unsuccessfully login on Merchant app using incorrect PIN
      Given user launch the Merchant app
      Then user can see Use PIN link
      When user select on Use PIN link
      And user enter pin "<pin>" as PIN
      When user select on confirm button
      Then Appropriate error is displayed

      Examples:
      | pin |
      |12345|

