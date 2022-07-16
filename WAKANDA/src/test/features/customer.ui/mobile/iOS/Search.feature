@customer-ios
Feature: As a Customer iOS (CI) user I want to be able to search for products and services

  @ios-test @search @smoke
  Scenario Outline: Home page search bar
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select search box to type
    Then CI user can see trending and recent searches
    When CI user search for item "<search item>"
    And CI user select a search item "<search item>" from results list
    When CI user select a subcategory "<subcategory>"
    Then CI user can see results under a subcategory

    Examples:
      | search item | subcategory |
      | Plumber     | SERVICE     |
      | Furniture   | PRODUCT     |


  @ios-test @search
  Scenario Outline: Products search
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user navigate to products page
    Then CI user is on shopping page
    When CI user select product search box to type
    Then CI user can see suggestive results
    When CI user search for product "<generic search item>"
    Then CI user can see product search item results list "<generic search item>"
    Then CI user can see search categories
    When CI user select a product category "<search category>"
    Then CI user can see product sub categories results are shown
    When CI user select product search result from list
    Then CI user can see product search item "<product search item>" details page

    Examples:
      | product search item | generic search item | product search item | search category |
      | test                | All                 | phone               | products        |

  @ios-test @search
  Scenario Outline: Products search - product not found
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user navigate to products page
    Then CI user is on products page
    When CI user select product search box to type
    Then CI user can see suggestive results
    When CI user search for product "<product search item>"
    Then CI user can see product search item results list "<product search item>"
    Then CI user can see search categories
    When CI user select a product category "<search category>"
    Then CI user can see no results found page

    Examples:
      | product search item | search category | product search item | search category |
      | tesdghsghdgst       | All             | affds               | products        |

  @ios-test @search
  Scenario Outline: Services search - most searched
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user navigate to services page
    Then CI user is on services page
    When CI user select services search box to type
    Then CI user can see trending and recent searches
    Then CI user can see most searched services
    When CI user select one of the most searched service "<most searched service>"
    Then CI user can see most searched service "<most searched service>" results
    Then CI user can see get what want faster text

    Examples:
      | most searched service |
      | Plumber               |

  @ios-test @search
  Scenario Outline: Services search - full search
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user navigate to services page
    Then CI user is on services page
    When CI user select services search box to type
    Then CI user can see trending and recent searches
    Then CI user can see most searched services
    When CI user search for service "<service>"
    Then CI user can see service search results "<service>"
    Then CI user can see get what want faster link
    When CI user select get what you want faster link
    Then CI user is on chat page
    When CI user select chat page more button
    Then CI user can see more options
    When CI user select in chat search
    Then CI user can see in chat search box
    When CI user search for service "<search criteria>" in chat
    Then CI user can see chat messages matching "<search criteria>"

    Examples:
      | service | search criteria |
      | Plumber |                 |

  @ios-test @search
  Scenario Outline: Order history search
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user select search for orders button
    Then CI user is on orders search page
    Then CI user can see ongoing and past orders
    When CI user search for an order "<order>"
    When CI user select order status "<order status>"
    Then CI user can see order results under selected order status "<order status>"
    When CI user select order from the results list
    Then CI user can see  order details page

    Examples:
      | order   | order status |
      | plumber | in progress  |

  @ios-test @search
  Scenario Outline: Order history search - order not found
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user select search for orders button
    Then CI user is on orders search page
    Then CI user can see ongoing and past orders
    When CI user search for an order "<order>"
    When CI user select order status "<order status>"
    Then CI user can see order results under selected order status "<order status>"
    Then CI user can see order is not found page

    Examples:
      | order status |
      | Completed    |

  @ios-test @search
  Scenario Outline: Wallet transaction search
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user select my money menu
    Then CI user is on my money page
    Then CI user can see a list of transaction made
    Then CI user search for a specific wallet transaction "<wallet transaction>"
#    Then CI user can see wallet transaction "<wallet transaction>" results
    When CI user select a wallet transaction "<wallet transaction>" from result list
    Then CI user can see wallet transaction details page

    Examples:
      | wallet transaction |
      | Fix My Pipe        |

  @ios-test @search
  Scenario Outline: Wallet transaction search - No Results Found
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user select search for wallet button
    Then CI user is on wallet search page
    Then CI user can see  payments from the selected wallet
    Then CI user search for a specific wallet transaction "<wallet transaction>"
    Then CI user can see wallet transaction "<wallet transaction>" results
    When CI user select a wallet transaction "<wallet transaction>" from result list
    Then CI user can see no results found page

    Examples:
      | wallet transaction |
      |                    |