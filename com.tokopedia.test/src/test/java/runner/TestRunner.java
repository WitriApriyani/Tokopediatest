package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Tokopedia.feature", 
				glue = "steps",
				plugin= {"pretty","html:target/cucumber-reports/Cucumber.html","json:target/cucumber-reports/Cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests{

}


