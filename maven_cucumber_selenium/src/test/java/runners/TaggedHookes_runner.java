package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue={"stepDefinitions","hooks"},tags = "@Thanos or @TaggedHooks")


public class TaggedHookes_runner {

		
		}

	

