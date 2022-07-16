package za.co.nedbank.dfl.digital.enablement.platform.test.api;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class WebAuthToken extends Utils {

    private WebDriver driver = setupWebDriver();
    private KarateUtil ku = new KarateUtil();
    private Logger logger = Logger.getLogger("Webtoken");

    public String platform_get_Auth_AccessToken_Via_Web(String username, String Password, String tokenUrl, String Operation, String scope) throws MalformedURLException {
        String access_token = null;

        logger.info("Found token URL ::: "+ tokenUrl);

        driver.get(tokenUrl);

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login")).click();

        /**
         *  This is to fetch the access token from the web
         */
        WebElement elementTerms = null;
        boolean sendApproveIt = false;
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        switch (Operation){
            case "ops-customer":
                WebElement elementDisclaimer = driver.findElement(By.id("disclaimerBox"));
                executor.executeScript("arguments[0].click();", elementDisclaimer);

                elementTerms = driver.findElement(By.id("termsBox"));
                break;

            case "ops-payments":
                elementTerms = driver.findElement(By.id("termsBox"));
                sendApproveIt = true;
                break;

            case "ops-account":
                WebElement elementAccount = driver.findElement(By.name("accounts"));
                executor.executeScript("arguments[0].click();", elementAccount);

                elementTerms = driver.findElement(By.id("termsBox"));
                break;

            case "ops-loans":
                elementTerms = driver.findElement(By.id("termsBox"));
                break;

        }

        executor.executeScript("arguments[0].click();", elementTerms);


        /**
         *  This is to click authorise
         */
        driver.findElement(By.id("btnAuthorize")).click();

        /**
         *  This is to check if send approve it it true
         */
        if(sendApproveIt){
            WebElement continueBtn = driver.findElement(By.id("btn_continue"));
            continueBtn.click();
            try {
                Thread.sleep(20000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            logger.info("No need to send approve-it");
        }

        String currentURL = driver.getCurrentUrl();
        int start = currentURL.indexOf("code=")+5;
        int end = currentURL.length();

        access_token = currentURL.substring(start, end);
        System.out.println("AccessToken is  ::: "+ access_token);

        String fileSource = null;
        if(scope.contains("APIM")){
            fileSource = "src/test/features/ApiMarketPlace/TokenStore/web_code.txt";
            logger.info(fileSource);
        }
        else {
            fileSource = "src/test/features/api/TokenStore/Access_token_web.txt";
            logger.info(fileSource);
        }

        ku.saveIds(access_token, fileSource);

        driver.quit();

        return access_token;
    }

}
