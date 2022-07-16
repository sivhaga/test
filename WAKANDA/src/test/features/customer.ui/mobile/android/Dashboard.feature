@customer-android
Feature: As a Customer Android (CA) user, I want to be able to view all important information in form of different widgets on one screen

  @android-test @dashboard
  Scenario: Successfully display all dashboard widgets
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    Then CA user is on login with PIN page
    When CA user select login button
    Then CA user is on the dashboard page
    Then CA user balance is shown
    Then CA user can see job requests widget
    Then CA user can see active jobs widget
    Then CA user can see payments widget
    Then CA user can see entertainment widget
    Then CA user can see my business widget
    Then CA user can see industry widget
    Then CA user can see advertising widget
    Then CA user can see weather widget
    Then CA user can see utilities widget