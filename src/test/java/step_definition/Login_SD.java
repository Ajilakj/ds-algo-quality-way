package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Home_POM;
import pageObjeccts.Login_POM;

public class Login_SD{
	Home_POM HomeOBJ=new Home_POM();
	Login_POM LoginOBJ=new Login_POM();
//	@Given("user is on ds-algo page")
//	public void user_is_on_ds_algo_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("user clicks on {string} button")
//	public void user_clicks_on_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("home page is displayed with content")
//	public void home_page_is_displayed_with_content() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

//	@Given("clicks on signin button")
//	public void clicks_on_signin_button() {
//		HomeOBJ.check_sign_in();
//	}
//
	
	@Given("clicks on signin button")
	public void clicks_on_signin_button() {
		HomeOBJ.sign_in();
	}
	
	@When("enters valid username and valid password")
	public void enters_valid_username_and_valid_password() {
	   LoginOBJ.enter_valid_credentials();
	}

	@When("click Login button")
	public void click_login_button() {
	   LoginOBJ.login();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    LoginOBJ.check_url_home();
	}
}
