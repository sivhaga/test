@merchant-ios
Feature: Dashboard - As a Merchant ios (MI) user, I want to be able to view all important information in form of different widgets on one screen

  @ios-test
  Scenario Outline: Successfully display all widgets
    Given MI user launch the merchant ios app
#    Then MI user is on authentication page
#    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on the dashboard page
    Then MI user can see job requests widget
    Then MI user can see active jobs widget
    Then MI user can see payments widget
    Then MI user can see my business widget
    Then MI user can see  industry widget
    Then MI user can see advertising widget
    Then MI user can see weather widget
    Then MI user can see utilities widget

    Examples:
      | pin  |
      |12345 |




