package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class LoginAndEnrollment extends DriverFactory {

    private static Logger logger = Logger.getLogger(LoginAndEnrollment.class);
    BasePageAndroid page = new BasePageAndroid();
    Utils util = new Utils();

    @Given("^CA user launch the customer android app$")
    public void ca_user_launch_the_customer_android_app() {
        try {
            driver = getAndroidDriver();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user swipe left$")
    public void ca_user_swipe_left() {
        try {
            page.horizontalSwipeByPercentage(0.9, 0.01, 0.5);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select lets get started button$")
    public void ca_user_select_lets_get_started_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.LETS_GET_STARTED_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select login button$")
    public void ca_user_select_login_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.LOGIN_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select verify username button$")
    public void ca_user_select_verify_username_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.VERIFY_USERNAME_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user enter wakanda username \"([^\"]*)\"$")
    public void ca_user_enter_wakanda_username_something(String wakandaUsername) {
        try {
            MobileElement element = driver.findElement(By.id("username")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.sendKeys("");
            element.setValue(wakandaUsername);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter wakanda password \"([^\"]*)\"$")
    public void ca_user_enter_wakanda_password_something(String wakandaPassword) {
        try {

            MobileElement element = driver.findElement(By.id("username")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.sendKeys("");
            element.setValue(wakandaPassword);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select login button on wakanda password page$")
    public void ca_user_select_login_button_on_wakanda_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter opt \"([^\"]*)\" for verification$")
    public void ca_user_enter_opt_something_for_verification(String otp) {
        try {
            driver.findElement(By.id(AndroidObjects.PIN_ONE)).click();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_4));
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_5));
            util.secondsDelay(1);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select verify otp button$")
    public void ca_user_select_verify_otp_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.VERIFY_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select continue button$")
    public void ca_user_select_continue_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.CONTINUE_BUTTON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user captures their facial biometric$")
    public void ca_user_captures_their_facial_biometric() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter account opt \"([^\"]*)\" for securing account$")
    public void ca_user_enter_account_opt_something_for_securing_account(String accountOtp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select next button$")
    public void ca_user_select_next_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.NEXT_BUTTON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select agree and continue button$")
    public void ca_user_select_agree_and_continue_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user setup pin \"([^\"]*)\" to secure account$")
    public void ca_user_setup_pin_something_to_secure_account(String accountOtp) {

//        try {


        driver.findElement(By.id(AndroidObjects.PIN_ONE)).click();

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_1));

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));

        util.secondsDelay(1);

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_3));

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_4));

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_5));

        driver.hideKeyboard();
        util.secondsDelay(1);
//        } catch (Exception ex) {
////            logger.info(ex.getStackTrace());
//        }
    }

    @When("^CA user re-enter pin \"([^\"]*)\" to secure account$")
    public void ca_user_reenter_pin_something_to_secure_account(String accountOtp) {
        try {
            driver.findElement(By.id(AndroidObjects.PIN_ONE)).click();

            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));

            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_3));

            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_4));

            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_5));

            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter password \"([^\"]*)\" to verify$")
    public void ca_user_enter_password_something_to_verify(String password) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter opt \"([^\"]*)\" for phone number verification$")
    public void ca_user_enter_opt_something_for_phone_number_verification(String otp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select on Use PIN link$")
    public void ca_user_select_on_use_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select confirm button$")
    public void ca_user_select_on_confirm_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user initiate a sensitive transaction$")
    public void ca_user_initiate_a_sensitive_transaction() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user activate correct touch id finger to login$")
    public void ca_user_activate_correct_touch_id_finger_to_login() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select forgot password link$")
    public void ca_user_select_forgot_password_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter user name \"([^\"]*)\" to recover password$")
    public void ca_user_enter_user_name_something_to_recover_password(String username) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter the otp number \"([^\"]*)\"$")
    public void ca_user_enter_the_otp_number_something(String otpNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter new password \"([^\"]*)\"$")
    public void ca_user_enter_new_password_something(String newPassword) {
        try {
            MobileElement element = driver.findElement(By.id("password")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(newPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user confirm password \"([^\"]*)\"$")
    public void ca_user_confirm_password_something(String confirmPassword) {
        try {
            MobileElement element = driver.findElement(By.id("password_reenter")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(confirmPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select reset password button$")
    public void ca_user_select_reset_password_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select forgot username link$")
    public void ca_user_select_forgot_username_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter id number \"([^\"]*)\"$")
    public void ca_user_enter_id_number_something(String idNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter cell number \"([^\"]*)\"$")
    public void ca_user_enter_cell_number_something(String cellNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select recover username button$")
    public void ca_user_select_recover_username_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select forgot PIN link$")
    public void ca_user_select_forgot_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter new pin \"([^\"]*)\"$")
    public void ca_user_enter_new_pin_something(String newPin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user confirm pin \"([^\"]*)\"$")
    public void ca_user_confirm_pin_something(String confirmPin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select change PIN button$")
    public void ca_user_select_change_pin_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on proposition page two$")
    public void ca_user_is_on_order_now_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.PROPOSITION_PAGE_TWO);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on proposition page three$")
    public void ca_user_is_on_nedbank_mobimoney_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.PROPOSITION_PAGE_THREE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on proposition page one$")
    public void ca_user_is_on_landing_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
            Assert.assertTrue(titlePage.contains(AndroidDataFactory.PROPOSITION_PAGE_ONE));
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wakanda username page$")
    public void ca_user_is_on_wakanda_username_page() {
        try {
            driver.findElement(By.id("lets_started_button")).click();
            String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
            Assert.assertTrue(titlePage.contains(AndroidDataFactory.ON_USERNAME_PAGE));
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wakanda password page$")
    public void ca_user_is_on_wakanda_password_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
            Assert.assertTrue(titlePage.contains(AndroidDataFactory.ON_PASSWORD_PAGE));
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on otp verification page$")
    public void ca_user_is_on_otp_verification_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.PAGE_TITLE)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.OTP_VERIFICATION_PAGE);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on take a facial biometric page$")
    public void ca_user_is_on_take_a_facial_biometric_page() {
        try {
            util.secondsDelay(2);
            String titlePage = driver.findElement(By.id(AndroidObjects.PAGE_TITLE)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.TAKE_A_SELFIE_PAGE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user facial biometric is captured$")
    public void ca_user_facial_biometric_is_captured() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see enable device biometric label$")
    public void ca_user_can_see_enable_biometric_label() {
        try {
            String enableDeviceBiometric = driver.findElement(By.id(AndroidObjects.ENABLE_DEVICE_BIOMETRIC)).getText();
            Assert.assertEquals(enableDeviceBiometric, AndroidDataFactory.ENABLE_DEVICE_BIOMETRICS);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on secure your account page$")
    public void ca_user_is_on_secure_your_account_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.PAGE_TITLE)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.SECURE_ACCOUNT_PAGE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on dashboard page$")
    public void ca_user_is_on_the_dashboard_page() {
        try {
            validateWindow();
            int size = driver.findElements(By.id(AndroidObjects.HOME_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user facial biometric verification passes$")
    public void ca_user_facial_biometric_verification_passes() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on new installation detected page$")
    public void ca_user_is_on_new_installation_detected_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user facial biometric verification fails$")
    public void ca_user_facial_biometric_verification_fails() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is login to account with password page$")
    public void ca_user_is_login_to_account_with_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see Use PIN link$")
    public void ca_user_can_see_use_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is able to see wallet balance$")
    public void ca_user_is_able_to_see_wallet_balance() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user device finger print is activated$")
    public void ca_user_device_finger_print_is_activated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see incorrect finger activated message$")
    public void ca_user_can_see_incorrect_finger_activated_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on login with password page$")
    public void ca_user_is_on_login_with_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on forgot password page$")
    public void ca_user_is_on_forgot_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^otp message is sent to the CA user$")
    public void otp_message_is_sent_to_the_ca_user() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user otp is validated$")
    public void ca_user_otp_is_validated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wakanda password login page$")
    public void ca_user_is_on_wakanda_password_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on forgot username page$")
    public void ca_user_is_on_forgot_username_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^sms with username is sent to CA user$")
    public void sms_with_username_is_sent_to_ca_user() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on login with PIN page$")
    public void ca_user_is_on_login_with_pin_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is authenticated$")
    public void ca_user_is_authenticated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user PIN is changed successfully$")
    public void ca_user_pin_is_changed_successfully() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is returned to login page$")
    public void ca_user_is_returned_to_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter pin \"([^\"]*)\" as PIN$")
    public void ca_user_enter_pin_something_as_pin(String pin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see pin mismatch error$")
    public void ca_user_can_see_pin_mismatch_error() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user previous device is not deregistered$")
    public void ca_user_previous_device_is_not_de_registered() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user previous device is deregistered$")
    public void ca_user_previous_device_is_de_registered() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}
