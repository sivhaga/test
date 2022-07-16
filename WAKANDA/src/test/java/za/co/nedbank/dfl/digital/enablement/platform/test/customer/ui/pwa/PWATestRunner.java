package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.pwa;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/customer.ui/pwa",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-pwa-reports/pwa-report.html"}
        , tags = {"@pwa-test"}
)

public class PWATestRunner {
    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extent-customer-pwa-config.xml"));
        Utils.copyLatestExtentReport();
    }
}
