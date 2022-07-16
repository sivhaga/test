package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.pwa;

import cucumber.api.java.en.Given;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class OnBoardingSteps extends Utils {
    @Given("^CP user launch the customer web$")
    public void cp_user_launches_wakanda_customer_web() {
        String baseURL = getConfigPropertyValue("./customer.properties", "pwa_customer");
        System.out.println("intitalizing webdriver...");
        driver = setupWebDriver();
        driver.get(baseURL);
    }
}
