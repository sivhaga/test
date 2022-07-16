@customer-android @profile
Feature: Profile - As a Customer Android (CA) user, I want to manage my account

  Scenario Outline: View all customer profile menu - pre-login
    Given CA user launch the customer android app
    Then CA user is on authentication page
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see sign in button
    Then CA user can see refer a friend profile menu
    Then CA user can see help and support profile menu
    Then CA user can see terms and conditions profile menu
    Then CA user can see rate aus profile menu
    Then CA user can see about us profile menu
    Then CA user can see logout button

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: View all customer profile menu - post-login
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see customer name label
    Then CA user can see waka id label
    Then CA user can see qr code label profile menu
    Then CA user can see saved accounts and cards profile menu
    Then CA user can see my rewards profile menu
    Then CA user can see addresses profile menu
    Then CA user can see favourite profile menu
    Then CA user can see order history profile menu
    When CA user scroll up
    Then CA user can see app settings profile menu
    Then CA user can see refer a friend profile menu
    Then CA user can see help and support profile menu
    Then CA user can see terms and conditions profile menu
    Then CA user can see rate aus profile menu
    Then CA user can see about us profile menu
    Then CA user can see logout button

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: QR code
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select qr code profile menu
    Then CA user is on qr code page
    And CA user can see download qr code link

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: Saved accounts and cards
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select saved accounts and cards profile menu
    Then CA user is on saved accounts and cards page

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: My rewards
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select my rewards profile menu
    Then CA user is on my rewards page

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: Addresses
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select addresses profile menu
    Then CA user is on addresses page
    When CA user select add new address button
    And CA user search and select delivery address "<address>" from the map
    And CA user search for and select address "<address>"
    Then CA user can see save address button
    When CA user select save address button

    Examples:
      | pin   | address |
      | 12345 |         |

  @android-test @profile
  Scenario Outline: Favourites
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select order favourites menu
    Then CA user is on favourites page
    And CA user can see start shopping button
    When CA user select category "<category>" button

    Examples:
      | pin   | category |
      | 12345 |          |


  @android-test @profile
  Scenario Outline: Order history
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select order history profile menu
    Then CA user is on order history  page
    And CA user select going orders button
    Then CA user is on ongoing orders page
    And CA user select past orders button
    And CA user is on past orders page
    When CA user select filter button
    Then CA user is on product filter page
    When CA user select filter by "<filter type>" options
    When CA user select filter by "<filter time>" options
    And CA user select apply button

    Examples:
      | pin   | filter type | filter time |
      | 12345 |             |             |

  @android-test @profile
  Scenario Outline: App settings
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select app settings profile menu
    Then CA user is on app settings page

    And CA user select notifications menu
    Then CA user is on notifications page
    And CA user select device back button

    When CA user select change pin menu
    When CA is on current password page
    When CA user enter password "<password>" to verify
    When CA user select next button
    Then CA user is on change pin page
    When CA user enter new pin "<pin>"
    When CA user confirm pin "<confirm pin>"
    And CA user select update password button



    And CA user select change password menu
    When CA is on current password page
    When CA user enter password "<password>" to verify
    When CA user select next button
    Then CA user is on change password page
    When CA user enters username "<new username>" with password "<confirm username>"


    And CA user select fingerprint menu
    And CA user is on fingerprint menu
    When CA user select fingerprint toggle button
    Then CA user can see fingerprint toggle is updated


    Examples:
      | pin   | confirm pin | password | new username | confirm username |
      | 12345 |             |          |              |                  |

  @android-test @profile
  Scenario Outline: Refer a friend
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select refer a friend profile menu
    Then CA user is on refer a friend page
    Then CA user can see referral reward for customer
    Then CA user can see referral link for customer
    Then CA user can see referral reward for customer
    Then CA user can see referral link for customer
    When CA user select refer a friend button

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: Help and support
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select help and support profile menu
    Then CA user is on help and support page

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: View Terms and Conditions
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up

    And CA user select terms and conditions profile menu
    Then CA user is on terms and conditions page
    And CA user can see terms and conditions menu

    When CA user select terms and conditions menu
    And CA user select device back button
    And CA user can see privacy policy menu

    When CA user select privacy policy menu
    And CA user select device back button
    And CA user can see terms of use menu

    And CA user can see terms of use menu
    When CA user select terms of use menu
    And CA user select device back button

    And CA user can see copyrights menu
    When CA user select copyrights  menu
    And CA user select device back button

    And CA user can legal menu
    And CA user can see legal menu
    And CA user select device back button

    And CA user can see return policy menu
    When CA user select return policy  menu
    And CA user select device back button

    Examples:
      | pin   |
      | 12345 |

  @android-test @profile
  Scenario Outline: Rate us
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select rate us profile menu
    Then CA user is on rate us page
    When CA user select ratings
    And CA user enter comments "<comments>"
    And CA user select submit button

    Examples:
      | pin   | comments               |
      | 12345 | I like the applicatuon |

  @android-test @profile
  Scenario Outline: About us
    Given CA user launch the customer android app
    Then CA user is on authentication page
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    And CA user select about us profile menu
    Then CA user is on about us page

    Examples:
      | pin   |
      | 12345 |


  @android-test @profile
  Scenario Outline: Logout
    Given CA user launch the customer android app
    Then CA user is on authentication page
    When CA user select on Use PIN link
    And CA user enter pin "<pin>" to authenticate
    When CA user select confirm button
    Then CA user is on dashboard page
    When CA user select my account menu
    When CA user is on profile page
    Then CA user can see waka id label
    When CA user scroll up
    When CA user select logout button
    Then CA user is on authentication page

    Examples:
      | pin   |
      | 12345 |
