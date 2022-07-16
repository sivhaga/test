package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class BuyPrepaidServices extends DriverFactory {

    private static Logger logger = Logger.getLogger(BuyGroceriesSteps.class);
    private BasePageIOS page = new BasePageIOS();
    private Utils util = new Utils();

    @When("^CI user select prepaid menu$")
    public void ci_user_is_on_select_pre_paid_menu() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PRE_PAIDS_MENU));
            driver.findElementByAccessibilityId(IOSObjects.PRE_PAIDS_MENU).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select airtime and bundles button$")
    public void ci_user_select_airtime_and_bundles_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.AIRTIME_AND_DATA).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for and select airtime or data recipient \"([^\"]*)\"$")
    public void ci_user_search_for_and_select_contact_something(String contact) {
        try {
//            util.secondsDelay(5);
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.RECIPIENT_LABEL));
            MobileElement recipientName = driver.findElementByAccessibilityId(IOSObjects.RECIPIENT_NAME_DATA);
            recipientName.click();
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME_OR_NUMBER).click();
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME_OR_NUMBER).setValue(contact);
            driver.findElementByAccessibilityId(IOSObjects.SELECT_CONTACT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user search for and select electricity recipient \"([^\"]*)\"$")
    public void ci_user_search_for_and_select_electricity_something(String contact) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.RECIPIENT_NAME_ELECTRICITY));

            driver.findElementByAccessibilityId(IOSObjects.RECIPIENT_NAME_ELECTRICITY).click();
            MobileElement recipient = driver.findElementByAccessibilityId(IOSObjects.SEARCH_BY_NAME_OR_NUMBER);
            recipient.sendKeys(contact);
            driver.findElementByClassName(IOSObjects.CELLS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select pick a bundle dropdown list$")
    public void ci_user_select_pick_a_bundle_dropdown_list() {
        try {
             driver.findElementByXPath(IOSObjects.SELECT_A_BUNDLE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select a bundle \"([^\"]*)\" from the list$")
    public void ci_user_select_a_bundle_something_from_the_list(String bundle) {
        try {
            ((IOSDriver) driver).findElementByClassName(IOSObjects.PICKERWHEEL)
                    .sendKeys(bundle);
            driver.findElementByAccessibilityId(bundle).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on select contact page$")
    public void ci_user_is_on_select_contact_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select prepaid service provider \"([^\"]*)\"$")
    public void ci_user_select_prepaid_service_provider_something(String serviceProvider) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(serviceProvider));
            driver.findElementByAccessibilityId(serviceProvider).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select prepaid top up option \"([^\"]*)\"$")
    public void ci_user_select_prepaid_top_up_option(String topUpOption) {
        try {
            driver.findElementByAccessibilityId(topUpOption).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select enter amount link$")
    public void ci_user_select_enter_amount_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter prepaid amount \"([^\"]*)\"$")
    public void ci_user_enter_prepaid_amount_something(String amount) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PRE_PAID_AMOUNT).clear();
            driver.findElementByAccessibilityId(IOSObjects.PRE_PAID_AMOUNT).setValue(amount);
            page.clickDoneOrReturnButtonToHideKeyBoard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user enter prepaid description \"([^\"]*)\"$")
    public void ci_user_enter_prepaid_description(String description) {
        try {
            driver.findElementsByClassName(IOSObjects.TEXT_FIELDS).get(1).setValue(description);
            page.clickDoneOrReturnButtonToHideKeyBoard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select buy button$")
    public void ci_user_select_pay_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.BUY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on prepaid page$")
    public void ci_user_is_on_pre_paid_page() {
        try {
           validateWindow();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select electricity button$")
    public void ci_user_select_electricity_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ELECTRICITY).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select claim now button$")
    public void ci_user_select_claim_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter claim free electricity amount \"([^\"]*)\"$")
    public void ci_user_enter_claim_free_electricity_amount_something(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on buy electricity page$")
    public void ci_user_is_on_buy_electricity_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select contacts button$")
    public void ci_user_select_contacts_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select save contact option \"([^\"]*)\"$")
    public void ci_user_select_save_contact_option_something(String option) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter prepaid electricity amount \"([^\"]*)\"$")
    public void ci_user_enter_prepaid_electricity_amount_something(String amount) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ELECTRICITY_AMOUNT));

            MobileElement element = driver.findElementByAccessibilityId(IOSObjects.ELECTRICITY_AMOUNT);
            element.click();
            element.clear();
            element.setValue(amount);
            page.clickDoneOrReturnButtonToHideKeyBoard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select prepaid pay button$")
    public void ci_user_select_buy_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PAY_ELECTRICITY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select pay amount button$")
    public void ci_user_select_pay_amount_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PAY_AMOUNT_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select pay for data button$")
    public void ci_user_select_pay_for_data_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PAY_PREPAID_DATA_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user is on buy page$")
    public void ci_user_is_on_pre_paid_payment_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.BUY_BUTTON));
            int size = driver.findElementsByAccessibilityId(IOSObjects.BUY_BUTTON).size();
            Assert.assertEquals(2,size );
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on buy prepaid electricity page$")
    public void ci_user_is_on_buy_prepaid_electricity_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select great thanks button$")
    public void ci_user_select_great_thanks_button() {
        try {
             driver.findElementByAccessibilityId(IOSObjects.GREAT_THANKS_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
    @And("^CI user enter description \"([^\"]*)\"$")
    public void ci_user_enter_description_something(String description) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ELECTRICITY_DESCRIPTION));
            MobileElement element = driver.findElementByAccessibilityId(IOSObjects.ELECTRICITY_DESCRIPTION);
            element.click();
            element.clear();
            element.setValue(description);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select send to recipient method \"([^\"]*)\"$")
    public void ci_user_select_send_to_recipient_method_something(String method) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on claim free basic electricity page$")
    public void ci_user_is_on_claim_free_basic_electricity_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on claim free electricity page$")
    public void ci_user_is_on_claim_free_electricity_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on prepaid electricity payment success page$")
    public void ci_user_is_on_prepaid_electricity_payment_success_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.CONFIRM_PAGE).size();
            Assert.assertEquals(1, size);

            int size1 = driver.findElementsByAccessibilityId(IOSObjects.ELECTRICITY_PAYMENT_SUCCESSFUL).size();
            Assert.assertTrue(size1 > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see get personal loan tip$")
    public void ci_user_can_see_get_loan_tipe() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.GET_PERSONAL_LOAN));
            int size = driver.findElementsByAccessibilityId(IOSObjects.GET_PERSONAL_LOAN).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see use your waka points message$")
    public void ci_user_can_see_waka_points_message() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.USE_YOUR_POINTS));
            int size = driver.findElementsByAccessibilityId(IOSObjects.USE_YOUR_POINTS).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user enter meter number \"([^\"]*)\"$")
    public void ci_user_enter_meter_number_something(String meterNumber) {
        try {
            util.secondsDelay(8);
            MobileElement number = driver.findElementByAccessibilityId(IOSObjects.METER_NUMBER);
            number.click();
            number.clear();
            number.setValue(meterNumber);
            page.clickDoneOrReturnButtonToHideKeyBoard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user cab see reference number they are claiming for$")
    public void ci_user_cab_see_reference_number_they_are_claiming_for() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see claim now button$")
    public void ci_user_can_see_claim_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see meter number \"([^\"]*)\"r$")
    public void ci_user_can_prepaid_electricity_reference_number(String meterNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on airtime and data page$")
    public void ci_user_select_contact_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_AIRTIME_AND_DATA_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_AIRTIME_AND_DATA_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on electricity page$")
    public void ci_user_is_on_electricity_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_ELECTRICITY_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_ELECTRICITY_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see selected recipient \"([^\"]*)\"$")
    public void ci_user_can_see_selected_recipient(String recipient) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(recipient));
            int recipientLabel = driver.findElementsByAccessibilityId(recipient).size();
            Assert.assertEquals(1, recipientLabel);
            int size = driver.findElementsByAccessibilityId(recipient).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see authorize app to view contacts message$")
    public void ci_user_can_see_authorize_app_to_view() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.AUTHORIZE_CONTACTS));
            int size = driver.findElementsByAccessibilityId(IOSObjects.AUTHORIZE_CONTACTS).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see data and airtime top up options$")
    public void ci_user_can_see_data_and_airtime_option() {
        try {
            validateWindow();
            int topUp = driver.findElementsByAccessibilityId(IOSObjects.TOP_UP_LABEL).size();
            Assert.assertEquals(1, topUp);
            int chooseBundle = driver.findElementsByAccessibilityId(IOSObjects.CHOOSE_BUNDLE_LABEL).size();
            Assert.assertEquals(1, chooseBundle);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see selected prepaid topup option \"([^\"]*)\"$")
    public void ci_user_can_see_selected_prepaid_topup_option_something(String topUpOption) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see enter prepaid amount label$")
    public void ci_user_can_see_enter_prepaid_amount_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see buy button$")
    public void ci_user_can_see_purchase_now_button() {
        try {
            validateWindow();
            int size = driver.findElementsByAccessibilityId(IOSObjects.PAY_BUTTON).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see recent transactions$")
    public void ci_user_can_see_recent_transactions() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.REPEAT_RECENT_LABEL));
            int size = driver.findElementsByAccessibilityId(IOSObjects.REPEAT_RECENT_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see electricity recent transactions$")
    public void ci_user_can_see_recent_electricity_transactions() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ELECTRICITY_RECENT_LABEL));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ELECTRICITY_RECENT_LABEL).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
    @And("^CI user can see prepaid service providers$")
    public void ci_user_can_see_prepaid_service_providers() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see available MobiMoney balance label$")
    public void ci_user_can_see_available_mobi_money_balance_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
