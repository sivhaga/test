@merchant-android
Feature: Profile - As a Merchant Android(MA) user, I want to manage my account

  @android-test
  Scenario Outline: View all merchant profile menu and information  - DONE
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see merchant name
    #Then waka id text is displayed
    Then MA user can see waka id
    #Then MA user can see times hire
    #Then MA user can see user rating
    #Then MA user can see reviews
    Then MA user can see my past projects menu
    Then MA user can see statements menu
    Then MA user can see reports and market insight menu
    Then MA user can see job settings menu
    When MA user scroll up
    Then MA user can see payment settings menu
    Then MA user can see app settings menu
    Then MA user can see my rewards menu
    Then MA user can see help and support menu
    Then MA user can see refer a friend menu
    Then MA user can see terms and conditions menu
    Then MA user can see privacy policy menu
    Then MA user can see about us menu
    Then MA user can see rate and share menu
    Then MA user can see logout

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: View Terms and Conditions
    #LINK IS NOT CLICKABLE AND CONTENT NEED TO BE PROVIDED
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    And MA user select terms and conditions
    Then MA user can see terms and conditions

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Private Policy
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    And MA user select private policy
    Then MA user can see private policy

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: About us
    #LINK IS NOT CLICKABLE AND CONTENT NEED TO BE PROVIDED
    Given MA user launch the merchant android app
    #Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    And MA user select about us
    Then MA user can see about us

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Refer a friend

    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select refer a friend
    Then MA user is able to see referral reward for merchant
    Then MA user is able to see referral link for merchant
    Then MA user is able to see referral reward for customer
    Then MA user is able to see referral link for customer

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Rate us
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select rate us
    Then MA user is on rate us page
    And MA user select ratings
    And MA user enter comments "<comments>"
    And MA user select submit button

    Examples:
      |pin|comments|
      | 12345 |I like the applicatuon|

  @android-test
  Scenario Outline: Logout
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select logout
    Then MA user can see logout confirmation page
    When MA user select logout button
    Then MA user is on authentication page

    Examples:
      |pin|
      | 12345 |


  @android-test
  Scenario Outline: Help and Support - View contact information
  #Verify user is able to view toll free contact number
  #Verify user is able to view email address

    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select help and support
    When MA user scroll up
    Then MA user can see toll free contact number
    Then MA user can see email address

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario: Help and Support - Seek payment related support
  # HERE WE DONT HAVE ALL WIREFRAMES, CONTACT VARUN
  #Verify user is able to see Payments not received related support details
  #Verify user is able to see Payment limit related support details\
  #Verify user is able to see Payment notification related support details

  @android-test
  Scenario:  Help and Support - Request job related support
  #Verify user is able to see Cancelled jobs received related support details
  #Verify user is able to see Job conversion related support details\
  #Verify user is able to see Job pricing related support details

  @android-test
  Scenario: Help and Support - Request profile related support
  #Verify user is able to Change in Business structure
  #Verify user is able to Edit Profile information

  @android-test
  Scenario:  Help and Support - View past support requests
  #Verify user is able to view open and resolved requests details
  #Verify user is able to view support request conversation history

  @android-test
  Scenario: Help and Support - Contact support (in app call, text message)
  #Verify user is able to see Bank, wallet and payments contact support details
  #Verify user is able to see Job orders contact support details
  #Verify user is able to see B2B contact support details
  #Verify user is able to see Banking Products contact support details
  #Verify user is able to see Prepaids contact support details
  #Verify user is able to see Rewards and Loyalty contact support details
  #Verify user is able to see Other contact support details

  @android-test
  Scenario: Help and Support - View Past conversations
  #Verify user is able to view past conversations details


  @android-test
  Scenario Outline: View past completed projects
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select my past projects
    Then MA user is on my project page
    When MA user select completed
    Then MA user can see completed projects
    When MA user select on completed project
    Then MA user can see customer name
    Then MA user can see address
    Then MA user can see description
    Then MA user can see project status
    Then MA user can see job id
    Then MA user can see project price and break-up
    When MA user scroll up
    Then MA user can see job activity and payment history
    Then MA user can see payment milestones
    Then MA user can see chat history
    Then MA user can see initiate refund
    #Then MA user can see Report a problem

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: View my cancelled projects
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select my past projects
    Then MA user is on my project page
    When MA user select cancelled
    Then MA user can see cancelled projects
    When MA user select on cancelled project
    Then MA user can see customer name
    Then MA user can see address
    Then MA user can see expected date
    Then MA user can see budget
    Then MA user can see description
    Then MA user can see photos
    When MA user scroll up
    Then MA user can see project status
    Then MA user can see cancellation date
    Then MA user can see cancellation fee received
    Then MA user can see job id
    Then MA user can see reason for cancellation
    Then MA user can see chat history
    #Then Report a problem

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Act on past projects
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select my past projects
    Then MA user is on my project page
    #WE NEED STEPS HERE
    #Then Report a problem is displayed

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: View and share Statements
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select statements
    Then MA user is on the statement page
    When MA user select on statement icon
    Then MA user can see generate new statement
    When MA user select statements
    Then MA user can see statement
    When MA user share statement
    Then MA user can share statement

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Generate new statement based on all date filters
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select statements
    Then MA user is on the statement page
    When MA user select on statement icon
    Then MA user can see generate new statement
    When MA user select generate new statement
    Then MA user is on the filter page
    When MA user select today
    And MA user select transaction types
    And MA user select view statement
    Then MA user is able to see list of transaction
    When MA user select back
    And MA user select this week
    And MA user select transaction types
    When MA user scroll up
    And MA user select view statement
    Then MA user is able to see list of transaction
    When MA user select back
    And MA user select this month
    And MA user select transaction types
    And MA user select view statement
    Then MA user is able to see list of transaction
    When MA user select back
    And MA user select custom dates
    And MA user select dates
    And MA user select transaction types
    When MA user select download or share statement
    And MA user select view statement
    Then MA user can generate statement

    Examples:
    |pin|
    | 12345 |

  @android-test
  Scenario Outline: Generate new statement based all filtering criteria
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select statements
    Then MA user is on the statement page
    When MA user select on statement icon
    Then MA user can see generate new statement
    When MA user select generate new statement
    Then MA user is on the filter page
    When MA user select this week
    And MA user select transaction types
    And MA user enter "<received from>"
    And MA user select location
    And MA user select view statement
    Then MA user is able to see list of transaction
    When MA user select download or share statement
    Then MA user can generate statement

    Examples:
      |pin|received from|
      | 12345 |name|

  @android-test
  Scenario Outline: View Rewards
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select my rewards
    Then MA user is able to see waka points

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


  @android-test
  Scenario Outline: Job Settings
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select job settings
    Then MA user on the job settings page
    #Allow user to search location on map using location name
    Then MA user is able to change job location
    #Set distance range of jobs from my job location
    Then MA user is able to restrict jobs by distance
    #Set budget range for my jobs (default Min 0 to Max unlimited)
    Then MA user is able to restrict jobs by budget
    #Set my availability on days of the week (default setting to All weekdays) & time slots (All Day - default, set start and end time)
    Then MA user is able to set availability on days of the week and time slots
    Then MA user is able to set unavailability
    Then MA user is able to set availability

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Payment Settings - View my primary bank account details
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user on the payment settings page
    Then MA user can see bank name
    Then MA user can see account holder
    Then MA user can see account number partially masked
    Then MA user can see branch code
    Then MA user can see account type

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Payment Settings - Add Nedbank account
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user on the payment settings
    When MA user select add another account
    Then MA user is on add another account
    And MA user select add Nedbank account option
    Then MA user can see login screen
    When MA user enter MA user id "<User id>" as MA user id
    And MA user enter password "<password>" as password
    And MA user select submit button
    Then MA user can see add confirmation screen
    #Confirm delete action for primary bank account
    #Verify user is able to set a primary bank account if two added
     Examples:
      |pin|User id|password|
      | 12345 |test |password|

  @android-test
  Scenario Outline: Payment Settings - Add another bank account
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user on the payment settings
    When MA user select add another account
    Then MA user is on add another account
    And MA user select add another bank account option
    Then MA user can see wallet account details screen
    Then MA user can see name field
    Then MA user can see account number
    Then MA user can see bank name
    Then MA user can see branch code
    Then MA user can see reference
    #Confirm delete action for primary bank account
    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Payment Settings - Delete bank account
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user on the payment settings
    When MA user select delete
    Then MA user can see delete confirmation screen
    And MA user select delete option
    Then MA user can see a delete confirmation screen

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Payment Settings - View and Edit Manage QR
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment setting
    Then MA user can see manage qr
    Then MA user can see default qr display name
    When MA user select edit qr
    And MA user enter qr display name "<qr display name>"
    And MA user select update button
    Then MA user can see qr display name is updated

    Examples:
      |pin|qr display name|
      | 12345 |peter sivhaga|

  @android-test
  Scenario Outline: Payment Settings - Set auto settlement instructions to select bank account to settle funds
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user can see settlements
    When MA user enable auto settlement
    And MA user select account for profile
    #Verify user is able to select bank a/c to settle funds, select settlement frequency (daily, weekly, monthly)
    And MA user select settlement frequency
    Then MA user can set settlement instruction
    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Payment Settings - View Wallet Limits as decided by bank same for all users
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user can see transaction charges
    Then MA user can see wallet to wakanda wallet
    Then MA user can see wallet to other target source

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: Payment Settings - View transaction charges as decided by bank same for all users
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select payment settings
    Then MA user can see wallet limits
    Then MA user can see daily limit
    Then MA user can see monthly limit
    Then MA user can see settlement to bank limit

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: App settings - Login security change password authentication
  # Verify user is able to change Password  (via Old password or Forgot Password Recovery through OTP on email or mobile number)
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select app settings
    Then MA user can see login security
    When MA user select change password
    And MA user enter new password "<new password>"
    And MA user confirm password "<confirm password>"
    And MA user select save
    Then MA user can see confirmation message

    Examples:
      |pin|current password|new password|confirm password|
      | 12345 |current password|new password|confirm password|

  @android-test
  Scenario Outline: App settings - Login security change PIN authentication
    # Verify user is able to change PIN  (via Current PIN or Forgot PIN Recovery through OTP on email or mobile number)
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select app settings
    Then MA user can see login security
    When MA user select change pin
    And MA user enter current pin "<pin>"
    And MA user select confirm button
    And MA user enter new pin "<new pin>"
    And MA user select confirm button
    And MA user confirm pin "<confirm pin>"
    And MA user select confirm button
    Then MA user can see confirmation message

    Examples:
      |pin|new pin|confirm pin|
      | 12345 |54321|54321|

  @android-test
  Scenario Outline: App settings - Login security change wallet transaction authentication
  # Verify is able to enable/disable Face ID authentication
  # Verify is able to enable/disable Touch ID authentication
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select app settings
    Then MA user can see login security
    When MA user enable face id authentication
    Then MA user can set face id authentication
    When MA user enable touch id authentication
    Then MA user can set touch id authentication

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: App settings - Wallet security change PIN authentication
    # Verify user is able to change PIN  (via Current PIN or Forgot PIN Recovery through OTP on email or mobile number)
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select wallet security
    Then MA user can see login security
    When MA user select change pin
    And MA user enter current pin "<pin>"
    And MA user select confirm button
    And MA user enter new pin "<new pin>"
    And MA user select confirm button
    And MA user confirm pin "<confirm pin>"
    And MA user select confirm button
    Then MA user can see confirmation message

    Examples:
      |pin|new pin|confirm pin|
      | 12345 |54321|54321|

  @android-test
  Scenario Outline: App settings - Wallet security change wallet transaction authentication
  # Verify user is able to enable/disable Face ID authentication
  # Verify user is able to enable/disable Touch ID authentication
  # Verify user is able to authenticate using  Face ID/Touch ID after enabled
  # Verify user is not able to authenticate using  Face ID/Touch ID after disabled
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select app settings
    Then MA user can see wallet security
    When MA user enable face id authentication
    And MA user disable face id authentication
    Then MA user face id authentication is disabled and enabled
    When MA user enabled touch id authentication
    And MA user disabled touch id authentication
    Then MA user touch id authentication is disabled and enabled

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: App settings - Enable / disable notification preferences for push notifications
  # Verify user is able to enable/disable payments notifications
  # Verify user is able to enable/disable job notifications
  # Verify user is able to enable/disable system notifications
  # Verify user is able to enable/disable promotional notifications
  # Verify user is able to enable/disable receive notification on secondary no authentication
  # Verify user is able to see extra charge message when enabling receive notifications on secondary no

    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select app settings
    Then MA user can see notifications
    When MA user enable payments notifications
    And MA user disable payments notifications
    Then MA user disabled and enabled payments notifications
    When MA user enable job notifications
    And MA user disable job notifications
    Then MA user disabled and enabled job notifications
    When MA user enable system notifications
    And MA user disable system notifications
    Then MA user disabled and enabled system notifications
    When MA user enable promotional notifications
    And MA user disable promotional notifications
    Then MA user disabled and enabled promotional notifications
    When MA user enable receive notification
    Then MA user disabled and enabled extra charge message
    When MA user disable receive notification
    Then MA user disabled and enabled receive notification

    Examples:
      |pin|
      | 12345 |

  @android-test
  Scenario Outline: App settings - Request for mobile change
    # Verify user is able to change mobile number
    # Verify system display message "we will verify this message and will revert in 48hours"
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select app settings
    Then MA user can see request for change
    Then MA user can see message we will verify this message and will revert in 48hours
    When MA user select phone number
    Then MA user is on request for change number page
    When MA user enter phone number "<phone number>"
    And MA user select submit request button
    Then MA user can see confirmation message

    Examples:
      |pin|phone number|
      | 12345 |54321|

  @android-test
  Scenario Outline: Report and market insight
    # Verify user is able to view reports regarding the market/industry

    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select report and market insight
    Then MA user is able to view reports regarding the market or industry

    Examples:
      |pin|
      | 12345 |


    #####################################################
    #  View Personal Information                        #
    #####################################################
  @android-test
  Scenario Outline: View personal information - for Individual Merchants
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select view profile
    Then MA user can see name
    Then MA user can see wakanda membership start date
    Then MA user can see membership
    Then MA user can see address
    Then MA user can see sa id
    #Then Business statistics (Jobs completed, Average customer rating, # of ratings received)  ASK TEAM ABOUT THE INFORMATION AS IT IS NOT CLEAR

    Examples:
      |pin|
      | 12345 |

    #####################################################
    #  View Personal Information                        #
    #####################################################
  @android-test
  Scenario Outline: View personal information -  Sole Proprietorship
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select view profile
    Then MA user can see business name
    Then MA user can see wakanda membership start date
    Then MA user can see membership
    Then MA user can see address
    Then MA user can see sa id
    Then MA user can see business registration number
    #Then Business statistics (Jobs completed, Average customer rating, # of ratings received)  ASK TEAM ABOUT THE INFORMATION AS IT IS NOT CLEAR

    Examples:
      |pin|
      | 12345 |

    #####################
    #  View Information #
    #####################
  @android-test
  Scenario Outline: View personal information -  Single and Multi-Director
    Given MA user launch the merchant android app
    Then MA user is on authentication page
    When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see waka id
    When MA user scroll up
    When MA user select view profile
    Then MA user can see business name
    Then MA user can see wakanda membership start date
    Then MA user can see membership
    Then MA user can see address
    Then MA user can see business registration number
    #Then Business statistics (Jobs completed, Average customer rating, # of ratings received)  ASK TEAM ABOUT THE INFORMATION AS IT IS NOT CLEAR

    Examples:
      |pin|
      | 12345 |

  @android-test
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

  @android-test
  Scenario Outline: Add, View and edit business information
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
  #Verify user cannot change Primary Phone number and Email address in the same action

    Given MA user launch the merchant android app
    Then MA user is on authentication page
    #When MA user select on Use PIN link
    And MA user enter pin "<pin>" to authenticate
    When MA user select on confirm button
    Then MA user is on dashboard page
    When MA user select on my account
    Then MA user can see merchant name
    When MA user select view profile
    And  MA user select about
    #Then MA user is on business details screen
    When MA user select edit button
    And  MA user enter business description "<business description>"
    And  MA user enter trading name "<trading name>"
    And  MA user enter email address "<email address>"
    And  MA user enter secondary number "<secondary number>"
    And  MA user select save changes
    Then MA user details are updated

    Examples:
    |business description|trading name|email address| secondary number|
    |Business description updated by automated script|trading name|test@gmail.com|0112345678|

  #GET CLARITY ON Other director(s) - Name, Mobile numbers (for Multi-Director Business only) and Mention the Primary Number (with a Note that all communication is sent to that number)



  #GET CLARITY ON BELOW ITEMS FROM DEVELOPER
  @android-test
  Scenario: Public profile - For Sole Prop, Single Director, Multi-director
  #Verify user is able to view business statistics (Jobs completed, Average customer rating, # of ratings received)
  #Verify user is able to view business customer ratings:  # of ratings per rating type (excellent, very good, good, average, poor)
  #Verify user is able to view business customer reviews (text review, photographs)
  #Verify user is able to  "Rate Customer" and "View Job Card" for each review


  @android-test
  Scenario: Public profile - For Individual Merchant
  #Verify user is able to view statistics (Jobs completed, Average customer rating, # of ratings received)
  #Verify user is able to view  ratings:  # of ratings per rating type (excellent, very good, good, average, poor)
  #Verify user is able to view customer reviews (text review, photographs)
  #Verify user is able to  "Rate Customer" and "View Job Card" for each review
  #Verify user is able to view  Profile completion percentage (L&R info if incomplete: points to be earned on 100% completion




