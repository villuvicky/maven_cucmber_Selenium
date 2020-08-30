package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "features/Sample.feature", glue="stepDefinitions", monochrome = true)
public class Basic_runner {

}