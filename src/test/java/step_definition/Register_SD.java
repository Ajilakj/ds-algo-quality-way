package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Register_POM;
import utilities.UtlityFunctions;

public class Register_SD extends BaseClass{
	Register_POM RegisterOBJ=new Register_POM();
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	@Test (priority = 0)
	@Given("clicks on register link")
	public void clicks_on_register_link() {
		chromeDriver.get("https://dsportalapp.herokuapp.com/register");
	}
	
	@When("enters valid username and valid password and confirm password")
	public void enters_valid_username_and_valid_password_and_confirm_password() {
		RegisterOBJ.enter_valid_credentials();
	}

	@When("click register button")
	public void click_register_button() {
		RegisterOBJ.register();
	}

	@Then("user willl direct to home page")
	public void user_willl_direct_to_home_page() {
		UtlityFunctionsOBJ.check_url_home();
	}
	
	
//	
//	@Given("user is on home page")
//	public void user_is_on_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User is in First page")
//	public void user_is_in_first_page() {
////		UtlityFunctionsOBJ.web_element_click(register);
//	}
//
//	@Then("click the {string}")
//	public void click_the(String string) {
//		RegisterOBJ.register();
//	}

//	@Then("click the Register")
//	public void click_the_register() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("it enters the register page")
//	public void it_enters_the_register_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User is in register page")
//	public void user_is_in_register_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("enter the valid username")
//	public void enter_the_valid_username() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("click the Register button")
//	public void click_the_register_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("'please fillout this field'message appears")
//	public void please_fillout_this_field_message_appears() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("enter the valid <username> and doorno@{int}")
//	public void enter_the_valid_username_and_doorno(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Re-enter valid <passsword>")
//	public void re_enter_valid_passsword() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("click Register button")
//	public void click_register_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Registration is successful")
//	public void registration_is_successful() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("enter the valid <username> and BIsmi")
//	public void enter_the_valid_username_and_b_ismi() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user is in the Register page")
//	public void user_is_in_the_register_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("enters valid username")
//	public void enters_valid_username() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("enters valid password in password textbox")
//	public void enters_valid_password_in_password_textbox() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("enters invalid or different password in password confirmation box")
//	public void enters_invalid_or_different_password_in_password_confirmation_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("clicks the register button")
//	public void clicks_the_register_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("{string} appears below.")
//	public void appears_below(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
