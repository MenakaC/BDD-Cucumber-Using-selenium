$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/googlesearch.feature");
formatter.feature({
  "name": "Feature to test google search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate google seatch is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "ChromeBrowser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Googlesearchsteps.Chromebrowser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on google search webpage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Googlesearchsteps.user_is_on_google_search_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a text in search page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Googlesearchsteps.user_enters_a_text_in_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits enter",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Googlesearchsteps.hits_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to search results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Googlesearchsteps.user_is_navigated_to_search_results()"
});
formatter.result({
  "status": "passed"
});
});