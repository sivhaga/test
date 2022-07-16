@customer-ios
Feature: Wallet pay - As a Customer IOS (CI) user, I want to be able to make a payment to another (Wakanda or non-Wakanda) user.

  @ios-test @wallet
  Scenario Outline: Make a payment to a Wakanda user
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see wallet pay button
    When CI user select wallet pay button
    Then CI user is on wallet pay page
    When CI user search for a recipient "<recipient search>"
    And CI user select recipient "<recipient search>" from search result
    Then CI user can see enter amount to pay label
    And CI user can see enter description label
    When CI user enter amount "<amount>" to pay
    And CI user enter description "<description>" of payment
    Then CI user can see MobiMoney balance text
    And CI user can see MobiMoney wallet balance
    When CI user select continue button
    And CI user select continue button
    And CI user enter pin "<pin>" to authenticate
    And CI user select confirm button
    Then CI user is on payment confirmation page
    And CI user can see pay success label
    And CI user can see amount paid "<amount>"
    And CI user can see payment transaction details
    And CI user can see share payment details button
    And CI user can see close button
    When CI user select close button
    Then CI user is on dashboard page

    Examples:
      | pin   | recipient search | amount | description    |
      | 12345 | Anna             | 1000   | wallet payment |

  @ios-test @wallet
  Scenario Outline: Make a payment to a non-Wakanda user
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    And CI user can see wallet pay button
    When CI user select wallet pay button
    Then CI user is on wallet pay page
    When CI user search for a recipient "<recipient search>"
#    And CI user can see no results found label
    And CI user select wallet pay continue button
#    And CI user select recipient "<recipient search>" from search result
    Then CI user can see recipient details "<recipient search>"
    Then CI user can see enter amount to pay label
    When CI user enter amount "<amount>" to pay
    And CI user enter description "<description>" of payment
    Then CI user can see MobiMoney balance text
    And CI user can see MobiMoney wallet balance
    When CI user select continue button
    And CI user enter pin "<pin>" to authenticate
    And CI user select confirm button
    And CI user select continue button
    Then CI user is on payment confirmation page
    And CI user can see pay success label
    And CI user can see amount paid "<amount>"
    And CI user can see payment transaction details
    And CI user can see share payment details button
    And CI user can see close button

    Examples:
      | pin   | recipient search | amount | description    |
      | 12345 | 0731364585       | 1000   | wallet payment |

  @ios-test @wallet
  Scenario Outline: Make a payment for a job (customer to merchant)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user can see wallet pay button
    When CI user select wallet pay button
    Then CI user is on wallet pay page
    And CI user can see no results found label
    When CI user search for a recipient "<recipient search>"
    And CI user select recipient "<recipient search>" from search result
    Then CI user can see enter amount to pay label
    When CI user enter amount "<amount>" to pay
    Then CI user can see MobiMoney balance text
    And CI user can see MobiMoney wallet balance
    When CI user select wallet pay button
    Then CI user is on payment confirmation page
    And CI user can see pay success label
    And CI user can see payment transaction details
    And CI user can see share payment details button
    And CI user can see close button

    Examples:
      | recipient search | amount |
      |                  |        |

  @ios-test @wallet1
  Scenario Outline: Make a payment by scanning a QR code
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user can see wallet pay button
    When CI user select wallet pay button
    Then CI user is on wallet pay page
    When CI user search for a recipient "<recipient search>"
    And CI user select recipient "<recipient search>" from search result
    Then CI user can see enter amount to pay label
    When CI user enter amount "<amount>" to pay
    Then CI user can see MobiMoney balance text
    And CI user can see MobiMoney wallet balance
    When CI user select scan qr code button
    Then CI user is on payment confirmation page
    And CI user can see pay success label
    And CI user can see payment transaction details
    And CI user can see share payment details button
    And CI user can see close button

    Examples:
      | pin   | recipient search | amount |
      | 12345 |                  |        |

  @ios-test @wallet
  Scenario Outline: Make a payment based on a request from another Wakanda merchant user - confirm
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user can see request payment button
    When CI user select request payment button
    Then CI user can see request payment details
    And CI user can see confirm and pay button
    When CI user select confirm and pay button
    Then CI user is on payment confirmation page
    And CI user can see pay success label
    And CI user can see payment transaction details
    And CI user can see share payment details button
    And CI user can see close button

    Examples:
      | pin   |
      | 12345 |

  @ios-test @wallet
  Scenario Outline: Make a payment based on a request from another Wakanda merchant user - reject
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select wallet menu
    Then CI user is on my money page
    Then CI user can see request payment button
    When CI user select request payment button
    Then CI user can see request payment details
    And CI user can see reject button
    When CI user select reject button
    Then CI user is on reject payment request page

    Examples:
      | pin   |
      | 12345 |

  @ios-test @wallet
  Scenario Outline: Make a payment using payment link received from another Wakanda user (p2p)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select my money menu
    Then CI user can see request payment button
    When CI user select request payment button
    Then CI user can see request payment details
    And CI user can see confirm and pay button
    When CI user select confirm and pay button
    Then CI user is on payment confirmation page
    And CI user can see pay success label
    And CI user can see payment transaction details
    And CI user can see share payment details button
    And CI user can see close button

    Examples:
      | pin   |
      | 12345 |

  @ios-test @wallet
  Scenario Outline: Make refund payment (merchant to customer)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select my money menu
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on add money page
    When CI user select manage sources
    And CI user select EFT from another bank account option
    And CI user select continue button
    Then CI user is on Wallet account details page
    Then CI user can see name label
    Then CI user can see account number label
    Then CI user can see bank name label
    Then CI user can see branch code label
    Then CI user can see reference label
    Then CI user select close button

    Examples:
      | pin   |
      | 12345 |

  @ios-test @wallet
  Scenario Outline: Split payment between waka point and mobi wallet
    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user select my money menu
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on add money page
    When CI user select manage sources
    And CI user select EFT from another bank account option
    And CI user select continue button
    Then CI user is on Wallet account details page
    Then CI user can see name label
    Then CI user can see account number label
    Then CI user can see bank name label
    Then CI user can see branch code label
    Then CI user can see reference label
    Then CI user select close button

    Examples:
      | pin   |
      | 12345 |
