package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios.IOSObjects;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class BuyProductSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(BuyProductSteps.class);
    private BasePageAndroid page = new BasePageAndroid();
    private Utils util = new Utils();

    @When("^CA user select shopping icon$")
    public void ca_user_select_shopping_icon() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.ESHOP_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a shopping category \"([^\"]*)\"$")
    public void ca_user_select_a_shopping_category_something(String shoppingCategory) {
        try {

            switch (shoppingCategory) {

                case "Home":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_SUB_MENU)).click();
                    break;

                case "Tech":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.TECH_SUB_MENU)).click();
                    break;

                case "Beauty & Personal Care":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.BEAUTY_AND_CARE_SUB_MENU)).click();
                    break;

                case "Luggage & Travel":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.LUGGAGE_AND_TRAVEL_SUB_MENU)).click();
                    break;

                case "Fashion":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FASHION_SUB_MENU)).click();
                    break;

                case "Gifting":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.GIFTING_SUB_MENU)).click();
                    break;

                case "Experiences":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.EXPERIENCES_SUB_MENU)).click();
                    break;

                case "Travel":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.TRAVEL_SUB_MENU)).click();
                    break;

                default:
                    logger.info("Invalid sub menu");
            }


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a shopping subcategory \"([^\"]*)\"$")
    public void ca_user_select_a_shopping_subcategory_something(String shoppingSubCategory) {
        try {
            switch (shoppingSubCategory) {

                case "Furniture":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FURNITURE)).click();
                    break;

                case "Outdoor":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.OUTDOOR)).click();
                    break;

                case "Decor":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DECOR)).click();
                    break;

                case "Home Appliances":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_APPLIANCES)).click();
                    break;

                case "Bed & Bath":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.BED_AND_BATH)).click();
                    break;

                case "Kitchen":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.KITCHEN)).click();
                    break;

                case "Home Organising":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_ORGANISING)).click();
                    break;

                case "Dining":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).click();
                    break;

                default:
                    logger.info("Invalid sub category");
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a product from the catalogue$")
    public void ca_user_select_a_product_from_the_catalogue() {
        try {
            driver.findElement(By.id(AndroidObjects.SUB_CAT_IMAGE)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select product category$")
    public void ca_user_select_a_product_category() {
        try {
            driver.findElement(By.id(AndroidObjects.SUB_CAT_IMAGE)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select number of products \"([^\"]*)\" to add to cart$")
    public void ca_user_select_number_of_products_something_to_add_to_cart(String addToCart) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select add to cart button$")
    public void ca_user_select_add_to_cart_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.ADD_TO_CART_BUTTON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on shopping page$")
    public void ca_user_is_on_shopping_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_SHOPPING_PAGE)).size();
//            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see shop now button$")
    public void ca_user_can_see_shop_now_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.SHOP_NOW_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see shop by category \"([^\"]*)\"$")
    public void ca_user_can_see_shop_by_category_something(String shoppingCategory) {
        try {
            int shopByCategory = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SHOP_BY_CATEGORY)).size();
            Assert.assertEquals(1, shopByCategory);

            switch (shoppingCategory) {

                case "Home":
                    int furniture = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FURNITURE)).size();
                    Assert.assertEquals(1, furniture);
                    int outdoor = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.OUTDOOR)).size();
                    Assert.assertEquals(1, outdoor);
//                    int decor = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.DECOR)).size();
//                    Assert.assertEquals(1, decor);
                    int homeAppliances = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_APPLIANCES)).size();
                    Assert.assertEquals(1, homeAppliances);
                    int bedAndBath = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.BED_AND_BATH)).size();
                    Assert.assertEquals(1, bedAndBath);
                    int kitchen = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.KITCHEN)).size();
                    Assert.assertEquals(1, kitchen);
                    int homeOrganising = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_ORGANISING)).size();
                    Assert.assertEquals(1, homeOrganising);
                    int dining = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).size();
                    Assert.assertEquals(1, dining);
                    break;

                case "Tech":
                    int storage = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.STORAGE)).size();
                    Assert.assertEquals(1, storage);
                    int cellPhones = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CELL_PHONES)).size();
                    Assert.assertEquals(1, cellPhones);
                    int tabletsAndKindles = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TABLES_AND_KINDLES)).size();
                    Assert.assertEquals(1, tabletsAndKindles);
                    int computing = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.COMPUTING)).size();
                    Assert.assertEquals(1, computing);
                    int fitnessWatches = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SMART_AND_FITNESS_WATCHES)).size();
                    Assert.assertEquals(1, fitnessWatches);
                    int cameras = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CAMERAS)).size();
                    Assert.assertEquals(1, cameras);
                    int printingAndImaging = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.PRINTING_AND_IMAGING)).size();
                    Assert.assertEquals(1, printingAndImaging);
                    int audio = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.AUDIO)).size();
                    Assert.assertEquals(1, audio);
                    int gaming = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.GAMING)).size();
                    Assert.assertEquals(1, gaming);
                    break;

                case "Beauty & Personal Care":
                    int personalCare = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.PERSONAL_CARE)).size();
                    Assert.assertEquals(1, personalCare);
                    int beautyAppliances = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.BEAUTY_APPLIANCES)).size();
                    Assert.assertEquals(1, beautyAppliances);
                    int makeUp = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MAKE_UP)).size();
                    Assert.assertEquals(1, makeUp);
//                    int accessories = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ACCESSORIES)).size();
//                    Assert.assertEquals(1, accessories);
//                    int hair = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.HAIR)).size();
//                    Assert.assertEquals(1, hair);
                    int nails = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.NAILS)).size();
                    Assert.assertEquals(1, nails);
                    break;

                case "Luggage & Travel":
                    int travelAccessories = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ACCESSORIES)).size();
                    Assert.assertEquals(1, travelAccessories);
                    int travel = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TRAVEL)).size();
                    Assert.assertEquals(1, travel);
                    int sportsAndDuffels = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SPORTS_AND_DUFFELS)).size();
                    Assert.assertEquals(1, sportsAndDuffels);
                    int backPacks = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.BACKPACKS_MESSANGER)).size();
                    Assert.assertEquals(1, backPacks);
                    break;

                case "Fashion":
                    int women = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.WOMEN)).size();
                    Assert.assertEquals(1, women);
                    int men = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MEN)).size();
                    Assert.assertEquals(1, men);
                    break;

                case "Gifting":
                    int flowers = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FLOWERS)).size();
                    Assert.assertEquals(1, flowers);
                    int plants = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.PLANTS)).size();
                    Assert.assertEquals(1, plants);
                    int giftHampers = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.GIFT_HAMPERS)).size();
                    Assert.assertEquals(1, giftHampers);
                    int romanticGetaways = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MEN)).size();
                    Assert.assertEquals(1, romanticGetaways);
                    break;

                case "Experiences":
                    int activities = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ACTIVITIES)).size();
                    Assert.assertEquals(1, activities);
                    int romanticGetaways2 = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ROMENTIC_GETAWAYS)).size();
                    Assert.assertEquals(1, romanticGetaways2);
                    break;

                case "Travel":
                    int romanticGetaways3 = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MEN)).size();
                    Assert.assertEquals(1, romanticGetaways3);
                    int weekEndPackages = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.WEEKEND_PACKAGES)).size();
                    Assert.assertEquals(1, weekEndPackages);
                    break;
                default:
                    logger.info("Invalid shopping category");
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on shopping category \"([^\"]*)\" page$")
    public void ca_user_is_on_shopping_category_something_page(String shoppingCategory) {
        try {
            switch (shoppingCategory) {

                case "Home":
                    int home = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_SUB_MENU)).size();
                    Assert.assertEquals(2, home);
                    break;

                case "Tech":
                    int tech = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TECH_SUB_MENU)).size();
                    Assert.assertEquals(2, tech);
                    break;

                case "Beauty & Personal Care":
                    int beauty = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.BEAUTY_AND_CARE_SUB_MENU)).size();
                    Assert.assertEquals(2, beauty);
                    break;

                case "Luggage & Travel":
                    int appliances = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.LUGGAGE_AND_TRAVEL_SUB_MENU)).size();
                    Assert.assertEquals(2, appliances);
                    break;

                case "Fashion":
                    int gear = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FASHION_SUB_MENU)).size();
                    Assert.assertEquals(2, gear);
                    break;

                case "Gifting":
                    int fashion = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.GIFTING_SUB_MENU)).size();
                    Assert.assertEquals(2, fashion);
                    break;

                case "Experiences":
                    int outdoor = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.EXPERIENCES_SUB_MENU)).size();
                    Assert.assertEquals(2, outdoor);
                    break;

                case "Travel":
                    int experiences = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TRAVEL_SUB_MENU)).size();
                    Assert.assertEquals(2, experiences);
                    break;

                default:
                    logger.info("Invalid sub menu");
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on subcategory \"([^\"]*)\" catalogue page$")
    public void ca_user_is_on_subcategory_something_catalogue_page(String shoppingCategory) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on product detail page$")
    public void ca_user_is_on_product_detail_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ADD_TO_CART_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see if number of products to add to cart \"([^\"]*)\" is not more than number of products left$")
    public void ca_user_can_see_if_number_of_products_to_add_to_cart_something_is_not_more_than_number_of_products_left(String addToCart) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product added to cart message$")
    public void ca_user_can_see_number_of_products_something_added_to_cart() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ADDED_TO_CART_MESSAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see deals of the day section$")
    public void ca_user_can_see_deals_of_the_day_section() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.DEALS_SECTIONS)).size();
//            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user can see deals sub menu$")
    public void ca_user_can_see_deals_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see tech sub menu$")
    public void ca_user_can_see_tech_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TECH_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see beauty & personal care sub menu$")
    public void ca_user_can_see_beauty_and_personal_care_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.BEAUTY_AND_CARE_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see home sub menu$")
    public void ca_user_can_see_home_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see appliances sub menu$")
    public void ca_user_can_see_appliances_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.APPLIANCES_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see gear sub menu$")
    public void ca_user_can_see_gear_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.GEAR_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see luggage and travel sub menu$")
    public void ca_user_can_see_luggage_and_travel_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.LUGGAGE_AND_TRAVEL_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see fashion sub menu$")
    public void ca_user_can_see_fashion_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FASHION_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see outdoor sub menu$")
    public void ca_user_can_see_outdoor_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.OUTDOOR_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see gifting sub menu$")
    public void ca_user_can_see_gifting_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.GIFTING_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see experiences sub menu$")
    public void ca_user_can_see_experiences_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.EXPERIENCES_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see travel sub menu$")
    public void ca_user_can_see_travel_sub_menu() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TRAVEL_SUB_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user can see recommendations section$")
    public void ca_user_can_see_recommendations_section() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.RECOMMENDED_SECTION)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see shop by brand section$")
    public void ca_user_can_see_shop_by_brand_section() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SHOP_BY_BRAND_SECTION)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see tips and trends section$")
    public void ca_user_can_see_tips_and_trends_section() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.TIPS_AND_TRENDS_SECTION)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see subcategories under a shopping category \"([^\"]*)\"$")
    public void ca_user_can_see_subcategories_under_a_shopping_category_something(String shoppingCategory) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


//    @Then("^CA user is on shopping category \"([^\"]*)\" page$")
//    public void ca_user_is_on_shopping_category_something_page(String shoppingcategory) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }


    @And("^CA user can see shop by brands section$")
    public void ca_user_can_see_shop_by_brands_section() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see sale section$")
    public void ca_user_can_see_sale_section() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see a product list catalogue$")
    public void ca_user_can_see_a_product_list_catalogue() {
        try {
            util.secondsDelay(2);
            int size = driver.findElements(By.id(AndroidObjects.SORT_AND_FILTER_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see number of products left$")
    public void ca_user_can_see_number_of_products_left() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select shopping cart icon$")
    public void ca_user_select_shopping_cart_icon() {
        try {
            driver.findElement(By.id(AndroidObjects.CART_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select shop now button$")
    public void ca_user_select_shop_now_button() {
        try {
            driver.findElement(By.id(AndroidObjects.SHOP_NOW_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on shopping cart page$")
    public void ca_user_is_on_shopping_cart_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MY_CART_HEADER)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see number of items in a cart is great than zero$")
    public void ca_user_can_see_number_of_items_in_a_cart_is_great_than_zero() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see cart delete button$")
    public void ca_user_can_see_cart_delete_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.CART_DELETE_BUTTON)).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a product from cart list$")
    public void ca_user_select_a_product_from_cart_list() {
        try {
            driver.findElement(By.id(AndroidObjects.CART_ITEM)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select add button \"([^\"]*)\" times$")
    public void ca_user_select_add_button_something_times(String numberOfTimes) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product cart count \"([^\"]*)\" times$")
    public void ca_user_can_see_product_cart_count_something_times(String numberOfTimes) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select minus button \"([^\"]*)\" times$")
    public void ca_user_select_minus_button_something_times(String numberOfTimes) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product cart count is decreased \"([^\"]*)\" times$")
    public void ca_user_can_see_product_cart_count_is_decreased_something_times(String numberOfTimes) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select delete product button$")
    public void ca_user_select_delete_product_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.CART_DELETE_BUTTON)).size();

            while (size > 0) {
                driver.findElement(By.id(AndroidObjects.CART_DELETE_BUTTON)).click();
                size--;
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select move product to wish list button$")
    public void ca_user_select_move_product_to_wish_list_button() {
        try {
            driver.findElement(By.id(AndroidObjects.SAVE_FOR_LATER_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see number of products from the cart is reduced by one$")
    public void ca_user_can_see_number_of_products_from_the_cart_is_reduced_by_one() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see new product is added to wish list$")
    public void ca_user_can_see_new_product_is_added_to_wishlist() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select save for later button$")
    public void ca_user_select_save_for_later_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user can see promo code discount applied to total cart amount$")
    public void ca_user_can_see_promo_code_discount_applied_to_total_cart_amount() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.ESHOP_AVAILABLE_PROMO)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on apply promo page$")
    public void ca_user_is_on_apply_promo_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.APPLY_PROMO_CODE_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter \"([^\"]*)\" promo code$")
    public void ca_user_enter_something_promo_code(String promoCode) {
        try {

            driver.findElement(By.id("promocode")).findElementByClassName((AndroidObjects.EDIT_TEXT_VIEWS)).setValue(promoCode);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select apply promo code button$")
    public void ca_user_select_apply_promo_code_button() {
        driver.findElement(By.id(AndroidObjects.APPLY_PROMO_BUTTON)).click();
    }


    @When("^CA user select apply the promotion code label$")
    public void ca_user_apply_the_promotion_code() {
        try {
            driver.findElement(By.id(AndroidObjects.APPLY_PROMO_CODE_LABEL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select add new address option$")
    public void ca_user_select_add_new_address_option() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.ADD_NEW_ADDRESS)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search and select delivery address \"([^\"]*)\" from the map$")
    public void ca_user_search_and_select_delivery_address_something_from_the_map(String deliveryAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see apply promo code section$")
    public void ca_user_can_see_apply_promo_code_section() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.APPLY_PROMO_CODE_LABEL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select checkout button$")
    public void ca_user_select_checkout_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.CART_CHECKOUT_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on delivery method page$")
    public void ca_user_is_on_delivery_method_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CHOOSE_DELIVERY_METHOD)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on search address page$")
    public void ca_user_is_on_search_address_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.ADDRESS_DETAILS_HEADER)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see delivery address \"([^\"]*)\" is saved$")
    public void ca_user_can_see_delivery_address_something_is_saved(String deliveryAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select delivery location from the map$")
    public void ca_user_select_delivery_location_from_the_map() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select delivery address \"([^\"]*)\" from saved addresses$")
    public void ca_user_select_delivery_address_something_from_saved_addresses(String deliveryAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select pick from a store near you option$")
    public void ca_user_select_pick_from_a_store_near_you_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search and select pickup address \"([^\"]*)\" from the map$")
    public void ca_user_search_and_select_pickup_address_something_from_the_map(String pickUpAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on select pickup location page$")
    public void ca_user_is_on_select_pickup_location_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see pickup address \"([^\"]*)\" is saved$")
    public void ca_user_can_see_pickup_address_something_is_saved(String pickUpAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select pickup location from the map$")
    public void ca_user_select_pickup_location_from_the_map() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select add address option$")
    public void ca_user_select_add_address_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select pay button$")
    public void ca_user_select_pay_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select cart reserve button$")
    public void ca_user_select_reserve_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.RESERVE_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user authenticate themselves$")
    public void ca_user_authenticate_themselves() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select add another payment source$")
    public void ca_user_select_add_another_payment_source() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select another payment source \"([^\"]*)\"$")
    public void ca_user_select_another_payment_source_something(String paymentSource) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see pin or biometric authentication$")
    public void ca_user_can_see_pin_or_biometric_authentication() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on payment options page$")
    public void ca_user_is_on_payment_options_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see payment source page$")
    public void ca_user_can_see_payment_source_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can payment success page$")
    public void ca_user_can_payment_success_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user is on payment page$")
    public void ca_user_is_on_payment_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_PAYMENT_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user can see personal loan button$")
    public void ca_user_can_see_personal_loan_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PAYMENT_PAGE_LOAN_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see MobiMoney button$")
    public void ca_user_can_see_mobi_money_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PAYMENT_PAGE_MOBI_MONEY_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select deliver here button$")
    public void ca_user_select_deliver_here_button() {
        driver.findElement(By.id(AndroidObjects.DELIVER_HERE_BUTTON)).click();
    }

    @When("^CA user select proceed to payment button$")
    public void ca_user_select_proceed_to_payment_button() {
        driver.findElement(By.id(AndroidObjects.CART_PROCEED_BUTTON)).click();
    }


    @Then("^CA user is on shipment page$")
    public void ca_user_is_on_shipment_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.ON_SHIPMENT_PAGE)).size();
//             Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can available wallet balance$")
    public void ca_user_can_available_wallet_balance() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see amount payable \"([^\"]*)\"for order$")
    public void ca_user_can_amount_payable_something_for_order(String amountPayable) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select notify me when in stock button$")
    public void ca_user_select_notify_me_when_in_stock_button() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the notification details page$")
    public void ca_user_is_on_the_notification_details_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see notify me when in stock button$")
    public void ca_user_can_see_notify_me_when_in_stock_button() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select sort and filter button$")
    public void ca_user_select_sort_button() {
        try {
            util.secondsDelay(2);
            driver.findElement(By.id(AndroidObjects.SORT_AND_FILTER_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select sort by \"([^\"]*)\" option$")
    public void ca_user_select_sort_by_something_option(String sortBy) {
        try {
            switch (sortBy) {

                case "Popularity":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.SORT_POPULARITY)).click();
                    break;

                case "What's New":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();
                    break;

                case "Price Low-High":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();
                    break;

                case "Price High-Low":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();
                    break;

                case "Discounts":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();
                    break;

                default:
                    logger.info("Invalid sort criteria");
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on product sort and filter page$")
    public void ca_user_is_on_product_sort_and_filter_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see a sorted by \"([^\"]*)\" product list catalogue$")
    public void ca_user_can_see_a_sorted_by_something_product_list_catalogue(String sortBy) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select filter button$")
    public void ca_user_select_filter_button() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select filter by \"([^\"]*)\" options$")
    public void ca_user_select_filter_by_something_options(String filterBy) {
        try {
            switch (filterBy) {

                case "Couches":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILTER_COUCHES)).click();
                    break;

                default:
                    logger.info("Invalid sort criteria");
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on product filter page$")
    public void ca_user_is_on_product_filter_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see a filtered by \"([^\"]*)\" product list catalogue$")
    public void ca_user_can_see_a_filtered_by_something_product_list_catalogue(String filterBy) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user can see offers related to the product$")
    public void ca_user_can_see_offers_related_to_the_product() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user scroll the page down$")
    public void ca_user_scroll_the_page_down() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see warranty details section$")
    public void ca_user_can_see_warranty_details_section() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select like product button from product list page$")
    public void ca_user_select_like_product_button_from_product_list_page() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product is added to the wish list$")
    public void ca_user_can_see_product_is_added_to_the_wish_list() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select like product button from product detail page$")
    public void ca_user_select_like_product_button_from_product_detail_page() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select share product button$")
    public void ca_user_select_share_product_button() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on sharing apps page$")
    public void ca_user_is_on_sharing_app_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the last carousel$")
    public void ca_user_is_on_the_last_carousel() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see product colour$")
    public void ca_user_can_see_product_colour() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a different colour$")
    public void ca_user_select_a_different_colour() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user product colour is updated$")
    public void ca_user_product_colour_is_updated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see select colour text$")
    public void ca_user_can_see_select_colour_text() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


}
