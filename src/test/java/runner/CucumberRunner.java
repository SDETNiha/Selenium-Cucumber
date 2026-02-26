package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Instructs JUnit to use the Cucumber runner
@CucumberOptions(
        features = "src/test/resource/features", // Path to feature files
        glue = {"stepDefinition","hooks"},              // Package containing step definition classes
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reporting formats
        tags = "@smoke",                     // Filter specific scenarios to run
        monochrome = true,                        // Makes console output more readable
        dryRun = false                           // Checks if all steps have definitions without executing
)

public class CucumberRunner   {
}
