//package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.android;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import org.apache.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
//import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;
//
//public class ProfileSteps extends DriverFactory {
//
//    private static Logger logger = Logger.getLogger(ProfileSteps.class);
//    BasePageAndroid page = new BasePageAndroid();
//    Utils util = new Utils();
//
//    @When("^MA user select on my account$")
//    public void ma_user_select_on_my_account() {
//        try {
//            driver.findElement(By.id(AndroidObjects.MY_ACCOUNT)).click();
//            util.secondsDelay(2);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see merchant name$")
//    public void ma_user_can_see_merchant_name() {
//        try {
//            String merchantName = driver.findElement(By.id(AndroidObjects.MERCHANT_NAME)).getText();
//
//            //Check if element is not empty
//            Assert.assertEquals(false, merchantName.isEmpty());
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see waka id text$")
//    public void ma_user_can_see_waka_id_text() {
//        try {
//            String wakaIdtext = driver.findElement(By.id("id_label")).getText();
//            Assert.assertEquals("Label not matching", AndroidDataFactory.WAKA_ID_TEXT,wakaIdtext);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//
//    }
//
//    @Then("^MA user can see waka id$")
//    public void ma_user_can_see_waka_id() {
//        try {
//            String wakaId = driver.findElement(By.id(AndroidObjects.WAKA_ID)).getText();
//            Assert.assertEquals(false, wakaId.isEmpty()); //Check if element is not empty
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see times hire$")
//    public void ma_user_can_see_times_hire() {
//        try {
//
//            String timesHire = driver.findElement(By.id("hired_content")).findElement(By.id("hired")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(1).getText();
//            Assert.assertEquals("Label not matching", timesHire, AndroidDataFactory.TIMES_HIRE);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see user rating$")
//    public void ma_user_can_see_user_rating() {
//        try {
//
//            String timesHire = driver.findElement(By.id("rating_content")).findElement(By.id("rating")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(1).getText();
//            Assert.assertEquals("Label not matching", timesHire, AndroidDataFactory.USER_RATING);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see reviews$")
//    public void ma_user_can_see_reviews() {
//        try {
//            String timesHire = driver.findElement(By.id("reviews_content")).findElement(By.id("reviews")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(1).getText();
//            Assert.assertEquals("Label not matching", timesHire, AndroidDataFactory.REVIEWS);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see my past projects menu$")
//    public void ma_user_can_see_my_past_projects_menu() {
//        try {
//            String text = driver.findElement(By.id("past_projects_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.PAST_PROJECTS_CONTENT);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see statements menu$")
//    public void ma_user_can_see_statements_menu() {
//        try {
//            String text = driver.findElement(By.id("statements_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.STATEMENTS_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see reports and market insight menu$")
//    public void ma_user_can_see_reports_and_market_insight_menu() {
//        try {
//            String text = driver.findElement(By.id("reports_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.REPORTS_CONTENT);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see job settings menu$")
//    public void ma_user_can_see_job_settings_menu() {
//        try {
//            String text = driver.findElement(By.id("job_settings_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.JOB_SETTINGS_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see payment settings menu$")
//    public void ma_user_can_see_payment_settings_menu() {
//        try {
//            //
//            String text = driver.findElement(By.id("payment_settings_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.PAYMENT_SETTINGS_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see app settings menu$")
//    public void ma_user_can_see_app_settings_menu() {
//        try {
//            String text = driver.findElement(By.id("app_settings_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.APP_SETTINGS_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see my rewards menu$")
//    public void ma_user_can_see_my_rewards_menu() {
//        try {
//            String text = driver.findElement(By.id("rewards_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.REWARDS_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see help and support menu$")
//    public void ma_user_can_see_help_and_support_menu() {
//        try {
//            String text = driver.findElement(By.id("help_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.HELP_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see refer a friend menu$")
//    public void ma_user_can_see_refer_a_friend_menu() {
//        try {
//            String text = driver.findElement(By.id("refer_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.REFER_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see terms and conditions menu$")
//    public void ma_user_can_see_terms_and_conditions_menu() {
//        try {
//            String text = driver.findElement(By.id("tc_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.TC_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see privacy policy menu$")
//    public void ma_user_can_see_privacy_policy_menu() {
//        try {
//            String text = driver.findElement(By.id("privacy_policy_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.PRIVACY_POLICY_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see about us menu$")
//    public void ma_user_can_see_about_us_menu() {
//        try {
//            String text = driver.findElement(By.id("about_us_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.ABOUT_US_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see rate and share menu$")
//    public void ma_user_can_see_rate_and_share_menu() {
//        try {
//            String text = driver.findElement(By.id("rate_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.RATE_SHARE);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see logout$")
//    public void ma_user_can_see_logout() {
//        try {
//            String text = driver.findElement(By.id("logout_button")).getText();
//            Assert.assertEquals("Label not matching", text, AndroidDataFactory.LOGOUT_CONTENT);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user scroll up$")
//    public void ma_user_scroll_up()  {
//        try {
//            page.verticalSwipeByPercentages(0.9, 0.01, 0.5);
//            util.secondsDelay(5);
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user can see terms and conditions$")
//    public void ma_user_can_see_terms_and_conditions()  {
//        try {
//            String titlePage = driver.findElement(By.id(AndroidObjects.TERMS_AND_CONDITIONS)).getText();
//            Assert.assertTrue(titlePage.contains(AndroidDataFactory.TERMS_AND_CONDITIONS));
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//
//    @And("^MA user select terms and conditions$")
//    public void ma_user_select_terms_and_conditions()  {
//        try {
//            driver.findElement(By.id("refer_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select logout$")
//    public void ma_user_select_logout() {
//        try {
//            driver.findElement(By.id("logout_button")).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see private policy$")
//    public void ma_user_can_see_private_policy(){
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//
//    @And("^MA user select private policy$")
//    public void ma_user_select_private_policy() {
//        try {
//            driver.findElement(By.id("privacy_policy_content")).findElements(By.className(AndroidObjects.TEXTS_VIEWS)).get(0).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see about us$")
//    public void ma_user_can_see_about_us() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user can see MA user select about us$")
//    public void ma_user_select_about_us() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select refer a friend$")
//    public void ma_user_select_refer_a_friend() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see referral reward for merchant$")
//    public void ma_user_is_able_to_see_referral_reward_for_merchant() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see referral link for merchant$")
//    public void ma_user_is_able_to_see_referral_link_for_merchant() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user is able to see referral reward for customer$")
//    public void ma_user_is_able_to_see_referral_reward_for_customer() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see referral link for customer$")
//    public void ma_user_is_able_to_see_referral_link_for_customer() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select rate us$")
//    public void ma_user_select_rate_us() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on rate us page$")
//    public void ma_user_is_on_rate_us_page() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select ratings$")
//    public void ma_user_select_ratings() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select submit button$")
//    public void ma_user_select_submit_button() {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user enter comments \"([^\"]*)\"$")
//    public void ma_user_enter_comments_something(String comments) {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select help and support$")
//    public void ma_user_select_help_and_support() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see toll free contact number$")
//    public void ma_user_can_see_toll_free_contact_number() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select my past projects$")
//    public void ma_user_can_see_ma_user_select_my_past_projects() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select completed$")
//    public void ma_user_can_see_ma_user_select_completed() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select on completed project$")
//    public void ma_user_can_see_ma_user_select_on_completed_project() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on my project page$")
//    public void ma_user_is_on_my_project_page() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see completed projects$")
//    public void ma_user_can_see_completed_projects() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see customer name$")
//    public void ma_user_can_see_customer_name() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see address$")
//    public void ma_user_can_see_address() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see description$")
//    public void ma_user_can_see_description() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select wallet security$")
//    public void ma_user_select_wallet_security()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA face id authentication is set$")
//    public void ma_user_can_see_face_id_authentication_is_set()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see email address$")
//    public void ma_user_can_see_email_address()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user select transaction types$")
//    public void ma_user_select_transaction_types()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user select this week$")
//    public void ma_user_select_this_week()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select custom dates$")
//    public void ma_user_select_custom_dates()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^Project status$")
//    public void ma_user_can_see_project_status() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select phone number$")
//    public void ma_user_select_phone_number() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter phone number \"([^\"]*)\"$")
//    public void ma_user_enter_phone_number_something(String phonenumber) {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select report and market insight$")
//    public void ma_user_select_report_and_market_insight() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select view profile$")
//    public void ma_user_select_view_profile() {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.VIEW_PROFILE_BUTTON)).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select about$")
//    public void ma_user_select_about() {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.ABOUT_BUTTON)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//
//    }
//
//    @And("^MA user select save changes$")
//    public void ma_user_select_save_changes() {
//        try {
//            driver.findElement(MobileBy.AndroidUIAutomator(AndroidObjects.SAVE_CHANGES_BUTTON)).click();
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see request for change$")
//    public void ma_user_can_see_request_for_change() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see message we will verify this message and will revert in 48hours$")
//    public void ma_user_can_see_message_we_will_verify_this_message_and_will_revert_in_48hours() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on request for change number page$")
//    public void ma_user_is_on_request_for_change_number_page() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to view reports regarding the market or industry$")
//    public void ma_user_is_able_to_view_reports_regarding_the_marketindustry() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see name$")
//    public void ma_user_can_see_name() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see wakanda membership start date$")
//    public void ma_user_can_see_wakanda_membership_start_date() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see membership id$")
//    public void ma_user_can_see_membership_id() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see sa id$")
//    public void ma_user_can_see_sa_id() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select submit request button$")
//    public void ma_user_select_submit_request_button() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see business name$")
//    public void ma_user_can_see_business_name() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see business registration number$")
//    public void ma_user_can_see_business_registration_number() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable face id authentication$")
//    public void ma_user_enable_face_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enabled touch id authentication$")
//    public void ma_user_enabled_touch_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user face id authentication is disabled and enabled$")
//    public void ma_user_face_id_authentication_is_disabled_and_enabled() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user touch id authentication is disabled and enabled$")
//    public void ma_user_touch_id_authentication_is_disabled_and_enabled() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user disabled and enabled payments notifications$")
//    public void ma_user_disabled_and_enabled_payments_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user disabled and enabled job notifications$")
//    public void ma_user_disabled_and_enabled_job_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user disabled and enabled system notifications$")
//    public void ma_user_disabled_and_enabled_system_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user disabled and enabled promotional notifications$")
//    public void ma_user_disabled_and_enabled_promotional_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user disabled and enabled extra charge message$")
//    public void ma_user_disabled_and_enabled_extra_charge_message() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user disabled and enabled receive notification$")
//    public void ma_user_disabled_and_enabled_receive_notification() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see membership$")
//    public void ma_user_can_see_membership() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user disable face id authentication$")
//    public void ma_user_disable_face_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user disabled touch id authentication$")
//    public void ma_user_disabled_touch_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see job id$")
//    public void ma_user_can_see_job_id() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see project price and break-up$")
//    public void ma_user_can_see_project_price_and_breakup() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see job activity and payment history$")
//    public void ma_user_can_see_job_activity_and_payment_history() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see payment milestones$")
//    public void ma_user_can_see_payment_milestones() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see chat history$")
//    public void ma_user_can_see_chat_history() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see initiate refund$")
//    public void ma_user_can_see_initiate_refund() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select cancelled$")
//    public void ma_user_select_cancelled() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select on cancelled project$")
//    public void ma_user_select_on_cancelled_project() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see cancelled projects$")
//    public void ma_user_can_see_cancelled_projects() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see expected date$")
//    public void ma_user_can_see_expected_date() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see budget$")
//    public void ma_user_can_see_budget() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see photos$")
//    public void ma_user_can_see_photos() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see cancellation date$")
//    public void ma_user_can_see_cancellation_date() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see cancellation fee received$")
//    public void ma_user_can_see_cancellation_fee_received() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see reason for cancellation$")
//    public void ma_user_can_see_reason_for_cancellation() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select statements$")
//    public void ma_user_select_statements() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select on statement icon$")
//    public void ma_user_select_on_statement_icon() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user share statement$")
//    public void ma_user_share_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the statement page$")
//    public void ma_user_is_on_the_statement_page() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see generate new statement$")
//    public void ma_user_can_see_generate_new_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see statement$")
//    public void ma_user_can_see_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can share statement$")
//    public void ma_user_can_share_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select generate new statement$")
//    public void ma_user_select_generate_new_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select today$")
//    public void ma_user_select_today() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select back$")
//    public void ma_user_select_back() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see wallet limits$")
//    public void ma_user_can_see_wallet_limits() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see daily limit$")
//    public void ma_user_can_see_daily_limit() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see monthly limit$")
//    public void ma_user_can_see_monthly_limit() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see settlement to bank limit$")
//    public void ma_user_can_see_settlement_to_bank_limit() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on the filter page$")
//    public void ma_user_is_on_the_filter_page() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see list of transaction$")
//    public void ma_user_is_able_to_see_list_of_transaction() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select view statement$")
//    public void ma_user_select_view_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can generate statement$")
//    public void ma_user_can_generate_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select this month$")
//    public void ma_user_select_this_month() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable touch id authentication$")
//    public void ma_user_enable_touch_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can set face id authentication$")
//    public void ma_user_can_set_face_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can set touch id authentication$")
//    public void ma_user_can_set_touch_id_authentication() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see statement gets generated$")
//    public void ma_user_can_see_statement_gets_generated() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter \"([^\"]*)\"$")
//    public void ma_user_enter_something(String receivedfrom) {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//
//
//    @When("^MA user select download or share statement$")
//    public void ma_user_select_downloadshare_statement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user select location$")
//    public void ma_user_select_location() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @And("^MA user select dates$")
//    public void ma_user_select_dates() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select job settings$")
//    public void ma_user_select_job_settings() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user on the job settings page$")
//    public void ma_user_on_the_job_settings_page() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to change job location$")
//    public void ma_user_is_able_to_change_job_location() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to restrict jobs by distance$")
//    public void ma_user_is_able_to_restrict_jobs_by_distance() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to restrict jobs by budget$")
//    public void ma_user_is_able_to_restrict_jobs_by_budget() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to set availability on days of the week and time slots$")
//    public void ma_user_is_able_to_set_availability_on_days_of_the_week_and_time_slots() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to set unavailability$")
//    public void ma_user_is_able_to_set_unavailability() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to set availability$")
//    public void ma_user_is_able_to_set_availability() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select payment settings$")
//    public void ma_user_select_payment_settings() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user on the payment settings page$")
//    public void ma_user_on_the_payment_settings_page() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see bank name$")
//    public void ma_user_can_see_bank_name() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see account holder$")
//    public void ma_user_can_see_account_holder() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see account number partially masked$")
//    public void ma_user_can_see_account_number_partially_masked() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see branch code$")
//    public void ma_user_can_see_branch_code() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see account type$")
//    public void ma_user_can_see_account_type() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select add another account$")
//    public void ma_user_select_add_another_account() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @When("^MA user select my rewards$")
//    public void ma_user_select_my_rewards() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable auto settlement$")
//    public void ma_user_enable_auto_settlement() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see settlements$")
//    public void ma_user_can_see_settlements() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can set settlement instruction$")
//    public void ma_user_can_set_settlement_instruction() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select account for profile$")
//    public void ma_user_can_see_ma_user_select_account() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select settlement frequency$")
//    public void ma_user_select_settlement_frequency() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is able to see waka points$")
//    public void ma_user_is_able_to_see_waka_points() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enter MA user id \"([^\"]*)\" as MA user id$")
//    public void ma_user_enter_ma_user_id_something_as_ma_user_id(String userid) {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select edit button$")
//    public void ma_user_select_edit_button()  {
//        try {
//            driver.findElement(By.id("business_details_label")).findElements(By.className(AndroidObjects.IMAGE_VIEW)).get(0).click();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on business details screen$")
//    public void ma_user_is_on_business_details_screen()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user details are updated$")
//    public void ma_user_details_are_updated()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter business description \"([^\"]*)\"$")
//    public void ma_user_enter_business_description_something(String businessdescription) {
//        try {
//            MobileElement element = driver.findElement(By.id("description_content")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(businessdescription);
//            driver.hideKeyboard();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter email address \"([^\"]*)\"$")
//    public void ma_user_enter_email_address_something(String emailaddress) {
//        try {
//            MobileElement element = driver.findElement(By.id("email_content")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(emailaddress);
//            driver.hideKeyboard();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter secondary number \"([^\"]*)\"$")
//    public void ma_user_enter_secondary_number_something(String secondarynumber) {
//        try {
//            MobileElement element = driver.findElement(By.id("mobile_content")).findElements(By.className("android.widget.EditText")).get(0);
//            element.click();
//            element.sendKeys("");
//            element.setValue(secondarynumber);
//            driver.hideKeyboard();
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//    @Then("^MA user on the payment settings$")
//    public void ma_user_on_the_payment_settings() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on add another account$")
//    public void ma_user_is_on_add_another_account() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see login screen$")
//    public void ma_user_can_see_login_screen() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see add confirmation screen$")
//    public void ma_user_can_see_add_confirmation_screen() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select add Nedbank account option$")
//    public void ma_user_select_add_nedbank_account_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select nedbank account$")
//    public void ma_user_select_nedbank_account()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//    @And("^MA user enter password \"([^\"]*)\" as password$")
//    public void ma_user_enter_password_something_as_password(String password) {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see wallet account details screen$")
//    public void ma_user_can_see_wallet_account_details_screen() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see name field$")
//    public void ma_user_can_see_name_field() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see account number$")
//    public void ma_user_can_see_account_number() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see reference$")
//    public void ma_user_can_see_reference() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select add another bank account option$")
//    public void ma_user_select_add_another_bank_account_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select delete$")
//    public void ma_user_select_delete() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see delete confirmation screen$")
//    public void ma_user_can_see_delete_confirmation_screen() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see a delete confirmation screen$")
//    public void ma_user_can_see_a_delete_confirmation_screen() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select delete option$")
//    public void ma_user_select_delete_option() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select payment setting$")
//    public void ma_user_select_payment_setting() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select edit qr$")
//    public void ma_user_select_edit_qr() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see manage qr$")
//    public void ma_user_can_see_manage_qr() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see default qr display name$")
//    public void ma_user_can_see_default_qr_display_name() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see qr display name is updated$")
//    public void ma_user_can_see_qr_display_name_is_updated() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter qr display name \"([^\"]*)\"$")
//    public void ma_user_enter_qr_display_name_something(String qrdisplayname) {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select update button$")
//    public void ma_user_select_update_button() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select app settings$")
//    public void ma_user_select_app_settings() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select change password$")
//    public void ma_user_select_change_password() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see transaction charges$")
//    public void ma_user_can_see_transaction_charges() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see wallet to wakanda wallet$")
//    public void ma_user_can_see_wallet_to_wakanda_wallet() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see wallet to other target source$")
//    public void ma_user_can_see_wallet_to_other_target_source() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see login security$")
//    public void ma_user_can_see_ma_user_can_see_login_security() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see confirmation message$")
//    public void ma_user_can_see_confirmation_message() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select save$")
//    public void ma_user_select_save() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user select change pin$")
//    public void ma_user_select_change_pin() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user enter current pin \"([^\"]*)\"$")
//    public void ma_user_enter_current_pin_something(String pin) {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user select confirm button$")
//    public void ma_user_select_confirm_button() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable payments notifications$")
//    public void ma_user_enable_payments_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable job notifications$")
//    public void ma_user_enable_job_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable system notifications$")
//    public void ma_user_enable_system_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable promotional notifications$")
//    public void ma_user_enable_promotional_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user enable receive notification$")
//    public void ma_user_enable_receive_notification() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @When("^MA user disable receive notification$")
//    public void ma_user_disable_receive_notification() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see wallet security$")
//    public void ma_user_can_see_wallet_security() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @Then("^MA user can see notifications$")
//    public void ma_user_can_see_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//
//    @Then("^MA user can see extra charge message$")
//    public void ma_user_can_see_extra_charge_message() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user disable payments notifications$")
//    public void ma_user_disable_payments_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user disable job notifications$")
//    public void ma_user_disable_job_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user disable system notifications$")
//    public void ma_user_disable_system_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @And("^MA user disable promotional notifications$")
//    public void ma_user_disable_promotional_notifications() {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on login page$")
//    public void ma_user_is_on_login_page()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see add confirmation page$")
//    public void ma_user_can_see_add_confirmation_page()  {
//        try {
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see a confirmation page with top up details$")
//    public void ma_user_can_see_a_confirmation_page_with_top_up_details()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on add money page$")
//    public void ma_user_is_on_add_money_page()  {
//        try {
//            String titlePage = driver.findElement(By.id(AndroidObjects.TOP_UP)).getText();
//            Assert.assertEquals(titlePage, AndroidDataFactory.TOP_UP);
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//    @When("^MA user select logout button$")
//    public void ma_user_select_logout_button()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see logout confirmation page$")
//    public void ma_user_can_see_logout_confirmation_page()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on Wallet account details page$")
//    public void ma_user_is_on_wallet_account_details_page()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see name label$")
//    public void ma_user_can_see_name_label()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see account number label$")
//    public void ma_user_can_see_account_number_label()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see bank name label$")
//    public void ma_user_can_see_bank_name_label()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see branch code label$")
//    public void ma_user_can_see_branch_code_label()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see reference label$")
//    public void ma_user_can_see_reference_label()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user is on delete confirmation page$")
//    public void ma_user_is_on_delete_confirmation_page()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//    @Then("^MA user can see a delete confirmation page$")
//    public void ma_user_can_see_a_delete_confirmation_page()  {
//        try {
//
//
//        } catch (Exception ex) {
//            logger.info(ex.getStackTrace());
//        }
//    }
//
//
//}