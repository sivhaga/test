package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.android;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;


public class MasterHooks extends DriverFactory {
	private static Logger log = Logger.getLogger(MasterHooks.class);

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
					BasePageAndroid.captureScreenshot();
				}
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}
}
