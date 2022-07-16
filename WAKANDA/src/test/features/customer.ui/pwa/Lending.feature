@customer-pwa
Feature: Banking services - Lending

  @pwa-test
  Scenario Outline: Apply for a personal loan
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select offers button
    Then CP user is on offers page
    When CP user select personal loans button
    Then CP user is on you could qualify for instant loan page
    When CP user consent they have regular income
    When CP user consent they have no spouse to object
    When CP user consent they are are not insolvent
    When CP user select get your pre approved loan button
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user accepts terms and conditions
    When CP user select accept and confirm button
    Then CP user is on congratulations page
    When CP user select done button
    Then CP user is on the dashboard page

    Examples:
      | wakanda username | wakanda password | nedbank username | nedbank password | number of months to pay |
      | 12345            | test             |                  |                  |                         |


  @pwa-test
  Scenario Outline: Get loan during e-commerce checkout - accept offer
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    When CP user select get a Personal Loan for all your purchases!
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user select accept and confirm button
    Then CP user is on congratulations page
    When CP user select continue to cart button

    Examples:
      | wakanda username | wakanda password | nedbank username | nedbank password | number of months to pay |
      | 12345            | test             |                  |                  |                         |

  @pwa-test
  Scenario Outline: Get loan during e-commerce checkout - edit financial info
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    When CP user select get a Personal Loan for all your purchases!
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When CP user change monthly income "<monthly income>"
    When CP user change monthly debt "<monthly debt>"
    When CP user change monthly expenses "<monthly expenses>"
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user select accept and confirm button
    Then CP user is on congratulations page
    When CP user select continue to cart button

    Examples:
      | wakanda username | wakanda password | nedbank username | nedbank password | monthly income | monthly debt | monthly expenses | number of months to pay |
      | 12345            | test             |                  |                  |                |              |                  |                         |

  @pwa-test
  Scenario Outline: Get loan during e-commerce checkout - decline offer
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    When CP user select shopping cart icon
    Then CP user is on shopping cart page
    When CP user select get a Personal Loan for all your purchases!
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user select decline button
    Then CP user is on decline offer page
    When CP user select reason for declining "<reason for declining>" an offer
    When CP user select decline and exit button

    Examples:
      | wakanda username | wakanda password | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345            | test             |                  |                  |                         |                      |

  @pwa-test
  Scenario Outline: Topup with loan as a payment method - accept offer
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then CP user is on add money page
    When CP user select instant financing
    And CP user select continue button
    When CP user select get a Personal Loan for all your purchases!
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user select decline button
    Then CP user is on decline offer page
    When CP user select reason for declining "<reason for declining>" an offer
    When CP user select decline and exit button

    Examples:
      | wakanda username | wakanda password | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345            | test             |                  |                  |                         |                      |

  @pwa-test
  Scenario Outline: Topup with loan as a payment method - decline offer
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select on my money
    Then CP user is able to see top up tab
    When CP user select Top Up
    Then CP user is on add money page
    When CP user select instant financing
    And CP user select continue button
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user select decline button
    Then CP user is on decline offer page
    When CP user select reason for declining "<reason for declining>" an offer
    When CP user select decline and exit button

    Examples:
      | wakanda username | wakanda password | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345            | test             |                  |                  |                         |                      |

  Scenario Outline: Personal loan from sms notification
    Given CP user receives personal loan sms notification
    When CP user select pre-approved loan sms
    Then CP user is on you could qualify for instant loan page
    When CP user consent they have regular income
    When CP user consent they have no spouse to object
    When CP user consent they are are not insolvent
    When CP user select get your pre approved loan button
    Then CP user is on connect your Nedbank account page
    When CP user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CP user select Nedbank id login button
    Then CP user is on financial information page
    When user give consent for credit and affordability check
    When CP user select next button
    Then CP user is on loan offer page
    When CP user select number of months to pay "<number of months to pay>"
    When CP user select next button
    Then CP user can see loan offer details page
    When CP user select next button
    Then CP user is on declarations page
    When CP user accepts they have read offer documentation
    When CP user accepts terms and conditions
    When CP user select decline button
    Then CP user is on decline offer page
    When CP user select reason for declining "<reason for declining>" an offer
    When CP user select decline and exit button

    Examples:
      | nedbank username | nedbank password | number of months to pay | reason for declining |
      |                  |                  |                         |                      |