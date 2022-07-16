package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;
import java.util.List;

public class WalletSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(WalletSteps.class);
    private Utils util = new Utils();
    private BasePageIOS pageIOS = new BasePageIOS();


    @And("^MI user select Pay$")
    public void userSelectPay() {
        try {
            util.secondsDelay(2);
            driver.findElementByAccessibilityId(IOSObjects.PAY).click();
            util.secondsDelay(2);
            pageIOS.acceptAlertRequest(driver);
        } catch (Exception ex) {
            logger.info("Failed to show Pay  : " + ex.getMessage());
        }
    }


    @When("^MI user enter name \"([^\"]*)\" as recipient name$")
    public void userEnterNameAsRecepientName(String name)  {
        try {
            util.secondsDelay(3);
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME_OR_PHONE_NUMBER).sendKeys(name);
            util.secondsDelay(2);
        } catch (Exception ex) {
            logger.info("Failed enter name : " + ex.getMessage());

        }
    }
    @When("^MI user enter phone number \"([^\"]*)\" as phone number$")
    public void userEnterPhoneNumberAsPhoneNumber(String phone_number)  {
        try {

            driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME_OR_PHONE_NUMBER).clear();
            util.secondsDelay(2);
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME_OR_PHONE_NUMBER).sendKeys(phone_number);
            util.secondsDelay(2);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info("Failed enter phone : " + ex.getMessage());
        }

    }

    @Then("^MI user can see user doesnt have a wallet label$")
    public void mi_user_can_see_user_doesnt_have_a_wallet_label()  {


        List<MobileElement> list = driver.findElementsByXPath("//*[contains(text(),'" + "does not have a wallet" + "')]");
        Assert.assertTrue("Text not found!", list.size() > 0);



    }

    @When("^MI user select recipient$")
    public void userSelectRecepient() {

        try {
            driver.findElementByXPath(IOSObjects.RECIPIENT).click();
            util.secondsDelay(2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }

    }


    @Then("^MI user is on request payment success page$")
    public void mi_user_is_on_request_payment_success_screen() {
        try
        {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.NON_WALLET_ICON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on payment page$")
    public void mi_user_is_on_payment_page() {
        try
        {
            util.secondsDelay(2);
        int size = driver.findElementsByAccessibilityId(IOSDataFactory.WALLET_PAYMENT_PAGE).size();
        Assert.assertEquals(1, size);
    } catch (Exception ex) {
        logger.info(ex.getStackTrace());
    }
    }

    @And("^MI user enter amount \"([^\"]*)\" as amount$")
    public void userEnterAmountAsAmount(String amount)  {
        try {
            util.secondsDelay(2);
            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(2).findElementByClassName("XCUIElementTypeTextField").setValue(amount);
            pageIOS.clickDoneOrReturnButtonToHideKeyBoard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }

    }

    @And("^MI user enter description \"([^\"]*)\" as description$")
    public void userEnterDescriptionAsDescription(String description)  {
        try {
            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(3).findElementByClassName("XCUIElementTypeTextField").setValue(description);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on instantly add money screen$")
    public void mi_user_is_on_instantly_add_money_screen() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.INSTANTLY_ADD_FUNDS_FROM).size();
            Assert.assertEquals(1,size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter MI user id \"([^\"]*)\" as MI user id$")
    public void mi_user_enter_mi_user_id_something_as_mi_user_id(String userid) {
        try {

            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(4).findElementByClassName("XCUIElementTypeTextField").setValue(userid);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user enter password \"([^\"]*)\" as password$")
    public void mi_user_enter_password_something_as_password(String password) {
        try {
            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(5).findElementByClassName("XCUIElementTypeSecureTextField").setValue(password);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }




    @When("^MI user enter pin \"([^\"]*)\"$")
    public void mi_user_enter_pin_something(String pin)  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see a confirmation screen with settlement details$")
    public void mi_user_can_see_a_confirmation_screen_with_settlement_details()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select account for payment$")
    public void mi_user_select_account_for_payment()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select view other sources$")
    public void mi_user_select_view_other_sources()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter Nedbank ID username \"([^\"]*)\"$")
    public void mi_user_enter_nedbank_id_username_something(String nedbankidusername)  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select settle now button$")
    public void mi_user_select_settle_now_button()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see verification page is displayed$")
    public void mi_user_can_see_verification_page_is_displayed()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select plus sign$")
    public void mi_user_select_plus_sign()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select to a nedbank account option$")
    public void mi_user_select_to_a_nedbank_account_option()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter Nedbank ID password \"([^\"]*)\"$")
    public void mi_user_enter_nedbank_id_password_something(String nedbankidpassword) {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select verify button$")
    public void mi_user_select_verify_button()  {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VERIFY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select add account$")
    public void mi_user_select_add_account()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select bank name$")
    public void mi_user_select_bank_name()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select other bank option$")
    public void mi_user_select_other_bank_option()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter account number \"([^\"]*)\" as account number$")
    public void mi_user_enter_account_number_something_as_account_number(String accountnumber)  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter account holder name \"([^\"]*)\" as account holder name$")
    public void mi_user_enter_account_holder_name_something_as_account_holder_name(String accountholdername)  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select account for payment type$")
    public void mi_user_select_account_for_payment_type()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter reference \"([^\"]*)\"$")
    public void mi_user_enter_reference_something(String reference)  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select save button$")
    public void mi_user_select_save_button()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select on my money$")
    public void mi_user_select_on_my_money()  {
        try {
            util.secondsDelay(2);
            driver.findElementByAccessibilityId(IOSObjects.MY_MONEY).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select top up$")
    public void mi_user_select_top_up()  {
        try {
            driver.findElementByAccessibilityId(IOSObjects.TOP_UP).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see wallet balance$")
    public void mi_user_can_see_wallet_balance()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see top up tab$")
    public void mi_user_is_able_to_see_top_up_tab()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.TOP_UP).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on authentication page$")
    public void mi_user_can_see_authentication_screen()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_AUTHENTICATION_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see a confirmation screen with top up details$")
    public void mi_user_can_see_a_confirmation_screen_with_top_up_details()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select add nedbank account option$")
    public void mi_user_select_add_nedbank_account_option() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select continue$")
    public void mi_user_select_continue() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select add account button$")
    public void mi_user_select_add_account_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ADD_ACCOUNT_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see add confirmation page$")
    public void mi_user_can_see_add_confirmation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select top up my wallet$")
    public void mi_user_select_top_up_my_wallet() {
        try {

            driver.findElementByAccessibilityId(IOSObjects.TOP_UP_MY_WALLET_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select account to pay from$")
    public void mi_user_select_account_to_pay_from() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select manage sources$")
    public void mi_user_select_manage_sources() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @And("^MI user select Add funds via ATM option$")
    public void mi_user_select_add_funds_via_atm_option() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ADD_CASH_VIA_NEDBANK).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select EFT from another bank account option$")
    public void mi_user_select_eft_from_another_bank_account_option() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.EFT_FROM_ANOTHER_BANK).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When ("^MI user select close button$")
    public void mi_user_select_close_button()  {

        try {
            util.secondsDelay(3);
            driver.findElementByAccessibilityId(IOSObjects.CLOSE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }

    }

    @When("^MI user select withdrawal$")
    public void mi_user_select_withdrawal()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select wallet accept tab$")
    public void mi_user_select_wallet_accept_tab()  {
        try {
            util.secondsDelay(5);
            driver.findElementByAccessibilityId(IOSObjects.ACCEPT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user is on my wallet page$")
    public void mi_user_is_on_my_wallet_page() {

        util.secondsDelay(2);
        int size= driver.findElementsByAccessibilityId(IOSDataFactory.MY_MONEY).size();
        Assert.assertEquals(1,size);
    }

    @When("^MI user enter payment amount \"([^\"]*)\" to request under display qr$")
    public void mi_user_enter_payment_amount_something_to_request_under_display_qr(String amount)  {
        try {
            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(2).findElementByClassName("XCUIElementTypeTextField").setValue(amount);
            pageIOS.clickDoneOrReturnButtonToHideKeyBoard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter payment amount \"([^\"]*)\" to request under request money$")
    public void mi_user_enter_payment_amount_something_to_request_under_request_money(String amount) {
        try {
            driver.findElementsByClassName("XCUIElementTypeTable").get(1).findElementByClassName("XCUIElementTypeCell").findElementByClassName("XCUIElementTypeTextField").setValue(amount);
            //driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user can see display qr button$")
    public void mi_user_can_see_display_qr_button()  {
        try {
            util.secondsDelay(2);
            driver.findElementByAccessibilityId(IOSObjects.DOWNLOAD_QR).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on accept money page$")
    public void mi_user_is_on_accept_money_page() {
        try {
            util.secondsDelay(5);
            int size = driver.findElementsByAccessibilityId(IOSObjects.REQUEST_MONEY).size();
            Assert.assertEquals(1, size);


        }
        catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on request payment page$")
    public void mi_user_is_on_request_payment_page() {
        try {
            util.secondsDelay(5);
            int size = driver.findElementsByAccessibilityId(IOSObjects.REQUEST_MONEY).size();
            Assert.assertEquals(1, size);
        }
        catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user can see download qr label$")
    public void mi_user_can_see_download_qr_label()  {
        try {
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.DOWNLOAD_QR_TEXT).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select download qr label$")
    public void mi_user_select_download_qr_label()  {
        try {
            driver.findElementByAccessibilityId(IOSObjects.DOWNLOAD_QR_BUTTON).click();
            driver.findElementByAccessibilityId(IOSObjects.COPY).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select generate qr code button$")
    public void mi_user_select_generate_qr_code_button()  {
        try {
            driver.findElementByAccessibilityId(IOSObjects.GENERATE_QR_CODE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^MI user select request money tab$")
    public void mi_user_select_request_money_tab() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.REQUEST_MONEY).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select create payment link label$")
    public void mi_user_select_create_payment_link_label() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PAYMENT_LINK).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on payment request page$")
    public void mi_user_is_on_payment_request_page() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.GENERATE_QR_CODE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on payment request from page$")
    public void mi_user_is_on_payment_request_from_page() {
        try {
            util.secondsDelay(5);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.SEARCH_BY_NAME_OR_PHONE_NUMBER).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^MI user select continue button for wallet request$")
    public void mi_user_select_continue_button_for_wallet_request() {

            try {
                driver.findElementByXPath(IOSObjects.CONTINUE_BUTTON_FOR_WALLET_REQUEST).click();
                util.secondsDelay(2);
                pageIOS.clickOkButtonToAccessContact();
            } catch (Exception ex) {
                logger.info(ex.getStackTrace());
            }
    }

    @Then("^MI user is on payment request confirmation page$")
    public void mi_user_is_on_payment_request_confirmation_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.REQUEST_PAYMENT_SUCCESS_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter recipient name \"([^\"]*)\"$")
    public void mi_user_enter_recipient_name_something(String recipient){
        try {
            driver.findElementsByClassName("XCUIElementTypeTable").get(1).findElementsByClassName("XCUIElementTypeCell").get(1).findElementByClassName("XCUIElementTypeTextField").setValue(recipient);
            //driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter payment request description \"([^\"]*)\"$")
    public void mi_user_enter_payment_request_description_something(String description){
        try {
            driver.findElementsByClassName("XCUIElementTypeTable").get(1).findElementsByClassName("XCUIElementTypeCell").get(2).findElementByClassName("XCUIElementTypeTextField").setValue(description);
            //driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select set reminder toggle$")
    public void mi_user_select_set_reminder_toggle() {
        try {

                driver.findElementsByClassName("XCUIElementTypeTable").get(1).findElementsByClassName("XCUIElementTypeCell").get(5).findElementByClassName("XCUIElementTypeSwitch").click();
                driver.findElementByAccessibilityId(IOSObjects.EVERY_ALTERNATE_DAY).click();

            util.secondsDelay(5);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user can see create payment link label$")
    public void mi_user_can_see_create_payment_link_label() {
        try{
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.CREATE_PAYMENT_LINK_TEXT).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user can see payment link generated label$")
    public void mi_user_can_see_payment_link_generated_label() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.PAYMENT_LINK_GENERATED_TEXT).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user can see share link button$")
    public void mi_user_can_see_share_link_button() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.SHARE_LINK_BUTTON).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter invoice \"([^\"]*)\"$")
    public void mi_user_enter_invoice_something(String invoiceno){
       try
       {
        driver.findElementsByClassName("XCUIElementTypeTable").get(1).findElementsByClassName("XCUIElementTypeCell").get(3).findElementByClassName("XCUIElementTypeTextField").setValue(invoiceno);
        driver.hideKeyboard();
        util.secondsDelay(5);
       } catch (Exception ex) {
        logger.info(ex.getStackTrace());
       }
    }

    @And("^MI user can see requested amount \"([^\"]*)\"$")
    public void mi_user_can_see_requested_amount_something(String amount)  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.REQUESTED_AMOUNT).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @Then("^MI user is able to see withdrawal tab$")
    public void mi_user_is_able_to_see_withdrawal_tab()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select ATM locator link$")
    public void mi_user_select_atm_locator_link()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see a confirmation screen with withdrawal details$")
    public void mi_user_can_see_a_confirmation_screen_with_withdrawal_details()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select withdrawal cash from a Nedbank ATM option$")
    public void mi_user_select_withdrawal_cash_from_a_nedbank_atm_option() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }

    }

    @When("^MI user select pay tab$")
    public void mi_user_select_pay_tab()  {
        try {
            util.secondsDelay(5);
            driver.findElementByAccessibilityId(IOSObjects.PAY).click();
            pageIOS.clickOkButtonToAccessContact();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on search recipient page$")
    public void mi_user_is_on_search_recipient_page()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see recipient with initials and images$")
    public void mi_user_can_see_recipient_with_initials_and_images()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select search icon$")
    public void mi_user_select_search_icon()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see phone with initials and images$")
    public void mi_user_can_see_phone_with_initials_and_images()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see wallet success message$")
    public void mi_user_can_see_wallet_success_message()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.WALLET_PAY_SUCCESS).size();
            Assert.assertEquals(1,size);

            util.secondsDelay(2);
            int size1 = driver.findElementsByAccessibilityId(IOSObjects.YOU_HAVE_JUST_SENT_TEXT).size();
            Assert.assertEquals(1,size1);

            util.secondsDelay(2);
            int size2 = driver.findElementsByAccessibilityId(IOSObjects.SHARE_PAYMENT_DETAILS).size();
            Assert.assertEquals(1,size2);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to share payments details$")
    public void mi_user_is_able_to_share_payments_details()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter description \"([^\"]*)\"$")
    public void mi_user_enter_description_something(String description)  {
        try {
            util.secondsDelay(2);
            driver.findElementByClassName("XCUIElementTypeTable").findElementsByClassName("XCUIElementTypeCell").get(3).findElementByClassName("XCUIElementTypeTextField").setValue(description);
            pageIOS.clickDoneOrReturnButtonToHideKeyBoard();
            util.secondsDelay(2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see no match is found$")
    public void mi_user_is_able_to_see_no_match_is_found()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see requests$")
    public void mi_user_is_able_to_see_requests()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to view request details about the payment$")
    public void mi_user_is_able_to_view_request_details_about_the_payment()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select on request$")
    public void mi_user_select_on_request()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select settlement$")
    public void mi_user_select_settlement() {
         try {
                //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter Nedbank id username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void mi_user_enter_nedbank_id_username_something_and_password_something(String nedbankidusername, String nedbankidpassword) {
         try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see settlement tab$")
    public void mi_user_is_able_to_see_settlement_tab()  {
         try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on settlement page$")
    public void mi_user_is_on_settlement_page()  {
         try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on nedbank login page$")
    public void mi_user_is_on_nedbank_login_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.NEDBANK_LOGIN_PAGE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on login page$")
    public void mi_user_is_on_login_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on add confirmation page$")
    public void mi_user_is_on_add_confirmation_page()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.CONFIRMATION_ADD_ACCOUNT_PAGE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see a confirmation page with top up details$")
    public void mi_user_can_see_a_confirmation_page_with_top_up_details()  {
        try {

            util.secondsDelay(2);
            int size1 = driver.findElementsByAccessibilityId(IOSDataFactory.TOP_UP_CONGRATULATIONS_MESSAGE).size();
            Assert.assertEquals(1,size1);

            int size2 = driver.findElementsByAccessibilityId(IOSDataFactory.MOBI_MONEY_WALLET_MESSAGE).size();
            Assert.assertEquals(1,size2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on add money page$")
    public void mi_user_is_on_add_money_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see all instructions$")
    public void mi_user_is_able_to_see_all_instructions() {
        try {
            util.secondsDelay(2);
            int size1 = driver.findElementsByAccessibilityId(IOSDataFactory.FOR_ADD_FUNDS_FOLLOW_THE_STEPS_TEXT).size();
            Assert.assertEquals(1,size1);

            int size2 = driver.findElementsByAccessibilityId(IOSDataFactory.AT_THE_ATM_TEXT).size();
            Assert.assertEquals(1,size2);

            int size3= driver.findElementsByAccessibilityId(IOSDataFactory.ENTER_YOUR_CELLPHONE_TEXT).size();
            Assert.assertEquals(1,size3);

            int size4 = driver.findElementsByAccessibilityId(IOSDataFactory.YOU_WILL_BE_PROMPTED_TEXT).size();
            Assert.assertEquals(1,size4);

            int size5 = driver.findElementsByAccessibilityId(IOSDataFactory.ONCE_DONE_TEXT).size();
            Assert.assertEquals(1,size5);

            int size6 = driver.findElementsByAccessibilityId(IOSDataFactory.USE_THE_ATM_LOCATOR_TEXT).size();
            Assert.assertEquals(1,size6);


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see name label$")
    public void mi_user_can_see_name_label()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.NAME).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see account number label$")
    public void mi_user_can_see_account_number_label()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.ACCOUNT_NUMBER).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see bank name label$")
    public void mi_user_can_see_bank_nxame_label()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.BANK_NAME).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see branch code label$")
    public void mi_user_can_see_branch_code_label()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.BRANCH_CODE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see reference label$")
    public void mi_user_can_see_reference_label()  {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSDataFactory.REFERENCE).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on withdrawal page$")
    public void mi_user_is_on_withdrawal_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see a confirmation page with withdrawal details$")
    public void mi_user_can_see_a_confirmation_page_with_withdrawal_details()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see map with ATMs page$")
    public void mi_user_can_see_map_with_atms_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter house number and complex name \"([^\"]*)\"$")
    public void mi_user_enter_house_number_and_complex_name_something(String housenumberandcomplexname) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select first answer \"([^\"]*)\"$")
    public void mi_user_select_first_answer_something(String firstanswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select second answer \"([^\"]*)\"$")
    public void mi_user_select_second_answer_something(String secondanswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select third answer \"([^\"]*)\"$")
    public void mi_user_select_third_answer_something(String thirdanswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select forth answer \"([^\"]*)\"$")
    public void mi_user_select_forth_answer_something(String fourthanswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select fifth answer \"([^\"]*)\"$")
    public void mi_user_select_fifth_answer_something(String fifthanswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select sixth answer \"([^\"]*)\"$")
    public void mi_user_select_sixth_answer_something(String sixthanswer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user can see start exploring button$")
    public void mi_user_can_see_start_exploring_button()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on address page$")
    public void mi_user_is_on_address_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the first risk profile question page$")
    public void mi_user_is_on_the_first_risk_profile_question_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the second risk profile question page$")
    public void mi_user_is_on_the_second_risk_profile_question_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the third risk profile question page$")
    public void mi_user_is_on_the_third_risk_profile_question_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the forth risk profile question page$")
    public void mi_user_is_on_the_forth_risk_profile_question_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the fifth risk profile question page$")
    public void mi_user_is_on_the_fifth_risk_profile_question_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the sixth risk profile question page$")
    public void mi_user_is_on_the_sixth_risk_profile_question_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on take id photo page$")
    public void mi_user_is_on_take_id_photo_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user take id photo using phone camera$")
    public void mi_user_take_id_photo_using_phone_camera()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on your wallet is unlimited now page$")
    public void mi_user_is_on_your_wallet_is_unlimited_now_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter street name \"([^\"]*)\"$")
    public void mi_user_enter_street_name_something(String streetname) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter suburb \"([^\"]*)\"$")
    public void mi_user_enter_suburb_something(String suburb) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter city \"([^\"]*)\"$")
    public void mi_user_enter_city_something(String city) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter postal code \"([^\"]*)\"$")
    public void mi_user_enter_postal_code_something(String postalcode) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user id uploaded page$")
    public void mi_user_id_uploaded_page()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



}
