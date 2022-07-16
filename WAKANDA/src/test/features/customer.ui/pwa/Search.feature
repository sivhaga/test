@customer-pwa
Feature: As a Customer PWA (CP) user I want to be able to search for products and services

  @pwa-test
  Scenario Outline: Home page search bar
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user select search box to type
    Then CP user can see trending and recent searches
    When CP user search for item "<search item>"
    When CP user select a search category "<search category>"
    Then CP user can see sub categories under the selected category
    When CP user select a subcategory "<subcategory>"
    Then CP user can see results under a subcategory

    Examples:
      | search item | search category | search category | subcategory |
      | test        | test            | hair            | products    |

  @pwa-test
  Scenario Outline: Products search
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user navigate to products page
    Then CP user is on products page
    When CP user select product search box to type
    Then CP user can see suggestive results
    When CP user search for product "<generic search item>"
    Then CP user can see product search item results list "<generic search item>"
    Then CP user can see search categories
    When CP user select a product category "<search category>"
    Then CP user can see product sub categories results are shown
    When CP user select product search result from list
    Then CP user can see product search item "<product search item>" details page

    Examples:
      | product search item | search category | product search item | search category |
      | test                | All             | phone               | products        |

  @pwa-test
  Scenario Outline: Products search - product not found
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user navigate to products page
    Then CP user is on products page
    When CP user select product search box to type
    Then CP user can see suggestive results
    When CP user search for product "<product search item>"
    Then CP user can see product search item results list "<product search item"
    Then CP user can see search categories
    When CP user select a product category "<search category>"
    Then CP user can see no results found page

    Examples:
      | product search item | search category | product search item | search category |
      | test                | All             | affds               | products        |

  @pwa-test
  Scenario Outline: Services search - most searched
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user navigate to services page
    Then CP user is on services page
    When CP user select services search box to type
    Then CP user can see trending and recent searches
    Then CP user can see most searched services
    When CP user select one of the most searched service "<most searched service>"
    Then CP user can see most searched service "<most searched service>" results
    Then CP user can see get what want faster text

    Examples:
      | most searched service |
      | Plumber               |

  @pwa-test
  Scenario Outline: Services search - full search
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user navigate to services page
    Then CP user is on services page
    When CP user select services search box to type
    Then CP user can see trending and recent searches
    Then CP user can see most searched services
    When CP user search for service "<service>"
    Then CP user can see service search results "<service>"
    Then CP user can see get what want faster link
    When CP user select get what you want faster link
    Then CP user is on chat page
    When CP user select chat page more button
    Then CP user can see more options
    When CP user select in chat search
    Then CP user can see in chat search box
    When CP user search for service "<search criteria>" in chat
    Then CP user can see chat messages matching "<search criteria>"

    Examples:
      | service | search criteria |
      | Plumber |                 |

  @pwa-test
  Scenario Outline: Order history search
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user select search for orders button
    Then CP user is on orders search page
    Then CP user can see ongoing and past orders
    When CP user search for an order "<order>"
    When CP user select order status "<order status>"
    Then CP user can see order results under selected order status "<order status>"
    When CP user select order from the results list
    Then CP user can see  order details page

    Examples:
      | username | password | order   | order status |
      | test     | test     | plumber | in progress  |

  @pwa-test
  Scenario Outline: Order history search - order not found
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user select search for orders button
    Then CP user is on orders search page
    Then CP user can see ongoing and past orders
    When CP user search for an order "<order>"
    When CP user select order status "<order status>"
    Then CP user can see order results under selected order status "<order status>"
    Then CP user can see order is not found page

    Examples:
      | username | password | order | order status |
      | test     | test     |       | Completed    |

  @pwa-test
  Scenario Outline: Wallet transaction search
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user select search for wallet button
    Then CP user is on wallet search page
    Then CP user can see  payments from the selected wallet
    Then CP user search for a specific wallet transaction "<wallet transaction>"
    Then CP user can see wallet transaction "<wallet transaction>" results
    When CP user select a wallet transaction "<wallet transaction>" from result list
    Then CP user can see wallet transaction details page

    Examples:
      | username | password | wallet transaction |
      | test     | test     |                    |

  @pwa-test
  Scenario Outline: Wallet transaction search - No Results Found
    Given CP user launch the customer web
    Then CP user can see dashboard page
    When CP user select search for wallet button
    Then CP user is on wallet search page
    Then CP user can see  payments from the selected wallet
    Then CP user search for a specific wallet transaction "<wallet transaction>"
    Then CP user can see wallet transaction "<wallet transaction>" results
    When CP user select a wallet transaction "<wallet transaction>" from result list
    Then CP user can see no results found page

    Examples:
      | username | password |
      | test     | test     |