package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class BuyGroceriesSteps extends DriverFactory {
    private static Logger logger = Logger.getLogger(BuyGroceriesSteps.class);
    private BasePageAndroid page = new BasePageAndroid();
    private Utils util = new Utils();

    @When("^CA user select groceries icon$")
    public void ca_user_select_groceries_icon() {
        try {

            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FOOD_AND_GROCERIES)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select one cart icon$")
    public void ca_user_select_one_cart_icon() {
        try {
            driver.findElement(By.id(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select register new account$")
    public void ca_user_select_register_new_account() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter one cart first name \"([^\"]*)\"$")
    public void ca_user_enter_one_cart_first_name_something(String firstName) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(firstName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter one cart last name \"([^\"]*)\"$")
    public void ca_user_enter_one_cart_last_name_something(String lastName) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(lastName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter one cart email \"([^\"]*)\"$")
    public void ca_user_enter_one_cart_email_something(String email) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(email);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter one cart password \"([^\"]*)\"$")
    public void ca_user_enter_one_cart_password_something(String oneCartPassword) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(oneCartPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user confirm one cart password \"([^\"]*)\"$")
    public void ca_user_confirm_one_cart_password_something(String oneCartConfirmPassword) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(oneCartConfirmPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user accept one cart terms and conditions$")
    public void ca_user_accept_one_cart_terms_and_conditions() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select one cart sign up button$")
    public void ca_user_select_one_cart_sign_up_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on groceries page$")
    public void ca_user_is_on_groceries_page() {
        try {
            int size  = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_GROCERIES_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on one cart onboarding page$")
    public void ca_user_is_on_one_cart_onboarding_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on one cart new account registration page$")
    public void ca_user_is_on_one_cart_new_account_registration_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on one cart dashboard page$")
    public void ca_user_is_on_one_cart_dashboard_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see one cart icon$")
    public void ca_user_can_see_one_cart_icon() {
        try {
              driver.findElement(By.id(AndroidObjects.ONE_CART_ICON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see your first delivery is on us promo$")
    public void ca_user_can_see_your_first_delivery_is_on_us_promo() {
        try {
            String orderOnUs  = driver.findElement(By.id(AndroidObjects.FIRST_DELIVERY_ON_US)).getText();
            Assert.assertEquals( orderOnUs, AndroidDataFactory.FIRST_ORDER_ON_US_TITLE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user login with one cart username \"([^\"]*)\" and password  \"([^\"]*)\"$")
    public void ca_user_login_with_one_cart_username_something_and_password_something(String oneCartUsername, String oneCartPassword) {
        try {
            MobileElement username = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            username.click();
            username.clear();
            username.setValue(oneCartUsername);
            driver.hideKeyboard();

            MobileElement password = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            password.click();
            password.clear();
            password.setValue(oneCartPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select one cart sign in button$")
    public void ca_user_select_one_cart_sign_in_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select grocery supplier store \"([^\"]*)\"$")
    public void ca_user_select_grocery_supplier_store_something(String store) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see we will user your information message$")
    public void ca_user_can_see_we_will_user_your_information_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA is on grocery supplier page$")
    public void ca_is_on_grocery_supplier_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on one cart login page$")
    public void ca_user_is_on_one_cart_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see first delivery is on us message$")
    public void ca_user_can_see_first_delivery_is_on_us_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA select one cart icon$")
    public void ca_select_one_cart_icon() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user add item to buy to cart$")
    public void ca_user_add_item_to_buy_to_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select pay with MobiMoney Wallet$")
    public void ca_user_select_pay_with_mobimoney_wallet() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on grocery supplier page$")
    public void ca_user_is_on_grocery_supplier_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user on on one cart cart page$")
    public void ca_user_on_on_one_cart_cart_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wakanda payment page$")
    public void ca_user_is_on_wakanda_payment_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on successful payment page$")
    public void ca_user_is_on_successful_payment_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user navigate to one cart cart page$")
    public void ca_user_navigate_to_one_cart_cart_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see to total payable amount$")
    public void ca_user_can_see_to_total_payable_amount() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see delivery details for selected store \"([^\"]*)\"$")
    public void ca_user_can_see_delivery_details_for_selected_store_something(String store) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see your order details button$")
    public void ca_user_can_see_your_order_details_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see exit button$")
    public void ca_user_can_see_exit_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select exit button$")
    public void ca_user_select_exit_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select pay with MobiMoney Wallet tab$")
    public void ca_user_select_pay_with_mobimoney_wallet_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select your order from one cart card$")
    public void ca_user_select_your_order_from_one_cart_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select ongoing orders button$")
    public void ca_user_select_ongoing_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select an ongoing order from one cart$")
    public void ca_user_select_an_ongoing_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select track your shipment button$")
    public void ca_user_select_track_your_shipment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see ongoing order from one cart$")
    public void ca_user_can_see_ongoing_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on ongoing order details page$")
    public void ca_user_is_on_ongoing_order_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see order tracking status$")
    public void ca_user_can_see_order_tracking_status() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see your order from one cart card$")
    public void ca_user_can_see_your_order_from_one_cart_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see ongoing orders button$")
    public void ca_user_can_see_ongoing_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see past orders button$")
    public void ca_user_can_see_past_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see track your shipment button$")
    public void ca_user_can_see_track_your_shipment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a past order from one cart$")
    public void ca_user_select_a_past_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select reorder button$")
    public void ca_user_select_reorder_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see past order from one cart$")
    public void ca_user_can_see_past_order_from_one_cart() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on past order details page$")
    public void ca_user_is_on_past_order_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see pay with MobiMoney Wallet tab$")
    public void ca_user_can_see_pay_with_mobimoney_wallet_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see reorder button$")
    public void ca_user_can_see_reorder_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}
