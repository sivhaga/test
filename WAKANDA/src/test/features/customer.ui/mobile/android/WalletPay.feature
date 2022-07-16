@customer-android
Feature: Wallet pay - As a Customer Android (CA) user, I want to be able to make a payment to another (Wakanda or non-Wakanda) user.

  @android-test @wallet
  Scenario Outline: Make a payment to a Wakanda user
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user can see wallet pay button
    When CA user select wallet pay button
    Then CA user is on wallet pay page
    When CA user search for a recipient "<recipient search>"
    And CA user select recipient "<recipient search>" from search result
    Then CA user can see enter amount to pay label
    When CA user enter amount "<amount>" to pay
    Then CA user can see MobiMoney balance text
    And CA user can see MobiMoney wallet balance
    When CA user select pay button
    Then CA user is on payment confirmation page
    And CA user can see pay success label
    And CA user can see payment transaction details
    And CA user can see share payment details button
    And CA user can see close button


    Examples:
      | pin   | recipient search | amount |
      | 12345 |                  |        |

  @android-test @wallet
  Scenario Outline: Make a payment to a non-Wakanda user
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    Then CA user can see wallet pay button
    When CA user select wallet pay button
    Then CA user is on wallet pay page
    And CA user can see user is not a wakanda client label
    When CA user search for a recipient "<recipient search>"
    And CA user select recipient "<recipient search>" from search result
    Then CA user can see enter amount to pay label
    When CA user enter amount "<amount>" to pay
    Then CA user can see MobiMoney balance text
    And CA user can see MobiMoney wallet balance
    When CA user select pay button
    Then CA user is on payment confirmation page
    And CA user can see pay success label
    And CA user can see payment transaction details
    And CA user can see share payment details button
    And CA user can see close button

    Examples:
      | pin   | recipient search | amount |
      | 12345 |                  |        |

  @android-test @wallet
  Scenario Outline: Make a payment for a job (customer to merchant)
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    Then CA user can see wallet pay button
    When CA user select wallet pay button
    Then CA user is on wallet pay page
    And CA user can see user is not a wakanda client label
    When CA user search for a recipient "<recipient search>"
    And CA user select recipient "<recipient search>" from search result
    Then CA user can see enter amount to pay label
    When CA user enter amount "<amount>" to pay
    Then CA user can see MobiMoney balance text
    And CA user can see MobiMoney wallet balance
    When CA user select pay button
    Then CA user is on payment confirmation page
    And CA user can see pay success label
    And CA user can see payment transaction details
    And CA user can see share payment details button
    And CA user can see close button

    Examples:
      | pin   | recipient search | amount |
      | 12345 |                  |        |

  @android-test @wallet
  Scenario Outline: Make a payment by scanning a QR code
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    Then CA user can see wallet pay button
    When CA user select wallet pay button
    Then CA user is on wallet pay page
    When CA user search for a recipient "<recipient search>"
    And CA user select recipient "<recipient search>" from search result
    Then CA user can see enter amount to pay label
    When CA user enter amount "<amount>" to pay
    Then CA user can see MobiMoney balance text
    And CA user can see MobiMoney wallet balance
    When CA user select scan qr code button
    Then CA user is on payment confirmation page
    And CA user can see pay success label
    And CA user can see payment transaction details
    And CA user can see share payment details button
    And CA user can see close button


    Examples:
      | pin   | recipient search | amount |
      | 12345 |                  |        |

  @android-test @wallet
  Scenario Outline: Make a payment based on a request from another Wakanda merchant user - confirm
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    Then CA user can see request payment button
    When CA user select request payment button
    Then CA user can see request payment details
    And CA user can see confirm and pay button
    When CA user select confirm and pay button
    Then CA user is on payment confirmation page
    And CA user can see pay success label
    And CA user can see payment transaction details
    And CA user can see share payment details button
    And CA user can see close button

    Examples:
      | pin   |
      | 12345 |

  @android-test @wallet
  Scenario Outline: Make a payment based on a request from another Wakanda merchant user - reject
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my money menu
    Then CA user can see request payment button
    When CA user select request payment button
    Then CA user can see request payment details
    And CA user can see reject button
    When CA user select reject button
    Then CA user is on reject payment request page

    Examples:
      | pin   |
      | 12345 |

  @android-test @ios-test
  Scenario Outline: Make a payment using payment link received from another Wakanda user (p2p)
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user can see request payment button
    When CA user select request payment button
    Then CA user can see request payment details
    And CA user can see confirm and pay button
    When CA user select confirm and pay button
    Then CA user is on payment confirmation page
    And CA user can see pay success label
    And CA user can see payment transaction details
    And CA user can see share payment details button
    And CA user can see close button

    Examples:
      | pin   |
      | 12345 |

  @android-test @wallet
  Scenario Outline: Make refund payment (merchant to customer)
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select wallet menu
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    When CA user select manage sources
    And CA user select EFT from another bank account option
    And CA user select continue button
    Then CA user is on Wallet account details page
    Then CA user can see name label
    Then CA user can see account number label
    Then CA user can see bank name label
    Then CA user can see branch code label
    Then CA user can see reference label
    Then CA user select close button

    Examples:
      | pin   |
      | 12345 |

    # ussd pin - will pin be created on wallet for trusted wakanda user
    # wakanda user access wallet on untrusted third party consumers - takealot, etc
    # one number per id number per wallet



#  MobiMoney FICA lite limits
#
#  Daily outgoing payment limit of R4 000 per day
#  Maximum balance R24 000
#  MobiMoney Full FICA limits
#
#  Daily outgoing payment cumulative limit (MobiMoney backend inherited limits) of R20 000 per day covering
#  Payment to another bank account
#  Wallet to wallet transactions (P2P, P2M, M2M, M2P) including links, QR codes etc
#  Masterpass purchases
#  Transfer to customer own accounts limit R100 0000 (MobiMoney backend inherited limits)


