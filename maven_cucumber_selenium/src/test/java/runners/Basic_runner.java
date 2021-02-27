package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "features/AllGherkinWords.feature", glue="stepDefinitions",
                  plugin = {"pretty","junit:target/MyReports/report.xml","json:target/MyReports/Report.json"}, publish = true)
public class Basic_runner {

}