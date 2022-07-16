package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;

public class AndroidHooks extends DriverFactory {

    private static Logger log = Logger.getLogger(AndroidHooks.class);


    @Before
    public void setup() {
        try {
            driver = getAndroidDriver();
            System.out.println("Before features  run " + driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (driver != null) {
                System.out.println("After features run " + driver);
                if(scenario.isFailed()) {
                    try {
                        BasePageAndroid.captureScreenshot();
                    } catch (Exception e) {
                        log.info(e.getMessage());
                    }
                }
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}
