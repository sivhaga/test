package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.android;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;

public class PersonalLoansSteps extends DriverFactory {
    private static Logger logger = Logger.getLogger(PersonalLoansSteps.class);
    BasePageAndroid page = new BasePageAndroid();
    Utils util = new Utils();

    @When("^CA user select personal loans category$")
    public void ci_user_select_personal_loans_category() {
        try {
              driver.findElements(By.id(AndroidObjects.CATEGORY_ICON)).get(3).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select offers button$")
    public void ca_user_select_offers_button() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select personal loans button$")
    public void ca_user_select_personal_loans_button() {
        try {
           driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user consent they have regular income$")
    public void ca_user_consent_they_have_regular_income() {
        try {
               driver.findElement(By.id(AndroidObjects.PERSONAL_LOANS_TERMS_ONE)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user consent they have no spouse to object$")
    public void ca_user_consent_they_have_no_spouse_to_object() {
        try {
            driver.findElement(By.id(AndroidObjects.PERSONAL_LOANS_TERMS_TWO)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user consent they are are not insolvent$")
    public void ca_user_consent_they_are_are_not_insolvent() {
        try {
            driver.findElements(By.className(AndroidObjects.CHECK_BOXES)).get(2).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select get your pre approved loan button$")
    public void ca_user_select_get_your_pre_approved_loan_button() {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.GET_PRE_APPROVED_LOAN)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter Nedbank id username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void ca_user_enter_nedbank_id_username_something_and_password_something(String nedbankUsername, String nedbankPassword) {
        try {
            MobileElement username = driver.findElement(By.id("username")).findElements(By.className("android.widget.EditText")).get(0);
            username.click();
            username.sendKeys("");
            username.setValue(nedbankUsername);
            driver.hideKeyboard();

            MobileElement password = driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.NED_ID_PASSWORD));
            password.click();
            password.sendKeys("");
            password.setValue(nedbankPassword);
            driver.hideKeyboard();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select Nedbank id login button$")
    public void ca_user_select_nedbank_id_login_button() {
        try {
             driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.LOGIN_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user give consent for credit and affordability check$")
    public void ca_user_give_consent_for_credit_and_affordability_check() {
        try {
             driver.findElement(By.id(AndroidObjects.ALLOW_CREDIT_CHECK)).click();
            util.secondsDelay(2);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on offers page$")
    public void ca_user_is_on_offers_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on instant loan page$")
    public void ca_user_is_on_you_could_qualify_for_instant_loan_page() {
        try {
            String message = driver.findElement(By.id(AndroidObjects.YOU_QUALIFY_FOR_MESSAGE)).getText();
            Assert.assertEquals(message,AndroidDataFactory.YOU_COULD_QUALIFY_FOR_LOAN);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on connect your Nedbank account page$")
    public void ca_user_is_on_connect_your_nedbank_account_page() {
        try {
            String message = driver.findElement(By.id(AndroidObjects.YOU_QUALIFY_FOR_MESSAGE)).getText();
            Assert.assertEquals(message,AndroidDataFactory.NED_ID_MESSAGE);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on financial information page$")
    public void ca_user_is_on_financial_information_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.BEST_OFFER)).size();
            Assert.assertEquals(1,size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select income type \"([^\"]*)\"$")
    public void ca_user_select_income_type(String incomeType) {
        try {
            switch(incomeType) {
                case "Fixed income":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FIXED_INCOME)).click();
                    break;
                case "Flexible income":
                    driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.FLEXIBLE_INCOME)).click();
                    break;
                default:
                    logger.info("Invalid income type selected : " + incomeType);
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter net monthly income \"([^\"]*)\"$")
    public void ca_user_enter_net_monthly_income_something(String netMonthlyIncome) {
        try {
            MobileElement username = driver.findElement(By.id("net_income")).findElements(By.className("android.widget.EditText")).get(0);
            username.click();
            username.sendKeys("");
            username.setValue(netMonthlyIncome);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter total monthly expenses \"([^\"]*)\"$")
    public void ca_user_enter_total_monthly_expenses_something(String totalMonthlyExpenses) {
        MobileElement username = driver.findElement(By.id("total_expense")).findElements(By.className("android.widget.EditText")).get(0);
        username.click();
        username.sendKeys("");
        username.setValue(totalMonthlyExpenses);
        driver.hideKeyboard();
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter monthly contractual debt \"([^\"]*)\"$")
    public void ca_user_enter_monthly_contractual_debt_something(String monthlyContractualDebt) {
        try {
            MobileElement username = driver.findElement(By.id("debt")).findElements(By.className("android.widget.EditText")).get(0);
            username.click();
            username.sendKeys("");
            username.setValue(monthlyContractualDebt);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter monthly living expenses \"([^\"]*)\"$")
    public void ca_user_enter_monthly_living_expenses_something(String monthlyLivingExpenses) {
        try {
            MobileElement username = driver.findElement(By.id("living_expense")).findElements(By.className("android.widget.EditText")).get(0);
            username.click();
            username.sendKeys("");
            username.setValue(monthlyLivingExpenses);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select number of months to pay \"([^\"]*)\"$")
    public void ca_user_select_number_of_months_to_pay_something(String numberofmonthstopay) {
        try {
              driver.findElement(By.id("installments_list")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user enter email address \"([^\"]*)\"$")
    public void ca_user_enter_email_address(String email) {
        try {
            driver.findElements(By.className(AndroidObjects.EDIT_TEXT_VIEWS)).get(0).click();
            driver.findElements(By.className(AndroidObjects.EDIT_TEXT_VIEWS)).get(0).setValue(email);
            driver.hideKeyboard();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user accepts they have read offer documentation$")
    public void ca_user_accepts_they_have_read_offer_documentation() {
        try {
            driver.findElement(By.id(AndroidObjects.ACCEPT_LOAN_OFFER_DOCUMENTATION)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user accepts terms and conditions$")
    public void ca_user_accepts_terms_and_conditions() {
        try {
            driver.findElement(By.id(AndroidObjects.ACCEPT_LOAN_OFFER_TERMS_AND_CONDITIONS)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select accept and confirm button$")
    public void ca_user_select_accept_and_confirm_button() {
        try {
            driver.findElement(By.id(AndroidObjects.ACCEPT_AND_CONFIRM_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select done button$")
    public void ca_user_select_done_button() {
        try {
            driver.findElement(By.id(AndroidObjects.LOAN_OFFER_CONRATULATIONS_PAGE_DONE_BUTTON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on loan offer page$")
    public void ca_user_is_on_loan_offer_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.LOAN_OFFER_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user can see loan offer details page$")
    public void ca_user_can_see_loan_offer_details_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.LOAN_OFFER_DETAILS_PAGE)).size();
            Assert.assertEquals(1, size);
            String loanAmount = driver.findElement(By.id(AndroidObjects.LOAN_AMOUNT)).getText();
            Assert.assertEquals(loanAmount,AndroidDataFactory.LOAN_AMOUNT);
            String interestRate = driver.findElement(By.id(AndroidObjects.INTEREST_RATE)).getText();
            Assert.assertEquals(interestRate,AndroidDataFactory.INTEREST_RATE);
            String monthlyPayment = driver.findElement(By.id(AndroidObjects.MONTHLY_PAYMENT)).getText();
            Assert.assertEquals(monthlyPayment,AndroidDataFactory.MONTHLY_PAYMENTS);
            String numberOfInstallments = driver.findElement(By.id(AndroidObjects.NUMBER_OF_INSTALLMENTS)).getText();
            Assert.assertEquals(numberOfInstallments,AndroidDataFactory.NUMBER_OF_INSTALLMENTS);
            String totalToPay = driver.findElement(By.id(AndroidObjects.TOTAL_TO_PAY_BACK)).getText();
            Assert.assertEquals(totalToPay,AndroidDataFactory.TOTAL_TO_PAY);
            String costRatio = driver.findElement(By.id(AndroidObjects.CREDIT_COST_RATIO)).getText();
            Assert.assertEquals(costRatio,AndroidDataFactory.CREDIT_COST_RATIO);
            String accountToDebit = driver.findElement(By.id(AndroidObjects.DEBIT_ACCOUNT_TITLE)).getText();
            Assert.assertEquals(accountToDebit,AndroidDataFactory.ACCOUNT_TO_DEBIT);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on declarations page$")
    public void ca_user_is_on_declarations_page() {
        try {
            util.secondsDelay(3);
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_DECLARATION_PAGE)).size();
            Assert.assertEquals(1, size);
            String title1 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_TITLE1)).getText();
            String message1 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_MESSAGE1)).getText();
            Assert.assertEquals(title1,AndroidDataFactory.DECLARATION_PAGE_TITLE1);
            Assert.assertEquals(message1,AndroidDataFactory.DECLARATION_PAGE_MESSAGE1);

            String title2 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_TITLE2)).getText();
            String message2 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_MESSAGE2)).getText();
            Assert.assertEquals(title2,AndroidDataFactory.DECLARATION_PAGE_TITLE2);
            Assert.assertEquals(message2,AndroidDataFactory.DECLARATION_PAGE_MESSAGE2);


            String title3 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_TITLE3)).getText();
            String message3 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_MESSAGE3)).getText();
            Assert.assertEquals(title3,AndroidDataFactory.DECLARATION_PAGE_TITLE3);
            Assert.assertEquals(message3,AndroidDataFactory.DECLARATION_PAGE_MESSAGE3);

            String title4 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_TITLE4)).getText();
            String message4 = driver.findElement(By.id(AndroidObjects.DECLARATION_PAGE_MESSAGE4)).getText();
            Assert.assertEquals(title4,AndroidDataFactory.DECLARATION_PAGE_TITLE4);
            Assert.assertEquals(message4,AndroidDataFactory.DECLARATION_PAGE_MESSAGE4);


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on congratulations page$")
    public void ca_user_is_on_congratulations_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_LOAN_OFFER_CONRATULATIONS_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @When("^CA user select decline button$")
    public void ca_user_select_decline_button() {
        try {
                driver.findElement(By.id(AndroidObjects.DECLINE_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select decline reason \"([^\"]*)\"$")
    public void ca_user_select_decline_reason_something(String reason) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^CA user select decline and exit button$")
    public void ca_user_select_decline_and_exit_button() {
        try {
            driver.findElement(By.id(AndroidObjects.DECLINE_AND_EXIT_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^CA user is on decline loan offer page$")
    public void ca_user_is_on_decline_loan_offer_page() {
        try {
            util.secondsDelay(2);
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidObjects.ON_DECLINE_LOAN_OFFER_PAGE)).size();
            Assert.assertEquals(size,1);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^CA user select back to loan offer page$")
    public void ca_user_select_back_to_loan_offer_page() {
        try {
              driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.BACK_TO_OFFER_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}
