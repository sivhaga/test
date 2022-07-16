@merchant-android
Feature: Wallet Step Up - As a merchant android (MA) user with limited wallet are want to be able to upgrade my wallet to unlimited

  @android-test
  Scenario Outline: Wallet step up - faceless fiMA and address
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text
    And MA user select upgrade my wallet link
    When MA user select upgrade my wallet link
    Then MA user is on address page
    When MA user enter house number and complex name "<house number and complex name>"
    And MA user enter street name "<street name>"
    And MA user enter suburb "<suburb>"
    And MA user enter city "<city>"
    And MA user enter postal code "<postal code>"
    And MA user select next button
    Then MA user is on the first risk profile question page
    When MA user select first answer "<first answer>"
    And MA user select next button
    Then MA user is on the second risk profile question page
    When MA user select second answer "<second answer>"
    And MA user select next button
    Then MA user is on the third risk profile question page
    When MA user select third answer "<third answer>"
    And MA user select next button
    Then MA user is on the forth risk profile question page
    When MA user select forth answer "<fourth answer>"
    And MA user select next button
    Then MA user is on the fifth risk profile question page
    When MA user select fifth answer "<fifth answer>"
    And MA user select next button
    Then MA user is on the sixth risk profile question page
    When MA user select sixth answer "<sixth answer>"
    And MA user select next button
    Then MA user is on take id photo page
    When MA user select continue button
    Then MA user take id photo using phone camera
    And MA user id uploaded page
    When MA user select submit button
    Then MA user is on your wallet is unlimited now page
    When MA user can see start exploring button


    Examples:
      | pin | house number and complex name | street name | suburb | city | postal code | first answer | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |     |                               |             |        |      |             |              |               |              |               |              |              |

  @android-test
  Scenario Outline: Wallet step up - faceless fica
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text
    And MA user select upgrade my wallet link
    When MA user select upgrade my wallet link
    Then MA user is on the second risk profile question page
    When MA user select second answer "<second answer>"
    And MA user select next button
    Then MA user is on the third risk profile question page
    When MA user select third answer "<third answer>"
    And MA user select next button
    Then MA user is on the forth risk profile question page
    When MA user select forth answer "<fourth answer>"
    And MA user select next button
    Then MA user is on the fifth risk profile question page
    When MA user select fifth answer "<fifth answer>"
    And MA user select next button
    Then MA user is on the sixth risk profile question page
    When MA user select sixth answer "<sixth answer>"
    And MA user select next button
    Then MA user is on take id photo page
    When MA user select continue button
    Then MA user take id photo using phone camera
    And MA user id uploaded page
    When MA user select submit button
    Then MA user is on your wallet is unlimited now page
    When MA user can see start exploring button

    Examples:
      | pin | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |     |               |              |               |              |              |

  @android-test
  Scenario Outline: Wallet step up - address
    Given MA user launch the merchant android app
    And MA user enter pin "<pin>" to authenticate
    When MA user select confirm button
    Then MA user is on dashboard page
    Then MA user can see MobiMoney balance text
    And MA user can see YourPoints balance text
    And MA user select upgrade my wallet link
    When MA user select upgrade my wallet link
    Then MA user is on address page
    When MA user enter house number and complex name "<house number and complex name>"
    And MA user enter street name "<street name>"
    And MA user enter suburb "<suburb>"
    And MA user enter city "<city>"
    And MA user enter postal code "<postal code>"
    When MA user select submit button
    Then MA user is on your wallet is unlimited now page
    When MA user can see start exploring button

    Examples:
      | pin | house number and complex name | street name | suburb | city | postal code |
      |     |                               |             |        |      |             |