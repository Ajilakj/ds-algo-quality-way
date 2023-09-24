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

	@Given("The user is in the tree page")
	public void the_user_is_in_the_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Overview of Trees Page")
	public void the_user_should_be_directed_to_overview_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Overview of Trees")
	public void the_user_clicks_try_here_button_for_overview_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Overview of Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_overview_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Overview of Trees")
	public void some_python_as_input_then_click_run_button_for_overview_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Overview of Trees")
	public void the_output_will_be_display_in_the_editor_for_overview_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Overview of Trees Page")
	public void the_user_is_in_the_overview_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Terminologiess Page")
	public void the_user_should_be_directed_to_terminologiess_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button from Terminologies page")
	public void the_user_clicks_try_here_button_from_terminologies_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Terminologies")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_terminologies() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Terminologies")
	public void some_python_as_input_then_click_run_button_for_terminologies() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Terminologies")
	public void the_output_will_be_display_in_the_editor_for_terminologies() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the queue page Terminologies page")
	public void the_user_is_in_the_queue_page_terminologies_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Types of Trees Page")
	public void the_user_should_be_directed_to_types_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button button from Types of Trees page")
	public void the_user_clicks_try_here_button_button_from_types_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor for Types of Trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Types of Trees")
	public void some_python_as_input_then_click_run_button_for_types_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Types of Trees")
	public void the_output_will_be_display_in_the_editor_for_types_of_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Types of Trees page")
	public void the_user_is_in_the_types_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Tree Traversals")
	public void the_user_clicks_try_here_button_for_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Tree Traversals")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Tree Traversals")
	public void some_python_as_input_then_click_run_button_for_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor  for Tree Traversals")
	public void the_output_will_be_display_in_the_editor_for_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Tree Traversals")
	public void the_user_is_in_the_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Traversals-Illustration")
	public void the_user_should_be_directed_to_traversals_illustration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Traversals-Illustration")
	public void the_user_clicks_try_here_button_for_traversals_illustration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Traversals-Illustration")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_traversals_illustration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Traversals-Illustration")
	public void some_python_as_input_then_click_run_button_for_traversals_illustration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Traversals-Illustration")
	public void the_output_will_be_display_in_the_editor_for_traversals_illustration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Traversals-Illustration Page")
	public void the_user_is_in_the_traversals_illustration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Binary Trees Page")
	public void the_user_should_be_directed_to_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button from Binary Trees page")
	public void the_user_clicks_try_here_button_from_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Binary Trees")
	public void some_python_as_input_then_click_run_button_for_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Binary Trees")
	public void the_output_will_be_display_in_the_editor_for_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the queue page Binary Trees page")
	public void the_user_is_in_the_queue_page_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Types of Binary Trees Page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button button from Types of Binary Trees")
	public void the_user_clicks_try_here_button_button_from_types_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor for Types of Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_for_types_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Types of Binary Trees")
	public void some_python_as_input_then_click_run_button_for_types_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Types of Binary Trees")
	public void the_output_will_be_display_in_the_editor_for_types_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Types of Binary Trees")
	public void the_user_is_in_the_types_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Implementation in Python")
	public void the_user_clicks_implementation_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Tree TraversalsImplementation in Python Page")
	public void the_user_should_be_directed_to_tree_traversals_implementation_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Implementation in Python")
	public void the_user_clicks_try_here_button_for_implementation_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation in Python")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Implementation in Python")
	public void some_python_as_input_then_click_run_button_for_implementation_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor  for Implementation in Python")
	public void the_output_will_be_display_in_the_editor_for_implementation_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Implementation in Python page")
	public void the_user_is_in_the_implementation_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Binary Tree Traversalslink")
	public void the_user_clicks_binary_tree_traversalslink() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Binary Tree Traversals Page")
	public void the_user_should_be_directed_to_binary_tree_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Binary Tree Traversals")
	public void the_user_clicks_try_here_button_for_binary_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Tree Traversals")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Binary Tree Traversals")
	public void some_python_as_input_then_click_run_button_for_binary_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor for Binary Tree Traversals")
	public void the_output_will_be_display_in_the_editor_for_binary_tree_traversals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Binary Tree Traversals Page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button from Implementation of Binary Trees page")
	public void the_user_clicks_try_here_button_from_implementation_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation of Binary Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Implementation of Binary Trees")
	public void some_python_as_input_then_click_run_button_for_implementation_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The output will be display in the editor for Implementation of Binary Trees")
	public void the_output_will_be_display_in_the_editor_for_implementation_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the queue page Implementation of Binary Trees page")
	public void the_user_is_in_the_queue_page_implementation_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Applications of Binary trees Page")
	public void the_user_should_be_directed_to_applications_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Applications of Binary trees")
	public void the_user_clicks_try_here_button_for_applications_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Applications of Binary trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_applications_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Applications of Binary trees")
	public void some_python_as_input_then_click_run_button_for_applications_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor  for Applications of Binary trees")
	public void the_output_will_be_display_in_the_editor_for_applications_of_binary_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Applications of Binary trees page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Tree TraversalsBinary Search Trees Page")
	public void the_user_should_be_directed_to_tree_traversals_binary_search_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Binary Search Trees")
	public void the_user_clicks_try_here_button_for_binary_search_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Binary Search Trees")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_binary_search_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Binary Search Trees")
	public void some_python_as_input_then_click_run_button_for_binary_search_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor  for Binary Search Trees")
	public void the_output_will_be_display_in_the_editor_for_binary_search_trees() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Binary Search Trees page")
	public void the_user_is_in_the_binary_search_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Implementation Of BST Page")
	public void the_user_should_be_directed_to_implementation_of_bst_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button for Implementation Of BST")
	public void the_user_clicks_try_here_button_for_implementation_of_bst() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a tryEditor page for Implementation Of BST")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_implementation_of_bst() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some python as input then click run button for Implementation Of BST")
	public void some_python_as_input_then_click_run_button_for_implementation_of_bst() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output will be display in the editor  for Implementation Of BST")
	public void the_output_will_be_display_in_the_editor_for_implementation_of_bst() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("A logged in user is in theImplementation Of BST page")
	public void a_logged_in_user_is_in_the_implementation_of_bst_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Practice questions link from tree")
	public void the_user_clicks_practice_questions_link_from_tree() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to practice questions Page for tree")
	public void the_user_should_be_directed_to_practice_questions_page_for_tree() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
