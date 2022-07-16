@customer-android
Feature: As a Customer Android (CA) user, I want to be able to view the product catalogue

  @android-test @buy-product
  Scenario: View catalog pre-login
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on eshop page
    And CA user can see home sub menu
    And CA user can see tech sub menu
    And CA user can see beauty & personal care sub menu
    And CA user can see luggage and travel sub menu
    And CA user can see experiences sub menu
    And CA user can see travel sub menu
    And CA user can see sign in button
    And CA user can see popular products section
    And CA user can see tips and trends section


  @android-test @buy-product
  Scenario: View catalog post-login
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    And CA user can see home sub menu
    And CA user can see tech sub menu
    And CA user can see beauty & personal care sub menu
    And CA user can see luggage and travel sub menu
    And CA user can see experiences sub menu
    And CA user can see travel sub menu
#    And CA user can see fashion sub menu
#    And  CA user can see gifting sub menu
#    And CA user can see deals of the day section
#    And CA user can see recommendations section
#    And CA user can see shop by brands section
#    And CA user can see tips and trends section


  @android-test1 @buy-product
  Scenario Outline: Select product category
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see shop now button
    Then CA user can see shop by category "<shopping category>"

    Examples:
      | shopping category      |
      | Home                   |
      | Tech                   |
      | Beauty & Personal Care |
      | Luggage & Travel       |
#      | Fashion                |
#      | Gifting                |
      | Experiences            |
      | Travel                 |

  @android-test @buy-product @smoke
  Scenario Outline: Select and view product
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see shop now button
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    When CA user select product category
    When CA user select product category
    When CA user select product category
    Then CA user is on product detail page

    Examples:
      | shopping category      | shopping subcategory |
      | Luggage & Travel       | Accessories          |
      | Home                   | Furniture            |
      | Beauty & Personal Care | Personal Care        |
      | Experiences            | Activities           |
      | Travel                 | Weekend Packages     |
      | Tech                   | Cell Phones          |


  @android-test @buy-product
  Scenario Outline: Sort shopping product list
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
#    And CA user can see deals of the day section
#    And CA user can see recommendations section
#    And CA user can see shop by brand section
#    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see shop now button
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    When CA user select product category
    When CA user select product category
    And CA user can see a product list catalogue
    When CA user select sort and filter button
    Then CA user is on product sort and filter page
    When CA user select sort by "<sort by>" option
    And CA user select apply filter button
    And CA user can see a sorted by "<sort by>" product list catalogue

    Examples:
      | shopping category | shopping subcategory | sort by    |
      | Home              | Furniture            | Popularity |

  @android-test @buy-product
  Scenario Outline: Filter shopping product list
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
#    And CA user can see deals of the day section
#    And CA user can see recommendations section
#    And CA user can see shop by brand section
#    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    When CA user select product category
    When CA user select product category
    And CA user can see a product list catalogue
    When CA user select sort and filter button
    Then CA user is on product sort and filter page
    When CA user select filter by "<filter by>" options
    Then CA user can see a filtered by "<filter by>" product list catalogue

    Examples:
      | pin | shopping category | shopping subcategory | filter by |
      |     | Home              | Furniture            | Couches   |

  @android-test @buy-product
  Scenario Outline: Select offers related to the product
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
#    And CA user can see deals of the day section
#    And CA user can see recommendations section
#    And CA user can see shop by brand section
#    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user select a product from the catalogue
    Then CA user is on product detail page
    And CA user can see offers related to the product

    Examples:
      | pin | shopping category | shopping subcategory |
      |     | Home              |                      |

  @android-test @buy-product
  Scenario Outline: View the warranty details
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
#    And CA user can see deals of the day section
#    And CA user can see recommendations section
#    And CA user can see shop by brand section
#    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user scroll the page down
    Then CA user can see warranty details section

    Examples:
      | pin | shopping category | shopping subcategory |
      |     | Home              |                      |

  @android-test @buy-product
  Scenario Outline: Save product from results list
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    And CA user can see deals of the day section
    And CA user can see recommendations section
    And CA user can see shop by brand section
    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user select like product button from product list page
    Then CA user can see product is added to the wish list

    Examples:
      | pin | shopping category | shopping subcategory |
      |     | Home              |                      |

  @android-test @buy-product
  Scenario Outline: Save product from product details page
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    And CA user can see deals of the day section
    And CA user can see recommendations section
    And CA user can see shop by brand section
    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user select a product from the catalogue
    Then CA user is on product detail page
    When CA user select like product button from product detail page
    Then CA user can see product is added to the wish list

    Examples:
      | pin | shopping category | shopping subcategory |
      |     | Home              |                      |

  @android-test @buy-product
  Scenario Outline: Share product from product details page
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    And CA user can see deals of the day section
    And CA user can see recommendations section
    And CA user can see shop by brand section
    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user select a product from the catalogue
    Then CA user is on product detail page
    When CA user select share product button
    Then CA user is on sharing apps page

    Examples:
      | pin | shopping category | shopping subcategory |
      |     | Home              |                      |

  @android-test @buy-product
  Scenario Outline: Swipe through product images
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select shopping icon
    Then CA user is on shopping page
    And CA user can see deals of the day section
    And CA user can see recommendations section
    And CA user can see shop by brand section
    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user select a product from the catalogue
    Then CA user is on product detail page
    And CA user can see product colour
    When CA user swipe left
    When CA user swipe left
    When CA user swipe left
    Then CA user is on the last carousel

    Examples:
      |      | pin | shopping category | shopping subcategory |
      | Home |     |                   |                      |

  @android-test @buy-product
  Scenario Outline: Select different colour for a product
    Given CA user launch the customer android app
    Then CA user is on dashboard page
    When CA user select login button
    When CA user select shopping icon
    Then CA user is on shopping page
    And CA user can see deals of the day section
    And CA user can see recommendations section
    And CA user can see shop by brand section
    And CA user can see tips and trends section
    When CA user select a shopping category "<shopping category>"
    Then CA user is on shopping category "<shopping category>" page
    And CA user can see subcategories under a shopping category "<shopping category>"
    And CA user can see shop by brands section
    And CA user can see sale section
    When CA user select a shopping subcategory "<shopping subcategory>"
    Then CA user is on subcategory "<shopping subcategory>" catalogue page
    And CA user can see a product list catalogue
    When CA user select a product from the catalogue
    Then CA user is on product detail page
    And CA user can see product colour
    And CA user can see select colour text
    When CA user select a different colour
    Then CA user product colour is updated

    Examples:
      | pin | shopping category | shopping subcategory |
      |     | Home              |                      |



