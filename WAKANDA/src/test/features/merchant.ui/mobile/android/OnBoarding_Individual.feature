@merchant-android
Feature: On-boarding - As a Merchant Android(MA) user, I want to be Onboarded to Wakanda

    @android-test
  Scenario Outline: New to wakanda and new to nedbank - invalid id number
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user can see invalid id number error message

    Examples:
      | south african id | cell phone number |
      | 9111225184080    | 0721264585        |

  @android-test
  Scenario Outline: New to wakanda and new to nedbank - invalid otp
    Given MA user launch the merchant android app
    #    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter opt "<otp>" for verification
    And MA user select verify otp button
    Then MA user can see invalid otp error message

    Examples:
      | south african id | cell phone number | otp   |
      | 8809015477083    | 0727331055        | 67890 |

  @android-test
  Scenario Outline: New to wakanda and new to nedbank - resend otp
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user select resend otp link
    Then MA user can receive newly generated otp
    When MA user enter old otp "<old otp>"
    And MA user select verify otp button
    Then MA user can see invalid otp error message
    When MA user enter otp "<new otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page

    Examples:
      | south african id | cell phone number |
      | 9111225184080    | 0617373770        |

  # NEW_TO_WAKANDA_AND_NEW_TO_NEDBANK

  @android-test
  Scenario Outline: Password mismatch
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on personal details page
    When MA user enter first name "<first name>"
    And MA user enter last name "<last name>"
    And MA user enter onboarding email "<email>"
    And MA user enter occupation "<occupation>"
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on set login details page

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp | username   | password   | confirm password | pin | confirm pin |
      | 9111225184080    | 0617373770        | Bab        | Noka      | baba@gmail.com |            |     | Testuser10 | Testing@01 | Testing@02       |     |             |

  @android-test
  Scenario Outline: New to wakanda and new to nedbank - dha fails and no bureau record (no occupation and no address)
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on personal details page
    When MA user enter first name "<first name>"
    And MA user enter last name "<last name>"
    And MA user enter onboarding email "<email>"
    And MA user select occupation "<occupation>" from the list
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user enter account opt "<pin>" for securing account
    And MA user select next button
    Then MA user can see enable device biometric label
    When MA user confirm pin "<confirm pin>"
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | first name | last name | email          | occupation | otp | username   | password   | confirm password | pin | confirm pin |
      | 9111225184080    | 0617373770        | Bab        | Noka      | baba@gmail.com |            |     | Testuser10 | Testing@01 | Testing@01       |     |             |

  @android-test1
  Scenario Outline: New to wakanda and new to nedbank - dha fails, bureau record (yes occupation and no address)
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on personal details page
    When MA user enter first name "<first name>"
    And MA user enter last name "<last name>"
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user enter account opt "<pin>" for securing account
    And MA user select next button
    Then MA user can see enable device biometric label
    When MA user confirm pin "<confirm pin>"
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | first name | last name | otp | username | password   | confirm password | pin | confirm pin |
      | 9111225184080    | 0731331022        | Thabo      | Dladla    |     | Testwaka | Testing@01 | Testing@01       |     |             |


  @android-test1
  Scenario Outline: New to wakanda and new to nedbank - dha fails, has bureau record (yes occupation and yes address)
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on personal details page
    When MA user enter first name "<first name>"
    And MA user enter last name "<last name>"
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | first name | last name | otp | username | password   | confirm password | pin | confirm pin |
      | 9111225184080    | 0731331022        | Thabo      | Dladla    |     | Testwaka | Testing@01 | Testing@01       |     |             |

  @android-test
  Scenario Outline: New to wakanda and new to nedbank - dha passes, no bureau record (no occupation and no adrress)
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on personal details page
    When MA user select occupation "<occupation>" from the list
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | occupation | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |            |     |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to wakanda and new to nedbank - dha passes,has bureau record (yes occupation and no adrress)
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user can see we have created unlimited wallet for you
    When MA user select go to dashboard button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to wakanda and new to nedbank - dha passes,has bureau record (yes occupation and yes adress)
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created unlimited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |

  # NEW_TO_WAKANDA_AND_EXISTING_NEDBANK_CLIENT
  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, no occupation and no address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on personal details page
    When MA user select occupation "<occupation>" from the list
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page


    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, no occupation and yes address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on personal details page
    When MA user select occupation "<occupation>" from the list
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, yes occupation and no address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA fails, yes occupation and yes address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created unlimited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, no occupation and no address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on personal details page
    When MA user select occupation "<occupation>" from the list
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on congratulations page
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, no occupation and yes address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on personal details page
    When MA user select occupation "<occupation>" from the list
    And MA user select next button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | occupation | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |            |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, yes occupation and no address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (partial fica) - DHA passes, yes occupation and yes address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user can see we have created limited wallet for you
    And MA user select continue button
    Then MA user is on update profile page
    When MA user select category
    And MA user select first subcategory
    And MA user select second subcategory
    And MA user select third subcategory
    And MA user select forth subcategory
    And MA user select fifth subcategory
    And MA user select save and continue button
    Then MA user is on set location page
    When MA user set location
    And MA user select submit button
    Then MA user is on dashboard page

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (full fica) - DHA fails, yes occupation and yes address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on nedbank login page
    When MA user enters nedbank id "<nedbank id>"
    And MA user enter nedbank password "<nedbank password>"
    And MA user select nedbank login button
    Then MA user is on wakanda authorization page
    When MA user agree to give access wakanda
    When MA user select authorise button
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on welcome to wakanda page
    When MA user select start exploring button
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | otp | nedbank id | nedbank password | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |            |                  |          |          |                  |     |             |

  @android-test
  Scenario Outline: New to Wakanda and existing nedbank client (full fica) - DHA passes, yes occupation and yes address
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on welcome to wakanda page
    When MA user select start exploring button
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |


  # MOBILE_APP - EXISTING_MERCHANT_APP_USER_ON_merchant_APP
  @android-test
  Scenario Outline: Existing merchant app first login to merchant App - Pass facial biometric
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user can see this sa id is already in use text
    When MA user select login button
    Then MA user is on forgot username page
    When MA user enter username "<username>"
    And MA user select verify username button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on welcome to wakanda page
    When MA user select start exploring button
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text

    Examples:
      | south african id | cell phone number | username | pin | confirm pin |
      |                  |                   |          |     |             |

  @android-test
  Scenario Outline: Existing merchant app first login to merchant App - Pass facial biometric
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user can see this sa id is already in use text
    When MA user select login button
    Then MA user is on forgot username page
    When MA user enter username "<username>"
    And MA user select verify username button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on welcome to wakanda page
    When MA user select start exploring button
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text
    And MA user select upgrade my wallet link


    Examples:
      | south african id | cell phone number | username | pin | confirm pin |
      |                  |                   |          |     |             |

  @android-test
  Scenario Outline: Existing merchant app first login to merchant App - Fail facial biometric
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user can see this sa id is already in use text
    When MA user select login button
    Then MA user is on forgot username page
    When MA user enter username "<username>"
    And MA user select verify username button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    And MA user can see facial biometric failed
    And MA user is on password fallback page
    When MA user enter fallback password "<fallback password>"
    And MA user select verify password button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on welcome to wakanda page
    When MA user select start exploring button
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text
    And MA user select upgrade my wallet link

    Examples:
      | south african id | cell phone number | username | fallback password | otp | pin | confirm pin |
      |                  |                   |          |                   |     |     |             |

  @android-test
  Scenario Outline: Existing mobi money users
    Given MA user launch the merchant android app
#    Then MA user is on dashboard page
#    And MA user can see sign up button
#    When MA user select sign up button
#    Then MA user is on sign up page
    Then MA user is on wakanda username page
    When MA user select sign up button
    Then MA user is on lets get started page
    When MA user select Individual business type
    And MA user select continue button
    Then MA user is on sign up page
    When MA user enter south african id "<south african id>"
    And MA user enter cell phone number "<cell phone number>"
    And MA user give consent to wakanda to process personal info
    And MA user give accepts wakanda app terms and conditions
    And MA user give accepts marketing policy
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    And MA user select continue button
    When MA user capture facial biometric
    Then MA user is on the hang in there page
    # step missing
    Then MA user is on set login details page
    When MA user enter username "<username>"
    And MA user enter new password "<password>"
    And MA user confirm password "<confirm password>"
    And MA user select next button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user is on secure your account page
    When MA user re-enter pin "<confirm pin>" to secure account
    Then MA user can see device biometric is enabled
    When MA user select save pin button
    Then MA user is on welcome to wakanda page
    And MA user can see you can now user your MobiMoney wallet on wakanda text
    When MA user select start exploring button

    Examples:
      | south african id | cell phone number | otp | username | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |          |                  |     |             |



