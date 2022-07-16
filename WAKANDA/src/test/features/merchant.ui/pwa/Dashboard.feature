@customer-pwa
Feature: As a Merchant PWA (MP) user, I want to be able to view all important information in form of different widgets on one screen

  @pwa-test
  Scenario Outline: Successfully display all dashboard widgets
    Given MP user launch the customer web
    Then MP user is on the dashboard page
    When MP user enters username "<username>" with password "<password>"
    When MP user select login
    Then MP user is on the dashboard page
    Then MP user balance is shown
    Then MP user can see job requests widget
    Then MP user can see active jobs widget
    Then MP user can see payments widget
    Then MP user can see my business widget
    Then MP user can see  industry widget
    Then MP user can see advertising widget
    Then MP user can see weather widget
    Then MP user can see utilities widget

    Examples:
      | username | password |
      | test     | test     |




