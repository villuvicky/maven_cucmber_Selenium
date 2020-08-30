package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooks_def {
	@Given("^this is the first step$")
	public void This_Is_The_First_Step(){
		System.out.println("This is the first step");
	}

	@When("^this is the second step$")
	public void This_Is_The_Second_Step(){
		System.out.println("This is the second step");
	}

	@Then("^this is the third step$")
	public void This_Is_The_Third_Step(){
		System.out.println("This is the third step");
}
}