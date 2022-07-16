@customer-pwa
Feature: Login

  @pwa-test
  Scenario Outline: Existing Mobile app user goes to PWA
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    And CP user select login button
    Then CP user is on the dashboard page

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Invalid username and password
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    And CP user select login button
    Then CP user can see invalid credentials message

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Forgot password
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user select forgot password link
    Then CP user is on forgot password page
    When CP user enter username "<username>" to recover password
    Then CP user can see otp message
    When CP user enter the otp number "<otp number>"
    Then CP user otp is validated
    When CP user enter new password "<new password>"
    And CP user confirm password "<confirm password>"
    And CP user select reset password button
    Then CP user is on the dashboard page

    Examples:
      | username | otp number | new password | confirm password |
      | test     | 123456     | test         | test             |

  @pwa-test
  Scenario Outline: Forgot username
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user select forgot username link
    Then CP user is on forgot username  page
    When CP user enter id number "<id number>"
    And CP user enter cell number "<cell number>"
    And CP user select recover username button
    Then sms with username is sent to CP user
    And CP user is on the dashboard page

    Examples:
      | id number     | cell number |
      | 8809015466082 | 0731254585  |

    #  @pwa-test
#  Scenario: QR code login to wakanda web application
#    Given CP user launch the customer web
#    Then CP user is on dashboard page
#    When CP user select qr code login
#    Then CP user is on qr code page
#    When CP user login to the mobile app
#    And CP user scan qr code using wakanda mobile app
#    Then CP user is on the dashboard page
#
#  @pwa-test
#  Scenario Outline: Invalid username and password
#    Given CP user launch the customer web
#    Then CP user is on dashboard page
#    When CP user select login button
#    Then CP user is on login page
#    When CP user enters username "<username>" with password "<password>"
#    And CP user select login button
#    Then CP user can see invalid login error message
#
#    Examples:
#      | username | password |
#      | test     | test     |
#
#  @pwa-test
#  Scenario: Invalid or already used QR code
#    Given CP user launch the customer web
#    Then CP user is on dashboard page
#    When CP user select qr code login
#    Then CP user is on qr code page
#    When CP user login to the mobile app
#    And CP user scan qr code using wakanda mobile app
#    Then CP user can see invalid qr code error message
