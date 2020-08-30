package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/MultiScenario.feature", glue="stepDefinitions",  tags="@login")
public class MultiScenario_runner {

}
