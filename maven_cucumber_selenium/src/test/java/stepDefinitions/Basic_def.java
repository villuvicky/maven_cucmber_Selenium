package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Basic_def {
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
		System.out.println("User is on Google home");
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box() {
		System.out.println("User is clicking the search box");
	}
	@When("types the search term as {string}")
	public void types_the_search_term_as(String string) {
		System.out.println("User is typing the search term");
	}
	@Then("the user should see the search results for vicky")
	public void the_user_should_see_the_search_results_for_vicky() {
		System.out.println("User is seeing the search results"); 
	}
}
