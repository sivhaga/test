function() {   
  var env = karate.env;
  if (!env) {
    env = 'QA';
  }

  var proxy = 'http://10.74.11.24:3128';

  var config = {
    baseURL : 'https://q-api.wakago.net/apimarket/live',
    clientId : 'bb748243-5c02-46dc-86a6-175e91144f73',
    clientSecret : 'R4vL6aN4tW2uE6lR3eQ2wH0bX7qO8eU4bV7oO8hR4iN5mD0lF0',
    xNbSubscriptionId : '6b3527a7-859e-40ba-9e9a-34b5a40f7f6c',
 }

  if (env == 'QA'){
      config.baseURL = 'https://q-api.wakago.net/apimarket/live';
      config.clientId = 'bb748243-5c02-46dc-86a6-175e91144f73';
      config.clientSecret = 'R4vL6aN4tW2uE6lR3eQ2wH0bX7qO8eU4bV7oO8hR4iN5mD0lF0';
      config.xNbSubscriptionId = '6b3527a7-859e-40ba-9e9a-34b5a40f7f6c';
  }

  karate.log("Environment is ::: "+env+" Base URL is ::: "+ config.baseURL);
  karate.configure('readTimeout', 6000000);
  karate.configure("connectTimeout", 50000);
//  karate.configure("ssl", { keystore:'Certs/NedbankIssuingSHA2.cer' })

  return config;
}