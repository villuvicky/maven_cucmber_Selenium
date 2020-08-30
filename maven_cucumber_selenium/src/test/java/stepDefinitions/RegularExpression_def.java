package stepDefinitions;

import io.cucumber.java.en.Given;

public class RegularExpression_def {
	

		@Given("I have {int} laptop")
		public void i_have_laptop(Integer int1) {
		    System.out.println("I have "+int1+" laptop");
		}



		@Given("My cgpa is {float}")
		public void my_cgpa_is(Float double1) {
			 System.out.println("My cgpa is "+double1);
		}
		@Given("My name is {string}")
		public void my_name_is(String string) {
			
			System.out.println("My name is "+string);
		}



}
