package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BuyGroceriesSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(BuyGroceriesSteps.class);
    private BasePageIOS page = new BasePageIOS();
    private Utils util = new Utils();

    @When("^CI user select groceries icon$")
    public void ci_user_select_groceries_icon() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CATEGORIES_SHOPPING));
            page.horizontalSlide();
            driver.findElementByAccessibilityId(IOSObjects.GROCERIES_ICON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select one cart logo$")
    public void ci_user_select_one_cart_icon() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ONE_CART_LOGO).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select register new account$")
    public void ci_user_select_register_new_account() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter one cart first name \"([^\"]*)\"$")
    public void ci_user_enter_one_cart_first_name_something(String firstName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter one cart last name \"([^\"]*)\"$")
    public void ci_user_enter_one_cart_last_name_something(String lastName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter one cart email \"([^\"]*)\"$")
    public void ci_user_enter_one_cart_email_something(String email) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter one cart password \"([^\"]*)\"$")
    public void ci_user_enter_one_cart_password_something(String oneCartPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user confirm one cart password \"([^\"]*)\"$")
    public void ci_user_confirm_one_cart_password_something(String oneCartConfirmPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user accept one cart terms and conditions$")
    public void ci_user_accept_one_cart_terms_and_conditions() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select one cart sign up button$")
    public void ci_user_select_one_cart_sign_up_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on groceries page$")
    public void ci_user_is_on_groceries_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.GROCERIES_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.GROCERIES_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select shop groceries button$")
    public void ci_user_select_shop_groceries_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SHOP_GROCERIES_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select use your wakanda points button$")
    public void ci_user_select_use_your_wakanda_points_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.USE_WAKA_POINTS_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select groceries pay button$")
    public void ci_user_select_groceries_pay_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.GROCERIES_PAY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on one cart redirect page$")
    public void ci_user_is_on_onr_cart_redirect_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.YOU_WILL_BE_REDIRECTED_TO));
            int size = driver.findElementsByAccessibilityId(IOSObjects.YOU_WILL_BE_REDIRECTED_TO).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see on cart logo on redirect page$")
    public void ci_user_can_see_on_cart_logo_on_redirect_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on one cart home page$")
    public void ci_user_is_on_one_cart_onboarding_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ONE_CART_LINK));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ONE_CART_LINK).size();
            Assert.assertEquals(2, size);
            int allStores = driver.findElementsByXPath(IOSObjects.ALL_STORES).size();
            Assert.assertEquals(1, allStores);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on one cart new account registration page$")
    public void ci_user_is_on_one_cart_new_account_registration_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on one cart dashboard page$")
    public void ci_user_is_on_one_cart_dashboard_page() {
        try {
            page.switchToWebView();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see one cart logo$")
    public void ci_user_can_see_one_cart_icon() {
        try {


            int size = driver.findElementsByAccessibilityId(IOSObjects.ONE_CART_LOGO).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see your first delivery is on us promo$")
    public void ci_user_can_see_your_first_delivery_is_on_us_promo() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.FIRST_DELIVERY_ON_US).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user login with one cart username \"([^\"]*)\" and password  \"([^\"]*)\"$")
    public void ci_user_login_with_one_cart_username_something_and_password_something(String oneCartUsername, String oneCartPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user select one cart sign in button$")
    public void ci_user_select_one_cart_sign_in_button() {
        try {
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select grocery supplier store \"([^\"]*)\"$")
    public void ci_user_select_grocery_supplier_store_something(String store) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(store));
            driver.findElementByAccessibilityId(store).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see we will user your information message$")
    public void ci_user_can_see_we_will_user_your_information_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI is on grocery supplier \"([^\"]*)\" page$")
    public void ci_is_on_grocery_supplier_page(String store) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(store));
            int searchStore = driver.findElementsByAccessibilityId("Search " + store).size();
            Assert.assertEquals(1, searchStore);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on one cart login page$")
    public void ci_user_is_on_one_cart_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see first delivery is on us message$")
    public void ci_user_can_see_first_delivery_is_on_us_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI select one cart icon$")
    public void ci_select_one_cart_icon() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user add item to buy to cart$")
    public void ci_user_add_item_to_buy_to_cart() {
        try {
//             driver.findElementByAccessibilityId("Add To Cart").click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select pay with wakanda wallet$")
    public void ci_user_select_pay_with_mobimoney_wallet() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ONE_CART_PAY_WITH_WAKANDA_WALLET));
            driver.findElementByAccessibilityId(IOSObjects.ONE_CART_PAY_WITH_WAKANDA_WALLET).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on grocery supplier page$")
    public void ci_user_is_on_grocery_supplier_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user on on one cart cart page$")
    public void ci_user_on_on_one_cart_cart_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ONE_CART_DETAIL));
            int size = driver.findElements(By.id(IOSObjects.ONE_CART_DETAIL)).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on one cart checkout page$")
    public void ci_user_on_on_one_cart_checkout_page() {
        try {
//            STR= driver.findElementsByClassName(IOSObjects.ON_CHECKOUT_PAGE).size();
//            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user enter one cart contact details$")
    public void ci_user_enter_one_cart_contact_details() {
        try {
            WebElement name = driver.findElementByName(IOSObjects.ONE_CART_NAME);
            name.click();
            name.clear();
            name.sendKeys("Thomas");

            WebElement surname = driver.findElementByName(IOSObjects.ONE_CART_SURNAME);
            surname.click();
            surname.clear();
            surname.sendKeys("Magwaza");

            WebElement mobile = driver.findElementByName(IOSObjects.ONE_CART_MOBILE);
            mobile.click();
            mobile.clear();
            mobile.sendKeys("0731264585");

            WebElement alternativeMobile = driver.findElementByName(IOSObjects.ONE_CART_ALTERNATIVE_NUMBER);
            alternativeMobile.click();
            alternativeMobile.clear();
            alternativeMobile.sendKeys("0731264585");
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see complete payment using wakanda wallet message$")
    public void ci_user_can_see_complete_payment_using_wakanda_wallet_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select one cart continue to delivery button$")
    public void ci_user_select_one_cart_continue_to_delivery_button() {
        try {
            util.secondsDelay(2);
            driver.findElementByClassName(IOSObjects.CONTACT_PANEL).findElementByClassName(IOSObjects.CONTACT_DESC_FORM).findElementByClassName(IOSObjects.ONE_CART_CONTINUE_TO_DELIVERY).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter one cart delivery details$")
    public void ci_user_enter_one_cart_delivery_details() {
        try {
//            WebElement address1 = driver.findElementByName(IOSObjects.ONE_CART_ADDRESS1);
//            address1.click();
//            address1.clear();
//            address1.sendKeys("105 West");

            page.waitForElement(By.className(IOSObjects.ONE_CART_DETAIL));
            WebElement address2 = driver.findElementByName(IOSObjects.ONE_CART_ADDRESS2);
            address2.click();
            address2.clear();
            address2.sendKeys("105 West");

            WebElement suburb = driver.findElementByName(IOSObjects.ONE_CART_ADDRESS_SUBURB);
            suburb.click();
            suburb.clear();
            suburb.sendKeys("Sandown");

            WebElement city = driver.findElementByName(IOSObjects.ONE_CART_ADDRESS_CITY);
            city.click();
            city.clear();
            city.sendKeys("Johannesburg");

            WebElement province = driver.findElementByName(IOSObjects.ONE_CART_ADDRESS_PROVINCE);
            province.click();
            province.clear();
            province.sendKeys("Gauteng");

            WebElement code = driver.findElementByName(IOSObjects.ONE_CART_ADDRESS_CODE);
            code.click();
            code.clear();
            code.sendKeys("2196");
            driver.hideKeyboard();


            page.switchToNativeView();


            driver.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Delivery date:\"])[5]").click();

            driver.findElementByXPath("//XCUIElementTypeOther[@name=\"12:00PM - 1:00PM\"]").click();


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select one cart continue to refunds button$")
    public void ci_user_select_one_cart_continue_to_refunds_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ONE_CART_CONTINUE_TO_REFUNDS));
            driver.findElementByAccessibilityId(IOSObjects.ONE_CART_CONTINUE_TO_REFUNDS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select one cart continue to loyalty cards button$")
    public void ci_user_select_one_cart_continue_to_loyalty_cards_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ONE_CART_CONTINUE_TO_LOYALTY_CARDS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select one cart skip loyalty cards button$")
    public void ci_user_select_one_cart_skip_loyalty_cards_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ONE_CART_SKIP_LOYALTY_CARDS).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select pay with wakanda wallet button$")
    public void ci_user_select_pay_with_wakanda_wallet_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select proceed to payment button on one cart$")
    public void ci_user_select_one_cart_proceed_to_payment_button() {
        try {
            driver.findElementByAccessibilityId("Proceed to checkout").click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wakanda payment page$")
    public void ci_user_is_on_wakanda_payment_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAYMENT_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on successful payment page$")
    public void ci_user_is_on_successful_payment_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PAYMENT_SUCCESSFUL1));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAYMENT_SUCCESSFUL1).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user navigate to one cart cart page$")
    public void ci_user_navigate_to_one_cart_cart_page() {
        try {
            driver.findElementByClassName(IOSObjects.ONE_CART_MENU_LINK).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see to total payable amount label$")
    public void ci_user_can_see_to_total_payable_amount() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.TOTAL_PAYABLE_AMOUNT));
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.TOTAL_PAYABLE_AMOUNT).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see delivery details for selected store \"([^\"]*)\"$")
    public void ci_user_can_see_delivery_details_for_selected_store_something(String store) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see your order details button$")
    public void ci_user_can_see_your_order_details_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see exit button$")
    public void ci_user_can_see_exit_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select exit button$")
    public void ci_user_select_exit_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select pay with MobiMoney Wallet tab$")
    public void ci_user_select_pay_with_mobimoney_wallet_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select your order from one cart card$")
    public void ci_user_select_your_order_from_one_cart_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select ongoing orders button$")
    public void ci_user_select_ongoing_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select an ongoing order from one cart$")
    public void ci_user_select_an_ongoing_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select track your shipment button$")
    public void ci_user_select_track_your_shipment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see ongoing order from one cart$")
    public void ci_user_can_see_ongoing_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on ongoing order details page$")
    public void ci_user_is_on_ongoing_order_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see order tracking status$")
    public void ci_user_can_see_order_tracking_status() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see your order from one cart card$")
    public void ci_user_can_see_your_order_from_one_cart_card() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.YOUR_ORDER_FROM_ONE_CART));
            int size = driver.findElementsByAccessibilityId(IOSObjects.YOUR_ORDER_FROM_ONE_CART).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see ongoing orders button$")
    public void ci_user_can_see_ongoing_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see past orders button$")
    public void ci_user_can_see_past_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see track your shipment button$")
    public void ci_user_can_see_track_your_shipment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select past orders button$")
    public void ci_user_select_past_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @When("^CI user select a past order from one cart$")
    public void ci_user_select_a_past_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @When("^CI user select reorder button$")
    public void ci_user_select_reorder_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @Then("^CI user is on order history page$")
    public void ci_user_is_on_order_history_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @Then("^CI user can see past order from one cart$")
    public void ci_user_can_see_past_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @Then("^CI user is on past order details page$")
    public void ci_user_is_on_past_order_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @Then("^CI user can see pay with MobiMoney Wallet tab$")
    public void ci_user_can_see_pay_with_mobimoney_wallet_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

    @And("^CI user can see reorder button$")
    public void ci_user_can_see_reorder_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
        ;
    }

}
