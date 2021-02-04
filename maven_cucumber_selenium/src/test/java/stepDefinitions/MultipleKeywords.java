package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MultipleKeywords {


	

		@Given("User is having chrome:")
		public void user_is_having_chrome() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}
		
		@When("User logged on to myAccess with Valid Username and Password")
		public void user_logged_on_to_my_access_with_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
			List<Map<String, String>> creds=dataTable.asMaps(String.class, String.class);
			String UserName=creds.get(1).get("Username");
			System.out.println(UserName);
		
		}
		@When("verify line items for following Entitlements:")
		public void verify_line_items_for_following_entitlements(io.cucumber.datatable.DataTable dataTable) {
			List<List<String>> data = dataTable.asLists(String.class);
			for (List<String> list : data) {
				System.out.println(list);
			}
			

				


		}



		@When("user")
		public void user(io.cucumber.datatable.DataTable dataTable) {
			List<List<String>> data = dataTable.asLists(String.class);
			for (List<String> list : data) {
				System.out.println(list);
		}


	

}

}
