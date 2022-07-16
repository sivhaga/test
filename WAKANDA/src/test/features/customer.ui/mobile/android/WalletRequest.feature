@customer-android
Feature:As a Customer Android (CA) user, I want be able to receive funds to my wallet by sending a request, showing QR code or sharing a link.

  @android-test @wallet
  Scenario Outline: Make a payment request to a Wakanda user
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is on my money page
    When CA user select wallet accept button
    Then CA user is on wallet request page
    And CA user can see download qr label
    When CA user select request money button
    When CA user enter payment amount "<amount>" to request
    And CA user enter recipient name "<recipient>"
    And CA user enter payment request description "<description>"
    And CA user enter payment request reference "<reference>"
    And CA user select set reminder toggle
    And CA user select continue button
    Then CA user is on request from page
    When CA user search for a recipient "<recipient search>"
    And CA user select recipient "<recipient search>" from search result
    Then CA user is on payment request confirmation page
    And CA user can see payment link generated label
    And CA user can see requested amount "<amount>"
    When CA user select close button
    Then CA user is on my money page

    Examples:
      | pin   | amount | recipient | description | reference | recipient search |
      | 12345 |        |           |             |           |                  |

  @android-test @wallet
  Scenario Outline: Make a payment request to a non-Wakanda user
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    When CA user select wallet accept button
    Then CA user is on wallet request page
    And CA user can see download qr label
    When CA user select request money button
    Then CA user is on payment request page
    When CA user enter payment amount "<amount>" to request
    And CA user enter recipient name "<recipient>"
    And CA user enter payment request description "<description>"
    And CA user enter payment request reference "<reference>"
    And CA user select set reminder toggle
    And CA user select continue button
    Then CA user is on payment request confirmation page
    When CA user select create payment link
    Then CA user is on payment request confirmation page
    And CA user can see payment link generated label
    And CA user can see requested amount "<amount>"
    When CA user select close button
    Then CA user is on my money page

    Examples:
      | pin   | amount | recipient | description | reference |
      | 12345 |        |           |             |           |


  @android-test @wallet
  Scenario Outline: Money being requested from people outside of the user's phone contact book
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    When CA user select wallet accept button
    Then CA user is on wallet request page
    And CA user can see download qr label
    When CA user select request money button
    Then CA user is on payment request page
    When CA user search for a recipient "<recipient search>"
    Then CA user can no matches found label
    And CA user can see continue to request button
    When CA user select continue to request button
    When CA user enter payment amount "<amount>" to request
    And CA user enter recipient name "<recipient>"
    And CA user enter payment request description "<description>"
    And CA user enter payment request reference "<reference>"
    And CA user select set reminder toggle
    And CA user select continue button
    Then CA user is on payment request confirmation page
    Then CA user is on payment request confirmation page
    And CA user can see payment link generated label
    And CA user can see requested amount "<amount>"
    When CA user select close button
    Then CA user is on my money page


    Examples:
      | pin   | recipient search | amount | recipient | description | reference |
      | 12345 |                  |        |           |             |           |
