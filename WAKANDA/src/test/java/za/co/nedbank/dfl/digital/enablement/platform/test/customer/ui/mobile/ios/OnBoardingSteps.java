package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;
import java.util.Random;


public class OnBoardingSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(OnBoardingSteps.class);
    private BasePageIOS page = new BasePageIOS();
    private Utils util = new Utils();


    @When("^CI user select sign up button$")
    public void ci_user_select_sign_up_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SIGN_UP_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter south african id \"([^\"]*)\"$")
    public void ci_user_enter_south_african_id_something(String southAfricanId) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(southAfricanId);
            driver.findElementByAccessibilityId(IOSObjects.LET_GET_STARTED).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on sign up page$")
    public void ci_user_is_on_sign_up_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.LET_GET_STARTED));
            int size = driver.findElementsByAccessibilityId(IOSObjects.LET_GET_STARTED).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see sign up button$")
    public void ci_user_can_see_sign_up_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter cell phone number \"([^\"]*)\"$")
    public void ci_user_enter_cell_phone_number_something(String cellPhoneNumber) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).setValue(cellPhoneNumber);
            driver.findElementByAccessibilityId(IOSObjects.LET_GET_STARTED).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user give consent to wakanda to process personal info$")
    public void ci_user_give_consent_to_wakanda_to_process_personal_info() {
        try {
               driver.findElementByAccessibilityId(IOSObjects.PERSONAL_INFO_CONSENT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see invalid id number error message$")
    public void ci_user_can_see_invalid_id_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user give accepts wakanda app terms and conditions$")
    public void ci_user_give_accepts_wakanda_app_terms_and_conditions() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.TERMS_AND_CONDITIONS_CONSENT).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user give accepts marketing policy$")
    public void ci_user_give_accepts_marketing_policy() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.MARKETING_POLICY_CONSENT).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select generate otp button$")
    public void ci_user_select_generate_otp_button() {
        try {
             driver.findElementByAccessibilityId(IOSObjects.GENERATE_OTP_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see invalid otp error message$")
    public void ci_user_can_see_invalid_otp_error_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select resend otp link$")
    public void ci_user_select_resend_otp_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter old otp \"([^\"]*)\"$")
    public void ci_user_enter_old_otp_something(String oldOtp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter otp \"([^\"]*)\" to verify mobile number$")
    public void ci_user_enter_otp_something_to_verify_mobile_number(String newOtp) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can receive newly generated otp$")
    public void ci_user_can_receive_newly_generated_otp() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user capture facial biometric$")
    public void ci_user_capture_facial_biometric() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter first name \"([^\"]*)\"$")
    public void ci_user_enter_first_name_something(String firstName) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(firstName);
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter existing username \"([^\"]*)\"$")
    public void ci_user_enters_existing_username_something(String username) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(username);
            driver.findElementByAccessibilityId(IOSObjects.SET_YOUR_LOGIN_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter username \"([^\"]*)\"$")
    public void ci_user_enters_username_something(String username) {
        try {
            Random rand = new Random();
            int random = rand.nextInt(500000);
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(username+random);
            driver.findElementByAccessibilityId(IOSObjects.SET_YOUR_LOGIN_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the hang in there page$")
    public void ci_user_is_on_the_hang_in_there_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on personal details page$")
    public void ci_user_is_on_personal_details_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PERSONAL_DETAILS_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PERSONAL_DETAILS_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on set login details page$")
    public void ci_user_is_on_set_login_details_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SET_YOUR_LOGIN_DETAILS_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SET_YOUR_LOGIN_DETAILS_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter last name \"([^\"]*)\"$")
    public void ci_user_enter_last_name_something(String lastName) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).setValue(lastName);
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select occupation \"([^\"]*)\"$")
    public void ci_user_select_occupation_something(String occupation) {
        try {

            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).click();

            ((IOSDriver) driver).findElementByClassName(IOSObjects.PICKERWHEEL)
                    .sendKeys(occupation);
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter onboarding email \"([^\"]*)\"$")
    public void ci_user_enter_on_boarding_email(String email) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).setValue(email);
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_DETAILS_PAGE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select save pin button$")
    public void ci_user_select_save_pin_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select start exploring button$")
    public void ci_user_select_start_exploring_button() {
        try {
              driver.findElementByAccessibilityId(IOSObjects.START_EXPLORING).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see device biometric is enabled$")
    public void ci_user_can_see_device_biometric_is_enabled() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on welcome to wakanda page$")
    public void ci_user_is_on_welcome_to_wakanda_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.WELCOME_TO_WAKANDA_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.WELCOME_TO_WAKANDA_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see upgrade my wallet link$")
    public void ci_user_can_see_upgrade_my_wallet_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see MobiMoney balance text$")
    public void ci_user_can_see_mobi_money_balance_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see protect your payment with us text$")
    public void ci_user_can_see_protect_your_payment_with_us_text() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.WALLET_MENU).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see YourPoints balance text$")
    public void ci_user_can_see_your_points_balance_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see you can now user your MobiMoney wallet on wakanda text$")
    public void ci_user_can_see_you_can_now_user_your_mobimoney_wallet_on_wakanda_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select occupation \"([^\"]*)\" from the list$")
    public void ci_user_select_occupation_something_from_the_list(String occupation) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enters nedbank id \"([^\"]*)\"$")
    public void ci_user_enters_nedbank_id_something(String nedbankId) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user agree to give access wakanda$")
    public void ci_user_agree_to_give_access_wakanda() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select authorise button$")
    public void ci_user_select_authorise_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.NED_BANK_ID_AUTHORIZE_ACCEPT_TERMS));
            driver.findElementByXPath(IOSObjects.NED_BANK_ID_AUTHORIZE_ACCEPT_TERMS).click();
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.NED_BANK_ID_AUTHORIZE));
            driver.findElementByAccessibilityId(IOSObjects.NED_BANK_ID_AUTHORIZE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on nedbank login page$")
    public void ci_user_is_on_nedbank_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wakanda authorization page$")
    public void ci_user_is_on_wakanda_authorization_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter nedbank password \"([^\"]*)\"$")
    public void ci_user_enter_nedbank_password_something(String nedbankpassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select nedbank login button$")
    public void ci_user_select_nedbank_login_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see this sa id is already in use text$")
    public void ci_user_can_see_this_sa_id_is_already_in_use_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select upgrade my wallet link$")
    public void ci_user_select_upgrade_my_wallet_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter fallback password \"([^\"]*)\"$")
    public void ci_user_enter_fallback_password_something(String fallBackPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see facial biometric failed$")
    public void ci_user_can_see_facial_biometric_failed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user is on password fallback page$")
    public void ci_user_is_on_password_fallback_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select verify password button$")
    public void ci_user_select_verify_password_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}
