package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
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

public class OnBoardingSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(OnBoardingSteps.class);
    private BasePageAndroid page = new BasePageAndroid();
    private Utils util = new Utils();


    @When("^CA user select sign up button$")
    public void ca_user_select_sign_up_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.SIGN_UP_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter south african id \"([^\"]*)\"$")
    public void ca_user_enter_south_african_id_something(String southAfricanId) {
        try {
            MobileElement element = driver.findElement(By.id("id_number")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(southAfricanId);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on sign up page$")
    public void ca_user_is_on_sign_up_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.ON_SIGN_UP_PAGE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see sign up button$")
    public void ca_user_can_see_sign_up_button() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SIGN_UP_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter cell phone number \"([^\"]*)\"$")
    public void ca_user_enter_cell_phone_number_something(String cellPhoneNumber) {
        try {
            MobileElement element = driver.findElement(By.id("cellphone_number")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(cellPhoneNumber);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user give consent to wakanda to process personal info$")
    public void ca_user_give_consent_to_wakanda_to_process_personal_info() {
        try {
            driver.findElement(By.id(AndroidObjects.PERSONAL_INFO_CHECKBOX)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user give accepts wakanda app terms and conditions$")
    public void ca_user_give_accepts_wakanda_app_terms_and_conditions() {
        try {
            driver.findElement(By.id(AndroidObjects.TERMS_AND_CONDITIONS_CHECKBOX)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user give accepts marketing policy$")
    public void ca_user_give_accepts_marketing_policy() {
        try {
            driver.findElement(By.id(AndroidObjects.MARKETING_POLICY_CHECKBOX)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see invalid id number error message$")
    public void ca_user_can_see_invalid_id_message() {
        try {
            String error = driver.findElement(By.id(AndroidObjects.TEXT_INPUT_ERROR)).getText();
            Assert.assertEquals(error, AndroidDataFactory.INVALID_ID_ERROR);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select generate otp button$")
    public void ca_user_select_generate_otp_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.GENERATE_OTP_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see invalid otp error message$")
    public void ca_user_can_see_invalid_otp_error_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select resend otp link$")
    public void ca_user_select_resend_otp_link() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.RE_SEND_OTP_BUTTON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter old otp \"([^\"]*)\"$")
    public void ca_user_enter_old_otp_something(String oldOtp) {
        try {
            driver.findElement(By.id(AndroidObjects.PIN_ONE)).click();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
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

    @When("^CA user enter otp \"([^\"]*)\" to verify mobile number$")
    public void ca_user_enter_otp_something_to_verify_mobile_number(String newOtp) {
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

    @Then("^CA user can receive newly generated otp$")
    public void ca_user_can_receive_newly_generated_otp() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user capture facial biometric$")
    public void ca_user_capture_facial_biometric() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter existing username \"([^\"]*)\"$")
    public void ca_user_enter_existing_username_something(String username) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA can see username already taken error$")
    public void ca_can_see_username_already_taken_error() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter first name \"([^\"]*)\"$")
    public void ca_user_enter_first_name_something(String firstName) {
        try {
            MobileElement element = driver.findElement(By.id("first_name")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(firstName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter username \"([^\"]*)\"$")
    public void ca_user_enters_username_something(String username) {
        try {
            MobileElement element = driver.findElement(By.id("username")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(username);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the hang in there page$")
    public void ca_user_is_on_the_hang_in_there_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on personal details page$")
    public void ca_user_is_on_personal_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

       @Then("^CA user is on set login details page$")
    public void ca_user_is_on_set_login_details_page() {
        try {
            String titlePage = driver.findElement(By.id(AndroidObjects.PAGE_TITLE)).getText();
            Assert.assertEquals(titlePage, AndroidDataFactory.ON_LOGIN_SET_UP_PAGE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user can see password mismatch error message$")
    public void ca_user_can_see_password_mismatch_error() {
        try {
            String error = driver.findElement(By.id(AndroidObjects.TEXT_INPUT_ERROR)).getText();
            Assert.assertEquals(error, AndroidDataFactory.INVALID_ID_ERROR);;
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user enter last name \"([^\"]*)\"$")
    public void ca_user_enter_last_name_something(String lastName) {
        try {
            MobileElement element = driver.findElement(By.id("last_name")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(lastName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter onboarding email \"([^\"]*)\"$")
    public void ca_user_enter_onboarding_email(String email) {
        try {
            MobileElement element = driver.findElement(By.id("email")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(email);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter occupation \"([^\"]*)\"$")
    public void ca_user_enter_occupation_something(String occupation) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(occupation);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select save pin button$")
    public void ca_user_select_save_pin_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select start exploring button$")
    public void ca_user_select_start_exploring_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see device biometric is enabled$")
    public void ca_user_can_see_device_biometric_is_enabled() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on welcome to wakanda page$")
    public void ca_user_is_on_welcome_to_wakanda_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see upgrade my wallet link$")
    public void ca_user_can_see_upgrade_my_wallet_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see MobiMoney balance text$")
    public void ca_user_can_see_mobi_money_balance_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see protect your payment with us text$")
    public void ca_user_can_see_protect_your_payment_with_us_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see YourPoints balance text$")
    public void ca_user_can_see_your_points_balance_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see you can now user your MobiMoney wallet on wakanda text$")
    public void ca_user_can_see_you_can_now_user_your_mobimoney_wallet_on_wakanda_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select occupation \"([^\"]*)\" from the list$")
    public void ca_user_select_occupation_something_from_the_list(String occupation) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enters nedbank id \"([^\"]*)\"$")
    public void ca_user_enters_nedbank_id_something(String nedbankId) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(nedbankId);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user agree to give access wakanda$")
    public void ca_user_agree_to_give_access_wakanda() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select authorise button$")
    public void ca_user_select_authorise_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on nedbank login page$")
    public void ca_user_is_on_nedbank_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wakanda authorization page$")
    public void ca_user_is_on_wakanda_authorization_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter nedbank password \"([^\"]*)\"$")
    public void ca_user_enter_nedbank_password_something(String nedbankPassword) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(nedbankPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select nedbank login button$")
    public void ca_user_select_nedbank_login_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see this sa id is already in use text$")
    public void ca_user_can_see_this_sa_id_is_already_in_use_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select upgrade my wallet link$")
    public void ca_user_select_upgrade_my_wallet_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter fallback password \"([^\"]*)\"$")
    public void ca_user_enter_fallback_password_something(String fallBackPassword) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(fallBackPassword);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see facial biometric failed$")
    public void ca_user_can_see_facial_biometric_failed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user is on password fallback page$")
    public void ca_user_is_on_password_fallback_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select verify password button$")
    public void ca_user_select_verify_password_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see enable device biometric label$")
    public void ci_user_can_see_enable_device_biometric_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
