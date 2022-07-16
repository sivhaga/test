@merchant-android
Feature: Login and Enrollment - As a Merchant ios(MI) user, I want to be able to login and enroll

  @Test
  Scenario Outline: PWA user downloads mobile app first time
    Given MA user launch the merchant android app
    Then MA user is on proposition page one
    When MA user swipe left
    Then MA user is on proposition page two
    When MA user swipe left
    Then MA user is on proposition page three
    When MA user select lets get started button
#    Then MA user is on dashboard page
#    When MA user select login button
    Then MA user is on wakanda username page
    When MA user enter wakanda username "<wakanda username>"
    And MA user select verify username button
    Then MA user is on wakanda password page
    When MA user enter wakanda password "<wakanda password>"
    And MA user select login button
    Then MA user is on otp verification page
    When MA user enter opt "<otp>" for verification
    And MA user select verify otp button
    Then MA user is on take a facial biometric page
    When MA user select allow take picture
    When MA user select continue button
#    And MA user captures their facial biometric
#    Then MA user facial biometric is captured
    And MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    Then MA user can see enable device biometric label
    When MA user re-enter pin "<confirm pin>" to secure account
    And MA user select next button
    Then MA user is on dashboard page

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test1             | Heslo123        | 12345 | 00000 | 00000       |

  @defect-logged
  Scenario Outline: Existing Mobile app user - login on new device
    Given MA user launch the merchant android app
    Then MA user is on proposition page one
    When MA user swipe left
    Then MA user is on proposition page two
    When MA user swipe left
    Then MA user is on proposition page three
    When MA user select lets get started button
    Then MA user is on dashboard page
    And MA user select login button
    Then MA user is on wakanda username page
    When MA user enter wakanda username "<wakanda username>"
    And MA user select login button
    Then MA user is on otp verification page
    And MA user is on take a facial biometric page
    When MA user select allow take picture
    When MA user select continue button
    And MA user captures their facial biometric
    Then MA user facial biometric verification passes
    And MA user is on new installation detected page
    When MA user select agree and continue button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    And MA user re-enter pin "<confirm pin>" to secure account
    And MA user select next button
    Then MA user is on dashboard page
    And MA user previous device is deregistered

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test1            | Heslo123           | 123456 | 00000 | 00000       |

  @android-test
  Scenario Outline: Existing Mobile app user - pin mismatch / incorrect pin length business rules
    Given MA user launch the merchant android app
    Then MA user is on proposition page one
    When MA user swipe left
    Then MA user is on proposition page two
    When MA user swipe left
    Then MA user is on proposition page three
    When MA user select lets get started button
    Then MA user is on dashboard page
    And MA user select login button
    Then MA user is on wakanda username page
    When MA user enter wakanda username "<wakanda username>"
    And MA user select login button
    Then MA user is on otp verification page
    And MA user is on take a facial biometric page
    When MA user select allow take picture
    When MA user select continue button
    And MA user captures their facial biometric
    Then MA user facial biometric verification passes
    And MA user is on new installation detected page
    When MA user select agree and continue button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    And MA user re-enter pin "<confirm pin>" to secure account
    And MA user select next button
    Then MA user can see pin mismatch error
    And MA user previous device is not deregistered

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test             | test             | 123456 | 00000 | 00000       |

  @android-test
  Scenario Outline: Existing Mobile app user (Password fallback) - login on new device
    Given MA user launch the merchant android app
    Then MA user is on proposition page one
    When MA user swipe left
    Then MA user is on proposition page two
    When MA user swipe left
    Then MA user is on proposition page three
    When MA user select lets get started button
    Then MA user is on dashboard page
    And MA user select login button
    Then MA user is on wakanda username page
    When MA user enter wakanda username "<wakanda username>"
    And MA user select login button
    Then MA user is on take a facial biometric page
    When MA user select allow take picture
    When MA user select continue button
    And MA user captures their facial biometric
    Then MA user facial biometric verification fails
    When MA user select continue button
    Then MA user is login to account with password page
    When MA user enter password "<wakanda password>" to verify
    And MA user select continue button
    Then MA user is on otp verification page
    When MA user enter opt "<otp>" for phone number verification
    Then MA user is on new installation detected page
    When MA user select agree and continue button
    Then MA user is on secure your account page
    When MA user setup pin "<pin>" to secure account
    And MA user select next button
    And MA user re-enter pin "<confirm pin>" to secure account
    And MA user select next button
    Then MA user is on dashboard page
    And MA user previous device is deregistered

    Examples:
      | wakanda username | wakanda password | otp    | pin   | confirm pin |
      | test             | test             | 123456 | 00000 | 00000       |

  @Testmhgk
  Scenario Outline: Pin authentication to wakanda android application
    Given MA user launch the merchant android app
    #Then MA user can see Use PIN link
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page

    Examples:
      | pin    |
      | 123456 |

  @Not-Deployed
  Scenario: Correct biometric authentication to wakanda android application
    Given MA user launch the merchant android app
    Then MA user is on dashboard page
    When MA user initiate a sensitive transaction
    Then MA user device finger print is activated
    When MA user activate correct touch id finger to login
    Then MA user is on dashboard page

  @Not-Deployed
  Scenario Outline: Forgot password - not yet developed
    Given MA user launch the merchant android app
    Then MA user is on dashboard page
    When MA user select login button
    Then MA user is on login with password page
    When MA user select forgot password link
    Then MA user is on forgot password page
    When MA user enter user name "<username>" to recover password
    Then otp message is sent to the MA user
    When MA user enter the otp number "<otp number>"
    Then MA user otp is validated
    When MA user enter new password "<new password>"
    And MA user confirm password "<confirm password>"
    And MA user select reset password button
    Then MA user is on dashboard page

    Examples:
      | username | otp number | new password | confirm password |
      | test     | 123456           | test         | test             |

  @not_yet_developed
  Scenario Outline: Forgot username
    Given MA user launch the merchant android app
    Then MA user is on dashboard page
    When MA user select login button
    Then MA user is on login with password page
    And MA user is on wakanda password login page
    When MA user select forgot username link
    Then MA user is on forgot username page
    When MA user enter id number "<id number>"
    And MA user enter cell number "<cell number>"
    And MA user select recover username button
    Then sms with username is sent to MA user
    And MA user is on dashboard page

    Examples:
      | id number     | cell number |
      | 8809015466082 | 0731264585  |

  @Not-Deployed
  Scenario Outline: Reset PIN
    Given MA user launch the merchant android app
    Then MA user is on dashboard page
    When MA user select login button
    Then MA user is on login with PIN page
    When MA user select forgot PIN link
    Then MA user is authenticated
    When MA user enter new pin "<new pin>"
    And MA user confirm pin "<confirm pin>"
    And MA user select change PIN button
    Then MA user PIN is changed successfully
    And MA user is returned to login page

    Examples:
      | new pin | confirm pin |
      | 123456  | 123456      |