package step_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Graph_POM;
import pageObjeccts.Queue_POM;
import utilities.UtlityFunctions;

public class Queue_SD extends BaseClass  {
	Queue_POM QueueOBJ=new Queue_POM();
	WebDriver chromeDriver=super.chromeDriver;
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1 
	@Given("An existing user is in the Home page")
	public void an_existing_user_is_in_the_home_page() {
		chromeDriver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	@When("The user clicks the Getting Started button in queue Pane")
	public void the_user_clicks_the_getting_started_button_in_queue_pane() {
		QueueOBJ.click_get_start_lnk();
	}

	@Then("The user will directed to queue Page")
	public void the_user_will_directed_to_queue_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/");
	}

//	@tag2
	@When("The user select the option queue from the datastructure drop down menu")
	public void the_user_select_the_option_queue_from_the_datastructure_drop_down_menu() {
		UtlityFunctionsOBJ.click_DS_dropdown();
		QueueOBJ.select_queue_from_drop_down();
	}
	
	@Then("The user will directed to queue Page using dropdown")
	public void the_user_will_directed_to_queue_page_using_dropdown() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/");
	}

//	@tag3
	@Given("The user is in the queue page")
	public void the_user_is_in_the_queue_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/");
	}

	@When("The user clicks Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
		QueueOBJ.select_queue_in_python();
	}
	
	@Then("The user should be directed to queue\\/implementation-lists Page")
	public void the_user_should_be_directed_to_queue_implementation_lists_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/implementation-lists/");
	}
	
//	@tag4
	@When("The user clicks Try Here button for queue\\/implementation-lists")
	public void the_user_clicks_try_here_button_for_queue_implementation_lists() {
		UtlityFunctionsOBJ.click_try_here();
	}
	
	@Then("The user should be redirected to a tryEditor page for queue\\/implementation-lists")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_queue_implementation_lists() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}
	
//	@tag5
	@When("some python as input then click run button for queue\\/implementation-lists")
	public void some_python_as_input_then_click_run_button_for_queue_implementation_lists() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for queue\\/implementation-lists")
	public void the_output_will_be_display_in_the_editor_for_queue_implementation_lists() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag6
	@Given("The user is in the queue\\/implementation-lists Page")
	public void the_user_is_in_the_queue_implementation_lists_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/implementation-lists/");
	}

	@When("The user clicks Implementation using collections link")
	public void the_user_clicks_implementation_using_collections_link() {
		QueueOBJ.select_queue_using_collections();
	}

	@Then("The user should be directed to queue\\/implementation-collectionss Page")
	public void the_user_should_be_directed_to_queue_implementation_collectionss_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/implementation-collections/");
	}

//	@tag7
	@When("The user clicks Try Here button from queue\\/implementation-collections page")
	public void the_user_clicks_try_here_button_from_queue_implementation_collections_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for queue\\/implementation-collections")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_queue_implementation_collections() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag8
	@When("some python as input then click run button for queue\\/implementation-collections")
	public void some_python_as_input_then_click_run_button_for_queue_implementation_collections() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for queue\\/implementation-collections")
	public void the_output_will_be_display_in_the_editor_for_queue_implementation_collections() {
		UtlityFunctionsOBJ.check_python_output();
	}
	
//	@tag9 
	@Given("The user is in the queue page queue\\/implementation-collections  page")
	public void the_user_is_in_the_queue_page_queue_implementation_collections_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/implementation-collections/");
	}
	
	@When("The user clicks implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {
		UtlityFunctionsOBJ.click_back_button();
		QueueOBJ.select_queue_using_arrays();
	}

	@Then("The user should be directed to queue\\/implementation using array Page")
	public void the_user_should_be_directed_to_queue_implementation_using_array_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/Implementation-array/");
	}
	
//	@tag10 
	@When("The user clicks Try Here button button from queue\\/implementation using array page")
	public void the_user_clicks_try_here_button_button_from_queue_implementation_using_array_page() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor for queue\\/implementation using array")
	public void the_user_should_be_redirected_to_a_try_editor_for_queue_implementation_using_array() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag11 
	@When("some python as input then click run button for queue\\/implementation using array")
	public void some_python_as_input_then_click_run_button_for_queue_implementation_using_array() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor for queue\\/implementation using array")
	public void the_output_will_be_display_in_the_editor_for_queue_implementation_using_array() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag12 
	@Given("The user is in the queue\\/implementation using array page")
	public void the_user_is_in_the_queue_implementation_using_array_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/Implementation-array/");
	}

	@When("The user clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {
		QueueOBJ.select_queue_operations();
	}

	@Then("The user should be directed to queue\\/Queue Operations Page")
	public void the_user_should_be_directed_to_queue_queue_operations_page() {
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/QueueOp/");
	}

//	@tag13
	@When("The user clicks Try Here button for queue\\/Queue Operations")
	public void the_user_clicks_try_here_button_for_queue_queue_operations() {
		UtlityFunctionsOBJ.click_try_here();
	}

	@Then("The user should be redirected to a tryEditor page for queue\\/Queue Operations")
	public void the_user_should_be_redirected_to_a_try_editor_page_for_queue_queue_operations() {
		UtlityFunctionsOBJ.check_url_try_editor();
	}

//	@tag14 
	@When("some python as input then click run button for queue\\/Queue Operations")
	public void some_python_as_input_then_click_run_button_for_queue_queue_operations() {
		UtlityFunctionsOBJ.try_editor_python_code();
	}

	@Then("The output will be display in the editor  for queue\\/Queue Operations")
	public void the_output_will_be_display_in_the_editor_for_queue_queue_operations() {
		UtlityFunctionsOBJ.check_python_output();
	}

//	@tag15 
	@Given("A logged in user is in the Queue Operations page")
	public void a_logged_in_user_is_in_the_queue_operations_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/QueueOp/");
	}


	@When("The user clicks Practice questions link from queue")
	public void the_user_clicks_practice_questions_link_from_queue() {
		UtlityFunctionsOBJ.select_practice_questions_link();
	}

	@Then("The user should be directed to practice questions Page for queue")
	public void the_user_should_be_directed_to_practice_questions_page_for_queue() {
		 UtlityFunctionsOBJ.check_url("https://dsportalapp.herokuapp.com/queue/practice");
	}
}
