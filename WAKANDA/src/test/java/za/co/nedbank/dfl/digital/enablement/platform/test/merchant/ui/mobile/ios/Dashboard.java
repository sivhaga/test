package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.ios;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class Dashboard extends DriverFactory {

    private static Logger logger = Logger.getLogger(Logger.class);
    BasePageIOS page = new BasePageIOS();
    Utils util = new Utils();


    @Then("^MI user can see job requests widget$")
    public void mi_user_can_see_job_requests_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see active jobs widget$")
    public void mi_user_can_see_active_jobs_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see payments widget$")
    public void mi_user_can_see_payments_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see my business widget$")
    public void mi_user_can_see_my_business_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see  industry widget$")
    public void mi_user_can_see_industry_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see advertising widget$")
    public void mi_user_can_see_advertising_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see weather widget$")
    public void mi_user_can_see_weather_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see utilities widget$")
    public void mi_user_can_see_utilities_widget()  {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


}