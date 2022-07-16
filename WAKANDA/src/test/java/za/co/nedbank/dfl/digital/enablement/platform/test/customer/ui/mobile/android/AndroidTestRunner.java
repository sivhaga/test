package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/customer.ui/mobile/android",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-android-reports/android-report.html"}
        ,tags={"@smoke"}
        ,dryRun = false
        , monochrome = true)


public class AndroidTestRunner {

    private static Logger logger = Logger.getLogger(AndroidTestRunner.class);

    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extent-customer-android-config.xml"));

        try{
            BasePageAndroid.copyLatestExtentReport();
        } catch (NullPointerException ex) {
            logger.info(ex.getStackTrace());
        }

    }
}