package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.DataStructure_POM;
import utilities.UtlityFunctions;

public class DataStructure extends BaseClass {
	
	DataStructure_POM DataStructureOBJ=new DataStructure_POM();
	WebDriver driver=super.driver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1
	@Given("An existing user is in the Home page after logged in to check Getting Started button in DataStructures Pane")
	public void an_existing_user_is_in_the_home_page_after_logged_in_to_check_getting_started_button_in_data_structures_pane() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks the Getting Started button in DataStructures Pane")
	public void the_user_clicks_the_getting_started_button_in_data_structures_pane() {
		DataStructureOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to DataStructures Page")
	public void the_user_will_directed_to_data_structures_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}

//	@tag2
	@Given("user is in Data Structures-Introduction page")
	public void user_is_in_data_structures_introduction_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}

	@When("clicks Time Complexity button")
	public void clicks_time_complexity_button() {
		DataStructureOBJ.select_time_complexity_from_left_link();
	}

	@Then("user enters time-complexity page")
	public void user_enters_time_complexity_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}

//	@tag3
	@When("The user clicks Try Here button for Data Structures-Introduction page")
	public void the_user_clicks_try_here_button_for_data_structures_introduction_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Data Structures-Introduction page")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_data_structures_introduction_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag4
	@When("user write some valid java code for Data Structures-Introduction page then click run button")
	public void user_write_some_valid_java_code_for_data_structures_introduction_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Data Structures-Introduction page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_data_structures_introduction_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag5
	@When("user write some invalid code for  Data Structures-Introduction then click run button")
	public void user_write_some_invalid_code_for_data_structures_introduction_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Data Structures-Introduction")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_data_structures_introduction(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag6
	@When("user write some python code for Data Structures-Introduction page as input then click run button")
	public void user_write_some_python_code_for_data_structures_introduction_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Data Structures-Introduction page")
	public void the_output_will_be_display_in_the_editor_for_data_structures_introduction_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag7
	@Given("user is in time complexity page")
	public void user_is_in_time_complexity_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/graph/");
	}

	@When("clicks practice Questions for  Data Structures-Introduction")
	public void clicks_practice_questions_for_data_structures_introduction() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("user is navigated to Practice page for Data Structures-Introduction")
	public void user_is_navigated_to_practice_page_for_data_structures_introduction() {
		 UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/practice");
	}


}
