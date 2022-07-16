@customer-android
Feature: As a customer android (CA) user with limited wallet are want to be able to upgrade my wallet to unlimited

  @android-test @wallet
  Scenario Outline: Wallet step up - faceless fica and address
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    Then CA user can see MobiMoney balance text
    And CA user can see YourPoints balance text
    And CA user select upgrade my wallet link
    When CA user select upgrade my wallet link
    Then CA user is on address page
    When CA user enter house number and complex name "<house number and complex name>"
    And CA user enter street name "<street name>"
    And CA user enter suburb "<suburb>"
    And CA user enter city "<city>"
    And CA user enter postal code "<postal code>"
    And CA user select next button
    Then CA user is on the first risk profile question page
    When CA user select first answer "<first answer>"
    And CA user select next button
    Then CA user is on the second risk profile question page
    When CA user select second answer "<second answer>"
    And CA user select next button
    Then CA user is on the third risk profile question page
    When CA user select third answer "<third answer>"
    And CA user select next button
    Then CA user is on the forth risk profile question page
    When CA user select forth answer "<fourth answer>"
    And CA user select next button
    Then CA user is on the fifth risk profile question page
    When CA user select fifth answer "<fifth answer>"
    And CA user select next button
    Then CA user is on the sixth risk profile question page
    When CA user select sixth answer "<sixth answer>"
    And CA user select next button
    Then CA user is on take id photo page
    When CA user select continue button
    Then CA user take id photo using phone camera
    And CA user id uploaded page
    When CA user select submit button
    Then CA user is on your wallet is unlimited now page
    When CA user can see start exploring button


    Examples:
      | pin | house number and complex name | street name | suburb | city | postal code | first answer | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |     |                               |             |        |      |             |              |               |              |               |              |              |

  @android-test @wallet
  Scenario Outline: Wallet step up - faceless fica
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    Then CA user can see MobiMoney balance text
    And CA user can see YourPoints balance text
    And CA user select upgrade my wallet link
    When CA user select upgrade my wallet link
    Then CA user is on the second risk profile question page
    When CA user select second answer "<second answer>"
    And CA user select next button
    Then CA user is on the third risk profile question page
    When CA user select third answer "<third answer>"
    And CA user select next button
    Then CA user is on the forth risk profile question page
    When CA user select forth answer "<fourth answer>"
    And CA user select next button
    Then CA user is on the fifth risk profile question page
    When CA user select fifth answer "<fifth answer>"
    And CA user select next button
    Then CA user is on the sixth risk profile question page
    When CA user select sixth answer "<sixth answer>"
    And CA user select next button
    Then CA user is on take id photo page
    When CA user select continue button
    Then CA user take id photo using phone camera
    And CA user id uploaded page
    When CA user select submit button
    Then CA user is on your wallet is unlimited now page
    When CA user can see start exploring button

    Examples:
      | pin | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |     |               |              |               |              |              |

  @android-test @wallet
  Scenario Outline: Wallet step up - address
    Given CA user launch the customer android app
    Then CA user is on the dashboard page
    Then CA user can see MobiMoney balance text
    And CA user can see YourPoints balance text
    And CA user select upgrade my wallet link
    When CA user select upgrade my wallet link
    Then CA user is on address page
    When CA user enter house number and complex name "<house number and complex name>"
    And CA user enter street name "<street name>"
    And CA user enter suburb "<suburb>"
    And CA user enter city "<city>"
    And CA user enter postal code "<postal code>"
    When CA user select submit button
    Then CA user is on your wallet is unlimited now page
    When CA user can see start exploring button

    Examples:
      | pin | house number and complex name | street name | suburb | city | postal code |
      |     |                               |             |        |      |             |