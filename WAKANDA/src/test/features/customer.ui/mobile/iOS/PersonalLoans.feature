@customer-ios
Feature: Banking services - Lending

  @ios-test @personal-loans @smoke
  Scenario Outline: Apply for a personal loan - accept offer
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select take a loan button
    Then CI user is on instant loan page
    When CI user consent they have regular income
    When CI user consent they have no spouse to object
    When CI user consent they are are not insolvent
    When CI user select get your pre approved loan button
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    And CI user select authorise button
    Then CI user is on financial information page
    When CI user enter net monthly income "<net monthly income>"
    When CI user enter total monthly expenses "<total monthly expenses>"
    When CI user enter monthly contractual debt "<monthly contractual debt>"
    When CI user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user enter email address "<email address>"
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select accept and confirm button
    Then CI user is on congratulations page
    When CI user select done button
    Then CI user is on the dashboard page

    Examples:
      | nedbank username | nedbank password | net monthly income | total monthly expenses | monthly contractual debt | number of months to pay | email address  |
      | GhostAcc83       | Testing123*      | 50000              | 15000                  | 10000                    | 6                       | baba@gmail.com |

  @ios-test @personal-loans
  Scenario Outline: Apply for a personal loan - decline offer
    Given CI user launch the customer ios app
    When CI user select take a loan button
    When CI user select personal loans category
    Then CI user is on instant loan page
    When CI user consent they have regular income
    When CI user consent they have no spouse to object
    When CI user consent they are are not insolvent
    When CI user select get your pre approved loan button
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    And CI user select authorise button
    Then CI user is on financial information page
    When CI user enter net monthly income "<net monthly income>"
    When CI user enter total monthly expenses "<total monthly expenses>"
    When CI user enter monthly contractual debt "<monthly contractual debt>"
    When CI user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user enter email address "<email address>"
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select decline button
    Then CI user is on decline loan offer page
    When CI user select decline reason "<reason>"
    And CI user select back to loan offer page
    Then CI user is on declarations page
    And CI user select decline button
    Then CI user is on decline loan offer page
    When CI user select decline and exit button
    Then CI user is on dashboard page

    Examples:
      | nedbank username | nedbank password | net monthly income | total monthly expenses | monthly contractual debt | number of months to pay | email address  |
      | GhostAcc83       | Testing123*      | 50000              | 15000                  | 10000                    | 6                       | baba@gmail.com |


  @ios-test @personal-loans
  Scenario Outline: Get loan during e-commerce checkout - accept offer
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select login button
    Then CI user is on login page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select login button
    Then CI user is on the dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    When CI user select get a Personal Loan for all your purchases!
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    Then CI user is on financial information page
    When user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select accept and confirm button
    Then CI user is on congratulations page
    When CI user select continue to cart button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay |
      | 12345 |                  |                  |                         |

  @ios-test @personal-loans
  Scenario Outline: Get loan during e-commerce checkout - edit financial info
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select login button
    Then CI user is on login page
    And CI user enters username "<wakanda username>" with password "<wakanda password>"
    When CI user select login button
    Then CI user is on the dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    When CI user select get a Personal Loan for all your purchases!
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    Then CI user is on financial information page
    When CI user enter net monthly income "<net monthly income>"
    When CI user enter total monthly expenses "<total monthly expenses>"
    When CI user enter monthly contractual debt "<monthly contractual debt>"
    When CI user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select accept and confirm button
    Then CI user is on congratulations page
    When CI user select continue to cart button

    Examples:
      | pin   | nedbank username | nedbank password | net monthly income | total monthly expenses | monthly contractual debt | number of months to pay |
      | 12345 |                  |                  |                    |                        |                          |                         |

  @ios-test @personal-loans
  Scenario Outline: Get loan during e-commerce checkout - decline offer
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select login button
    Then CI user is on login page
    And CI user enters username "<wakanda username>" with password "<wakanda password>"
    When CI user select login button
    Then CI user is on the dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select shopping cart icon
    Then CI user is on shopping cart page
    When CI user select get a Personal Loan for all your purchases!
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    Then CI user is on financial information page
    When CI user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select decline button
    Then CI user is on decline offer page
    When CI user select reason for declining "<reason for declining>" an offer
    When CI user select decline and exit button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345 |                  |                  |                         |                      |

  @ios-test @personal-loans
  Scenario Outline: Topup with loan as a payment method - accept offer
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select login button
    Then CI user is on login page
    And CI user enters username "<wakanda username>" with password "<wakanda password>"
    When CI user select login button
    Then CI user is on the dashboard page
    When CI user select on my money
    Then CI user is able to see top up tab
    When CI user select Top Up
    Then CI user is on add money page
    When CI user select instant financing
    And CI user select continue button
    When CI user select get a Personal Loan for all your purchases!
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    Then CI user is on financial information page
    When user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select decline button
    Then CI user is on decline offer page
    When CI user select reason for declining "<reason for declining>" an offer
    When CI user select decline and exit button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345 |                  |                  |                         |                      |

  @ios-test @personal-loans
  Scenario Outline: Topup with loan as a payment method - decline offer
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select login button
    Then CI user is on login page
    And CI user enters username "<wakanda username>" with password "<wakanda password>"
    When CI user select login button
    Then CI user is on the dashboard page
    When CI user select on my money
    Then CI user is able to see top up button
    When CI user select top up button
    Then CI user is on add money page
    When CI user select instant financing
    And CI user select continue button
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    Then CI user is on financial information page
    When user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select decline button
    Then CI user is on decline offer page
    When CI user select reason for declining "<reason for declining>" an offer
    When CI user select decline and exit button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345 |                  |                  |                         |                      |

  @ios-test @personal-loans
  Scenario Outline: Personal loan from sms notification
    Given CI user receives personal loan sms notification
    When CI user select pre-approved loan sms
    Then CI user is on you could qualify for instant loan page
    When CI user consent they have regular income
    When CI user consent they have no spouse to object
    When CI user consent they are are not insolvent
    When CI user select get your pre approved loan button
    Then CI user is on connect your Nedbank account page
    When CI user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CI user select Nedbank id login button
    Then CI user is on financial information page
    When user give consent for credit and affordability check
    When CI user select next button
    Then CI user is on loan offer page
    When CI user select number of months to pay "<number of months to pay>"
    When CI user select next button
    Then CI user can see loan offer details page
    When CI user select next button
    Then CI user is on declarations page
    When CI user accepts they have read offer documentation
    When CI user accepts terms and conditions
    When CI user select decline button
    Then CI user is on decline offer page
    When CI user select reason for declining "<reason for declining>" an offer
    When CI user select decline and exit button

    Examples:
      | nedbank username | nedbank password | number of months to pay | reason for declining |
      |                  |                  |                         |                      |