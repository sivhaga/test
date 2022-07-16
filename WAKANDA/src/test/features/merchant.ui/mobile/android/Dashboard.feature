@merchant-ios
Feature: Dashboard - As a Merchant Android(MA) user, I want to be able to view all important information in form of different widgets on one screen

  @ios-test
  Scenario Outline: Successfully display all widgets
    Given MA user launch the Merchant app
    Then MA user can see Use PIN instead text
    When MA user click on Use PIN instead link
    And MA user enter pin "<pin>" to authenticate
    When MA user click on confirm button
    Then MA user is on dashboard page
    Then MA user can see job requests widget
    Then MA user can see active jobs widget
    Then MA user can see payments widget
    Then MA user can see my business widget
    Then MA user can see  industry widget
    Then MA user can see advertising widget
    Then MA user can see weather widget
    Then MA user can see utilities widget

    Examples:
      | pin  |
      |12345 |




