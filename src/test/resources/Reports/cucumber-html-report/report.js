$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/workspace/OHRMcucumber/src/test/resources/Features/Addvacancy.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHRM",
  "description": "",
  "id": "orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Add job Vacancy",
  "description": "",
  "id": "orangehrm;add-job-vacancy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User logging to the applicatin and click on login",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Select recruitment and select vacancies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Select add and fill the entries and click on save",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "add candidate details and save",
  "keyword": "Then "
});
formatter.match({
  "location": "Vacancysteps.user_logging_to_the_applicatin_and_click_on_login()"
});
formatter.result({
  "duration": 17492877601,
  "status": "passed"
});
formatter.match({
  "location": "Vacancysteps.select_recruitment_and_select_vacancies()"
});
formatter.result({
  "duration": 1480588699,
  "status": "passed"
});
formatter.match({
  "location": "Vacancysteps.select_add_and_fill_the_entries_and_click_on_save()"
});
formatter.result({
  "duration": 2881627600,
  "status": "passed"
});
formatter.match({
  "location": "Vacancysteps.add_candidate_details_and_save()"
});
formatter.result({
  "duration": 1469347400,
  "status": "passed"
});
});