@merchant-android
Feature: Wallet Request - As a merchant Android (MA) user, I want be able to receive funds to my wallet by sending a request, showing QR code or sharing a link.

  @android-test
  Scenario Outline: Make a payment request to a Wakanda user
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user can see wallet request button
    When MA user select wallet request button
    Then MA user is on wallet request page
    And MA user can see download qr label
    When MA user select request money tab
    Then MA user is on payment request page
    When MA user enter payment amount "<amount>" to request
    And MA user enter recipient name "<recipient>"
    And MA user enter payment request description "<description>"
    And MA user enter payment request reference "<reference>"
    And MA user select set reminder toggle
    And MA user select continue button
    Then MA user is on payment request confirmation page
    And MA user can see request sent label
    And MA user can see requested amount "<amount>"
    When MA user select close button
    Then MA user can wallet request button


    Examples:
      | pin   | amount | recipient | description | reference |
      | 12345 |        |           |             |           |

  @android-test
  Scenario Outline: Make a payment request to a non-Wakanda user
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user can see wallet request button
    When MA user select wallet request button
    Then MA user is on wallet request page
    And MA user can see download qr label
    When MA user select request money tab
    Then MA user is on payment request page
    When MA user enter payment amount "<amount>" to request
    And MA user enter recipient name "<recipient>"
    And MA user enter payment request description "<description>"
    And MA user enter payment request reference "<reference>"
    And MA user select set reminder toggle
    And MA user select continue button
    Then MA user is on payment request confirmation page
    And MA user can see request sent label
    And MA user can see requested amount "<amount>"
    When MA user select close button
    Then MA user can wallet request button


    Examples:
      | pin   | amount | recipient | description | reference |
      | 12345 |        |           |             |           |


  @android-test
  Scenario Outline: Money being requested from people outside of the user's phone contact book
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my money menu
    Then MA user can see wallet request button
    When MA user select wallet request button
    Then MA user is on wallet request page
    And MA user can see download qr label
    When MA user select request money tab
    Then MA user is on payment request page
    When MA user search for a recipient "<recipient search>"
    Then MA user can no matches found label
    And MA user can see continue to request button
    When MA user select continue to request button
    When MA user enter payment amount "<amount>" to request
    And MA user enter recipient name "<recipient>"
    And MA user enter payment request description "<description>"
    And MA user enter payment request reference "<reference>"
    And MA user select set reminder toggle
    And MA user select continue button
    Then MA user is on payment request confirmation page
    And MA user can see request sent label
    And MA user can see requested amount "<amount>"
    When MA user select close button
    Then MA user can wallet request button


    Examples:
      | pin   | recipient search | amount | recipient | description | reference |
      | 12345 |                  |        |           |             |           |
