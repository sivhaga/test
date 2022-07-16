@merchant-ios
Feature:Wallet Request - As a Merchant IOS (MI) user, I want be able to receive funds to my wallet by sending a request, showing QR code or sharing a link.

  @Testing
  Scenario Outline: Display QR code
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    When MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    Then MI user is on my wallet page
    When MI user select wallet accept tab
    And MI user can see display qr button
    And MI user can see download qr label
    And MI user select download qr label
    When MI user enter payment amount "<amount>" to request under display qr
    And MI user select generate qr code button
    And MI user can see requested amount "<amount>"
    #When MI user select close button
    #Then MI user is on my wallet page

    Examples:
      | pin   | amount |
      | 12345 | 100   |


  @Test
  Scenario Outline: Make a payment request to a Wakanda user by creating a link
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    When MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    When MI user select wallet accept tab
    Then MI user is on accept money page
    When MI user select request money tab
    Then MI user is on request payment page
    When MI user enter payment amount "<amount>" to request under request money
    And MI user enter recipient name "<recipient>"
    And MI user enter payment request description "<description>"
    And MI user enter invoice "<invoice no>"
    #And MI user select set reminder toggle
    When MI user select continue button for wallet request
    Then MI user is on payment request from page
    And MI user can see create payment link label
    When MI user select create payment link label
    Then MI user is on payment request confirmation page
    And MI user can see payment link generated label
    Then MI user can see share link button
    #When MI user select close button
    #Then MI user is on my wallet page

    Examples:
      | pin   | amount | recipient | description   | invoice no |
      | 12345 | 10  | Thandiwe  | Work completed   | invoice no |

  @Test
  Scenario Outline: Make a payment request to Non Wakanda user by creating a link
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    When MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my money
    When MI user select wallet accept tab
    Then MI user is on accept money page
    When MI user select request money tab
    Then MI user is on request payment page
    When MI user enter payment amount "<amount>" to request under request money
    And MI user enter recipient name "<recipient>"
    And MI user enter payment request description "<description>"
    And MI user enter invoice "<invoice no>"
    #And MI user select set reminder toggle
    When MI user select continue button for wallet request
    Then MI user is on payment request from page
    When MI user enter name "<name>" as recipient name
    Then MI user can see recipient with initials and images
    When MI user enter phone number "<phone number>" as phone number
    When  MI user select recipient
    Then MI user is on request payment success page
    #When MI user select close button
    #Then MI user is on my wallet page

    Examples:
      | pin   | amount | recipient | description   | invoice no |name| phone number  |
      | 12345 | 10     | Thandiwe  | Work          | 324234324  |Kate Bell| 564-8583 |

