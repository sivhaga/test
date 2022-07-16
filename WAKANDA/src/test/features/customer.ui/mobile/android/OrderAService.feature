@customer-android
Feature: Services

  @android-test @order-service
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

  @android-test @order-service
  Scenario Outline: Start a job via categories
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see categories menu
    When CA user select categories menu
    Then CA user is on categories page
    When CA user select services menu
    Then CA user is on services page
    When CA user select a trending service category "<service>"
    Then CA user is on create job page
    When CA user update job name "<job name>"
    And CA user update job urgency "<job urgency>" option
    When CA user update job description "<job description>"
#    Then CA user can see attach photos button
#    When CA user select attach photos button
#    Then CA user can see set a location button
    When CA user select set location button
    Then CA user is on set location page
    When CA user search for and select address "<address>"
    Then CA user is on set new location page
#    When CA user enter complex name "<complex name>"
    And CA user enter house number "<house number>"
#    And CA user enter location nickname "<nickname>"
    When CA user select save location button
    And CA user can see confirm and request service button
    When CA user select confirm and request service button
    Then CA user can see we are matching you with service provider page

    Examples:
      | pin | service  | job name    | job urgency | job description | address                     | complex name | house number | nickname |
      |     | Plumbing | Fix my sink | yes         | fix it now      | 70 Hill Street South Africa |              | 202          |          |

  @android-test @order-service
  Scenario Outline: Start a job via service offer or deal
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see sponsored offers
    When CA user select a sponsored offer "<sponsored offer>"
    Then CA user on sponsored offer "<sponsored offer>" details page
    And CA user can see start a job button
    When CA user select start a job button
    Then CA user can see offer details popup
    When CA user select ok button
    Then CA user can see send job request button
    When CA user select send job request button
    Then CA user can see job request sent message

    Examples:
      | sponsored offer |
      |                 |

  @android-test @order-service
  Scenario Outline: Start a job via service offer or deal - job in progress
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see sponsored offers
    When CA user select a sponsored offer "<sponsored offer>"
    Then CA user on sponsored offer "<sponsored offer>" details page
    And CA user can see send job request button
    When CA user select send job request button
    Then CA user can see job request sent message

    Examples:
      | sponsored offer |
      |                 |

  @android-test @order-service @smoke
  Scenario Outline: Creating a job card
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select services menu
    Then CA user is on services page
    When CA user select a trending service category "<service>"
    Then CA user is on create job page
    When CA user update job name "<job name>"
    And CA user update job urgency "<job urgency>" option
    When CA user update job description "<job description>"
#    Then CA user can see attach photos button
#    When CA user select attach photos button
#    Then CA user can see set a location button
    When CA user select set location button
    Then CA user is on set location page
    When CA user search for and select address "<address>"
    Then CA user is on set new location page
#    When CA user enter complex name "<complex name>"
    And CA user enter house number "<house number>"
#    And CA user enter location nickname "<nickname>"
    When CA user select save location button
    And CA user can see confirm and request service button
    When CA user select confirm and request service button
    Then CA user can see we are matching you with service provider page

    Examples:
      | pin | service  | job name    | job urgency | job description | address                     | complex name | house number | nickname |
      |     | Plumbing | Fix my sink | yes         | fix it now      | 70 Hill Street South Africa |              | 202          |          |

  @android-test1 @order-service
  Scenario Outline: Receiving a list of interested service providers, assigning job to one, job starts
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select services menu
    And CA user can see send job request button
    When CA user select send job request button
    Then CA user is on create job page
    When CA user update job name "<job name>"
    And CA user update job urgency "<job urgency>" option
    When CA user update job description "<job description>"
    Then CA user can see attach photos button
    When CA user select attach photos button
    Then CA user can see set a location button
    When CA user select add location button
    Then CA user is on location page
    When CA user search for and select address "<address>"
    Then CA user is on set new location page
    When CA user enter complex name "<complex name>"
    And CA user enter house number "<house number>"
    And CA user enter location nickname "<nickname>"
    Then CA user can see save location button
    When CA user select save location button
    And CA user can see confirm and request service button
    When CA user select confirm and request service button
    Then CA user can see we are matching you with service provider page
    And CA user can see list of interested merchants
    When CA user select one of the interested merchants
    Then CA user can see assign job to merchant button
    When CA user select assign job to merchant button
    Then CA user can see job confirmation dialog
    When CA user select yes go ahead button
    Then CA user is on service details page
    And CA user can see service details labels
    And CA user can see job payments label

    Examples:
      | pin | sponsored offer | job name    | job urgency | job description | address | complex name | house number | nickname |
      |     |                 | Fix my sink | yes         | fix it now      |         |              |              |          |

  @android-test @order-service
  Scenario Outline: Sharing job cards with a Service Provider whose ad has been displayed
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see list of interested merchants
    When CA user select one of the interested merchants
    Then CA user is on interested merchant details page
    When CA user select send job request button
    Then CA user can see your job card will be shared with this service provider

    Examples:
      | pin | interested merchant |
      |     |                     |


  @android-test @order-service
  Scenario Outline: Chat - Till service provider assigned
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see list of interested merchants
    When CA user select one of the interested merchants
    Then CA user is on interested merchant details page
    When CA user select assign to job button
    Then CA user can see job confirmation dialog
    When CA user select yes go ahead button
    Then CA user is on service details page
    When CA user select chat icon
    Then CA user is on service chat page
    And CA user can see will you like to work with service provider text
    And CA user can see assign to job link
    Then CA user can type a chat message "<chat message>"
    When CA user select send chat message button
    Then CA user chat message "<chat message>"is sent

    Examples:
      | pin | interested merchant | chat message |
      |     |                     |              |


  @android-test @order-service
  Scenario Outline: Chat - After service provider has been assigned
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see list of interested merchants
    When CA user select one of the interested merchants
    Then CA user is on interested merchant details page
    When CA user select assign to job button
    Then CA user can see job confirmation dialog
    When CA user select yes go ahead button
    Then CA user is on service details page
    When CA user select chat icon
    Then CA user is on service chat page
    And CA user can see will you like to work with service provider text
    And CA user can see assign to job link
    And CA user can see reservation request card
    When CA user select reserve now button
    Then CA user can see the reserved in wallet text

    Examples:
      | pin |
      |     |

  @android-test @order-service
  Scenario Outline: Receiving reservation requests & making reservations
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see list of interested merchants
    When CA user select one of the interested merchants
    Then CA user is on interested merchant details page
    When CA user select assign to job button
    Then CA user can see job confirmation dialog
    When CA user select yes go ahead button
    Then CA user is on service details page
    And CA user can see job payments and reservations section
    When CA user select reserve now button
    Then CA user is on payment reservation page
    And CA user can see reservation request card
    And CA user can see MobiMoney wallet balance
    When CA user select reserve funds button
    Then CA user can see device biometric authentication popup
    When CA user authenticate payment reservation transaction
    Then CA user can see authentication was a success popup
    Then CA user can see fund reserved in wallet text

    Examples:
      | pin |
      |     |

  @android-test @order-service
  Scenario Outline: Reservation deleted by service provider
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    And CA user can see list of interested merchants
    When CA user select one of the interested merchants
    Then CA user is on interested merchant details page
    When CA user select assign to job button
    Then CA user can see job confirmation dialog
    When CA user select yes go ahead button
    Then CA user is on service details page
    And CA user can see job payments and reservations section
    When CA user select reserve now button
    Then CA user is on payment reservation page
    And CA user can see reservation request card
    And CA user can see reservation was deleted card
    When CA user select deleted reservation card
    Then CA user can see reservation deletion date

    Examples:
      | pin |
      | x   |