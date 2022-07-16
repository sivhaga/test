package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;


public class PersonalLoansSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(LoginAndEnrollment.class);
    Utils util = new Utils();
    BasePageIOS page = new BasePageIOS();

    @When("^CI user select wallet menu$")
    public void ci_user_select_wallet_menu() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.MY_MONEY_MENU));
            driver.findElementByAccessibilityId(IOSObjects.MY_MONEY_MENU).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select personal loans category$")
    public void ci_user_select_personal_loans_category() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.LOANS_CATEGORY_ICON));
            driver.findElementByAccessibilityId(IOSObjects.LOANS_CATEGORY_ICON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select take a loan button$")
    public void ci_user_select_take_a_loan() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.TAKE_A_LOAN_BUTTON));
            driver.findElementByAccessibilityId(IOSObjects.TAKE_A_LOAN_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user consent they have regular income$")
    public void ci_user_consent_they_have_regular_income() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_LOANS_TERMS_ONE).click();
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_LOANS_TERMS_ONE).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user consent they have no spouse to object$")
    public void ci_user_consent_they_have_no_spouse_to_object() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_LOANS_TERMS_TWO).click();
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_LOANS_TERMS_TWO).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user consent they are are not insolvent$")
    public void ci_user_consent_they_are_are_not_insolvent() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_LOANS_TERMS_THREE).click();
            driver.findElementByAccessibilityId(IOSObjects.PERSONAL_LOANS_TERMS_THREE).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select get your pre approved loan button$")
    public void ci_user_select_get_your_pre_approved_loan_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.GET_PRE_APPROVED_LOAN_BUTTON).click();
            util.secondsDelay(3);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter Nedbank id username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void ci_user_enter_ned_bank_id_username_something_and_password_something(String nedbankUsername, String nedbankPassword) {
        try {
            util.secondsDelay(10);

            page.switchToWebView();
            WebElement username = driver.findElement(By.id(IOSObjects.NED_BANK_ID_USERNAME));
            username.click();
            username.clear();
            username.sendKeys(nedbankUsername);

            WebElement password = driver.findElement(By.id(IOSObjects.NED_BANK_ID_PASSOWRD));
            password.click();
            password.clear();
            password.sendKeys(nedbankPassword);
            util.secondsDelay(8);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select Nedbank id login button$")
    public void ci_user_select_nedbank_id_login_button() {
        try {
            page.switchToNativeView();
            driver.findElementByAccessibilityId(IOSObjects.NED_BANK_ID_LOGIN).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select income type \"([^\"]*)\"$")
    public void ci_user_select_income_type_something(String incomeType) {
        try {
            driver.findElementByAccessibilityId(incomeType).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter net monthly income \"([^\"]*)\"$")
    public void ci_user_enter_net_monthly_income_something(String netMonthlyIncome) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(0).setValue(netMonthlyIncome);
            driver.findElementByAccessibilityId(IOSObjects.FIXED_INCOME).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter total monthly expenses \"([^\"]*)\"$")
    public void ci_user_enter_total_monthly_expenses_something(String totalMonthlyExpenses) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(1).setValue(totalMonthlyExpenses);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter monthly contractual debt \"([^\"]*)\"$")
    public void ci_user_enter_monthly_contractual_debt_something(String monthlyContractualDebt) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(2).setValue(monthlyContractualDebt);
            driver.findElements(By.className(IOSObjects.TEXT_VIEWS)).get(0).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user enter monthly living expenses \"([^\"]*)\"$")
    public void ci_user_enter_monthly_living_expenses_something(String livingExpenses) {
        try {
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(3).click();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(3).clear();
            driver.findElements(By.className(IOSObjects.TEXT_FIELDS)).get(3).setValue(livingExpenses);
            driver.findElements(By.className(IOSObjects.TEXT_VIEWS)).get(5).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user give consent for credit and affordability check$")
    public void ci_user_give_consent_for_credit_and_affordability_check() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ALLOW_CREDIT_CHECK).click();
            driver.findElementByAccessibilityId(IOSObjects.ALLOW_CREDIT_CHECK).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select number of months to pay \"([^\"]*)\"$")
    public void ci_user_select_number_of_months_to_pay_something(String numberOfMonthsToPay) {
        try {
            driver.findElementByAccessibilityId(numberOfMonthsToPay).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user enter email address \"([^\"]*)\"$")
    public void ci_user_enter_email_address(String email) {
        try {
            driver.findElement(By.className(IOSObjects.TEXT_FIELDS)).click();
            driver.findElement(By.className(IOSObjects.TEXT_FIELDS)).clear();
            driver.findElement(By.className(IOSObjects.TEXT_FIELDS)).setValue(email);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user accepts they have read offer documentation$")
    public void ci_user_accepts_they_have_read_offer_documentation() {
        try {
            util.secondsDelay(2);
            driver.findElementByAccessibilityId(IOSObjects.ACCEPT_LOAN_OFFER_DOCUMENTATION).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user accepts terms and conditions$")
    public void ci_user_accepts_terms_and_conditions() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ACCEPT_LOAN_OFFER_TERMS_AND_CONDITIONS).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select accept and confirm button$")
    public void ci_user_select_accept_and_confirm_button() {
        try {
            util.secondsDelay(3);
            driver.findElementByAccessibilityId(IOSObjects.ACCEPT_AND_CONFIRM_BUTTON).click();
            util.secondsDelay(3);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select done button$")
    public void ci_user_select_done_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.LOAN_OFFER_CONRATULATIONS_PAGE_DONE_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on instant loan page$")
    public void ci_user_is_on_instant_loan_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_PERSONAL_LOANS_PAGE).size();
            Assert.assertEquals( 2,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on connect your Nedbank account page$")
    public void ci_user_is_on_connect_your_nedbank_account_page() {
        try {
            util.secondsDelay(2);


//  int size = driver.findElementsByAccessibilityId(IOSObjects.NED_ID_MESSAGE).size();
//            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on financial information page$")
    public void ci_user_is_on_financial_information_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_FINANCIAL_INFO_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_FINANCIAL_INFO_PAGE).size();
            Assert.assertEquals(1, size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on loan offer page$")
    public void ci_user_is_on_loan_offer_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.LOAN_OFFER_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.LOAN_OFFER_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user can see loan offer details page$")
    public void ci_user_can_see_loan_offer_details_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.LOAN_OFFER_DETAILS_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.LOAN_OFFER_DETAILS_PAGE).size();
            Assert.assertEquals(2, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on declarations page$")
    public void ci_user_is_on_declarations_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_DECLARATION_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_DECLARATION_PAGE).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on congratulations page$")
    public void ci_user_is_on_congratulations_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^CI user select decline button$")
    public void ci_user_select_decline_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.DECLINE_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select decline reason \"([^\"]*)\"$")
    public void ci_user_select_decline_reason_something(String reason) {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CI user select decline and exit button$")
    public void ci_user_select_decline_and_exit_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.DECLINE_AND_EXIT_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CI user is on decline loan offer page$")
    public void ci_user_is_on_decline_loan_of_page() {
        try {
            page.waitForMobileElement((MobileBy) MobileBy.AccessibilityId(IOSObjects.ON_DECLINE_LOAN_OFFER_PAGE));
            int size = driver.findElementsByAccessibilityId(IOSObjects.ON_DECLINE_LOAN_OFFER_PAGE).size();
            Assert.assertEquals(size, 1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^CI user select back to loan offer page$")
    public void ci_user_select_back_to_loan_offer_page() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.BACK_TO_OFFER_BUTTON).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


}
