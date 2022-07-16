@customer-android
Feature: As a Customer Android (CA) user I want to be able to search for products and services

  @android-test @search @smoke
  Scenario Outline: Home page search bar
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select search box to type
    Then CA user can see trending and recent searches
    When CA user search for item "<search item>"
    And CA user select a search item from results list
    And CA user select a search category "<search category>"
    Then CA user can see sub categories under the selected category
    When CA user select a subcategory "<subcategory>"
    Then CA user can see results under a subcategory

    Examples:
      | search item | search category | subcategory |
      | plumber     | Service         | Product     |
      | electrician | electrician     | Product     |

  @android-test @search
  Scenario Outline: Products search
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user navigate to products page
    Then CA user is on products page
    When CA user select product search box to type
    Then CA user can see trending and recent searches
    When CA user search for product "<product search item>"
    Then CA user can see product search item results list "<product search item>"
    Then CA user can see search categories
    When CA user select a product category "<search category>"
    Then CA user can see product sub categories results are shown
    When CA user select product search result from list
    Then CA user can see product search item "<product search item>" details page

    Examples:
      | product search item | search category | product search item | search category |
      | test                | All             | phone               | products        |

  @android-test @search
  Scenario Outline: Products search - product not found
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user navigate to products page
    Then CA user is on products page
    When CA user select product search box to type
    Then CA user can see trending and recent searches
    Then CA user can see suggestive results
    When CA user search for product "<product search item>"
    Then CA user can see product search item results list "<product search item>"
    Then CA user can see search categories
    When CA user select a product category "<search category>"
    Then CA user can see no results found page

    Examples:
      | product search item | search category | product search item | search category |
      | test                | All             | affds               | products        |

  @android-test @search
  Scenario Outline: Services search - most searched
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user navigate to services page
    Then CA user is on services page
    When CA user select services search box to type
    Then CA user can see trending and recent searches
    Then CA user can see most searched services
    When CA user select one of the most searched service "<most searched service>"
    Then CA user can see most searched service "<most searched service>" results
    Then CA user can see get what want faster text

    Examples:
      | most searched service |
      | Plumber               |

  @android-test @search
  Scenario Outline: Services search - full search
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user navigate to services page
    Then CA user is on services page
    When CA user select services search box to type
    Then CA user can see trending and recent searches
    Then CA user can see most searched services
    When CA user search for service "<service>"
    Then CA user can see service search results "<service>"
    Then CA user can see get what want faster link
    When CA user select get what you want faster link
    Then CA user is on chat page
    When CA user select chat page more button
    Then CA user can see more options
    When CA user select in chat search
    Then CA user can see in chat search box
    When CA user search for service "<search criteria>" in chat
    Then CA user can see chat messages matching "<search criteria>"

    Examples:
      | service | search criteria |
      | Plumber |                 |

  @android-test @search
  Scenario Outline: Order history search
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user select search for orders button
    Then CA user is on orders search page
    Then CA user can see ongoing and past orders
    When CA user search for an order "<order>"
    When CA user select order status "<order status>"
    Then CA user can see order results under selected order status "<order status>"
    When CA user select order from the results list
    Then CA user can see order details page

    Examples:
      | username | password | order   | order status |
      | test     | test     | plumber | in progress  |

  @android-test @search
  Scenario Outline: Order history search - order not found
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user select search for orders button
    Then CA user is on orders search page
    Then CA user can see ongoing and past orders
    When CA user search for an order "<order>"
    When CA user select order status "<order status>"
    Then CA user can see order results under selected order status "<order status>"
    Then CA user can see order is not found page

    Examples:
      | username | password | order | order status |
      | test     | test     |       | Completed    |

  @android-test @search
  Scenario Outline: Wallet transaction search
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user select search for wallet button
    Then CA user is on wallet search page
    Then CA user can see  payments from the selected wallet
    Then CA user search for a specific wallet transaction "<wallet transaction>"
    Then CA user can see wallet transaction "<wallet transaction>" results
    When CA user select a wallet transaction from result list
    Then CA user can see wallet transaction details page

    Examples:
      | username | password | wallet transaction |
      | test     | test     |                    |

  @android-test @search
  Scenario Outline: Wallet transaction search - No Results Found
    Given CA user launch the customer android app
    Then CA user can see dashboard page
    When CA user select search for wallet button
    Then CA user is on wallet search page
    Then CA user can see  payments from the selected wallet
    Then CA user search for a specific wallet transaction "<wallet transaction>"
    Then CA user can see wallet transaction "<wallet transaction>" results
    When CA user select a wallet transaction from result list
    Then CA user can see no results found page

    Examples:
      | username | password | wallet transaction |
      | test     | test     |                    |