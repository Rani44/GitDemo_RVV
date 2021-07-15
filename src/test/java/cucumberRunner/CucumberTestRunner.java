package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinition",
		stepNotifications = true, 
		tags="@SanityTest or @WebTest", 
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber.html","json:target/cucumber1.json","junit:target/cucumber.xml"})
public class CucumberTestRunner {

}
