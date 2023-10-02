package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.LinkedList_POM;
import utilities.UtlityFunctions;

public class LinkedList extends BaseClass {
	
	LinkedList_POM LinkedListOBJ=new LinkedList_POM();
	WebDriver driver=super.driver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1 
	@Given("An existing user is in the Home page for linked list")
	public void an_existing_user_is_in_the_home_page_for_linked_list() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks the Getting Started button in linked list Pane")
	public void the_user_clicks_the_getting_started_button_in_linked_list_pane() {
		LinkedListOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to linked list Page")
	public void the_user_will_directed_to_linked_list_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/");
	}

//	@tag2
	@When("The user select the option linked list from the datastructure drop down menu")
	public void the_user_select_the_option_linked_list_from_the_datastructure_drop_down_menu() {
		UtlityFunctionsOBJ.click_DS_dropdown();
		LinkedListOBJ.select_linked_list_from_drop_down();
	}

	@Then("The user will directed to linked list Page using dropdown")
	public void the_user_will_directed_to_linked_list_page_using_dropdown() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/");
	}

//	@tag3
	@Given("The user is in the linked list page")
	public void the_user_is_in_the_linked_list_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/");
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		LinkedListOBJ.select_introduction();
	}

	@Then("The user should be directed to Introduction Page")
	public void the_user_should_be_directed_to_introduction_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/introduction/");
	}

//	@tag4
	@When("The user clicks Try Here button for Introduction")
	public void the_user_clicks_try_here_button_for_introduction() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Introduction")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_introduction() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag5
	@When("user write some valid java code for Introduction page then click run button")
	public void user_write_some_valid_java_code_for_introduction_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Introduction page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_introduction_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag6
	@When("user write some invalid code for Introduction then click run button")
	public void user_write_some_invalid_code_for_introduction_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Introduction")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_introduction(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag7
	@When("user write some python code for RegisterDataExcel page as input then click run button")
	public void user_write_some_python_code_for_register_data_excel_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Introduction page")
	public void the_output_will_be_display_in_the_editor_for_introduction_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag8
	@Given("The user is in the Introduction Page")
	public void the_user_is_in_the_introduction_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/introduction/");
	}

	@When("The user clicks Creating Linked LIst link")
	public void the_user_clicks_creating_linked_l_ist_link() {
		LinkedListOBJ.select_creating_linked_list();
	}

	@Then("The user should be directed to Creating Linked LIsts Page")
	public void the_user_should_be_directed_to_creating_linked_l_ists_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
	}

//	@tag9
	@When("The user clicks Try Here button from Creating Linked LIst page")
	public void the_user_clicks_try_here_button_from_creating_linked_l_ist_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Creating Linked LIst")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_creating_linked_l_ist() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag10
	@When("user write some valid java code for Creating Linked LIsts page then click run button")
	public void user_write_some_valid_java_code_for_creating_linked_l_ists_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Creating Linked LIsts page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_creating_linked_l_ists_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag11
	@When("user write some invalid code for Creating Linked LIsts then click run button")
	public void user_write_some_invalid_code_for_creating_linked_l_ists_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Creating Linked LIsts")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_creating_linked_l_ists(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag12
	@When("user write some python code for Creating Linked LIsts page as input then click run button")
	public void user_write_some_python_code_for_creating_linked_l_ists_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Creating Linked LIsts page")
	public void the_output_will_be_display_in_the_editor_for_creating_linked_l_ists_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag13
	@Given("The user is in the Creating Linked LIst page")
	public void the_user_is_in_the_creating_linked_list_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
	}

	@When("The user clicks Types of linked lists link")
	public void the_user_clicks_types_of_linked_lists_link() {
		LinkedListOBJ.select_types_of_linked_list();
	}

	@Then("The user should be directed to Types of linked lists Page")
	public void the_user_should_be_directed_to_types_of_linked_lists_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
	}

//	@tag14
	@When("The user clicks Try Here button button from Types of linked lists page")
	public void the_user_clicks_try_here_button_button_from_types_of_linked_lists_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Types of linked lists")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_linked_lists() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag15
	@When("user write some valid java code for Types of linked lists page then click run button")
	public void user_write_some_valid_java_code_for_types_of_linked_lists_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Types of linked lists page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_types_of_linked_lists_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag16
	@When("user write some invalid code for Types of linked lists then click run button")
	public void user_write_some_invalid_code_for_types_of_linked_lists_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Types of linked lists")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_types_of_linked_lists(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag17
	@When("user write some python code for Types of linked lists page as input then click run button")
	public void user_write_some_python_code_for_types_of_linked_lists_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Types of linked lists page")
	public void the_output_will_be_display_in_the_editor_for_types_of_linked_lists_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag18
	@Given("The user is in the Types of linked lists page")
	public void the_user_is_in_the_types_of_linked_lists_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		LinkedListOBJ.select_implement_of_linked_list_in_python();
	}

	@Then("The user should be directed to Implement Linked List in Python Page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
	}

//	@tag19
	@When("The user clicks Try Here button for Implement Linked List in Python")
	public void the_user_clicks_try_here_button_for_implement_linked_list_in_python() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implement Linked List in Python")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implement_linked_list_in_python() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag20
	@When("user write some valid java code for Implement Linked List in Python page then click run button")
	public void user_write_some_valid_java_code_for_implement_linked_list_in_python_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Implement Linked List in Python page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_implement_linked_list_in_python_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag21
	@When("user write some invalid code for Implement Linked List in Python then click run button")
	public void user_write_some_invalid_code_for_implement_linked_list_in_python_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Implement Linked List in Python")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_implement_linked_list_in_python(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag22
	@When("user write some python code for Implement Linked List in Python page as input then click run button")
	public void user_write_some_python_code_for_implement_linked_list_in_python_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Implement Linked List in Python page")
	public void the_output_will_be_display_in_the_editor_for_implement_linked_list_in_python_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag23
	@Given("The user is in the Implement Linked List in Python")
	public void the_user_is_in_the_implement_linked_list_in_python() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		LinkedListOBJ.select_traversals();
	}

	@Then("The user should be directed to Traversal")
	public void the_user_should_be_directed_to_traversal() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/traversal/");
	}

//	@tag24
	@When("The user clicks Try Here button for Traversal")
	public void the_user_clicks_try_here_button_for_traversal() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Traversal")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_traversal() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag25
	@When("user write some valid java code for Traversal page then click run button")
	public void user_write_some_valid_java_code_for_traversal_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Traversal page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_traversal_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag26
	@When("user write some invalid code for Traversal then click run button")
	public void user_write_some_invalid_code_for_traversal_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Traversal")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_traversal(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag27
	@When("user write some python code for Traversal page as input then click run button")
	public void user_write_some_python_code_for_traversal_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Traversal page")
	public void the_output_will_be_display_in_the_editor_for_traversal_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag28
	@Given("The user is in the Traversal Page")
	public void the_user_is_in_the_traversal_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/traversal/");
	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {
		LinkedListOBJ.select_insertion();
	}

	@Then("The user should be directed to Insertion Page")
	public void the_user_should_be_directed_to_insertion_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
	}

//	@tag29
	@When("The user clicks Try Here button from Insertion page")
	public void the_user_clicks_try_here_button_from_insertion_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Insertion")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_insertion() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag30
	@When("user write some valid java code for Insertion page then click run button")
	public void user_write_some_valid_java_code_for_insertion_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Insertion page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_insertion_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag31
	@When("user write some invalid code for Insertion then click run button")
	public void user_write_some_invalid_code_for_insertion_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Insertion")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_insertion(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag32
	@When("user write some python code for Insertion page as input then click run button")
	public void user_write_some_python_code_for_insertion_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Insertion page")
	public void the_output_will_be_display_in_the_editor_for_insertion_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag33
	@Given("The user is in the linked list Insertion page")
	public void the_user_is_in_the_linked_list_insertion_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		LinkedListOBJ.select_deletion();
	}

	@Then("The user should be directed to Deletion Page")
	public void the_user_should_be_directed_to_deletion_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
	}

//	@tag34
	@When("The user clicks Try Here button button from Deletion")
	public void the_user_clicks_try_here_button_button_from_deletion() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Deletion")
	public void the_user_should_be_redirected_to_a_try_editor_for_deletion() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag35
	@When("user write some valid java code for Deletion page then click run button")
	public void user_write_some_valid_java_code_for_deletion_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Deletion page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_deletion_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag36
	@When("user write some invalid code for Deletion then click run button")
	public void user_write_some_invalid_code_for_deletion_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Deletion")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_deletion(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag37
	@When("user write some python code for Deletion page as input then click run button")
	public void user_write_some_python_code_for_deletion_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Deletion page")
	public void the_output_will_be_display_in_the_editor_for_deletion_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag38
	@Given("The user is in the Deletion")
	public void the_user_is_in_the_deletion() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
	}

	@When("The user clicks Practice questions link from linked list")
	public void the_user_clicks_practice_questions_link_from_linked_list() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("The user should be directed to practice questions Page for linked list")
	public void the_user_should_be_directed_to_practice_questions_page_for_linked_list() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/linked-list/practice");
	}
}
