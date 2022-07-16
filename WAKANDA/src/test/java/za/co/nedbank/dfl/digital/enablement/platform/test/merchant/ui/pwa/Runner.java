package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.pwa;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/features/merchant.ui/pwa",
        glue={"za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.pwa"}
        ,tags={"@FunctionalTest"}

)


public class Runner {
    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+ "/extent-merchant-pwa-config.xml"));
        //BasePageIOS.copyLatestIOSExtentReport();
    }
}
