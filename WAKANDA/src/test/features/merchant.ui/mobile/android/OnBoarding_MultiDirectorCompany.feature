@merchant-android
Feature: On-boarding - As a Merchant Android(MA) user, I want to be Onboarded to Wakanda

  @android-test
  Scenario Outline: Onboard - Multi-Director Company & Others
    Given MA user launch the merchant android app
    Then MA user is on lets get started
    When MA user select MultiDirector Company & Others business type
    And MA user select continue button
    When MA user enter business registration number "<business registration number>"
    And MA user enter full name "<full name>"
    And MA user enter designation "<designation>"
    And MA user enter phone number "<cell phone number>"
    And MA user enter email address "<email address>"
    And MA user give consent to wakanda to process personal info
    And MA user select generate otp button
    Then MA user is on otp verification page
    When MA user enter otp "<otp>" to verify mobile number
    And MA user select verify otp button
    Then MA user can see Wakanda reference number
    Then MA user can see message Wakanda will reach out to them within 48 hours displayed
    Then MA user can see message regarding email sent for requirements to complete registration process displayed

    Examples:
      | business registration number | full name | designation | cell phone number|email address | otp |
      |                              |           |             |                  |              |     |
