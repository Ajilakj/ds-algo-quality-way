package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.Tree_POM;
import utilities.UtlityFunctions;

public class Tree_SD extends BaseClass {
	
	Tree_POM TreeOBJ=new Tree_POM();
	WebDriver driver=super.driver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1 
	@Given("An existing user is in the Home page for tree")
	public void an_existing_user_is_in_the_home_page_for_tree() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks the Getting Started button in tree Pane")
	public void the_user_clicks_the_getting_started_button_in_tree_pane() {
		TreeOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to tree Page")
	public void the_user_will_directed_to_tree_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/");
	}
	
//	@tag2 
	@When("The user select the option tree from the datastructure drop down menu")
	public void the_user_select_the_option_tree_from_the_datastructure_drop_down_menu() {
		UtlityFunctionsOBJ.click_DS_dropdown();
		TreeOBJ.select_tree_from_drop_down();
	}

	@Then("The user will directed to tree Page using dropdown")
	public void the_user_will_directed_to_tree_page_using_dropdown() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/");
	}

//	@tag3
	@Given("The user is in the tree page")
	public void the_user_is_in_the_tree_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/");
	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
		TreeOBJ.select_overview_of_trees();
	}

	@Then("The user should be directed to Overview of Trees Page")
	public void the_user_should_be_directed_to_overview_of_trees_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
	}

//	@tag4
	@When("The user clicks Try Here button for Overview of Trees")
	public void the_user_clicks_try_here_button_for_overview_of_trees() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Overview of Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_overview_of_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag5
	@When("user write some valid java code for Overview of Trees page then click run button")
	public void user_write_some_valid_java_code_for_overview_of_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Overview of Trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_overview_of_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag6
	@When("user write some invalid code for Overview of Trees then click run button")
	public void user_write_some_invalid_code_for_overview_of_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Overview of Trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_overview_of_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag7
	@When("user write some python code for Overview of Trees page as input then click run button")
	public void user_write_some_python_code_for_overview_of_trees_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Overview of Trees page")
	public void the_output_will_be_display_in_the_editor_for_overview_of_trees_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag8
	@Given("The user is in the Overview of Trees Page")
	public void the_user_is_in_the_overview_of_trees_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		TreeOBJ.select_terminologies();
	}

	@Then("The user should be directed to Terminologiess Page")
	public void the_user_should_be_directed_to_terminologiess_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/terminologies/");
	}
	
//	@tag9
	@When("The user clicks Try Here button from Terminologies page")
	public void the_user_clicks_try_here_button_from_terminologies_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Terminologies")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_terminologies() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag10
	@When("user write some valid java code for Terminologiess page then click run button")
	public void user_write_some_valid_java_code_for_terminologiess_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Terminologiess page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_terminologiess_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag11
	@When("user write some invalid code for Terminologiess then click run button")
	public void user_write_some_invalid_code_for_terminologiess_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Terminologiess")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_terminologiess(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag12
	@When("user write some python code for Terminologiess page as input then click run button")
	public void user_write_some_python_code_for_terminologiess_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Terminologiess page")
	public void the_output_will_be_display_in_the_editor_for_terminologiess_page() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag13
	@Given("The user is in the queue page Terminologies page")
	public void the_user_is_in_the_queue_page_terminologies_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/terminologies/");
	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
	    TreeOBJ.select_types_of_trees();
	}

	@Then("The user should be directed to Types of Trees Page")
	public void the_user_should_be_directed_to_types_of_trees_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/types-of-trees/");
	}

//	@tag14
	@When("The user clicks Try Here button button from Types of Trees page")
	public void the_user_clicks_try_here_button_button_from_types_of_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Types of Trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag15
	@When("user write some valid java code for Types of Trees page then click run button")
	public void user_write_some_valid_java_code_for_types_of_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Types of Trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_types_of_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag16
	@When("user write some invalid code for Types of Trees then click run button")
	public void user_write_some_invalid_code_for_types_of_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Types of Trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_types_of_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag17
	@When("user write some python code for Types of Trees page as input then click run button")
	public void user_write_some_python_code_for_types_of_trees_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Types of Trees page")
	public void the_output_will_be_display_in_the_editor_for_types_of_trees_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag18
	@Given("The user is in the Types of Trees page")
	public void the_user_is_in_the_types_of_trees_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/types-of-trees/");
	}

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
	    TreeOBJ.select_tree_traversals();
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/tree-traversals/");
	}

//	@tag19
	@When("The user clicks Try Here button for Tree Traversals")
	public void the_user_clicks_try_here_button_for_tree_traversals() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Tree Traversals")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_tree_traversals() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag20
	@When("user write some valid java code for Tree Traversals page then click run button")
	public void user_write_some_valid_java_code_for_tree_traversals_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Tree Traversals page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_tree_traversals_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag21
	@When("user write some invalid code for Tree Traversals then click run button")
	public void user_write_some_invalid_code_for_tree_traversals_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Tree Traversals")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_tree_traversals(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag22
	@When("user write some python code for Tree Traversals page as input then click run button")
	public void user_write_some_python_code_for_tree_traversals_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Tree Traversals page")
	public void the_output_will_be_display_in_the_editor_for_tree_traversals_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag23
	@Given("The user is in the Tree Traversals")
	public void the_user_is_in_the_tree_traversals() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/tree-traversals/");
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
	    TreeOBJ.select_traversals_illustration();
	}

	@Then("The user should be directed to Traversals-Illustration")
	public void the_user_should_be_directed_to_traversals_illustration() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/traversals-illustration/");
	}
	
//	@tag24
	@When("The user clicks Try Here button for Traversals-Illustration")
	public void the_user_clicks_try_here_button_for_traversals_illustration() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Traversals-Illustration")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_traversals_illustration() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag25
	@When("user write some valid java code for Traversals-Illustration page then click run button")
	public void user_write_some_valid_java_code_for_traversals_illustration_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Traversals-Illustration page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_traversals_illustration_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}
	
//	@tag26
	@When("user write some invalid code for Traversals-Illustration then click run button")
	public void user_write_some_invalid_code_for_traversals_illustration_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Traversals-Illustration")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_traversals_illustration(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag27
	@When("user write some python code for Traversals-Illustration page as input then click run button")
	public void user_write_some_python_code_for_traversals_illustration_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Traversals-Illustration page")
	public void the_output_will_be_display_in_the_editor_for_traversals_illustration_page() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag28
	@Given("The user is in the Traversals-Illustration Page")
	public void the_user_is_in_the_traversals_illustration_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/traversals-illustration/");
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
	    TreeOBJ.select_binary_trees();
	}

	@Then("The user should be directed to Binary Trees Page")
	public void the_user_should_be_directed_to_binary_trees_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/binary-trees/");
	}
	
//	@tag29
	@When("The user clicks Try Here button from Binary Trees page")
	public void the_user_clicks_try_here_button_from_binary_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag30
	@When("user write some valid java code for Binary Trees page then click run button")
	public void user_write_some_valid_java_code_for_binary_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Binary Trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_binary_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag31
	@When("user write some invalid code for Binary Trees then click run button")
	public void user_write_some_invalid_code_for_binary_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Binary Trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_binary_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag32
	@When("user write some python code for Binary Trees page as input then click run button")
	public void user_write_some_python_code_for_binary_trees_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Binary Trees page")
	public void the_output_will_be_display_in_the_editor_for_binary_trees_page() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag33
	@Given("The user is in the queue page Binary Trees page")
	public void the_user_is_in_the_queue_page_binary_trees_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/binary-trees/");
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
	   TreeOBJ.select_types_of_binary_treesn();
	}

	@Then("The user should be directed to Types of Binary Trees Page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
	}
	
//	@tag34
	@When("The user clicks Try Here button button from Types of Binary Trees")
	public void the_user_clicks_try_here_button_button_from_types_of_binary_trees() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Types of Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag35
	@When("user write some valid java code for Types of Binary Trees page then click run button")
	public void user_write_some_valid_java_code_for_types_of_binary_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Types of Binary Trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_types_of_binary_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag36
	@When("user write some invalid code for Types of Binary Trees then click run button")
	public void user_write_some_invalid_code_for_types_of_binary_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Types of Binary Trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_types_of_binary_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag37
	@When("user write some python code for Types of Binary Trees page as input then click run button")
	public void user_write_some_python_code_for_types_of_binary_trees_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Types of Binary Trees page")
	public void the_output_will_be_display_in_the_editor_for_types_of_binary_trees_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag38
	@Given("The user is in the Types of Binary Trees")
	public void the_user_is_in_the_types_of_binary_trees() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/");
	}

	@When("The user clicks Implementation in Python")
	public void the_user_clicks_implementation_in_python() {
		TreeOBJ.select_implementation_in_python();
	}

	@Then("The user should be directed to Implementation in Python Page")
	public void the_user_should_be_directed_to_implementation_in_python_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
	}
	
//	@tag39
	@When("The user clicks Try Here button for Implementation in Python")
	public void the_user_clicks_try_here_button_for_implementation_in_python() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation in Python")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_in_python() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag40
	@When("user write some valid java code for Implementation in Python page then click run button")
	public void user_write_some_valid_java_code_for_implementation_in_python_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Implementation in Python page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_implementation_in_python_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag41
	@When("user write some invalid code for Implementation in Python then click run button")
	public void user_write_some_invalid_code_for_implementation_in_python_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Implementation in Python")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_implementation_in_python(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}
	
//	@tag42
	@When("user write some python code for Implementation in Python page as input then click run button")
	public void user_write_some_python_code_for_implementation_in_python_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}
	
	@Then("The output will be display in the editor for Implementation in Python page")
	public void the_output_will_be_display_in_the_editor_for_implementation_in_python_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag43
	@Given("The user is in the Implementation in Python page")
	public void the_user_is_in_the_implementation_in_python_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/implementation-in-python/");
	}

	@When("The user clicks Binary Tree Traversalslink")
	public void the_user_clicks_binary_tree_traversalslink() {
		TreeOBJ.select_binary_tree_traversals();
	}

	@Then("The user should be directed to Binary Tree Traversals Page")
	public void the_user_should_be_directed_to_binary_tree_traversals_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/");
	}

//	@tag44
	@When("The user clicks Try Here button for Binary Tree Traversals")
	public void the_user_clicks_try_here_button_for_binary_tree_traversals() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Tree Traversals")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_tree_traversals() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag45
	@When("user write some valid java code for Binary Tree Traversals page then click run button")
	public void user_write_some_valid_java_code_for_binary_tree_traversals_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Binary Tree Traversals page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_binary_tree_traversals_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}
	
//	@tag46
	@When("user write some invalid code for Binary Tree Traversals then click run button")
	public void user_write_some_invalid_code_for_binary_tree_traversals_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Binary Tree Traversals")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_binary_tree_traversals(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}
	
//	@tag47
	@When("user write some python code for Binary Tree Traversals page as input then click run button")
	public void user_write_some_python_code_for_binary_tree_traversals_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Binary Tree Traversals page")
	public void the_output_will_be_display_in_the_editor_for_binary_tree_traversals_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag48
	@Given("The user is in the Binary Tree Traversals Page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/");
	}

	@When("The user clicks Implementation of Binary Trees link")
	public void the_user_clicks_implementation_of_binary_trees_link() {
	   TreeOBJ.select_implementation_of_binary_trees();
	}

	@Then("The user should be directed to Implementation of Binary Trees page Page")
	public void the_user_should_be_directed_to_implementation_of_binary_trees_page_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/");
	}

//	@tag49
	@When("The user clicks Try Here button from Implementation of Binary Trees page")
	public void the_user_clicks_try_here_button_from_implementation_of_binary_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation of Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_of_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag50
	@When("user write some valid java code for Implementation of Binary Trees page then click run button")
	public void user_write_some_valid_java_code_for_implementation_of_binary_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Implementation of Binary Trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_implementation_of_binary_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}
	
//	@tag51
	@When("user write some invalid code for Implementation of Binary Trees then click run button")
	public void user_write_some_invalid_code_for_implementation_of_binary_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Implementation of Binary Trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_implementation_of_binary_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag52
	@When("user write some python code for Implementation of Binary Trees page as input then click run button")
	public void user_write_some_python_code_for_implementation_of_binary_trees_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Implementation of Binary Trees page")
	public void the_output_will_be_display_in_the_editor_for_implementation_of_binary_trees_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag53
	@Given("The user is in the queue page Implementation of Binary Trees page")
	public void the_user_is_in_the_queue_page_implementation_of_binary_trees_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/");
	}

	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		TreeOBJ.select_applications_of_binary_trees();
	}

	@Then("The user should be directed to Applications of Binary trees Page")
	public void the_user_should_be_directed_to_applications_of_binary_trees_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/");
	}

//	@tag54
	@When("The user clicks Try Here button button from Applications of Binary trees page")
	public void the_user_clicks_try_here_button_button_from_applications_of_binary_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Applications of Binary trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_applications_of_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag55
	@When("user write some valid java code for Applications of Binary trees page then click run button")
	public void user_write_some_valid_java_code_for_applications_of_binary_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Applications of Binary trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_applications_of_binary_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag56
	@When("user write some invalid code for Applications of Binary trees then click run button")
	public void user_write_some_invalid_code_for_applications_of_binary_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Applications of Binary trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_applications_of_binary_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag57
	@When("user write some python code for Applications of Binary trees page as input then click run button")
	public void user_write_some_python_code_for_applications_of_binary_trees_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Applications of Binary trees page")
	public void the_output_will_be_display_in_the_editor_for_applications_of_binary_trees_page() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag58
	@Given("The user is in the Applications of Binary trees page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/");
	}

	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {
		TreeOBJ.select_binary_search_trees();
	}

	@Then("The user should be directed to Binary Search Trees Page")
	public void the_user_should_be_directed_to_binary_search_trees_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/binary-search-trees/");
	}

//	@tag59
	@When("The user clicks Try Here button for Binary Search Trees")
	public void the_user_clicks_try_here_button_for_binary_search_trees() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Search Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_search_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag60
	@When("user write some valid java code for Binary Search Trees page then click run button")
	public void user_write_some_valid_java_code_for_binary_search_trees_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Binary Search Trees page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_binary_search_trees_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}
	
//	@tag61
	@When("user write some invalid code for Binary Search Trees then click run button")
	public void user_write_some_invalid_code_for_binary_search_trees_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Binary Search Trees")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_binary_search_trees(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}
	
//	@tag62
	@When("some python as input then click run button for Binary Search Trees page")
	public void some_python_as_input_then_click_run_button_for_binary_search_trees_pages() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Binary Search Tree page")
	public void the_output_will_be_display_in_the_editor_for_binary_search_tree_page() {
		UtlityFunctionsOBJ.check_python_output();
	}
	

//	@tag63
	@Given("The user is in the Binary Search Trees page")
	public void the_user_is_in_the_binary_search_trees_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/binary-search-trees/");
	}

	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		TreeOBJ.select_implementation_Of_BST();
	}

	@Then("The user should be directed to Implementation Of BST Page")
	public void the_user_should_be_directed_to_implementation_of_bst_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
	}
	
//	@tag64
	@When("The user clicks Try Here button for Implementation Of BST")
	public void the_user_clicks_try_here_button_for_implementation_of_bst() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation Of BST")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_of_bst() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag65
	@When("user write some valid java code for Implementation Of BST page then click run button")
	public void user_write_some_valid_java_code_for_implementation_of_bst_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Implementation Of BST page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_implementation_of_bst_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}
	
//	@tag66
	@When("user write some invalid code for Implementation Of BST then click run button")
	public void user_write_some_invalid_code_for_implementation_of_bst_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Implementation Of BST")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_implementation_of_bst(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag67
	@When("user write some python code for Implementation Of BST page as input then click run button")
	public void user_write_some_python_code_for_implementation_of_bst_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Implementation Of BST page")
	public void the_output_will_be_display_in_the_editor_for_implementation_of_bst_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag68
	@Given("A logged in user is in theImplementation Of BST page")
	public void a_logged_in_user_is_in_the_implementation_of_bst_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
	}

	@When("The user clicks Practice questions link from tree")
	public void the_user_clicks_practice_questions_link_from_tree() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("The user should be directed to practice questions Page for tree")
	public void the_user_should_be_directed_to_practice_questions_page_for_tree() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/tree/practice");
	}
}
