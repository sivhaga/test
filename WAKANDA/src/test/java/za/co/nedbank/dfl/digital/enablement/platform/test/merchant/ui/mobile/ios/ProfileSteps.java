package za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.ios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import za.co.nedbank.dfl.digital.enablement.platform.test.merchant.ui.mobile.DriverFactory;
import za.co.nedbank.dfl.digital.enablement.platform.test.utils.Utils;


public class ProfileSteps extends DriverFactory {

    private static Logger logger = Logger.getLogger(ProfileSteps.class);
    BasePageIOS page = new BasePageIOS();
    Utils util = new Utils();

    @When("^MI user select on my account$")
    public void mi_user_select_on_my_account() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see merchant name$")
    public void mi_user_can_see_merchant_name() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see waka id text$")
    public void mi_user_can_see_waka_id_text() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }

    }

    @Then("^MI user can see waka id$")
    public void mi_user_can_see_waka_id() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see times hire$")
    public void mi_user_can_see_times_hire() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see user rating$")
    public void mi_user_can_see_user_rating() {
        try {



        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see reviews$")
    public void mi_user_can_see_reviews() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see my past projects menu$")
    public void mi_user_can_see_my_past_projects_menu() {
        try{

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see statements menu$")
    public void mi_user_can_see_statements_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see reports and market insight menu$")
    public void mi_user_can_see_reports_and_market_insight_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see job settings menu$")
    public void mi_user_can_see_job_settings_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see payment settings menu$")
    public void mi_user_can_see_payment_settings_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see app settings menu$")
    public void mi_user_can_see_app_settings_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see my rewards menu$")
    public void mi_user_can_see_my_rewards_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see help and support menu$")
    public void mi_user_can_see_help_and_support_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see refer a friend menu$")
    public void mi_user_can_see_refer_a_friend_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see terms and conditions menu$")
    public void mi_user_can_see_terms_and_conditions_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see privacy policy menu$")
    public void mi_user_can_see_privacy_policy_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see about us menu$")
    public void mi_user_can_see_about_us_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see rate and share menu$")
    public void mi_user_can_see_rate_and_share_menu() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see logout$")
    public void mi_user_can_see_logout() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user scroll up$")
    public void mi_user_scroll_up()  {
        try {
            page.verticalSwipeByPercentage(0.9, 0.01, 0.5);
            util.secondsDelay(5);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user can see terms and conditions$")
    public void mi_user_can_see_terms_and_conditions()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @And("^MI user select terms and conditions$")
    public void mi_user_select_terms_and_conditions()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select logout$")
    public void mi_user_select_logout() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see private policy$")
    public void mi_user_can_see_private_policy(){
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select logout button$")
    public void mi_user_select_logout_button()  {
        try {
                //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see logout confirmation page$")
    public void mi_user_can_see_logout_confirmation_page()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select private policy$")
    public void mi_user_select_private_policy() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see about us$")
    public void mi_user_can_see_about_us() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user can see MI user select about us$")
    public void mi_user_select_about_us() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select refer a friend$")
    public void mi_user_select_refer_a_friend() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see referral reward for merchant$")
    public void mi_user_is_able_to_see_referral_reward_for_merchant() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see referral link for merchant$")
    public void mi_user_is_able_to_see_referral_link_for_merchant() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user is able to see referral reward for customer$")
    public void mi_user_is_able_to_see_referral_reward_for_customer() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see referral link for customer$")
    public void mi_user_is_able_to_see_referral_link_for_customer() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select rate us$")
    public void mi_user_select_rate_us() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on rate us page$")
    public void mi_user_is_on_rate_us_page() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select ratings$")
    public void mi_user_select_ratings() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select submit button$")
    public void mi_user_select_submit_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.VERIFY_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user enter comments \"([^\"]*)\"$")
    public void mi_user_enter_comments_something(String comments) {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select help and support$")
    public void mi_user_select_help_and_support() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see toll free contact number$")
    public void mi_user_can_see_toll_free_contact_number() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select my past projects$")
    public void mi_user_can_see_mi_user_select_my_past_projects() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select completed$")
    public void mi_user_can_see_mi_user_select_completed() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select on completed project$")
    public void mi_user_can_see_mi_user_select_on_completed_project() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on my project page$")
    public void mi_user_is_on_my_project_page() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see completed projects$")
    public void mi_user_can_see_completed_projects() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see customer name$")
    public void mi_user_can_see_customer_name() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see address$")
    public void mi_user_can_see_address() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see description$")
    public void mi_user_can_see_description() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select wallet security$")
    public void mi_user_select_wallet_security()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI face id authentication is set$")
    public void mi_user_can_see_face_id_authentication_is_set()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see email address$")
    public void mi_user_can_see_email_address()  {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select transaction types$")
    public void mi_user_select_transaction_types()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select this week$")
    public void mi_user_select_this_week()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select custom dates$")
    public void mi_user_select_custom_dates()  {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^MI user select phone number$")
    public void mi_user_select_phone_number() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enter phone number \"([^\"]*)\"$")
    public void mi_user_enter_phone_number_something(String phonenumber) {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select report and market insight$")
    public void mi_user_select_report_and_market_insight() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select view profile$")
    public void mi_user_select_view_profile() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see request for change$")
    public void mi_user_can_see_request_for_change() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see message we will verify this message and will revert in 48hours$")
    public void mi_user_can_see_message_we_will_verify_this_message_and_will_revert_in_48hours() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on request for change number page$")
    public void mi_user_is_on_request_for_change_number_page() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to view reports regarding the market or industry$")
    public void mi_user_is_able_to_view_reports_regarding_the_marketindustry() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see name$")
    public void mi_user_can_see_name() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see wakanda membership start date$")
    public void mi_user_can_see_wakanda_membership_start_date() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see membership id$")
    public void mi_user_can_see_membership_id() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see sa id$")
    public void mi_user_can_see_sa_id() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select submit request button$")
    public void mi_user_select_submit_request_button() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see business name$")
    public void mi_user_can_see_business_name() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see business registration number$")
    public void mi_user_can_see_business_registration_number() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable face id authentication$")
    public void mi_user_enable_face_id_authentication() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enabled touch id authentication$")
    public void mi_user_enabled_touch_id_authentication() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user face id authentication is disabled and enabled$")
    public void mi_user_face_id_authentication_is_disabled_and_enabled() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user touch id authentication is disabled and enabled$")
    public void mi_user_touch_id_authentication_is_disabled_and_enabled() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user disabled and enabled payments notifications$")
    public void mi_user_disabled_and_enabled_payments_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user disabled and enabled job notifications$")
    public void mi_user_disabled_and_enabled_job_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user disabled and enabled system notifications$")
    public void mi_user_disabled_and_enabled_system_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user disabled and enabled promotional notifications$")
    public void mi_user_disabled_and_enabled_promotional_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user disabled and enabled extra charge message$")
    public void mi_user_disabled_and_enabled_extra_charge_message() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user disabled and enabled receive notification$")
    public void mi_user_disabled_and_enabled_receive_notification() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see membership$")
    public void mi_user_can_see_membership() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user disable face id authentication$")
    public void mi_user_disable_face_id_authentication() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user disabled touch id authentication$")
    public void mi_user_disabled_touch_id_authentication() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see job id$")
    public void mi_user_can_see_job_id() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see project price and break-up$")
    public void mi_user_can_see_project_price_and_breakup() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see job activity and payment history$")
    public void mi_user_can_see_job_activity_and_payment_history() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see payment milestones$")
    public void mi_user_can_see_payment_milestones() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see chat history$")
    public void mi_user_can_see_chat_history() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see initiate refund$")
    public void mi_user_can_see_initiate_refund() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select cancelled$")
    public void mi_user_select_cancelled() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select on cancelled project$")
    public void mi_user_select_on_cancelled_project() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see cancelled projects$")
    public void mi_user_can_see_cancelled_projects() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see expected date$")
    public void mi_user_can_see_expected_date() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see budget$")
    public void mi_user_can_see_budget() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see photos$")
    public void mi_user_can_see_photos() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see cancellation date$")
    public void mi_user_can_see_cancellation_date() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see cancellation fee received$")
    public void mi_user_can_see_cancellation_fee_received() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see reason for cancellation$")
    public void mi_user_can_see_reason_for_cancellation() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select statements$")
    public void mi_user_select_statements() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select on statement icon$")
    public void mi_user_select_on_statement_icon() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user share statement$")
    public void mi_user_share_statement() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the statement page$")
    public void mi_user_is_on_the_statement_page() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see generate new statement$")
    public void mi_user_can_see_generate_new_statement() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see statement$")
    public void mi_user_can_see_statement() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can share statement$")
    public void mi_user_can_share_statement() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select generate new statement$")
    public void mi_user_select_generate_new_statement() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select today$")
    public void mi_user_select_today() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select back$")
    public void mi_user_select_back() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see wallet limits$")
    public void mi_user_can_see_wallet_limits() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see daily limit$")
    public void mi_user_can_see_daily_limit() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see monthly limit$")
    public void mi_user_can_see_monthly_limit() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see settlement to bank limit$")
    public void mi_user_can_see_settlement_to_bank_limit() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on the filter page$")
    public void mi_user_is_on_the_filter_page() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see list of transaction$")
    public void mi_user_is_able_to_see_list_of_transaction() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select view statement$")
    public void mi_user_select_view_statement() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can generate statement$")
    public void mi_user_can_generate_statement() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select this month$")
    public void mi_user_select_this_month() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable touch id authentication$")
    public void mi_user_enable_touch_id_authentication() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can set face id authentication$")
    public void mi_user_can_set_face_id_authentication() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can set touch id authentication$")
    public void mi_user_can_set_touch_id_authentication() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see statement gets generated$")
    public void mi_user_can_see_statement_gets_generated() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter \"([^\"]*)\"$")
    public void mi_user_enter_something(String receivedfrom) {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }




    @When("^MI user select download or share statement$")
    public void mi_user_select_downloadshare_statement() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select location$")
    public void mi_user_select_location() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^MI user select dates$")
    public void mi_user_select_dates() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select job settings$")
    public void mi_user_select_job_settings() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user on the job settings page$")
    public void mi_user_on_the_job_settings_page() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to change job location$")
    public void mi_user_is_able_to_change_job_location() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to restrict jobs by distance$")
    public void mi_user_is_able_to_restrict_jobs_by_distance() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to restrict jobs by budget$")
    public void mi_user_is_able_to_restrict_jobs_by_budget() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to set availability on days of the week and time slots$")
    public void mi_user_is_able_to_set_availability_on_days_of_the_week_and_time_slots() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to set unavailability$")
    public void mi_user_is_able_to_set_unavailability() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to set availability$")
    public void mi_user_is_able_to_set_availability() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select payment settings$")
    public void mi_user_select_payment_settings() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user on the payment settings page$")
    public void mi_user_on_the_payment_settings_page() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see bank name$")
    public void mi_user_can_see_bank_name() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see account holder$")
    public void mi_user_can_see_account_holder() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see account number partially masked$")
    public void mi_user_can_see_account_number_partially_masked() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see branch code$")
    public void mi_user_can_see_branch_code() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see account type$")
    public void mi_user_can_see_account_type() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select add another account$")
    public void mi_user_select_add_another_account() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^MI user select my rewards$")
    public void mi_user_select_my_rewards() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable auto settlement$")
    public void mi_user_enable_auto_settlement() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see settlements$")
    public void mi_user_can_see_settlements() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can set settlement instruction$")
    public void mi_user_can_set_settlement_instruction() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select account for profile$")
    public void mi_user_can_see_mi_user_select_account() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select settlement frequency$")
    public void mi_user_select_settlement_frequency() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is able to see waka points$")
    public void mi_user_is_able_to_see_waka_points() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user on the payment settings$")
    public void mi_user_on_the_payment_settings() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on add another account$")
    public void mi_user_is_on_add_another_account() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see login screen$")
    public void mi_user_can_see_login_screen() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see add confirmation screen$")
    public void mi_user_can_see_add_confirmation_screen() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select add Nedbank account option$")
    public void mi_user_select_add_nedbank_account_option() {
        try {

            driver.findElementByAccessibilityId(IOSObjects.ADD_NEDBANK_ACCOUNT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select nedbank account$")
    public void mi_user_select_nedbank_account()  {
        try {

            driver.findElementByAccessibilityId(IOSObjects.NEDBANK_ACCOUNT).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see wallet account details screen$")
    public void mi_user_can_see_wallet_account_details_screen() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see name field$")
    public void mi_user_can_see_name_field() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see account number$")
    public void mi_user_can_see_account_number() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see reference$")
    public void mi_user_can_see_reference() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select add another bank account option$")
    public void mi_user_select_add_another_bank_account_option() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select delete$")
    public void mi_user_select_delete() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see delete confirmation screen$")
    public void mi_user_can_see_delete_confirmation_screen() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see a delete confirmation screen$")
    public void mi_user_can_see_a_delete_confirmation_screen() {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user is on delete confirmation page$")
    public void mi_user_is_on_delete_confirmation_page() throws Throwable {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see a delete confirmation page$")
    public void mi_user_can_see_a_delete_confirmation_page() throws Throwable {
        try {

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select delete option$")
    public void mi_user_select_delete_option() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select payment setting$")
    public void mi_user_select_payment_setting() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select edit qr$")
    public void mi_user_select_edit_qr() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see manage qr$")
    public void mi_user_can_see_manage_qr() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see default qr display name$")
    public void mi_user_can_see_default_qr_display_name() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see qr display name is updated$")
    public void mi_user_can_see_qr_display_name_is_updated() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter qr display name \"([^\"]*)\"$")
    public void mi_user_enter_qr_display_name_something(String qrdisplayname) {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select update button$")
    public void mi_user_select_update_button() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select app settings$")
    public void mi_user_select_app_settings() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select change password$")
    public void mi_user_select_change_password() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see transaction charges$")
    public void mi_user_can_see_transaction_charges() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see wallet to wakanda wallet$")
    public void mi_user_can_see_wallet_to_wakanda_wallet() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see wallet to other target source$")
    public void mi_user_can_see_wallet_to_other_target_source() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see login security$")
    public void mi_user_can_see_mi_user_can_see_login_security() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see confirmation message$")
    public void mi_user_can_see_confirmation_message() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select save$")
    public void mi_user_select_save() {
        try {
            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user select change pin$")
    public void mi_user_select_change_pin() {
        try {

            //driver.findElementByAccessibilityId(IOSObjects.FILL).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user enter current pin \"([^\"]*)\"$")
    public void mi_user_enter_current_pin_something(String pin) {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user select confirm button$")
    public void mi_user_select_confirm_button() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.CONFIRM_BUTTON).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable payments notifications$")
    public void mi_user_enable_payments_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable job notifications$")
    public void mi_user_enable_job_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable system notifications$")
    public void mi_user_enable_system_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable promotional notifications$")
    public void mi_user_enable_promotional_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user enable receive notification$")
    public void mi_user_enable_receive_notification() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^MI user disable receive notification$")
    public void mi_user_disable_receive_notification() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^MI user can see wallet security$")
    public void mi_user_can_see_wallet_security() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^MI user can see notifications$")
    public void mi_user_can_see_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }



    @Then("^MI user can see extra charge message$")
    public void mi_user_can_see_extra_charge_message() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user disable payments notifications$")
    public void mi_user_disable_payments_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user disable job notifications$")
    public void mi_user_disable_job_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user disable system notifications$")
    public void mi_user_disable_system_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^MI user disable promotional notifications$")
    public void mi_user_disable_promotional_notifications() {
        try {


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}