package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Thanos_def {

	
	@Given("Thanos has all stones")
	public void thanos_has_all_stones() {
		System.out.println("Thanos has all stones");
	}

	@When("Thanos snaps his finger")
	public void thanos_snaps_his_finger() {
		System.out.println("Thanos snaps his finger");
	}
	@Then("Half of living things are vanished")
	public void half_of_living_things_are_vanished() {
		System.out.println("Half of living things are vanished");
	}



}
