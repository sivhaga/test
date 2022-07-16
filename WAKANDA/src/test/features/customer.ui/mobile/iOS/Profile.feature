@customer-ios
Feature: Profile - As a Customer IOS (CI) user, I want to manage my account

  @ios-test @profile
  Scenario: View all customer profile menu - pre-login
    Given CI user launch the customer ios app
    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on more page
#    When CI user is on profile page
    Then CI user can see sign in button
    Then CI user can see refer a friend profile menu
    Then CI user can see help and support profile menu
    Then CI user can see terms and conditions profile menu
    Then CI user can see rate aus profile menu
    Then CI user can see about us profile menu
    Then CI user can see logout button


  @ios-test @profile
  Scenario: View all customer profile menu - post-login
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user can see customer name label
    Then CI user can see waka id label
    Then CI user can see qr code profile menu
    Then CI user can see saved accounts and cards profile menu
    Then CI user can see my rewards profile menu
    Then CI user can see addresses profile menu
    Then CI user can see favourite profile menu
    Then CI user can see order history profile menu
    When CI user scroll up
    Then CI user can see app settings profile menu
    Then CI user can see refer a friend profile menu
    Then CI user can see help and support profile menu
    Then CI user can see terms and conditions profile menu
    Then CI user can see rate aus profile menu
    Then CI user can see about us profile menu

  @ios-test @profile
  Scenario Outline: QR code
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up
    When CI user select qr code profile menu
    Then CI user is on qr code page

    Examples:
      | pin   |
      | 12345 |

  @ios-test @profile
  Scenario Outline: Saved accounts and cards
    Given CI user launch the customer ios app
#    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
    When CI user select saved accounts and cards profile menu
    Then CI user is on saved accounts and cards page

    Examples:
      | pin   |
      | 12345 |

  @ios-test @profile
  Scenario Outline: My rewards
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
    When CI user is on profile page
    When CI user select my rewards profile menu
    Then CI user is on my rewards page

    Examples:
      | pin   |
      | 12345 |

  @ios-test @profile
  Scenario Outline: Addresses
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up
    When CI user select addresses profile menu
    Then CI user is on addresses page
    When CI user select add new address button
    And CI user search and select delivery address "<address>" from the map
    And CI user search for and select address "<address>"
    Then CI user can see save address button
    When CI user select save address button

    Examples:
      | pin   | address  |
      | 12345 | 105 West |

  @ios-test @profile
  Scenario Outline: Favourites
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
    When CI user select order favourites menu
    Then CI user is on favourites page
    And CI user can see start shopping button
    When CI user select category "<category>" button

    Examples:
      | pin   | category |
      | 12345 |          |


  @ios-test @profile
  Scenario Outline: Order history
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
#    When CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up
    When CI user select order history profile menu
    Then CI user is on profile order history page
    And CI user select going orders button
    Then CI user is on ongoing orders page
    And CI user select past orders button
    And CI user is on past orders page
    When CI user select filter button
    Then CI user is on product filter page
    When CI user select filter by "<filter type>" options
    When CI user select filter by "<filter time>" options
    And CI user select apply button

    Examples:
      | pin   | filter type | filter time |
      | 12345 |             |             |

  @ios-test @profile
  Scenario Outline: App settings
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    When CI user is on profile page

    When CI user select app settings profile menu
    Then CI user is on app settings page

    And CI user select notifications menu
    Then CI user is on notifications page
    And CI user select device back button

    When CI user select change pin menu
    When CI is on current password page
    When CI user enter password "<password>" to verify
    When CI user select next button
    Then CI user is on change pin page
    When CI user enter new pin "<pin>"
    When CI user confirm pin "<confirm pin>"
    And CI user select update password button



    And CI user select change password menu
    When CI is on current password page
    When CI user enter password "<password>" to verify
    When CI user select next button
    Then CI user is on change password page
    When CI user enters username "<new username>" with password "<confirm username>"


    And CI user select fingerprint menu
    And CI user is on fingerprint menu
    When CI user select fingerprint toggle button
    Then CI user can see fingerprint toggle is updated


    Examples:
      | pin   | confirm pin | new username | confirm username |
      | 12345 |             |              |                  |

  @ios-test  @profile
  Scenario Outline: Refer a friend
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up
    When CI user select refer a friend profile menu
    Then CI user is on refer a friend page
    Then CI user can see referral reward for customer
    Then CI user can see referral link for customer
    Then CI user can see referral reward for customer
    Then CI user can see referral link for customer
    When CI user select refer a friend button

    Examples:
      | pin   |
      | 12345 |

  @ios-test @profile
  Scenario Outline: Help and support
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
    And CI user scroll the page down
    When CI user select help and support profile menu
    Then CI user is on help and support page

    Examples:
      | pin   |
      | 12345 |

  @ios-test @profile
  Scenario Outline: View Terms and Conditions
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
#    When CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up

    And CI user select terms and conditions profile menu
    Then CI user is on terms and conditions page
    And CI user can see terms and conditions menu

    When CI user select terms and conditions menu
    And CI user select device back button
    And CI user can see privacy policy menu

    When CI user select privacy policy menu
    And CI user select device back button
    And CI user can see terms of use menu

    And CI user can see terms of use menu
    When CI user select terms of use menu
    And CI user select device back button

    And CI user can see copyrights menu
    When CI user select copyrights  menu
    And CI user select device back button

    And CI user can legal menu
    And CI user can see legal menu
    And CI user select device back button

    And CI user can see return policy menu
    When CI user select return policy  menu
    And CI user select device back button

    Examples:
      | pin   |
      | 12345 |

  @ios-test @profile
  Scenario Outline: Rate us
    Given CI user launch the customer ios app
    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user select more menu
    Then CI user is on profile page
#    When CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up
    When CI user select rate us profile menu
    Then CI user is on rate us page
    When CI user select ratings
    And CI user enter comments "<comments>"
    And CI user select submit button

    Examples:
      | pin   | comments               |
      | 12345 | I like the applicatuon |

  @ios-test @profile
  Scenario Outline: About us
    Given CI user launch the customer ios app
#    Then CI user is on authentication page
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
    Then CI user is on dashboard page
    When CI user can see more menu
    And CI user select more menu
    Then CI user is on profile page
    And CI user select about us profile menu
    Then CI user is on about us page

    Examples:
      | pin   |
      | 12345 |


#  @ios-test @profile
#  Scenario Outline: Logout
#    Given CI user launch the customer ios app
#    Then CI user is on authentication page
#    When CI user select on Use PIN link
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on dashboard page
#    When CI user can see more menu
#    And CI user select more menu
#    Then CI user is on qr code page
#    When CI user is on profile page
#    Then CI user can see waka id label
#    When CI user scroll up
#    When CI user select logout button
#    Then CI user is on authentication page
#
#    Examples:
#      | pin   |
#      | 12345 |
