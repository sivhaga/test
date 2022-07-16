package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.ios;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;

public class MasterHooksIOS  extends DriverFactory {
        private static Logger log = Logger.getLogger(za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.android.MasterHooks.class);


        @Before
        public void setup() {
            try {
                driver = getIOSDriver();
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
                        BasePageIOS.captureIOSScreenshot();
                    }
                    driver.quit();
                    driver = null;
                }
            } catch (Exception e) {
                log.info(e.getMessage());
            }
        }
}


