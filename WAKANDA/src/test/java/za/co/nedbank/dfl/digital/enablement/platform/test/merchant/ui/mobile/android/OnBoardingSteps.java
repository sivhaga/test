//package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.android;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import org.apache.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
//import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;
//
//public class OnBoardingSteps extends DriverFactory {
//
//    private static Logger logger = Logger.getLogger(OnBoardingSteps.class);
//    private BasePageAndroid page = new BasePageAndroid();
//    private Utils util = new Utils();
//
//
//    @When("^MA user select sign up button$")
//    public void ma_user_select_sign_up_button() {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.SIGN_UP_BUTTON)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter south african id \"([^\"]*)\"$")
//    public void ma_user_enter_south_african_id_something(String southAfricanId) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(southAfricanId);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on sign up page$")
//    public void ma_user_is_on_sign_up_page() {
//        try {
//            try {
//                String titlePage = driver.findElement(By.id(AndroidObjects.TITLE_CONTENT)).getText();
//                Assert.assertEquals(titlePage, AndroidDataFactory.ON_SIGN_UP_PAGE);
//            } catch (Exception ex) {
//                logger.info(ex.getStackTrace());
//            }
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user can see sign up button$")
//    public void ma_user_can_see_sign_up_button() {
//        try {
//            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SIGN_UP_BUTTON)).size();
//            Assert.assertEquals(1, size);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter cell phone number \"([^\"]*)\"$")
//    public void ma_user_enter_cell_phone_number_something(String cellPhoneNumber) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(cellPhoneNumber);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user give consent to wakanda to process personal info$")
//    public void ma_user_give_consent_to_wakanda_to_process_personal_info() {
//        try {
//            driver.findElement(By.id(AndroidObjects.PERSONAL_INFO_CHECKBOX)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user give accepts wakanda app terms and conditions$")
//    public void ma_user_give_accepts_wakanda_app_terms_and_conditions() {
//        try {
//            driver.findElement(By.id(AndroidObjects.TERMS_AND_CONDITIONS_CHECKBOX)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user give accepts marketing policy$")
//    public void ma_user_give_accepts_marketing_policy() {
//        try {
//            driver.findElement(By.id(AndroidObjects.MARKETING_POLICY_CHECKBOX)).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select generate otp button$")
//    public void ma_user_select_generate_otp_button() {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.GENERATE_OTP_BUTTON)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see invalid otp error message$")
//    public void ma_user_can_see_invalid_otp_error_message() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select resend otp link$")
//    public void ma_user_select_resend_otp_link() {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.RE_SEND_OTP_BUTTON)).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter old otp \"([^\"]*)\"$")
//    public void ma_user_enter_old_otp_something(String oldOtp) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter otp \"([^\"]*)\" to verify mobile number$")
//    public void ma_user_enter_otp_something_to_verify_mobile_number(String newOtp) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can receive newly generated otp$")
//    public void ma_user_can_receive_newly_generated_otp() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @When("^MA user capture facial biometric$")
//    public void ma_user_capture_facial_biometric() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter first name \"([^\"]*)\"$")
//    public void ma_user_enter_first_name_something(String firstName) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(firstName);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter username \"([^\"]*)\"$")
//    public void ma_user_enters_username_something(String username) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(username);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the hang in there page$")
//    public void ma_user_is_on_the_hang_in_there_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on personal details page$")
//    public void ma_user_is_on_personal_details_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on set login details page$")
//    public void ma_user_is_on_set_login_details_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter last name \"([^\"]*)\"$")
//    public void ma_user_enter_last_name_something(String lastName) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(lastName);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user enter onboarding email \"([^\"]*)\"$")
//    public void ma_user_enter_onboarding_email_something(String email) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(email);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter occupation \"([^\"]*)\"$")
//    public void ma_user_enter_occupation_something(String occupation) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(occupation);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select save pin button$")
//    public void ma_user_select_save_pin_button() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select start exploring button$")
//    public void ma_user_select_start_exploring_button() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see device biometric is enabled$")
//    public void ma_user_can_see_device_biometric_is_enabled() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on welcome to wakanda page$")
//    public void ma_user_is_on_welcome_to_wakanda_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see upgrade my wallet link$")
//    public void ma_user_can_see_upgrade_my_wallet_link() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user can see you can now user your MobiMoney wallet on wakanda text$")
//    public void ma_user_can_see_you_can_now_user_your_mobimoney_wallet_on_wakanda_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see MobiMoney balance text$")
//    public void ma_user_can_see_mobi_money_balance_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see protect your payment with us text$")
//    public void ma_user_can_see_protect_your_payment_with_us_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user can see YourPoints balance text$")
//    public void ma_user_can_see_your_points_balance_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user can see you can now use your MobiMoney wallet on wakanda text$")
//    public void ma_user_can_see_you_can_now_use_your_mobimoney_wallet_on_wakanda_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select occupation \"([^\"]*)\" from the list$")
//    public void ma_user_select_occupation_something_from_the_list(String occupation) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enters nedbank id \"([^\"]*)\"$")
//    public void ma_user_enters_nedbank_id_something(String nedbankId) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(nedbankId);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user agree to give access wakanda$")
//    public void ma_user_agree_to_give_access_wakanda() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select authorise button$")
//    public void ma_user_select_authorise_button() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user is on wakanda authorization page$")
//    public void ma_user_is_on_wakanda_authorization_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select Individual business type$")
//    public void ma_user_select_individual_business_type()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on lets get started page$")
//    public void ma_user_is_on_lets_get_started_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on lets get started$")
//    public void ma_user_is_on_lets_get_started() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter nedbank password \"([^\"]*)\"$")
//    public void ma_user_enter_nedbank_password_something(String nedbankPassword) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(nedbankPassword);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select nedbank login button$")
//    public void ma_user_select_nedbank_login_button() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see this sa id is already in use text$")
//    public void ma_user_can_see_this_sa_id_is_already_in_use_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select upgrade my wallet link$")
//    public void ma_user_select_upgrade_my_wallet_link() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter fallback password \"([^\"]*)\"$")
//    public void ma_user_enter_fallback_password_something(String fallBackPassword) {
//        try {
//            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.clear();
//            element.setValue(fallBackPassword);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user can see facial biometric failed$")
//    public void ma_user_can_see_facial_biometric_failed() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user is on password fallback page$")
//    public void ma_user_is_on_password_fallback_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select verify password button$")
//    public void ma_user_select_verify_password_button() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select MultiDirector Company & Others business type$")
//    public void ma_user_select_multidirector_company_others_business_type()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter business registration number \"([^\"]*)\"$")
//    public void ma_user_enter_business_registration_number_something(String businessregistrationnumber)  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see Wakanda reference number$")
//    public void ma_user_can_see_wakanda_reference_number()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see message Wakanda will reach out to them within 48 hours displayed$")
//    public void ma_user_can_see_message_wakanda_will_reach_out_to_them_within_48_hours_displayed()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see message regarding email sent for requirements to complete registration process displayed$")
//    public void ma_user_can_see_message_regarding_email_sent_for_requirements_to_complete_registration_process_displayed()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter full name \"([^\"]*)\"$")
//    public void ma_user_enter_full_name_something(String fullname)  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter designation \"([^\"]*)\"$")
//    public void ma_user_enter_designation_something(String designation)  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//}