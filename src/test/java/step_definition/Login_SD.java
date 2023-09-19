package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Home_POM;
import pageObjeccts.Login_POM;

public class Login_SD{
//	You can implement missing steps with the snippets below:
//	BaseClass BaseClassObj=new BaseClass();
//	BaseClassObj.init();
	
@Given("The user opens DS Algo portal link")
public void the_user_opens_ds_algo_portal_link() {
	BaseClass BaseClassObj=new BaseClass();
	BaseClassObj.init();

    // Write code here that turns the phrase above into concrete actions
//	chromeDriver.get("https://dsportalapp.herokuapp.com/");  
//    throw new io.cucumber.java.PendingException();
}

@When("The user clicks the {string} button")
public void the_user_clicks_the_button(String string) {
    // Write code here that turns the phrase above into concrete actions
	Home_POM HomeOBJ=new Home_POM();
	HomeOBJ.home();
//    throw new io.cucumber.java.PendingException();
}

@Then("The user should be redirected to homepage")
public void the_user_should_be_redirected_to_homepage() {
    // Write code here that turns the phrase above into concrete actions
//	Login_POM LoginOBJ=new Login_POM();
//	LoginOBJ.login();
//    throw new io.cucumber.java.PendingException();
}


//		@Given("I want to write a step with precondition")
//		public void i_want_to_write_a_step_with_precondition() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Given("some other precondition")
//		public void some_other_precondition() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("I complete action")
//		public void i_complete_action() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("some other action")
//		public void some_other_action() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("yet another action")
//		public void yet_another_action() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("I validate the outcomes")
//		public void i_validate_the_outcomes() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("check more outcomes")
//		public void check_more_outcomes() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Given("I want to write a step with name1")
//		public void i_want_to_write_a_step_with_name1() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("I check for the {int} in step")
//		public void i_check_for_the_in_step(Integer int1) {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("I verify the success in step")
//		public void i_verify_the_success_in_step() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Given("I want to write a step with name2")
//		public void i_want_to_write_a_step_with_name2() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("I verify the Fail in step")
//		public void i_verify_the_fail_in_step() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//
}
