package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/landingPage.feature",
        glue = "src/test/java/stepDefinitions/landingPage.java"
)

public class testRunner {

}
