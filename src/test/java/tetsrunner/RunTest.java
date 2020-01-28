package tetsrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/java/feature/GoogleSearchAPI.feature",
				glue = {"stepdefination"},
				dryRun = false,
				monochrome=true,
				strict = true
)
public class RunTest {

}
