package za.co.nedbank.dfl.digital.enablement.platform.test.customer.ui.mobile.ios;

public class IOSObjects {

    /**
     * Common objects
     */

    public static String TEXT_FIELDS = "XCUIElementTypeTextField";
    public static String SECURE_TEXT_FIELDS = "XCUIElementTypeSecureTextField";
    public static String TEXT_VIEWS = "XCUIElementTypeStaticText";
    public static String TEXT_VIEW_AREA ="XCUIElementTypeTextView";
    public static String BUTTONS = "XCUIElementTypeButton";
    public static String CELLS = "XCUIElementTypeCell";
    public static String PICKERWHEEL = "XCUIElementTypePickerWheel";
    public static String FILL = "";
    public static String PLUS_BUTTON = "(//XCUIElementTypeButton[@name=\" ＋\"])[1]";
    public static String MINUS_BUTTON = "//XCUIElementTypeStaticText[@name=\"− \"]";
    public static String IMAGES = "XCUIElementTypeImage";

    /**
     * Login and enrolment
     */
    public static String PROPOSITION_PAGE_ONE = "Services. Products. Recharges.";
    public static String PROPOSITION_PAGE_TWO = "Order now.\nPay when you're happy.";
    public static String PROPOSITION_PAGE_THREE = "Nedbank. MobiMoney.";
    public static String LETS_GET_STARTED_BUTTON = "LET'S GET STARTED";
    public static String VERIFY_USERNAME_BUTTON = "VERIFY USERNAME";
    public static String CONTINUE_BUTTON = "CONTINUE";
    public static String ON_USERNAME_PAGE = "Username";
    public static String LOGIN_BUTTON = "LOGIN";
    public static String ON_PASSWORD_PAGE = "Enter your password";
    public static String ON_OTP_PAGE = "OTP Verification";
    public static String PIN_ONE = "pin_1";
    public static String PIN_TWO = "pin_2";
    public static String PIN_THREE = "pin_3";
    public static String PIN_FOUR = "pin_4";
    public static String PIN_FIVE = "pin_5";
    public static String VERIFY_BUTTON = "VERIFY";
    public static String PIN_MIS_MATCH = "PINS NOT EQUAL";
    public static String ON_SECURE_ACCOUNT_PAGE = "Secure your Account";
    public static String INCORRECT_PIN_ERROR = "PINS NOT EQUAL";
    public static String ERROR = "ERROR";
    public static String NEXT_BUTTON = "NEXT";
    public static String ENABLE_DEVICE_BIOMETRIC = "biometrics_label";
    public static String HOME_MENU = "Home";
    public static String DISPLAY_QR_CODE = "Display QR";
    /**
     * Search
     */
    public static String HOME_PAGE_SEARCH_BAR = "Start searching";
    public static String SEARCH_RESULTS_LABEL = "label";
    public static String PRODUCT_PAGE_SEARCH = "Search all produccts";

    public static String SEARCH_PAGE_SEARCH_BAR = "Start searching";
    public static String SEARCH_PAGE_SEARCH_BOX = "search_src_text";
    public static String SEARCH_PAGE_SEARCH_ICON = "search_button";
    public static String TRENDING_SEARCHES = "TRENDING";
    public static String RECENT_SEARCH = "RECENT";
    public static String PRODUCTS_SEARCH_CATEGORY = "PRODUCTS";
    public static String SERVICES_SEARCH_CATEGORY = "SERVICE";
    public static String ZERO_SEARCH_RESULTS = "0 Search results";
    public static String WALLET_SEARCH_BAR = "Start searching by name, date, type, etc.";

    /**
     * Personal loans objects
     */
    public static String LOANS_CATEGORY_ICON = "Loans";
    public static String TAKE_A_LOAN_BUTTON = "Get a personal loan";
    public static String ON_PERSONAL_LOANS_PAGE = "PERSONAL LOANS";

    public static String YOU_QUALIFY_FOR_MESSAGE = "You could qualify for an instant loan of up to";
    public static String PERSONAL_LOANS_TERMS_ONE = "I have regular/steady income";
    public static String PERSONAL_LOANS_TERMS_TWO = "I do not have a spouse / my spouse does not object to me applying for a loan";
    public static String PERSONAL_LOANS_TERMS_THREE = "Neither me nor my spouse are insolvent, under administration, curatorship, undergoing debt counselling, or have any pending disputes with a credit bureau.";
    public static String GET_PRE_APPROVED_LOAN = "GET YOUR PRE APPROVED LOAN";
    public static String NED_ID_MESSAGE = "To verify your Nedbank Account with us, just login using your Ned credentials and your bank account will be added!";
    public static String NED_ID_USERNAME = "//XCUIElementTypeApplication[@name=\"Wakanda[C]\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField";
    public static String NED_ID_PASSWORD = "//XCUIElementTypeApplication[@name=\"Wakanda[C]\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeSecureTextField";
    public static String ON_FINANCIAL_INFO_PAGE = "Financial information";
    public static String ALLOW_CREDIT_CHECK = "Allow us to perform credit check and affordability check";
    public static String LOAN_OFFER_PAGE = "LOAN OFFER";
    public static String LOAN_OFFER_AMOUNT = "LOAN OFFER";
    public static String ADJUST_LOAN_AMOUNT_PLUS = "+";
    public static String ADJUST_LOAN_AMOUNT_MINUS = "-";
    public static String LOAN_OFFER_DETAILS_PAGE = "LOAN DETAILS";
    public static String ON_DECLARATION_PAGE = "Credit and fraud check";
    public static String FIXED_INCOME = "Fixed income";
    public static String FLEXIBLE_INCOME = "Flexible income";
    public static String DECLARATION_PAGE_TITLE1 = "title1";
    public static String DECLARATION_PAGE_MESSAGE1 = "message1";
    public static String DECLARATION_PAGE_TITLE2 = "title2";
    public static String DECLARATION_PAGE_MESSAGE2 = "message2";
    public static String DECLARATION_PAGE_TITLE3 = "title3";
    public static String DECLARATION_PAGE_MESSAGE3 = "message3";
    public static String DECLARATION_PAGE_TITLE4 = "title4";
    public static String DECLARATION_PAGE_MESSAGE4 = "message4";
    public static String ACCEPT_LOAN_OFFER_DOCUMENTATION = "I have read and agree to the Offer documentation";
    public static String ACCEPT_LOAN_OFFER_TERMS_AND_CONDITIONS = "I agree to the Terms and Conditions";
    public static String LOAN_EMAIL_ADDRESS = "EMAIL";
    public static String ACCEPT_AND_CONFIRM_BUTTON = "ACCEPT & CONFIRM";
    public static String DECLINE_BUTTON = "DECLINE";
    public static String BACK_TO_OFFER_BUTTON = "BACK TO LOAN OFFER";
    public static String ON_DECLINE_LOAN_OFFER_PAGE = "Please let us know the reason you're declining our loan offer";
    public static String DECLINE_REASON1 = "";
    public static String DECLINE_REASON2 = "";
    public static String DECLINE_REASON3 = "";
    public static String DECLINE_REASON4 = "";
    public static String DECLINE_AND_EXIT_BUTTON = "DECLINE AND EXIT";
    public static String ON_LOAN_OFFER_CONRATULATIONS_PAGE = "CONGRATULATIONS";
    public static String LOAN_OFFER_CONRATULATIONS_PAGE_MESSAGE = "Your personal loan application has been approved!";
    public static String LOAN_OFFER_CONRATULATIONS_PAGE_DONE_BUTTON = "DONE";

    /**
     * On-boarding objects
     */

    public static String SIGN_IN_BUTTON = "SIGN IN";
    public static String CART_PAY_BUTTON = "buy_food.pay.action";
    public static String SIGN_UP_BUTTON = "SIGN UP";
    public static String SA_ID_FIELD = "GENERATE OTP";
    public static String CELL_NUMBER_FIELD = "GENERATE OTP";
    public static String NED_BANK_ID_USERNAME = "username";
    public static String NED_BANK_ID_PASSOWRD = "password";
    public static String NED_BANK_ID_LOGIN = "Log in";
    public static String NED_BANK_ID_AUTHORIZE_ACCEPT_TERMS = "//XCUIElementTypeStaticText[@name=\"I agree to the\"]";
    public static String NED_BANK_ID_AUTHORIZE = "Authorise";




    public static String PERSONAL_INFO_CONSENT = "obboarding.start.check1_message obboarding.start.check1_link";
    public static String TERMS_AND_CONDITIONS_CONSENT = "obboarding.start.check2_message obboarding.start.check2_link";
    public static String MARKETING_POLICY_CONSENT = "obboarding.start.check3_message obboarding.start.check3_link";
    public static String GENERATE_OTP_BUTTON = "GENERATE OTP";
    public static String RE_SEND_OTP_BUTTON = "SEND APPROVE IT";
    public static String SAVE_PIN_BUTTON = "SAVE PIN";
    public static String START_EXPLORING = "START EXPLORING";
    public static String SA_ID_ALREADY_IN_USE = "This SA ID Number is already in use";
    public static String LET_GET_STARTED = "Let's get started";
    public static String PERSONAL_DETAILS_PAGE = "Your personal details";
    public static String ERROR_DIALOG_TITLE = "Error";
    public static String ERROR_DIALOG_CLOSE = "Close";
    public static String USERNAME_ALREADY_TAKEN = "This username is already taken";
    public static String PASSWORD_MIS_MATCH = "Passwords doesn't match";
    public static String TAKE_SELFIE_PAGE = "Take a Selfie";
    public static String STORING_THE_3D_MAP = "Storing the 3D map of your face";
    public static String ALREADY_A_NEDBANK_CLIENT = "Great, you are already \n" +
            "a Nedbank Client!";
    public static String SEND_APPROVE_IT_BUTTON = "SEND APPROVE IT";
    public static String SET_YOUR_LOGIN_DETAILS_PAGE = "Set your Login details";
    public static String RE_ENTER_PIN = "Re-enter the PIN";
    public static String ENTER_PIN = "Enter PIN";

    public static String PIN_DOES_NOT_MATCH = "PIN doesn’t match";
    public static String SET_NEW_PIN = "Set new PIN";
    public static String WELCOME_TO_WAKANDA_PAGE = "We have created a MobiMoney Wallet for you!";
    public static String UPGRADE_MY_WALLET_BUTTON = "UPGRADE MY WALLET";
    public static String UPGRADE_YOUR_WALLET = "Upgrade your wallet";
    public static String WHERE_DO_YOU_LIVE = "Where do you live ?";
    public static String SET_BUTTON = "SET";
    public static String TAKE_ID_PHONE = "Take a photo of your ID";
    public static String HURRAY = "HURRAY!";
    public static String WALLET_NOW_UNLIMITED = "Your wallet is Unlimited now!";
    static String TRACK_ORDER = "TRACK ORDER";
    /**
     * Profile objects
     */
    public static String MORE_MENU = "More";
    public static String ON_MORE_PAGE = "More";

    public static String PROFILE_MENU = "moreMenuFragment";
    public static String ON_PROFILE_PAGE = "";

    public static String PROFILE_MENU_QR_CODE = "QR Code";
    public static String QR_CODE_CANCEL = "Cancel";

    public static String PROFILE_MENU_SAVED_CARDS = "Saved Accounts & Cards";
    public static String SAVED_CARDS_PAGE = "SAVED ACCOUNTS & CARDS";

    public static String PROFILE_MENU_MY_REWARDS = "My Rewards";
    public static String MY_REWARDS_PAGE = "MY REWARDS";

    public static String PROFILE_MENU_ADDRESS = "Addresses";
    public static String PROFILE_ADDRESS_PAGE = "ADDRESSES";

    public static String PROFILE_MENU_FAVOURITES = "Favourites";
    public static String PROFILE_FAVOURITES_PAGE = "ADDRESSES";
    public static String PROFILE_ORDER_PAGE = "ACTIVITY HISTORY";
    public static String PROFILE_REFER_PAGE = "REFER A FRIEND";
    public static String REFER_AND_EARN_MESSAGE = "Refer & Earn";



    public static String HELP_AND_SUPPORT_PAGE = "Concierge";
    public static String PROFILE_TERMS_PAGE = "TERMS AND CONDITIONS";



    public static String PROFILE_MENU_ORDER_HISTORY = "Order History";
    public static String PROFILE_MENU_SETTINGS = "Settings";
    public static String PROFILE_MENU_REFER_A_FREIND = "Refer a friend";
    public static String PROFILE_MENU_HELP_AND_SUPPORT = "navigation.more.help";
    public static String PROFILE_MENU_TERMS_CONDITIONS = "navigation.more.tc";
    public static String PROFILE_MENU_RATE_US = "navigation.more.rate";
    public static String PROFILE_MENU_RATE_US_PAGE = "Rate us";

    public static String PROFILE_MENU_ABOUT_US = "navigation.more.about";
    public static String PROFILE_MENU_ABOUT_US_PAGE = "About us";

    public static String LOGOUT_BUTTON = "LOGOUT";

    public static String SAVE_BUTTON = "SAVE";
    public static String EDIT_BUTTON = "EDIT";
    public static String FUNDING_METHODS = "FUNDING METHODS";
    public static String WITHDRAWAL_METHODS = "WITHDRAWAL METHODS";
    public static String ADD_A_CREDIT_OR_DEBIT_CARD = "Add a Credit or Debit Card";
    public static String ADD_A_NEDBANK_ACCOUNT = "Add a NEDBank Account";
    public static String ADD_A_WITHDRAWAL_BANK_ACCOUNT = "Add a withdrawal bank account";
    public static String YOU_DO_NOT_HAVE_ANY_SAVED_ACCOUNTS = "You don’t have any saved accounts!";
    public static String DELETE_ACCOUNT = "DELETE ACCOUNT";
    public static String ACCEPT_AND_MAKE_PAYMENT_BUTTON = "ACCEPT & MAKE PAYMENT";
    public static String NO_KEEP_THIS_ACCOUNT_BUTTON = "NO, KEEP THIS ACCOUNT";
    public static String NO_ADDRESSES_SAVED_YET = "No addresses have been saved yet!";
    public static String ADD_NEW_ADDRESS_BUTTON = "ADD NEW ADDRESS";
    public static String MY_ADDRESSES = "MY ADDRESSES";
    public static String PICK_UP_STORE_ADDESSES = "PICK UP STORE ADDRESSES";
    public static String SAVE_ADDRESS_BUTTON = "SAVE ADDRESS";
    public static String EDIT_ADDRESS_HEADER = "EDIT ADDRESS";
    public static String SEARCH_LOCATION = "Search location";
    public static String ADDRESS_DETAILS_HEADER = "ADDRESS DETAILS";
    public static String START_SHOPPING_BUTTON = "START SHOPPING";
    public static String YOU_DO_NOT_HAVE_FAVOURITES_PRODUCTS_YET = "You don’t have any favourites products yet!";
    public static String YOU_DO_NOT_HAVE_ANY_FAVOURITES_YET = "You don’t have any favourites yet!";
    public static String PRODUCTS_BUTTON = "PRODUCTS";
    public static String SERVICE_PROVIDERS_BUTTON = "SERVICE PROVIDERS";
    public static String TYPE = "TYPE";
    public static String TIME = "TIME";
    public static String HOME_SERVICES_CELL = "HOME SERVICES";
    public static String PRODUCT_CELL = "PRODUCTS";
    public static String FOOD_CELL = "FOOD";
    public static String BANKING_SERVICES_CELL = "Banking Services";
    public static String TRAVEL_CELL = "TRAVEL";
    public static String VOUCHERS_CELL = "VOUCHERS";
    public static String ENTERTAINMENT_CELL = "ENTERTAINMENT";
    public static String APPLY_BUTTON = "APPLY";
    public static String CLEAR_ALL_BUTTON = "CLEAR ALL";
    public static String LAST_SIX_MONTHS = "Last 6 Months";
    public static String THWENTY_NINTHEEN = "2019";
    public static String THWENTY_EIGTHEEN = "2018";
    public static String NOTIFICATION_SETTINGS_CELL = "Notification Settings";
    public static String CHANGE_PIN_CELL = "Change PIN";
    public static String CHANGE_PASSWORD_CELL = "Change Password";
    public static String FINGERPRINT_FACEID_CELL = "Fingerprint/FaceIDL";
    public static String NOTIFICATION_SETTINGS_PAGE = "NOTIFICATION SETTINGS";
    public static String GENERAL_NOTIFICATIONS = "General Notifications";
    public static String PROMOTIONAL_NOTIFICATIONS = "Promotional Notifications";
    public static String ORDER_RELATED = "Order Related";
    public static String UPDATE_PIN_BUTTON = "UPDATE PIN";
    public static String PIN_UPDATED_SUCCESSFULLY = "PIN updated successfully!";
    public static String CHANGEPASSWORD_PAGE = "CHANGE PASSWORD";
    public static String FINGERPRINT_FACEID_PAGE = "FINGERPRINT / FACEID";
    public static String CHANGE_PASSWORD_PAGE = "CHANGE PASSWORD";
    public static String UPDATE_PASSWORD_BUTTON = "UPDATE PASSWORD";
    public static String REFER_A_FRIEND_BUTTON = "REFER A FRIEND";
    public static String REFER_A_FRIEND_PAGE = "REFER A FRIEND";
    public static String TERMS_AND_CONDITION_CELL = "Terms & Conditions";
    public static String PRIVACY_POLICY_CELL = "Privacy Policy";
    public static String TERMS_OF_USE_CELL = "Terms of Use";
    public static String COPY_RIGHTS_CELL = "Copyrights";
    public static String LEGAL_CELL = "Legal";
    public static String PAYMENTS_END_RESERVATIONS_CELL = "Payments & Reservation";
    public static String RETURN_POLICY_CELL = "Return Policy";
    public static String TERMS_AND_CONDITION_PAGE = "TERMS AND CONDITIONS";
    public static String TERMS_AND_CONDITION = "TERMS AND CONDITIONS";
    public static String PRIVACY_POLICY_PAGE = "PRIVACY POLICY";
    public static String TERMS_OF_USE_PAGE = "TERMS OF USE";
    public static String COPY_RIGHTS_PAGE = "COPYRIGHTS";
    public static String LEGAL_PAGE = "LEGAL";
    public static String PAYMENTS_END_RESERVATIONS_PAGE = "PAYMENTS & RESERVATION";
    public static String RETURN_POLICY_PAGE = "RETURN POLICY";
    public static String RATE_US_ON_THE_APP_STORE_BUTTON = "RATE US ON THE APP STORE";

    /**
     * Wallet objects
     */
    public static String WALLET_MENU = "wallet_graph";
    public static String MY_MONEY_MENU = "My Money";
    public static String MY_MONEY_PAGE = "MY MONEY";
    public static String ACCEPT_MONEY_PAGE = "Accept Money";
    public static String DISPLAY_QR_CODE_BUTTON = "Display QR";
    public static String REQUEST_MONEY_BUTTON = "Request Money";
    public static String REQUEST_MONEY_PAGE = "Request";
    public static String REQUEST_FROM_PAGE = "Request from";
    public static String CREATE_PAYMENT_LINK = "Create a Payment Link";
    public static String PAYMENT_LINK_GENERATED = "Payment link generated!";
    public static String SHARE_LINK_BUTTON = "Share link";
    public static String CONTUNUE_SHOPPING_BUTTON = "Continue shopping";
    public static String DOWNLOAD_QR_CODE = "Download QR";
    public static String SIGN_UP_AND_PAY_VIA = "SIGN UP & PAY VIA WAKANDA";
    public static String REJECT_THIS_REQUEST = "Reject this request";
    public static String PHONE_BOOK_CONTACTS = "Phonebook Contacts";
    public static String SEARCH_BY_NAME = "Search by name or phone number";
    public static String ENTER_AMOUNT_TO_PAY = "Enter Amount to Pay";
    public static String ENTER_AMOUNT = "Enter Amount";
    public static String ENTER_DESCRIPTION = "Enter Description";
    public static String CONFIRM_BUTTON = "CONFIRM";
    public static String CONFIRM_PAGE = "CONFIRMAATION";
    public static String WALLET_FILTER = "(//XCUIElementTypeButton[@name=\"filters\"])[1]";
    public static String WALLET_FILTER_TODAY = "(//XCUIElementTypeImage[@name=\"radio_button\"])[1]";
    public static String WALLET_FILTER_THIS_WEEK = "(//XCUIElementTypeImage[@name=\"radio_button\"])[2]";
    public static String WALLET_FILTER_THIS_MONTH = "(//XCUIElementTypeImage[@name=\"radio_button\"])[3]";
    public static String WALLET_FILTER_CUSTOM_DATES = "(//XCUIElementTypeImage[@name=\"radio_button\"])[4]";

    public static String DATE_MONTH_BACK_BUTTON = "navigation back button";
    public static String DATE_MONTH_FOWARD_BUTTON = "navigation forward button";
    public static String SELECT_START_DATE_BUTTON = "//XCUIElementTypeButton[@name=\"??SELECT START DATE\"]";
    public static String SELECT_END_DATE_BUTTON = "//XCUIElementTypeButton[@name=\"??SELECT END DATE\"]";
    public static String VIEW_STATEMENT_BUTTON = "VIEW STATEMENT";
    public static String RECIEVED_FROM = "wallet.filter.received_from";
    public static String SENT_TO = "wallet.filter.sent_to";
    public static String WALLET_STATEMENT_PAGE = "WALLET STATEMENT";



    public static String CONFIRMED_HEADER = "CONFIRMED!";
    public static String SUCCESS_LABEL = "Success!";
    public static String TRANSACTION_DETAILS_LABEL = "Transaction details";
    public static String NO_RESULTS_FOUND = "No search results found";
    public static String WALLET_PAY_SEARCH_CONTINUE_BUTTON =  "wallet.pay.search.continue_button";
    public static String GENERATE_QR_BUTTON = "Generate QR Code";
    public static String NO_MATCH_FOUND = "Oops! No matches found.";
    public static String PRIMARY_CTA = "PRIMARY CTA";
    public static String PAYMENT_SUCCESSFUL = "PAYMENT SUCCESSFUL!";
    public static String PAYMENT_SUCCESSFUL1 = "Purchase Successful!";

    public static String GET_WAKANDA_APP_TODAY = "Get the Wakanda app today!";
    public static String REQUEST_BUTTON = "REQUEST";
    public static String ADD_ARIMARY_CTA = "PRIMARY CTA";
    public static String ADD_CASH_VIA_NEDBANK_ATM = "Add cash via Nedbank ATM";
    public static String ADD_CASH_VIA_NEDBANK_ATM_PAGE = "ADD FUNDS VIA NEDBANK ATM";
    public static String USE_ATM_LOCATOR_BUTTON = "wallet.add_atm.tip_title";
    public static String ADD_NED_ACCOUNT_BUTTON = "Add a NEDBank Account";


    public static String MONEY_ADDED_SUCCESSFULLY = "Money added successfully!";
    public static String ADD_FUNDS_BUTTON = "ADD FUNDS";
    public static String SHARE_PAYMENT_DETAILS_BUTTON = "SHARE PAYMENT DETAILS";
    public static String CLOSE_BUTTON = "CLOSE";
    public static String CLOSE_DIALOG_BUTTON = "Close";

    public static String INSTANT_FINANCING = "Instant Financing";
    public static String FINGERPRINT_AUTHENTICATION_HEADER = "FINGERPRINT AUTHENTICATION";
    public static String FINGERPRINT_AUTHENTICATED = "Fingerprint Authenticated";
    public static String CANCEL_BUTTON = "CANCEL";
    public static String SCAN_QR_CODE_BUTTON = "SCAN QR CODE";
    public static String APPROVED_BENEFICIARIES = "APPROVED BENEFICIARIES";
    public static String RECENT_BENEFICIARIES = "RECENT";
    public static String PAY_FOR_SOMETHING = "Pay for something";
    public static String RECEIVE_MONEY = "Receive money";
    public static String ADD_MONEY_TO_YOUR_WALLET = "Add money to your wallet";
    public static String WITHDRAW_MONEY = "Withdraw money";
    public static String PAY_BUTTON = "Pay";
    public static String PAY_AMOUNT_BUTTON = "buy_food.pay.action";
    public static String BUY_BUTTON = "Buy";
    public static String GREAT_THANKS_BUTTON = "Great, thanks.";


    public static String PRE_PAID_PAY_BUTTON = "PAY";

    public static String ACCEPT_BUTTON = "Accept";
    public static String RECEIVE_BUTTON = "Receive";
    public static String WITHDRAW_BUTTON = "Withdraw";

    public static String TOP_UP_BUTTON = "(//XCUIElementTypeStaticText[@name=\"TOP-UP\"])[1]";
    public static String TOP_UP_PAGE = "TOP UP WALLET";
    public static String ON_ATM_LOCATOR_PAGE = "SET LOCATION";
    public static String EFT_FROM_ANOTHER_BANK_BUTTON = "wallet.manage_sources.add_eft";
    public static String EFT_FROM_ANOTHER_BANK_PAGE = "EFT FROM ANOTHER BANK ACCOUNT";
    public static String NED_BANK_ID_PAGE = "ADD A NEDBANK ACCOUNT";
    public static String NED_BANK_ID_USERNAME_FIELD = "wallet.add.nedbank_account.nedbankid";
    public static String NED_BANK_ID_PASSWORD_FIELD = "wallet.add.nedbank_account.password";




    public static String ADD_BUTTON = "Add";
    public static String TRANSACTION_TYPE_PAID = "PAID";
    public static String TRANSACTION_TYPE_RECEIVED = "RECEIVED";
    public static String TRANSACTION_TYPE_ADDED = "ADDED";
    public static String TRANSACTION_TYPE_WITHDRAWN = "WITHDRAWN";
    public static String TRANSACTION_STATUS_PENDING = "PENDING";
    public static String TRANSACTION_STATUS_RESERVED = "RESERVED";
    public static String DOWNLOADING_STATEMENT_HEADER = "DOWNLOAD STATEMENT";
    public static String FORMAT_PDF = "PDF";
    public static String FORMAT_CSV = "CSV";
    public static String FORMAT_EXCEL = "EXCEL";
    public static String DOWNLOAD_BUTTON = "DOWNLOAD";
    public static String SET_REMINDER_BUTTON = "SET_A_REMINDER";
    public static String SETTLEMENT_INITIATED = "Settlement initiated";
    public static String MONEY_SETTLED_SUCCESSFULLY = "Money settled successfully!";
    public static String AUTHORISE_PAYMENT_PAGE = "AUTHORIZE";
    /**
     * Buy groceries objects
     */

    public static String CHOOSE_DELIVERY_METHOD = "CHOOSE DELIVERY METHOD";
    public static String TRACK_CART = "Cart";
    public static String TRACK_ADDRESS = "Address";
    public static String TRACK_SHIPMENT = "Shipment";
    public static String GROCERIES_MENU = "Groceries";
    public static String GROCERIES_ICON = "GROCERIES";
    public static String GROCERIES_PAGE = "GROCERIES";
    public static String ONE_CART_LOGO = "one cart logo";
    public static String FIRST_DELIVERY_ON_US = "YOUR FIRST DELIVERY IS ON US!";
    public static String ONE_CART_LINK = "gotest.onecart.co.za";
    public static String ALL_STORES ="//XCUIElementTypeOther[@name=\"All stores\"]";
    public static String TRACK_PAYMENT = "Payment";
    public static String ADD_NEW_ADDRESS = "Add new address";
    public static String NO_ADDRESSES_ADDED_YET = "NO ADDRESSES ADDED YET";
    public static String DELIVER_HERE_BUTTON = "DELIVER HERE";
    public static String APPLY_A_PROMO_CODE = "Apply a Promo Code";
    public static String APPLY_PROMOCODE = "APPLY A PROMOCODE";







    public static String ONE_CART_MENU_LINK = "cart_menu_link";
    public static String CART_SIDE_BAR = "cart_sidebar_div";
    public static String CONTINUE_DELIVERY_BTNS = "continue_delivery_btns";
    public static String PROCEED_TO_CHECKOUT = "continue_shopping_link";
    public static String ONE_CART_CART_DELETE_BUTTON = "fa-trash";
    public static String ON_CHECKOUT_PAGE = "head extra_large_head";
    public static String ONE_CART_DETAIL =  "cart_detail";
    public static String SUBTOTAL_CHECKOUT_FIXED = "Subtotal_checkout_fixed";
    public static String SIDE_BAR_NAV =  "side_bar_nav";
    public static String TOTAL_DIV = "total_div";




      // BY NAME
    public static String ONE_CART_NAME= "fname";
    public static String ONE_CART_SURNAME = "sname";
    public static String ONE_CART_MOBILE = "phone";
    public static String ONE_CART_ALTERNATIVE_NUMBER = "altPhone";
    public static String CONTACT_PANEL = "contact_panel_div";
    public static String CONTACT_DESC_FORM = "contact_desc_form";
    public static String ONE_CART_CONTINUE_TO_DELIVERY = "continue_shopping_link";


    public static String ONE_CART_ADDRESS_TYPE = "addressTypeID";
    public static String ONE_CART_ADDRESS1= "address1";
    public static String ONE_CART_ADDRESS2 = "address2";
    public static String ONE_CART_ADDRESS_SUBURB= "suburb";
    public static String ONE_CART_ADDRESS_CITY = "city";
    public static String ONE_CART_ADDRESS_PROVINCE = "state";
    public static String ONE_CART_ADDRESS_CODE = "postcode";
    public static String ONE_CART_DELIVERY_DATE = "delivery_radio";
    public static String ONE_CART_DELIVERY_TIME = "timimg_radio_div";
    public static String ONE_CART_CONTINUE_TO_REFUNDS =  "Continue to Substitutes & Refunds";
    public static String ONE_CART_DELIVERY_ACCORD = "Delivery_accordion";
    public static String ONE_CART_COLLAPSE ="collapse2";


    public static String ONE_CART_CONTINUE_TO_LOYALTY_CARDS = "Continue to loyalty cards";
    public static String ONE_CART_SKIP_LOYALTY_CARDS = "Skip";
    public static String ONE_CART_CONTINUE_TO_PAYMENT = "continue_shopping_link border_continue_shopping_link Loyalty_con_del_btn";
    public static String ONE_CART_PAY_WITH_WAKANDA_WALLET = "Pay with Wakanda wallet";
















    public static String TOTAL_PAYABLE_AMOUNT = "Total";
    public static String GROCERIES_PAY_BUTTON = "buy_food.pay.action";
    public static String YOUR_ORDER_FROM_ONE_CART = "Your Order from OneCart";
    public static String FIND_LOCATIONS_NEAR_YOU = "Find Locations Near You";
    public static String ESHOP_PAY_BUTTON = "eshop.pay.cta_button";
    public static String Payment_Reserved = "Payment Reserved!";
    public static String YOUR_ORDER_DETAILS_BUTTON = "YOUR ORDER DETAILS";
    public static String PICKUP_LOCATION = "Pickup Location";
    public static String DELIVERY_ADDRESS_PAGE = "DELIVERY ADDRESS";
    public static String BILLING_ADDRESS_PAGE = "BILLING ADDRESS";
    public static String SET_AS_BILLING_ADDRESS_BUTTON = "SET AS BILLING ADDRESS";
    public static String SELECT_PICKUP_LOCATION_PAGE = "SELECT PICKUP LOCATION";
    public static String DELIVERY_INSTRUCTIONS_HEADER = "DELIVERY INSTRUCTIONS";
    public static String DONE_BUTTON = "DONE";
    public static String SHOP_GROCERIES_BUTTON = "SHOP GROCERIES";
    public static String USE_WAKA_POINTS_BUTTON = "buy_food.pay.points";
    public static String GET_PRE_APPROVED_LOAN_BUTTON = "GET YOUR PRE APPROVED LOAN";
    public static String MOBIMONEY_WALLET = "MobiMoney Wallet";
    public static String YOU_WILL_BE_REDIRECTED_TO = "YOU WILL BE REDIRECTED TO";
    public static String CONTINUE_SHOPPING_BUTTON = "CONTINUE SHOPPING";
    public static String EXIT_BUTTON = "BUTTON";
    public static String TRACK_YOUR_SHIPMENT = "Track your shipment";
    public static String ONGOING_ORDERS = "ONGOING ORDERS";
    public static String PAST_ORDERS = "PAST ORDERS";
    public static String RE_ORDER = "Reorder";
    public static String SHOPPING_PAGE = "SHOPPING";


    /**
     * Order a service objects
     */
    public static String ASSIGN_TO_JOB_BUTTON = "ASSIGN TO JOB";
    public static String GENERAL_CONFIRM = "GENERAL.CONFIRM";
    public static String SEND_JOB_REQUEST_BUTTON = "SEND JOB REQUEST";
    public static String REPEAT_THIS_JOB_BUTTON = "REPEAT THIS JOB";
    public static String CREATE_A_JOB_PAGE = "CREATE A JOB";
    public static String CATEGORIES ="Categories";

    public static String CATEGORIES_SHOPPING ="SHOPPING";
    public static String CATEGORIES_SERVICES = "SERVICES";
    public static String CATEGORIES_PREPAIDS = "PREPAIDS";
    public static String CATEGORIES_GROCERIES = "GROCERIES";
    public static String CATEGORIES_ENTERTAINMENT = "ENTERTAINMENT";
    public static String CATEGORIES_TRAVEL= "TRAVEL";
    public static String CATEGORIES_VOUCHERS = "VOUCHERS";
    public static String CATEGORIES_GIFTING = "GIFTING ";
    public static String CATEGORIES_BAB = "BAB";
    public static String CATEGORIES_BANK_SERVICES = "BANKSERVICES";
    public static String CATEGORIES_TAKE_AWAYS = "TAKEAWAYS";
    public static String CATEGORIES_LOTTO_POWERBALL = "LOTTO_POWER_BALL";
    public static String CATEGORIES_EDUCATION = "EDUCATION";

    public static String CATEGORIES_SAFETY_SECURITY = "CATEGORIES_SAFETY_SECURITY";
    public static String ORDER_SERIVICE_SEARCH_TITLE = "order_service.search.screen_title";

    public static String MOST_SEARCHED = "Trending Service Category";



    public static String ADD_PHOTOS_BUTTON = "+";
    public static String EDIT_JOB_BUTTON = "edit";
    public static String JOB_NUMBER = "job number";
    public static String JOB_NAME_LABEL = "Job Name";
    public static String JOB_NAME_FIELD = "order_service.create_job.job_name";
    public static String JOB_DESCRIPTION_LABEL = "Describe your job";
    public static String JOB_DESCRIPTION_FIELD = "order_service.create_job.describe";
    public static String JOB_DESCRIPTION_FIELD1 = "//XCUIElementTypeCell[@name=\"order_service.create_job.describe\"]/XCUIElementTypeTextView";


    public static String JOB_URGENCY_TOGGLE = "order_service.create_job.urgent_switch";
    public static String CHOOSE_FROM_GALLERY = "Choose from gallery";
    public static String MOMENTS_LABEL = "Moments";
    public static String SELECT_PHOTO_FROM_GALLERY = "Photo, Portrait, August 08, 2012, 11:29 PM";
    public static String REMOVE_PHOTO = "remove photo";
    public static String SET_LOCATION_BUTTON = "order_service.create_job.set_location_button";
    public static String SET_A_LOCATION_HEADER = "SET A LOCATION";
    public static String SET_NEW_LOCATION_HEADER = "SET NEW LOCATION";
    public static String SET_A_LOCATION_FIELD= "Search location";
    public static String SELECT_FIRST_LOCATION = "Your current location";
    public static String KEYBOARD_SEARCH_BUTTON = "search";
    public static String LOCATION_PAGE_HEADER = "SET NEW LOCATION";
    public static String LOCATION_COMPLEX_NAME = "order_service.location.details.complex";
    public static String LOCATION_HOUSE_NUMBER = "order_service.location.details.house";
    public static String LOCATION_NICK_NAME = "order_service.location.details.location_name";
    public static String SAVE_LOCATION_BUTTON = "Save location";
    public static String CONFIRM_AND_REQUEST_SERVICE_BUTTON = "order_service.create_job.set_location_button";
    public static String ON_HANG_IN_THERE_PAGE = "HANG IN THERE";
    public static String ON_JOB_DETAILS_PAGE = "";
    public static String SERVICE_TYPE_LABEL = "Type";
    public static String SERVICE_DATE_LABEL = "Date";
    public static String SERVICE_LOCATION_LABEL = "Location";
    public static String TOP_PICKS_LABEL = "There are Wakanda's top picks";
    public static String JOBS_AND_RESERVATIONS_LABEL = "Job payments & reservations";
    public static String INTERESTED_MERCHANTS_LABEL = "Interested Merchants";
    public static String SELECT_INTERESTED_MEARCHANT= "Sponsored offers";
    public static String SHOW_MORE_INTERESTED_PROVIDERS_LABEL = "";
    public static String SPONSROED_OFFERS_LABEL = "Sponsored offers";
    /**
     * Buy product objects
     */
    public static String ESHOP_MENU = "SHOPPING";
    public static String ESHOP_PAGE = "SHOPPING";
    public static String CART_BUTTON = "cart";
    public static String MY_CART_HEADER = "MY CART";
    public static String ADD_TO_CART_BUTTON = "//XCUIElementTypeStaticText[@name=\"ADD TO CART\"]";
    public static String ADDED_TO_CART = "??Added to cart";

    public static String BUY_NOW_BUTTON = "BUY_NOW";
    public static String CART_SUB_TOTAL= "BUY_NOW";
    public static String CART_TOTAL_AMOUNT = "R 0.00";


    public static String PRODUCT_DETAILS = "PRODUCT DETAILS";
    public static String DELIVERY_INFORMATION = "DELIVERY INFORMATION";
    public static String WARRANTY_DETAILS = "WARRANTY DETAILS";
    public static String WRITE_A_REVIEW_BUTTON = "//XCUIElementTypeStaticText[@name=\"Write a review\"]";
    public static String RATE_THE_PRODUCT_PAGE = "Rate the product";
    public static String CUSTOMER_RATINGS_AND_REVIEW_LABEL = "1 CUSTOMER RATINGS & REVIEWS";
    public static String FOUR_OUT_OF_FIVE_STARS = "4.0 out of 5 stars";


    public static String REVIEW_ONE_STAR= "(//XCUIElementTypeImage[@name=\"star_empty\"])[1]";
    public static String REVIEW_TWO_STAR= "(//XCUIElementTypeImage[@name=\"star_empty\"])[2]";
    public static String REVIEW_THREE_STAR= "(//XCUIElementTypeImage[@name=\"star_empty\"])[3]";
    public static String REVIEW_FOUR_STAR= "(//XCUIElementTypeImage[@name=\"star_empty\"])[4]";
    public static String REVIEW_FIVE_STAR= "(//XCUIElementTypeImage[@name=\"star_empty\"])[5]";
    public static String SUBMIT_BUTTON = "SUBMIT";

    public static String REVIEW_MESSAGE = "(//XCUIElementTypeStaticText[@name=\"Write a review\"])[2]";


    public static String PAYMENT_RESERVATION = "Payment reservation";
    public static String RETURN_POLICY = "Return Policy";
    public static String TERMS_AND_CONDITIONS = "Terms and Conditions";



    public static String MY_CART_SUB_TOTAL = "";
    public static String TRACKER_CART = "Cart";
    public static String TRACKER_ADDRESS = "Address";
    public static String TRACKER_SHIPMENT = "Shipment";
    public static String TRACKER_PAYMENT= "Payment";
    public static String EARN_WAKA_POINTS_LABEL = "Earn up to 100 WakaPoints on this cart order!";
    public static String APPLY_PROMO_CODE_LABEL = "eshop.cart.promo";
    public static String ESHOP_CART_EARN_POINTS_MESSAGE = "eshop.cart.points";

    public static String CART_GET_PERSONAL_LOAN_LABEL = "Get a Personal Loan for all your purchases!";
    public static String CART_CHECKOUT_BUTTON = "eshop.cart.checkout";
    public static String PROMO_CODE_PAGE_HEADER = "PROMO";
    public static String APPLY_PROMO_FIELD = "eshop.promo.apply_promocode";
    public static String ESHOP_AVAILABLE_PROMO = "eshop.promo.available_promo";
    public static String APPLY_PROMO_BUTTON = "eshop.promo.apply_button";
    public static String CHOOSE_DELIVERYPAGE_HEADER = "CHOOSE DELIVERY METHOD";
    public static String DELIVERY_ADDRESS_LABEL = "Delivery addresses";
    public static String CART_DELIVER_HERE_BUTTON = "DELIVERY HERE";
    public static String CART_SHIPMENT_PAGE_HEADER = "SHIPMENT";
    public static String CART_PROCEED_TO_PAYMENT_BUTTON = "PROCEED TO PAYMENT";
    public static String PAYMENT_PAGE_HEADER = "PAYMENT";
    public static String ORDER_CONFIRMATION_HEADER = "ORDER CONFIRMATION";
    public static String SORT_AND_FILTER_PAGE_HEADER = "SORT & FILTER";
    public static String LIKE_PRODUCT_BUTTON = "(//XCUIElementTypeButton[@name=\"favorite\"])[1]";
    public static String LIKE_SELECTED_PRODUCT_BUTTON = "(//XCUIElementTypeButton[@name=\"favorite selected\"])[1]";
    public static String DELETE_BUTTON = "DELETE";
    public static String SAVE_FOR_LATER_BUTTON = "SAVE FOR LATER";
    public static String ESHOP_PRODUCT_SEARCH = "Search all products";

    public static String ESHOP_CART_TOTAL = "eshop.cart.subtotal.title";
    public static String PRODUCT_CART_BUTTON = "";
    public static String DEALS_BUTTON = "Deals";
    public static String DEALS_LABEL = "DEALS";
    public static String TECH_BUTTON = "Tech";
    public static String HOME_BUTTON = "Home";
    public static String APPLIANCES_BUTTON = "Appliances";
    public static String GEAR_BUTTON = "Gear";
    public static String FASHION_BUTTON = "Fashion";
    public static String OUTDOOR_BUTTON = "Outdoor";
    public static String EXPERIENCES = "Experiences";
    public static String SEE_ALL_DEALS = "SEE ALL";
    public static String DEALS_ALL = "All";
    public static String DEALS_BEDDING = "BEDDING";
    public static String DEALS_CURTAINS = "CURTAINS";
    public static String DEALS_PILLOWS = "PILLOWS";
    public static String DEALS_FURNITURE = "FURNITURE";
    public static String ON_BOARDING_LABEL = "ONBOARDING";
    public static String RECOMMENDED_LABEL = "RECOMMENDED";
    public static String TOP_BRANDS_LABEL = "TOP BRANDS";
    public static String BLOG_LABEL = "BLOG";
    public static String READ_MORE_LABEL = "READ_MORE";
    public static String VIEW_ALL_BUTTON = "VIEW ALL";
    public static String SHOP_BY_CATEGORY_LABEL = "SHOP BY CATEGORY";
    public static String NEW_ARRIVALS_LABEL = "NEW ARRIVALS";
    public static String SHOP_BY_LOOK_LABEL = "SHOP BY LOOK";
    public static String SALE_LABEL = "SALE";



    public static String SORT_AND_FILTER_BUTTON = "sortAndFilter";
    public static String PRODUCT_PAGE_SEARCH_ICON = "search";
    public static String PRODUCT_PAGE_SHARE_ICON= "share";
    public static String SHARING_APPS = "Add to Reading List";
    public static String CLOSE_IMAGES = "//XCUIElementTypeButton[@name=\"×\"]";
    public static String PAYMENT_PAGE = "PAYMENT";


    /**
     * Buy pre-paids objects
     */

    public static String PRE_PAIDS_MENU = "PREPAIDS";
    public static String ELECTRICITY = "Electricity";
    public static String AIRTIME_AND_DATA = "Airtime & Data";
    public static String ON_ELECTRICITY_PAGE = "ELECTRICITY";
    public static String RECIPIENT_NAME_ELECTRICITY = "prepaid.electricity.recipient_hint";
    public static String RECIPIENT_NAME_DATA = "prepaid.airtimedata.recipient_hint";
    public static String METER_NUMBER = "prepaid.electricity.meter";
    public static String ELECTRICITY_AMOUNT = "prepaid.electricity.amount";
    public static String GET_PERSONAL_LOAN = "Get your pre-approved personal loan!";
    public static String USE_YOUR_POINTS = "Use your Wakapoints";
    public static String AVAILABLE_POINTS = "R 1000.00 available";
    public static String PAY_ELECTRICITY_BUTTON = "PAY";

    public static String ELECTRICITY_PAYMENT_SUCCESSFUL = "Payment Successful!";
    public static String ELECTRICITY_SUCCESS_METER_NUMBER = "Meter Number";
    public static String ELECTRICITY_DESCRIPTION = "prepaid.electricity.pay.description";




    public static String SEARCH_BY_NAME_OR_NUMBER = "Search by name or phone number";
    public static String SELECT_CONTACT = "wallet.pay.phonebook_contacts.contact_0";
    public static String RECIPIENT_LABEL = "Who would you like to buy airtime or data for?";
    public static String SELECT_A_PROVIDER_LABEL = "Repeat recent transaction";
    public static String REPEAT_RECENT_LABEL = "Repeat a recent purchase";
    public static String ELECTRICITY_RECENT_LABEL = "Repeat recent";



    public static String TOP_UP_LABEL = "What would you like to top-up?";
    public static String CHOOSE_BUNDLE_LABEL = "Choose one";

    public static String ON_PAY_PAGE = "PAY";
    public static String PRE_PAID_AMOUNT = "prepaid.airtimedata.order.custom_amount";
    public static String PRE_PAID_DESCRIPTION = "//XCUIElementTypeCell[@name=\"prepaid.airtimedata.order.custom_description\"]/XCUIElementTypeTextView";
    public static String PAY_PREPAID_DATA_BUTTON = "prepaid.airtimedata.order.cta_button";
    public static String AUTHORIZE_CONTACTS = "You have to authorize the Wakanda app first to see your contacts.";

    public static String ON_AIRTIME_AND_DATA_PAGE = "AIRTIME & DATA";
    public static String SELECT_A_BUNDLE = "//XCUIElementTypeButton[@name=\"Select a bundle\"]";































}
