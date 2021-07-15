package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinition",tags="@SmokeTest1 or @RegressionTest1",
		stepNotifications = true, 
		monochrome=true,
		plugin= {"pretty", "html:target/searchcucumber.html","json:target/searchcucumber.json","junit:target/searchcucumber.xml"})
public class CucumberSearchTestRunner {

}
