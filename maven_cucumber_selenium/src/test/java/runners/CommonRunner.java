package runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "features/basic.feature", glue="stepDefinitions",
                  plugin = {"pretty"})

public class CommonRunner {

}
