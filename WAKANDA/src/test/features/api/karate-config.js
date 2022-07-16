function() {   
  var env = karate.env;
  if (!env) {
    env = 'QA';
  }
  var config = {
    baseURL : 'https://stage-api.wakago.net/',
    baseChatURL : "https://stage-api.wakago.net/chat",
    baseDashboardURL : 'https://stage-api.wakago.net/search/dashboard',
    baseDocumentURL : 'https://stage-api.wakago.net/eshop/v1/documents',
    baseMerchantOrderServiceURL : 'https://api.wakago.net/order-service/v1/service',
    baseMerchantWalletURL : 'https://stage-api.wakago.net/wallet',
    baseEshopURL : 'https://stage-api.wakago.net/eshop/v1/buy',
    basePersonalLoanURL: 'https://stage-api.wakago.net/loan',
    baseProfileURL: 'https://stage-api.wakago.net/profile',
 }

  if (env == 'DEV') {
   config.baseURL =     'https://dev-config.vas.nednet.co.za/v1/config';
   config.AuthorizationKey = '';
  }
  else if (env == 'ETE') {
    config.baseURL = 'https://ete-config.vas.nednet.co.za/v1/config';
    config.AuthorizationKey = '';
  }
  else if (env == 'QA'){
      config.baseURL = 'https://stage-api.wakago.net/';
      config.baseChatURL = 'https://stage-api.wakago.net/chat';
      config.baseDashboardURL = 'https://stage-api.wakago.net/search/dashboard';
      config.baseDocumentURL = 'https://stage-api.wakago.net/eshop/v1/documents';
      config.baseMerchantOrderServiceURL = 'https://stage-api.wakago.net/order-service/v1/service';
      config.baseMerchantWalletURL = 'https://stage-api.wakago.net/wallet';
      config.basePersonalLoanURL = 'https://stage-api.wakago.net/loan';
      config.baseEshopURL = 'https://stage-api.wakago.net/eshop/v1/buy/';
      config.baseProfileURL = 'https://stage-api.wakago.net/profile';
  }

  karate.log("Environment is ::: "+env+" Base URL is ::: "+ config.baseURL);
  karate.configure('readTimeout', 6000000);
  karate.configure("connectTimeout", 50000);
//  karate.configure("ssl", { keystore:'Certs/NedbankIssuingSHA2.cer' })

  return config;
}