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
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios.IOSObjects;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class WalletSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(WalletSteps.class);
    private BasePageAndroid page = new BasePageAndroid();
    private Utils util = new Utils();

    @When("^CA user select settlement button$")
    public void ca_user_select_settlement() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is able to see settlement button$")
    public void ca_user_is_able_to_see_settlement_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on settlement page$")
    public void ca_user_is_on_settlement_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see a confirmation screen with settlement details$")
    public void ca_user_can_see_a_confirmation_screen_with_settlement_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select view other sources$")
    public void ca_user_select_view_other_sources() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select plus sign$")
    public void ca_user_select_plus_sign() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select to a nedbank account option$")
    public void ca_user_select_to_a_nedbank_account_option() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select bank name$")
    public void ca_user_select_bank_name() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select other bank option$")
    public void ca_user_select_other_bank_option() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FILL)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter account number \"([^\"]*)\" as account number$")
    public void ca_user_enter_account_number_something_as_account_number(String accountNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter account holder name \"([^\"]*)\" as account holder name$")
    public void ca_user_enter_account_holder_name_something_as_account_holder_name(String accountHolderName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select account for payment type$")
    public void ca_user_select_account_for_payment_type() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter reference \"([^\"]*)\"$")
    public void ca_user_enter_reference_something(String reference) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select save button$")
    public void ca_user_select_save_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter house number and complex name \"([^\"]*)\"$")
    public void ca_user_enter_house_number_and_complex_name_something(String houseNumbeAndComplexnName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select first answer \"([^\"]*)\"$")
    public void ca_user_select_first_answer_something(String firstAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select second answer \"([^\"]*)\"$")
    public void ca_user_select_second_answer_something(String secondAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select third answer \"([^\"]*)\"$")
    public void ca_user_select_third_answer_something(String thirdAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select forth answer \"([^\"]*)\"$")
    public void ca_user_select_forth_answer_something(String fourthAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select fifth answer \"([^\"]*)\"$")
    public void ca_user_select_fifth_answer_something(String fifthAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select sixth answer \"([^\"]*)\"$")
    public void ca_user_select_sixth_answer_something(String sixthAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select submit button$")
    public void ca_user_select_submit_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on login page$")
    public void ca_user_is_on_login_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the dashboard page$")
    public void ca_user_is_on_the_dashboard_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on address page$")
    public void ca_user_is_on_address_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the first risk profile question page$")
    public void ca_user_is_on_the_first_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the second risk profile question page$")
    public void ca_user_is_on_the_second_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the third risk profile question page$")
    public void ca_user_is_on_the_third_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the forth risk profile question page$")
    public void ca_user_is_on_the_forth_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the fifth risk profile question page$")
    public void ca_user_is_on_the_fifth_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on the sixth risk profile question page$")
    public void ca_user_is_on_the_sixth_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on take id photo page$")
    public void ca_user_is_on_take_id_photo_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user take id photo using phone camera$")
    public void ca_user_take_id_photo_using_phone_camera() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on your wallet is unlimited n$")
    public void ca_user_is_on_your_wallet_is_unlimited_n() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enters username \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void ca_user_enters_username_something_with_password_something(String wakandaUsername, String wakandaPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter street name \"([^\"]*)\"$")
    public void ca_user_enter_street_name_something(String streetName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter suburb \"([^\"]*)\"$")
    public void ca_user_enter_suburb_something(String suburb) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter city \"([^\"]*)\"$")
    public void ca_user_enter_city_something(String city) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter postal code \"([^\"]*)\"$")
    public void ca_user_enter_postal_code_something(String postalCode) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user id uploaded page$")
    public void ca_user_id_uploaded_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on your wallet is unlimited now page$")
    public void ca_then_ca_user_is_on_your_wallet_is_unlimited_now_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user can see start exploring button select first answer \"([^\"]*)\"$")
    public void ca_user_can_see_start_exploring_button_select_first_answer_something(String firstAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user can see start exploring button$")
    public void ca_user_can_see_start_exploring_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select settle now button$")
    public void ca_user_select_settle_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see verification page is displayed$")
    public void ca_user_can_see_verification_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select verify button$")
    public void ca_user_select_verify_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select account for payment$")
    public void ca_user_select_account_for_payment() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select add account$")
    public void ca_user_select_add_account() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter pin \"([^\"]*)\" to authenticate$")
    public void ca_user_enter_pin_something_to_authenticate(String pin) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select my money menu$")
    public void ca_user_select_on_my_money() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select top up button$")
    public void ca_user_select_top_up() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter amount \"([^\"]*)\" as amount$")
    public void ca_user_enter_amount_something_as_amount(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on authentication page$")
    public void ca_user_is_on_authentication_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is able to see top up button$")
    public void ca_user_is_able_to_see_top_up_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user can see a confirmation screen with top up details$")
    public void ca_user_can_see_a_confirmation_screen_with_top_up_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select close button$")
    public void ca_user_select_close() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select wallet menu$")
    public void ca_user_select_wallet_menu_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.MY_MONEY_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user enter CA user id \"([^\"]*)\" as CA user id$")
    public void ca_user_enter_ca_user_id_something_as_ca_user_id(String userId) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user select continue$")
    public void ca_user_select_continue() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter password \"([^\"]*)\" as password$")
    public void ca_user_enter_password_something_as_password(String password) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see add confirmation page$")
    public void ca_user_can_see_add_confirmation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select add account button$")
    public void ca_user_select_add_account_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select top up my wallet$")
    public void ca_user_select_top_up_my_wallet() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see a confirmation page with top up detail$")
    public void ca_user_can_see_a_confirmation_page_with_top_up_detail() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select account to pay from$")
    public void ca_user_select_account_to_pay_from() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on Wallet account details page$")
    public void wallet_account_details_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see name label$")
    public void name_field_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see account number label$")
    public void account_number_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see bank name label$")
    public void bank_name_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see branch code label$")
    public void branch_code_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see reference label$")
    public void reference_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select EFT from another bank account option$")
    public void ca_user_select_eft_from_another_bank_account_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on add money page$")
    public void ca_user_is_on_add_money_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on delete confirmation page$")
    public void delete_confirmation_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see a delete confirmation page$")
    public void ca_user_can_see_a_delete_confirmation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select delete$")
    public void ca_user_select_delete() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select delete option$")
    public void ca_user_select_delete_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see a confirmation page with top up details$")
    public void ca_user_can_see_a_confirmation_page_with_top_up_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select manage sources$")
    public void ca_user_select_manage_sources() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user select add Nedbank account option$")
    public void ca_user_select_add_nedbank_account_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on Add funds via ATM details page$")
    public void add_funds_via_atm_details_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select Add funds via ATM option$")
    public void ca_user_select_add_funds_via_atm_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select withdrawal button$")
    public void ca_user_select_withdrawal() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is able to see withdrawal button$")
    public void ca_user_is_able_to_see_withdrawal_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on withdrawal page$")
    public void withdrawal_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see a confirmation page with withdrawal details$")
    public void ca_user_can_see_a_confirmation_page_with_withdrawal_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see wallet balance$")
    public void ca_user_can_see_wallet_balance() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see map with ATMs page$")
    public void map_is_displayed_with_atms() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select ATM locator link$")
    public void ca_user_select_atm_locator_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select wallet accept button$")
    public void ca_user_select_wallet_accept_button() {
        try {
            driver.findElement(By.id(AndroidObjects.ACCEPT_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select request money button$")
    public void ca_user_select_request_money_tab() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.REQUEST_MONEY_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter payment amount \"([^\"]*)\" to request$")
    public void ca_user_enter_payment_amount_something_to_request(String amount) {
        try {
            MobileElement element = driver.findElement(By.id("amount")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(amount);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on my money page$")
    public void ca_user_is_on_my_money_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MY_MONEY_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wallet request page$")
    public void ca_user_is_on_wallet_request_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.DISPLAY_QR_CODE_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on payment request page$")
    public void ca_user_is_on_payment_request_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.DISPLAY_QR_CODE_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on payment request confirmation page$")
    public void ca_user_is_on_payment_request_confirmation_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CONFIRMATION)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select create payment link$")
    public void ca_user_select_create_payment_link() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.CREATE_PAYMENT_LINK)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see download qr label$")
    public void ca_user_can_see_download_qr_label() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.DOWNLOAD_YOUR_QR_CODE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter recipient name \"([^\"]*)\"$")
    public void ca_user_enter_recipient_name_something(String recipient) {
        try {
            MobileElement element = driver.findElement(By.id("request_from")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(recipient);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter payment request description \"([^\"]*)\"$")
    public void ca_user_enter_payment_request_description_something(String description) {
        try {
            MobileElement element = driver.findElement(By.id("description")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(description);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter payment request reference \"([^\"]*)\"$")
    public void ca_user_enter_payment_request_reference_something(String reference) {
        try {
            MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.INVOICE_NUMBER_FIELD));
            element.click();
            element.clear();
            element.setValue(reference);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select set reminder toggle$")
    public void ca_user_select_set_reminder_toggle() {
        try {
            driver.findElement(By.id(AndroidObjects.REMINDER_SWITCH)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on request from page$")
    public void ca_user_is_on_request_form_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_REQUEST_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CA user can see payment link generated label$")
    public void ca_user_can_see_payement_link_generated_label() {
        try {
            String title = driver.findElement(By.id(AndroidObjects.PAGE_TITLE)).getText();
            Assert.assertEquals(title, AndroidDataFactory.PAYMENT_LINK_GENERATED);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see requested amount \"([^\"]*)\"$")
    public void ca_user_can_see_requested_amount_something(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for a recipient \"([^\"]*)\"$")
    public void ca_user_search_for_a_recipient_something(String recipientSearch) {
        try {
            driver.findElement(By.id(AndroidObjects.SEARCH_ICON)).click();
            driver.findElement(By.id(AndroidObjects.SEARCH_SRC_TEXT)).click();
            driver.findElement(By.id(AndroidObjects.SEARCH_SRC_TEXT)).setValue(recipientSearch);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select continue to request button$")
    public void ca_user_select_continue_to_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can no matches found label$")
    public void ca_user_can_no_matches_found_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see continue to request button$")
    public void ca_user_can_see_continue_to_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select wallet pay button$")
    public void ca_user_select_wallet_pay_button() {
        try {
            driver.findElement(By.id(AndroidObjects.PAY_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter amount \"([^\"]*)\" to pay$")
    public void ca_user_enter_amount_something_to_pay(String amount) {
        try {
            MobileElement element = driver.findElement(By.id("")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.clear();
            element.setValue(amount);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see wallet pay button$")
    public void ca_user_can_see_wallet_pay_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.PAY_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wallet pay page$")
    public void ca_user_is_on_wallet_pay_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_PAY_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see enter amount to pay label$")
    public void ca_user_can_see_enter_amount_to_pay_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select recipient \"([^\"]*)\" from search result$")
    public void ca_user_select_recipient_something_from_search_result(String recipientSearch) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on payment confirmation page$")
    public void ca_user_is_on_payment_confirmation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see pay success label$")
    public void ca_user_can_see_pay_success_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see payment transaction details$")
    public void ca_user_can_see_payment_transaction_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see share payment details button$")
    public void ca_user_can_see_share_payment_details_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see close button$")
    public void ca_user_can_see_close_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see user is not a wakanda client label$")
    public void ca_user_can_see_user_is_not_a_wakanda_client_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select scan qr code button$")
    public void ca_user_select_scan_qr_code_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select scan qr code menu$")
    public void ca_user_select_scan_qr_code_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @When("^CA user select request payment button$")
    public void ca_user_select_request_payment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select confirm and pay button$")
    public void ca_user_select_confirm_and_pay_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see request payment button$")
    public void ca_user_can_see_request_payment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see request payment details$")
    public void ca_user_can_see_request_payment_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see confirm and pay button$")
    public void ca_user_can_see_confirm_and_pay_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select reject button$")
    public void ca_user_select_reject_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on reject payment request page$")
    public void ca_user_is_on_reject_payment_request_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see reject button$")
    public void ca_user_can_see_reject_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

//    @Then("^CA user is on my money page$")
//    public void ca_user_is_on_my_money_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }

    @And("^CA user can see the no transactions yet message$")
    public void ca_user_can_see_the_no_transactions_yet_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select download floating button$")
    public void ca_user_select_download_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see download floating button$")
    public void ca_user_can_see_download_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see download successful message$")
    public void ca_user_can_see_download_successful_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see a list of transaction made$")
    public void ca_user_can_see_a_list_of_transaction_made() {
        try {
            int size = driver.findElements(By.id(AndroidObjects. FIRST_TRANSACTION)).size();
            Assert.assertTrue( size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select statement download format \"([^\"]*)\"$")
    public void ca_user_select_statement_download_format_something(String downloadFormat) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select download button$")
    public void ca_user_select_download_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select share floating button$")
    public void ca_user_select_share_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a sharing option \"([^\"]*)\"$")
    public void ca_user_select_a_sharing_option_something(String sharingOption) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see share floating button$")
    public void ca_user_can_see_share_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see all the sharing options$")
    public void ca_user_can_see_all_the_sharing_options() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see shared successfully message$")
    public void ca_user_can_see_shared_successfully_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on transaction details page$")
    public void ca_user_is_on_transaction_details_page() {
        try {
            String transactionDetails = driver.findElement(By.id(AndroidObjects.PAY_BUTTON)).getText();
            Assert.assertEquals(transactionDetails, AndroidDataFactory.TRANSACTION_DETAILS);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select share button$")
    public void ca_user_select_share_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select start date \"([^\"]*)\"$")
    public void ca_user_select_start_date_something(String startedDate) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select apply filter button$")
    public void ca_user_select_apply_filter_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.APPLY_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


}
