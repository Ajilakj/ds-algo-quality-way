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
	@When("user write some valid java code for for search the Array page then click run button")
	public void user_write_some_valid_java_code_for_for_search_the_array_page_then_click_run_button() {
		UtlityFunctionsOBJ.practice_question_valid_java_code_submit();;
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for for search the Array page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_for_search_the_array_page(Integer int1) {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag26
	@When("user enters valid code  then clicks submit button for for search the Array")
	public void user_enters_valid_code_then_clicks_submit_button_for_for_search_the_array() {
		UtlityFunctionsOBJ.practice_question_invalid_code();
	}

	@Then("user gets No tests were collected message for for search the Array for valid code")
	public void user_gets_no_tests_were_collected_message_for_for_search_the_array_for_valid_code() {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag27
	@When("user enters invalid code then clicks Run button to test for search the Array")
	public void user_enters_invalid_code_then_clicks_run_button_to_test_for_search_the_array() {
		UtlityFunctionsOBJ.practice_question_invalid_code_submit();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for for search the Array")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_for_search_the_array(Integer int1) {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag28
	@When("user enters invalid code  then clicks submit button for for search the Array")
	public void user_enters_invalid_code_then_clicks_submit_button_for_for_search_the_array() {
		UtlityFunctionsOBJ.practice_question_invalid_code_submit();
	}

	@Then("user gets No tests were collected message forfor search the Array for invalid code")
	public void user_gets_no_tests_were_collected_message_forfor_search_the_array_for_invalid_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag29
	@When("user enters valid python code then clicks Run button for for search the Array")
	public void user_enters_valid_python_code_then_clicks_run_button_for_for_search_the_array() {
		UtlityFunctionsOBJ.practice_question_python_code();
	}

	@Then("user gets valid output for for search the Array")
	public void user_gets_valid_output_for_for_search_the_array() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag30
	@When("user enters valid python code  then clicks submit button for for search the Array")
	public void user_enters_valid_python_code_then_clicks_submit_button_for_for_search_the_array() {
		UtlityFunctionsOBJ.practice_question_python_code_submit();
	}

	@Then("user gets No tests were collected message for Squares of a for search the Array")
	public void user_gets_no_tests_were_collected_message_for_squares_of_a_for_search_the_array() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag31
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

//	  @tag32
	@When("user write some valid java code for Squares of a Max Consecutive Ones then click run button")
	public void user_write_some_valid_java_code_for_squares_of_a_max_consecutive_ones_then_click_run_button() {
		UtlityFunctionsOBJ.practice_question_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for SMax Consecutive Ones")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_s_max_consecutive_ones(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag33
	@When("user enters valid code  then clicks submit button for Max Consecutive Ones")
	public void user_enters_valid_code_then_clicks_submit_button_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.practice_question_valid_java_code_submit();
	}

	@Then("user gets No tests were collected message for Max Consecutive Ones for valid code")
	public void user_gets_no_tests_were_collected_message_for_max_consecutive_ones_for_valid_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag34
	@When("user enters invalid code then clicks Run button to test Max Consecutive Ones")
	public void user_enters_invalid_code_then_clicks_run_button_to_test_max_consecutive_ones() {
		UtlityFunctionsOBJ.practice_question_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Max Consecutive Ones")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_max_consecutive_ones(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag35
	@When("user enters invalid code  then clicks submit button for Max Consecutive Ones")
	public void user_enters_invalid_code_then_clicks_submit_button_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.practice_question_invalid_code_submit();
	}

	@Then("user gets No tests were collected message for Max Consecutive Ones for invalid code")
	public void user_gets_no_tests_were_collected_message_for_max_consecutive_ones_for_invalid_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag36
	@When("user enters valid python code then clicks Run button for Max Consecutive Ones")
	public void user_enters_valid_python_code_then_clicks_run_button_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.practice_question_python_code();
	}

	@Then("user gets valid output for Max Consecutive Ones")
	public void user_gets_valid_output_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag37
	@When("user enters valid python code  then clicks submit button for Max Consecutive Ones")
	public void user_enters_valid_python_code_then_clicks_submit_button_for_max_consecutive_ones() {
		UtlityFunctionsOBJ.practice_question_python_code_submit();
	}

	@Then("user gets No tests were collected message for Max Consecutive Ones for python code")
	public void user_gets_no_tests_were_collected_message_for_max_consecutive_ones_for_python_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag38
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

//	  @tag39
	@When("user write some valid java code for Find Numbers with Even Number of Digits page then click run button")
	public void user_write_some_valid_java_code_for_find_numbers_with_even_number_of_digits_page_then_click_run_button() {
		UtlityFunctionsOBJ.practice_question_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Find Numbers with Even Number of Digits page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_find_numbers_with_even_number_of_digits_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag40
	@When("user enters valid code  then clicks submit button for Find Numbers with Even Number of Digits")
	public void user_enters_valid_code_then_clicks_submit_button_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.practice_question_valid_java_code_submit();
	}

	@Then("user gets No tests were collected message for Find Numbers with Even Number of Digits for valid code")
	public void user_gets_no_tests_were_collected_message_for_find_numbers_with_even_number_of_digits_for_valid_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag41
	@When("user enters invalid code then clicks Run button to test Find Numbers with Even Number of Digits")
	public void user_enters_invalid_code_then_clicks_run_button_to_test_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.practice_question_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Find Numbers with Even Number of Digits")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_find_numbers_with_even_number_of_digits(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag42
	@When("user enters invalid code  then clicks submit button for Find Numbers with Even Number of Digits")
	public void user_enters_invalid_code_then_clicks_submit_button_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.practice_question_invalid_code_submit();
	}

	@Then("user gets No tests were collected message for Find Numbers with Even Number of Digits for invalid code")
	public void user_gets_no_tests_were_collected_message_for_find_numbers_with_even_number_of_digits_for_invalid_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}
	
//	  @tag43
	@When("user enters valid python code then clicks Run button for Find Numbers with Even Number of Digits")
	public void user_enters_valid_python_code_then_clicks_run_button_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.practice_question_python_code();
	}

	@Then("user gets valid output for Find Numbers with Even Number of Digits")
	public void user_gets_valid_output_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag44
	@When("user enters valid python code  then clicks submit button for Find Numbers with Even Number of Digits")
	public void user_enters_valid_python_code_then_clicks_submit_button_for_find_numbers_with_even_number_of_digits() {
		UtlityFunctionsOBJ.practice_question_python_code_submit();
	}

	@Then("user gets No tests were collected message for Find Numbers with Even Number of Digits for python code")
	public void user_gets_no_tests_were_collected_message_for_find_numbers_with_even_number_of_digits_for_python_code() {
		UtlityFunctionsOBJ.check_submit_output1();
	}

//	  @tag45
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
	
//	  @tag46
	@When("user write some valid java code for Squares of a Sorted page then click run button")
	public void user_write_some_valid_java_code_for_squares_of_a_sorted_page_then_click_run_button() {
		UtlityFunctionsOBJ.practice_question_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Squares of a Sorted page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_squares_of_a_sorted_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	  @tag47
	@When("user enters valid code  then clicks submit button for Squares of a Sorted")
	public void user_enters_valid_code_then_clicks_submit_button_for_squares_of_a_sorted() {
		UtlityFunctionsOBJ.practice_question_valid_java_code_submit();
	}

	@Then("user gets No tests were collected message for Squares of a Sorted for valid code")
	public void user_gets_no_tests_were_collected_message_for_squares_of_a_sorted_for_valid_code() {
		UtlityFunctionsOBJ.check_submit_output2();
	}

//	  @tag48
	@When("user enters invalid code then clicks Run button to test Squares of a Sorted")
	public void user_enters_invalid_code_then_clicks_run_button_to_test_squares_of_a_sorted() {
		UtlityFunctionsOBJ.practice_question_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Squares of a Sorted")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_squares_of_a_sorted(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	  @tag49
	@When("user enters invalid code  then clicks submit button for Squares of a Sorted")
	public void user_enters_invalid_code_then_clicks_submit_button_for_squares_of_a_sorted() {
		UtlityFunctionsOBJ.practice_question_invalid_code_submit();
	}
	
	@Then("user gets No tests were collected message for Squares of a Sorted for invalid code")
	public void user_gets_no_tests_were_collected_message_for_squares_of_a_sorted_for_invalid_code() {
		UtlityFunctionsOBJ.check_submit_output2();
	}

//	  @tag50
	@When("user enters valid python code then clicks Run button for Squares of a Sorted")
	public void user_enters_valid_python_code_then_clicks_run_button_for_squares_of_a_sorted() {
		UtlityFunctionsOBJ.practice_question_python_code();
	}

	@Then("user gets valid output for Squares of a Sorted")
	public void user_gets_valid_output_for_squares_of_a_sorted() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	  @tag51
	@When("user enters valid python code  then clicks submit button for Squares of a Sorted")
	public void user_enters_valid_python_code_then_clicks_submit_button_for_squares_of_a_sorted() {
		UtlityFunctionsOBJ.practice_question_python_code_submit();
	}

	@Then("user gets No tests were collected message for Squares of a Sorted for python code")
	public void user_gets_no_tests_were_collected_message_for_squares_of_a_sorted_for_python_code() {
		UtlityFunctionsOBJ.check_submit_output2();
	}
}
