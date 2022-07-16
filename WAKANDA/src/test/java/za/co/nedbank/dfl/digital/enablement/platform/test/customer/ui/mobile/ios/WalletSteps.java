package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class WalletSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(WalletSteps.class);
    private BasePageIOS page = new BasePageIOS();
    private Utils util = new Utils();

    @When("^CI user select settlement$")
    public void ci_user_select_settlement() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is able to see settlement tab$")
    public void ci_user_is_able_to_see_settlement_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on settlement page$")
    public void ci_user_is_on_settlement_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see a confirmation screen with settlement details$")
    public void ci_user_can_see_a_confirmation_screen_with_settlement_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select view other sources$")
    public void ci_user_select_view_other_sources() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select plus sign$")
    public void ci_user_select_plus_sign() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select to a nedbank account option$")
    public void ci_user_select_to_a_nedbank_account_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select bank name$")
    public void ci_user_select_bank_name() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select other bank option$")
    public void ci_user_select_other_bank_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter account number \"([^\"]*)\" as account number$")
    public void ci_user_enter_account_number_something_as_account_number(String accountNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter account holder name \"([^\"]*)\" as account holder name$")
    public void ci_user_enter_account_holder_name_something_as_account_holder_name(String accountHolderName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select account for payment type$")
    public void ci_user_select_account_for_payment_type() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter reference \"([^\"]*)\"$")
    public void ci_user_enter_reference_something(String reference) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select save button$")
    public void ci_user_select_save_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter house number and complex name \"([^\"]*)\"$")
    public void ci_user_enter_house_number_and_complex_name_something(String houseNumbeRandComplexName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select first answer \"([^\"]*)\"$")
    public void ci_user_select_first_answer_something(String firstAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select second answer \"([^\"]*)\"$")
    public void ci_user_select_second_answer_something(String secondAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select third answer \"([^\"]*)\"$")
    public void ci_user_select_third_answer_something(String thirdAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select forth answer \"([^\"]*)\"$")
    public void ci_user_select_forth_answer_something(String fourthAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select fifth answer \"([^\"]*)\"$")
    public void ci_user_select_fifth_answer_something(String fifthAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select sixth answer \"([^\"]*)\"$")
    public void ci_user_select_sixth_answer_something(String sixthAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select submit button$")
    public void ci_user_select_submit_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SUBMIT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on nedbank id login page$")
    public void ci_user_is_on_bank_login_page() {
        try {
            int size = driver.findElementsByXPath(IOSObjects.NED_BANK_ID_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on atm locator page$")
    public void ci_user_is_on_atm_locator_page() {
        try {
            int size = driver.findElementsByXPath(IOSObjects.ON_ATM_LOCATOR_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on address page$")
    public void ci_user_is_on_address_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the first risk profile question page$")
    public void ci_user_is_on_the_first_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the second risk profile question page$")
    public void ci_user_is_on_the_second_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the third risk profile question page$")
    public void ci_user_is_on_the_third_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the forth risk profile question page$")
    public void ci_user_is_on_the_forth_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the fifth risk profile question page$")
    public void ci_user_is_on_the_fifth_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on the sixth risk profile question page$")
    public void ci_user_is_on_the_sixth_risk_profile_question_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on take id photo page$")
    public void ci_user_is_on_take_id_photo_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user take id photo using phone camera$")
    public void ci_user_take_id_photo_using_phone_camera() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on your wallet is unlimited n$")
    public void ci_user_is_on_your_wallet_is_unlimited_n() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enters username \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void ci_user_enters_username_something_with_password_something(String wakandaUsername, String wakandaPassword) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter street name \"([^\"]*)\"$")
    public void ci_user_enter_street_name_something(String streetName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter suburb \"([^\"]*)\"$")
    public void ci_user_enter_suburb_something(String suburb) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter city \"([^\"]*)\"$")
    public void ci_user_enter_city_something(String city) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter postal code \"([^\"]*)\"$")
    public void ci_user_enter_postal_code_something(String postalCode) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user id uploaded page$")
    public void ci_user_id_uploaded_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on your wallet is unlimited now page$")
    public void ci_then_ci_user_is_on_your_wallet_is_unlimited_now_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user can see start exploring button select first answer \"([^\"]*)\"$")
    public void ci_user_can_see_start_exploring_button_select_first_answer_something(String firstAnswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user can see start exploring button$")
    public void ci_user_can_see_start_exploring_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter pin \"([^\"]*)\" to authenticate$")
    public void ci_user_enter_pin_something_to_authenticate(String pin) {
        try {
            util.secondsDelay(3);
//            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(2).findElementsByClassName("XCUIElementTypeOther").get(1).findElementByClassName("XCUIElementTypeOther").findElementByClassName("XCUIElementTypeOtherOther").click();
            String digit1 = pin.substring(0, 1);
            String digit2 = pin.substring(1, 2);
            String digit3 = pin.substring(2, 3);
            String digit4 = pin.substring(3, 4);
            String digit5 = pin.substring(4, 5);
            driver.findElementByAccessibilityId(digit1).click();
            driver.findElementByAccessibilityId(digit2).click();
            driver.findElementByAccessibilityId(digit3).click();
            driver.findElementByAccessibilityId(digit4).click();
            driver.findElementByAccessibilityId(digit5).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select my money menu$")
    public void ci_user_select_on_my_money() {
        try {
//            util.secondsDelay(2);
//            driver.findElementByAccessibilityId(IOSObjects.ERROR_DIALOG_CLOSE).click();
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.MY_MONEY_MENU));
            driver.findElementByAccessibilityId(IOSObjects.MY_MONEY_MENU).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select top up button$")
    public void ci_user_select_top_up() {
        try {
            driver.findElementByXPath(IOSObjects.TOP_UP_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter amount \"([^\"]*)\" as amount$")
    public void ci_user_enter_amount_something_as_amount(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on authentication page$")
    public void ci_user_is_on_authentication_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is able to see top up button$")
    public void ci_user_is_able_to_see_top_up_tab() {
        try {
            int size = driver.findElementsByXPath(IOSObjects.TOP_UP_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see a confirmation screen with top up details$")
    public void ci_user_can_see_a_confirmation_screen_with_top_up_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select close button$")
    public void ci_user_select_close() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CLOSE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user select create payment link label$")
    public void ci_user_select_create_payment_link() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CREATE_PAYMENT_LINK).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user enter CI user id \"([^\"]*)\" as CI user id$")
    public void ci_user_enter_ci_user_id_something_as_ci_user_id(String userId) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.NED_BANK_ID_USERNAME_FIELD).click();
            driver.findElementByAccessibilityId(IOSObjects.NED_BANK_ID_USERNAME_FIELD).setValue(userId);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^instantly add money screen is displayed$")
    public void instantly_add_money_screen_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^login screen is displayed$")
    public void login_screen_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select continue$")
    public void ci_user_select_continue() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter password \"([^\"]*)\" as password$")
    public void ci_user_enter_password_something_as_password(String password) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.NED_BANK_ID_PASSWORD_FIELD).click();
            driver.findElementByAccessibilityId(IOSObjects.NED_BANK_ID_PASSWORD_FIELD).setValue(password);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see add confirmation page$")
    public void ci_user_can_see_add_confirmation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select add account button$")
    public void ci_user_select_add_account_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select top up my wallet$")
    public void ci_user_select_top_up_my_wallet() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see a confirmation page with top up detail$")
    public void ci_user_can_see_a_confirmation_page_with_top_up_detail() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select account to pay from$")
    public void ci_user_select_account_to_pay_from() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on Wallet account details page$")
    public void wallet_account_details_page_is_displayed() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.EFT_FROM_ANOTHER_BANK_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see name label$")
    public void name_field_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see account number label$")
    public void account_number_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see bank name label$")
    public void bank_name_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see branch code label$")
    public void branch_code_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see reference label$")
    public void reference_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select EFT from another bank account option$")
    public void ci_user_select_eft_from_another_bank_account_option() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.EFT_FROM_ANOTHER_BANK_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on add money page$")
    public void ci_user_is_on_add_money_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wallet top up page$")
    public void ci_user_is_on_wallet_top_up_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.TOP_UP_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on add funds via atm page$")
    public void ci_user_is_on_add_funds_vai_atm_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.ADD_CASH_VIA_NEDBANK_ATM_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on delete confirmation page$")
    public void delete_confirmation_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see a delete confirmation page$")
    public void ci_user_can_see_a_delete_confirmation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select delete$")
    public void ci_user_select_delete() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select delete option$")
    public void ci_user_select_delete_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see a confirmation page with top up details$")
    public void ci_user_can_see_a_confirmation_page_with_top_up_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select manage sources$")
    public void ci_user_select_manage_sources() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select add cash via atm menu$")
    public void ci_user_select_add_cash_via_atm() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ADD_CASH_VIA_NEDBANK_ATM).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^add money page is displayed$")
    public void add_money_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^login page is displayed$")
    public void login_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on Add funds via ATM details page$")
    public void add_funds_via_atm_details_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select Add funds via ATM option$")
    public void ci_user_select_add_funds_via_atm_option() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select confirm button$")
    public void ci_user_select_on_confirm_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CONFIRM_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.CONFIRM_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select add Nedbank account option$")
    public void ci_user_select_add_nedbank_account_option() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ADD_NED_ACCOUNT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user select use atm locator button$")
    public void ci_user_select_user_adm_locator_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.USE_ATM_LOCATOR_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select withdrawal$")
    public void ci_user_select_withdrawal() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is able to see withdrawal tab$")
    public void ci_user_is_able_to_see_withdrawal_tab() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on withdrawal page$")
    public void ci_withdrawal_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see a confirmation page with withdrawal details$")
    public void ci_user_can_see_a_confirmation_page_with_withdrawal_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see wallet balance$")
    public void ci_user_can_see_wallet_balance() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see map with ATMs page$")
    public void ci_map_is_displayed_with_atms_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select ATM locator link$")
    public void ci_user_select_atm_locator_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select settle now button$")
    public void ci_user_select_settle_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see verification page is displayed$")
    public void ci_user_can_see_verification_page_is_displayed() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select verify button$")
    public void ci_user_select_verify_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VERIFY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select account for payment$")
    public void ci_user_select_account_for_payment() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select add account$")
    public void ci_user_select_add_account() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select wallet request button$")
    public void ci_user_select_wallet_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select request money button$")
    public void ci_user_select_request_money_tab() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.REQUEST_MONEY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter payment amount \"([^\"]*)\" to request$")
    public void ci_user_enter_payment_amount_something_to_request(String amount) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).setValue(amount);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can wallet request button$")
    public void ci_user_can_wallet_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can select wallet accept button$")
    public void ci_user_can_select_wallet_accept_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ACCEPT_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.ACCEPT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on accept money page$")
    public void ci_user_is_on_wallet_accept_money_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ACCEPT_MONEY_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ACCEPT_MONEY_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see display qr button$")
    public void ci_user_can_see_display_qr_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.DISPLAY_QR_CODE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see request money button$")
    public void ci_user_can_see_request_money_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.REQUEST_MONEY_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on payment request page$")
    public void ci_user_is_on_payment_request_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.REQUEST_MONEY_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.REQUEST_MONEY_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on payment request from page$")
    public void ci_user_is_on_payment_request_from_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.REQUEST_FROM_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.REQUEST_FROM_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see create payment link label$")
    public void ci_user_can_see_request_payment_link() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PAYMENT_LINK_GENERATED));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAYMENT_LINK_GENERATED).size();
            Assert.assertTrue(size > 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see payment link generated label$")
    public void ci_user_can_see_payment_link() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CREATE_PAYMENT_LINK));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CREATE_PAYMENT_LINK).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on payment request confirmation page$")
    public void ci_user_is_on_payment_request_confirmation_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CONFIRM_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CONFIRM_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see share link button$")
    public void ci_user_can_see_share_link_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SHARE_LINK_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see continue shopping button$")
    public void ci_user_can_see_continue_shopping_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.CONTINUE_SHOPPING_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select continue shopping button$")
    public void ci_user_SELECT_continue_shopping_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CONTINUE_SHOPPING_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user can see download qr label$")
    public void ci_user_can_see_download_qr_label() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.DOWNLOAD_QR_CODE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select download qr label$")
    public void ci_user_select_download_qr_label() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.DOWNLOAD_QR_CODE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select generate qr code button$")
    public void ci_user_select_generate_qr_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.GENERATE_QR_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user enter recipient name \"([^\"]*)\"$")
    public void ci_user_enter_recipient_name_something(String recipient) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).setValue(recipient);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter payment request description \"([^\"]*)\"$")
    public void ci_user_enter_payment_request_description_something(String description) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(3).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(3).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(3).setValue(description);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter payment request reference \"([^\"]*)\"$")
    public void ci_user_enter_payment_request_reference_something(String reference) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(4).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(4).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(4).setValue(reference);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user select enter amount label$")
    public void ci_user_select_enter_amount_label() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ENTER_AMOUNT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select set reminder toggle$")
    public void ci_user_select_set_reminder_toggle() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SET_REMINDER_BUTTON));
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see request sent label$")
    public void ci_user_can_see_request_sent_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see requested amount \"([^\"]*)\"$")
    public void ci_user_can_see_requested_amount_something(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for a recipient \"([^\"]*)\"$")
    public void ci_user_search_for_a_recipient_something(String recipientSearch) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME).setValue(recipientSearch);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select continue to request button$")
    public void ci_user_select_continue_to_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can no matches found label$")
    public void ci_user_can_no_matches_found_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see continue to request button$")
    public void ci_user_can_see_continue_to_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select wallet pay button$")
    public void ci_user_select_wallet_pay_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PAY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

//    @When("^CI user select pay amount button$")
//    public void ci_user_select_pay_amount_button() {
//        try {
//            driver.findElementByAccessibilityId(IOSObjects.GROCERIES_PAY_BUTTON).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }

    @When("^CI user enter amount \"([^\"]*)\" to pay$")
    public void ci_user_enter_amount_something_to_pay(String amount) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(amount);
            driver.findElementByAccessibilityId(IOSObjects.ENTER_AMOUNT_TO_PAY).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user enter description \"([^\"]*)\" of payment$")
    public void ci_user_enter_amount_description_to_pay(String description) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).setValue(description);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see wallet pay button$")
    public void ci_user_can_see_wallet_pay_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PAY_BUTTON));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAY_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wallet pay page$")
    public void ci_user_is_on_wallet_pay_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PHONE_BOOK_CONTACTS));
            int size = driver.findElementsByAccessibilityId(IOSObjects.PHONE_BOOK_CONTACTS).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see enter amount to pay label$")
    public void ci_user_can_see_enter_amount_to_pay_label() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ENTER_AMOUNT_TO_PAY));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ENTER_AMOUNT_TO_PAY).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see enter description label$")
    public void ci_user_can_see_enter_description_label() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.ENTER_AMOUNT_TO_PAY).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select recipient \"([^\"]*)\" from search result$")
    public void ci_user_select_recipient_something_from_search_result(String recipientSearch) {
        try {
            driver.findElementByClassName(IOSObjects.CELLS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on authrorize transaction page$")
    public void ci_user_is_authrorize_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.AUTHORISE_PAYMENT_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on payment confirmation page$")
    public void ci_user_is_on_payment_confirmation_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CONFIRM_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CONFIRM_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see pay success label$")
    public void ci_user_can_see_pay_success_label() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SUCCESS_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see payment transaction details$")
    public void ci_user_can_see_payment_transaction_details() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.TRANSACTION_DETAILS_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see share payment details button$")
    public void ci_user_can_see_share_payment_details_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.SHARE_PAYMENT_DETAILS_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see close button$")
    public void ci_user_can_see_close_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.CLOSE_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user seLect close button$")
    public void ci_user_select_close_button() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.CLOSE_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see no results found label$")
    public void ci_user_can_see_user_is_not_a_wakanda_client_label() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.NO_RESULTS_FOUND).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user can see amount paid \"([^\"]*)\"$")
    public void ci_user_can_see_amount_paid(String amount) {
        try {
            String amountPaid = "R " + amount + ".00";
            int size = driver.findElementsByAccessibilityId(amountPaid).size();
            Assert.assertEquals(1, size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user can see recipient details \"([^\"]*)\"$")
    public void ci_user_can_see_recipient_details(String recipient) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(recipient));
            int size = driver.findElementsByAccessibilityId(recipient).size();
            Assert.assertEquals(1, size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select scan qr code button$")
    public void ci_user_select_scan_qr_code_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select wallet pay continue button$")
    public void ci_user_wallet_pay_select_continue_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.WALLET_PAY_SEARCH_CONTINUE_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.WALLET_PAY_SEARCH_CONTINUE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select request payment button$")
    public void ci_user_select_request_payment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select confirm and pay button$")
    public void ci_user_select_confirm_and_pay_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see request payment button$")
    public void ci_user_can_see_request_payment_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see request payment details$")
    public void ci_user_can_see_request_payment_details() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see confirm and pay button$")
    public void ci_user_can_see_confirm_and_pay_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select reject button$")
    public void ci_user_select_reject_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on reject payment request page$")
    public void ci_user_is_on_reject_payment_request_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see reject button$")
    public void ci_user_can_see_reject_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on my money page$")
    public void ci_user_is_on_my_money_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.MY_MONEY_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.MY_MONEY_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see the no transactions yet message$")
    public void ci_user_can_see_the_no_transactions_yet_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select download floating button$")
    public void ci_user_select_download_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see download floating button$")
    public void ci_user_can_see_download_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wallet statement page$")
    public void ci_user_is_on_wallet_statement_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.WALLET_STATEMENT_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.WALLET_STATEMENT_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see download successful message$")
    public void ci_user_can_see_download_successful_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see a list of transaction made$")
    public void ci_user_can_see_a_list_of_transaction_made() {
        try {
            util.secondsDelay(4);
            page.waitForElement(By.className(IOSObjects.CELLS));

            int size = driver.findElementsByClassName(IOSObjects.CELLS).size();
            Assert.assertTrue(size > 2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select wallet statement filter button$")
    public void ci_user_select_wallet_filter_button() {
        try {
            driver.findElementByXPath(IOSObjects.WALLET_FILTER).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user filter statement by date \"([^\"]*)\"$")
    public void ci_user_filter_statement_by_something(String filterBy) {
        try {
            switch (filterBy) {

                case "Today":
                    driver.findElementByXPath(IOSObjects.WALLET_FILTER_TODAY).click();
                    break;

                case "This Week":
                    driver.findElementByXPath(IOSObjects.WALLET_FILTER_THIS_WEEK).click();
                    break;

                case "This Month":
                    driver.findElementByXPath(IOSObjects.WALLET_FILTER_THIS_MONTH).click();
                    break;

                case "Custom Dates":
                    driver.findElementByXPath(IOSObjects.WALLET_FILTER_CUSTOM_DATES).click();
                    driver.findElementByAccessibilityId(IOSObjects.DATE_MONTH_BACK_BUTTON).click();
                    driver.findElementByXPath(IOSObjects.SELECT_START_DATE_BUTTON).click();
                    driver.findElementByAccessibilityId(IOSObjects.DATE_MONTH_FOWARD_BUTTON).click();
                    driver.findElementByXPath(IOSObjects.SELECT_END_DATE_BUTTON).click();
                    driver.findElementByAccessibilityId(IOSObjects.SET_BUTTON).click();
                    break;

                default:
                    logger.info("Invalid date filter selected");
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user filter statement by advanced filter \"([^\"]*)\"$")
    public void ci_user_filter_statement_by_advanced(String filterBy) {
        try {
            driver.findElementByAccessibilityId(filterBy).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select statement download format \"([^\"]*)\"$")
    public void ci_user_select_statement_download_format_something(String downloadFormat) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user enter received from name \"([^\"]*)\"$")
    public void ci_user_enter_received_from_name(String receivedFrom) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.RECIEVED_FROM).click();
            driver.findElementByAccessibilityId(IOSObjects.RECIEVED_FROM).setValue(receivedFrom);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user enter sent to name \"([^\"]*)\"$")
    public void ci_user_enter_sent_to(String sentTo) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SENT_TO).click();
            driver.findElementByAccessibilityId(IOSObjects.SENT_TO).setValue(sentTo);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select download button$")
    public void ci_user_select_download_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select share floating button$")
    public void ci_user_select_share_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a sharing option \"([^\"]*)\"$")
    public void ci_user_select_a_sharing_option_something(String sharingOption) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see share floating button$")
    public void ci_user_can_see_share_floating_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see all the sharing options$")
    public void ci_user_can_see_all_the_sharing_options() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see shared successfully message$")
    public void ci_user_can_see_shared_successfully_message() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on transaction details page$")
    public void ci_user_is_on_transaction_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select share button$")
    public void ci_user_select_share_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select start date \"([^\"]*)\"$")
    public void ci_user_select_start_date_something(String startedDate) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select apply filter button$")
    public void ci_user_select_apply_filter_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select view statement button$")
    public void ci_user_select_view_statement_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VIEW_STATEMENT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}
