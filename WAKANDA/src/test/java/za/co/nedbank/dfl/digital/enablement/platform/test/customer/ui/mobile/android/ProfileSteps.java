package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class ProfileSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(ProfileSteps.class);
    BasePageAndroid page = new BasePageAndroid();
    Utils util = new Utils();


    @When("^CA user select my account menu$")
    public void ca_user_select_my_account_menu() {
        try {
             driver.findElement(By.id(AndroidObjects.PROFILE_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user is on profile page$")
    public void ca_user_is_on_profile_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_PROFILE_PAGE)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see refer a friend profile menu$")
    public void ca_user_can_see_refer_a_friend_profile_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see help and support profile menu$")
    public void ca_user_can_see_help_and_support_profile_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see terms and conditions profile menu$")
    public void ca_user_can_see_terms_and_conditions_profile_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see rate aus profile menu$")
    public void ca_user_can_see_rate_aus_profile_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see about us profile menu$")
    public void ca_user_can_see_about_us_profile_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see logout button$")
    public void ca_user_can_see_logout_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user scroll up$")
    public void ca_user_scroll_up() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see customer name label$")
    public void ca_user_can_see_customer_name_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see waka id label$")
    public void ca_user_can_see_waka_id_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see qr code label profile menu$")
    public void ca_user_can_see_qr_code_label_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_QR_CODE)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see saved accounts and cards profile menu$")
    public void ca_user_can_see_saved_accounts_and_cards_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_SAVED_CARDS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see my rewards profile menu$")
    public void ca_user_can_see_my_rewards_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_MY_REWARDS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see addresses profile menu$")
    public void ca_user_can_see_addresses_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_ADDRESS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see favourite profile menu$")
    public void ca_user_can_see_favourite_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_FAVOURITES)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see order history profile menu$")
    public void ca_user_can_see_order_history_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_ORDER_HISTORY)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see app settings profile menu$")
    public void ca_user_can_see_app_settings_profile_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_SETTINGS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select qr code profile menu$")
    public void ca_user_select_qr_code_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_QR_CODE)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on qr code page$")
    public void ca_user_is_on_qr_code_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see download qr code link$")
    public void ca_user_can_see_download_qr_code_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select saved accounts and cards profile menu$")
    public void ca_user_select_saved_accounts_and_cards_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_SAVED_CARDS)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on saved accounts and cards page$")
    public void ca_user_is_on_saved_accounts_and_cards_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select my rewards profile menu$")
    public void ca_user_select_my_rewards_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_MY_REWARDS)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on my rewards page$")
    public void ca_user_is_on_my_rewards_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select addresses profile menu$")
    public void ca_user_select_addresses_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_ADDRESS)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select add new address button$")
    public void ca_user_select_add_new_address_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on addresses page$")
    public void ca_user_is_on_addresses_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select save address button$")
    public void ca_user_select_save_address_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see save address button$")
    public void ca_user_can_see_save_address_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select order favourites menu$")
    public void ca_user_select_order_favourites_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_FAVOURITES)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select category \"([^\"]*)\" button$")
    public void ca_user_select_category_something_button(String category) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on favourites page$")
    public void ca_user_is_on_favourites_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see start shopping button$")
    public void ca_user_can_see_start_shopping_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select order history profile menu$")
    public void ca_user_select_order_history_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_ORDER_HISTORY)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on order history page$")
    public void ca_user_is_on_order_history_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on ongoing orders page$")
    public void ca_user_is_on_ongoing_orders_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select going orders button$")
    public void ca_user_select_going_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select past orders button$")
    public void ca_user_select_past_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user is on past orders page$")
    public void ca_user_is_on_past_orders_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select apply button$")
    public void ca_user_select_apply_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select app settings profile menu$")
    public void ca_user_select_app_settings_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_SETTINGS)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select change pin menu$")
    public void ca_user_select_change_pin_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA is on current password page$")
    public void ca_is_on_current_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on app settings page$")
    public void ca_user_is_on_app_settings_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on notifications page$")
    public void ca_user_is_on_notifications_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select notifications menu$")
    public void ca_user_select_notifications_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select device back button$")
    public void ca_user_select_device_back_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on change pin page$")
    public void ca_user_is_on_change_pin_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select update password button$")
    public void ca_user_select_update_password_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select change password menu$")
    public void ca_user_select_change_password_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select fingerprint toggle button$")
    public void ca_user_select_fingerprint_toggle_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see fingerprint toggle is updated$")
    public void ca_user_can_see_fingerprint_toggle_is_updated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on change password page$")
    public void ca_user_is_on_change_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select fingerprint menu$")
    public void ca_user_select_fingerprint_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user is on fingerprint menu$")
    public void ca_user_is_on_fingerprint_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select refer a friend profile menu$")
    public void ca_user_select_refer_a_friend_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_REFER_A_FREIND)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select refer a friend button$")
    public void ca_user_select_refer_a_friend_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on refer a friend page$")
    public void ca_user_is_on_refer_a_friend_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see referral reward for customer$")
    public void ca_user_can_see_referral_reward_for_customer() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see referral link for customer$")
    public void ca_user_can_see_referral_link_for_customer() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select help and support profile menu$")
    public void ca_user_select_help_and_support_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_HELP_AND_SUPPORT)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select terms and conditions menu$")
    public void ca_user_select_terms_and_conditions_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select privacy policy menu$")
    public void ca_user_select_privacy_policy_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select terms of use menu$")
    public void ca_user_select_terms_of_use_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select copyrights  menu$")
    public void ca_user_select_copyrights_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select return policy  menu$")
    public void ca_user_select_return_policy_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on help and support page$")
    public void ca_user_is_on_help_and_support_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.FILL)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on terms and conditions page$")
    public void ca_user_is_on_terms_and_conditions_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select terms and conditions profile menu$")
    public void ca_user_select_terms_and_conditions_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_TERMS_CONDITIONS)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see terms and conditions menu$")
    public void ca_user_can_see_terms_and_conditions_menu() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_TERMS_CONDITIONS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see privacy policy menu$")
    public void ca_user_can_see_privacy_policy_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see terms of use menu$")
    public void ca_user_can_see_terms_of_use_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see copyrights menu$")
    public void ca_user_can_see_copyrights_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can legal menu$")
    public void ca_user_can_legal_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see legal menu$")
    public void ca_user_can_see_legal_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see return policy menu$")
    public void ca_user_can_see_return_policy_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select rate us profile menu$")
    public void ca_user_select_rate_us_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_RATE_US)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select ratings$")
    public void ca_user_select_ratings() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on rate us page$")
    public void ca_user_is_on_rate_us_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_TERMS_CONDITIONS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter comments \"([^\"]*)\"$")
    public void ca_user_enter_comments_something(String comments) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select logout button$")
    public void ca_user_select_logout_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on about us page$")
    public void ca_user_is_on_about_us_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PROFILE_MENU_TERMS_CONDITIONS)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select about us profile menu$")
    public void ca_user_select_about_us_profile_menu() {
        try {
            driver.findElement(By.id(AndroidObjects.PROFILE_MENU_ABOUT_US)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


}
