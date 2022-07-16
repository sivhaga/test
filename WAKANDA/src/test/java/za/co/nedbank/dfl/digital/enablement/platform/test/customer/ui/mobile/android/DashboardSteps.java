package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;

public class DashboardSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(DashboardSteps.class);

    @Then("^CA user balance is shown$")
    public void ca_user_balance_is_shown() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see job requests widget$")
    public void ca_user_can_see_job_requests_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see active jobs widget$")
    public void ca_user_can_see_active_jobs_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see payments widget$")
    public void ca_user_can_see_payments_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see my business widget$")
    public void ca_user_can_see_my_business_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see entertainment widget$")
    public void ca_user_can_see_entertainment_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see industry widget$")
    public void ca_user_can_see_industry_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see advertising widget$")
    public void ca_user_can_see_advertising_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see weather widget$")
    public void ca_user_can_see_weather_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see utilities widget$")
    public void ca_user_can_see_utilities_widget() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on eshop page$")
    public void ca_user_is_on_eshop_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see sign in button$")
    public void ca_user_can_see_sign_in_button() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.SIGN_IN_BUTTON)).size();
            Assert.assertEquals(1, size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user can see popular products section$")
    public void ca_user_can_see_popular_products_section() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.POPULAR_SECTION)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
