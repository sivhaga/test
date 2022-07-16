@customer-ios
Feature: On-boarding

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - invalid id number
    Given CI user launch the customer ios app
#    Then CI user is on dashboard page
#    And CI user can see sign up button
#    When CI user select sign up button
#    Then CI user is on sign up page
    Then CI user is on wakanda username page
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user can see invalid id number error message

    Examples:
      | south african id | cell phone number |
      | 9111225184080    | 0721264585        |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - invalid otp
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user can see invalid otp error message

    Examples:
      | south african id | cell phone number | otp   |
      | 9111225184080    | 0721264585        | 56789 |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - resend otp
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user select resend otp link
    Then CI user can receive newly generated otp
    When CI user enter old otp "<old otp>"
    And CI user select verify otp button
    Then CI user can see invalid otp error message
    When CI user enter otp "<new otp>" to verify mobile number
    And CI user select verify otp button
    Then CI user is on take a facial biometric page

    Examples:
      | south african id | cell phone number | old otp | new otp |
      |                  |                   |         |         |

  # NEW TO WAKANDA AND NEW TO NEDBANK

  @ios-test1 @on-boarding
  Scenario Outline: Username already taken
    Given CI user launch the customer ios app
    Then CI user is on wakanda username page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on personal details page
    When CI user enter first name "<first name>"
    And CI user enter last name "<last name>"
    #And CI user enter onboarding email "<email>"
    And CI user select occupation "<occupation>"
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter existing username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI can see username already taken error

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp   | username     | password   | confirm password |
      | 9111225184082    | 0617373770        | Bab        | Noka      | baba@gmail.com |            | 12345 | testUserName | Testing@01 | Testing@02       |

  @ios-test1 @on-boarding
  Scenario Outline: Password mismatch
    Given CI user launch the customer ios app
    Then CI user is on wakanda username page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on personal details page
    When CI user enter first name "<first name>"
    And CI user enter last name "<last name>"
#    And CI user select occupation "<occupation>"
#    And CI user enter onboarding email "<email>"
    And CI user select next button
#    And CI user enter occupation "<occupation>"
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user can see password mismatch error

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp   | username    | password   | confirm password |
      | 8509010090001    | 0617373770        | Bab        | Noka      | baba@gmail.com | Carepenter | 12345 | Testuser113 | Testing@01 | Testing@02       |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - dha fails and no bureau record (no occupation and no address)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on personal details page
    When CI user enter first name "<first name>"
    And CI user enter last name "<last name>"
    And CI user select occupation "<occupation>"
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    And CI user select next button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | occupation | otp   | username | password   | confirm password | pin   | confirm pin |
      | 8509010090001    | 0617373770        | Bab        | Noka      | IT Support | 12345 | Test@    | Testing@01 | Testing@01       | 12345 | 12345       |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - dha fails, bureau record (yes occupation and no address)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on personal details page
    When CI user enter first name "<first name>"
    And CI user enter last name "<last name>"
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user enter account opt "<pin>" for securing account
    And CI user select next button
    Then CI user can see enable device biometric label
    When CI user confirm pin "<confirm pin>"
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | otp   | username | password   | confirm password | pin   | confirm pin |
      | 8509010090003    | 0617373770        | Bab        | Noka      | 12345 | Test@    | Testing@01 | Testing@01       | 12345 | 12345       |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - dha fails, has bureau record (yes occupation and yes address)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on personal details page
    When CI user enter first name "<first name>"
    And CI user enter last name "<last name>"
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | otp   | username | password   | confirm password | pin   | confirm pin |
      | 8509010090001    | 0617373770        | Bab        | Noka      | 12345 | Test@    | Testing@01 | Testing@01       | 12345 | 12345       |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - dha passes, no bureau record (no occupation and no adrress)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on personal details page
    When CI user select occupation "<occupation>" from the list
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | occupation | otp   | username | password   | confirm password | pin   | confirm pin |
      | 8509010090001    | 0617373770        | IT Support | 12345 | Test@    | Testing@01 | Testing@01       | 12345 | 12345       |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - dha passes,has bureau record (yes occupation and no adrress)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - dha passes,has bureau record (yes occupation and yes adress)
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see MobiMoney balance text
    And CI user can see YourPoints balance text
    Then CI user can see protect your payment with us text

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |

  # New to wakanda and existing nedbank  client

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, no occupation and no address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on personal details page
    When CI user select occupation "<occupation>" from the list
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, no occupation and yes address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on personal details page
    When CI user select occupation "<occupation>" from the list
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, yes occupation and no address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, yes occupation and yes address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, no occupation and no address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on personal details page
    When CI user select occupation "<occupation>" from the list
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, no occupation and yes address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on personal details page
    When CI user select occupation "<occupation>" from the list
    And CI user select next button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, yes occupation and no address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, yes occupation and yes address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (full fica) - DHA fails, yes occupation and yes address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on nedbank login page
    When CI user enters nedbank id "<nedbank id>"
    And CI user enter nedbank password "<nedbank password>"
    And CI user select nedbank login button
    Then CI user is on wakanda authorization page
    When CI user agree to give access wakanda
    When CI user select authorise button
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see MobiMoney balance text
    And CI user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client (full fica) - DHA passes, yes occupation and yes address
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see MobiMoney balance text
    And CI user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |


  # Mobile App - Existing Merchant App User on Customer App
  @ios-test1 @on-boarding
  Scenario Outline: Existing merchant app first login to customer App - Pass facial biometric
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user can see this sa id is already in use text
    When CI user select login button
    Then CI user is on forgot username page
    When CI user enter username "<username>"
    And CI user select verify username button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see MobiMoney balance text
    And CI user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | username | pin | confirm pin |
      |                  |                   |          |     |             |

  @ios-test @on-boarding
  Scenario Outline: Existing merchant app first login to customer App - Pass facial biometric
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user can see this sa id is already in use text
    When CI user select login button
    Then CI user is on forgot username page
    When CI user enter username "<username>"
    And CI user select verify username button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see MobiMoney balance text
    And CI user can see YourPoints balance text
    And CI user select upgrade my wallet link


    Examples:
      | south african id | cell phone number | username | pin | confirm pin |
      |                  |                   |          |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: Existing merchant app first login to customer App - Fail facial biometric
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user can see this sa id is already in use text
    When CI user select login button
    Then CI user is on forgot username page
    When CI user enter username "<username>"
    And CI user select verify username button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    And CI user can see facial biometric failed
    And CI user is on password fallback page
    When CI user enter fallback password "<fallback password>"
    And CI user select verify password button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    When CI user select start exploring button
    Then CI user can see MobiMoney balance text
    And CI user can see YourPoints balance text
    And CI user select upgrade my wallet link

    Examples:
      | south african id | cell phone number | username | fallback password | otp | pin | confirm pin |
      |                  |                   |          |                   |     |     |             |

  @ios-test1 @on-boarding
  Scenario Outline: Existing mobi money users
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sign up button
    When CI user select sign up button
    Then CI user is on sign up page
    When CI user enter south african id "<south african id>"
    And CI user enter cell phone number "<cell phone number>"
    And CI user give consent to wakanda to process personal info
    And CI user give accepts wakanda app terms and conditions
    And CI user give accepts marketing policy
    And CI user select generate otp button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    And CI user select verify otp button
    Then CI user is on take a facial biometric page
    And CI user select continue button
    When CI user capture facial biometric
    Then CI user is on the hang in there page
    # step missing
    Then CI user is on set login details page
    When CI user enter username "<username>"
    And CI user enter new password "<password>"
    And CI user confirm password "<confirm password>"
    And CI user select next button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    When CI user re-enter pin "<confirm pin>" to secure account
    Then CI user can see device biometric is enabled
    When CI user select save pin button
    Then CI user is on welcome to wakanda page
    And CI user can see you can now user your MobiMoney wallet on wakanda text
    When CI user select start exploring button

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |





