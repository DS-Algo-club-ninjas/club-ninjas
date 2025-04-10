package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureIntro {

	
	@Given("The user is in the {string} page ")
	public void the_user_is_in_the_page(String string) {
	    
		System.out.println("DATA");
	}

	
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		System.out.println("DATA");
	}

	@Then("The user should be redirected to {string} of Data structures-Introduction")
	public void the_user_should_be_redirected_to_of_data_structures_introduction(String string) {
		System.out.println("DATA");
	}

}
