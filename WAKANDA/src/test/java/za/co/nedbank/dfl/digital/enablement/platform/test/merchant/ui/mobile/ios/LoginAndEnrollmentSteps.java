package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class LoginAndEnrollmentSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(LoginAndEnrollmentSteps.class);
    BasePageIOS page = new BasePageIOS();
    Utils util = new Utils();


    @Given("^MI user launch the merchant ios app$")
    public void mi_user_launch_the_merchant_ios_app() {
        try {
            driver = getIOSDriver();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user swipe left$")
    public void mi_user_swipe_left() {
        try {
            page.horizontalSwipeByPercentage(0.9, 0.01, 0.5);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select lets get started button$")
    public void mi_user_select_lets_get_started_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.LETS_GET_STARTED_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select login button$")
    public void mi_user_select_login_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.LOGIN_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter wakanda username \"([^\"]*)\"$")
    public void mi_user_enter_wakanda_username_something(String wakandaUsername) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(wakandaUsername);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select verify username button$")
    public void mi_user_select_login_button_on_wakanda_username_page() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CONTINUE_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter wakanda password \"([^\"]*)\"$")
    public void mi_user_enter_wakanda_password_something(String wakandaPassword) {
        try {
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.SECURE_TEXT_FIELDS)).get(0).setValue(wakandaPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select login button on wakanda password page$")
    public void mi_user_select_login_button_on_wakanda_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter opt \"([^\"]*)\" for verification$")
    public void mi_user_enter_opt_something_for_verification(String otp) {
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

    @When("^MI user select verify otp button$")
    public void mi_user_select_verify_otp_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VERIFY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select continue button$")
    public void mi_user_select_continue_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CONTINUE_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user captures their facial biometric$")
    public void mi_user_captures_their_facial_biometric() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter account opt \"([^\"]*)\" for securing account$")
    public void mi_user_enter_account_opt_something_for_securing_account(String accountOtp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select next button$")
    public void mi_user_select_next_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.NEXT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select agree and continue button$")
    public void mi_user_select_agree_and_continue_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter pin \"([^\"]*)\" to authenticate$")
    public void mi_user_enter_pin_to_authenticate(String pin) {
        try {

            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(2).findElementsByClassName("XCUIElementTypeOther").get(1).findElementByClassName("XCUIElementTypeOther").findElementByClassName("XCUIElementTypeOther").click();

            util.secondsDelay(5);

            String digit1 = pin.substring(0,1);
            String digit2 = pin.substring(1,2);
            String digit3 = pin.substring(2,3);
            String digit4 = pin.substring(3,4);
            String digit5 = pin.substring(4,5);
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

    @When("^MI user enter pin \"([^\"]*)\" to authenticate for transactions$")
    public void mi_user_enter_pin_to_authenticate_for_transaction(String pin) {
        try {

            driver.findElementByClassName("XCUIElementTypeOther").findElementByClassName("XCUIElementTypeOther").findElementByClassName("XCUIElementTypeOther").click();

            util.secondsDelay(5);

            String digit1 = pin.substring(0,1);
            String digit2 = pin.substring(1,2);
            String digit3 = pin.substring(2,3);
            String digit4 = pin.substring(3,4);
            String digit5 = pin.substring(4,5);
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

    @When("^MI user setup pin \"([^\"]*)\" to secure account$")
    public void mi_user_setup_pin_something_to_secure_account(String accountOtp) {
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

    @When("^MI user re-enter pin \"([^\"]*)\" to secure account$")
    public void mi_user_reenter_pin_something_to_secure_account(String accountOtp) {
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
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see incorrect pin message$")
    public void mi_user_can_see_incorrect_pin_message() {
        try {
            util.secondsDelay(2);
            String element = driver.findElementByAccessibilityId(IOSObjects.INCORRECT_PIN_ERROR).getText();
            Assert.assertTrue(element.contains(IOSDataFactory.PIN_MIS_MATCH));
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter password \"([^\"]*)\" to verify$")
    public void mi_user_enter_password_something_to_verify(String password) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter opt \"([^\"]*)\" for phone number verification$")
    public void mi_user_enter_opt_something_for_phone_number_verification(String otp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^MI user enter wakanda PIN \"([^\"]*)\" to login$")
    public void mi_user_enter_wakanda_pin_something_to_login(String pin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user initiate a sensitive transaction$")
    public void mi_user_initiate_a_sensitive_transaction() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select on Use PIN link$")
    public void mi_user_select_on_use_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see Use PIN link$")
    public void mi_user_can_see_use_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter pin \"([^\"]*)\" as PIN$")
    public void mi_user_enter_pin_something_as_pin(String pin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^MI user activate correct touch id finger to login$")
    public void mi_user_activate_correct_touch_id_finger_to_login() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select forgot password link$")
    public void mi_user_select_forgot_password_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter user name \"([^\"]*)\" to recover password$")
    public void mi_user_enter_user_name_something_to_recover_password(String username) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter the otp number \"([^\"]*)\"$")
    public void mi_user_enter_the_otp_number_something(String otpNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter new password \"([^\"]*)\"$")
    public void mi_user_enter_new_password_something(String newPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user confirm password \"([^\"]*)\"$")
    public void mi_user_confirm_password_something(String confirmPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select reset password button$")
    public void mi_user_select_reset_password_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select forgot username link$")
    public void mi_user_select_forgot_username_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter id number \"([^\"]*)\"$")
    public void mi_user_enter_id_number_something(String idNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter cell number \"([^\"]*)\"$")
    public void mi_user_enter_cell_number_something(String cellNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select recover username button$")
    public void mi_user_select_recover_username_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select forgot PIN link$")
    public void mi_user_select_forgot_pin_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter new pin \"([^\"]*)\"$")
    public void mi_user_enter_new_pin_something(String newPin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user confirm pin \"([^\"]*)\"$")
    public void mi_user_confirm_pin_something(String confirmPin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select change PIN button$")
    public void mi_user_select_change_pin_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on proposition page one$")
    public void mi_user_can_see_landing_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.PROPOSITION_PAGE_ONE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on proposition page two$")
    public void mi_user_is_on_order_now_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.PROPOSITION_PAGE_TWO).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on proposition page three$")
    public void mi_user_is_on_nedbank_mobimoney_page() {
        try {
            util.secondsDelay(3);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.PROPOSITION_PAGE_THREE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on dashboard page$")
    public void mi_user_is_on_dashboard_page() {
        try {

            util.secondsDelay(5);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.DISPLAY_QR).size();
            Assert.assertEquals(1,size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on wakanda username page$")
    public void mi_user_is_on_wakanda_username_page() {
        try {
            util.secondsDelay(4);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_USERNAME_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on wakanda password page$")
    public void mi_user_is_on_wakanda_password_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_PASSWORD_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on otp verification page$")
    public void mi_user_is_on_otp_verification_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_OTP_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on take a facial biometric page$")
    public void mi_user_is_on_take_a_facial_biometric_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user facial biometric is captured$")
    public void mi_user_facial_biometric_is_captured() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on secure your account page$")
    public void mi_user_is_on_secure_your_account_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on secure your account confirm page$")
    public void mi_user_is_on_secure_your_account_confirm_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see incorrect pin messagee$")
    public void mi_user_can_see_incorrect_pin_error() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_SECURE_ACCOUNT_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the dashboard page$")
    public void mi_user_is_on_the_dashboard_page() {
        try {
            util.secondsDelay(5);
            int size = driver.findElementsByAccessibilityId(IOSObjects.DISPLAY_QR_CODE).size();
            Assert.assertEquals(size, 1);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user facial biometric verification passes$")
    public void mi_user_facial_biometric_verification_passes() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on new installation detected page$")
    public void mi_user_is_on_new_installation_detected_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user facial biometric verification fails$")
    public void mi_user_facial_biometric_verification_fails() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is login to account with password page$")
    public void mi_user_is_login_to_account_with_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on login with password page$")
    public void mi_user_is_on_login_with_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on wakanda PIN login page$")
    public void mi_user_is_on_wakanda_pin_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on landing page$")
    public void mi_user_is_on_landing_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select on confirm button$")
    public void mi_user_select23_on_confirm_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CONFIRM_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user device finger print is activated$")
    public void mi_user_device_finger_print_is_activated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see incorrect finger activated message$")
    public void mi_user_can_see_incorrect_finger_activated_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on forgot password page$")
    public void mi_user_is_on_forgot_password_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^otp message is sent to the MI user$")
    public void otp_message_is_sent_to_the_mi_user() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user otp is validated$")
    public void mi_user_otp_is_validated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on wakanda password login page$")
    public void mi_user_is_on_wakanda_password_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on forgot username page$")
    public void mi_user_is_on_forgot_username_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^sms with username is sent to MI user$")
    public void sms_with_username_is_sent_to_mi_user() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on login with PIN page$")
    public void mi_user_is_on_login_with_pin_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is authenticated$")
    public void mi_user_is_authenticated() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user PIN is changed successfully$")
    public void mi_user_pin_is_changed_successfully() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is returned to login page$")
    public void mi_user_is_returned_to_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}
