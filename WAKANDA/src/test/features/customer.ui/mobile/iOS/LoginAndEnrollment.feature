@customer-ios
Feature: As a Customer ios (CI) user I want to be able to login and enroll

  @ios-test @login-enrolment
  Scenario Outline: PWA user downloads mobile app first time
    Given CI user launch the customer ios app
    Then CI user is on proposition page one
    When CI user swipe left
    Then CI user is on proposition page two
    When CI user swipe left
    Then CI user is on proposition page three
    When CI user select lets get started button
#    Then CI user is on dashboard page
#    When CI user select login button
    Then CI user is on wakanda username page
    When CI user enter wakanda username "<wakanda username>"
    When CI user select verify username button
    Then CI user is on wakanda password page
    When CI user enter wakanda password "<wakanda password>"
    When CI user select login button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    When CI user select verify otp button
#    Then CI user is on take a facial biometric page
#    When CI user select continue button
#    When CI user captures their facial biometric
#    Then CI user facial biometric is captured
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    And CI user re-enter pin "<confirm pin>" to secure account
    When CI user select next button
    Then CI user is on the dashboard page

    Examples:
      | wakanda username | wakanda password | otp   | pin   | confirm pin |
      | test1            | Heslo123         | 12345 | 12345 | 12345       |

  @ios-test1 @login-enrolment
  Scenario Outline: PWA user downloads mobile app first time - pin mismatch
    Given CI user launch the customer ios app
    Then CI user is on proposition page one
    When CI user swipe left
    Then CI user is on proposition page two
    When CI user swipe left
    Then CI user is on proposition page three
    When CI user select lets get started button
    When CI user select lets get started button
#    Then CI user is on dashboard page
#    When CI user select login button
    Then CI user is on wakanda username page
    When CI user enter wakanda username "<wakanda username>"
    When CI user select verify username button
    Then CI user is on wakanda password page
    When CI user enter wakanda password "<wakanda password>"
    When CI user select login button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for verification
    When CI user select verify otp button
#    Then CI user is on take a facial biometric page
#    When CI user select continue button
#    When CI user captures their facial biometric
#    Then CI user facial biometric is captured
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    And CI user select next button
    Then CI user is on secure your account page
    And CI user re-enter pin "<confirm pin>" to secure account
    When CI user select next button
    Then CI user can see incorrect pin message

    Examples:
      | wakanda username | wakanda password | otp   | pin   | confirm pin |
      | test1            | Heslo123         | 12345 | 12345 | 12344       |

  @ios-test @login-enrolment
  Scenario Outline: Existing Mobile app user - login on new device
    Given CI user launch the customer ios app
    Then CI user is on proposition page one
    When CI user swipe left
    Then CI user is on proposition page two
    When CI user swipe left
    Then CI user is on proposition page three
    When CI user select lets get started button
    When CI user select login button
    Then CI user is on wakanda username page
    When CI user enter wakanda username "<wakanda username>"
    When CI user select login button
    Then CI user is on wakanda password page
    When CI user enter wakanda password "<wakanda password>"
    When CI user select login button on wakanda password page
    Then CI user is on take a facial biometric page
    When CI user select continue button
    When CI user captures their facial biometric
    Then CI user facial biometric verification passes
    Then CI user is on new installation detected page
    When CI user select agree and continue button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    When CI user select next button
    When CI user re-enter pin "<confirm pin>" to secure account
    When CI user select next button
    Then CI user is on the dashboard page

    Examples:
      | wakanda username | wakanda password | otp | pin | confirm pin |
      | test             | test             |     |     |             |

  @ios-test @login-enrolment
  Scenario Outline: Existing Mobile app user (Password fallback) - login on new device
    Given CI user launch the customer ios app
    Then CI user is on proposition page one
    When CI user swipe left
    Then CI user is on proposition page two
    When CI user swipe left
    Then CI user is on proposition page three
    When CI user select lets get started button
    When CI user select login button
    Then CI user is on wakanda username page
    When CI user enter wakanda username "<wakanda username>"
    When CI user select login button
    Then CI user is on take a facial biometric page
    When CI user select continue button
    When CI user captures their facial biometric
    Then CI user facial biometric verification fails
    When CI user select continue button
    Then CI user is login to account with password page
    When CI user enter password "<wakanda password>" to verify
    When CI user select continue button
    Then CI user is on otp verification page
    When CI user enter opt "<otp>" for phone number verification
    Then CI user is on new installation detected page
    When CI user select agree and continue button
    Then CI user is on secure your account page
    When CI user setup pin "<pin>" to secure account
    When CI user select next button
    When CI user re-enter pin "<confirm pin>" to secure account
    When CI user select next button
    Then CI user is on the dashboard page

    Examples:
      | wakanda username | wakanda password | otp | pin | confirm pin |
      | test             | test             |     |     |             |

  @ios-test @login-enrolment
  Scenario Outline: Pin authentication to wakanda ios application
    Given CI user launch the customer ios app
    Then CI user is on login with password page
    Then CI user is on wakanda PIN login page
    When CI user enter wakanda PIN "<pin>" to login
    When CI user select login button
    Then CI user is on the dashboard page

    Examples:
      | pin    |
      | 123456 |

  @ios-test @login-enrolment
  Scenario: Correct biometric authentication to wakanda ios application
    Given CI user launch the customer ios app
    Then CI user is on landing page
    When CI user initiate a sensitive transaction
    Then CI user device finger print is activated
    When CI user activate correct touch id finger to login
    Then CI user is on the dashboard page

  @ios-test @login-enrolment
  Scenario: Incorrect biometric authentication to wakanda ios application
    Given CI user launch the customer ios app
    Then CI user is on landing page
    When CI user initiate a sensitive transaction
    Then CI user device finger print is activated
    When CI user activate correct touch id finger to login
    Then CI user can see incorrect finger activated message

  @ios-test @login-enrolment
  Scenario Outline: Forgot password
    Given CI user launch the customer ios app
    Then CI user is on login with password page
    Then CI user is on login with password page
    When CI user select forgot password link
    Then CI user is on forgot password page
    When CI user enter user name "<username>" to recover password
    Then otp message is sent to the CI user
    When CI user enter the otp number "<otp>"
    Then CI user otp is validated
    When CI user enter new password "<new password>"
    When CI user confirm password "<confirm password>"
    When CI user select reset password button
    Then CI user is on the dashboard page

    Examples:
      | username | otp | new password | confirm password |
      | test     |     | test         | test             |

  @ios-test @login-enrolment
  Scenario Outline: Forgot username
    Given CI user launch the customer ios app
    Then CI user is on login with password page
    Then CI user is on wakanda password login page
    When CI user select forgot username link
    Then CI user is on forgot username page
    When CI user enter id number "<id number>"
    When CI user enter cell number "<cell number>"
    When CI user select recover username button
    Then sms with username is sent to CI user
    Then CI user is on the dashboard page

    Examples:
      | id number     | cell number |
      | 8809015466082 | 0731264585  |

  @ios-test @login-enrolment
  Scenario Outline: Reset PIN
    Given CI user launch the customer ios app
    Then CI user is on login with PIN page
    When CI user select forgot PIN link
    Then CI user is authenticated
    When CI user enter new pin "<new pin>"
    When CI user confirm pin "<confirm pin>"
    When CI user select change PIN button
    Then CI user PIN is changed successfully
    Then CI user is returned to login page

    Examples:
      | new pin | confirm pin |
      | 123456  | 123456      |