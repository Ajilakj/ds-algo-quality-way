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
	WebDriver driver=super.driver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1 
	@When("The user clicks the Getting Started button in stack Pane")
	public void the_user_clicks_the_getting_started_button_in_stack_pane() {
		driver.get("https://dsportalapp.herokuapp.com/home");
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
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Operations in Stack")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_operations_in_stack() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag5
	@When("user write some valid java code for Operations in Stack page then click run button")
	public void user_write_some_valid_java_code_for_operations_in_stack_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Operations in Stack page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_operations_in_stack_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag6
	@When("user write some invalid code for Operations in Stack then click run button")
	public void user_write_some_invalid_code_for_operations_in_stack_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Operations in Stack")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_operations_in_stack(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag7
	@When("user write some python code for Operations in Stack page as input then click run button")
	public void user_write_some_python_code_for_operations_in_stack_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Operations in Stack page")
	public void the_output_will_be_display_in_the_editor_for_operations_in_stack_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag8
	@Given("The user is in the Operations in Stack Page")
	public void the_user_is_in_the_Operations_in_Stack_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	}

	@When("The user clicks Implementation link")
	public void the_user_clicks_implementation_link() {
		StackOBJ.select_implementation_of_stack();
	}

	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/implementation/");
	}

//	@tag9
	@When("The user clicks Try Here button from Implementation page")
	public void the_user_clicks_try_here_button_from_implementation_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag10
	@When("user write some valid java code for Implementation page then click run button")
	public void user_write_some_valid_java_code_for_implementation_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Implementation page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_implementation_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag11
	@When("user write some invalid code for Implementation then click run button")
	public void user_write_some_invalid_code_for_implementation_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Implementation")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_implementation(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag12
	@When("user write some python code for Implementation page as input then click run button")
	public void user_write_some_python_code_for_implementation_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Implementation page")
	public void the_output_will_be_display_in_the_editor_for_implementation_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

	
//	@tag13
	@Given("The user is in the Implementation page")
	public void the_user_is_in_the_queue_page_implementation_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/implementation/");
	}

	@When("The user clicks Applications link")
	public void the_user_clicks_applications_link() {
		StackOBJ.select_applications_of_stack();
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/stack-applications/");
	}
	
//	@tag14
	@When("The user clicks Try Here button from Applications page")
	public void the_user_clicks_try_here_button_button_from_applications_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Applications")
	public void the_user_should_be_redirected_to_a_try_editor_for_applications() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag15
	@When("user write some valid java code for Applications page then click run button")
	public void user_write_some_valid_java_code_for_applications_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Applications page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_applications_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag16
	@When("user write some invalid code for Applications then click run button")
	public void user_write_some_invalid_code_for_applications_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Applications")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_applications(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag17
	@When("user write some python code for Applications page as input then click run button")
	public void user_write_some_python_code_for_applications_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Applications page")
	public void the_output_will_be_display_in_the_editor_for_applications_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag18
	@Given("The user is in the Applications page")
	public void the_user_is_in_the_applications_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/stack-applications/");
	}

	@When("The user clicks Practice questions link from stack")
	public void the_user_clicks_practice_questions_link_from_stack() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("The user should be directed to practice questions Page for stack")
	public void the_user_should_be_directed_to_practice_questions_page_for_stack() {
		 UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/stack/practice");
	}
}
