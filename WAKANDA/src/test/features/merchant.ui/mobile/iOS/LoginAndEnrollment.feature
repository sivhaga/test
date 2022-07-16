@merchant-ios
Feature: Login and Enrollement - As a Merchant ios(MI) user, I want to be able to login and enroll

  @Tested
  Scenario Outline: PWA user downloads mobile app first time
    Given MI user launch the merchant ios app
    Then MI user is on proposition page one
    When MI user swipe left
    Then MI user is on proposition page two
    When MI user swipe left
    Then MI user is on proposition page three
    When MI user select lets get started button
#    Then MI user is on dashboard page
#    When MI user select login button
    Then MI user is on wakanda username page
    When MI user enter wakanda username "<wakanda username>"
    When MI user select verify username button
    Then MI user is on wakanda password page
    When MI user enter wakanda password "<wakanda password>"
    When MI user select login button
    Then MI user is on otp verification page
    When MI user enter opt "<otp>" for verification
    When MI user select verify otp button
#    Then MI user is on take a facial biometric page
#    When MI user select continue button
#    When MI user captures their facial biometric
#    Then MI user facial biometric is captured
    Then MI user is on secure your account page
    When MI user setup pin "<pin>" to secure account
    And MI user select next button
    Then MI user is on secure your account page
    And MI user re-enter pin "<confirm pin>" to secure account
    When MI user select next button
    Then MI user is on dashboard page

    Examples:
      | wakanda username | wakanda password | otp | pin | confirm pin |
      | test1            | Heslo123         | 12345|12345| 12345      |

  @ios-test
  Scenario Outline: PWA user downloads mobile app first time - pin mismatch
    Given MI user launch the merchant ios app
    Then MI user is on proposition page one
    When MI user swipe left
    Then MI user is on proposition page two
    When MI user swipe left
    Then MI user is on proposition page three
    When MI user select lets get started button
    When MI user select lets get started button
#    Then MI user is on dashboard page
#    When MI user select login button
    Then MI user is on wakanda username page
    When MI user enter wakanda username "<wakanda username>"
    When MI user select verify username button
    Then MI user is on wakanda password page
    When MI user enter wakanda password "<wakanda password>"
    When MI user select login button
    Then MI user is on otp verification page
    When MI user enter opt "<otp>" for verification
    When MI user select verify otp button
#    Then MI user is on take a facial biometric page
#    When MI user select continue button
#    When MI user captures their facial biometric
#    Then MI user facial biometric is captured
    Then MI user is on secure your account page
    When MI user setup pin "<pin>" to secure account
    And MI user select next button
    Then MI user is on secure your account page
    And MI user re-enter pin "<confirm pin>" to secure account
    When MI user select next button
    Then MI user can see incorrect pin message

    Examples:
      | wakanda username | wakanda password | otp | pin | confirm pin |
      | test1             | Heslo123            | 12345    |12345     | 12344            |

  @Defect-logged
  Scenario Outline: Existing Mobile app user - login on new device
    Given MI user launch the merchant ios app
    Then MI user is on proposition page one
    When MI user swipe left
    Then MI user is on proposition page two
    When MI user swipe left
    Then MI user is on proposition page three
    When MI user select lets get started button
    When MI user select login button
    Then MI user is on wakanda username page
    When MI user enter wakanda username "<wakanda username>"
    When MI user select login button
    Then MI user is on wakanda password page
    When MI user enter wakanda password "<wakanda password>"
    When MI user select login button on wakanda password page
    Then MI user is on take a facial biometric page
    When MI user select continue button
    When MI user captures their facial biometric
    Then MI user facial biometric verification passes
    Then MI user is on new installation detected page
    When MI user select agree and continue button
    Then MI user is on secure your account page
    When MI user setup pin "<pin>" to secure account
    When MI user select next button
    When MI user re-enter pin "<confirm pin>" to secure account
    When MI user select next button
    Then MI user is on the dashboard page

    Examples:
      | wakanda username | wakanda password | otp | pin | confirm pin |
      | test             | test             |     |     |             |

  @ios-test
  Scenario Outline: Existing Mobile app user (Password fallback) - login on new device
    Given MI user launch the merchant ios app
    Then MI user is on proposition page one
    When MI user swipe left
    Then MI user is on proposition page two
    When MI user swipe left
    Then MI user is on proposition page three
    When MI user select lets get started button
    When MI user select login button
    Then MI user is on wakanda username page
    When MI user enter wakanda username "<wakanda username>"
    When MI user select login button
    Then MI user is on take a facial biometric page
    When MI user select continue button
    When MI user captures their facial biometric
    Then MI user facial biometric verification fails
    When MI user select continue button
    Then MI user is login to account with password page
    When MI user enter password "<wakanda password>" to verify
    When MI user select continue button
    Then MI user is on otp verification page
    When MI user enter opt "<otp>" for phone number verification
    Then MI user is on new installation detected page
    When MI user select agree and continue button
    Then MI user is on secure your account page
    When MI user setup pin "<pin>" to secure account
    When MI user select next button
    When MI user re-enter pin "<confirm pin>" to secure account
    When MI user select next button
    Then MI user is on the dashboard page

    Examples:
      | wakanda username | wakanda password | otp | pin | confirm pin |
      | test             | test             |     |     |             |

  @Test
  Scenario Outline: Pin authentication to wakanda ios application
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #Then MI user is on wakanda PIN login page
    When MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on the dashboard page

    Examples:
      | pin   |
      | 12345 |

  @Not-yet-developed
  Scenario: Correct biometric authentication to wakanda ios application
    Given MI user launch the merchant ios app
    Then MI user is on landing page
    When MI user initiate a sensitive transaction
    Then MI user device finger print is activated
    When MI user activate correct touch id finger to login
    Then MI user is on the dashboard page

  @ios-test
  Scenario: Incorrect biometric authentication to wakanda ios application
    Given MI user launch the merchant ios app
    Then MI user is on landing page
    When MI user initiate a sensitive transaction
    Then MI user device finger print is activated
    When MI user activate correct touch id finger to login
    Then MI user can see incorrect finger activated message

  @Not-Deployed
  Scenario Outline: Forgot password
    Given MI user launch the merchant ios app
    Then MI user is on login with password page
    Then MI user is on login with password page
    When MI user select forgot password link
    Then MI user is on forgot password page
    When MI user enter user name "<username>" to recover password
    Then otp message is sent to the MI user
    When MI user enter the otp number "<otp>"
    Then MI user otp is validated
    When MI user enter new password "<new password>"
    When MI user confirm password "<confirm password>"
    When MI user select reset password button
    Then MI user is on the dashboard page

    Examples:
      | username | otp | new password | confirm password |
      | test     |     | test         | test             |

  @Not-Deployed
  Scenario Outline: Forgot username
    Given MI user launch the merchant ios app
    Then MI user is on login with password page
    Then MI user is on wakanda password login page
    When MI user select forgot username link
    Then MI user is on forgot username page
    When MI user enter id number "<id number>"
    When MI user enter cell number "<cell number>"
    When MI user select recover username button
    Then sms with username is sent to MI user
    Then MI user is on the dashboard page

    Examples:
      | id number     | cell number |
      | 8809015466082 | 0731264585  |

  @Not-Deployed
  Scenario Outline: Reset PIN
    Given MI user launch the merchant ios app
    Then MI user is on login with PIN page
    When MI user select forgot PIN link
    Then MI user is authenticated
    When MI user enter new pin "<new pin>"
    When MI user confirm pin "<confirm pin>"
    When MI user select change PIN button
    Then MI user PIN is changed successfully
    Then MI user is returned to login page

    Examples:
      | new pin | confirm pin |
      | 123456  | 123456      |