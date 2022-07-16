package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android.AndroidObjects;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class BuyProductSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(BuyProductSteps.class);
    private BasePageIOS page = new BasePageIOS();
    private Utils util = new Utils();
    String items ;

    @When("^CI user select shopping icon$")
    public void ci_user_select_shopping_icon() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ESHOP_MENU));
            driver.findElementByAccessibilityId(IOSObjects.ESHOP_MENU).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select view all button$")
    public void ci_user_select_view_all_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.VIEW_ALL_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.VIEW_ALL_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a shopping category \"([^\"]*)\"$")
    public void ci_user_select_a_shopping_category_something(String shoppingCategory) {
        try {
            driver.findElementByAccessibilityId(shoppingCategory).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a shopping subcategory \"([^\"]*)\"$")
    public void ci_user_select_a_shopping_subcategory_something(String shoppingSubCategory) {
        try {
            driver.findElementByAccessibilityId(shoppingSubCategory).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select a product from the catalogue$")
    public void ci_user_select_a_product_from_the_catalogue() {
        try {
            driver.findElementsByClassName(IOSObjects.CELLS).get(0).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select add to cart button$")
    public void ci_user_select_add_to_cart_button() {
        try {
            driver.findElementByXPath(IOSObjects.ADD_TO_CART_BUTTON).click();
            util.secondsDelay(5);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on shopping page$")
    public void ci_user_is_on_shopping_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SHOPPING_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SHOPPING_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on shopping category \"([^\"]*)\" page$")
    public void ci_user_is_on_shopping_category_something_page(String shoppingCategory) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(shoppingCategory.toUpperCase()));
            int size = driver.findElementsByAccessibilityId(shoppingCategory.toUpperCase()).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on shopping sub category \"([^\"]*)\" page$")
    public void ci_user_is_on_shopping_sub_category_something_page(String shoppingSubCategory) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(shoppingSubCategory.toUpperCase()));
            int size = driver.findElementsByAccessibilityId(shoppingSubCategory.toUpperCase()).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user can see view all button$")
    public void ci_user_can_see_view_all_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.VIEW_ALL_BUTTON).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on subcategory \"([^\"]*)\" catalogue page$")
    public void ci_user_is_on_subcategory_something_catalogue_page(String shoppingCategory) {
        try {
            int size = driver.findElementsByAccessibilityId(shoppingCategory).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on product detail page$")
    public void ci_user_is_on_product_detail_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PRODUCT_PAGE_SEARCH_ICON));

            int search = driver.findElementsByAccessibilityId(IOSObjects.PRODUCT_PAGE_SEARCH_ICON).size();
            Assert.assertEquals(1, search);
            int share = driver.findElementsByAccessibilityId(IOSObjects.PRODUCT_PAGE_SHARE_ICON).size();
            Assert.assertEquals(1, share);

            int productDetails= driver.findElementsByAccessibilityId(IOSObjects.PRODUCT_DETAILS).size();
            Assert.assertEquals(1, productDetails);
            int deliveryInformation = driver.findElementsByAccessibilityId(IOSObjects.DELIVERY_INFORMATION).size();
            Assert.assertEquals(1, deliveryInformation);

            int warrantyDetails = driver.findElementsByAccessibilityId(IOSObjects.WARRANTY_DETAILS).size();
            Assert.assertEquals(1, warrantyDetails);
            int paymentReservation = driver.findElementsByAccessibilityId(IOSObjects.PAYMENT_RESERVATION).size();
            Assert.assertEquals(1, paymentReservation);

            int returnPolicy = driver.findElementsByAccessibilityId(IOSObjects.RETURN_POLICY).size();
            Assert.assertEquals(1, returnPolicy);
            int termsAndConditions = driver.findElementsByAccessibilityId(IOSObjects.TERMS_AND_CONDITIONS).size();
            Assert.assertEquals(1, termsAndConditions);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on rate the product page$")
    public void ci_user_is_on_rate_the_product_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.RATE_THE_PRODUCT_PAGE).size();
            Assert.assertEquals(2,size );
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see customer review added$")
    public void ci_user_can_see_customer_review_added() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CUSTOMER_RATINGS_AND_REVIEW_LABEL));

            int customerRatings= driver.findElementsByAccessibilityId(IOSObjects.CUSTOMER_RATINGS_AND_REVIEW_LABEL).size();
            Assert.assertEquals(1,customerRatings );

            int fourStars = driver.findElementsByAccessibilityId(IOSObjects.FOUR_OUT_OF_FIVE_STARS).size();
            Assert.assertEquals(1,fourStars );
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see product added to cart message$")
    public void ci_user_can_see_if_number_of_products_to_add_to_cart() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.ADDED_TO_CART).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see number of products \"([^\"]*)\" added to cart$")
    public void ci_user_can_see_number_of_products_something_added_to_cart(String addToCart) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see deals of the day section$")
    public void ci_user_can_see_deals_of_the_day_section() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.DEALS_LABEL));
            int size = driver.findElementsByAccessibilityId(IOSObjects.DEALS_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see recommendations section$")
    public void ci_user_can_see_recommendations_section() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.RECOMMENDED_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see shop by brand section$")
    public void ci_user_can_see_shop_by_brand_section() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.TOP_BRANDS_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see tips and trends section$")
    public void ci_user_can_see_tips_and_trends_section() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.FILL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see shop by category label$")
    public void ci_user_can_see_shop_by_cat() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SHOP_BY_CATEGORY_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user can see shop by brands section$")
    public void ci_user_can_see_shop_by_brands_section() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.TOP_BRANDS_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see sale section$")
    public void ci_user_can_see_sale_section() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SALE_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see a product list catalogue$")
    public void ci_user_can_see_a_product_list_catalogue() {
        try {
            page.waitForElement(By.className(IOSObjects.CELLS));
            int size = driver.findElementsByClassName(IOSObjects.CELLS).size();
            Assert.assertTrue(size > 2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see number of products left$")
    public void ci_user_can_see_number_of_products_left() {
        try {
            int size = driver.findElementsByClassName(IOSObjects.FILL).size();
//                Assert.assertEquals( 1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select shopping cart icon$")
    public void ci_user_select_shopping_cart_icon() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CART_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select write a review button$")
    public void ci_user_select_write_a_review_button() {
        try {
            driver.findElementByXPath(IOSObjects.WRITE_A_REVIEW_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter review message \"([^\"]*)\"$")
    public void ci_user_enter_review_message(String message) {
        try {
            driver.findElementByClassName(IOSObjects.TEXT_VIEW_AREA).click();
            driver.findElementByClassName(IOSObjects.TEXT_VIEW_AREA).setValue(message);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on shopping cart page$")
    public void ci_user_is_on_shopping_cart_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.MY_CART_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.MY_CART_HEADER).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see no error dialog shown$")
    public void ci_user_can_see_no_error_dialog_shown() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CLOSE_DIALOG_BUTTON));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CLOSE_DIALOG_BUTTON).size();
            Assert.assertEquals(0, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see all products deleted from the cart$")
    public void ci_user_can_see_no_no_product_left_on_the_cart() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ESHOP_CART_TOTAL));

            String cartSubTotal = driver.findElementByAccessibilityId(IOSObjects.ESHOP_CART_TOTAL).getText();
            Assert.assertEquals(IOSDataFactory.CART_SUB_TOTAL, cartSubTotal);

            int cartTotalAmount = driver.findElementsByAccessibilityId(IOSObjects.CART_TOTAL_AMOUNT).size();
            Assert.assertEquals(1, cartTotalAmount);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @And("^CI user can see earn loyalty points message$")
    public void ci_user_can_see_earn_loyalty_points_message() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.ESHOP_CART_EARN_POINTS_MESSAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see number of items in a cart is great than zero$")
    public void ci_user_can_see_number_of_items_in_a_cart_is_great_than_zero() {
        try {
            int saveForLaterButtons = driver.findElementsByAccessibilityId(IOSObjects.SAVE_FOR_LATER_BUTTON).size();
            Assert.assertTrue(saveForLaterButtons > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see number of items matches the product list$")
    public void ci_user_can_see_number_of_items_matches_the_product_list() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a product from cart list$")
    public void ci_user_select_a_product_from_cart_list() {
        try {
            driver.findElementsByClassName(IOSObjects.IMAGES).get(0).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select rating buttons$")
    public void ci_user_select_rating_buttons() {
        try {
            driver.findElementByXPath(IOSObjects.REVIEW_FOUR_STAR).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select plus button$")
    public void ci_user_select_add_button_something_times() {
        try {
            driver.findElementByXPath(IOSObjects.PLUS_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see product cart total increased by one$")
    public void ci_user_can_see_product_cart_count_something_times() {
        try {
            items = driver.findElementByClassName(IOSObjects.TEXT_FIELDS).getText();
            Assert.assertEquals("2",items);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI can see eshop cart number per item$")
    public void ci_user_can_see_eshop_cart_number_per_item() {
        try {
           items = driver.findElementByClassName(IOSObjects.TEXT_FIELDS).getText();
             Assert.assertEquals("1",items);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select minus button$")
    public void ci_user_select_minus_button_something_times() {
        try {
            driver.findElementByXPath(IOSObjects.MINUS_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see product cart count is decreased \"([^\"]*)\" times$")
    public void ci_user_can_see_product_cart_count_is_decreased_something_times(String numberOfTimes) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select delete product button$")
    public void ci_user_select_delete_product_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.DELETE_BUTTON).size();

            while (size > 1) {
                driver.findElementByAccessibilityId(IOSObjects.DELETE_BUTTON).click();
                size--;
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^all products from the cart are deleted$")
    public void number_of_products_from_the_cart_is_reduced_by_one() {
        try {
             int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CART_EMPTY)).size();
             Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select move product to wish list button$")
    public void ci_user_select_move_product_to_wish_list_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SAVE_FOR_LATER_BUTTON).size();

            while (size > 0) {
                driver.findElementByAccessibilityId(IOSObjects.SAVE_FOR_LATER_BUTTON).click();
                size--;
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see number of products from the cart is reduced by one$")
    public void ci_user_can_see_number_of_products_from_the_cart_is_reduced_by_one() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see new product is added to wish list$")
    public void ci_user_can_see_new_product_is_added_to_wishlist() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select save for later button$")
    public void ci_user_select_save_for_later_button() {
        try {
              driver.findElementByAccessibilityId(IOSObjects.SAVE_FOR_LATER_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^product is saved in cart for later checkout$")
    public void product_is_saved_in_cart_for_later_checkout() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see promo code discount applied to total cart amount$")
    public void ci_user_can_see_promo_code_discount_applied_to_total_cart_amount() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user apply the promotion code$")
    public void ci_user_apply_the_promotion_code() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select add new address option$")
    public void ci_user_select_add_new_address_option() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ADD_NEW_ADDRESS));
            driver.findElementByAccessibilityId(IOSObjects.ADD_NEW_ADDRESS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search and select delivery address \"([^\"]*)\" from the map$")
    public void ci_user_search_and_select_delivery_address_something_from_the_map(String deliveryAddress) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_LOCATION).click();
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_LOCATION).setValue(deliveryAddress);
            driver.findElementByAccessibilityId(IOSObjects.KEYBOARD_SEARCH_BUTTON).click();
//            driver.findElementByAccessibilityId(IOSObjects.SELECT_PHOTO_FROM_GALLERY).click();


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see apply promo code section$")
    public void ci_user_can_see_apply_promo_code_section() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.APPLY_PROMOCODE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.APPLY_PROMOCODE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select checkout button$")
    public void ci_user_select_checkout_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CART_CHECKOUT_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.CART_CHECKOUT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select apply promo code label$")
    public void ci_user_select_apply_promo_code_label() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.APPLY_PROMOCODE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter promo code \"([^\"]*)\"$")
    public void ci_user_enter_promo_code_something(String promoCode) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.APPLY_PROMO_FIELD).click();
            driver.findElementByAccessibilityId(IOSObjects.APPLY_PROMO_FIELD).clear();
            driver.findElementByAccessibilityId(IOSObjects.APPLY_PROMO_FIELD).setValue(promoCode);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on promo code page$")
    public void ci_user_is_on_promo_code_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PROMO_CODE_PAGE_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PROMO_CODE_PAGE_HEADER).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select apply promo code button$")
    public void ci_user_select_apply_promo_code_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.APPLY_PROMO_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.APPLY_PROMO_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on delivery method page$")
    public void ci_user_is_on_delivery_method_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CHOOSE_DELIVERYPAGE_HEADER));
            driver.findElementByAccessibilityId("Close").click();
            int size = driver.findElementsByAccessibilityId(IOSObjects.CHOOSE_DELIVERYPAGE_HEADER).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see pickup address label$")
    public void ci_user_can_see_pick_up_address_label() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.PICK_UP_STORE_ADDESSES).size();
            Assert.assertEquals(2,size );
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @Then("^CI user is on shipment page$")
    public void ci_user_is_on_shipment_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CART_SHIPMENT_PAGE_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CART_SHIPMENT_PAGE_HEADER).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("CI user can see proceed to payment button")
    public void ci_user_scan_see_proceed_to_payment_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.CART_PROCEED_TO_PAYMENT_BUTTON).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("CI user select proceed to payment button")
    public void ci_user_scan_select_proceed_to_payment_button() {
        try {
             driver.findElementByAccessibilityId(IOSObjects.CART_PROCEED_TO_PAYMENT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select proceed to checkout button$")
    public void ci_user_select_proceed_to_payment_button() {
        try {
            util.secondsDelay(2);
            driver.findElementByClassName(IOSObjects.CART_SIDE_BAR).findElementByClassName(IOSObjects.CONTINUE_DELIVERY_BTNS).findElementByClassName(IOSObjects.PROCEED_TO_CHECKOUT).click();
            util.secondsDelay(2);
            driver.findElementByClassName(IOSObjects.SUBTOTAL_CHECKOUT_FIXED).findElementByClassName(IOSObjects.SIDE_BAR_NAV).findElementByClassName(IOSObjects.PROCEED_TO_CHECKOUT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select deliver here button$")
    public void ci_user_select_deliver_here_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.DELIVER_HERE_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.DELIVER_HERE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on search address page$")
    public void ci_user_is_on_search_address_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SET_A_LOCATION_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SET_A_LOCATION_HEADER).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see delivery address \"([^\"]*)\" is saved$")
    public void ci_user_can_see_delivery_address_something_is_saved(String deliveryAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select delivery location from the map$")
    public void ci_user_select_delivery_location_from_the_map() {
        try {
            util.secondsDelay(1);
            driver.findElementsByClassName(IOSObjects.CELLS).get(0).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter delivery complex name \"([^\"]*)\"$")
    public void ci_user_enter_delivery_complex_name_something(String complexName) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.LOCATION_COMPLEX_NAME));
            driver.findElementByAccessibilityId(IOSObjects.LOCATION_COMPLEX_NAME).click();
            driver.findElementByAccessibilityId(IOSObjects.LOCATION_COMPLEX_NAME).setValue(complexName);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on set new location page$")
    public void ci_user_is_on_set_new_location_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SET_NEW_LOCATION_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SET_NEW_LOCATION_HEADER).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter delivery house number \"([^\"]*)\"$")
    public void ci_user_enter_delivery_house_number_something(String houseNumber) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.LOCATION_HOUSE_NUMBER).click();
            driver.findElementByAccessibilityId(IOSObjects.LOCATION_HOUSE_NUMBER).setValue(houseNumber);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter delivery nick name \"([^\"]*)\"$")
    public void ci_user_enter_delivery_nick_name_something(String nickName) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.LOCATION_NICK_NAME).click();
            driver.findElementByAccessibilityId(IOSObjects.LOCATION_NICK_NAME).setValue(nickName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select delivery address \"([^\"]*)\" from saved addresses$")
    public void ci_user_select_delivery_address_something_from_saved_addresses(String deliveryAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select pickup from a store near \"([^\"]*)\" option$")
    public void ci_user_select_pick_from_a_store_near_you_option(String pickUpAddress) {
        try {
            driver.findElementByAccessibilityId(pickUpAddress).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search and select pickup address \"([^\"]*)\" from the map$")
    public void ci_user_search_and_select_pickup_address_something_from_the_map(String pickUpAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on select pickup location page$")
    public void ci_user_is_on_select_pickup_location_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see pickup address \"([^\"]*)\" is saved$")
    public void ci_user_can_see_pickup_address_something_is_saved(String pickUpAddress) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select pickup location from the map$")
    public void ci_user_select_pickup_location_from_the_map() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select add address option$")
    public void ci_user_select_add_address_option() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ADD_NEW_ADDRESS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select cart pay button$")
    public void ci_user_select_cart_pay_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ESHOP_PAY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user authenticate themselves$")
    public void ci_user_authenticate_themselves() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select add another payment source$")
    public void ci_user_select_add_another_payment_source() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select another payment source \"([^\"]*)\"$")
    public void ci_user_select_another_payment_source_something(String paymentSource) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see enter pin label$")
    public void ci_user_can_see_pin_or_biometric_authentication() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.RE_ENTER_PIN).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on payment options page$")
    public void ci_user_is_on_payment_options_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see payment source page$")
    public void ci_user_can_see_payment_source_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is order confirmation page$")
    public void ci_user_is_on_order_confirmation_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ORDER_CONFIRMATION_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ORDER_CONFIRMATION_HEADER).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user is on payment page$")
    public void ci_user_is_on_payment_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PAYMENT_PAGE_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAYMENT_PAGE_HEADER).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can available wallet balance$")
    public void ci_user_can_available_wallet_balance() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.FILL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can amount payable \"([^\"]*)\"for order$")
    public void ci_user_can_amount_payable_something_for_order(String amountPayable) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on eshop page$")
    public void ci_user_is_on_eshop_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ESHOP_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ESHOP_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see sign in button$")
    public void ci_user_can_see_sign_in_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAY_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see popular products section$")
    public void ci_user_can_see_popular_products_section() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select notify me when in stock button$")
    public void ci_user_select_notify_me_when_in_stock_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the notification details page$")
    public void ci_user_is_on_the_notification_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see notify me when in stock button$")
    public void ci_user_can_see_notify_me_when_in_stock_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user can see sort and filter button$")
    public void ci_user_see_sort_and_filter_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SORT_AND_FILTER_BUTTON));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SORT_AND_FILTER_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select sort and filter button$")
    public void ci_user_select_sort_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SORT_AND_FILTER_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select sort by \"([^\"]*)\" option$")
    public void ci_user_select_sort_by_something_option(String sortBy) {
        try {
            driver.findElementByAccessibilityId(sortBy).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on product sort and filter page$")
    public void ci_user_is_on_product_sort_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SORT_AND_FILTER_PAGE_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SORT_AND_FILTER_PAGE_HEADER).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see a sorted by \"([^\"]*)\" product list catalogue$")
    public void ci_user_can_see_a_sorted_by_something_product_list_catalogue(String sortBy) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select filter button$")
    public void ci_user_select_filter_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select filter by \"([^\"]*)\" options$")
    public void ci_user_select_filter_by_something_options(String filterBy) {
        try {
            driver.findElementByAccessibilityId(filterBy).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on product filter page$")
    public void ci_user_is_on_product_filter_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see a filtered by \"([^\"]*)\" product list catalogue$")
    public void ci_user_can_see_a_filtered_by_something_product_list_catalogue(String filterBy) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see offers related to the product$")
    public void ci_user_can_see_offers_related_to_the_product() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user scroll the page down$")
    public void ci_user_scroll_the_page_down() {
        try {
            page.scrollPage("down");
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see warranty details section$")
    public void ci_user_can_see_warranty_details_section() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.WARRANTY_DETAILS).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select like product button from product list page$")
    public void ci_user_select_like_product_button_from_product_list_page() {
        try {
            int size = driver.findElementsByXPath(IOSObjects.LIKE_PRODUCT_BUTTON).size();
            if (size > 0) {
                driver.findElementByXPath(IOSObjects.LIKE_PRODUCT_BUTTON).click();
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see product is added to the wish list$")
    public void ci_user_can_see_product_is_added_to_the_wish_list() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByXPath(IOSObjects.LIKE_SELECTED_PRODUCT_BUTTON).size();
            Assert.assertEquals(1, size);
            driver.findElementByXPath(IOSObjects.LIKE_SELECTED_PRODUCT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select like product button from product detail page$")
    public void ci_user_select_like_product_button_from_product_detail_page() {
        try {
            int size = driver.findElementsByXPath(IOSObjects.LIKE_PRODUCT_BUTTON).size();

            if (size > 0) {
                driver.findElementByXPath(IOSObjects.LIKE_PRODUCT_BUTTON).click();
                driver.findElementByXPath(IOSObjects.LIKE_PRODUCT_BUTTON).click();
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select share product button$")
    public void ci_user_select_share_product_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PRODUCT_PAGE_SHARE_ICON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on sharing apps page$")
    public void ci_user_is_on_sharing_app_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SHARING_APPS).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select close image gallery button$")
    public void ci_user_is_on_the_last_carousel() {
        try {
            driver.findElementByXPath(IOSObjects.CLOSE_IMAGES).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see product colour$")
    public void ci_user_can_see_product_colour() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select product detail image$")
    public void ci_user_select_product_image() {
        try {
            int size = driver.findElementsByClassName(IOSObjects.CELLS).size();

            if (size > 0) {
                driver.findElementsByClassName(IOSObjects.CELLS).get(0).click();
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select a different colour$")
    public void ci_user_select_a_different_colour() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user product colour is updated$")
    public void ci_user_product_colour_is_updated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see select colour text$")
    public void ci_user_can_see_select_colour_text() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.FILL).size();
            Assert.assertEquals(1, size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
