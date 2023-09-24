package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Stack_POM;
import utilities.UtlityFunctions;

public class Stack_SD extends BaseClass {
	Stack_POM StackOBJ=new Stack_POM();
	WebDriver chromeDriver=super.chromeDriver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1 
	@When("The user clicks the Getting Started button in stack Pane")
	public void the_user_clicks_the_getting_started_button_in_stack_pane() {
		chromeDriver.get("https://dsportalapp.herokuapp.com/home");
		StackOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to stack Page")
	public void the_user_will_directed_to_stack_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/");
	}

//	@tag2
	@When("The user select the option stack from the datastructure drop down menu")
	public void the_user_select_the_option_stack_from_the_datastructure_drop_down_menu() {
		UtlityFunctionsOBJ.click_DS_dropdown();
		StackOBJ.select_stack_from_drop_down();
	}

	@Then("The user will directed to stack Page using dropdown")
	public void the_user_will_directed_to_stack_page_using_dropdown() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/");
	}

//	@tag3
	@Given("The user is in the stack page")
	public void the_user_is_in_the_stack_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/");
	}

	@When("The user clicks Operations in Stack link")
	public void the_user_clicks_operations_in_stack_link() {
		StackOBJ.select_operations_in_stack();
	}

	@Then("The user should be directed to Operations in Stack Page")
	public void the_user_should_be_directed_to_operations_in_stack_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	}

//	@tag4
	@When("The user clicks Try Here button for Operations in Stack")
	public void the_user_clicks_try_here_button_for_operations_in_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Operations in Stack")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_operations_in_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag5
	@When("some python as input then click run button for Operations in Stack")
	public void some_python_as_input_then_click_run_button_for_operations_in_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Operations in Stack")
	public void the_output_will_be_display_in_the_editor_for_operations_in_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag6
	@Given("The user is in the Implementation Page")
	public void the_user_is_in_the_implementation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Implementation link")
	public void the_user_clicks_implementation_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag7
	@When("The user clicks Try Here button from Implementation page")
	public void the_user_clicks_try_here_button_from_implementation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag8
	@When("some python as input then click run button for Implementation")
	public void some_python_as_input_then_click_run_button_for_implementation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Implementation")
	public void the_output_will_be_display_in_the_editor_for_implementation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
//	@tag9
	@Given("The user is in the queue page Applications  page")
	public void the_user_is_in_the_queue_page_applications_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Applications link")
	public void the_user_clicks_applications_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag10 
	@When("The user clicks Try Here button button from Applications page")
	public void the_user_clicks_try_here_button_button_from_applications_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor for Applications")
	public void the_user_should_be_redirected_to_a_try_editor_for_applications() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag11
	@When("some python as input then click run button for Applications")
	public void some_python_as_input_then_click_run_button_for_applications() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Applications")
	public void the_output_will_be_display_in_the_editor_for_applications() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@tag12
	@Given("The user is in the Applications page")
	public void the_user_is_in_the_applications_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Practice questions link from stack")
	public void the_user_clicks_practice_questions_link_from_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to practice questions Page for stack")
	public void the_user_should_be_directed_to_practice_questions_page_for_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
