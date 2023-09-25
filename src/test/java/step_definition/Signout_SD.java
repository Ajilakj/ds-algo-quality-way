package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Signout_POM;
import utilities.UtlityFunctions;

public class Signout_SD extends BaseClass{
	
	Signout_POM SignoutOBJ=new Signout_POM();
//	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	@Given("The user already login with valid usernae and password")
	public void the_user_already_login_with_valid_usernae_and_password() {
		SignoutOBJ.check_sign_out();
	}

	@When("the user selects signout link")
	public void the_user_selects_signout_link() {
		SignoutOBJ.select_sign_out();
	}

	@Then("register and signin links will appear")
	public void register_and_signin_links_will_appear() {
		SignoutOBJ.check_sign_in_and_register();
	}

}
