@customer-android
Feature: As a customer android (CA) user i want to be able to apply for a personal loan

  @android-test @personal-loans @smoke
  Scenario Outline: Apply for a personal loan - accept offer
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select personal loans button
    Then CA user is on instant loan page
    When CA user consent they have regular income
    When CA user consent they have no spouse to object
    When CA user consent they are are not insolvent
    When CA user select get your pre approved loan button
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When CA user select income type "<income type>"
    When CA user enter net monthly income "<net monthly income>"
    When CA user enter total monthly expenses "<total monthly expenses>"
    When CA user enter monthly contractual debt "<monthly contractual debt>"
    When CA user enter monthly living expenses "<living expenses>"
    When CA user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user enter email address "<email address>"
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select accept and confirm button
    Then CA user is on congratulations page
    When CA user select done button
    Then CA user is on the dashboard page

    Examples:
      | nedbank username | nedbank password | income type | net monthly income | total monthly expenses | monthly contractual debt | living expenses | number of months to pay | email address  |
      | Testhome23       | Testing1!        |             | 150000             | 5000                   | 10000                    | 10000           |                         | baba@gmail.com |

  @android-test @personal-loans
  Scenario Outline: Apply for a personal loan - decline offer
    Given CA user launch the customer android app
    When CA user select personal loans button
    Then CA user is on dashboard page
    When CA user select personal loans category
    Then CA user is on instant loan page
    When CA user consent they have regular income
    When CA user consent they have no spouse to object
    When CA user consent they are are not insolvent
    When CA user select get your pre approved loan button
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When CA user select income type "<income type>"
    When CA user enter net monthly income "<net monthly income>"
    When CA user enter total monthly expenses "<total monthly expenses>"
    When CA user enter monthly contractual debt "<monthly contractual debt>"
    When CA user enter monthly living expenses "<living expenses>"
    When CA user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user enter email address "<email address>"
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select decline button
    Then CA user is on decline loan offer page
    When CA user select decline reason "<reason>"
    And CA user select back to loan offer page
    Then CA user is on declarations page
    And CA user select decline button
    Then CA user is on decline loan offer page
    When CA user select decline and exit button
    Then CA user is on dashboard page

    Examples:
      | pin   | wakanda password | nedbank username | nedbank password | income type | net monthly income | total monthly expenses | monthly contractual debt | living expenses | number of months to pay | email address | reason |
      | 12345 | Testhome23       | Testing1!        | Flexible income  | 150000      | 5000               | 10000                  | 10000                    |                 | baba@gmail.com          |               |        |


  @android-test @personal-loans
  Scenario Outline: Get loan during e-commerce checkout - accept offer
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select login button
    Then CA user is on the dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    When CA user select get a Personal Loan for all your purchases!
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select accept and confirm button
    Then CA user is on congratulations page
    When CA user select continue to cart button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay |
      | 12345 |                  |                  |                         |

  @android-test @personal-loans
  Scenario Outline: Get loan during e-commerce checkout - edit financial info
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login page
    And CA user enters username "<wakanda username>" with password "<wakanda password>"
    When CA user select login button
    Then CA user is on the dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    When CA user select get a Personal Loan for all your purchases!
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When CA user change monthly income "<monthly income>"
    When CA user change monthly debt "<monthly debt>"
    When CA user change monthly expenses "<monthly expenses>"
    When user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select accept and confirm button
    Then CA user is on congratulations page
    When CA user select continue to cart button

    Examples:
      | pin   | nedbank username | nedbank password | monthly income | monthly debt | monthly expenses | number of months to pay |
      | 12345 |                  |                  |                |              |                  |                         |

  @android-test @personal-loans
  Scenario Outline: Get loan during e-commerce checkout - decline offer
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login page
    And CA user enters username "<wakanda username>" with password "<wakanda password>"
    When CA user select login button
    Then CA user is on the dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select shopping cart icon
    Then CA user is on shopping cart page
    When CA user select get a Personal Loan for all your purchases!
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select decline button
    Then CA user is on decline offer page
    When CA user select reason for declining "<reason for declining>" an offer
    When CA user select decline and exit button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345 |                  |                  |                         |                      |

  @android-test @personal-loans
  Scenario Outline: Topup with loan as a payment method - accept offer
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login page
    And CA user enters username "<wakanda username>" with password "<wakanda password>"
    When CA user select login button
    Then CA user is on the dashboard page
    When CA user select on my money
    Then CA user is able to see top up tab
    When CA user select Top Up
    Then CA user is on add money page
    When CA user select instant financing
    And CA user select continue button
    When CA user select get a Personal Loan for all your purchases!
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select decline button
    Then CA user is on decline offer page
    When CA user select reason for declining "<reason for declining>" an offer
    When CA user select decline and exit button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345 |                  |                  |                         |                      |

  @android-test @personal-loans
  Scenario Outline: Topup with loan as a payment method - decline offer
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login page
    And CA user enters username "<wakanda username>" with password "<wakanda password>"
    When CA user select login button
    Then CA user is on the dashboard page
    When CA user select on my money
    Then CA user is able to see top up button
    When CA user select top up button
    Then CA user is on add money page
    When CA user select instant financing
    And CA user select continue button
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select decline button
    Then CA user is on decline offer page
    When CA user select reason for declining "<reason for declining>" an offer
    When CA user select decline and exit button

    Examples:
      | pin   | nedbank username | nedbank password | number of months to pay | reason for declining |
      | 12345 |                  |                  |                         |                      |

  @android-test @personal-loans
  Scenario Outline: Personal loan from sms notification
    Given CA user receives personal loan sms notification
    When CA user select pre-approved loan sms
    Then CA user is on you could qualify for instant loan page
    When CA user consent they have regular income
    When CA user consent they have no spouse to object
    When CA user consent they are are not insolvent
    When CA user select get your pre approved loan button
    Then CA user is on connect your Nedbank account page
    When CA user enter Nedbank id username "<nedbank username>" and password "<nedbank password>"
    When CA user select Nedbank id login button
    Then CA user is on financial information page
    When user give consent for credit and affordability check
    When CA user select next button
    Then CA user is on loan offer page
    When CA user select number of months to pay "<number of months to pay>"
    When CA user select next button
    Then CA user can see loan offer details page
    When CA user select next button
    Then CA user is on declarations page
    When CA user accepts they have read offer documentation
    When CA user accepts terms and conditions
    When CA user select decline button
    Then CA user is on decline offer page
    When CA user select reason for declining "<reason for declining>" an offer
    When CA user select decline and exit button

    Examples:
      | nedbank username | nedbank password | number of months to pay | reason for declining |
      |                  |                  |                         |                      |

  @android-test @personal-loans
  Scenario: Personal loan - Foreign national application

  @android-test @personal-loans
  Scenario: Personal loan - Clients under debt review

  @android-test @personal-loans
  Scenario: Personal loan - Clients flagged for fraud

  @android-test @personal-loans
  Scenario: Personal loan - Tax obligations

  @android-test @personal-loans
  Scenario: Personal loan - Register NedId


