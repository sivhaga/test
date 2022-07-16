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

public class OrderAServiceSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(OrderAServiceSteps.class);
    BasePageAndroid page = new BasePageAndroid();
    Utils util = new Utils();

    @When("^CA user select categories menu$")
    public void ca_user_select_categories_menu() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.CATEGORIES_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select services menu$")
    public void ca_user_select_services_menu() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.SERVICES_MENU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a trending service category \"([^\"]*)\"$")
    public void ca_user_select_a_trending_service_category_something(String service) {
        try {
            switch (service) {

                case "Plumbing":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.PLUMBING)).click();
                    break;

                case "Swimming Pools and Jacuzzis":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.OUTDOOR)).click();
                    break;

                case "Security":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DECOR)).click();
                    break;

                case "Removal & Storage":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_APPLIANCES)).click();
                    break;

                case "Pet Services":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.BED_AND_BATH)).click();
                    break;

                case "Patio & Outdoors":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.KITCHEN)).click();
                    break;

                case "Interior & Décor":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_ORGANISING)).click();
                    break;

                case "Heating and Cooling":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).click();
                    break;

                case "Garden & Landscaping":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FURNITURE)).click();
                    break;

                case "Funeral":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.OUTDOOR)).click();
                    break;

                case "Building & Construction":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DECOR)).click();
                    break;

                case "Electrical":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_APPLIANCES)).click();
                    break;

                case "Computer & IT":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.BED_AND_BATH)).click();
                    break;

                case "Cleaning":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.KITCHEN)).click();
                    break;

                case "Appliance Repairs":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.HOME_ORGANISING)).click();
                    break;

                case "Home Services":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).click();
                    break;

                case "TV & Audio":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).click();
                    break;

                case "Transport":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).click();
                    break;

                case "Satellite & DSTV":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.DINING)).click();
                    break;

                default:
                    logger.info("Invalid service");
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on categories page$")
    public void ca_user_is_on_categories_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CATEGORIES_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on services page$")
    public void ca_user_is_on_services_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SERVICES_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see categories menu$")
    public void ca_user_can_see_categories_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CATEGORIES_MENU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on service category \"([^\"]*)\" job page$")
    public void ca_user_is_on_service_category_something_job_page(String trendingServiceCategory) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see trending service categories$")
    public void ca_user_can_see_trending_service_categories() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a sponsored offer \"([^\"]*)\"$")
    public void ca_user_select_a_sponsored_offer_something(String sponsoredOffer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select start a job button$")
    public void ca_user_select_start_a_job_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user on sponsored offer \"([^\"]*)\" details page$")
    public void ca_user_on_sponsored_offer_something_details_page(String sponsoredOffer) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see offer details popup$")
    public void ca_user_can_see_offer_detail_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select ok button$")
    public void ca_user_select_ok_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see job request sent message$")
    public void ca_user_can_see_job_request_is_sent() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see sponsored offers$")
    public void ca_user_can_see_sponsored_offers() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see start a job button$")
    public void ca_user_can_see_start_a_job_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see send job request button$")
    public void ca_user_can_see_send_job_request_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select send job request button$")
    public void ca_user_select_send_job_request_button() {
        try {
            driver.findElement(By.id(AndroidObjects.CREATE_JOB)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user update job name \"([^\"]*)\"$")
    public void ca_user_update_job_name_something(String jobName) {
        try {
            MobileElement element = driver.findElement(By.id("job_name_layout")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.sendKeys("");
            element.setValue(jobName);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user update job description \"([^\"]*)\"$")
    public void ca_user_update_job_description_something(String jobDescription) {
        try {
            MobileElement element = driver.findElement(By.id("description_layout")).findElements(By.className("android.widget.EditText")).get(0);
            element.click();
            element.sendKeys("");
            element.setValue(jobDescription);
            MobileElement element1 = driver.findElement(By.id("job_name_layout")).findElements(By.className("android.widget.EditText")).get(0);
            element1.click();
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select attach photos button$")
    public void ca_user_attach_photos_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see attach photos button$")
    public void ca_user_can_see_attach_photos_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.CATEGORIES_MENU)).size();
//            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see set a location button$")
    public void ca_user_can_see_set_a_location_button() {
        try {
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user create job confirmation button$")
    public void ca_user_create_job_confirmation_button() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select set location button$")
    public void ca_user_select_a_location() {
        try {
            driver.findElement(By.id(AndroidObjects.SET_LOCATION_BUTTON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for and select address \"([^\"]*)\"$")
    public void ca_user_search_for_and_select_address_something(String address) {
        try {
            driver.findElement(By.id(AndroidObjects.SEARCH_LOCATION)).click();
            driver.findElement(By.id(AndroidObjects.SEARCH_LOCATION)).setValue(address);
            driver.findElement(By.id(AndroidObjects.LOCATION_ADDRESS)).click();
            driver.hideKeyboard();
//            driver.findElement(By.id(AndroidObjects.SET_LOCATION_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter complex name \"([^\"]*)\"$")
    public void ca_user_enter_complex_name_something(String complexName) {
        try {
            driver.findElement(By.id(AndroidObjects.SEARCH_LOCATION)).click();
            driver.findElement(By.id(AndroidObjects.SEARCH_LOCATION)).setValue(complexName);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on set new location page$")
    public void ca_user_is_on_set_new_location_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.LOCATION_DETAILS)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see save location button$")
    public void ca_user_can_see_save_location_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter house number \"([^\"]*)\"$")
    public void ca_user_enter_house_number_something(String houseNumber) {
        try {
            driver.findElement(By.id(AndroidObjects.LOCATION_HOUSE_NUMBER)).click();
            driver.findElement(By.id(AndroidObjects.LOCATION_HOUSE_NUMBER)).clear();
            driver.findElement(By.id(AndroidObjects.LOCATION_HOUSE_NUMBER)).setValue(houseNumber);
            driver.findElement(By.id(AndroidObjects.LOCATION_HOUSE_NUMBER)).click();
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user enter location nickname \"([^\"]*)\"$")
    public void ca_user_enter_location_nickname_something(String nickName) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select save location button$")
    public void ca_user_select_save_location_button() {
        try {
            driver.findElement(By.id(AndroidObjects.SAVE_LOCATION_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select confirm and request service button$")
    public void ca_user_select_confirm_and_request_service_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.CONFIRM_AND_REQUEST_SERVICE_)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on create job page$")
    public void ca_user_is_on_create_job_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CREATE_JOB_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on set location page$")
    public void ca_user_is_on_location_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SET_A_LOCATION_HEADER)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on address details page$")
    public void ca_user_is_on_address_detials_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see we are matching you with service provider page$")
    public void ca_user_can_see_we_are_matching_you_with_service_provider_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.MATCHING_TO_MERCHANTS)).size();
            Assert.assertEquals(1, size);
            util.secondsDelay(8);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user update job urgency \"([^\"]*)\" option$")
    public void ca_user_update_job_urgency_something_option(String jobUrgency) {
        try {
            if (jobUrgency.equalsIgnoreCase("yes")) {
                driver.findElement(By.id(AndroidObjects.JOB_URGENCY_TOGGLE)).click();
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see confirm and request service button$")
    public void ca_user_can_see_confirm_and_request_service_button() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.CONFIRM_AND_REQUEST_SERVICE_)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select one of the interested merchants$")
    public void ca_user_select_one_of_the_interested_merchants_something() {
        try {
            driver.findElement(By.id("interested_merchants_list")).findElementsByClassName(AndroidObjects.FRAME_LAYOUT).get(0).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select assign to job button$")
    public void ca_user_select_assign_to_job_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select assign job to merchant button$")
    public void ca_user_select_assign_job_to_merchant_button() {
        try {
            driver.findElement(By.id(AndroidObjects.ASSIGN_JOB_TO_MERCHANT_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see assign job to merchant button$")
    public void ca_user_can_see_assign_job_to_merchant_button() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.ASSIGN_TO_JOB_BUTTON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on service details page$")
    public void ca_user_is_on_service_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see service details labels$")
    public void ca_user_can_see_service_details_labels() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see job payments label$")
    public void ca_user_can_see_job_payments_label() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select yes go ahead button$")
    public void ca_user_select_yes_go_ahead_button() {
        try {
            driver.findElement(By.id(AndroidObjects.JOB_CARD_CONFIRMATION_HEADER)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on interested merchant details page$")
    public void ca_user_is_on_interested_merchant_something_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see job confirmation dialog$")
    public void ca_user_can_see_job_confirmation_dialog() {
        try {
            int size = driver.findElements(By.id(AndroidObjects.JOB_CARD_CONFIRMATION_HEADER)).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see list of interested merchants$")
    public void ca_user_can_see_list_of_interested_merchants() {
        try {
            int size = driver.findElement(By.id("interested_merchants_list")).findElementsByClassName(AndroidObjects.FRAME_LAYOUT).size();
            Assert.assertTrue(size > 0);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see your job card will be shared with this service provider$")
    public void ca_user_can_see_your_job_card_will_be_shared_with_this_service_provider() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select chat icon$")
    public void ca_user_select_chat_icon() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select send chat message button$")
    public void ca_user_select_send_chat_message_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on service chat page$")
    public void ca_user_is_on_service_chat_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can type a chat message \"([^\"]*)\"$")
    public void ca_user_can_type_a_chat_message_something(String chatMessage) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user chat message \"([^\"]*)\"is sent$")
    public void ca_user_chat_message_somethingis_sent(String chatMessage) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see will you like to work with service provider text$")
    public void ca_user_can_see_will_you_like_to_work_with_service_provider_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see assign to job link$")
    public void ca_user_can_see_assign_to_job_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select reserve now button$")
    public void ca_user_select_reserve_now_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see the reserved in wallet text$")
    public void ca_user_can_see_the_reserved_in_wallet_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see reservation request card$")
    public void ca_user_can_see_reservation_request_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select reserve funds button$")
    public void ca_user_select_reserve_funds_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user authenticate payment reservation transaction$")
    public void ca_user_authenticate_payment_reservation_transaction() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on payment reservation page$")
    public void ca_user_is_on_payment_reservation_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see device biometric authentication popup$")
    public void ca_user_can_see_device_biometric_authentication_popup() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see authentication was a success popup$")
    public void ca_user_can_see_authentication_was_a_success_popup() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see fund reserved in wallet text$")
    public void ca_user_can_see_fund_reserved_in_wallet_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see job payments and reservations section$")
    public void ca_user_can_see_job_payments_and_reservations_section() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see MobiMoney wallet balance$")
    public void ca_user_can_see_mobimoney_wallet_balance() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select deleted reservation card$")
    public void ca_user_select_deleted_reservation_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see reservation deletion date$")
    public void ca_user_can_see_reservation_deletion_date() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see reservation was deleted card$")
    public void ca_user_can_see_reservation_was_deleted_card() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}