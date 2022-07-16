package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class LoginAndEnrollment extends DriverFactory {

    private static Logger logger = Logger.getLogger(Logger.class);
    BasePageIOS page = new BasePageIOS();
    Utils util = new Utils();

    @Given("^CI user launch the customer ios app$")
    public void ci_user_launch_the_customer_ios_app() {
        try {
                driver = getIOSDriver();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user swipe left$")
    public void ci_user_swipe_left() {
        try {
            page.horizontalSwipeByPercentage(0.9, 0.01, 0.5);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select lets get started button$")
    public void ci_user_select_lets_get_started_button() {
        try {
             driver.findElementByAccessibilityId(IOSObjects.LETS_GET_STARTED_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select login button$")
    public void ci_user_select_login_button() {
        try {
              driver.findElementByAccessibilityId(IOSObjects.LOGIN_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter wakanda username \"([^\"]*)\"$")
    public void ci_user_enter_wakanda_username_something(String wakandaUsername) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(wakandaUsername);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select verify username button$")
    public void ci_user_select_login_button_on_wakanda_username_page() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VERIFY_USERNAME_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter wakanda password \"([^\"]*)\"$")
    public void ci_user_enter_wakanda_password_something(String wakandaPassword) {
        try {
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).setValue(wakandaPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select login button on wakanda password page$")
    public void ci_user_select_login_button_on_wakanda_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter opt \"([^\"]*)\" for verification$")
    public void ci_user_enter_opt_something_for_verification(String otp) {
        try {
            String digit1 = otp.substring(0,1);
            String digit2 = otp.substring(1,2);
            String digit3 = otp.substring(2,3);
            String digit4 = otp.substring(3,4);
            String digit5 = otp.substring(4,5);
            driver.findElementByAccessibilityId(digit1).click();
            driver.findElementByAccessibilityId(digit2).click();
            driver.findElementByAccessibilityId(digit3).click();
            driver.findElementByAccessibilityId(digit4).click();
            driver.findElementByAccessibilityId(digit5).click();
            driver.findElementByAccessibilityId(IOSObjects.ON_OTP_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select verify otp button$")
    public void ci_user_select_verify_otp_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VERIFY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select continue button$")
    public void ci_user_select_continue_button() {
        try {
              driver.findElementByAccessibilityId(IOSObjects.CONTINUE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user captures their facial biometric$")
    public void ci_user_captures_their_facial_biometric() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter account opt \"([^\"]*)\" for securing account$")
    public void ci_user_enter_account_opt_something_for_securing_account(String accountOtp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select next button$")
    public void ci_user_select_next_button() {
        try {
             util.secondsDelay(2);
              driver.findElementByAccessibilityId(IOSObjects.NEXT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select agree and continue button$")
    public void ci_user_select_agree_and_continue_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user setup pin \"([^\"]*)\" to secure account$")
    public void ci_user_setup_pin_something_to_secure_account(String accountOtp) {
        try {
            String digit1 = accountOtp.substring(0,1);
            String digit2 = accountOtp.substring(1,2);
            String digit3 = accountOtp.substring(2,3);
            String digit4 = accountOtp.substring(3,4);
            String digit5 = accountOtp.substring(4,5);
            driver.findElementByAccessibilityId(digit1).click();
            driver.findElementByAccessibilityId(digit2).click();
            driver.findElementByAccessibilityId(digit3).click();
            driver.findElementByAccessibilityId(digit4).click();
            driver.findElementByAccessibilityId(digit5).click();
            driver.findElementByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user re-enter pin \"([^\"]*)\" to secure account$")
    public void ci_user_reenter_pin_something_to_secure_account(String accountOtp) {
        try {
            util.secondsDelay(1);
            String digit1 = accountOtp.substring(0,1);
            String digit2 = accountOtp.substring(1,2);
            String digit3 = accountOtp.substring(2,3);
            String digit4 = accountOtp.substring(3,4);
            String digit5 = accountOtp.substring(4,5);
            driver.findElementByAccessibilityId(digit1).click();
            driver.findElementByAccessibilityId(digit2).click();
            driver.findElementByAccessibilityId(digit3).click();
            driver.findElementByAccessibilityId(digit4).click();
            driver.findElementByAccessibilityId(digit5).click();
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see incorrect pin message$")
    public void ci_user_can_see_incorrect_pin_message() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.INCORRECT_PIN_ERROR));
            String element = driver.findElementByAccessibilityId(IOSObjects.INCORRECT_PIN_ERROR).getText();
            Assert.assertTrue(element.contains(IOSDataFactory.PIN_MIS_MATCH));
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter password \"([^\"]*)\" to verify$")
    public void ci_user_enter_password_something_to_verify(String password) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter opt \"([^\"]*)\" for phone number verification$")
    public void ci_user_enter_opt_something_for_phone_number_verification(String otp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user enter wakanda PIN \"([^\"]*)\" to login$")
    public void ci_user_enter_wakanda_pin_something_to_login(String pin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user initiate a sensitive transaction$")
    public void ci_user_initiate_a_sensitive_transaction() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select on Use PIN link$")
    public void ci_user_select_on_use_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see Use PIN link$")
    public void ci_user_can_see_use_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter pin \"([^\"]*)\" as PIN$")
    public void ci_user_enter_pin_something_as_pin(String pin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user activate correct touch id finger to login$")
    public void ci_user_activate_correct_touch_id_finger_to_login() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select forgot password link$")
    public void ci_user_select_forgot_password_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter user name \"([^\"]*)\" to recover password$")
    public void ci_user_enter_user_name_something_to_recover_password(String username) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter the otp number \"([^\"]*)\"$")
    public void ci_user_enter_the_otp_number_something(String otpNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter new password \"([^\"]*)\"$")
    public void ci_user_enter_new_password_something(String newPassword) {
        try {
            page.waitForElement(By.className(IOSObjects.SECURE_TEXT_FIELDS));
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).setValue(newPassword);
            driver.findElementByAccessibilityId(IOSObjects.SET_YOUR_LOGIN_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user confirm password \"([^\"]*)\"$")
    public void ci_user_confirm_password_something(String confirmPassword) {
        try {
            page.waitForElement(By.className(IOSObjects.SECURE_TEXT_FIELDS));
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(1).click();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(1).clear();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(1).setValue(confirmPassword);
            driver.findElementByAccessibilityId(IOSObjects.SET_YOUR_LOGIN_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select reset password button$")
    public void ci_user_select_reset_password_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select forgot username link$")
    public void ci_user_select_forgot_username_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter id number \"([^\"]*)\"$")
    public void ci_user_enter_id_number_something(String idNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter cell number \"([^\"]*)\"$")
    public void ci_user_enter_cell_number_something(String cellNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select recover username button$")
    public void ci_user_select_recover_username_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select forgot PIN link$")
    public void ci_user_select_forgot_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter new pin \"([^\"]*)\"$")
    public void ci_user_enter_new_pin_something(String newPin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user confirm pin \"([^\"]*)\"$")
    public void ci_user_confirm_pin_something(String confirmPin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select change PIN button$")
    public void ci_user_select_change_pin_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on proposition page one$")
    public void ci_user_can_see_landing_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PROPOSITION_PAGE_ONE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PROPOSITION_PAGE_ONE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on proposition page two$")
    public void ci_user_is_on_order_now_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PROPOSITION_PAGE_TWO));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PROPOSITION_PAGE_TWO).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on proposition page three$")
    public void ci_user_is_on_nedbank_mobimoney_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PROPOSITION_PAGE_THREE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PROPOSITION_PAGE_THREE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on dashboard page$")
    public void ci_user_is_on_dashboard_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.HOME_MENU));
//            driver.findElementByAccessibilityId("Close").click();
            validateWindow();
            int size = driver.findElementsByAccessibilityId(IOSObjects.HOME_MENU).size();
            Assert.assertEquals(2,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wakanda username page$")
    public void ci_user_is_on_wakanda_username_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_USERNAME_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_USERNAME_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wakanda password page$")
    public void ci_user_is_on_wakanda_password_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_PASSWORD_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_PASSWORD_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on otp verification page$")
    public void ci_user_is_on_otp_verification_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_OTP_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_OTP_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI can see username already taken error$")
    public void ci_can_see_username_already_taken_error() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.USERNAME_ALREADY_TAKEN));
            int size = driver.findElementsByAccessibilityId(IOSObjects.USERNAME_ALREADY_TAKEN).size();
            Assert.assertEquals(size, 1);
            driver.findElementByAccessibilityId(IOSObjects.ERROR_DIALOG_CLOSE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see password mismatch error$")
    public void ci_user_can_see_password_mismatch_error() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PASSWORD_MIS_MATCH));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PASSWORD_MIS_MATCH).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on take a facial biometric page$")
    public void ci_user_is_on_take_a_facial_biometric_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user facial biometric is captured$")
    public void ci_user_facial_biometric_is_captured() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on secure your account page$")
    public void ci_user_is_on_secure_your_account_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on secure your account confirm page$")
    public void ci_user_is_on_secure_your_account_confirm_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see incorrect pin messagee$")
    public void ci_user_can_see_incorrect_pin_error() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the dashboard page$")
    public void ci_user_is_on_the_dashboard_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.DISPLAY_QR_CODE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.DISPLAY_QR_CODE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user facial biometric verification passes$")
    public void ci_user_facial_biometric_verification_passes() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on new installation detected page$")
    public void ci_user_is_on_new_installation_detected_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user facial biometric verification fails$")
    public void ci_user_facial_biometric_verification_fails() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is login to account with password page$")
    public void ci_user_is_login_to_account_with_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on login with password page$")
    public void ci_user_is_on_login_with_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wakanda PIN login page$")
    public void ci_user_is_on_wakanda_pin_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on landing page$")
    public void ci_user_is_on_landing_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user device finger print is activated$")
    public void ci_user_device_finger_print_is_activated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see incorrect finger activated message$")
    public void ci_user_can_see_incorrect_finger_activated_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on forgot password page$")
    public void ci_user_is_on_forgot_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^otp message is sent to the CI user$")
    public void otp_message_is_sent_to_the_ci_user() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user otp is validated$")
    public void ci_user_otp_is_validated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wakanda password login page$")
    public void ci_user_is_on_wakanda_password_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on forgot username page$")
    public void ci_user_is_on_forgot_username_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^sms with username is sent to CI user$")
    public void sms_with_username_is_sent_to_ci_user() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on login with PIN page$")
    public void ci_user_is_on_login_with_pin_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is authenticated$")
    public void ci_user_is_authenticated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user PIN is changed successfully$")
    public void ci_user_pin_is_changed_successfully() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is returned to login page$")
    public void ci_user_is_returned_to_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}

