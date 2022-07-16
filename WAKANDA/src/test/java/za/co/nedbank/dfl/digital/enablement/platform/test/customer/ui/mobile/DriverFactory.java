package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile;

import com.applitools.eyes.appium.Eyes;
import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static Logger log = Logger.getLogger(DriverFactory.class);
    public static AppiumDriver<MobileElement> driver;
    protected static String propertyFile = "./customer.properties";
    Utils util = new Utils();
    String androidAppLocation = util.getConfigPropertyValue(propertyFile, "AndroidAppLocation") + util.getConfigPropertyValue(propertyFile, "AndroidAppName");
    String iOSAppLocation = util.getConfigPropertyValue(propertyFile, "iOSAppLocation") + util.getConfigPropertyValue(propertyFile, "iOSAppName");
    File androidApp = new File(androidAppLocation);
    File iOSApp = new File(iOSAppLocation);
    protected Eyes eyes;


    public AppiumDriver getAndroidDriver() {
        try {
            PropertyConfigurator.configure("log4j.properties");
            if (driver == null) {
                DesiredCapabilities capabilities = setAndroidCapabilities("emulator-5554",
                        "Android", androidApp.getAbsolutePath());
                log.info("Start driver setup");
                driver = new AndroidDriver(new URL("http:127.0.0.1:4723/wd/hub"), capabilities);

                log.info("App launched successfully");
                log.info("Driver setup successful" + driver);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        } catch (Exception e) {
            log.info("Unable to load driver! - Exception: " + e.getMessage());
        }

        return driver;
    }

    public AppiumDriver getIOSDriver() {
        try {
            PropertyConfigurator.configure("log4j.properties");
            DesiredCapabilities capabilities = setIOSCapabilities("iOS", "iPhone 8", "13.3", iOSApp.getAbsolutePath(),
                    "PORTRAIT", "XCUITest");
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            initiateEyes();

        } catch (Exception e) {
            log.info("Unable to load driver! - Exception: " + e.getMessage());
        }
        return driver;
    }

    private DesiredCapabilities setAndroidCapabilities(String... args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, args[0]);
        capabilities.setCapability(MobileCapabilityType.PLATFORM, args[1]);
        capabilities.setCapability(MobileCapabilityType.APP, args[2]);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("autoAcceptAlerts", true);
//        capabilities.setCapability("appPackage", "za.co.nedbank.wakanda.customer.beta");
//        capabilities.setCapability("appActivity", "za.co.nedbank.wakanda.customer.activity.splash.SplashActivity");
        capabilities.setCapability("appPackage", "za.co.nedbank.wakanda.customer");
        capabilities.setCapability("appActivity", "za.co.nedbank.wakanda.customer.activity.splash.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("appWaitDuration", 30000);

        return capabilities;
    }

    private DesiredCapabilities setIOSCapabilities(String... args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, args[0]);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, args[1]);
        capabilities.setCapability("platformVersion", args[2]);
        capabilities.setCapability(MobileCapabilityType.APP, args[3]);
        capabilities.setCapability("orientation", args[4]);
        capabilities.setCapability("automationName", args[5]);
        capabilities.setCapability("useNewWDA", false);
        capabilities.setCapability("waitForQuiescence", false);
        capabilities.setCapability("showXcodeLog", true);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("shouldUseSingletonTestManager", false);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("skipDeviceInitialization", true);
        capabilities.setCapability("skipServerInstallation", true);
        return capabilities;
    }


    private void initiateEyes() {
        eyes = new Eyes();
        eyes.setApiKey("cZXmLxbb2pGc0GYOee8m8VNw5k0DrlR5MrtHLFQb7Do110");
    }


    public void validateWindow() {
//        eyes.open(driver,"iOS tests","");
        eyes.checkWindow();
        eyes.close();

    }

}
