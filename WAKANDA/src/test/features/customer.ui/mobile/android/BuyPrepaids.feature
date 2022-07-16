Feature: As a Customer Android(CA) user, I want to be able to buy prepaid airtime and data

  @android-test @pre-paid @smoke
  Scenario Outline: Buy airtime - enter amount
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select prepaids menu
    Then CA user is on prepaids page
    When CA user select airtime and bundles button
#    Then CA user is on select contact page
#    And CA user can see recent transactions
    When CA user search for and select contact "<contact>"
    Then CA user is on prepaids page
    And CA user can see recipient phone book contact list
    Then CA user can see selected recipient
    And CA user can see prepaid service providers
    When CA user select prepaid service provider "<service provider>"
    Then CA user can see selected prepaid service provider "<service provider>"
    When CA user select prepaid topup option "<topup option>"
    Then CA user can see selected prepaid topup option "<topup option>"
    And CA user can see available MobiMoney balance label
    When CA user select enter amount link
    Then CA user can see enter prepaid amount label
    When CA user enter prepaid amount "<amount>"
    Then CA user can see purchase now button
    When CA user select purchase now button
    Then CA user is on payment confirmation page
    When CA user select pay button
    Then CA user can see above daily limit error message

    Examples:
      | contact    | service provider | topup option | amount |
      | 0731254585 | mtn              | airtime      | 15     |

  @android-test @pre-paid @smoke
  Scenario Outline: Buy airtime - enter amount above max limit of 1000
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select prepaids menu
    Then CA user is on prepaids page
    When CA user select airtime and bundles button
    Then CA user is on select contact page
#    And CA user can see recent transactions
    When CA user search for and select contact "<contact>"
    Then CA user is on prepaids page
    And CA user can see recipient phone book contact list
    Then CA user can see selected recipient
    And CA user can see prepaid service providers
    When CA user select prepaid service provider "<service provider>"
    Then CA user can see selected prepaid service provider "<service provider>"
    When CA user select prepaid topup option "<topup option>"
    Then CA user can see selected prepaid topup option "<topup option>"
    And CA user can see available MobiMoney balance label
    When CA user select enter amount link
    Then CA user can see enter prepaid amount label
    When CA user enter prepaid amount "<amount>"
    Then CA user can see purchase now button
    When CA user select purchase now button
    Then CA user is on payment confirmation page
    When CA user select pay button
    Then CA user is on successful payment page
    When CA user select done button
    Then CA user is on dashboard page

    Examples:
      | contact    | service provider | topup option | amount |
      | 0731254585 | mtn              | airtime      | 15     |

  @android-test @pre-paid @smoke
  Scenario Outline: Buy data - pick bundle
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select categories menu
    Then CA user is on categories page
    When CA user select prepaids menu
    Then CA user is on prepaids page
    When CA user select airtime and bundles button
    Then CA user is on select contact page
    And CA user can see recent transactions
    When CA user search for and select contact "<contact>"
    Then CA user is on prepaids page
    And CA user can see recipient phone book contact list
    Then CA user can see selected recipient
    And CA user can see prepaid service providers
    When CA user select prepaid service provider "<service provider>"
    Then CA user can see selected prepaid service provider "<service provider>"
    When CA user select prepaid topup option <"topup option">
    Then CA user can see selected prepaid topup option "<topup option>"
    When CA user select pick a bundle dropdown list
    And CA user select a bundle "<bundle>" from the list
    Then CA user can see purchase now button
    When CA user select purchase now button
    Then CA user is on payment confirmation page
    When CA user select pay button
    Then CA user is on successful payment page
    When CA user select done button
    Then CA user is on dashboard page

    Examples:
      | contact    | service provider | topup option | bundle |
      | 0731254585 | mtn              | airtime      |        |

  @android-test @pre-paid
  Scenario Outline: Buy data - pick bundle above max limit of 1000
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    When CA user select categories menu
    Then CA user is on categories page
    When CA user select prepaids menu
    Then CA user is on prepaids page
    When CA user select airtime and bundles button
    Then CA user is on select contact page
    And CA user can see recent transactions
    When CA user search for and select contact "<contact>"
    Then CA user is on prepaids page
    And CA user can see recipient phone book contact list
    Then CA user can see selected recipient
    And CA user can see prepaid service providers
    When CA user select prepaid service provider "<service provider>"
    Then CA user can see selected prepaid service provider "<service provider>"
    When CA user select prepaid topup option "<topup option>"
    Then CA user can see selected prepaid topup option "<topup option>"
    When CA user select pick a bundle dropdown list
    And CA user select a bundle "<bundle>" from the list
    Then CA user can see purchase now button
    When CA user select purchase now button
    Then CA user is on payment confirmation page
    When CA user select pay button
    Then CA user can see above daily limit error message


    Examples:
      | contact    | service provider | topup option | bundle |
      | 0731254585 | mtn              | airtime      |        |


  @android-test @pre-paid @smoke
  Scenario Outline: Buy electricity
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
#    When CA user select categories menu
#    Then CA user is on categories page
#    When CA user select prepaids menu
#    Then CA user is on prepaids page
    When CA user select electricity button
    Then CA user is on buy electricity page
    When CA user search for and select contact "<contact>"
    Then CA user is on prepaids page
    And CA user can see recipient phone book contact list
    Then CA user is on buy electricity page
    And CA user can see recipient phone book contact list
    And CA user enter meter number "<meter number>"
    When CA user select save contact option "<option>"
    When CA user select next button
    Then CA user is on buy prepaid electricity page
    When CA user enter prepaid electricity amount "<amount>"
    And CA user enter description "<description"
    And CA user select send to recipient method "<method>"
    When CA user select buy button
    Then CA user is on prepaid electricity payment success page
    And CA user can prepaid electricity reference number
    And CA user can see share payment details button
    And CA user can see close button
    When CA user select close button
    Then CA user is on dashboard page

    Examples:
      | contact    | meter number | option  | method |
      | 0731254585 | 2327983278   | airtime | 15     |

  @android-test @pre-paid
  Scenario Outline: Buy electricity - above max limit of 1000
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
#    When CA user select categories menu
#    Then CA user is on categories page
#    When CA user select prepaids menu
#    Then CA user is on prepaids page
    When CA user select electricity button
    Then CA user is on buy electricity page
    When CA user is on select contacts button
    And CA user search for and select contact "<contact>"
    Then CA user is on prepaids page
    And CA user can see recipient phone book contact list
    And CA user enter meter number "<meter number>"
    When CA user select save contact option "<option>"
    When CA user select next button
    Then CA user is on buy prepaid electricity page
    When CA user enter prepaid electricity amount "<amount>"
    And CA user enter description "<description"
    And CA user select send to recipient method "<method>"
    When CA user select buy button
    Then CA user can see above daily limit error message


    Examples:
      | contact    | meter number | option  | method |
      | 0731254585 | 2327983278   | airtime | 1100   |


