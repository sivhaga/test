@Merchant-ios
Feature: Wallet Step Up - As a Merchant iOS (MI) user with limited wallet are want to be able to upgrade my wallet to unlimited

  @ios-test
  Scenario Outline: Wallet step up - faceless fica and address
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on dashboard page
    Then MI user can see MobiMoney balance text
    And MI user can see YourPoints balance text
    And MI user select upgrade my wallet link
    When MI user select upgrade my wallet link
    Then MI user is on address page
    When MI user enter house number and complex name "<house number and complex name>"
    And MI user enter street name "<street name>"
    And MI user enter suburb "<suburb>"
    And MI user enter city "<city>"
    And MI user enter postal code "<postal code>"
    And MI user select next button
    Then MI user is on the first risk profile question page
    When MI user select first answer "<first answer>"
    And MI user select next button
    Then MI user is on the second risk profile question page
    When MI user select second answer "<second answer>"
    And MI user select next button
    Then MI user is on the third risk profile question page
    When MI user select third answer "<third answer>"
    And MI user select next button
    Then MI user is on the forth risk profile question page
    When MI user select forth answer "<fourth answer>"
    And MI user select next button
    Then MI user is on the fifth risk profile question page
    When MI user select fifth answer "<fifth answer>"
    And MI user select next button
    Then MI user is on the sixth risk profile question page
    When MI user select sixth answer "<sixth answer>"
    And MI user select next button
    Then MI user is on take id photo page
    When MI user select continue button
    Then MI user take id photo using phone camera
    And MI user id uploaded page
    When MI user select submit button
    Then MI user is on your wallet is unlimited now page
    When MI user can see start exploring button


    Examples:
      | pin   | house number and complex name | street name | suburb | city | postal code | first answer | second answer | third answer | fourth answer | fifth answer | sixth answer |
      | 12345 |                               |             |        |      |             |              |               |              |               |              |              |

  @ios-test
  Scenario Outline: Wallet step up - faceless fica
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on the dashboard page
    Then MI user can see MobiMoney balance text
    And MI user can see YourPoints balance text
    And MI user select upgrade my wallet link
    When MI user select upgrade my wallet link
    Then MI user is on the second risk profile question page
    When MI user select second answer "<second answer>"
    And MI user select next button
    Then MI user is on the third risk profile question page
    When MI user select third answer "<third answer>"
    And MI user select next button
    Then MI user is on the forth risk profile question page
    When MI user select forth answer "<fourth answer>"
    And MI user select next button
    Then MI user is on the fifth risk profile question page
    When MI user select fifth answer "<fifth answer>"
    And MI user select next button
    Then MI user is on the sixth risk profile question page
    When MI user select sixth answer "<sixth answer>"
    And MI user select next button
    Then MI user is on take id photo page
    When MI user select continue button
    Then MI user take id photo using phone camera
    And MI user id uploaded page
    When MI user select submit button
    Then MI user is on your wallet is unlimited now page
    When MI user can see start exploring button

    Examples:
      | pin | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |     |               |              |               |              |              |

  @ios-test
  Scenario Outline: Wallet step up - address
    Given MI user launch the merchant ios app
    And MI user enter pin "<pin>" to authenticate
    When MI user select confirm button
    Then MI user is on the dashboard page
    Then MI user can see MobiMoney balance text
    And MI user can see YourPoints balance text
    And MI user select upgrade my wallet link
    When MI user select upgrade my wallet link
    Then MI user is on address page
    When MI user enter house number and complex name "<house number and complex name>"
    And MI user enter street name "<street name>"
    And MI user enter suburb "<suburb>"
    And MI user enter city "<city>"
    And MI user enter postal code "<postal code>"
    When MI user select submit button
    Then MI user is on your wallet is unlimited now page
    When MI user can see start exploring button

    Examples:
      | pin | house number and complex name | street name | suburb | city | postal code |
      |     |                               |             |        |      |             |