package Cucumber.Cucumber.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Cucumber/Cucumber.Cucumber.Features/Login.feature"},
        glue={"Cucumber.Cucumber.Cucumber.Steps","Cucumber.Cucumber.hooks"},
        plugin = {"pretty","html:target/HtmlReports","json:target/report.json","junit:target/report.xml"},
        dryRun = false)

public class LoginRunner {
}
