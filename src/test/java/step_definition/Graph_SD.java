package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Graph_POM;
import utilities.UtlityFunctions;


public class Graph_SD extends BaseClass {
	
	Graph_POM GraphOBJ=new Graph_POM();
	WebDriver driver=super.driver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	  @tag1 
	@Given("An existing user is in the Home page after logged in")
	public void an_existing_user_is_in_the_home_page_after_logged_in() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks the Getting Started button in Graph Pane")
	public void the_user_clicks_the_getting_started_button_in_graph_pane() {
		GraphOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to Graph Page")
	public void graph_page_will_load() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/");
	}
	
//	  @tag2 
	@Given("A valid user is in the Home page after logged in")
	public void a_valid_user_is_in_the_home_page_after_logged_in() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	@When("The user select the option Graph from the datastructure drop down menu")
	public void the_user_select_the_option_graph_from_the_datastructure_drop_down_menu() {
		UtlityFunctionsOBJ.click_DS_dropdown();;
		GraphOBJ.select_graph_from_drop_down();
	}

	@Then("The user will directed to graph Page")
	public void the_user_will_directed_to_graph_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/");
	}
	
//	  @tag3
	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/");
	}

	@When("The user clicks Graph link")
	public void the_user_clicks_graph_link() {
		GraphOBJ.select_graph_from_left_link();
	}

	@Then("The user should be directed to graph\\/graph Page")
	public void the_user_should_be_directed_to_graph_graph_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/graph/");
	}

//	@tag4
	@When("The user clicks Try Here button for Graph page")
	public void the_user_clicks_try_here_button_for_graph_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for Graph page")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_graph_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag5
	@When("user write some valid java code for Graph page then click run button")
	public void user_write_some_valid_java_code_for_graph_page_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Graph page")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_graph_page(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag6
	@When("user write some invalid code for Graph then click run button")
	public void user_write_some_invalid_code_for_graph_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line 1 will display for Graph")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_graph() {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag7
	@When("user write some python code for Graph page as input then click run button")
	public void user_write_some_python_code_for_graph_page_as_input_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for Graph page")
	public void the_output_will_be_display_in_the_editor_for_graph_page() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	  @tag8
	@Given("The user is in the Graph page for Graph Representations")
	public void the_user_is_in_the_graph_page_graph_representations() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/graph/");
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
		GraphOBJ.select_graph_reprsentation_from_left_link();
	}

	@Then("The user should be directed to Graph Representations Page")
	public void the_user_should_be_directed_to_graph_representations_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/graph-representations/");
	}
	
//	@tag9
	@Given("The user is in the graph Representations page")
	public void the_user_is_in_the_graph_representations_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/graph-representations/");
	}

	@When("The user clicks Try Here button for Graph Representations")
	public void the_user_clicks_try_here_button_for_graph_representations() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("A tryEditor page with run button will appear for Graph Representations page")
	public void a_try_editor_page_with_run_button_will_appear_for_graph_representations_page() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag10
	@When("user write some valid java code for Graph Representations then click run button")
	public void user_write_some_valid_java_code_for_graph_representations_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_valid_java_code();
	}

	@Then("an alert with NameError: name System is not defined on line {int} will display for Graph Representations")
	public void an_alert_with_name_error_name_system_is_not_defined_on_line_will_display_for_graph_representations(Integer int1) {
		UtlityFunctionsOBJ.check_output_valid_java();
	}

//	@tag11
	@When("user write some invalid java code for Graph Representations then click run button")
	public void user_write_some_invalid_java_code_for_graph_representations_then_click_run_button() {
		UtlityFunctionsOBJ.try_editor_invalid_code();
	}

	@Then("an alert with SyntaxError: bad input on line {int} will display for Graph Representations")
	public void an_alert_with_syntax_error_bad_input_on_line_will_display_for_graph_representations(Integer int1) {
		UtlityFunctionsOBJ.check_output_invalid_code();
	}

//	@tag12
	@When("The user enter some code in python for Graph Representations and click run button")
	public void the_user_enter_some_code_in_python_for_graph_representations_and_click_run_button() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output from the pyton code will display in the editor for Graph Representations")
	public void the_output_from_the_pyton_code_will_display_in_the_editor_for_graph_representations() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag13
	@Given("A logged in user is in the graph home page")
	public void a_logged_in_user_is_in_the_graph_home_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/graph-representations/");	
	}
	@When("The user clicks Practice questions link for Graph page")
	public void the_user_clicks_practice_questions_link_for_graph_page() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("The user should be directed to practice questions Page for Graph page")
	public void the_user_should_be_directed_to_practice_questions_page_for_graph_page() {
		 UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/graph/practice");
	}
}
