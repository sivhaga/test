@customer-ios
Feature: As a Customer iOS (CI) user, I want to be able to view the product catalogue

  @ios-test @buy-product @smoke
  Scenario: View catalog pre-login
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on eshop page
    And CI user can see deals of the day section
    And CI user can see sign in button
    And CI user can see popular products section
    And CI user can see tips and trends section


  @ios-test @buy-product @smoke
  Scenario: View catalog post-login
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    And CI user can see deals of the day section
    And CI user can see recommendations section
    And CI user can see shop by brands section


  @ios-test @buy-product @smoke
  Scenario Outline: View categories and sub-categories
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
#    And CI user can see deals of the day section
#    And CI user can see recommendations section
#    And CI user can see shop by brand section
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    And CI user can see view all button
    And CI user can see shop by category label
    When CI user select a shopping subcategory "<shopping subcategory>"
    Then CI user is on shopping sub category "<shopping subcategory>" page
    And CI user can see view all button
    And CI user can see shop by category label
    When CI user select view all button
#    And CI user can see a product list catalogue
#    When CI user select a product from the catalogue
#    Then CI user is on product detail page
#    And CI user can see number of products left

    Examples:
      | shopping category | shopping subcategory |
      | Tech              | Cell Phones          |


  @ios-test @buy-product
  Scenario Outline: Sort shopping product list
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
#    And CI user can see deals of the day section
#    And CI user can see recommendations section
#    And CI user can see shop by brand section
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    And CI user can see view all button
    When CI user select view all button
    Then CI user can see sort and filter button
    When CI user select sort and filter button
    Then CI user is on product sort and filter page
    When CI user select sort by "<sort by>" option
    And CI user select apply button
    And CI user can see a sorted by "<sort by>" product list catalogue

    Examples:
      | shopping category | sort by      |
      | Tech              | ??Popularity |

  @ios-test @buy-product
  Scenario Outline: Filter shopping product list
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
#    And CI user can see deals of the day section
#    And CI user can see recommendations section
#    And CI user can see shop by brand section
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    And CI user can see view all button
    When CI user select view all button
    Then CI user can see sort and filter button
    When CI user select sort and filter button
    Then CI user is on product sort and filter page
    When CI user select filter by "<filter by>" options
    And CI user select apply button
    Then CI user can see a filtered by "<filter by>" product list catalogue

    Examples:
      | pin | shopping category | filter by |
      |     | Tech              |           |

  @ios-test @buy-product
  Scenario Outline: Select offers related to the product
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
#    And CI user can see deals of the day section
#    And CI user can see recommendations section
#    And CI user can see shop by brand section
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    And CI user can see view all button
    And CI user can see shop by category label
    When CI user select a shopping subcategory "<shopping subcategory>"
    Then CI user is on shopping sub category "<shopping subcategory>" page
    And CI user can see view all button
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    And CI user can see offers related to the product

    Examples:
      | shopping category | shopping subcategory |
      | Travel            | Romantic Getaways    |

  @ios-test @buy-product
  Scenario Outline: View the warranty details
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    And CI user can see view all button
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    When CI user scroll the page down
    Then CI user can see warranty details section

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product
  Scenario Outline: Save product from results list
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    And CI user can see view all button
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select like product button from product list page
    Then CI user can see product is added to the wish list

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product
  Scenario Outline: Save product from product details page
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    When CI user select like product button from product detail page

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product
  Scenario Outline: Share product from product details page
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    When CI user select share product button
    Then CI user is on sharing apps page

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product
  Scenario Outline: Swipe through product images
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    When CI user select product detail image
    When CI user swipe left
    When CI user swipe left
    When CI user swipe left
    When CI user swipe left
    Then CI user select close image gallery button
    Then CI user is on product detail page

    Examples:
      | shopping category |
      | Tech              |

  @ios-test @buy-product
  Scenario Outline: Select different colour for a product
    Given CI user launch the customer ios app
    Then CI user is on dashboard page
    When CI user select shopping icon
    Then CI user is on shopping page
    When CI user select a shopping category "<shopping category>"
    Then CI user is on shopping category "<shopping category>" page
    When CI user select view all button
    And CI user can see a product list catalogue
    When CI user select a product from the catalogue
    Then CI user is on product detail page
    And CI user can see product colour
    And CI user can see select colour text
    When CI user select a different colour
    Then CI user product colour is updated

    Examples:
      | shopping category |
      | Tech              |



