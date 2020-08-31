package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				 glue = {"StepDefinitions"},
				 plugin = {"pretty","html:target/cucumberReports/cucumberreport.html","json:target/jsonReports/Report.json"})
public class TestRunner {
	
	

}
