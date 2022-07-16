Feature: As a user I want to be able to make calls to the API Market reference data

  Background:
#    * def baseURL = 'https://q-api.wakago.net/apimarket/live'
#    * def clientId = 'bb748243-5c02-46dc-86a6-175e91144f73cfvc'
#    * def clientSecret = 'R4vL6aN4tW2uE6lR3eQ2wH0bX7qO8eU4bV7oO8hR4iN5mD0lF0'
#    * configure proxy = proxy
    * def securityToken = read('TokenStore/AccessToken.txt')
    * def TypesSchema = {"Code": #string, "Description": #string}
    * def suburbSchema = {"Suburb": #string, "City": #string, "PostalCode": #string, "AddressType": #string}

    Scenario:Get List of Occupational Types
      Given url baseURL
      And path 'nb-ref-data/api/nb-ref-data/v1/occupation-types'
      And header Authorization = 'Bearer '+ securityToken
      And header x-ibm-client-secret = clientSecret
      And header x-ibm-client-id = clientId
      When method get
      Then status 200
      And print response
      And match response contains TypesSchema

  Scenario:Get List of Income Types
    Given url baseURL
    And path 'nb-ref-data/api/nb-ref-data/v1/income-types'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response contains TypesSchema

  Scenario:Get List of Industry Types
    Given url baseURL
    And path 'nb-ref-data/api/nb-ref-data/v1/industry-types'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response contains TypesSchema

  Scenario Outline:Get Suburb by Suburb Name
    Given url baseURL
    And path 'nb-ref-data/api/nb-ref-data/v1/suburbs'
    And param postaltype = '<postaltype>'
    And param suburb = '<suburb>'
    And header Authorization = 'Bearer '+ securityToken
    And header x-ibm-client-secret = clientSecret
    And header x-ibm-client-id = clientId
    When method get
    Then status 200
    And print response
    And match response contains suburbSchema

    Examples:
    | postaltype | suburb   |
    | STR        | RANDBURG |
    | STR        | MIDRAND  |



