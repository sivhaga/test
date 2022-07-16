Feature: As a user I want to be able to make calls to the API Market Onboarding Service

  Background:
#    * def baseURL = 'https://q-api.wakago.net/apimarket/live'
#    * def clientId = 'bb748243-5c02-46dc-86a6-175e91144f73'
#    * def xNbSubscriptionId= '6b3527a7-859e-40ba-9e9a-34b5a40f7f6c'
#    * def clientSecret = 'R4vL6aN4tW2uE6lR3eQ2wH0bX7qO8eU4bV7oO8hR4iN5mD0lF0'
#    * configure proxy = proxy
    * def securityToken = read('TokenStore/AccessToken.txt')
    * def onbaordingSchema = {"Level": #string, "Description": #string}


  Scenario:Get Onboarding Levels (health-Check)
    Given url baseURL
    And path 'nb-ref-data/api/nb-ref-data/v1/health'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And match response contains onbaordingSchema

