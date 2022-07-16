@customer-ios
Feature: As a Customer iOS (CI) user, I want to be able to view all important information in form of different widgets on one screen

  @ios-test @dashboard
  Scenario Outline: Successfully display all dashboard widgets
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
#    When CI user select login button
#    Then CI user is on login with PIN page
#    Then CI user can see Use PIN link
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" as PIN
#    When CI user select login button
#    Then CI user is on the dashboard page
    Then CI user balance is shown
    Then CI user can see job requests widget
    Then CI user can see active jobs widget
    Then CI user can see payments widget
    Then CI user can see my business widget
    Then CI user can see  industry widget
    Then CI user can see advertising widget
    Then CI user can see weather widget
    Then CI user can see utilities widget

    Examples:
      | pin  |
      | test |