#@customer-android
#Feature: As a Customer Android(CA) user,I want to be able to: Buy movie tickets,pay using my wallet, wiew my tickets and get an uber ride to the venue
#
#  @android-test
#  Scenario Outline: Buy movie tickets
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on the dashboard page
#    And CA user can see entertainment widget
#    When CA user select view all movies link
#    Then CA user is on movies list page
#    When CA user select a movie from the list
#    Then CA user can see you will be redirected to NuMetro popup
#    And CA user can see start booking tickets button
#    When CA user select start booking tickets button
#    Then CA user is rederected to MuMetro movie details page
#    When CA user select cinema location "<cinema location>"
#    Then CA user can see movie date and time
#    When CA user select movie date and time "<date and time>"
#    Then CA user is on choose seats page
#    And CA user can see available seats
#    When CA user select unavailable seat
#    Then CA user can see seat is not available for booking message
#    When CA user select device back button
#    When CA user select available seat
#    Then CA user is on add extras page
#    And CA user can see movie ticket total price
#    When CA user add extras
#    Then CA user can see total for extras
#    And CA user can see total for tickets and extras
#    And CA user can see pay using MobiMoney Wallet button
#    When CA user select pay using MobiMoney Wallet button
#    Then CA user is on movie payment page
#    And CA user can see MobiMoney balance text
#    When CA user select pay button
#    Then CA user is on payment confirmation page
#    And CA user can see order number
#    And CA user can see payment successful message
#    And CA user can see view payment here link
#    And CA user can see your tickets are booked label
#    And CA user can see need an uber ride label
#
#    Examples:
#      | pin |
#      | 12345 |
#
#  @android-test
#  Scenario Outline: Pay for and view tickets
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on the dashboard page
#    And CA user can see entertainment widget
#    When CA user select view all movies link
#    Then CA user is on movies list page
#    When CA user select a movie from the list
#    Then CA user can see you will be redirected to NuMetro popup
#    And CA user can see start booking tickets button
#    When CA user select start booking tickets button
#    Then CA user is rederected to MuMetro movie details page
#    When CA user select cinema location "<cinema location>"
#    Then CA user can see movie date and time
#    When CA user select movie date and time "<date and time>"
#    Then CA user is on choose seats page
#    And CA user can see available seats
#    When CA user select unavailable seat
#    Then CA user can see seat is not available for booking message
#    When CA user select device back button
#    When CA user select available seat
#    Then CA user is on add extras page
#    And CA user can see movie ticket total price
#    When CA user add extras
#    Then CA user can see total for extras
#    And CA user can see total for tickets and extras
#    And CA user can see pay using MobiMoney Wallet button
#    When CA user select pay using MobiMoney Wallet button
#    Then CA user is on movie payment page
#    And CA user can see MobiMoney balance text
#    When CA user select pay button
#    Then CA user is on payment confirmation page
#    And CA user can see order number
#    And CA user can see payment successful message
#    When CA user select view your tickets here link
#    Then CA user is on tickets details popup
#    When CA user select device back button
#    And CA user can see your tickets are booked label
#    And CA user can see need an uber ride label
#    When CA user select need a ride to event label
#    Then CA user can see you will be redirected to uber popup
#    And CA user can see open uber button
#    When CA user select open uber button
#    Then CA user is on uber app ride booking page
#
#    Examples:
#      | pin |
#      | 12345 |
#
#  Scenario Outline: Pay for tickets - insufficient balance
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on the dashboard page
#    And CA user can see entertainment widget
#    When CA user select view all movies link
#    Then CA user is on movies list page
#    When CA user select a movie from the list
#    Then CA user can see you will be redirected to NuMetro popup
#    And CA user can see start booking tickets button
#    When CA user select start booking tickets button
#    Then CA user is rederected to MuMetro movie details page
#    When CA user select cinema location "<cinema location>"
#    Then CA user can see movie date and time
#    When CA user select movie date and time "<date and time>"
#    Then CA user is on choose seats page
#    And CA user can see available seats
#    When CA user select unavailable seat
#    Then CA user can see seat is not available for booking message
#    When CA user select device back button
#    When CA user select available seat
#    Then CA user is on add extras page
#    And CA user can see movie ticket total price
#    When CA user add extras
#    Then CA user can see total for extras
#    And CA user can see total for tickets and extras
#    And CA user can see pay using MobiMoney Wallet button
#    When CA user select pay using MobiMoney Wallet button
#    Then CA user is on movie payment page
#    And CA user can see MobiMoney balance text
#    And CA user can see wallet topup options
#
#    Examples:
#      | pin |
#      | 12345 |
#
#
#  Scenario Outline: Order an uber to cinema
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on the dashboard page
#    And CA user can see entertainment widget
#    When CA user select view all movies link
#    Then CA user is on movies list page
#    When CA user select a movie from the list
#    Then CA user can see you will be redirected to NuMetro popup
#    And CA user can see start booking tickets button
#    When CA user select start booking tickets button
#    Then CA user is rederected to MuMetro movie details page
#    When CA user select cinema location "<cinema location>"
#    Then CA user can see movie date and time
#    When CA user select movie date and time "<date and time>"
#    Then CA user is on choose seats page
#    And CA user can see available seats
#    When CA user select unavailable seat
#    Then CA user can see seat is not available for booking message
#    When CA user select device back button
#    When CA user select available seat
#    Then CA user is on add extras page
#    And CA user can see movie ticket total price
#    When CA user add extras
#    Then CA user can see total for extras
#    And CA user can see total for tickets and extras
#    And CA user can see pay using MobiMoney Wallet button
#    When CA user select pay using MobiMoney Wallet button
#    Then CA user is on movie payment page
#    And CA user can see MobiMoney balance text
#    When CA user select pay button
#    Then CA user is on payment confirmation page
#    And CA user can see order number
#    And CA user can see payment successful message
#    And CA user can see view payment here link
#    And CA user can see your tickets are booked label
#    And CA user can see need an uber ride label
#
#    Examples:
#      | pin |
#      | 12345 |
