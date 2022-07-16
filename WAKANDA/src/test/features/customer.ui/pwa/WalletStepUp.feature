@customer-android
Feature: As a customer android (CP) user with limited wallet are want to be able to upgrade my wallet to unlimited

  @android-test
  Scenario Outline: Wallet step up - faceless fica and address
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    Then CP user can see MobiMoney balance text
    And CP user can see YourPoints balance text
    And CP user select upgrade my wallet link
    When CP user select upgrade my wallet link
    Then CP user is on address page
    When CP user enter house number and complex name "<house number and complex name>"
    And CP user enter street name "<street name>"
    And CP user enter suburb "<suburb>"
    And CP user enter city "<city>"
    And CP user enter postal code "<postal code>"
    And CP user select next button
    Then CP user is on the first risk profile question page
    When CP user select first answer "<first answer>
    And CP user select next button
    Then CP user is on the second risk profile question page
    When CP user select second answer "<second answer>"
    And CP user select next button
    Then CP user is on the third risk profile question page
    When CP user select third answer "<third answer>"
    And CP user select next button
    Then CP user is on the forth risk profile question page
    When CP user select forth answer "<fourth answer>"
    And CP user select next button
    Then CP user is on the fifth risk profile question page
    When CP user select fifth answer "<fifth answer>"
    And CP user select next button
    Then CP user is on the sixth risk profile question page
    When CP user select sixth answer "<sixth answer>"
    And CP user select next button
    Then CP user is on take id photo page
    When CP user select continue button
    Then CP user take id photo using phone camera
    And CP user id uploaded page
    When CP user select submit button
    Then CP user is on your wallet is unlimited now page
    When CP user can see start exploring button

    Examples:
      | wakanda username | wakanda password | house number and complex name | street name | suburb | city | postal code | first answer | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |                  |                  |                               |             |        |      |             |              |               |              |               |              |              |

  @android-test
  Scenario Outline: Wallet step up - faceless fica
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    Then CP user can see MobiMoney balance text
    And CP user can see YourPoints balance text
    And CP user select upgrade my wallet link
    When CP user select upgrade my wallet link
    Then CP user is on the second risk profile question page
    When CP user select second answer "<second answer>"
    And CP user select next button
    Then CP user is on the third risk profile question page
    When CP user select third answer "<third answer>"
    And CP user select next button
    Then CP user is on the forth risk profile question page
    When CP user select forth answer "<fourth answer>"
    And CP user select next button
    Then CP user is on the fifth risk profile question page
    When CP user select fifth answer "<fifth answer>"
    And CP user select next button
    Then CP user is on the sixth risk profile question page
    When CP user select sixth answer "<sixth answer>"
    And CP user select next button
    Then CP user is on take id photo page
    When CP user select continue button
    Then CP user take id photo using phone camera
    And CP user id uploaded page
    When CP user select submit button
    Then CP user is on your wallet is unlimited now page
    When CP user can see start exploring button

    Examples:
      | wakanda username | wakanda password | second answer | third answer | fourth answer | fifth answer | sixth answer |
      |                  |                  |               |              |               |              |              |

  @android-test
  Scenario Outline: Wallet step up - address
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    And CP user enters username "<wakanda username>" with password "<wakanda password>"
    When CP user select login button
    Then CP user is on the dashboard page
    Then CP user can see MobiMoney balance text
    And CP user can see YourPoints balance text
    And CP user select upgrade my wallet link
    When CP user select upgrade my wallet link
    Then CP user is on address page
    When CP user enter house number and complex name "<house number and complex name>"
    And CP user enter street name "<street name>"
    And CP user enter suburb "<suburb>"
    And CP user enter city "<city>"
    And CP user enter postal code "<postal code>"
    When CP user select submit button
    Then CP user is on your wallet is unlimited now page
    When CP user can see start exploring button

    Examples:
      | wakanda username | wakanda password | house number and complex name | street name | suburb | city | postal code |
      |                  |                  |                               |             |        |      |             |