$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Nagarjun/workspace/FreeCRMBDDFramework/src/main/java/Features/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data Creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM create a new contact Scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-contact-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is  CRM PRO",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter username and  password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "nagarjun558",
        "test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user move to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probility",
        "commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 8918716214,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.title_of_login_page_is_CRM_PRO()"
});
formatter.result({
  "duration": 13823549,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 205980017,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4828607377,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 18808597,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_move_to_new_deal_page()"
});
formatter.result({
  "duration": 2050339757,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 11774058920,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.close_browser()"
});
formatter.result({
  "duration": 684763998,
  "status": "passed"
});
});