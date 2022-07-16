@customer-pwa
Feature: On-boarding

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - invalid otp
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user cann see sigmn up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give caccepts marketing policy
    And CP user select generate otp button
    Then CP user is on otp verification page
    When CP user enter otp "<otp>" to verify mobile number
    And CP user select verify button
    Then CP user can see invalid otp error message

    Examples:
      | south african id | cell phone number | otp |
      |                  |                   |     |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - resend otp
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user cann see sigmn up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give caccepts marketing policy
    And CP user select generate otp button
    Then CP user is on otp verification page
    When CP user select resend otp link
    Then CP user can recieve newly generated otp
    When CP user enter old otp "<old otp>"
    And CP user select verify button
    Then CP user can see invalid otp error message
    When CP user enter otp "<new otp>" to verify mobile number
    And CP user select verify button
    Then CP user is on take a selfie page

    Examples:
      | south african id | cell phone number | old otp | new otp |
      |                  |                   |         |         |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - dha fails and no bureau record (no occupation and no address)
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    # step missing
    Then CP user is on personal details page
    When CP user enter first name "<first name>"
    And CP user enter last name "<last name>"
    And CP user enter occupation "<occupation>"
    And CP user enter email address "<email address>"
    And CP user select next button
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on welcome to wakanda page
    When CP user select start exploring button
    Then CP user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | occupation | otp | password | confirm password | pin | confirm pin |
      |                  |                   |            |           |            |     |          |                  |     |             |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - dha fails, bureau record (yes occupation and no address)
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    # step missing
    Then CP user is on personal details page
    When CP user enter first name "<first name>"
    And CP user enter last name "<last name>"
    And CP user enter email address "<email address>"
    And CP user select next button
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on welcome to wakanda page
    When CP user select start exploring button
    Then CP user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | otp | password | confirm password | pin | confirm pin |
      |                  |                   |            |           |     |          |                  |     |             |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - dha fails, has bureau record (yes occupation and yes address)
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    # step missing
    Then CP user is on personal details page
    When CP user enter first name "<first name>"
    And CP user enter last name "<last name>"
    And CP user enter occupation "<occupation>"
    And CP user enter email address "<email address>"
    And CP user select next button
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on welcome to wakanda page
    When CP user select start exploring button
    Then CP user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | first name | last name | otp | password | confirm password | pin | confirm pin |
      |                  |                   |            |           |     |          |                  |     |             |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - dha passes, no bureau record (no occupation and no address)
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    # step missing
    Then CP user is on personal details page
    When CP user enter first name "<first name>"
    And CP user enter last name "<last name>"
    And CP user enter occupation "<occupation>"
    And CP user enter email address "<email address>"
    And CP user select next button
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on welcome to wakanda page
    When CP user select start exploring button
    Then CP user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | occupation | otp | password | confirm password | pin | confirm pin |
      |                  |                   |            |     |          |                  |     |             |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - dha passes,has bureau record (yes occupation and no address)
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    # step missing
    Then CP user is on personal details page
    When CP user enter first name "<first name>"
    And CP user enter last name "<last name>"
    And CP user enter email address "<email address>"
    And CP user select next button
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on welcome to wakanda page
    When CP user select start exploring button
    Then CP user can see upgrade my wallet link

    Examples:
      | south african id | cell phone number | otp |
      |                  |                   |     |

  @pwa-test
  Scenario Outline: New to wakanda and new to nedbank - dha passes,has bureau record (yes occupation and yes address)
    Given CP user launch the customer web
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    # step missing
    Then CP user is on personal details page
    When CP user enter first name "<first name>"
    And CP user enter last name "<last name>"
    And CP user enter email address "<email address>"
    And CP user select next button
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on welcome to wakanda page
    When CP user select start exploring button
    Then CP user can see upgrade my wallet link
    Examples:
      | south african id | cell phone number | otp | password | confirm password | pin | confirm pin |
      |                  |                   |     |          |                  |     |             |

  @pwa-test
  Scenario Outline: Existing mobi money users
    Given CP user launch the customer android app
    Then CP user is on dashboard page
    And CP user can see sign up button
    When CP user select sign up button
    Then CP user is on sign up page
    When CP user enter south african id "<south african id>"
    And CP user enter cell phone number "<cell phone number>"
    And CP user give consent to wakanda to process personal info
    And CP user give accepts wakanda app terms and conditions
    And CP user give accepts marketing policy
    And CP user select generate otp button
    Then CP user is on otp verification page
    When CP user enter otp "<otp>" to verify mobile number
    And CP user select verify button
    Then CP user is on take a selfie page
    And CP user select continue button
    When CP user capture facial biometric
    Then CP user is on the hang in there page
    # step missing
    Then CP user is on set login details page
    When CP user enters username "<username>"
    And CP user enter new password "<password>"
    And CP user confirm password "<confirm password>"
    And CP user select next button
    Then CP user is on set account page
    When CP user setup pin "<pin>"
    And CP user select next button
    Then CP user is on confirm pin page
    When CP user confirm pin "<confirm pin>"
    Then CP user can see device biometric is enabled
    When CP user select save pin button
    Then CP user is on welcome to wakanda page
    And CP user can see you can now user your MobiMoney wallet on wakanda text
    When CP user select start exploring button

    Examples:
      | south african id | cell phone number | otp |
      |                  |                   |     |