@FunctionalTest@WebTest
Feature: Login Feature

  Background:


    Scenario Outline: Successful Login to Web Application
      Given user can access Vas Operations portal
      And user enters username <UserName> with password <Password>
      When user clicks Login button
      Then user is logged in successfully and sees the overview nav on the product overview page

      Examples:
      | UserName | Password |
      | test     | test     |

