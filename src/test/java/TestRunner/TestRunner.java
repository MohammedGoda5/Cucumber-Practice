package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Administrator\\IdeaProjects\\Automation-Testing\\Practise Cucumber\\src\\main\\resources\\features\\", // Path to your feature files
        glue = "StepDefiniation",                // Package name for step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true                        // For clean console output
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
