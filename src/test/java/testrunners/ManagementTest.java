package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/linkedinlearning/cucumber/features/Management.feature",
		glue="stepdefinitions",
		tags= "@NewTest",
		plugin= {"pretty"}
		)
public class ManagementTest {

}
