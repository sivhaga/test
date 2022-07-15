@webtest
Feature: Login

  Background:


    @webtest
    Scenario Outline: Successful Login to Web Application
      	Given user launch web application
      	When user enters username <username> with password <password>
      	And user clicks login button
      	Then user is on the dashboard page

 	Examples:
      	| username | password |
      	| test     | test     |

    @webtest
    Scenario Outline: Valid username and invalid password
 	Given user launch web application
   	When user enters username <username> with password <password>
  	And user clicks login button
 	Then The user can see invalid credentials message

    Examples:
      | username | password |
      | test     | abc    |

    @webtest
    Scenario Outline: Invalid username and valid password
 	Given user launch web application
   	When user enters username <username> with password <password>
  	And user clicks login button
 	Then The user can see invalid credentials message

    Examples:
      | username | password |
      | abc     | test    |


    @webtest
    Scenario Outline: Invalid username and invalid password
 	Given user launch web application
   	When user enters username <username> with password <password>
  	And user clicks login button
 	Then The user can see invalid credentials message

    Examples:
      | username | password |
      | abc     | abc    |



  