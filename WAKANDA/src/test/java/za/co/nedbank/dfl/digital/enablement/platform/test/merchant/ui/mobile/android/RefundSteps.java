package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class RefundSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(RefundSteps.class);
    BasePageAndroid page = new BasePageAndroid();
    Utils util = new Utils();

    @When("^MA user select incoming$")
    public void mi_user_select_incoming()
    {
            try {
                //driver.findElementByAccessibilityId(AndroidObjects.INCOMING).click();

            } catch (Exception ex) {
                logger.info(ex.getStackTrace());
            }
    }

    @And("^MA user select on initiate refund button$")
    public void mi_user_select_on_initiate_refund_button() {
        try {
           // driver.findElementByAccessibilityId(IOSObjects.INITIATE_REFUND_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

        @When("^MA user enter amount \"([^\"]*)\" to refund$")
        public void mi_user_enter_amount_something_to_refund(String amount) {
            try {

            } catch (Exception ex) {
                logger.info(ex.getStackTrace());
            }
        }

        @Then("^MA user is on initiate refund page$")
        public void mi_user_is_on_initiate_refund_page()  {
            try {

            } catch (Exception ex) {
                logger.info(ex.getStackTrace());
            }
        }

    @And("^MA user select on refund button$")
    public void mi_user_select_on_refund_button() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.REFUND_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

        @Then("^MA user can see refund success message$")
        public void mi_user_can_see_refund_success_message()  {
            try {
               /* util.secondsDelay(2);
                int size = driver.findElementsByAccessibilityId(IOSObjects.REFUND_PAY_SUCCESS).size();
                Assert.assertEquals(1,size);

                util.secondsDelay(2);
                //int size1 = driver.findElementsByAccessibilityId(IOSObjects.YOU_HAVE_JUST_REFUNDED_TEXT).size();
                Assert.assertEquals(1,size1);
                */


            } catch (Exception ex) {
                logger.info(ex.getStackTrace());
            }
        }

        @And("^MA user select job$")
        public void mi_user_select_job()  {
            try {
                //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

            } catch (Exception ex) {
                logger.info(ex.getStackTrace());
            }
        }
}



