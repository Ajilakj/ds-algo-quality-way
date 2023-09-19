package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Home_POM;

public class Home_SD {
		BaseClass BaseClassObj=new BaseClass();
		Home_POM HomeOBJ=new Home_POM();
		@Given("The user try to  open DS Algo portal link")
		public void the_user_try_to_open_ds_algo_portal_link() {
			BaseClassObj.init();
		}

		@Then("DS Algo portal page should open")
		public void ds_algo_portal_page_should_open() {
			BaseClassObj.openDsAlgo();
		  
		}

		@Given("The user already on DS Algo portal page")
		public void the_user_already_on_ds_algo_portal_page() {
		   
		}

		@Then("DS Algo home page should open")
		public void ds_algo_home_page_should_open() {
			HomeOBJ.home();
		}

		@When("The user clicks {string} drop down")
		public void the_user_clicks_drop_down(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("A drop down with {int} different data structure entries should be visible")
		public void a_drop_down_with_different_data_structure_entries_should_be_visible(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("The user slect any of the {int} items from the drop down")
		public void the_user_slect_any_of_the_items_from_the_drop_down(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("It should alert the user with a message {string}")
		public void it_should_alert_the_user_with_a_message(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("The user clicks any of the {string} buttons below the data structures")
		public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("The user clicks {string} link")
		public void the_user_clicks_link(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Sign in page should open")
		public void sign_in_page_should_open() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("Register page should open")
		public void register_page_should_open() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

}
