package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.ios;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/merchant.ui/mobile/iOS",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-ios-reports/ios-report.html"}
        ,
        tags = { "@Testing" },
        monochrome = true)


public class IOSTestRunner {
    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+ "/extent-merchant-ios-config.xml"));
        BasePageIOS.copyLatestIOSExtentReport();
    }
}