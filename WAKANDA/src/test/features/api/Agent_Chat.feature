Feature: As a user I want to be able to make agent-chat service calls

  Background:
#    * def baseChatURL = 'https://stage-api.wakago.net/chat'
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

  @Chat
  Scenario Outline: Start a new agent-chat
    Given url baseChatURL
    And path '/v1/chats'
    And param status = '<chatStatus>'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "entityType": "<entityType>",
      "entityId": "<entityId>",
      "customerRef": "<customerRef>"
    }
    """
    And request reqMsg
    When method post
    Then status 200
    And print response
    And def chatId = response.id
    And def saveChatId = saveId(chatId, 'src/test/features/api/TokenStore/Chat_Id.txt')

    Examples:
    | entityType | entityId | customerRef |
    | 1          | 1234     | 1234        |

  @Chat
  Scenario Outline: Fetch existing chats
    Given url baseChatURL
    And path '/v1/chats'
    And param status = '<chatStatus>'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response

    Examples:
      | chatStatus     |
      | AWAITING_AGENT |
      | IN_PROGRESS    |
      | ON_HOLD        |
      | CLOSED         |


  @Chat
  Scenario: Fetch existing chats by id
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response
    And match chatId = response.id

  @Chat
  Scenario Outline: Assign Agents to Chat
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId, '/agentAgent'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "agentRef": "<agentRef>"
    }
    """
    When method post
    Then status 200
    And print response

    Examples:
    | agentRef |
    | 0112202  |


  @Chat
  Scenario: Fetch existing chats by id
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId, '/agentAssignments'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    When method get
    Then status 200
    And print response
    And match chatId = response[0].chatId

  @Chat
  Scenario Outline: Close Chat
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId, '/close'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "agentRef": "<agentRef>"
    }
    """
    When method post
    Then status 200
    And print response

    Examples:
      | agentRef |
      | 0112202  |

  @Chat
  Scenario Outline: Put Chat on Hold
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId, '/putOnHold'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "agentRef": "<agentRef>"
    }
    """
    When method post
    Then status 200
    And print response

    Examples:
      | agentRef |
      | 0112202  |

  @Chat
  Scenario Outline: Re-Assign Agent to Chat
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId, '/reassignAgent'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "agentRef": "<agentRef>"
    }
    """
    When method post
    Then status 200
    And print response

    Examples:
      | agentRef |
      | 0112202  |

  @Chat
  Scenario Outline: Remove Chat from Hold
    Given url baseChatURL
    And def chatId = ('TokenStore/Chat_Id.txt')
    And path '/v1/chats/', chatId, '/remoteFromHold'
    And header Content-Type = 'application/json'
    And header authorization = 'Bearer ' + securityToken
    And def reqMsg =
    """
    {
      "agentRef": "<agentRef>"
    }
    """
    When method post
    Then status 200
    And print response

    Examples:
      | agentRef |
      | 0112202  |



