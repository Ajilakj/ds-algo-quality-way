package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Graph_POM;
import utilities.UtlityFunctions;

public class Graph_SD extends BaseClass {
	
	Graph_POM GraphOBJ=new Graph_POM();
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions(chromeDriver);
	
	@Given("An existing user is in the Home page after logged in")
	public void an_existing_user_is_in_the_home_page_after_logged_in() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks the Getting Started button in Graph Pane")
	public void the_user_clicks_the_getting_started_button_in_graph_pane() {
		GraphOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to Graph Page")
	public void the_user_will_directed_to_graph_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/array/");
	}

//	@When("The user select the option Graph from the datastructure drop down menu")
//	public void the_user_select_the_option_graph_from_the_datastructure_drop_down_menu() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user will directed to graph Page")
//	public void the_user_will_directed_to_graph_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is in the Graph page")
//	public void the_user_is_in_the_graph_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Graph link")
//	public void the_user_clicks_graph_link() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to graph\\/graph Page")
//	public void the_user_should_be_directed_to_graph_graph_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Try Here button")
//	public void the_user_clicks_try_here_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to a tryEditor page")
//	public void the_user_should_be_redirected_to_a_try_editor_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("some python as input then click run button")
//	public void some_python_as_input_then_click_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The output will be display in the editor")
//	public void the_output_will_be_display_in_the_editor() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Graph Representations link")
//	public void the_user_clicks_graph_representations_link() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to Graph Representations Page")
//	public void the_user_should_be_directed_to_graph_representations_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("A logged in user is in the Graph Representations page")
//	public void a_logged_in_user_is_in_the_graph_representations_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("A tryEditor page with run button will appear")
//	public void a_try_editor_page_with_run_button_will_appear() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user enter some code in python and click run button")
//	public void the_user_enter_some_code_in_python_and_click_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Practice questions link")
//	public void the_user_clicks_practice_questions_link() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be directed to practice questions Page")
//	public void the_user_should_be_directed_to_practice_questions_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
