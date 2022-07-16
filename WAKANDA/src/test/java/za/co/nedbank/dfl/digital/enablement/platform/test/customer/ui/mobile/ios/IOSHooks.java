package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import com.applitools.eyes.appium.Eyes;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;

public class IOSHooks extends DriverFactory {

    private static Logger log = Logger.getLogger(IOSHooks.class);

//    @Before
    public void setup(Scenario scenario) {
        try {
            getIOSDriver();
//            eyes.open(driver, "iOS tests", scenario.getName());

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
                if (scenario.isFailed()) {
                    try {
                        BasePageIOS.captureIOSScreenshot();
                    } catch (Exception e) {
                        log.info(e.getMessage());
                    }
                }

                driver.quit();
//                driver = null;
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}
