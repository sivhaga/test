Feature: As a Vas user I want to be able to create and manage products

  Background:
#    * def baseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1'
    * configure Timeout = 500000
    * def auditSchema = {  }

  @regression
  @UID8677-105
  Scenario: Get Audit
    Given path '/operations/v1/audits'
    And url baseURL
    And configure proxy = proxy
    And configure connectTimeout = Timeout
    And print '######## Found saved security token ######## '+securityToken
    And header Authorization = 'Bearer '+securityToken
    And header x-ibm-client-id = xIbmClientId
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match response.data == '#[] auditSchema'