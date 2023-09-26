package step_definition;

import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Home_POM;
import utilities.UtlityFunctions;

public class Home_SD extends BaseClass {
	
	Home_POM HomeOBJ=new Home_POM();
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	

	@Given("The user try to  open DS Algo portal link") 
	public void the_user_try_to_open_ds_algo_portal_link() {
		System.out.print("chromeDriver" + chromeDriver);
		
	}

	@Then("DS Algo portal page should open")
	public void ds_algo_portal_page_should_open() {
		super.open_Ds_Algo();
	}


	@Given("The user already on DS Algo portal page")
	public void the_user_already_on_ds_algo_portal_page() {
		HomeOBJ.check_url_DsAlgo_portal();
	}
	
	@When("The user clicks the Get Started button")
	public void the_user_clicks_get_started_button() {
		HomeOBJ.home();
	}

	@Then("DS Algo home page should open")
	public void ds_algo_home_page_should_open() {
		UtlityFunctionsOBJ.check_url_home();
	}

	@When("The user clicks Data Structures drop down")
	public void the_user_clicks_data_structures_drop_down() {
		HomeOBJ.click_DS_dropdown();
	}

	@Then("A drop down with 6 different data structure entries should be visible")
	public void a_drop_down_with_different_data_structure_entries_should_be_visible() {
		HomeOBJ.check_DS_size(6);
	}


	@When("The user select any of the items from the drop down")
	public void the_user_slect_any_of_the_items_from_the_drop_down() {
		HomeOBJ.click_DS_dropdown();
		HomeOBJ.click_DS_dropdown_item();
	}

	@Then("It should alert the user with a message")
	public void it_should_alert_the_user_with_a_message() {
		HomeOBJ.check_not_sign_in_msg();
	}

	@Given("The user already on DS Algo portal page and The user did not sign in")
	public void the_user_already_on_ds_algo_portal_page_and_the_user_did_not_sign_in() {
		HomeOBJ.check_sign_in();
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
		HomeOBJ.click_get_start_lnk();
	}
	
	@Then("It should alert the user with a message You are not logged in")
	public void it_should_alert_the_user_with_a_message_you_are_not_logged_in() {
		HomeOBJ.check_not_sign_in_msg();
	}

	@When("The user clicks Sign in link")
	public void the_user_clicks_sign_in_link() {
		UtlityFunctionsOBJ.click_sign_in();;
	}

	@Then("Sign in page should open")
	public void sign_in_page_should_open() {
		HomeOBJ.check_sign_in_url();
	}

	@When("The user clicks Register link")
	public void the_user_clicks_register_link() {
		UtlityFunctionsOBJ.click_register();;;
	}
	
	@Then("Register page should open")
	public void register_page_should_open() {
		HomeOBJ.check_register_url();
	}

}
