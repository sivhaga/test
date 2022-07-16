@merchant-ios
Feature: Profile - As a Merchant IOS(MI) user, I want to manage my account

  @Testasda
  Scenario Outline: View all merchant profile menu and information  - DONE
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see merchant name
    #Then waka id text is displayed
    Then MI user can see waka id
    #Then MI user can see times hire
    #Then MI user can see user rating
    #Then MI user can see reviews
    Then MI user can see my past projects menu
    Then MI user can see statements menu
    Then MI user can see reports and market insight menu
    Then MI user can see job settings menu
    When MI user scroll up
    Then MI user can see payment settings menu
    Then MI user can see app settings menu
    Then MI user can see my rewards menu
    Then MI user can see help and support menu
    Then MI user can see refer a friend menu
    Then MI user can see terms and conditions menu
    Then MI user can see privacy policy menu
    Then MI user can see about us menu
    Then MI user can see rate and share menu
    Then MI user can see logout

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: View Terms and Conditions
    #LINK IS NOT CLICKABLE AND CONTENT NEED TO BE PROVIDED
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    And MI user select terms and conditions
    Then MI user can see terms and conditions

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Private Policy
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    And MI user select private policy
    Then MI user can see private policy

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: About us
    #LINK IS NOT CLICKABLE AND CONTENT NEED TO BE PROVIDED
    Given MI user launch the merchant ios app
    #Then MI user is on authentication page
    #When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    And MI user select about us
    Then MI user can see about us

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Refer a friend

    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select refer a friend
    Then MI user is able to see referral reward for merchant
    Then MI user is able to see referral link for merchant
    Then MI user is able to see referral reward for customer
    Then MI user is able to see referral link for customer

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Rate us
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select rate us
    Then MI user is on rate us page
    And MI user select ratings
    And MI user enter comments "<comments>"
    And MI user select submit button

    Examples:
      |pin|comments|
      | 12345 |I like the applicatuon|

  @ios-test
  Scenario Outline: Logout
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select logout
    Then MI user can see logout confirmation page
    When MI user select logout button
    Then MI user is on authentication page

    Examples:
      |pin|
      | 12345 |


  @ios-test
  Scenario Outline: Help and Support - View contact information
  #Verify user is able to view toll free contact number
  #Verify user is able to view email address

    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select help and support
    When MI user scroll up
    Then MI user can see toll free contact number
    Then MI user can see email address

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario: Help and Support - Seek payment related support
  # HERE WE DONT HAVE ALL WIREFRAMES, CONTACT VARUN
  #Verify user is able to see Payments not received related support details
  #Verify user is able to see Payment limit related support details\
  #Verify user is able to see Payment notification related support details

  @ios-test
  Scenario:  Help and Support - Request job related support
  #Verify user is able to see Cancelled jobs received related support details
  #Verify user is able to see Job conversion related support details\
  #Verify user is able to see Job pricing related support details

  @ios-test
  Scenario: Help and Support - Request profile related support
  #Verify user is able to Change in Business structure
  #Verify user is able to Edit Profile information

  @ios-test
  Scenario:  Help and Support - View past support requests
  #Verify user is able to view open and resolved requests details
  #Verify user is able to view support request conversation history

  @ios-test
  Scenario: Help and Support - Contact support (in app call, text message)
  #Verify user is able to see Bank, wallet and payments contact support details
  #Verify user is able to see Job orders contact support details
  #Verify user is able to see B2B contact support details
  #Verify user is able to see Banking Products contact support details
  #Verify user is able to see Prepaids contact support details
  #Verify user is able to see Rewards and Loyalty contact support details
  #Verify user is able to see Other contact support details

  @ios-test
  Scenario: Help and Support - View Past conversations
  #Verify user is able to view past conversations details


  @ios-test
  Scenario Outline: View past completed projects
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select my past projects
    Then MI user is on my project page
    When MI user select completed
    Then MI user can see completed projects
    When MI user select on completed project
    Then MI user can see customer name
    Then MI user can see address
    Then MI user can see description
    Then MI user can see project status
    Then MI user can see job id
    Then MI user can see project price and break-up
    When MI user scroll up
    Then MI user can see job activity and payment history
    Then MI user can see payment milestones
    Then MI user can see chat history
    Then MI user can see initiate refund
    #Then MI user can see Report a problem

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: View my cancelled projects
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select my past projects
    Then MI user is on my project page
    When MI user select cancelled
    Then MI user can see cancelled projects
    When MI user select on cancelled project
    Then MI user can see customer name
    Then MI user can see address
    Then MI user can see expected date
    Then MI user can see budget
    Then MI user can see description
    Then MI user can see photos
    When MI user scroll up
    Then MI user can see project status
    Then MI user can see cancellation date
    Then MI user can see cancellation fee received
    Then MI user can see job id
    Then MI user can see reason for cancellation
    Then MI user can see chat history
    #Then Report a problem

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Act on past projects
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select my past projects
    Then MI user is on my project page
    #WE NEED STEPS HERE
    #Then Report a problem is displayed

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: View and share Statements
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select statements
    Then MI user is on the statement page
    When MI user select on statement icon
    Then MI user can see generate new statement
    When MI user select statements
    Then MI user can see statement
    When MI user share statement
    Then MI user can share statement

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Generate new statement based on all date filters
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select statements
    Then MI user is on the statement page
    When MI user select on statement icon
    Then MI user can see generate new statement
    When MI user select generate new statement
    Then MI user is on the filter page
    When MI user select today
    And MI user select transaction types
    And MI user select view statement
    Then MI user is able to see list of transaction
    When MI user select back
    And MI user select this week
    And MI user select transaction types
    When MI user scroll up
    And MI user select view statement
    Then MI user is able to see list of transaction
    When MI user select back
    And MI user select this month
    And MI user select transaction types
    And MI user select view statement
    Then MI user is able to see list of transaction
    When MI user select back
    And MI user select custom dates
    And MI user select dates
    And MI user select transaction types
    When MI user select download or share statement
    And MI user select view statement
    Then MI user can generate statement

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Generate new statement based all filtering criteria
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select statements
    Then MI user is on the statement page
    When MI user select on statement icon
    Then MI user can see generate new statement
    When MI user select generate new statement
    Then MI user is on the filter page
    When MI user select this week
    And MI user select transaction types
    And MI user enter "<received from>"
    And MI user select location
    And MI user select view statement
    Then MI user is able to see list of transaction
    When MI user select download or share statement
    Then MI user can generate statement

    Examples:
      |pin|received from|
      | 12345 |name|

  @ios-test
  Scenario Outline: View Rewards
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select my rewards
    Then MI user is able to see waka points

  #VERIFY BELOW MANUAL TESTING
  #Verify a user is able to earn points by reaching milestone of total business
  #Verify a user is able to earn points by having Consecutive star ratings
  #Verify a user is able to earn points by completing profile, Consecutive star ratings
  #Verify a user is able to earn points by completing survey
  #Verify a user is able to earn points by inviting friends
  #Verify a user is able to earn points by Topping wallet


    Examples:
      |pin|
      | 12345 |


  @ios-test
  Scenario Outline: Job Settings
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select job settings
    Then MI user on the job settings page
    #Allow user to search location on map using location name
    Then MI user is able to change job location
    #Set distance range of jobs from my job location
    Then MI user is able to restrict jobs by distance
    #Set budget range for my jobs (default Min 0 to Max unlimited)
    Then MI user is able to restrict jobs by budget
    #Set my availability on days of the week (default setting to All weekdays) & time slots (All Day - default, set start and end time)
    Then MI user is able to set availability on days of the week and time slots
    Then MI user is able to set unavailability
    Then MI user is able to set availability

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Payment Settings - View my primary bank account details
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user on the payment settings page
    Then MI user can see bank name
    Then MI user can see account holder
    Then MI user can see account number partially masked
    Then MI user can see branch code
    Then MI user can see account type

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Payment Settings - Add Nedbank account
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user on the payment settings
    When MI user select add another account
    Then MI user is on add another account
    And MI user select add Nedbank account option
    Then MI user can see login screen
    When MI user enter MI user id "<User id>" as MI user id
    And MI user enter password "<password>" as password
    And MI user select submit button
    Then MI user can see add confirmation screen
    #Confirm delete action for primary bank account
    #Verify user is able to set a primary bank account if two added
    Examples:
      |pin|User id|password|
      | 12345 |test |password|

  @ios-test
  Scenario Outline: Payment Settings - Add another bank account
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user on the payment settings
    When MI user select add another account
    Then MI user is on add another account
    And MI user select add another bank account option
    Then MI user can see wallet account details screen
    Then MI user can see name field
    Then MI user can see account number
    Then MI user can see bank name
    Then MI user can see branch code
    Then MI user can see reference
    #Confirm delete action for primary bank account
    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Payment Settings - Delete bank account
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user on the payment settings
    When MI user select delete
    Then MI user can see delete confirmation screen
    And MI user select delete option
    Then MI user can see a delete confirmation screen

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Payment Settings - View and Edit Manage QR
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment setting
    Then MI user can see manage qr
    Then MI user can see default qr display name
    When MI user select edit qr
    And MI user enter qr display name "<qr display name>"
    And MI user select update button
    Then MI user can see qr display name is updated

    Examples:
      |pin|qr display name|
      | 12345 |peter sivhaga|

  @ios-test
  Scenario Outline: Payment Settings - Set auto settlement instructions to select bank account to settle funds
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user can see settlements
    When MI user enable auto settlement
    And MI user select account for profile
    #Verify user is able to select bank a/c to settle funds, select settlement frequency (daily, weekly, monthly)
    And MI user select settlement frequency
    Then MI user can set settlement instruction
    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Payment Settings - View Wallet Limits as decided by bank same for all users
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user can see transaction charges
    Then MI user can see wallet to wakanda wallet
    Then MI user can see wallet to other target source

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: Payment Settings - View transaction charges as decided by bank same for all users
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select payment settings
    Then MI user can see wallet limits
    Then MI user can see daily limit
    Then MI user can see monthly limit
    Then MI user can see settlement to bank limit

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: App settings - Login security change password authentication
  # Verify user is able to change Password  (via Old password or Forgot Password Recovery through OTP on email or mobile number)
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select app settings
    Then MI user can see login security
    When MI user select change password
    And MI user enter new password "<new password>"
    And MI user confirm password "<confirm password>"
    And MI user select save
    Then MI user can see confirmation message

    Examples:
      |pin|current password|new password|confirm password|
      | 12345 |current password|new password|confirm password|

  @ios-test
  Scenario Outline: App settings - Login security change PIN authentication
    # Verify user is able to change PIN  (via Current PIN or Forgot PIN Recovery through OTP on email or mobile number)
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select app settings
    Then MI user can see login security
    When MI user select change pin
    And MI user enter current pin "<pin>"
    And MI user select confirm button
    And MI user enter new pin "<new pin>"
    And MI user select confirm button
    And MI user confirm pin "<confirm pin>"
    And MI user select confirm button
    Then MI user can see confirmation message

    Examples:
      |pin|new pin|confirm pin|
      | 12345 |54321|54321|

  @ios-test
  Scenario Outline: App settings - Login security change wallet transaction authentication
  # Verify is able to enable/disable Face ID authentication
  # Verify is able to enable/disable Touch ID authentication
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select app settings
    Then MI user can see login security
    When MI user enable face id authentication
    Then MI user can set face id authentication
    When MI user enable touch id authentication
    Then MI user can set touch id authentication

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: App settings - Wallet security change PIN authentication
    # Verify user is able to change PIN  (via Current PIN or Forgot PIN Recovery through OTP on email or mobile number)
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select wallet security
    Then MI user can see login security
    When MI user select change pin
    And MI user enter current pin "<pin>"
    And MI user select confirm button
    And MI user enter new pin "<new pin>"
    And MI user select confirm button
    And MI user confirm pin "<confirm pin>"
    And MI user select confirm button
    Then MI user can see confirmation message

    Examples:
      |pin|new pin|confirm pin|
      | 12345 |54321|54321|

  @ios-test
  Scenario Outline: App settings - Wallet security change wallet transaction authentication
  # Verify user is able to enable/disable Face ID authentication
  # Verify user is able to enable/disable Touch ID authentication
  # Verify user is able to authenticate using  Face ID/Touch ID after enabled
  # Verify user is not able to authenticate using  Face ID/Touch ID after disabled
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select app settings
    Then MI user can see wallet security
    When MI user enable face id authentication
    And MI user disable face id authentication
    Then MI user face id authentication is disabled and enabled
    When MI user enabled touch id authentication
    And MI user disabled touch id authentication
    Then MI user touch id authentication is disabled and enabled

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: App settings - Enable / disable notification preferences for push notifications
  # Verify user is able to enable/disable payments notifications
  # Verify user is able to enable/disable job notifications
  # Verify user is able to enable/disable system notifications
  # Verify user is able to enable/disable promotional notifications
  # Verify user is able to enable/disable receive notification on secondary no authentication
  # Verify user is able to see extra charge message when enabling receive notifications on secondary no

    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select app settings
    Then MI user can see notifications
    When MI user enable payments notifications
    And MI user disable payments notifications
    Then MI user disabled and enabled payments notifications
    When MI user enable job notifications
    And MI user disable job notifications
    Then MI user disabled and enabled job notifications
    When MI user enable system notifications
    And MI user disable system notifications
    Then MI user disabled and enabled system notifications
    When MI user enable promotional notifications
    And MI user disable promotional notifications
    Then MI user disabled and enabled promotional notifications
    When MI user enable receive notification
    Then MI user disabled and enabled extra charge message
    When MI user disable receive notification
    Then MI user disabled and enabled receive notification

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario Outline: App settings - Request for mobile change
    # Verify user is able to change mobile number
    # Verify system display message "we will verify this message and will revert in 48hours"
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select app settings
    Then MI user can see request for change
    Then MI user can see message we will verify this message and will revert in 48hours
    When MI user select phone number
    Then MI user is on request for change number page
    When MI user enter phone number "<phone number>"
    And MI user select submit request button
    Then MI user can see confirmation message

    Examples:
      |pin|phone number|
      | 12345 |54321|

  @ios-test
  Scenario Outline: Report and market insight
    # Verify user is able to view reports regarding the market/industry

    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select report and market insight
    Then MI user is able to view reports regarding the market or industry

    Examples:
      |pin|
      | 12345 |


    #####################################################
    #  View Personal Information                        #
    #####################################################
  @ios-test
  Scenario Outline: View personal information - for Individual Merchants
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select view profile
    Then MI user can see name
    Then MI user can see wakanda membership start date
    Then MI user can see membership
    Then MI user can see address
    Then MI user can see sa id
    #Then Business statistics (Jobs completed, Average customer rating, # of ratings received)  ASK TEAM ABOUT THE INFORMATION AS IT IS NOT CLEAR

    Examples:
      |pin|
      | 12345 |

    #####################################################
    #  View Personal Information                        #
    #####################################################
  @ios-test
  Scenario Outline: View personal information -  Sole Proprietorship
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select view profile
    Then MI user can see business name
    Then MI user can see wakanda membership start date
    Then MI user can see membership
    Then MI user can see address
    Then MI user can see sa id
    Then MI user can see business registration number
    #Then Business statistics (Jobs completed, Average customer rating, # of ratings received)  ASK TEAM ABOUT THE INFORMATION AS IT IS NOT CLEAR

    Examples:
      |pin|
      | 12345 |

    #####################
    #  View Information #
    #####################
  @ios-test
  Scenario Outline: View personal information -  Single and Multi-Director
    Given MI user launch the merchant ios app
    Then MI user is on authentication page
    When MI user select on Use PIN link
    And MI user enter pin "<pin>" to authenticate
    When MI user select on confirm button
    Then MI user is on dashboard page
    When MI user select on my account
    Then MI user can see waka id
    When MI user scroll up
    When MI user select view profile
    Then MI user can see business name
    Then MI user can see wakanda membership start date
    Then MI user can see membership
    Then MI user can see address
    Then MI user can see business registration number
    #Then Business statistics (Jobs completed, Average customer rating, # of ratings received)  ASK TEAM ABOUT THE INFORMATION AS IT IS NOT CLEAR

    Examples:
      |pin|
      | 12345 |

  @ios-test
  Scenario: Add, View and edit personal information
  #BELOW WILL BE EXECUTED MANUALLY - ASK TEAM ABOUT THE steps AS IT IS NOT CLEAR

  #Verify user is able to edit primary phone number (edit only via OTP on email + Approve-IT on new number)
  #Verify user is able to edit email address (edit only via OTP on email + Approve-IT on new number)
  #Verify user is able to add Secondary mobile number
  #Verify user is able to see message saying that receiving messages additional mobile will incur additional cost to the merchant
  #Verify user is able to view and add photo
  #Verify user is able to view and add primary phone number
  #Verify user is able to view and add email address
  #Verify user cannot change Primary Phone number and Email address in the same action


  @ios-test
  Scenario: Add, View and edit business information
    #BELOW WILL BE EXECUTED MANUALLY - ASK TEAM ABOUT THE steps AS IT IS NOT CLEAR

  #Verify user is able to edit primary phone number (edit only via OTP on email + Approve-IT on new number)
  #Verify user is able to edit email address (edit only via OTP on email + Approve-IT on new number)
  #Verify user is able to edit Trading Name (Merchant has to declare that they are using valid/ legal trading name)
  #Verify user is able to edit Trading Address
  #Verify user is able to edit Business description
  #Verify user is able to add Secondary mobile number
  #Verify user is able to see message saying that receiving messages additional mobile will incur additional cost to the merchant
   #Verify user is able to view and add Image for business
  #Verify user is able to view and add primary phone number
  #Verify user is able to view and add email address
  # Verify user cannot change Primary Phone number and Email address in the same action

  #GET CLARITY ON Other director(s) - Name, Mobile numbers (for Multi-Director Business only) and Mention the Primary Number (with a Note that all communication is sent to that number)



  #GET CLARITY ON BELOW ITEMS FROM DEVELOPER
  @ios-test
  Scenario: Public profile - For Sole Prop, Single Director, Multi-director
  #Verify user is able to view business statistics (Jobs completed, Average customer rating, # of ratings received)
  #Verify user is able to view business customer ratings:  # of ratings per rating type (excellent, very good, good, average, poor)
  #Verify user is able to view business customer reviews (text review, photographs)
  #Verify user is able to  "Rate Customer" and "View Job Card" for each review


  @ios-test
  Scenario: Public profile - For Individual Merchant
  #Verify user is able to view statistics (Jobs completed, Average customer rating, # of ratings received)
  #Verify user is able to view  ratings:  # of ratings per rating type (excellent, very good, good, average, poor)
  #Verify user is able to view customer reviews (text review, photographs)
  #Verify user is able to  "Rate Customer" and "View Job Card" for each review
  #Verify user is able to view  Profile completion percentage (L&R info if incomplete: points to be earned on 100% completion




