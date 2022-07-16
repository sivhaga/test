Feature: As a Merchant Service User I want to be able to manage wallet calls

  Background:
#    * def baseMerchantWalletURL = 'https://stage-api.wakago.net/wallet'
    * def securityToken = read('TokenStore/SecurityToken.txt')
    * def saveId =
      """
        function(arg1, arg2) {
          var KarateUtil = Java.type('za.co.nedbank.dfl.digital.enablement.platform.test.api.KarateUtil');
          var kUtil = new KarateUtil;
          return kUtil.saveIds(arg1, arg2);
        }
      """
      * def getCurrentTimeStamp =
      """
         function(arg1) {
        var SimpleDateFormat = Java.type('java.text.SimpleDateFormat');
        var sdf = new SimpleDateFormat(arg1);
        var date = new java.util.Date();
        return sdf.format(date);
      }
      """
    * def locationName = 'TestArea_' + getCurrentTimeStamp('yyMMddHHMM')

  @Merchant-Wallet
  Scenario: Get Wallet Details
    Given path '/v1/wallet/'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def walletId = response[0].id
    And def saveWalletId = saveId(walletId, 'src/test/features/api/TokenStore/Merchant_Wallet_Id.txt')
    And match responseJson[0].availableBalance.currencyCode == 'ZAR'
    And def userName = responseJson[0].userName
    And match responseJson[0].userName != ''
    And def saveWalletId = saveId(userName, 'src/test/features/api/TokenStore/Merchant_Wallet_UserName.txt')

  @Merchant-Wallet
  Scenario: Get Wallet Details by Wallet Id
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

  @Merchant-Wallet
  Scenario Outline: Validate Wakanda Phone Number with <tesType> Phone Number on Wallet
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/phonebook'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    [
      "<phoneNumber>"
    ]
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[0].phoneNumber == '<phoneNumber>'
    And match responseJson[0].wakanda == <wakandaStatus>

    Examples:
    | tesType | phoneNumber | wakandaStatus |
    | Valid   | 0999999999  | true          |
    | Invalid | 0999999999  | false         |

  @Merchant-Wallet
  @Merchant-Wallet-External-Account-API
  Scenario Outline: Create External Wallet Account
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/externalaccount'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "type": "<type>",
      "accountNumber": "<accountNumber>",
      "cardNumber": "<cardNumber>",
      "cardholder": "<cardholder>",
      "expiryDateMM": "<expiryDateMM>",
      "expiryDateYY": "<expiryDateYY>",
      "CVV": "<CVV>",
      "cardName": "<cardName>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | type    | accountNumber | cardNumber  | cardholder | expiryDateMM | expiryDateYY | CVV | cardName     |
      | ACCOUNT | 1234567       | 12345678909 | WakaTest   | 22           | 22           | 078 | Wakanda Card |

  @Merchant-Wallet
  @Merchant-Wallet-External-Account-API
  Scenario Outline: Validate External Wallet Account
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/externalaccount/validate'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "type": "<type>",
      "accountNumber": "<accountNumber>",
      "cardNumber": "<cardNumber>",
      "cardholder": "<cardholder>",
      "expiryDateMM": "<expiryDateMM>",
      "expiryDateYY": "<expiryDateYY>",
      "CVV": "<CVV>",
      "cardName": "<cardName>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | type    | accountNumber | cardNumber  | cardholder | expiryDateMM | expiryDateYY | CVV | cardName     |
      | ACCOUNT | 1234567       | 12345678909 | WakaTest   | 22           | 22           | 078 | Wakanda Card |
      | ACCOUNT | 1234567       | 12345678909 | WakaTest   | 22           | 22           | 078 | Wakanda Card |

  @Merchant-Wallet
  @Merchant-Wallet-External-Account-API
  Scenario Outline: Get External Wallet Account
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/externalaccount'
    And param destination = '<destination>'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def externalAccId = responseJson[0].externalAccountId
    And def saveExternalAccId = saveId(externalAccId, 'src/test/features/api/TokenStore/External_Wallet_Acc_ID.txt')

    Examples:
      | destination |
      | topup       |
      | withdraw    |

  @Merchant-Wallet
  @Merchant-Wallet-External-Account-API
  Scenario: Get External Wallet Account by Account ID
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And def accId = read('TokenStore/External_Wallet_Acc_ID.txt')
    And path '/v1/wallet/', walletId, '/externalaccount', accId
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

  @Merchant-Wallet
  @Merchant-Wallet-External-Account-API
  Scenario: Delete External Wallet Account by Account ID
    Given def accId = read('TokenStore/External_Wallet_Acc_ID_Delete.txt')
    And def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/externalaccount', accId
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method delete
    Then status 200
    And print response

  @Merchant-Wallet
  @Merchant-Wallet-TopUp
  Scenario Outline: Top Up a Wallet
    Given def accId = read('TokenStore/External_Wallet_Acc_ID.txt')
    And def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/topup'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "request": {
        "externalAccountId": "#(accId)",
        "amount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "cvv": "<cvv>"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def saveWalletTopUpTransactionId = responseJson.transactionId
    And def saveTrxnId = saveId(saveWalletTopUpTransactionId, 'src/test/features/api/TokenStore/Merchant_Wallet_TopUp_Transaction_Id.txt')

    Examples:
      | amount | currencyCode | cvv |
      | 20000  | ZAR          | 099 |
      | 20000  | ZAR          | 099 |

  @Merchant-Wallet
  @Merchant-Wallet-TopUp
  Scenario Outline: Top Up a Wallet With Invalid Data
    Given def accId = read('TokenStore/External_Wallet_Acc_ID.txt')
    And def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/topup'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "request": {
        "externalAccountId": "#(accId)",
        "amount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "cvv": "<cvv>"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.error != ''

    Examples:
      | amount | currencyCode | cvv |
      | -20000 | ZAR          | 099 |
      | 2000   | AR           | 099 |
      | 2000   | ZAR          | --- |

  @Merchant-Wallet
  @Merchant-Wallet-TopUp
  Scenario Outline: Withdraw From a Wallet
    Given def accId = read('TokenStore/External_Wallet_Acc_ID.txt')
    And def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/topup'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "request": {
        "externalAccountId": "#(accId)",
        "amount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "atm": "true"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And def saveWalletWithdrawalTransactionId = responseJson.transactionId
    And def saveTrxnId = saveId(saveWalletWithdrawalTransactionId, 'src/test/features/api/TokenStore/Merchant_Wallet_Withdrawal_Transaction_Id.txt')

    Examples:
      | amount | currencyCode |
      | 20000  | ZAR          |
      | 20000  | ZAR          |

  @Merchant-Wallet
  @Merchant-Wallet-TopUp
  Scenario Outline: Withdraw From a Wallet With Invalid Data
    Given def accId = read('TokenStore/External_Wallet_Acc_ID.txt')
    And def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/topup'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "request": {
        "externalAccountId": "#(accId)",
        "amount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "atm": "<atm>"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.error != ''


    Examples:
      | amount | currencyCode | atm   |
      | -20000 | ZAR          | true  |
      | 2000   | AR           | true  |
      | 2000   | ZAR          | false |

  @Merchant-Wallet
  @Merchant-Wallet-Pay
  Scenario Outline: Make a P2P Payment from a Merchant Wallet
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/pay'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "paymentRequest": {
        "amount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "description": "<description>",
        "phoneNumber": "<phoneNumber>",
        "isWakanda": true
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | amount | currencyCode | description     | phoneNumber |
      | 2000   | ZAR          | WakandaPmt_Zara | 0999999999  |

  @Merchant-Wallet
  @Merchant-Wallet-Pay
  Scenario Outline: Make a P2P Payment from a Merchant Wallet with isWakanda false
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/pay'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "paymentRequest": {
        "amount": {
          "amount": <amount>,
          "currencyCode": "<currencyCode>"
        },
        "description": "<description>",
        "phoneNumber": "<phoneNumber>",
        "isWakanda": false
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.error != ''

    Examples:
      | amount | currencyCode | description     | phoneNumber |
      | 2000   | ZAR          | WakandaPmt_Zara | 0999999999  |

  @Merchant-Wallet
  @Merchant-Wallet-Pay
  Scenario Outline: Validate that User is Registered on Wakanda for or before a P2P Payment
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/pay/phone'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "phoneNumber": "<phoneNumber>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | phoneNumber |
      | 0999999999  |

  @Merchant-Wallet
  @Merchant-Wallet-Pay
  Scenario Outline: Get recent P2P Transfer Recipients
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/pay/recent'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "phoneNumber": "<phoneNumber>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | phoneNumber |
      | 0999999999  |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario: Get Merchant Transaction List
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction'
    And param next = 0
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def trxnId = responseJson[0].id
    And def save =  saveId(trxnId, 'src/test/features/api/TokenStore/Merchant_Wallet_Transaction_Id.txt')

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario: Get Merchant Transaction by Transaction Id
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And def trxnId = read('TokenStore/Merchant_Wallet_Transaction_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction', trxnId
    And param next = 0
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson.id == trxnId

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (Received Transactions)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].type contains '<expectedTransType>'
    And match responseJson[*].type !contains 'PAID_TO'
    And match responseJson[*].type contains '<expectedTransDirection>'
    And match responseJson[*].type !contains 'OUTGOING'

    Examples:
    | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | expectedTransType | expectedTransDirection |
    | true     | false | false     | false   | false   |              |        | 5    | RECEIVED_FROM     | INCOMING               |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (Paid Transactions)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].type contains '<expectedTransType>'
    And match responseJson[*].type !contains 'RECEIVED_FROM'
    And match responseJson[*].type contains '<expectedTransDirection>'
    And match responseJson[*].type !contains 'INCOMING'

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | expectedTransType | expectedTransDirection |
      | false    | true  | false     | false   | false   |              |        | 5    | PAID_TO           | OUTGOING               |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (Withdrawn Transactions)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].paymentMode contains '<expectedPaymentMode>'
    And match responseJson[*].paymentMode !contains 'WALLET_TRANSFER'

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | expectedPaymentMode |
      | false    | false | true      | false   | false   |              |        | 5    | WITHDRAWAL          |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (Refunds Transactions)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].type contains '<expectedTransType>'
    And match responseJson[*].type !contains 'RECEIVED_FROM'
    And match responseJson[*].type !contains 'PAID_TO'
    And match responseJson[*].type contains '<expectedTransDirection>'
    And match responseJson[*].type !contains 'INCOMING'

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | expectedTransType | expectedTransDirection |
      | false    | false | false     | true    | false   |              |        | 5    | REFUNDS           | OUTGOING               |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (Pending Transactions)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].pending contains '<pendingStatus>'
    And match responseJson[*].type !contains false

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | pendingStatus |
      | false    | false | false     | false   | true    |              |        | 5    | true          |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (With Senders Details)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].name contains '<receivedFrom>'
    And match responseJson[*].type contains '<expectedTransType>'

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | expectedTransType |
      | false    | false | false     | false   | false   | Waka         |        | 5    | RECEIVED_FROM     |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (Receivers details Transactions)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].name contains '<sentTo>'
    And match responseJson[*].type contains '<expectedTransType>'

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next | expectedTransType |
      | false    | false | false     | false   | false   |              | Waka   | 5    | PAID_TO           |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Get Merchant Transaction by Filter (All Transactions Filters)
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/filter'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "dateFrom": "2019-08-24T10:58:48.702Z",
      "dateTo": "2020-08-24T10:58:48.702Z",
      "received": <received>,
      "paid": <paid>,
      "withdrawn": <withdrawn>,
      "refunds": <refunds>,
      "pending": <pending>,
      "receivedFrom": "<receivedFrom>",
      "sentTo": "<sentTo>",
      "next": <next>
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson
    And match responseJson[*].type contains 'PAID_TO'
    And match responseJson[*].type contains 'RECEIVED_FROM'

    Examples:
      | received | paid  | withdrawn | refunds | pending | receivedFrom | sentTo | next |
      | true     | true  | true      | true    | true    |              |        | 20   |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Send Transaction Reminder
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And def trxnId = read('TokenStore/Merchant_Wallet_Transaction_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/', trxnId, '/reminder'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "message": "<message>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response

    Examples:
      | message                           |
      | Hello, Please pay your tansaction |



  @Merchant-Wallet
  @Merchant-Wallet-Transaction
  Scenario Outline: Send Transaction Refund
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And def trxnId = read('TokenStore/Merchant_Wallet_Transaction_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/', trxnId, '/reminder'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    And def reqMsg =
    """
    {
      "amount": {
        "amount": <amount>,
        "currencyCode": "<currencyCode>"
      }
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
      | amount | currencyCode |
      | 2000   | ZAR          |


  @Merchant-Wallet
  @Merchant-Wallet-Transaction-Search
  Scenario: Get Merchant Recent Search List
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/search/recent'
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson
    And def searchID = responseJson[0].id
    And def saveData = saveId(searchID, 'src/test/features/api/TokenStore/Merchant_Search_Id.txt')

  @Merchant-Wallet
  @Merchant-Wallet-Transaction-Search
  Scenario Outline: Get Merchant Search Transaction List
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/search'
    And param query = '<queryString>'
    And param next = <next>
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method get
    Then status 200
    And json responseJson = response
    And print responseJson

    Examples:
    | queryString | next |
    | bags        | 10   |

  @Merchant-Wallet
  @Merchant-Wallet-Transaction-Search
  Scenario: Delete Merchant Search by ID
    Given def walletId = read('TokenStore/Merchant_Wallet_Id.txt')
    And def searchID = read('TokenStore/Merchant_Search_Id.txt')
    And path '/v1/wallet/', walletId, '/transaction/search/recent', searchID
    And url baseMerchantWalletURL
    And header authorization = 'Bearer ' + securityToken
    And header Content-Type = 'application/json'
    When method delete
    Then status 200
    And json responseJson = response
    And print responseJson