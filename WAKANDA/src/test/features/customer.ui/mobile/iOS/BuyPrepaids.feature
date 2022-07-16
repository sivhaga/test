Feature: As a Customer iOS(CI) user, I want to be able to buy prepaid airtime and data

  @ios-test @pre-paid @smoke
  Scenario Outline: Buy airtime
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select prepaid menu
    Then CI user is on prepaid page
    When CI user select airtime and bundles button
    Then CI user is on airtime and data page
    And CI user can see recent transactions
    When CI user search for and select airtime or data recipient "<recipient>"
    Then CI user is on airtime and data page
#    Then CI user can see authorize app to view contacts message
    Then CI user can see selected recipient "<recipient>"
    And CI user can see prepaid service providers
    When CI user select prepaid service provider "<service provider>"
    Then CI user can see data and airtime top up options
    When CI user select prepaid top up option "<topup option>"
    When CI user enter prepaid amount "<amount>"
    When CI user enter prepaid description "<description>"
    Then CI user can see buy button
    When CI user select buy button
    Then CI user is on buy page
    And CI user can see to total payable amount label
    And CI user can see get personal loan tip
    And CI user can see use your waka points message
    When CI user select pay amount button
    Then CI user is on successful payment page
    When CI user select great thanks button
    Then CI user is on dashboard page

    Examples:
      | recipient  | service provider | topup option | amount | description     |
      | 0631234567 | MTN              | Airtime      | 15     | MTN Airtime     |
      | 0740037633 | Cell C           | Airtime      | 100    | Cell C Airtime  |
      | 0817166231 | Telkom           | Airtime      | 200    | Telkom Airtime  |
      | 0829806002 | Vodacom          | Airtime      | 150    | Vodacom Airtime |

  @ios-test @pre-paid @smoke
  Scenario Outline: Buy data
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select prepaid menu
    Then CI user is on prepaid page
    When CI user select airtime and bundles button
    Then CI user is on airtime and data page
    And CI user can see recent transactions
    When CI user search for and select airtime or data recipient "<recipient>"
#    Then CI user can see authorize app to view contacts message
#    Then CI user can see selected recipient
    And CI user can see prepaid service providers
    When CI user select prepaid service provider "<service provider>"
#    Then CI user can see selected prepaid service provider "<service provider>"
    When CI user select prepaid top up option "<topup option>"
#    Then CI user can see selected prepaid topup option "<topup option>"
    When CI user select pick a bundle dropdown list
    And CI user select a bundle "<bundle>" from the list
    When CI user select pay for data button
    When CI user select buy button
    Then CI user is on buy page
    And CI user can see to total payable amount label
    And CI user can see get personal loan tip
    And CI user can see use your waka points message
    When CI user select pay amount button
    Then CI user is on successful payment page
    When CI user select great thanks button
    Then CI user is on dashboard page

    Examples:
      | recipient  | service provider | topup option | bundle                                |
      | 0740037633 | Cell C           | Data         | Cell C 1 GB Prepaid Daily Data Bundle |
      | 0631234567 | MTN              | Data         | MTN 50 MB Prepaid Data Bundle         |
      | 0817166231 | Telkom           | Data         | Telkom 100 MB Prepaid Data Bundle     |
      | 0829806002 | Vodacom          | Data         | Vodacom 20 GB Prepaid Data Bundle     |


  @ios-test @pre-paid @smoke
  Scenario Outline: Buy electricity
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select prepaid menu
    Then CI user is on prepaid page
    When CI user select electricity button
    Then CI user is on electricity page
#    And CI user can see electricity recent transactions
    When CI user search for and select electricity recipient "<contact>"
#    Then CI user can see authorize app to view contacts message
#    When CI user select contacts button
#    Then CI user is on electricity page
    And CI user enter meter number "<meter number>"
#    When CI user select save contact option "<option>"
#    When CI user select next button
#    Then CI user is on buy prepaid electricity page
    When CI user enter prepaid electricity amount "<amount>"
#    And CI user enter description "<description>"
#    And CI user select send to recipient method "<method>"
    When CI user select prepaid pay button
    Then CI user is on buy page
    When CI user enter description "<description>"
    And CI user scroll the page down
    Then CI user can see get personal loan tip
    And CI user can see use your waka points message
    When CI user select pay amount button
    Then CI user is on buy page
    And CI user is on prepaid electricity payment success page
    And CI user can see share payment details button
    When CI user select great thanks button

    Then CI user is on dashboard page

    Examples:
      | contact | meter number | amount | description          |
      | David   | 2327983278   | 2000   | November electricity |

