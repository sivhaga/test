@customer-android
Feature: On-boarding

  @android-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - invalid id number
    Given CA user launch the customer android app
    Then CA user is on wakanda username page
    When CA user select sign up button
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user can see invalid id number error message

    Examples:
      | south african id | cell phone number |
      | 9111225184080    | 0721264585        |

  @android-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - invalid otp
    Given CA user launch the customer android app
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter opt "<otp>" for verification
    And CA user select verify otp button
    Then CA user can see invalid otp error message

    Examples:
      | south african id | cell phone number | otp   |
      | 8809015477083    | 0727331055        | 67890 |

  @android-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank - resend otp
    Given CA user launch the customer android app
#    Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user select resend otp link
    Then CA user can receive newly generated otp
    When CA user enter old otp "<old otp>"
    And CA user select verify otp button
    Then CA user can see invalid otp error message
    When CA user enter otp "<new otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page

    Examples:
      | south african id | cell phone number | old otp | new otp |
      | 9111225184080    | 0617373770        |         |         |

  # NEW_TO_WAKANDA_AND_NEW_TO_NEDBANK

  @ios-test1 @on-boarding
  Scenario Outline: Username already taken
    Given CA user launch the customer android app
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter opt "<otp>" for verification
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on personal details page
    When CA user enter first name "<first name>"
    And CA user enter last name "<last name>"
    #And CA user enter onboarding email "<email>"
    # And CA user select occupation "<occupation>"
    And CA user select next button
    Then CA user is on set login details page
    When CA user enter existing username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA can see username already taken error

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp   | username     | password   | confirm password |
      | 9111225184082    | 0617373770        | Bab        | Noka      | baba@gmail.com |            | 12345 | testUserName | Testing@01 | Testing@02       |


  @android-test1 @on-boarding
  Scenario Outline: Password mismatch
   # Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on personal details page
    When CA user enter first name "<first name>"
    And CA user enter last name "<last name>"
    And CA user enter onboarding email "<email>"
#    And CA user enter occupation "<occupation>"
    And CA user select next button
    Then CA user is on set login details page
    When CA user enter username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA user is on set login details page

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp | username   | password   | confirm password | pin | confirm pin |
      | 9111225184080    | 0617373770        | Bab        | Noka      | baba@gmail.com |            |     | Testuser10 | Testing@01 | Testing@02       |     |             |

  @android-test1 @on-boarding
  Scenario Outline: New to wakanda and new to nedbank
    Given CA user launch the customer android app
   # Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on personal details page
    When CA user enter first name "<first name>"
    And CA user enter last name "<last name>"
    And CA user enter onboarding email "<email>"
#    And CA user enter occupation "<occupation>"
    And CA user select next button
    Then CA user is on set login details page
    When CA user enter username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA user is on secure your account page
    When CA user enter account opt "<pin>" for securing account
    And CA user select next button
    Then CA user can see enable device biometric label
    When CA user confirm pin "<confirm pin>"
    Then CA user can see device biometric is enabled
    When CA user select save pin button
    Then CA user is on welcome to wakanda page
    When CA user select start exploring button
    Then CA user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp | username   | password   | confirm password | pin | confirm pin |
      | 9111225184080    | 0617373770        | Bab        | Noka      | baba@gmail.com |            |     | Testuser10 | Testing@01 | Testing@01       |     |             |


  @android-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client - none fica
     # Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on nedbank login page
    When CA user enters nedbank id "<nedbank id>"
    And CA user enter nedbank password "<nedbank password>"
    And CA user select nedbank login button
    Then CA user is on wakanda authorization page
    When CA user agree to give access wakanda
    When CA user select authorise button
    Then CA user is on personal details page
    When CA user select occupation "<occupation>" from the list
    And CA user select next button
    Then CA user is on set login details page
    When CA user enter username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    Then CA user is on secure your account page
    When CA user re-enter pin "<confirm pin>" to secure account
    Then CA user can see device biometric is enabled
    When CA user select save pin button
    Then CA user is on welcome to wakanda page
    When CA user select start exploring button
    Then CA user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |


  @android-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client - partial fica
     # Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on nedbank login page
    When CA user enters nedbank id "<nedbank id>"
    And CA user enter nedbank password "<nedbank password>"
    And CA user select nedbank login button
    Then CA user is on wakanda authorization page
    When CA user agree to give access wakanda
    When CA user select authorise button
    Then CA user is on personal details page
    When CA user select occupation "<occupation>" from the list
    And CA user select next button
    Then CA user is on set login details page
    When CA user enter username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    Then CA user is on secure your account page
    When CA user re-enter pin "<confirm pin>" to secure account
    Then CA user can see device biometric is enabled
    When CA user select save pin button
    Then CA user is on welcome to wakanda page
    When CA user select start exploring button
    Then CA user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |


  @android-test1 @on-boarding
  Scenario Outline: New to Wakanda and existing nedbank client - full fica
    Given CA user launch the customer android app
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on set login details page
    When CA user enter username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    Then CA user is on secure your account page
    When CA user re-enter pin "<confirm pin>" to secure account
    Then CA user can see device biometric is enabled
    When CA user select save pin button
    Then CA user is on welcome to wakanda page
    When CA user select start exploring button
    Then CA user can see MobiMoney balance text
    And CA user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |

  # MOBILE_APP - EXISTING_MERCHANT_APP_USER_ON_CUSTOMER_APP
  @android-test1 @on-boarding
  Scenario Outline: Existing merchant app first login to customer App
    Given CA user launch the customer android app
     # Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user can see this sa id is already in use text
    When CA user select login button
    Then CA user is on forgot username page
    When CA user enter username "<username>"
    And CA user select verify username button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    And CA user can see facial biometric failed
    And CA user is on password fallback page
    When CA user enter fallback password "<fallback password>"
    And CA user select verify password button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    Then CA user is on secure your account page
    When CA user re-enter pin "<confirm pin>" to secure account
    Then CA user can see device biometric is enabled
    When CA user select save pin button
    Then CA user is on welcome to wakanda page
    When CA user select start exploring button
    Then CA user can see MobiMoney balance text
    And CA user can see YourPoints balance text
    And CA user select upgrade my wallet link

    Examples:
      | south african id | cell phone number | username | fallback password | otp | pin | confirm pin |
      |                  |                   |          |                   |     |     |             |

  @android-test1 @on-boarding
  Scenario Outline: Existing mobi money users
    Given CA user launch the customer android app
     # Then CA user is on dashboard page
    Then CA user is on wakanda username page
    And CA user can see sign up button
    When CA user select sign up button
    Then CA user is on sign up page
    When CA user enter south african id "<south african id>"
    And CA user enter cell phone number "<cell phone number>"
    And CA user give consent to wakanda to process personal info
    And CA user give accepts wakanda app terms and conditions
    And CA user give accepts marketing policy
    And CA user select generate otp button
    Then CA user is on otp verification page
    When CA user enter otp "<otp>" to verify mobile number
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    And CA user select continue button
    When CA user capture facial biometric
    Then CA user is on the hang in there page
    # step missing
    Then CA user is on set login details page
    When CA user enter username "<username>"
    And CA user enter new password "<password>"
    And CA user confirm password "<confirm password>"
    And CA user select next button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    Then CA user is on secure your account page
    When CA user re-enter pin "<confirm pin>" to secure account
    Then CA user can see device biometric is enabled
    When CA user select save pin button
    Then CA user is on welcome to wakanda page
    And CA user can see you can now user your MobiMoney wallet on wakanda text
    When CA user select start exploring button

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |



