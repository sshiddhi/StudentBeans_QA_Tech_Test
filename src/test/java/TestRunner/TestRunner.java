package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Features",
            glue = "StepDefinitions",
            dryRun = false,
            plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    )
    public class TestRunner {
    }

