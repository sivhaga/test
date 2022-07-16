@customer-pwa
Feature: As a Customer PWA (CP) user, I want to be able to view all important information in form of different widgets on one screen

  @pwa-test
  Scenario Outline: Successfully display all dashboard widgets
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    Then CP user balance is shown
    Then CP user can see job requests widget
    Then CP user can see active jobs widget
    Then CP user can see payments widget
    Then CP user can see my business widget
    Then CP user can see  industry widget
    Then CP user can see advertising widget
    Then CP user can see weather widget
    Then CP user can see utilities widget

    Examples:
      | username | password |
      | test     | test     |