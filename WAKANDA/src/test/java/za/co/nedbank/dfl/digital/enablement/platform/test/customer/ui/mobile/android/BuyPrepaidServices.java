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
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;


public class BuyPrepaidServices extends DriverFactory {

    private static Logger logger = Logger.getLogger(BuyProductSteps.class);
    private BasePageAndroid page = new BasePageAndroid();
    private Utils util = new Utils();

    @When("^CA user select prepaids menu$")
    public void ca_user_select_prepaids_menu() {
        try {
//            page.horizontalSlide();
//            page.horizontalSlide();
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.PRE_PAIDS_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select airtime and bundles button$")
    public void ca_user_select_airtime_and_bundles_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.PREPAIDS_DATA_AND_AIRTIME_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on prepaids page$")
    public void ca_user_is_on_pre_paid_pagee() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.PRE_PAIDS_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user search for and select contact \"([^\"]*)\"$")
    public void ca_user_search_for_and_select_contact_something(String contact) {
        try {
            MobileElement searchBar = driver.findElement(By.id("search_src_text"));
            searchBar.click();
            searchBar.setValue(contact);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select prepaid service provider \"([^\"]*)\"$")
    public void ca_user_select_prepaid_service_provider_something(String serviceProvider) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select prepaid topup option (.+)$")
    public void ca_user_select_prepaid_topup_option(String topUpOption) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select enter amount link$")
    public void ca_user_select_enter_amount_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter prepaid amount \"([^\"]*)\"$")
    public void ca_user_enter_prepaid_amount_something(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select purchase now button$")
    public void ca_user_select_purchase_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user is on select contact page$")
    public void ca_user_is_on_select_contact_page() {
        try {
            String phoneBookContact = driver.findElement(By.id(AndroidObjects.RECIPIENT_LABEL_TEXT)).getText();
            Assert.assertEquals("Phonebook Contacts", phoneBookContact);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see selected recipient$")
    public void ca_user_can_see_selected_recipient() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see selected prepaid service provider \"([^\"]*)\"$")
    public void ca_user_can_see_selected_prepaid_service_provider_something(String serviceProvider) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see selected prepaid topup option \"([^\"]*)\"$")
    public void ca_user_can_see_selected_prepaid_topup_option_something(String topUpOption) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see enter prepaid amount label$")
    public void ca_user_can_see_enter_prepaid_amount_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see purchase now button$")
    public void ca_user_can_see_purchase_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see recent transactions$")
    public void ca_user_can_see_recent_transactions() {
        try {
            String recent = driver.findElement(By.id(AndroidObjects.RECENT_TRANSACTION_LABEL_TEXT)).getText();
            Assert.assertEquals(recent, "Repeat recent");
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see prepaid service providers$")
    public void ca_user_can_see_prepaid_service_providers() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see available MobiMoney balance label$")
    public void ca_user_can_see_available_mobi_money_balance_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select electricity button$")
    public void ca_user_select_electricity_button() {
        try {
            page.horizontalSlide();
            page.horizontalSlide();
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.PREPAIDS_ELECTRICITY_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user is on select contacts button$")
    public void ca_user_is_on_select_contacts_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select save contact option \"([^\"]*)\"$")
    public void ca_user_select_save_contact_option_something(String option, String strArg1) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user enter prepaid electricity amount \"([^\"]*)\"$")
    public void ca_user_enter_prepaid_electricity_amount_something(String amount) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select buy button$")
    public void ca_user_select_buy_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on buy electricity page$")
    public void ca_user_is_on_buy_electricity_page() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.ELECTRICITY)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see recipient phone book contact list$")
    public void ca_user_can_see_recipient_search_results() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.PHONE_BOOK_CONTACTS )).size();
            Assert.assertEquals(1, size);

            int phoneBookSearch = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.PHONE_BOOK_SEARCH)).size();
            Assert.assertEquals(1, phoneBookSearch);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on buy prepaid electricity page$")
    public void ca_user_is_on_buy_prepaid_electricity_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on prepaid electricity payment success page$")
    public void ca_user_is_on_prepaid_electricity_payment_success_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter meter number \"([^\"]*)\"$")
    public void ca_user_enter_meter_number_something(String meterNumber) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter description \"([^\"]*)\"$")
    public void ca_user_enter_description_something(String description) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select send to recipient method \"([^\"]*)\"$")
    public void ca_user_select_send_to_recipient_method_something(String method) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can prepaid electricity reference number$")
    public void ca_user_can_prepaid_electricity_reference_number() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
