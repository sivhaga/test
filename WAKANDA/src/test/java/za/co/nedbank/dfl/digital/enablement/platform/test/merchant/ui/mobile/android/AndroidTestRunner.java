package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.android;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/merchant.ui/mobile/android",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-android-reports/android-report.html"}
        ,
        tags = { "@Test" },
        monochrome = true)


public class AndroidTestRunner {
    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extent-merchant-android-config.xml"));
        BasePageAndroid.copyLatestExtentReport();
    }
}