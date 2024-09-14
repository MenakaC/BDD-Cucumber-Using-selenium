package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/googlesearch.feature",glue= {"StepDefinitions"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReports",
		"json:target/jsonreports/reports.json",
		"junit:target/junitreports/report.xml"}
)
public class TestRunner {

}