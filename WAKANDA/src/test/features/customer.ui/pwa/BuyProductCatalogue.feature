@customer-pwa
Feature: As a Customer PWA (CP) user, I want to be able to view the product catalogue

  @pwa-test
  Scenario: View catalog pre-login
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select shopping icon
    Then CP user is on eshop page
    And CP user can see deals of the day section
    And CP user can see sign in button
    And CP user can see popular products section
    And CP user can see tips and trends section


  @pwa-test
  Scenario Outline: View catalog post-login
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brands section
    And CP user can see tips and trends section

    Examples:
      | username | password |
      | test     | test     |

  @pwa-test
  Scenario Outline: Select and view in-stock product
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    And CP user can see number of products left

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Select and view out-of-stock product
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    And CP user can see notify me when in stock button
    When CP user select notify me when in stock button
    Then CP user is on the notification details page
      # how is a notification going to be sent

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Sort shopping product list
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select sort button
    Then CP user is on product sort page
    When CP user select sort by "<sort by>" option
    And CP user can see a sorted by "<sort by>" product list catalogue

    Examples:
      | username | password | shopping category | shopping subcategory | sort by |
      | test     | test     | Home              |                      |         |

  @pwa-test
  Scenario Outline: Filter shopping product list
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select filter button
    Then CP user is on product filter page
    When CP user select filter by "<filter by>" options
    Then CP user can see a filtered by "<filter by>" product list catalogue

    Examples:
      | username | password | shopping category | shopping subcategory | filter by |
      | test     | test     | Home              |                      |           |

  @pwa-test
  Scenario Outline: Select offers related to the product
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    And CP user can see offers related to the product

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: View the warranty details
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user scroll the page down
    Then CP user can see warranty details section

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Save product from results list
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select like product button from product list page
    Then CP user can see product is added to the wishilist

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Save product from product details page
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    When CP user select like product button from product detail page
    Then CP user can see product is added to the wishilist

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Share product from product details page
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    When CP user select share product button
    Then CP user is on sharing app page
    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Swipe through product images
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    And CP user can see product colour
    When CP user swipe left
    When CP user swipe left
    When CP user swipe left
    Then CP user is on the last carousel

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |

  @pwa-test
  Scenario Outline: Select different colour for a product
    Given CP user launch the customer web
    Then CP user is on dashboard page
    When CP user select login button
    Then CP user is on login page
    When CP user enters username "<username>" with password "<password>"
    When CP user select login button
    Then CP user is on the dashboard page
    When CP user select shopping icon
    Then CP user is on shopping page
    And CP user can see deals of the day section
    And CP user can see recommendations section
    And CP user can see shop by brand section
    And CP user can see tips and trends section
    When CP user select a shopping category "<shopping category>"
    Then CP user is on shopping category "<shopping category>" page
    And CP user can see subcategories under a shopping category "<shopping category>"
    And CP user can see shop by brands section
    And CP user can see sale section
    When CP user select a shopping subcategory "<shopping subcategory>"
    Then CP user is on subcategory "<shopping subcategory>" catalogue page
    And CP user can see a product list catalogue
    When CP user select a product from the catalogue
    Then CP user is on product detail page
    And CP user can see product colour
    And CP user can see select colour text
    When CP user select a different colour
    Then CP user product colour is updated

    Examples:
      | username | password | shopping category | shopping subcategory |
      | test     | test     | Home              |                      |



