#@customer-ios
#Feature: As a Customer iOS (CI) user with limited wallet are want to be able to upgrade my wallet to unlimited
#
#  @ios-test @wallet
#  Scenario Outline: Wallet step up - faceless fica and address
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    Then CI user can see MobiMoney balance text
#    And CI user can see YourPoints balance text
#    And CI user select upgrade my wallet link
#    When CI user select upgrade my wallet link
#    Then CI user is on address page
#    When CI user enter house number and complex name "<house number and complex name>"
#    And CI user enter street name "<street name>"
#    And CI user enter suburb "<suburb>"
#    And CI user enter city "<city>"
#    And CI user enter postal code "<postal code>"
#    And CI user select next button
#    Then CI user is on the first risk profile question page
#    When CI user select first answer "<first answer>"
#    And CI user select next button
#    Then CI user is on the second risk profile question page
#    When CI user select second answer "<second answer>"
#    And CI user select next button
#    Then CI user is on the third risk profile question page
#    When CI user select third answer "<third answer>"
#    And CI user select next button
#    Then CI user is on the forth risk profile question page
#    When CI user select forth answer "<fourth answer>"
#    And CI user select next button
#    Then CI user is on the fifth risk profile question page
#    When CI user select fifth answer "<fifth answer>"
#    And CI user select next button
#    Then CI user is on the sixth risk profile question page
#    When CI user select sixth answer "<sixth answer>"
#    And CI user select next button
#    Then CI user is on take id photo page
#    When CI user select continue button
#    Then CI user take id photo using phone camera
#    And CI user id uploaded page
#    When CI user select submit button
#    Then CI user is on your wallet is unlimited now page
#    When CI user can see start exploring button
#
#
#    Examples:
#      | pin   | house number and complex name | street name | suburb | city | postal code | first answer | second answer | third answer | fourth answer | fifth answer | sixth answer |
#      | 12345 |                               |             |        |      |             |              |               |              |               |              |              |
#
#  @ios-test @wallet
#  Scenario Outline: Wallet step up - faceless fica
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    Then CI user can see MobiMoney balance text
#    And CI user can see YourPoints balance text
#    And CI user select upgrade my wallet link
#    When CI user select upgrade my wallet link
#    Then CI user is on the second risk profile question page
#    When CI user select second answer "<second answer>"
#    And CI user select next button
#    Then CI user is on the third risk profile question page
#    When CI user select third answer "<third answer>"
#    And CI user select next button
#    Then CI user is on the forth risk profile question page
#    When CI user select forth answer "<fourth answer>"
#    And CI user select next button
#    Then CI user is on the fifth risk profile question page
#    When CI user select fifth answer "<fifth answer>"
#    And CI user select next button
#    Then CI user is on the sixth risk profile question page
#    When CI user select sixth answer "<sixth answer>"
#    And CI user select next button
#    Then CI user is on take id photo page
#    When CI user select continue button
#    Then CI user take id photo using phone camera
#    And CI user id uploaded page
#    When CI user select submit button
#    Then CI user is on your wallet is unlimited now page
#    When CI user can see start exploring button
#
#    Examples:
#      | pin | second answer | third answer | fourth answer | fifth answer | sixth answer |
#      |     |               |              |               |              |              |
#
#  @ios-test @wallet
#  Scenario Outline: Wallet step up - address
#    Given CI user launch the customer ios app
#    And CI user enter pin "<pin>" to authenticate
#    When CI user select confirm button
#    Then CI user is on the dashboard page
#    Then CI user can see MobiMoney balance text
#    And CI user can see YourPoints balance text
#    And CI user select upgrade my wallet link
#    When CI user select upgrade my wallet link
#    Then CI user is on address page
#    When CI user enter house number and complex name "<house number and complex name>"
#    And CI user enter street name "<street name>"
#    And CI user enter suburb "<suburb>"
#    And CI user enter city "<city>"
#    And CI user enter postal code "<postal code>"
#    When CI user select submit button
#    Then CI user is on your wallet is unlimited now page
#    When CI user can see start exploring button
#
#    Examples:
#      | pin | house number and complex name | street name | suburb | city | postal code |
#      |     |                               |             |        |      |             |