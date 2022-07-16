package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

import java.util.List;

public class SearchSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(SearchSteps.class);
    BasePageAndroid page = new BasePageAndroid();
    Utils util = new Utils();


    @When("^CA user select search box to type$")
    public void ca_user_select_search_box_to_type() {
        try {
            driver.findElement(By.id(AndroidObjects.HOME_PAGE_SEARCH_BAR)).click();
            util.secondsDelay(2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for item \"([^\"]*)\"$")
    public void ca_user_search_for_item_something(String searchItem) {
        try {
            driver.findElement(By.id(AndroidObjects.SEARCH_PAGE_SEARCH_BOX)).setValue(searchItem);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a search item from results list$")
    public void ca_user_select_search_item_from_list() {
        try {
            driver.findElement(By.id(AndroidObjects.SEARCH_RESULTS_LABEL)).click();
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
    @When("^CA user select a search category \"([^\"]*)\"$")
    public void ca_user_select_a_search_category_something(String searchCategory) {
        try {
            List<MobileElement> categories = driver.findElements(By.id(AndroidObjects.CATEGORY_FILTER));
            switch(searchCategory) {
                case "Service":
                    categories.get(0).click();
                    break;

                case "Product":
                    categories.get(1).click();
                    break;
                default:
                    logger.info("Invalid search category selected : " + searchCategory);
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a subcategory \"([^\"]*)\"$")
    public void ca_user_select_a_subcategory_something(String subCategory) {
        try {
            List<MobileElement> categories = driver.findElements(By.id(AndroidObjects.CATEGORY_FILTER));
            switch(subCategory) {
                case "Service":
                    categories.get(0).click();
                    break;

                case "Product":
                    categories.get(1).click();
                    break;
                default:
                    logger.info("Invalid search category selected : " + subCategory);
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see dashboard page$")
    public void ca_user_can_see_dashboard_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see trending and recent searches$")
    public void ca_user_can_see_trending_and_recent_searches() {
        try {
//            util.secondsDelay(2);
//            int trends = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects
//                    .TRENDING_SEARCHES)).size();
//            int recentSearches = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.RECENT_SEARCH)).size();
//            Assert.assertEquals(1,trends);
//            Assert.assertEquals(1,recentSearches);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see sub categories under the selected category$")
    public void ca_user_can_see_sub_categories_under_the_selected_category() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see results under a subcategory$")
    public void ca_user_can_see_results_under_a_subcategory() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @When("^CA user navigate to products page$")
    public void ca_user_navigate_to_products_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select product search box to type$")
    public void ca_user_select_product_search_box_to_type() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for product \"([^\"]*)\"$")
    public void ca_user_search_for_product_something(String genericSearchItem) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a product category \"([^\"]*)\"$")
    public void ca_user_select_a_product_category_something(String searchCategory) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select product search result from list$")
    public void ca_user_select_product_search_result_from_list() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on products page$")
    public void ca_user_is_on_products_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see suggestive results$")
    public void ca_user_can_see_suggestive_results() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product search item results list \"([^\"]*)\"$")
    public void ca_user_can_see_product_search_item_results_list_something(String genericSearchItem) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see search categories$")
    public void ca_user_can_see_search_categories() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product sub categories results are shown$")
    public void ca_user_can_see_product_sub_categories_results_are_shown() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see product search item \"([^\"]*)\" details page$")
    public void ca_user_can_see_product_search_item_something_details_page(String productSearchItem) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user navigate to services page$")
    public void ca_user_navigate_to_services_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select services search box to type$")
    public void ca_user_select_services_search_box_to_type() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select one of the most searched service \"([^\"]*)\"$")
    public void ca_user_select_one_of_the_most_searched_service_something(String mostSearchedService) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @Then("^CA user can see most searched services$")
    public void ca_user_can_see_most_searched_services() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see most searched service \"([^\"]*)\" results$")
    public void ca_user_can_see_most_searched_service_something_results(String mostSearchedService) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see get what want faster text$")
    public void ca_user_can_see_get_what_want_faster_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for service \"([^\"]*)\"$")
    public void ca_user_search_for_service_something(String service) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select get what you want faster link$")
    public void ca_user_select_get_what_you_want_faster_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select chat page more button$")
    public void ca_user_select_chat_page_more_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select in chat search$")
    public void ca_user_select_in_chat_search() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for service \"([^\"]*)\" in chat$")
    public void ca_user_search_for_service_something_in_chat(String searchCriteria) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see service search results \"([^\"]*)\"$")
    public void ca_user_can_see_service_search_results_something(String service) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see get what want faster link$")
    public void ca_user_can_see_get_what_want_faster_link() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on chat page$")
    public void ca_user_is_on_chat_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see more options$")
    public void ca_user_can_see_more_options() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see in chat search box$")
    public void ca_user_can_see_in_chat_search_box() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see chat messages matching \"([^\"]*)\"$")
    public void ca_user_can_see_chat_messages_matching_something(String searchCriteria) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select search for orders button$")
    public void ca_user_select_search_for_orders_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user search for an order \"([^\"]*)\"$")
    public void ca_user_search_for_an_order_something(String order) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select order status \"([^\"]*)\"$")
    public void ca_user_select_order_status_something(String orderStatus) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select order from the results list$")
    public void ca_user_select_order_from_the_results_list() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on orders search page$")
    public void ca_user_is_on_orders_search_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see ongoing and past orders$")
    public void ca_user_can_see_ongoing_and_past_orders() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see order results under selected order status \"([^\"]*)\"$")
    public void ca_user_can_see_order_results_under_selected_order_status_something(String orderStatus) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see order is not found page$")
    public void ca_user_can_see_order_is_not_found_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^CA user can see order details page$")
    public void ca_user_can_see_order_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CA user select search for wallet button$")
    public void ca_user_select_search_for_wallet_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select a wallet transaction from result list$")
    public void ca_user_select_a_wallet_transaction_something_from_result_list() {
        try {
              driver.findElement(By.id(AndroidObjects.FIRST_TRANSACTION)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on wallet search page$")
    public void ca_user_is_on_wallet_search_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see  payments from the selected wallet$")
    public void ca_user_can_see_payments_from_the_selected_wallet() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user search for a specific wallet transaction \"([^\"]*)\"$")
    public void ca_user_search_for_a_specific_wallet_transaction_something(String walletTransaction) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see wallet transaction \"([^\"]*)\" results$")
    public void ca_user_can_see_wallet_transaction_something_results(String walletTransaction) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see wallet transaction details page$")
    public void ca_user_can_see_wallet_transaction_details_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see no results found page$")
    public void ca_user_can_see_no_results_found_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}