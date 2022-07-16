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
//import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
//import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;
//
//public class WalletSteps extends DriverFactory {
//
//    private static Logger logger = Logger.getLogger(WalletSteps.class);
//    BasePageAndroid page = new BasePageAndroid();
//    Utils util = new Utils();
//
//
//    @When("^MA user select top up$")
//    public void ma_user_select_top_up()  {
//        try {
//            util.secondsDelay(2);
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.TOPUP_TAB)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter amount \"([^\"]*)\" as amount$")
//    public void ma_user_enter_amount_something_as_amount(String amount)  {
//        try {
//            MobileElement element = driver.findElement(By.id("pay_value")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(amount);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see wallet balance$")
//    public void ma_user_can_see_wallet_balance()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see top up tab$")
//    public void ma_user_is_able_to_see_top_up_tab()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^add money screen is displayed$")
//    public void add_money_screen_is_displayed()  {
//        try {
//            String titlePage = driver.findElement(By.id(AndroidObjects.ADD_TITLE)).getText();
//            Assert.assertEquals(titlePage, AndroidDataFactory.ADD_MONEY);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see a confirmation screen with top up details$")
//    public void ma_user_can_see_a_confirmation_screen_with_top_up_details()  {
//        try {
//            String congratulations = driver.findElement(By.id(AndroidObjects.TOP_UP_CONGRATULATIONS)).getText();
//            Assert.assertTrue(congratulations.contains(AndroidDataFactory.TOP_UP_CONGRATULATIONS));
//
//            String congratulationsMessage = driver.findElement(By.id(AndroidObjects.TOP_UP_CONGRATULATIONS_MESSAGE)).getText();
//            Assert.assertTrue(congratulationsMessage.contains(AndroidDataFactory.TOP_UP_CONGRATULATIONS_MESSAGE));
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on instantly add money screen$")
//    public void ma_user_is_on_instantly_add_money_screen() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select add nedbank account option$")
//    public void ma_user_select_add_nedbank_account_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select continue$")
//    public void ma_user_select_continue() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select add account button$")
//    public void ma_user_select_add_account_button() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select top up my wallet$")
//    public void ma_user_select_top_up_my_wallet() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select account to pay from$")
//    public void ma_user_select_account_to_pay_from() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select manage sources$")
//    public void ma_user_select_manage_sources() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^Add funds via ATM details screen is displayed$")
//    public void add_funds_via_atm_details_screen_is_displayed() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see all instructions$")
//    public void ma_user_is_able_to_see_all_instructions() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user select Add funds via ATM option$")
//    public void ma_user_select_add_funds_via_atm_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select EFT from another bank account option$")
//    public void ma_user_select_eft_from_another_bank_account_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select close button$")
//    public void ma_user_select_close_button()  {
//
//        try {
//            driver.findElement(By.id(AndroidObjects.CLOSE_BUTTON)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//
//    }
//
//    @When("^MA user select withdrawal$")
//    public void ma_user_select_withdrawal()  {
//        try {
//            util.secondsDelay(2);
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.WITHDRAW_TAB)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user is able to see withdrawal tab$")
//    public void ma_user_is_able_to_see_withdrawal_tab()  {
//        try {
//            String titlePage = driver.findElement(By.id(AndroidObjects.WITHDRAWAL)).getText();
//            Assert.assertEquals(titlePage, AndroidDataFactory.WITHDRAWAL);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^withdrawal screen is displayed$")
//    public void withdrawal_screen_is_displayed()  {
//        try {
//            String titlePage = driver.findElement(By.id(AndroidObjects.WITHDRAWAL_TITLE)).getText();
//            Assert.assertEquals(titlePage, AndroidDataFactory.WITHDRAWAL);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^Map is displayed with ATMs$")
//    public void map_is_displayed_with_atms()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select ATM locator link$")
//    public void ma_user_select_atm_locator_link()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see a confirmation screen with withdrawal details$")
//    public void ma_user_can_see_a_confirmation_screen_with_withdrawal_details()  {
//        try {
//            String congratulations = driver.findElement(By.id(AndroidObjects.WITHDRAWAL_SUCCESS_MESSAGE)).getText();
//            Assert.assertTrue(congratulations.contains(AndroidDataFactory.WITHDRAWAL_SUCCESS_MESSAGE));
//
//            String congratulationsMessage = driver.findElement(By.id(AndroidObjects.WITHDRAWAL_EXTRA_MESSAGE)).getText();
//            Assert.assertTrue(congratulationsMessage.contains(AndroidDataFactory.WITHDRAWAL_EXTRA_MESSAGE));
//
//            String secretGeneratedCode = driver.findElement(By.id(AndroidObjects.SECRET_ATM_CODE)).getText();
//
//            //Check if element is not empty
//            Assert.assertEquals(false, secretGeneratedCode.isEmpty());
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select withdrawal cash from a Nedbank ATM option$")
//    public void ma_user_select_withdrawal_cash_from_a_nedbank_atm_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//
//    }
//
//    @Then("^MA user can see a confirmation screen with settlement details$")
//    public void ma_user_can_see_a_confirmation_screen_with_settlement_details()  {
//        try {
//            String congratulations = driver.findElement(By.id(AndroidObjects.SETTLEMENT_SUCCESS_MESSAGE)).getText();
//            Assert.assertTrue(congratulations.contains(AndroidDataFactory.SETTLEMENT_SUCCESS_MESSAGE));
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select account for payment$")
//    public void ma_user_select_account_for_payment()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select view other sources$")
//    public void ma_user_select_view_other_sources()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter Nedbank ID username \"([^\"]*)\"$")
//    public void ma_user_enter_nedbank_id_username_something(String nedbankidusername)  {
//        try {
//             /*MobileElement element = driver.findElement(By.id("??")).findElements(By.className("??")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(nedbankidusername);
//            driver.hideKeyboard();*/
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select settle now button$")
//    public void ma_user_select_settle_now_button()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see verification page is displayed$")
//    public void ma_user_can_see_verification_page_is_displayed()  {
//        try {
//            String congratulations = driver.findElement(By.id(AndroidObjects.ADDING_ACCOUNT_VERIFICATION)).getText();
//            Assert.assertTrue(congratulations.contains(AndroidDataFactory.ADDING_ACCOUNT_VERIFICATION));
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select plus sign$")
//    public void ma_user_select_plus_sign()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select to a nedbank account option$")
//    public void ma_user_select_to_a_nedbank_account_option()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter Nedbank ID password \"([^\"]*)\"$")
//    public void ma_user_enter_nedbank_id_password_something(String nedbankidpassword) {
//        try {
//            /*MobileElement element = driver.findElement(By.id("??")).findElements(By.className("??")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(nedbankidpassword);
//            driver.hideKeyboard();*/
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select verify button$")
//    public void ma_user_select_verify_button()  {
//        try {
//            driver.findElement(By.id(AndroidObjects.VERIFY_BUTTON)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select add account$")
//    public void ma_user_select_add_account()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select bank name$")
//    public void ma_user_select_bank_name()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select other bank option$")
//    public void ma_user_select_other_bank_option()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter account number \"([^\"]*)\" as account number$")
//    public void ma_user_enter_account_number_something_as_account_number(String accountnumber)  {
//        try {
//             /*MobileElement element = driver.findElement(By.id("??")).findElements(By.className("??")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(accountnumber);
//            driver.hideKeyboard();*/
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter account holder name \"([^\"]*)\" as account holder name$")
//    public void ma_user_enter_account_holder_name_something_as_account_holder_name(String accountholdername)  {
//        try {
//             /*MobileElement element = driver.findElement(By.id("??")).findElements(By.className("??")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(accountholdername);
//            driver.hideKeyboard();*/
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select account for payment type$")
//    public void ma_user_select_account_for_payment_type()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter reference \"([^\"]*)\"$")
//    public void ma_user_enter_reference_something(String reference)  {
//        try {
//             /*MobileElement element = driver.findElement(By.id("??")).findElements(By.className("??")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(reference);
//            driver.hideKeyboard();*/
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select save button$")
//    public void ma_user_select_save_button()  {
//        try {
//            //driver.findElement(By.id(AndroidObjects.??)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select on my money$")
//    public void ma_user_select_on_my_money()  {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.MY_MONEY)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select pay tab$")
//    public void ma_user_select_pay_tab()  {
//        try {
//            util.secondsDelay(2);
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.PAY_TAB)).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select search icon$")
//    public void ma_user_select_search_icon(){
//        driver.findElement(By.id("search_button")).findElements(By.className(AndroidObjects.IMAGE_VIEW)).get(0).click();
//    }
//
//    @And("^MA user enter name \"([^\"]*)\" as recipient name$")
//    public void ma_user_enter_name_something_as_recipient_name(String name)  {
//        try {
//            MobileElement element = driver.findElement(By.id("search_src_text")).findElements(By.className(AndroidObjects.EDIT_TEXT_VIEWS)).get(0);
//            element.sendKeys("");
//            element.setValue(name);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see phone with initials and images$")
//    public void ma_user_can_see_phone_with_initials_and_images()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter phone number \"([^\"]*)\" as phone number$")
//    public void ma_user_enter_phone_number_something_as_phone_number(String phonenumber)  {
//        try {
//            driver.findElement(By.id("search_close_btn")).findElements(By.className(AndroidObjects.IMAGE_VIEW)).get(0).click();
//            MobileElement element = driver.findElement(By.id("search_src_text")).findElements(By.className(AndroidObjects.EDIT_TEXT_VIEWS)).get(0);
//            element.sendKeys("");
//            element.setValue(phonenumber);
//            driver.hideKeyboard();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select recipient$")
//    public void ma_user_select_recipient()  {
//        try {
//            driver.findElement(By.id("photo_content")).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on search recipient page$")
//    public void ma_user_is_on_search_recipient_page()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see recipient name with initials and images$")
//    public void ma_user_can_see_recipient_name_with_initials_and_images() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see no match is found$")
//    public void ma_user_is_able_to_see_no_match_is_found()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see requests$")
//    public void ma_user_is_able_to_see_requests() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to view request details about the payment$")
//    public void ma_user_is_able_to_view_request_details_about_the_payment()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select on request$")
//    public void ma_user_select_on_request(){
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user clicks on request$")
//    public void ma_user_clicks_on_request()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see doesn’t have wakanda Wallet text$")
//    public void ma_user_can_see_doesnt_have_wakanda_wallet_text() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see recipient with initials and images$")
//    public void ma_user_can_see_recipient_with_initials_and_images()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see success message$")
//    public void ma_user_can_see_success_message()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to share payments details$")
//    public void ma_user_is_able_to_share_payments_details()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter description \"([^\"]*)\"$")
//    public void ma_user_enter_description(String description)  {
//        try {
//            MobileElement element = driver.findElement(By.id("description")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(description);
//            driver.hideKeyboard();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select settlement$")
//    public void ma_user_select_settlement()  {
//        try {
//            util.secondsDelay(2);
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.SETTLEMENT_TAB)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter Nedbank id username \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void ma_user_enter_nedbank_id_username_something_and_password_something(String nedbankidusername, String nedbankidpassword){
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see settlement tab$")
//    public void ma_user_is_able_to_see_settlement_tab()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on settlement page$")
//    public void ma_user_is_on_settlement_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on nedbank login page$")
//    public void ma_user_is_on_nedbank_login_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on withdrawal page$")
//    public void ma_user_is_on_withdrawal_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see a confirmation page with withdrawal details$")
//    public void ma_user_can_see_a_confirmation_page_with_withdrawal_details()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see map with ATMs page$")
//    public void ma_user_can_see_map_with_atms_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter trading name \"([^\"]*)\"$")
//    public void ma_user_enter_trading_name_something(String tradingname){
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter house number and complex name \"([^\"]*)\"$")
//    public void ma_user_enter_house_number_and_complex_name_something(String housenumberandcomplexname) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select first answer \"([^\"]*)\"$")
//    public void ma_user_select_first_answer_something(String firstanswer) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select second answer \"([^\"]*)\"$")
//    public void ma_user_select_second_answer_something(String secondanswer) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select third answer \"([^\"]*)\"$")
//    public void ma_user_select_third_answer_something(String thirdanswer) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select forth answer \"([^\"]*)\"$")
//    public void ma_user_select_forth_answer_something(String fourthanswer) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select fifth answer \"([^\"]*)\"$")
//    public void ma_user_select_fifth_answer_something(String fifthanswer) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select sixth answer \"([^\"]*)\"$")
//    public void ma_user_select_sixth_answer_something(String sixthanswer) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user can see start exploring button$")
//    public void ma_user_can_see_start_exploring_button()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on address page$")
//    public void ma_user_is_on_address_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the first risk profile question page$")
//    public void ma_user_is_on_the_first_risk_profile_question_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the second risk profile question page$")
//    public void ma_user_is_on_the_second_risk_profile_question_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the third risk profile question page$")
//    public void ma_user_is_on_the_third_risk_profile_question_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the forth risk profile question page$")
//    public void ma_user_is_on_the_forth_risk_profile_question_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the fifth risk profile question page$")
//    public void ma_user_is_on_the_fifth_risk_profile_question_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the sixth risk profile question page$")
//    public void ma_user_is_on_the_sixth_risk_profile_question_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on take id photo page$")
//    public void ma_user_is_on_take_id_photo_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user take id photo using phone camera$")
//    public void ma_user_take_id_photo_using_phone_camera()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on your wallet is unlimited now page$")
//    public void ma_user_is_on_your_wallet_is_unlimited_now_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter street name \"([^\"]*)\"$")
//    public void ma_user_enter_street_name_something(String streetname) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter suburb \"([^\"]*)\"$")
//    public void ma_user_enter_suburb_something(String suburb) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter city \"([^\"]*)\"$")
//    public void ma_user_enter_city_something(String city) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter postal code \"([^\"]*)\"$")
//    public void ma_user_enter_postal_code_something(String postalcode) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user id uploaded page$")
//    public void ma_user_id_uploaded_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//
//}