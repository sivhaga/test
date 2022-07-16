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

public class OrderAServiceSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(OrderAServiceSteps.class);
    BasePageIOS page = new BasePageIOS();
    Utils util = new Utils();

    @When("^CI user select categories menu$")
    public void ci_user_select_categories_menu() {
        try {
             driver.findElementByAccessibilityId(IOSObjects.CATEGORIES).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see categories menu$")
    public void ci_user_can_see_categories_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.CATEGORIES).size();
            Assert.assertEquals(2,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select services menu$")
    public void ci_user_select_services_menu() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CATEGORIES_SERVICES));
            driver.findElementByAccessibilityId(IOSObjects.CATEGORIES_SERVICES).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a trending service category \"([^\"]*)\"$")
    public void ci_user_select_a_trending_service_category_something(String trendingServiceCategory) {
        try {
             driver.findElementByAccessibilityId(trendingServiceCategory).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on categories page$")
    public void ci_user_is_on_categories_page() {
        try {
          int size =  driver.findElementsByAccessibilityId(IOSObjects.CATEGORIES).size();
          Assert.assertEquals(4,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user is on service category \"([^\"]*)\" job page$")
    public void ci_user_is_on_service_category_something_job_page(String trendingServiceCategory1) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see trending service categories$")
    public void ci_user_can_see_trending_service_categories() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.MOST_SEARCHED).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a sponsored offer \"([^\"]*)\"$")
    public void ci_user_select_a_sponsored_offer_something(String sponsoredOffer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select start a job button$")
    public void ci_user_select_start_a_job_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user on sponsored offer \"([^\"]*)\" details page$")
    public void ci_user_on_sponsored_offer_something_details_page(String sponsoredOffer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see offer detail page$")
    public void ci_user_can_see_offer_detail_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see sponsored offers$")
    public void ci_user_can_see_sponsored_offers() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see start a job button$")
    public void ci_user_can_see_start_a_job_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see send job request button$")
    public void ci_user_can_see_send_job_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select send job request button$")
    public void ci_user_select_send_job_request_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ADD_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user update job name \"([^\"]*)\"$")
    public void ci_user_update_job_name_something(String jobName) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.JOB_NAME_FIELD).click();

            int text = driver.findElementByAccessibilityId(IOSObjects.JOB_NAME_FIELD).getText().length();

            while (text > 0) {
                driver.findElementByAccessibilityId(IOSObjects.JOB_NAME_FIELD).clear();
                text--;
            }
            driver.findElementByAccessibilityId(IOSObjects.JOB_NAME_FIELD).setValue(jobName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user update job description \"([^\"]*)\"$")
    public void ci_user_update_job_description_something(String jobDescription) {
        try {
            driver.findElementByClassName(IOSObjects.TEXT_VIEW_AREA).clear();

            driver.findElementByClassName(IOSObjects.TEXT_VIEW_AREA).setValue(jobDescription);
            util.secondsDelay(1);

            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select set a location button$")
    public void ci_user_select_set_a_location() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SET_LOCATION_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user add job photos from the gallery$")
    public void ci_user_add_job_photos_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.PLUS_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.PLUS_BUTTON).click();
            driver.findElementByAccessibilityId(IOSObjects.CHOOSE_FROM_GALLERY).click();
            driver.findElementByAccessibilityId(IOSObjects.MOMENTS_LABEL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for and select address \"([^\"]*)\"$")
    public void ci_user_search_for_and_select_address_something(String address) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_LOCATION).click();
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_LOCATION).setValue(address);
            driver.findElementByAccessibilityId(IOSObjects.KEYBOARD_SEARCH_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select save location button$")
    public void ci_user_select_save_location_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SAVE_LOCATION_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.SAVE_LOCATION_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select confirm and request service button$")
    public void ci_user_select_confirm_and_request_service_button() {
        try {
            page.scrollPage("down");
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CONFIRM_AND_REQUEST_SERVICE_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.CONFIRM_AND_REQUEST_SERVICE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on create job page$")
    public void ci_user_is_on_create_job_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CREATE_A_JOB_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CREATE_A_JOB_PAGE).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on set a location page$")
    public void ci_user_is_on_location_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SET_A_LOCATION_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SET_A_LOCATION_HEADER).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on address details page$")
    public void ci_user_is_on_address_detials_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.SET_NEW_LOCATION_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.SET_NEW_LOCATION_HEADER).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see photos are added$")
    public void ci_user_can_see_photos_are_added() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user select address from the list$")
    public void ci_user_select_address_from_the_list() {
        try {
            page.waitForElement(By.className(IOSObjects.CELLS));
            driver.findElementsByClassName(IOSObjects.CELLS).get(1).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see we are matching you with service provider page$")
    public void ci_user_can_see_we_are_matching_you_with_service_provider_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_HANG_IN_THERE_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_HANG_IN_THERE_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user update job urgency \"([^\"]*)\" option$")
    public void ci_user_update_job_urgency_something_option(String jobUrgency) {
        try {
            if (jobUrgency.equalsIgnoreCase("Yes")) {
                driver.findElementByAccessibilityId(IOSObjects.JOB_URGENCY_TOGGLE).click();
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see confirm and request service button$")
    public void ci_user_can_see_confirm_and_request_service_button() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CONFIRM_AND_REQUEST_SERVICE_BUTTON));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CONFIRM_AND_REQUEST_SERVICE_BUTTON).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select one of the interested merchants \"([^\"]*)\"$")
    public void ci_user_select_one_of_the_interested_merchants_something(String interestedMerchant) {
        try {
            page.scrollPage("down");
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.BUTTONS));
            driver.findElementsByClassName(IOSObjects.BUTTONS).get(7).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select assign to job button$")
    public void ci_user_select_assign_to_job_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ASSIGN_TO_JOB_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select yes go ahead button$")
    public void ci_user_select_yes_go_ahead_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.GENERAL_CONFIRM).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on interested merchant \"([^\"]*)\" details page$")
    public void ci_user_is_on_interested_merchant_something_details_page(String interestedMerchant) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(interestedMerchant));
            int size = driver.findElementsByAccessibilityId(interestedMerchant).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see job confirmation dialog$")
    public void ci_user_can_see_job_confirmation_dialog() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.CONFIRMED_HEADER));
            int size = driver.findElementsByAccessibilityId(IOSObjects.CONFIRMED_HEADER).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on service details page$")
    public void ci_user_is_on_service_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see list of interested merchants$")
    public void ci_user_can_see_list_of_interested_merchants() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.INTERESTED_MERCHANTS_LABEL));
            int size = driver.findElementsByAccessibilityId(IOSObjects.INTERESTED_MERCHANTS_LABEL).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see your job card will be shared with this service provider$")
    public void ci_user_can_see_your_job_card_will_be_shared_with_this_service_provider() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select chat icon$")
    public void ci_user_select_chat_icon() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select send chat message button$")
    public void ci_user_select_send_chat_message_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on service chat page$")
    public void ci_user_is_on_service_chat_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can type a chat message \"([^\"]*)\"$")
    public void ci_user_can_type_a_chat_message_something(String chatMessage) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user chat message \"([^\"]*)\"is sent$")
    public void ci_user_chat_message_something_is_sent(String chatMessage) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see will you like to work with service provider text$")
    public void ci_user_can_see_will_you_like_to_work_with_service_provider_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see assign to job link$")
    public void ci_user_can_see_assign_to_job_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select reserve now button$")
    public void ci_user_select_reserve_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see the reserved in wallet text$")
    public void ci_user_can_see_the_reserved_in_wallet_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see reservation request card$")
    public void ci_user_can_see_reservation_request_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select reserve funds button$")
    public void ci_user_select_reserve_funds_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user authenticate payment reservation transaction$")
    public void ci_user_authenticate_payment_reservation_transaction() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on payment reservation page$")
    public void ci_user_is_on_payment_reservation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see device biometric authentication popup$")
    public void ci_user_can_see_device_biometric_authentication_popup() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see authentication was a success popup$")
    public void ci_user_can_see_authentication_was_a_success_popup() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see fund reserved in wallet text$")
    public void ci_user_can_see_fund_reserved_in_wallet_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see job payments and reservations section$")
    public void ci_user_can_see_job_payments_and_reservations_section() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see MobiMoney wallet balance$")
    public void ci_user_can_see_mobimoney_wallet_balance() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select deleted reservation card$")
    public void ci_user_select_deleted_reservation_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see reservation deletion date$")
    public void ci_user_can_see_reservation_deletion_date() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CI user can see reservation was deleted card$")
    public void ci_user_can_see_reservation_was_deleted_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}