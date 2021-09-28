$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/cucumbercourse/features/ScenarioOutlineExample.feature");
formatter.feature({
  "name": "Final Bill Calculation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer Bill Amount Calculation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ScenarioOutlineExample"
    }
  ]
});
formatter.step({
  "name": "I have a Customer",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters initial bill amount as \u003cInitialBillAmount\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Sales Tax Rate is \u003cTaxRate\u003e Percent",
  "keyword": "And "
});
formatter.step({
  "name": "final bill amount calculate is \u003cCalculateBillAmount\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "InitialBillAmount",
        "TaxRate",
        "CalculateBillAmount"
      ]
    },
    {
      "cells": [
        "100",
        "10",
        "110"
      ]
    },
    {
      "cells": [
        "200",
        "8",
        "216"
      ]
    },
    {
      "cells": [
        "100",
        "1.55",
        "101.55"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer Bill Amount Calculation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ScenarioOutlineExample"
    }
  ]
});
formatter.step({
  "name": "I have a Customer",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutlineSteps.i_have_a_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters initial bill amount as 100",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutlineSteps.user_enters_initial_bill_amount_as(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sales Tax Rate is 10 Percent",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutlineSteps.sales_Tax_Rate_is_Percent(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "final bill amount calculate is 110",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineSteps.final_bill_amount_calculate_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Customer Bill Amount Calculation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ScenarioOutlineExample"
    }
  ]
});
formatter.step({
  "name": "I have a Customer",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutlineSteps.i_have_a_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters initial bill amount as 200",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutlineSteps.user_enters_initial_bill_amount_as(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sales Tax Rate is 8 Percent",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutlineSteps.sales_Tax_Rate_is_Percent(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "final bill amount calculate is 216",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineSteps.final_bill_amount_calculate_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Customer Bill Amount Calculation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ScenarioOutlineExample"
    }
  ]
});
formatter.step({
  "name": "I have a Customer",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOutlineSteps.i_have_a_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters initial bill amount as 100",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutlineSteps.user_enters_initial_bill_amount_as(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sales Tax Rate is 1.55 Percent",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOutlineSteps.sales_Tax_Rate_is_Percent(Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "final bill amount calculate is 101.55",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineSteps.final_bill_amount_calculate_is(Double)"
});
formatter.result({
  "status": "passed"
});
});