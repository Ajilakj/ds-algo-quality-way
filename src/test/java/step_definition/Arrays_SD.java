package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.BaseClass;
import pageObjects.Array_POM;
import utilities.UtlityFunctions;

public class Arrays_SD  extends BaseClass {
	
	Array_POM ArrayOBJ=new Array_POM();
	WebDriver driver=super.driver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();

//	  @tag1
	@Given("user is in home page to test array")
	public void  user_is_in_home_page_to_test_array() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("clicks Get Started button under Array")
	public void clicks_get_started_button_under_array() {
		ArrayOBJ.click_get_start_lnk();
	}

	@Then("user is directed to array page")
	public void user_is_directed_to_array_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/");
	}
//	  @tag2 
	@Given("user is in home page")
	public void user_is_in_home_page() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user select the option array from the datastructure drop down menu")
	public void the_user_select_the_option_array_from_the_datastructure_drop_down_menu() {
		UtlityFunctionsOBJ.click_DS_dropdown();;
		ArrayOBJ.select_array_from_drop_down();
	}

	@Then("The user will directed to array Page")
	public void the_user_will_directed_to_array_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/");
	}

//	  @tag3
	@Given("user is in array page")
	public void user_is_in_array_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/");
	}

	@When("clicks Arrays in Python link")
	public void clicks_arrays_in_python_link() {
		ArrayOBJ.select_arrays_in_python();
	}

	@Then("user will directed to arrays-in-python page")
	public void user_will_directed_to_arrays_in_python_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
	}
	
//	  @tag4
	@When("The user clicks Try Here button for arrays-in-python page")
	public void the_user_clicks_try_here_button_for_arrays_in_python_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for  arrays-in-python page page")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_arrays_in_python_page_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	  @tag5
	@When("user write some valid java code for arrays-in-python page  page then click run button")
	public void user_write_some_valid_java_code_for_arrays_in_python_page_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for  arrays-in-python page  page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_arrays_in_python_page_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag6
	@When("user enters invalid code in tryeditor box then clicks Run button")
	public void user_enters_invalid_code_in_tryeditor_box_then_clicks_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for arrays-in-python")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_arrays_in_python(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag7
	@When("user enters valid code in tryEditor box then clicks Run button for arrays-in-python")
	public void user_enters_valid_code_in_try_editor_box_then_clicks_run_button_for_arrays_in_python() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("user gets valid output for arrays-in-python")
	public void user_gets_valid_output_for_arrays_in_python() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag8
	@Given("User is in arrays-in-python page")
	public void user_is_in_arrays_in_python_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
	}

	@When("clicks Array Using List link")
	public void clicks_array_using_list_link() {
		ArrayOBJ.select_arrays_using_list();
	}
	
	@Then("user will directed to arrays-using-list page")
	public void user_will_directed_to_arrays_using_list_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/arrays-using-list/");
	}

//	  @tag9
	@When("The user clicks Try Here button for arrays-using-list page")
	public void the_user_clicks_try_here_button_for_arrays_using_list_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for arrays-using-list page")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_arrays_using_list_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	  @tag10
	@When("user write some valid java code for arrays-using-list page  page then click run button")
	public void user_write_some_valid_java_code_for_arrays_using_list_page_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for arrays-using-list  page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_arrays_using_list_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag11
	@When("user enters invalid code in tryeditor box then clicks Run button to test array using list")
	public void user_enters_invalid_code_in_tryeditor_box_then_clicks_run_button_to_test_array_using_list() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for arrays-using-list")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_arrays_using_list(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag12
	@When("user enters valid code in tryEditor box then clicks Run button for arrays-using-list")
	public void user_enters_valid_code_in_try_editor_box_then_clicks_run_button_for_arrays_using_list() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("user gets valid output for arrays-using-list")
	public void user_gets_valid_output_for_arrays_using_list() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag13
	@Given("user is in arrays-using-List page")
	public void user_is_in_arrays_using_list_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/arrays-using-list/");
	}

	@When("clicks Basic Operations in Lists Page link")
	public void clicks_basic_operations_in_lists_page_link() {
		ArrayOBJ.select_basic_operations_in_list();
	}
	
	@Then("user will directed into basic-operations-in-lists page")
	public void user_will_directed_into_basic_operations_in_list_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/");
	}
	
//	  @tag14
	@When("The user clicks Try Here button for basic-operations-in-lists page")
	public void the_user_clicks_try_here_button_for_basic_operations_in_lists_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for basic-operations-in-lists page")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_basic_operations_in_lists_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	  @tag15
	@When("user write some valid java code for basic-operations-in-lists page then click run button")
	public void user_write_some_valid_java_code_for_basic_operations_in_lists_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for basic-operations-in-lists page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_basic_operations_in_lists_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag16
	@When("user enters invalid code in tryeditor box then clicks Run button to test basic-operations-in-lists")
	public void user_enters_invalid_code_in_tryeditor_box_then_clicks_run_button_to_test_basic_operations_in_lists() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for basic-operations-in-lists")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_basic_operations_in_lists(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag17
	@When("user enters valid code in tryEditor box then clicks Run button for basic-operations-in-lists")
	public void user_enters_valid_code_in_try_editor_box_then_clicks_run_button_for_basic_operations_in_lists() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("user gets valid output for basic-operations-in-lists")
	public void user_gets_valid_output_for_basic_operations_in_lists() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag18
	@Given("user is in basic-operations-in-lists page")
	public void user_is_in_basic_operations_in_lists_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/");
	}

	@When("clicks Applications of Array link")
	public void clicks_applications_of_array_link() {
		ArrayOBJ.select_applications_of_arrays();
	}
	
	@Then("user will directed to applications-of-array page")
	public void user_will_directed_to_applications_of_array_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/applications-of-array/");
	}

//	  @tag19
	@When("The user clicks Try Here button for applications-of-array page")
	public void the_user_clicks_try_here_button_for_applications_of_array_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page forapplications-of-array page")
	public void the_user_should_be_redirected_to_a_try_editor_page_forapplications_of_array_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	  @tag20
	@When("user write some valid java code for applications-of-array page then click run button")
	public void user_write_some_valid_java_code_for_applications_of_array_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for applications-of-array page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_applications_of_array_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag21
	@When("user enters invalid code in tryeditor box then clicks Run button to test applications-of-array")
	public void user_enters_invalid_code_in_tryeditor_box_then_clicks_run_button_to_test_applications_of_array() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for applications-of-array")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_applications_of_array(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag22
	@When("user enters valid code in tryEditor box then clicks Run button for applications-of-array")
	public void user_enters_valid_code_in_try_editor_box_then_clicks_run_button_for_applications_of_array() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("user gets valid output for applications-of-array")
	public void user_gets_valid_output_for_applications_of_array() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag23
	@Given("A logged in user is in the applications-of-array page")
	public void a_logged_in_user_is_in_the_applications_of_array_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/applications-of-array/");
	}

	@When("The user clicks Practice questions link for array page")
	public void the_user_clicks_practice_questions_link_for_array_page() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("The user should be directed to practice questions Page for array page")
	public void the_user_should_be_directed_to_practice_questions_page_for_array_page() {
		 UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/practice");
	}
	
//	  @tag24
	@Given("The user already in practice questions Page for array page")
	public void the_user_already_in_practice_questions_page_for_array_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/practice");
	}

	@When("user select search the Array link")
	public void user_select_search_the_array_link() {
		ArrayOBJ.select_search_arrays();
	}

	@Then("user will directed to a text editor for search the Array")
	public void user_will_directed_to_a_text_editor_for_search_the_array() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/question/1");
	}

//	  @tag25
	@Given("The user already in practice questions Page for Max Consecutive Ones")
	public void the_user_already_in_practice_questions_page_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/practice");
	}

	@When("user select Max Consecutive Ones link")
	public void user_select_max_consecutive_ones_link() {
		ArrayOBJ.select_max_consecutive_ones();
	}

	@Then("user will directed to a text editor for Max Consecutive Ones")
	public void user_will_directed_to_a_text_editor_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/question/2");
	}

//	  @tag26
	@Given("The user already in practice questions Page for Find Numbers with Even Number of Digits")
	public void the_user_already_in_practice_questions_page_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/practice");
	}

	@When("user select Find Numbers with Even Number of Digits link")
	public void user_select_find_numbers_with_even_number_of_digits_link() {
		ArrayOBJ.select_even_number_of_digitst();
	}

	@Then("user will directed to a text editor for Find Numbers with Even Number of Digits")
	public void user_will_directed_to_a_text_editor_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/question/3");
	}

//	  @tag27
	@Given("The user already in practice questions Page for Squares of a Sorted Array")
	public void the_user_already_in_practice_questions_page_for_squares_of_a_sorted_array() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/practice");
	}

	@When("user select Squares of a Sorted Array link")
	public void user_select_squares_of_a_sorted_array_link() {
		ArrayOBJ.select_squares_of_sorted_array();
	}

	@Then("user will directed to a text editor for Squares of a Sorted Array")
	public void user_will_directed_to_a_text_editor_for_squares_of_a_sorted_array() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/question/4");
	}
}
