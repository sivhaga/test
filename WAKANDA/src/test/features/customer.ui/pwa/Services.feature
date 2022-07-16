@customer-pwa
Feature: Services

  @pwa-test
  Scenario Outline: Search for a service
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select more menu
    And user go to services page
    When user search for a service "<service>"
    Then most popular services are shown
    Then search results are visible "<service>"
    When user select service from the list
    Then service details page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Start a job via categories
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select categories menu
    Then CP user is on categories page
    When Cp user select services menu
    Then CP user is on services page
    And CP user can see trending service categories
    When CP user select a trending service category "<trending service category>"
    Then CP user is on service category "<trending service category>" job page

    Examples:
      | username | password | trending service category |
      | test     | test     |                           |

  @pwa-test
  Scenario Outline: Start a job via service offer or deal
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see sponsored offers
    When CP user select a sponsored offer "<sponsored offer>"
    Then CP user on sponsored offer "<sponsored offer>" details page
    And CP user can see start a job button
    When CP user select start a job button
    Then CP user can see offer detail page

    Examples:
      | username | password | sponsored offer |
      | test     | test     |                 |

  @pwa-test
  Scenario Outline: Start a job via service offer or deal - job in progress
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see sponsored offers
    When CP user select a sponsored offer "<sponsored offer>"
    Then CP user on sponsored offer "<sponsored offer>" details page
    And CP user can see send job request button

    Examples:
      | username | password | sponsored offer |
      | test     | test     |                 |

  @pwa-test
  Scenario Outline: Creating a job card
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see sponsored offers
    When CP user select a sponsored offer "<sponsored offer>"
    Then CP user on sponsored offer "<sponsored offer>" details page
    And CP user can see send job request button
    When CP user select send job request button
    Then CP user is on create job page
    When CP user update job name "<job name>"
    And CP user update job urgency "<job urgency>" option
    When CP user update job description "<job description>"
    When CP user select a location
    Then CP user is on location page
    When CP user search for and select address "<address>"
    Then CP user is on address detials page
    When CP user select save location button
    And CP user can see confirm and request service button
    When CP user select confirm and request service button
    Then CP user can see we are matching you with service provider page

    Examples:
      | username | password | sponsored offer | job name | job urgency | job description | address |
      | test     | test     |                 |          |             |                 |         |

  @pwa-test
  Scenario Outline: Receiving a list of interested service providers, assigning job to one, job starts
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see list of interested merchants
    When CP user select one of the interested merchants "<interested merchant>"
    Then CP user is on interested merchant "<interested merchant>" details page
    When CP user select assign to job button
    Then CP user can see job confirmation dialog
    When CP user select yes go ahead button
    Then CP user is on service details page

    Examples:
      | username | password | interested merchant |
      | test     | test     |                     |


  @pwa-test
  Scenario Outline: Sharing job cards with a Service Provider whose ad has been displayed
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see list of interested merchants
    When CP user select one of the interested merchants "<interested merchant>"
    Then CP user is on interested merchant "<interested merchant>" details page
    When CP user select send job request button
    Then CP user can see your job card will be shared with this service provider

    Examples:
      | username | password | interested merchant |
      | test     | test     |                     |


  @pwa-test
  Scenario Outline: Chat - Till service provider assigned
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see list of interested merchants
    When CP user select one of the interested merchants "<interested merchant>"
    Then CP user is on interested merchant "<interested merchant>" details page
    When CP user select assign to job button
    Then CP user can see job confirmation dialog
    When CP user select yes go ahead button
    Then CP user is on service details page
    When CP user select chat icon
    Then CP user is on service chat page
    And CP user can see will you like to work with service provider text
    And CP user can see assign to job link
    Then CP user can type a chat message "<chat message>"
    When CP user select send chat message button
    Then CP user chat message "<chat message>"is sent

    Examples:
      | username | password | interested merchant | chat message |
      | test     | test     |                     |              |


  @pwa-test
  Scenario Outline: Chat - After service provider has been assigned
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see list of interested merchants
    When CP user select one of the interested merchants "<interested merchant>"
    Then CP user is on interested merchant "<interested merchant>" details page
    When CP user select assign to job button
    Then CP user can see job confirmation dialog
    When CP user select yes go ahead button
    Then CP user is on service details page
    When CP user select chat icon
    Then CP user is on service chat page
    And CP user can see will you like to work with service provider text
    And CP user can see assign to job link
    And CP user can see reservation request card
    When CP user select reserve now button
    Then CP user can see the reserved in wallet text

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Receiving reservation requests & making reservations
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see list of interested merchants
    When CP user select one of the interested merchants "<interested merchant>"
    Then CP user is on interested merchant "<interested merchant>" details page
    When CP user select assign to job button
    Then CP user can see job confirmation dialog
    When CP user select yes go ahead button
    Then CP user is on service details page
    And CP user can see job payments and reservations section
    When CP user select reserve now button
    Then CP user is on payment reservation page
    And CP user can see reservation request card
    And CP user can see MobiMoney wallet balance
    When CP user select reserve funds button
    Then CP user can see device biometric authentication popup
    When CP user authenticate payment reservation transaction
    Then CP user can see authentication was a success popup
    Then CP user can see fund reserved in wallet text

  @pwa-test
  Scenario Outline: Reservation deleted by service providor
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    And CP user can see list of interested merchants
    When CP user select one of the interested merchants "<interested merchant>"
    Then CP user is on interested merchant "<interested merchant>" details page
    When CP user select assign to job button
    Then CP user can see job confirmation dialog
    When CP user select yes go ahead button
    Then CP user is on service details page
    And CP user can see job payments and reservations section
    When CP user select reserve now button
    Then CP user is on payment reservation page
    And CP user can see reservation request card
    And CP user can see reservation was deleted card
    When CP user select deleted reservation card
    Then CP user can see reservation deletion date

    Examples:
      | username | password |
      | test     | test     |


  @pwa-test
  Scenario Outline: Create a job card via form
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user search for a service "<service>"
    Then most popular services are shown
    Then search results are visible "<service>"
    When user select service from the list
    Then create job page is shown
    When user enter project name "<project name>"
    When user enter expected budget "<expected budget>"
    When user enter project description "<project description>"
    When user select add job button
    When user select service date "<service date>"
    When user select location "<location>"
    Then select location "<location>" is shown
    When user select confirm and request service button
    Then user can see matching you with right service message
    Then matching you with right service message is shown
    Then will notify you when there a match message is shown
    Then search may take up to message is shown
    Then notification showing quotes is shown
    When user selection notification
    Then notifications details page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Create a job card via chat
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user search for a service "<service>"
    Then most popular services are shown
    Then search results are visible "<service>"
    When user select service from the list
    Then service chat page is shown
    Then service message are shown
    When user confirm they want a service "<confirm>"
    When user select service date "<service date>"
    Then select a service message is shown
    When user select a service "<service>"
    Then selected service is "<service>" shown
    When user select location "<location>"

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Receive human assistance on chat
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user search for a service "<service>"
    Then most popular services are shown
    Then search results are visible "<service>"
    When user select service from the list
    Then service chat page is shown
    Then service message are shown
    When user confirm they want a service "<confirm>"
    When user select service date "<service date>"
    Then select a service message is shown
    When user select a service "<service>"

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Receive more of merchant quotes
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user search for a service "<service>"
    Then most popular services are shown
    Then search results are visible "<service>"
    When user select service from the list
    Then service chat page is shown
    Then service message are shown
    When user confirm they want a service "<confirm>"
    When user select service date "<service date>"
    Then select a service message is shown
    When user select a service "<service>"

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Receive quotes - Non-urgent jobs
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    Then user can see matching you with right service message
    Then matching you with right service message is shown
    Then will notify you when there a match message is shown
    Then search may take up to message is shown
    Then notification showing quotes is shown
    When user selection notification
    Then notifications details page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Receive quotes - Urgent jobs within working hours
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    Then user can see matching you with right service message
    Then matching you with right service message is shown
    Then will notify you when there a match message is shown
    Then search may take up to message is shown
    Then notification showing quotes is shown
    When user selection notification
    Then urgent job card is shown
    When user select confirm and request service button
    Then notifications details page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |


  @pwa-test
  Scenario Outline: Receive quotes - Urgent jobs outside working hours
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to quotes page
    Then user can see matching you with right service message
    Then matching you with right service message is shown
    Then will notify you when there a match message is shown
    Then search may take up to message is shown
    Then notification showing quotes is shown
    When user selection notification
    Then urgent job card is shown
    When user select confirm and request service button
    Then notifications details page is shown
    Then its late message is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Quotes types - Multiple steps
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to quotes page
    Then user select quote type "<quote type>"
    Then call call out fee is shown
    Then advanced materials fee is shown
    Then removing existing tiles and cleaning fee is shown
    When user select accept and reserve payment
    Then reviews page is shown

    Examples:
      | username | password | quote type     |
      | test     | test     | multiple steps |

  @pwa-test
  Scenario Outline: Quotes types - Single step full quote
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to quotes page
    Then user select quote type "<quote type>"
    Then reserve abd pay through one step text is shown
    Then job cost is shown
    When user select accept and reserve payment
    Then reviews page is shown

    Examples:
      | username | password | quote type             |
      | test     | test     | single step full qoute |

  @pwa-test
  Scenario Outline: Quotes types - Single assessment quote
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to quotes page
    Then user select quote type "<quote type>"
    Then this is an assessment request text is shown
    Then job cost is shown
    When user select accept and reserve payment
    Then reviews page is shown

    Examples:
      | username | password | quote type                   |
      | test     | test     | single step assessment quote |

  @pwa-test
  Scenario Outline: Accept and reserve funds for the first step
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to quotes page
    Then user can see matching you with right service message
    Then matching you with right service message is shown
    Then will notify you when there a match message is shown
    Then search may take up to message is shown
    Then notification showing quotes is shown
    When user selection notification
    Then urgent job card is shown
    When user select confirm and request service button
    Then quote page is shown
    When user select done button on quote page
    When user reserve payment "<reserve amount>"
    Then reserved amount "<reserve amount>" is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Job completion
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    When user select request job with supplier button
    Then job timeline page is shown
    When user select view transaction details
    Then job invoice page is shown

    Examples:
      | username | password | job action |  |
      | test     | test     |            |  |

  @pwa-test
  Scenario Outline: Delete or cancel job
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to quotes page
    Then user can see matching you with right service message
    Then matching you with right service message is shown
    Then will notify you when there a match message is shown
    Then search may take up to message is shown
    Then notification showing quotes is shown
    When user selection notification
    Then job card is shown
    When user select delete this job button
    Then why you deleting job page is shown
    When user select reason "<reason>" for deleting a job
    Then user select delete button
    Then your job is deleted message is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Repeat the job card
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    When user select repeat this job button
    Then no invoice added page is shown
    When user select request invoice button
    Then job invoice page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Start a new job with a merchant who was referred to me
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to favourite page
    When user select service providers
    Then list of service providers is shown
    When user select service provider from the list
    Then service provider detail page is shown
    When user select start a job page
    Then create job page is shown
    When user enter project name "<project name>"
    When user enter expected budget "<expected budget>"
    When user enter project description "<project description>"
    When user select add job button
    Then get more quotes button is shown
    When user select get more quotes button

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: New step to an accepted job
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    Then updated quote page is shown
    When user select accept and reserve payment button
    Then payment page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Ongoing job
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Step of an accepted job is edited
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Raise an issue regarding a completed job
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    When user select raise an issue with this job button
    Then raise an issue page is shown
    When user type issue details "<issue details>" massage
    And user select add pictures button
    And user attach picture for the issue
    And user select send button
    Then message sent text is shown
    When user select exit button
    Then jobs page is shown

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Dispute job completion
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    When user select dispute job completion button

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Add new step to a completed job
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    When user select edit step

    Examples:
      | username | password | service |
      | test     | test     |         |

  @pwa-test
  Scenario Outline: Edit step in a job
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When user select more menu
    And user go to services page
    When user go to jobs page
    Then jobs page is shown
    When user select existing job
    Then user job action page is shown
    When user select job action "<job action>" option
    Then job card page is shown
    When user select edit step

    Examples:
      | username | password | service |
      | test     | test     |         |