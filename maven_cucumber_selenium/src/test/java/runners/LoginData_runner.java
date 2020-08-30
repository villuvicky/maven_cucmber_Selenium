package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/AllGherkinWords.feature",glue = "stepDefinitions")
public class LoginData_runner {

}
