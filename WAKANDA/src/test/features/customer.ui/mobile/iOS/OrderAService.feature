@customer-ios
Feature: Services

  @ios-test @order-service @smoke
  Scenario Outline: Home page search bar
    Given CI user launch the customer ios app
    Then CI user can see dashboard page
    When CI user select search box to type
    Then CI user can see trending and recent searches
    When CI user search for item "<search item>"
    And CI user select a search item "<search item>" from results list
    And CI user select a search category "<search category>"
    Then CI user can see sub categories under the selected category
    When CI user select a subcategory "<subcategory>"
    Then CI user is on create job page

    Examples:
      | search item | search category | subcategory |
      | Plumber     | services        | SERVICE     |

  @ios-test @order-service @smoke
  Scenario Outline: Start a job via categories
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see categories menu
    When CI user select categories menu
    Then CI user is on categories page
    When CI user select services menu
    Then CI user is on services page
    And CI user can see trending service categories
    When CI user select a trending service category "<trending service category>"
    Then CI user is on create job page

    Examples:
      | trending service category |
      | Plumbing                  |

  @ios-test @order-service
  Scenario Outline: Start a job via service offer or deal
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sponsored offers
    When CI user select a sponsored offer "<sponsored offer>"
    Then CI user on sponsored offer "<sponsored offer>" details page
    And CI user can see start a job button
    When CI user select start a job button
    Then CI user can see offer detail page

    Examples:
      | pin   | sponsored offer |
      | 12345 |                 |

  @ios-test @order-service
  Scenario Outline: Start a job via service offer or deal - job in progress
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see sponsored offers
    When CI user select a sponsored offer "<sponsored offer>"
    Then CI user on sponsored offer "<sponsored offer>" details page
    And CI user can see send job request button

    Examples:
      | pin   | sponsored offer |
      | 12345 |                 |

  @ios-test @order-service @smoke
  Scenario Outline: Creating a job card
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select services menu
    And CI user can see trending service categories
    When CI user select a trending service category "<trending service category>"
    Then CI user is on create job page
    When CI user update job name "<job name>"
    And CI user update job urgency "<job urgent>" option
#    When CI user update job description "<job description>"
#    When CI user add job photos from the gallery
#    Then CI user can see photos are added
    When CI user select set a location button
    Then CI user is on set a location page
    When CI user search for and select address "<address>"
    And CI user select address from the list
    Then CI user is on address details page
#    When CI user select save location button
    When CI user enter delivery complex name "<complex name>"
    And CI user enter delivery house number "<house number>"
    And CI user enter delivery nick name "<nick name>"
    And CI user select save location button
    Then CI user is on create job page
    And CI user can see confirm and request service button
    When CI user select confirm and request service button
    Then CI user can see we are matching you with service provider page
    And CI user can see list of interested merchants

    Examples:
      | trending service category | job name    | job urgent | job description | address | complex name | house number | nick name    |
      | Plumbing                  | Fix my sink | Yes        | Fix my sink     | 70 hill | B-Block      | 105          | Work Address |

  @ios-test1 @order-service
  Scenario Outline: Receiving a list of interested service providers, assigning job to one, job starts
    Given CI user launch the customer ios app
    Then CI user is on dashboard page

#    And CI user can see sponsored offers
#    When CI user select a sponsored offer "<sponsored offer>"
#    Then CI user on sponsored offer "<sponsored offer>" details page
    When CI user select send job request button
    Then CI user is on create job page
    When CI user update job name "<job name>"
    And CI user update job urgency "<urgent>" option
    When CI user update job description "<job description>"
    When CI user add job photos from the gallery
    Then CI user can see photos are added
    When CI user select set a location button
    Then CI user is on set a location page
#    When CI user search for and select address "<address>"
    And CI user select address from the list
#    Then CI user is on address details page
#    When CI user select save location button

    And CI user can see confirm and request service button
    When CI user select confirm and request service button
    Then CI user can see we are matching you with service provider page
    And CI user can see list of interested merchants
    When CI user select one of the interested merchants "<interested merchant>"
    Then CI user is on interested merchant "<interested merchant>" details page
    When CI user select assign to job button
    Then CI user can see job confirmation dialog
    When CI user select yes go ahead button
    Then CI user is on service details page

    Examples:
      | job name | job description             | urgent | interested merchant |
      | Plumbing | replacebath tub with shower | yes    | Peter Lennon        |


  @ios-test @order-service
  Scenario Outline: Sharing job cards with a Service Provider whose ad has been displayed
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see list of interested merchants
    When CI user select one of the interested merchants "<interested merchant>"
    Then CI user is on interested merchant "<interested merchant>" details page
    When CI user select send job request button
    Then CI user can see your job card will be shared with this service provider

    Examples:
      | interested merchant |
      |                     |

  @ios-test @order-service
  Scenario Outline: Chat - Till service provider assigned
    Given CI user launch the customer ios app
    And CI user enter pin "<pin>" to authenticate
    When CI user select confirm button
    Then CI user is on dashboard page
    And CI user can see list of interested merchants
    When CI user select one of the interested merchants "<interested merchant>"
    Then CI user is on interested merchant "<interested merchant>" details page
    When CI user select assign to job button
    Then CI user can see job confirmation dialog
    When CI user select yes go ahead button
    Then CI user is on service details page
    When CI user select chat icon
    Then CI user is on service chat page
    And CI user can see will you like to work with service provider text
    And CI user can see assign to job link
    Then CI user can type a chat message "<chat message>"
    When CI user select send chat message button
    Then CI user chat message "<chat message>"is sent

    Examples:
      | interested merchant | chat message |
      |                     |              |


  @ios-test @order-service
  Scenario Outline: Chat - After service provider has been assigned
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see list of interested merchants
    When CI user select one of the interested merchants "<interested merchant>"
    Then CI user is on interested merchant "<interested merchant>" details page
    When CI user select assign to job button
    Then CI user can see job confirmation dialog
    When CI user select yes go ahead button
    Then CI user is on service details page
    When CI user select chat icon
    Then CI user is on service chat page
    And CI user can see will you like to work with service provider text
    And CI user can see assign to job link
    And CI user can see reservation request card
    When CI user select reserve now button
    Then CI user can see the reserved in wallet text

    Examples:
      | interested merchant |
      |                     |

  @ios-test @order-service
  Scenario Outline: Receiving reservation requests & making reservations
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see list of interested merchants
    When CI user select one of the interested merchants "<interested merchant>"
    Then CI user is on interested merchant "<interested merchant>" details page
    When CI user select assign to job button
    Then CI user can see job confirmation dialog
    When CI user select yes go ahead button
    Then CI user is on service details page
    And CI user can see job payments and reservations section
    When CI user select reserve now button
    Then CI user is on payment reservation page
    And CI user can see reservation request card
    And CI user can see MobiMoney wallet balance
    When CI user select reserve funds button
    Then CI user can see device biometric authentication popup
    When CI user authenticate payment reservation transaction
    Then CI user can see authentication was a success popup
    Then CI user can see fund reserved in wallet text

    Examples:
      | interested merchant |
      |                     |

  @ios-test @order-service
  Scenario Outline: Reservation deleted by service providor
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    And CI user can see list of interested merchants
    When CI user select one of the interested merchants "<interested merchant>"
    Then CI user is on interested merchant "<interested merchant>" details page
    When CI user select assign to job button
    Then CI user can see job confirmation dialog
    When CI user select yes go ahead button
    Then CI user is on service details page
    And CI user can see job payments and reservations section
    When CI user select reserve now button
    Then CI user is on payment reservation page
    And CI user can see reservation request card
    And CI user can see reservation was deleted card
    When CI user select deleted reservation card
    Then CI user can see reservation deletion date

    Examples:
      | interested merchant |
      |                     |