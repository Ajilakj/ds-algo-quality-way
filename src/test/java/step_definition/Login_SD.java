package step_definition;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Home_POM;
import pageObjeccts.Login_POM;
import utilities.UtlityFunctions;

public class Login_SD extends BaseClass{
	Login_POM LoginOBJ=new Login_POM();
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	

//	  @tag1
	@Given("User is in Login page to check both fields empty")
	public void user_is_in_login_page_to_check_both_fields_empty() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/login");
	}
	
	@When("user leaves username password fields empty")
	public void user_leaves_username_password_fields_empty() {
		LoginOBJ.username_empty();
		LoginOBJ.password_empty();
	}
	
	@When("clicks Login button to check both fields empty")
	public void clicks_login_button_to_check_both_fields_empty() {
		 LoginOBJ.click_login_button();
	}
	
	@Then("please fill out this field text is displayed")
	public void please_fill_out_this_field_text_is_displayed() {
		 UtlityFunctionsOBJ.get_message_from_active_window();
	}
	
//	  @tag2
	@Given("User is in Login page to check pssword empty")
	public void user_is_in_login_page_to_check_pssword_empty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("user enters valid username and leaves password field empty")
	public void user_enters_valid_username_and_leaves_password_field_empty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("clicks Login button to check pssword empty")
	public void clicks_login_button_to_check_pssword_empty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
//	  @tag4
	@Given("User is in Login page to check username empty")
	public void user_is_in_login_page_to_check_username_empty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("user enters valid password and leaves username field empty")
	public void user_enters_valid_password_and_leaves_username_field_empty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("clicks Login button to check username empty")
	public void clicks_login_button_to_check_username_empty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
//	  @tag5
	@Given("User is in Login page to check nonregister user")
	public void user_is_in_login_page_to_check_nonregister_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("enters a username and a password")
	public void enters_a_username_and_a_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("clicks Login button to check nonregister user")
	public void clicks_login_button_to_check_nonregister_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Invalid Username and Password message should display")
	public void invalid_username_and_password_message_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User is in Login page to check password incorrect")
	public void user_is_in_login_page_to_check_password_incorrect() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("enters a valid username and incorrect password")
	public void enters_a_valid_username_and_incorrect_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("clicks Login button to check password incorrect")
	public void clicks_login_button_to_check_password_incorrect() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User is in Login page to check username incorrect")
	public void user_is_in_login_page_to_check_username_incorrect() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("enters an incorrect username and a valid password")
	public void enters_an_incorrect_username_and_a_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("clicks Login button to check username incorrect")
	public void clicks_login_button_to_check_username_incorrect() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User is in Login page to check successful login with valid credentials")
	public void user_is_in_login_page_to_check_successful_login_with_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
//	
//	@When("enters valid username and valid password")
//	public void enters_valid_username_and_valid_password() {
//	   LoginOBJ.enter_valid_credentials();
//	}
//
//	@When("clicks Login button")
//	public void clicks_login_button() {
//	   LoginOBJ.login();
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//	    LoginOBJ.check_url_home();
//	}
	
//	  @tag1
	@Given("User is in Login page")
	public void  user_is_in_login_page() {
//		UtlityFunctionsOBJ.click_sign_in();
		chromeDriver.get("https://dsportalapp.herokuapp.com/login");
	}
	
	@When("enters valid username and valid password")
	public void enters_valid_username_and_valid_password() {
	   LoginOBJ.enter_valid_credentials();
	}

	@When("clicks Login button")
	public void clicks_login_button() {
	   LoginOBJ.click_login_button();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 UtlityFunctionsOBJ.check_url_home();
	}

}
