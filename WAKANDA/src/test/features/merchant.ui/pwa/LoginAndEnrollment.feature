@merchant-pwa
Feature: As a Merchant PWA (MP) user I want to be able to login and enroll

  @pwa-test
  Scenario Outline: Existing Mobile app user goes to PWA
    Given MP user launch the merchant web
    Then MP user is on dashboard page
    When MP user select login button
    Then MP user is on login page
    When MP user enters username "<username>" with password "<password>"
    And MP user select login button
    Then MP user is on the dashboard page

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario: QR code login to wakanda web application
    Given MP user launch the merchant web
    Then MP user is on dashboard page
    When MP user select qr code login
    Then MP user is on qr code page
    When MP user login to the mobile app
    And MP user scan qr code using wakanda mobile app
    Then MP user is on the dashboard page

  @pwa-test
  Scenario Outline: Invalid username and password
    Given MP user launch the merchant web
    Then MP user is on dashboard page
    When MP user select login button
    Then MP user is on login page
    When MP user enters username "<username>" with password "<password>"
    And MP user select login button
    Then MP user can see invalid login error message

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario: Invalid or already used QR code
    Given MP user launch the merchant web
    Then MP user is on dashboard page
    When MP user select qr code login
    Then MP user is on qr code page
    When MP user login to the mobile app
    And MP user scan qr code using wakanda mobile app
    Then MP user can see invalid qr code error message

  @pwa-test
  Scenario Outline: Forgot password
    Given MP user launch the merchant web
    Then MP user is on dashboard page
    When MP user select login button
    Then MP user is on login page
    When MP user select forgot password link
    Then MP user is on forgot password page
    When MP user enter username "<username>" to recover password
    Then MP user can see otp message
    When MP user enter the otp number "<otp number>"
    Then MP user otp is validated
    When MP user enter new password "<new password>"
    And MP user confirm password "<confirm password>"
    And MP user select reset password button
    Then MP user is on the dashboard page

    Examples:
      | username | otp number | new password | confirm password |
      | test     | 123456     | test         | test             |

  @pwa-test
  Scenario Outline: Forgot username
    Given MP user launch the merchant web
    Then MP user is on dashboard page
    When MP user select login button
    Then MP user is on login page
    When MP user select forgot username link
    Then MP user is on forgot username  page
    When MP user enter id number "<id number>"
    And MP user enter cell number "<cell number>"
    And MP user select recover username button
    Then sms with username is sent to MP user
    And MP user is on the dashboard page

    Examples:
      | id number     | cell number |
      | 8809015466082 | 0731254585  |