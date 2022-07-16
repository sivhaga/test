package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;


public class SearchSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(LoginAndEnrollment.class);
    Utils util = new Utils();
    BasePageIOS page = new BasePageIOS();

    @When("^CI user select search box to type$")
    public void ci_user_select_search_box_to_type() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.HOME_PAGE_SEARCH_BAR));
            driver.findElementByAccessibilityId(IOSObjects.HOME_PAGE_SEARCH_BAR).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for item \"([^\"]*)\"$")
    public void ci_user_search_for_item_something(String searchItem) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_PAGE_SEARCH_BAR).click();
            driver.findElementByAccessibilityId(IOSObjects.SEARCH_PAGE_SEARCH_BAR).setValue(searchItem);
            driver.findElementByAccessibilityId(IOSObjects.KEYBOARD_SEARCH_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a search item \"([^\"]*)\" from results list$")
    public void ci_user_select_search_item_from_list(String searchItem) {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(searchItem));
            driver.findElementByAccessibilityId(searchItem).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a search category \"([^\"]*)\"$")
    public void ci_user_select_a_search_category_something(String searchCategory) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a subcategory \"([^\"]*)\"$")
    public void ci_user_select_a_subcategory_something(String subCategory) {
        try {
            driver.findElementByAccessibilityId(subCategory).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see dashboard page$")
    public void ci_user_can_see_dashboard_page() {
        try {
//            driver.findElementByAccessibilityId(IOSObjects.LETS_GET_STARTED_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see trending and recent searches$")
    public void ci_user_can_see_trending_and_recent_searches() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.TRENDING_SEARCHES));
            int trends = driver.findElementsByAccessibilityId(IOSObjects.TRENDING_SEARCHES).size();
            int recentSearches = driver.findElementsByAccessibilityId(IOSObjects.RECENT_SEARCH).size();
            Assert.assertEquals(2, trends);
            Assert.assertEquals(2, recentSearches);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see sub categories under the selected category$")
    public void ci_user_can_see_sub_categories_under_the_selected_category() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see results under a subcategory$")
    public void ci_user_can_see_results_under_a_subcategory() {
        try {
            int size = driver.findElementsByClassName(IOSObjects.CELLS).size();
            Assert.assertTrue(size > 3);
            logger.info("Number of search images " + size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user navigate to products page$")
    public void ci_user_navigate_to_products_page() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ESHOP_MENU).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select product search box to type$")
    public void ci_user_select_product_search_box_to_type() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ESHOP_PRODUCT_SEARCH).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for product \"([^\"]*)\"$")
    public void ci_user_search_for_product_something(String genericSearchItem) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a product category \"([^\"]*)\"$")
    public void ci_user_select_a_product_category_something(String searchCategory) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select product search result from list$")
    public void ci_user_select_product_search_result_from_list() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on products page$")
    public void ci_user_is_on_products_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see suggestive results$")
    public void ci_user_can_see_suggestive_results() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.TRENDING_SEARCHES));
            int trends = driver.findElementsByAccessibilityId(IOSObjects.TRENDING_SEARCHES).size();
            int recentSearches = driver.findElementsByAccessibilityId(IOSObjects.RECENT_SEARCH).size();
            Assert.assertEquals(2, trends);
            Assert.assertEquals(2, recentSearches);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see product search item results list \"([^\"]*)\"$")
    public void ci_user_can_see_product_search_item_results_list_something(String genericSearchItem) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see search categories$")
    public void ci_user_can_see_search_categories() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see product sub categories results are shown$")
    public void ci_user_can_see_product_sub_categories_results_are_shown() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see product search item \"([^\"]*)\" details page$")
    public void ci_user_can_see_product_search_item_something_details_page(String productSearchItem) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user navigate to services page$")
    public void ci_user_navigate_to_services_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select services search box to type$")
    public void ci_user_select_services_search_box_to_type() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select one of the most searched service \"([^\"]*)\"$")
    public void ci_user_select_one_of_the_most_searched_service_something(String mostSearchedService) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on services page$")
    public void ci_user_is_on_services_page() {
        try {
            int size = driver.findElementsByAccessibilityId(IOSObjects.ORDER_SERIVICE_SEARCH_TITLE).size();
//            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^trending and recent searches are shown$")
    public void trending_and_recent_searches_are_shown() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see most searched services$")
    public void ci_user_can_see_most_searched_services() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see most searched service \"([^\"]*)\" results$")
    public void ci_user_can_see_most_searched_service_something_results(String mostSearchedService) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see get what want faster text$")
    public void ci_user_can_see_get_what_want_faster_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for service \"([^\"]*)\"$")
    public void ci_user_search_for_service_something(String service) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select get what you want faster link$")
    public void ci_user_select_get_what_you_want_faster_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select chat page more button$")
    public void ci_user_select_chat_page_more_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select in chat search$")
    public void ci_user_select_in_chat_search() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for service \"([^\"]*)\" in chat$")
    public void ci_user_search_for_service_something_in_chat(String searchCriteria) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see service search results \"([^\"]*)\"$")
    public void ci_user_can_see_service_search_results_something(String service) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see get what want faster link$")
    public void ci_user_can_see_get_what_want_faster_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on chat page$")
    public void ci_user_is_on_chat_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see more options$")
    public void ci_user_can_see_more_options() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see in chat search box$")
    public void ci_user_can_see_in_chat_search_box() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see chat messages matching \"([^\"]*)\"$")
    public void ci_user_can_see_chat_messages_matching_something(String searchCriteria) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select search for orders button$")
    public void ci_user_select_search_for_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user search for an order \"([^\"]*)\"$")
    public void ci_user_search_for_an_order_something(String order) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select order status \"([^\"]*)\"$")
    public void ci_user_select_order_status_something(String orderStatus) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select order from the results list$")
    public void ci_user_select_order_from_the_results_list() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on orders search page$")
    public void ci_user_is_on_orders_search_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see ongoing and past orders$")
    public void ci_user_can_see_ongoing_and_past_orders() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see order results under selected order status \"([^\"]*)\"$")
    public void ci_user_can_see_order_results_under_selected_order_status_something(String orderStatus) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see  order details page$")
    public void ci_user_can_see_order_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select search for wallet button$")
    public void ci_user_select_search_for_wallet_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select a wallet transaction \"([^\"]*)\" from result list$")
    public void ci_user_select_a_wallet_transaction_something_from_result_list(String walletTransaction) {
        try {
            driver.findElementByClassName(IOSObjects.CELLS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on wallet search page$")
    public void ci_user_is_on_wallet_search_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see  payments from the selected wallet$")
    public void ci_user_can_see_payments_from_the_selected_wallet() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user search for a specific wallet transaction \"([^\"]*)\"$")
    public void ci_user_search_for_a_specific_wallet_transaction_something(String walletTransaction) {
        try {
            driver.findElementByAccessibilityId(IOSObjects.WALLET_SEARCH_BAR).click();
            driver.findElementByAccessibilityId(IOSObjects.WALLET_SEARCH_BAR).setValue(walletTransaction);
            driver.findElementByAccessibilityId(IOSObjects.KEYBOARD_SEARCH_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see order is not found page$")
    public void ci_user_can_see_order_is_not_found_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CI user can see wallet transaction \"([^\"]*)\" results$")
    public void ci_user_can_see_wallet_transaction_something_results(String walletTransaction) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see wallet transaction details page$")
    public void ci_user_can_see_wallet_transaction_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see no results found page$")
    public void ci_user_can_see_no_results_found_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ZERO_SEARCH_RESULTS));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ZERO_SEARCH_RESULTS).size();
            Assert.assertTrue(size > 0);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
