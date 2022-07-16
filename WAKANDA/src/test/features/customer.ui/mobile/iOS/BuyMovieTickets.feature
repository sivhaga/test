#@customer-ios
#Feature: As a Customer iOS(CI) user,I want to be able to: Buy movie tickets,pay using my wallet, wiew my tickets and get an uber ride to the venue
#
#  @ios-test
#  Scenario Outline: Buy movie tickets
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    And CI user can see entertainment widget
#    When CI user select view all movies link
#    Then CI user is on movies list page
#    When CI user select a movie from the list
#    Then CI user can see you will be redirected to NuMetro popup
#    And CI user can see start booking tickets button
#    When CI user select start booking tickets button
#    Then CI user is rederected to MuMetro movie details page
#    When CI user select cinema location "<cinema location>"
#    Then CI user can see movie date and time
#    When CI user select movie date and time "<date and time>"
#    Then CI user is on choose seats page
#    And CI user can see available seats
#    When CI user select unavailable seat
#    Then CI user can see seat is not available for booking message
#    When CI user select device back button
#    When CI user select available seat
#    Then CI user is on add extras page
#    And CI user can see movie ticket total price
#    When CI user add extras
#    Then CI user can see total for extras
#    And CI user can see total for tickets and extras
#    And CI user can see pay using MobiMoney Wallet button
#    When CI user select pay using MobiMoney Wallet button
#    Then CI user is on movie payment page
#    And CI user can see MobiMoney balance text
#    When CI user select pay button
#    Then CI user is on payment confirmation page
#    And CI user can see order number
#    And CI user can see payment successful message
#    And CI user can see view payment here link
#    And CI user can see your tickets are booked label
#    And CI user can see need an uber ride label
#
#    Examples:
#      | pin |
#      | 12345 |
#
#  @ios-test
#  Scenario Outline: Pay for and view tickets
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    And CI user can see entertainment widget
#    When CI user select view all movies link
#    Then CI user is on movies list page
#    When CI user select a movie from the list
#    Then CI user can see you will be redirected to NuMetro popup
#    And CI user can see start booking tickets button
#    When CI user select start booking tickets button
#    Then CI user is rederected to MuMetro movie details page
#    When CI user select cinema location "<cinema location>"
#    Then CI user can see movie date and time
#    When CI user select movie date and time "<date and time>"
#    Then CI user is on choose seats page
#    And CI user can see available seats
#    When CI user select unavailable seat
#    Then CI user can see seat is not available for booking message
#    When CI user select device back button
#    When CI user select available seat
#    Then CI user is on add extras page
#    And CI user can see movie ticket total price
#    When CI user add extras
#    Then CI user can see total for extras
#    And CI user can see total for tickets and extras
#    And CI user can see pay using MobiMoney Wallet button
#    When CI user select pay using MobiMoney Wallet button
#    Then CI user is on movie payment page
#    And CI user can see MobiMoney balance text
#    When CI user select pay button
#    Then CI user is on payment confirmation page
#    And CI user can see order number
#    And CI user can see payment successful message
#    When CI user select view your tickets here link
#    Then CI user is on tickets details popup
#    When CI user select device back button
#    And CI user can see your tickets are booked label
#    And CI user can see need an uber ride label
#    When CI user select need a ride to event label
#    Then CI user can see you will be redirected to uber popup
#    And CI user can see open uber button
#    When CI user select open uber button
#    Then CI user is on uber app ride booking page
#
#    Examples:
#      | pin |
#      | 12345 |
#
#  Scenario Outline: Pay for tickets - insufficient balance
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    And CI user can see entertainment widget
#    When CI user select view all movies link
#    Then CI user is on movies list page
#    When CI user select a movie from the list
#    Then CI user can see you will be redirected to NuMetro popup
#    And CI user can see start booking tickets button
#    When CI user select start booking tickets button
#    Then CI user is rederected to MuMetro movie details page
#    When CI user select cinema location "<cinema location>"
#    Then CI user can see movie date and time
#    When CI user select movie date and time "<date and time>"
#    Then CI user is on choose seats page
#    And CI user can see available seats
#    When CI user select unavailable seat
#    Then CI user can see seat is not available for booking message
#    When CI user select device back button
#    When CI user select available seat
#    Then CI user is on add extras page
#    And CI user can see movie ticket total price
#    When CI user add extras
#    Then CI user can see total for extras
#    And CI user can see total for tickets and extras
#    And CI user can see pay using MobiMoney Wallet button
#    When CI user select pay using MobiMoney Wallet button
#    Then CI user is on movie payment page
#    And CI user can see MobiMoney balance text
#    And CI user can see wallet topup options
#
#    Examples:
#      | pin |
#      | 12345 |
#
#
#  Scenario Outline: Order an uber to cinema
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    And CI user can see entertainment widget
#    When CI user select view all movies link
#    Then CI user is on movies list page
#    When CI user select a movie from the list
#    Then CI user can see you will be redirected to NuMetro popup
#    And CI user can see start booking tickets button
#    When CI user select start booking tickets button
#    Then CI user is rederected to MuMetro movie details page
#    When CI user select cinema location "<cinema location>"
#    Then CI user can see movie date and time
#    When CI user select movie date and time "<date and time>"
#    Then CI user is on choose seats page
#    And CI user can see available seats
#    When CI user select unavailable seat
#    Then CI user can see seat is not available for booking message
#    When CI user select device back button
#    When CI user select available seat
#    Then CI user is on add extras page
#    And CI user can see movie ticket total price
#    When CI user add extras
#    Then CI user can see total for extras
#    And CI user can see total for tickets and extras
#    And CI user can see pay using MobiMoney Wallet button
#    When CI user select pay using MobiMoney Wallet button
#    Then CI user is on movie payment page
#    And CI user can see MobiMoney balance text
#    When CI user select pay button
#    Then CI user is on payment confirmation page
#    And CI user can see order number
#    And CI user can see payment successful message
#    And CI user can see view payment here link
#    And CI user can see your tickets are booked label
#    And CI user can see need an uber ride label
#
#    Examples:
#      | pin |
#      | 12345 |