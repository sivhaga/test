package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.pwa;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

import java.io.IOException;

public class PWAHooks extends Utils {

    Utils utils = new Utils();

    @Before("@pwa-test")
    public void beforeScenario() {
        String baseURL = getConfigPropertyValue("./customer.properties", "pwa_customer");
        System.out.println("intitalizing webdriver...");
        driver = setupWebDriver();
        driver.get(baseURL);
    }

    @After("@pwa-test")
    public void AfterScenario(Scenario scenario) throws IOException, InterruptedException {
        driver.close();

        if (driver != null) {
            System.out.println("After features run " + driver);
            if(scenario.isFailed()) {
                utils.captureScreenshot();
            }
            driver.quit();
            driver = null;
        }
    }
}
