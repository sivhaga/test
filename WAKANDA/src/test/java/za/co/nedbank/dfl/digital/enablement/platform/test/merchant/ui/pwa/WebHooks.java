package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.pwa;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class WebHooks extends Utils {

    @Before("@WebTest")

    public void BeforeScenario() {

        String baseURL = getConfigPropertyValue("./WebDriverConfig.properties", "VASOPERATIONSDEVURL");
        System.out.println("intitalizing webdriver...");
        driver = setupWebDriver();
        driver.get(baseURL);
    }


    @After("@WebTest")

    public void AfterScenario() {

        driver.close();
    }
}
