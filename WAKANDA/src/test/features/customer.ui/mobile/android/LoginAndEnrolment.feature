@customer-android
Feature: As a Customer Android (CA) user I want to be able to login and enroll

  @android-test @login-enrolment
  Scenario Outline: PWA user downloads mobile app first time
    Given CA user launch the customer android app
    Then CA user is on proposition page one
    When CA user swipe left
    Then CA user is on proposition page two
    When CA user swipe left
    Then CA user is on proposition page three
    When CA user select lets get started button
#    Then CA user is on dashboard page
#    When CA user select login button
    Then CA user is on wakanda username page
    When CA user enter wakanda username "<wakanda username>"
    And CA user select verify username button
    Then CA user is on wakanda password page
    When CA user enter wakanda password "<wakanda password>"
    And CA user select login button
    Then CA user is on otp verification page
    When CA user enter opt "<otp>" for verification
    And CA user select verify otp button
    Then CA user is on take a facial biometric page
    When CA user select continue button
#    And CA user captures their facial biometric
#    Then CA user facial biometric is captured
    And CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    Then CA user can see enable device biometric label
    When CA user re-enter pin "<confirm pin>" to secure account
    And CA user select next button
    Then CA user is on dashboard page

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test             | test             | 123456 | 00000 | 00000       |

  @android-test @login-enrolment
  Scenario Outline: Existing Mobile app user - login on new device
    Given CA user launch the customer android app
    Then CA user is on proposition page one
    When CA user swipe left
    Then CA user is on proposition page two
    When CA user swipe left
    Then CA user is on proposition page three
    When CA user select lets get started button
    Then CA user is on dashboard page
    And CA user select login button
    Then CA user is on wakanda username page
    When CA user enter wakanda username "<wakanda username>"
    And CA user select login button
    Then CA user is on otp verification page
    And CA user is on take a facial biometric page
    When CA user select continue button
    And CA user captures their facial biometric
    Then CA user facial biometric verification passes
    And CA user is on new installation detected page
    When CA user select agree and continue button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    And CA user re-enter pin "<confirm pin>" to secure account
    And CA user select next button
    Then CA user is on dashboard page
    And CA user previous device is deregistered

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test             | test             | 123456 | 00000 | 00000       |

  @android-test @login-enrolment
  Scenario Outline: Existing Mobile app user - pin mismatch / incorrect pin length business rules
    Given CA user launch the customer android app
    Given CA user launch the customer android app
    Then CA user is on proposition page one
    When CA user swipe left
    Then CA user is on proposition page two
    When CA user swipe left
    Then CA user is on proposition page three
    When CA user select lets get started button
    Then CA user is on dashboard page
    And CA user select login button
    Then CA user is on wakanda username page
    When CA user enter wakanda username "<wakanda username>"
    And CA user select login button
    Then CA user is on otp verification page
    And CA user is on take a facial biometric page
    When CA user select continue button
    And CA user captures their facial biometric
    Then CA user facial biometric verification passes
    And CA user is on new installation detected page
    When CA user select agree and continue button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    And CA user re-enter pin "<confirm pin>" to secure account
    And CA user select next button
    Then CA user can see pin mismatch error
    And CA user previous device is not deregistered

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test             | test             | 123456 | 00000 | 00000       |

  @android-test @login-enrolment
  Scenario Outline: Existing Mobile app user (Password fallback) - login on new device
    Given CA user launch the customer android app
    Then CA user is on proposition page one
    When CA user swipe left
    Then CA user is on proposition page two
    When CA user swipe left
    Then CA user is on proposition page three
    When CA user select lets get started button
    Then CA user is on dashboard page
    And CA user select login button
    Then CA user is on wakanda username page
    When CA user enter wakanda username "<wakanda username>"
    And CA user select login button
    Then CA user is on take a facial biometric page
    When CA user select continue button
    And CA user captures their facial biometric
    Then CA user facial biometric verification fails
    When CA user select continue button
    Then CA user is login to account with password page
    When CA user enter password "<wakanda password>" to verify
    And CA user select continue button
    Then CA user is on otp verification page
    When CA user enter opt "<otp>" for phone number verification
    Then CA user is on new installation detected page
    When CA user select agree and continue button
    Then CA user is on secure your account page
    When CA user setup pin "<pin>" to secure account
    And CA user select next button
    And CA user re-enter pin "<confirm pin>" to secure account
    And CA user select next button
    Then CA user is on dashboard page
    And CA user previous device is deregistered

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test             | test             | 123456 | 00000 | 00000       |

  @android-test @login-enrolment
  Scenario Outline: Pin authentication to wakanda android application
    Given CA user launch the customer android app
    Then CA user can see Use PIN link
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" as PIN
    When CA user select confirm button
    Then CA user is able to see wallet balance

    Examples:
      | pin    |
      | 123456 |

  @android-test @login-enrolment
  Scenario: Correct biometric authentication to wakanda android application
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user initiate a sensitive transaction
    Then CA user device finger print is activated
    When CA user activate correct touch id finger to login
    Then CA user is on dashboard page

  @android-test @login-enrolment
  Scenario: Incorrect biometric authentication to wakanda android application
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user initiate a sensitive transaction
    Then CA user device finger print is activated
    When CA user activate correct touch id finger to login
    Then CA user can see incorrect finger activated message

  @android-test @login-enrolment
  Scenario Outline: Forgot password
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login with password page
    When CA user select forgot password link
    Then CA user is on forgot password page
    When CA user enter user name "<username>" to recover password
    Then otp message is sent to the CA user
    When CA user enter the otp number "<otp number>"
    Then CA user otp is validated
    When CA user enter new password "<new password>"
    And CA user confirm password "<confirm password>"
    And CA user select reset password button
    Then CA user is on dashboard page

    Examples:
      | username | otp number | new password | confirm password |
      | test     | 123456     | test         | test             |

  @android-test @login-enrolment
  Scenario Outline: Forgot username
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login with password page
    And CA user is on wakanda password login page
    When CA user select forgot username link
    Then CA user is on forgot username page
    When CA user enter id number "<id number>"
    And CA user enter cell number "<cell number>"
    And CA user select recover username button
    Then sms with username is sent to CA user
    And CA user is on dashboard page

    Examples:
      | id number     | cell number |
      | 8809015466082 | 0731264585  |

  @android-test @login-enrolment
  Scenario Outline: Reset PIN
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login with PIN page
    When CA user select forgot PIN link
    Then CA user is authenticated
    When CA user enter new pin "<new pin>"
    And CA user confirm pin "<confirm pin>"
    And CA user select change PIN button
    Then CA user PIN is changed successfully
    And CA user is returned to login page

    Examples:
      | new pin | confirm pin |
      | 123456  | 123456      |