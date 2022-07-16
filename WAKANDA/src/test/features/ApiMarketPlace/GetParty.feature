Feature: As a user I want to be able to make calls to the API Market Customer Service

  Background:
#    * def baseURL = 'https://q-api.wakago.net/apimarket/live'
#    * def clientId = 'bb748243-5c02-46dc-86a6-175e91144f73'
#    * def clientSecret = 'R4vL6aN4tW2uE6lR3eQ2wH0bX7qO8eU4bV7oO8hR4iN5mD0lF0'
#    * configure proxy = proxy
    * def securityToken = read('TokenStore/AccessToken.txt')
    * def NationalProfileSchema = {"FirstName": #string, "Surname": #string, "Photo": #string}
    * def BankStatusSchema = {"usableNedbankId": #boolean, "hasNedbankRecord": #boolean, "partyTypeIndicator": #string, "ficaStatus": #string, "partyId": #string, "walletId": #string, "walletExists": #boolean }



  Scenario Outline:Get Party with an Invalid ID Number
    Given url baseURL
    And path '/bus/customers/<partyId>'
    And param consent-type = <consent-type>
    And param consent-date = <consent-date>
    And param consent = <consent>
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 400
    And print response

    Examples:
      | partyId | consent-type | consent-date | consent |
      | 1234    | 123          | 123          | 123     |

  Scenario Outline:Get Party
    Given url baseURL
    And path '/bus/customers/<partyId>'
    And param consent-type = <consent-type>
    And param consent-date = <consent-date>
    And param consent = <consent>
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response.FirstName != ''

    Examples:
      | partyId         | consent-type | consent-date | consent |
      | 110546427804    | 123          | 123          | 123     |
