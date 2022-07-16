package za.co.nedbank.dfl.digital.enablement.platform.test.utils;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

public class Utils {

    public WebDriver driver;
    public JavascriptExecutor jExecutor;
    public WebDriverWait driverWait;
    private static Logger log = Logger.getLogger(Utils.class);
    private static String screenshotName;


    /*
     * this sets up the the web driver for testNG multi-platform run takes only the
     * browser name and then sets up the web driver for the specified driver
     *
     */
    public WebDriver setupWebDriver() {
        String Env = getConfigPropertyValue("./WebDriverConfig.properties", "webExecutionEnv");
        String chromeDriverPath = null;

        if(Env.equalsIgnoreCase("local")){
            String macDriverLocation = "./Drivers/Mac/";
            String linuxDriverLocation = "./Drivers/Linux/";
            String windowsDriverLocation = "./Drivers/Windows/";

            if (this.getOsName().equalsIgnoreCase("Windows")) {
                chromeDriverPath = windowsDriverLocation + "chromedriver.exe";
            }
            else if (this.getOsName().equalsIgnoreCase("Mac OS")) {
                chromeDriverPath = macDriverLocation + "chromedriver";
            }
            else if (this.getOsName().equalsIgnoreCase("Linux")) {
                chromeDriverPath = linuxDriverLocation + "chromedriver";
            }
            log.info("This is the chrome driver path is :::: " + chromeDriverPath);

            chromeDriverPath = toAbsolutePath(chromeDriverPath);
            log.info("This is the chrome driver real path is :::: " + chromeDriverPath);
        }
        else {
            chromeDriverPath = "$JENKINS_HOME\\tools\\chromedriver\\chromedriver.exe";
        }




        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeOptions cOptions = new ChromeOptions();
        cOptions.addArguments("--no-sandbox");

        driver = new ChromeDriver(cOptions);

        try {
            jExecutor = (JavascriptExecutor) driver;
            driver.manage().window().maximize();
            driverWait = new WebDriverWait(driver, 5);
        } catch (Exception e) {
            log.info("The stack trace here happens when I try to maximize the screen");
            log.info(e.getStackTrace()) ;
        }
        return driver;
    }

        public String getConfigPropertyValue(String propertyFileName, String propertyName) {
            String Value = null;
            try {
                FileInputStream fileIS = new FileInputStream(new File(propertyFileName));
                Properties prop = new Properties();
                prop.load(fileIS);

                Value = prop.getProperty(propertyName);
            } catch (IOException e) {
                log.info(e.getStackTrace()) ;
            }

            return Value;
        }

    /**
     * Delay time in seconds to pause or hold for some page objects to load takes
     * only integer value of number of seconds to pause
     */

    public void secondsDelay(int sec) {
        int timeInMilliSeconds;
        try {
            timeInMilliSeconds = sec * 1000;
            log.info("##############################################");
            log.info("Going for " + timeInMilliSeconds + " delay");
            log.info("##############################################");
            Thread.sleep(timeInMilliSeconds);
        } catch (Exception e) {
            log.info(e.getStackTrace());
        }
    }

    /**
     * get real path on a machine using a relative path with respect to the current
     * root directory (i.e project root directory) it takes one argument just the
     * relative path
     */
    public static String toAbsolutePath(String relativePath) {
        Path relPath = Paths.get(relativePath);
        Path absolutePath = null;
        if (!relPath.isAbsolute()) {
            Path base = Paths.get("");
            absolutePath = base.resolve(relPath).toAbsolutePath();
        }
        return absolutePath.normalize().toString();
    }

    /**
     * get the os type that the code is running on takes no variable but returns the
     * os type such as: Windows, Mac OS, Linux
     */
    public String getOsName() {
        String osType;
        String osName = "";

        osType = System.getProperty("os.name");

        if (osType.contains("Windows") || osType.contains("windows")) {
            osName = "Windows";
        } else if (osType.contains("Mac") || osType.contains("mac")) {
            osName = "Mac OS";
        } else if (osType.contains("Linux") || osType.contains("linux")) {
            osName = "Linux";
        }

        log.info("os Type is ::: " + osType + "found os Name ::: " + osName);

        return osName;
    }
    public static String returnDateStampPWA(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    public void capturePWAScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        screenshotName = returnDateStampPWA(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/Reports/ios-screenshot/" + screenshotName));

        Reporter.addStepLog("Taking a screenshot!");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href="+ returnIOSScreenshotName() + "><img src="+ returnIOSScreenshotName()+ " height=200 width=300></img></a>");
    }

    public  String returnIOSScreenshotName() {
        return (System.getProperty("user.dir") + "/Reports/ios-screenshot/" + screenshotName);
    }

    public static void copyLatestExtentReport() throws IOException {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");
        File source = new File(System.getProperty("user.dir") + "/Reports/cucumber-pwa-reports/pwa-report.html");
        File dest = new File(System.getProperty("user.dir") + "/Reports/cucumber-pwa-reports/" + date + ".html");
        copyFileUsingStream(source, dest);
    }

    /***EXTENT REPORT****************************************************************/
    public static String returnDateStamp(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    public  void captureScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        screenshotName = returnDateStamp(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/Reports/pwa-screenshots/" + screenshotName));

        Reporter.addStepLog("Taking a screenshot!");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href=" + returnScreenshotName() + "><img src=" + returnScreenshotName() + " height=200 width=300></img></a>");
    }

    public static String returnScreenshotName() {
        return (System.getProperty("user.dir") + "/Reports/pwa-screenshots/" + screenshotName);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}
