@customer-ios
Feature:As a Customer IOS (CI) user, I want be able to receive funds to my wallet by sending a request, showing QR code or sharing a link.

  @ios-test @wallet1
  Scenario Outline: Display QR code
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    When CI user can select wallet accept button
    Then CI user is on accept money page
    And CI user can see display qr button
    And CI user can see download qr label
    When CI user enter payment amount "<amount>" to request
    And CI user select download qr label
    And CI user select generate qr code button
    Then CI user is on accept money page
    And CI user can see requested amount "<amount>"
    When CI user select close button
    Then CI user is on dashboard page

    Examples:
      | pin   | amount |
      | 12345 | 1000   |


  @ios-test @wallet1
  Scenario Outline: Make a payment request to a Wakanda user
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    When CI user can select wallet accept button
    Then CI user is on accept money page
    And CI user can see display qr button
    And CI user can see request money button
    And CI user can see download qr label
    When CI user select request money button
    Then CI user is on payment request page
    When CI user enter payment amount "<amount>" to request
    And CI user enter recipient name "<recipient>"
    And CI user enter payment request description "<description>"
    And CI user enter payment request reference "<reference>"
    And CI user select set reminder toggle
    And CI user select continue button
    Then CI user is on payment request from page
    And CI user can see create payment link label
    When CI user select create payment link label
    Then CI user is on payment request confirmation page
    And CI user can see payment link generated label
    And CI user can see share link button
    And CI user can see continue shopping button
    Then CI user is on dashboard page

    Examples:
      | pin   | amount | recipient | description | reference |
      | 12345 | 1000   | Thandiwe  | Thandiwe    | 101       |

  @ios-test @wallet
  Scenario Outline: Make a payment request to a non-Wakanda user
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user can wallet request button
    When CI user select wallet request button
    Then CI user is on wallet request page
    And CI user can see download qr label
    When CI user select request money tab
    Then CI user is on payment request page
    When CI user enter payment amount "<amount>" to request
    And CI user enter recipient name "<recipient>"
    And CI user enter payment request description "<description>"
    And CI user enter payment request reference "<reference>"
    And CI user select set reminder toggle
    And CI user select continue button
    Then CI user is on payment request confirmation page
    And CI user can see request sent label
    And CI user can see requested amount "<amount>"
    When CI user select close button
    Then CI user can wallet request button

    Examples:
      | pin   | amount | recipient | description | reference |
      | 12345 |        |           |             |           |


  @ios-test @wallet
  Scenario Outline: Money being requested from people outside of the user's phone contact book
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user can wallet request button
    When CI user select wallet request button
    Then CI user is on wallet request page
    And CI user can see download qr label
    When CI user select request money tab
    Then CI user is on payment request page
    When CI user search for a recipient "<recipient search>"
    Then CI user can no matches found label
    And CI user can see continue to request button
    When CI user select continue to request button
    When CI user enter payment amount "<amount>" to request
    And CI user enter recipient name "<recipient>"
    And CI user enter payment request description "<description>"
    And CI user enter payment request reference "<reference>"
    And CI user select set reminder toggle
    And CI user select continue button
    Then CI user is on payment request confirmation page
    And CI user can see request sent label
    And CI user can see requested amount "<amount>"
    When CI user select close button
    Then CI user can wallet request button


    Examples:
      | pin   | recipient search | amount | recipient | description | reference |
      | 12345 |                  |        |           |             |           |
