package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/cucumbercourse/features",
		glue= {"stepdefinitions","hooks"},
//		tags= {"@SmokeTest, @RegularTest"},
//		tags= {"@ListOfStrings"},
		tags= {"@ScenarioOutlineExample"},
		plugin= {"pretty",
		"html:target/SystemTestReports/html",
		"json:target/SystemTestReports/json/report.json",
		"junit:target/SystemTestReports/junit/report.xml"},
		dryRun = false,
		monochrome = true
		)

public class MenuManagementtest {

}
