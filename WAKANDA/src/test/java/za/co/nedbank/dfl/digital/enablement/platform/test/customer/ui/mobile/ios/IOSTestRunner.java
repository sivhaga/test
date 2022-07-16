package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

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
        features = "src/test/features/customer.ui/mobile/iOS",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-ios-reports/ios-report.html"}
        ,
        tags={"@smoke"},
        monochrome = true)


public class IOSTestRunner {
    private static Logger logger = Logger.getLogger(IOSTestRunner.class);

    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+ "/extent-customer-ios-config.xml"));
        try{
            BasePageIOS.copyLatestIOSExtentReport();
        } catch (NullPointerException ex) {
            logger.info(ex.getStackTrace());
        }
    }
}