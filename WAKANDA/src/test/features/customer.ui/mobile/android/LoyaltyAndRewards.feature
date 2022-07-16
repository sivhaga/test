#@customer-android
#Feature: As a Customer Android(CA) user, I want to be able earn and view my loyalty rewards
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - on-boarding
#    Given CA user launch the customer android app
#   # Then CA user is on dashboard page
#    Then CA user is on wakanda username page
#    And CA user can see sign up button
#    When CA user select sign up button
#    Then CA user is on sign up page
#    When CA user enter south african id "<south african id>"
#    And CA user enter cell phone number "<cell phone number>"
#    And CA user give consent to wakanda to process personal info
#    And CA user give accepts wakanda app terms and conditions
#    And CA user give accepts marketing policy
#    And CA user select generate otp button
#    Then CA user is on otp verification page
#    When CA user enter otp "<otp>" to verify mobile number
#    And CA user select verify otp button
#    Then CA user is on take a facial biometric page
#    And CA user select continue button
#    When CA user capture facial biometric
#    Then CA user is on the hang in there page
#    # step missing
#    Then CA user is on personal details page
#    When CA user enter first name "<first name>"
#    And CA user enter last name "<last name>"
#    And CA user enter onboarding email "<email>"
##    And CA user enter occupation "<occupation>"
#    And CA user select next button
#    Then CA user is on set login details page
#    When CA user enter username "<username>"
#    And CA user enter new password "<password>"
#    And CA user confirm password "<confirm password>"
#    And CA user select next button
#    Then CA user is on secure your account page
#    When CA user enter account opt "<pin>" for securing account
#    And CA user select next button
#    Then CA user can see enable device biometric label
#    When CA user confirm pin "<confirm pin>"
#    Then CA user can see device biometric is enabled
#    When CA user select save pin button
#    Then CA user is on welcome to wakanda page
#    When CA user select start exploring button
#    Then CA user can see they have earned WakaPoints popup
#    Then CA user can see upgrade my wallet link
#    Then CA user is on dashboard page
#
#    Examples:
#      | south african id | cell phone number | first name | last name | email          | occupation | otp | username   | password   | confirm password | pin | confirm pin |
#      | 9111225184080    | 0617373770        | Bab        | Noka      | baba@gmail.com |            |     | Testuser10 | Testing@01 | Testing@01       |     |             |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - dashboard
#    Given CA user launch the customer android app
#    Then CA user is on proposition page one
#    When CA user swipe left
#    Then CA user is on proposition page two
#    When CA user swipe left
#    Then CA user is on proposition page three
#    When CA user select lets get started button
##    Then CA user is on dashboard page
##    When CA user select login button
#    Then CA user is on wakanda username page
#    When CA user enter wakanda username "<wakanda username>"
#    And CA user select verify username button
#    Then CA user is on wakanda password page
#    When CA user enter wakanda password "<wakanda password>"
#    And CA user select login button
#    Then CA user is on otp verification page
#    When CA user enter opt "<otp>" for verification
#    And CA user select verify otp button
#    Then CA user is on take a facial biometric page
#    When CA user select continue button
##    And CA user captures their facial biometric
##    Then CA user facial biometric is captured
#    And CA user is on secure your account page
#    When CA user setup pin "<pin>" to secure account
#    And CA user select next button
#    Then CA user can see enable device biometric label
#    When CA user re-enter pin "<confirm pin>" to secure account
#    And CA user select next button
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#
#    Examples:
#      | wakanda username | wakanda password | otp    | pin   | confirm pin |
#      | test             | test             | 123456 | 00000 | 00000       |
#
#
#  @android-test @loyalty-rewards
#  Scenario Outline: One time rewards - new user rewards list page
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#    When CA user select my account menu
#    When CA user select my rewards profile menu
#    Then CA user is on rewards earning page
#    And CA user can see your WakaPoints label
#    And CA user can see always rewarding you label
#    And CA user can see new user bonus label
#    When CA user select one time rewards tab
#    Then CA user can see verify your email label
#    And CA user can see your first p2p transaction label
#    And CA user can see purchase electricity label
#    And CA user can see purchase airtime label
#    And CA user can see purchase data label
#    And CA user can see hire merchant service label
#    And CA user can see purchase data label
#    And CA user can see rate and review recent job label
#    And CA user can see learn more about WakaPoints and rewards label
#
#    Examples:
#      | pin |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Always rewarding - new user rewards list page
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#    When CA user select my account menu
#    When CA user select my rewards profile menu
#    Then CA user is on rewards earning page
#    And CA user can see your WakaPoints label
#    And CA user can see always rewarding you label
#    When CA user select always rewarding tab
#    Then CA user can see referral bonus label
#    And CA user can see electricity label
#    And CA user can see airtime label
#    And CA user can see data label
#    And CA user can see qr transaction label
#    And CA user can see ratings and review label
#    And CA user can see rate and review recent job label
#    And CA user can see learn more about WakaPoints and rewards label
#
#
#    Examples:
#      | pin |
#
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Monthly rewards - new user rewards list page
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#    When CA user select my account menu
#    When CA user select my rewards profile menu
#    Then CA user is on rewards earning page
#    And CA user can see your WakaPoints label
#    And CA user can see always rewarding you label
#    When CA user select monthly rewards tab
#    Then CA user can see daily login bonus label
#    And CA user can see wakanda power user l2 label
#    And CA user can see maintain minimum balance label
#    And CA user can see wakanda power user l2 label
#    And CA user can see rate and review recent job label
#    And CA user can see learn more about WakaPoints and rewards label
#
#    Examples:
#      | pin |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - my rewards
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#    When CA user select my account menu
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    And CA user can see your WakaPoints label
#    And CA user can see claim your offer label
#    And CA can see rewards statement list
#    And CA user can download or share reward statement
#
#    Examples:
#      | pin   |
#      | 12345 |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - search for a reward
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#    When CA user select my account menu
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    And CA user can see your WakaPoints label
#    And CA user can see claim your offer label
#    And CA can see rewards statement list
#    And CA user can download or share reward statement
#    When CA user search for a rewards "<reward>"
#    And CA user select reward from the list
#    Then CA user is on reward details page
#
#    Examples:
#      | pin   | reward |
#      | 12345 |        |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - filter my rewards
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    Then CA user is on dashboard page
#    And CA user can see SokoPoints balance label
#    When CA user select my account menu
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    And CA user can see your WakaPoints label
#    And CA user can see claim your offer label
#    And CA can see rewards statement list
#    And CA user can download or share reward statement
#    When CA user select reward filter button
#    Then CA user is on filters page
#    When CA user select reward filter by "<filter by" options
#    And CA user select show voucher transactions "<show voucher txns>"
#    And CA user select apply button
#    Then CA user can see a filtered by "<filtered by >" rewards
#
#    Examples:
#      | pin   | filter by | show voucher txns | filter by |
#      | 12345 |           |                   |           |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty earn by spend - buy product
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    When CA user select shopping icon
#    Then CA user is on shopping page
#    When CA user select shopping icon
#    Then CA user is on shopping page
#    When CA user select shopping cart icon
#    Then CA user is on shopping cart page
#    And CA user can see number of items in a cart is great than zero
#    And CA user can see number of items matches the product list
#    When CA user select a product from cart list
#    Then CA user can see apply promo code section
#    When CA user apply the promotion code
#    Then CA user can see promo code discount applied to total cart amount
#    When CA user select continue button
#    Then CA user is on delivery method page
#    When CA user select add address option
#    Then CA user is on search address page
#    When CA user search and select delivery address "<delivery address>" from the map
#    And CA user select delivery location from the map
#    Then CA user can see delivery address "<delivery address>" is saved
#    And CA user is on payment page
#    And CA user can available wallet balance
#    And CA user can amount payable "<amount payable>"for order
#    When CA user select pay button
#    Then CA user can see pin or biometric authentication
#    When CA user authenticate themselves
#    Then CA user is on payment options page
#    When CA user select add another payment source
#    Then CA user can see payment source page
#    When CA user select another payment source "<payment source>"
#    When CA user select continue button
#    Then CA user can payment success page
#    # to be confirmed
#
#    Examples:
#      | pin | delivery address | amount payable | payment source |
#      |     | Hom              |                |                |
#
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty earn by spend - order a service
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    And CA user can see list of interested merchants
#    When CA user select one of the interested merchants "<interested merchant>"
#    Then CA user is on interested merchant "<interested merchant>" details page
#    When CA user select assign to job button
#    Then CA user can see job confirmation dialog
#    When CA user select yes go ahead button
#    Then CA user is on service details page
#    And CA user can see job payments and reservations section
#    When CA user select reserve now button
#    Then CA user is on payment reservation page
#    And CA user can see reservation request card
#    And CA user can see MobiMoney wallet balance
#    When CA user select reserve funds button
#    Then CA user is on payment page
#    And CA user can see your project is complete label
#    And CA user can see done button
#    And CA user can see please rate merchant service label
#    And CA user can see write a review to earn points label
#    When CA user rate merchant service
#    Then CA user can see points earned for rating a merchant
#
#
#    Examples:
#      | pin | interested merchant |
#      |     |                     |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - Wallet statement filter
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    When CA user select on my money menu
#    Then CA user is on my money page
#    And CA user can see a list of transaction made
#    When CA user select start date "<start date>"
#    And CA user select start date "<end date>"
#    And CA user select transaction type "<transaction type>"
#    And CA user select show WakaPoints option "<show WakaPoints>"
#    And CA user enter recieved from name "<revieved from>"
#    And CA user enter sent to name "<sent to>"
#    And CA user select apply filter button
#    Then CA user is on wallet transaction statement page
#    And CA user can see WakaPoints transaction on the statement
#    When CA user select transaction from the statement
#    Then CA user is on wallet transaction detail page
#    Then cA user can see WakaPoints to be earned label
#
#    Examples:
#      | pin   | start date | end date | download format |
#      | 12345 |            |          |                 |
#
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty - Behavioural rewards
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user can see a behavioural reward "<behavioural reward>"
#
#    Examples:
#      | pin   | behavioural reward |
#      | 12345 | Happy Birthday!    |
#      | 12345 | Hello Hello!       |
#      | 12345 | Weekly login bonus |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty point exchange - See the list of available partner loyalty programs he can link in the Wakanda app
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    When CA user select more menu
#    Then CA user is on profile page
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    When CA user select add reward programme button
#    Then CA user user can see a list of available partners
#
#
#
#    Examples:
#      | pin   |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty point exchange - See the list of already connected partner loyalty programs
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    When CA user select more menu
#    Then CA user is on profile page
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    When CA user select add reward programme button
#    Then CA user user can see a list of available partners
#    When CA user select loyalty partner to connect
#    Then CA user is on add rewards program page
#    And CA user can see loyalty partner login page
#    When CA user enter loyalty partner username "<loyalty partner username>"
#    And CA user enter loyalty partner password "<loyalty partner password>"
#    And CA user select link button
#    Then CA user is on convert WakaPoints page
#    And CA user can see WakaPoints balance label
#    And CA user can see connected rewards programs label
#
#
#    Examples:
#      | pin   |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty point exchange - Connect a new partner loyalty program
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    When CA user select more menu
#    Then CA user is on profile page
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    When CA user select add reward programme button
#    Then CA user user can see a list of available partners
#    When CA user select loyalty partner to connect
#    Then CA user is on add rewards program page
#    And CA user can see loyalty partner login page
#    When CA user enter loyalty partner username "<loyalty partner username>"
#    And CA user enter loyalty partner password "<loyalty partner password>"
#    And CA user select link button
#    Then CA user is on convert WakaPoints page
#
#    Examples:
#      | pin   |loyalty partner username|loyalty partner password|
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty point exchange - Remove partner loyalty program
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#    Then CA user is on dashboard page
#    When CA user select more menu
#    Then CA user is on profile page
#    When CA user select my rewards profile menu
#    Then CA user is on my rewards page
#    When CA user select add reward programme button
#    Then CA user user can see a list of available partners
#    When CA user select loyalty partner to connect
#    Then CA user is on add rewards program page
#    And CA user can see loyalty partner login page
#    When CA user enter loyalty partner username "<loyalty partner username>"
#    And CA user enter loyalty partner password "<loyalty partner password>"
#    And CA user select link button
#    Then CA user is on convert WakaPoints page
#    And CA user can see WakaPoints balance label
#    And CA user can see connected rewards programs label
#    And CA user can see manage rewards programs
#    When CA user select manage rewards programs button
#    Then CA user can see remove rewards program label
#    When CA user select remove button
#    Then CA user can see reward program is removed from the list
#
#
#    Examples:
#      | pin   |loyalty partner username|loyalty partner password|
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty point exchange - Exchange partner loyalty points into WakaPoints
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#
#    Examples:
#      | pin   |
#
#  @android-test @loyalty-rewards
#  Scenario Outline: Loyalty point exchange - Exchange partner loyalty points into WakaPoints
#    Given CA user launch the customer android app
#    And CA user enter pin "<pin>" to authenticate
#    When CA user select confirm button
#
#    Examples:
#      | pin   |