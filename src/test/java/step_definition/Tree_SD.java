package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Tree_POM;
import utilities.UtlityFunctions;

public class Tree_SD extends BaseClass {
	
	Tree_POM TreeOBJ=new Tree_POM();
	WebDriver chromeDriver=super.chromeDriver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1 
	@Given("An existing user is in the Home page for tree")
	public void an_existing_user_is_in_the_home_page_for_tree() {
		chromeDriver.get("https://dsportalapp.herokuapp.com/home");
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
		UtlityFunctionsOBJ.click_DS_dropdown();;
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
	@When("some python as input then click run button for Overview of Trees")
	public void some_python_as_input_then_click_run_button_for_overview_of_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Overview of Trees")
	public void the_output_will_be_display_in_the_editor_for_overview_of_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag6
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

//	@tag7
	@When("The user clicks Try Here button from Terminologies page")
	public void the_user_clicks_try_here_button_from_terminologies_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Terminologies")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_terminologies() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag8
	@When("some python as input then click run button for Terminologies")
	public void some_python_as_input_then_click_run_button_for_terminologies() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Terminologies")
	public void the_output_will_be_display_in_the_editor_for_terminologies() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag9
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

//	@tag10
	@When("The user clicks Try Here button button from Types of Trees page")
	public void the_user_clicks_try_here_button_button_from_types_of_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Types of Trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag11
	@When("some python as input then click run button for Types of Trees")
	public void some_python_as_input_then_click_run_button_for_types_of_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Types of Trees")
	public void the_output_will_be_display_in_the_editor_for_types_of_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag12
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

//	@tag13
	@When("The user clicks Try Here button for Tree Traversals")
	public void the_user_clicks_try_here_button_for_tree_traversals() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Tree Traversals")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_tree_traversals() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag14
	@When("some python as input then click run button for Tree Traversals")
	public void some_python_as_input_then_click_run_button_for_tree_traversals() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor  for Tree Traversals")
	public void the_output_will_be_display_in_the_editor_for_tree_traversals() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag15
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

//	@tag16
	@When("The user clicks Try Here button for Traversals-Illustration")
	public void the_user_clicks_try_here_button_for_traversals_illustration() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Traversals-Illustration")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_traversals_illustration() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag17
	@When("some python as input then click run button for Traversals-Illustration")
	public void some_python_as_input_then_click_run_button_for_traversals_illustration() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Traversals-Illustration")
	public void the_output_will_be_display_in_the_editor_for_traversals_illustration() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag18
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

//	@tag19
	@When("The user clicks Try Here button from Binary Trees page")
	public void the_user_clicks_try_here_button_from_binary_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag20
	@When("some python as input then click run button for Binary Trees")
	public void some_python_as_input_then_click_run_button_for_binary_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Binary Trees")
	public void the_output_will_be_display_in_the_editor_for_binary_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag21
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

//	@tag22
	@When("The user clicks Try Here button button from Types of Binary Trees")
	public void the_user_clicks_try_here_button_button_from_types_of_binary_trees() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Types of Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag23
	@When("some python as input then click run button for Types of Binary Trees")
	public void some_python_as_input_then_click_run_button_for_types_of_binary_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Types of Binary Trees")
	public void the_output_will_be_display_in_the_editor_for_types_of_binary_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag24
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

//	@tag25
	@When("The user clicks Try Here button for Implementation in Python")
	public void the_user_clicks_try_here_button_for_implementation_in_python() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation in Python")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_in_python() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag26
	@When("some python as input then click run button for Implementation in Python")
	public void some_python_as_input_then_click_run_button_for_implementation_in_python() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor  for Implementation in Python")
	public void the_output_will_be_display_in_the_editor_for_implementation_in_python() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag27
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

//	@tag28
	@When("The user clicks Try Here button for Binary Tree Traversals")
	public void the_user_clicks_try_here_button_for_binary_tree_traversals() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Tree Traversals")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_tree_traversals() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag29
	@When("some python as input then click run button for Binary Tree Traversals")
	public void some_python_as_input_then_click_run_button_for_binary_tree_traversals() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Binary Tree Traversals")
	public void the_output_will_be_display_in_the_editor_for_binary_tree_traversals() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag30
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

//	@tag31
	@When("The user clicks Try Here button from Implementation of Binary Trees page")
	public void the_user_clicks_try_here_button_from_implementation_of_binary_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation of Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_of_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag32
	@When("some python as input then click run button for Implementation of Binary Trees")
	public void some_python_as_input_then_click_run_button_for_implementation_of_binary_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}
	@Then("The output will be display in the editor for Implementation of Binary Trees")
	public void the_output_will_be_display_in_the_editor_for_implementation_of_binary_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag33
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

//	@tag34
	@When("The user clicks Try Here button button from Applications of Binary trees page")
	public void the_user_clicks_try_here_button_button_from_applications_of_binary_trees_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for Applications of Binary trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_applications_of_binary_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	

//	@tag35
	@When("some python as input then click run button for Applications of Binary trees")
	public void some_python_as_input_then_click_run_button_for_applications_of_binary_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Applications of Binary trees")
	public void the_output_will_be_display_in_the_editor_for_applications_of_binary_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag36
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

//	@tag37
	@When("The user clicks Try Here button for Binary Search Trees")
	public void the_user_clicks_try_here_button_for_binary_search_trees() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Search Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_search_trees() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag38
	@When("some python as input then click run button for Binary Search Trees")
	public void some_python_as_input_then_click_run_button_for_binary_search_trees() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor  for Binary Search Trees")
	public void the_output_will_be_display_in_the_editor_for_binary_search_trees() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag39
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

//	@tag40
	@When("The user clicks Try Here button for Implementation Of BST")
	public void the_user_clicks_try_here_button_for_implementation_of_bst() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation Of BST")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_of_bst() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag41
	@When("some python as input then click run button for Implementation Of BST")
	public void some_python_as_input_then_click_run_button_for_implementation_of_bst() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor  for Implementation Of BST")
	public void the_output_will_be_display_in_the_editor_for_implementation_of_bst() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag42
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
