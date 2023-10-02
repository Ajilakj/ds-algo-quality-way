package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjeccts.BaseClass;
import pageObjeccts.Register_POM;
import utilities.UtlityFunctions;

public class Register_SD extends BaseClass{
	Register_POM RegisterOBJ=new Register_POM();
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
//	@tag1
	@Given("User is in register page to check every fields empty")
	public void user_is_in_register_page_to_check_every_fields_empty() {
		driver.get("https://dsportalapp.herokuapp.com/register");
	}

	@When("user leaves username, password and confirm password fields empty")
	public void user_leaves_username_password_and_confirm_password_fields_empty() {
		RegisterOBJ.username_empty();
		RegisterOBJ.password_empty();
		RegisterOBJ.confirm_password_empty();
	}

	@When("clicks register button to check every fields empty")
	public void clicks_register_button_to_check_every_fields_empty() {
		RegisterOBJ.click_register_button();
	}

	@Then("please fill out this field text is displayed for only username-register")
	public void please_fill_out_this_field_text_is_displayed_for_only_username_register() {
		UtlityFunctionsOBJ.get_message_from_active_window();
	}

//	@tag2
	@Given("User is in register page to check password empty")
	public void user_is_in_register_page_to_check_password_empty() {
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("user enters valid username and leaves password field empty in register page")
	public void user_enters_valid_username_and_leaves_password_field_empty_in_register_page() {
		RegisterOBJ.enter_valid_usename();;
		RegisterOBJ.password_empty();
		RegisterOBJ.enter_valid_confirm_password();
	}

	@When("clicks register button to check pssword empty")
	public void clicks_register_button_to_check_pssword_empty() {
		RegisterOBJ.click_register_button();
	}

	@Then("please fill out this field text is displayed for password-register")
	public void please_fill_out_this_field_text_is_displayed_for_password_register() {
		UtlityFunctionsOBJ.get_message_from_active_window();
	}

//	@tag3
	@Given("User is in register page to check username empty")
	public void user_is_in_register_page_to_check_username_empty() {
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("user enters valid password and leaves username field empty in register page")
	public void user_enters_valid_password_and_leaves_username_field_empty_in_register_page() {
		RegisterOBJ.username_empty();;
		RegisterOBJ.enter_valid_password();
		RegisterOBJ.enter_valid_confirm_password();
	}

	@When("clicks register button to check username empty")
	public void clicks_register_button_to_check_username_empty() {
		RegisterOBJ.click_register_button();
	}

	@Then("please fill out this field text is displayed for username-register")
	public void please_fill_out_this_field_text_is_displayed_for_username_register() {
		UtlityFunctionsOBJ.get_message_from_active_window();
	}

//	@tag4
	@Given("User is in register page to check confirm password empty")
	public void user_is_in_register_page_to_check_confirm_password_empty() {
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("user enters valid password and username but leaves confirm password field empty")
	public void user_enters_valid_password_and_username_but_leaves_confirm_password_field_empty() {
		RegisterOBJ.enter_valid_usename();
		RegisterOBJ.enter_valid_password();
		RegisterOBJ.confirm_password_empty();
	}

	@When("clicks register button to check confirm password empty")
	public void clicks_register_button_to_check_confirm_password_empty() {
		RegisterOBJ.click_register_button();
	}

	@Then("please fill out this field text is displayed for confirm password")
	public void please_fill_out_this_field_text_is_displayed_for_confirm_password() {
		UtlityFunctionsOBJ.get_message_from_active_window();
	}

//	@tag5
	@Given("User is in register page to check similarity between usename and password")
	public void user_is_in_register_page_to_check_similarity_between_usename_and_password() {
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("enters a username and password same as usename then confirm password")
	public void enters_a_username_and_password_same_as_usename_then_confirm_password() {
		RegisterOBJ.enter_valid_usename();
		RegisterOBJ.enter_same_password_as_usename();
	}

	@When("clicks register button to check similarity similarity between usename and password")
	public void clicks_register_button_to_check_similarity_similarity_between_usename_and_password() {
		RegisterOBJ.click_register_button();
	}

	@Then("Your password can’t be too similar to your other personal information message should display")
	public void your_password_can_t_be_too_similar_to_your_other_personal_information_message_should_display() {
		UtlityFunctionsOBJ.get_message_from_alert();
	}

//	@tag6
	@Given("User is in register page to check password length")
	public void user_is_in_register_page_to_check_password_length() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("enters a valid username and password contains less than min characters")
	public void enters_a_valid_username_and_password_contains_less_than_min_characters() {
		RegisterOBJ.enter_valid_usename();
		RegisterOBJ.enter_password_less_than_eight();
	}

	@When("clicks register button to check password length")
	public void clicks_register_button_to_check_password_length() {
		RegisterOBJ.click_register_button();
	}

	@Then("Your password must contain at least {int} characters message should display")
	public void your_password_must_contain_at_least_characters_message_should_display(Integer int1) {
		RegisterOBJ.enter_password_less_than_eight_msg();;
	}

//	@tag7
	@Given("User is in register page to check password characters")
	public void user_is_in_register_page_to_check_password_characters() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("enters a valid username and password only with numbers")
	public void enters_a_valid_username_and_password_only_with_numbers() {
		RegisterOBJ.enter_valid_usename();
		RegisterOBJ.enter_password_only_numeric();
	}

	@When("clicks register button to check password characters")
	public void clicks_register_button_to_check_password_characters() {
		RegisterOBJ.click_register_button();
	}

	@Then("Your password can not be entirely numeric message should display")
	public void your_password_can_not_be_entirely_numeric_message_should_display() {
		RegisterOBJ.enter_password_only_numeric_msg();
	}

//	@tag8
	@Given("user is in the Register page to check password mismatch")
	public void user_is_in_the_register_page_to_check_password_mismatch() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		RegisterOBJ.enter_valid_usename();
	}

	@When("enters valid password in password textbox, enters invalid or different password in password confirmation box")
	public void enters_valid_password_in_password_textbox_enters_invalid_or_different_password_in_password_confirmation_box() {
		RegisterOBJ.enter_valid_usename();
		RegisterOBJ.password_mismatch();
	}

	@When("clicks the register button")
	public void clicks_the_register_button() {
		RegisterOBJ.click_register_button();
	}

	@Then("password_mismatch:The two password fields didn not match message should appears below.")
	public void password_mismatch_the_two_password_fields_didn_not_match_message_should_appears_below() {
		RegisterOBJ.password_mismatch_msg();
	}

//	@tag9
	@Given("user is in the Register page to check existing user")
	public void user_is_in_the_register_page_to_check_existing_user() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("user enter an already existing username but valid passwords")
	public void user_enter_an_already_existing_username_but_valid_passwords() {
		RegisterOBJ.enter_existing_username();
	}

	@When("clicks the register button to check existing user")
	public void clicks_the_register_button_to_check_existing_user() {
		RegisterOBJ.click_register_button();
	}

	@Then("user already exists message should appears.")
	public void user_already_exists_message_should_appears() {
		RegisterOBJ.enter_existing_username_msg();
	}
	
	
//	@tag10
	@Given("User is in register page")
	public void user_is_in_register_page() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("use click login link from register page")
	public void use_click_login_link_from_register_page() {
		UtlityFunctionsOBJ.click_login_link();
	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		UtlityFunctionsOBJ.check_url_login();
	}

//	@tag11
	@Given("User is in register page to check successful register with valid credentials")
	public void user_is_in_register_page_to_check_successful_register_with_valid_credentials() {
		UtlityFunctionsOBJ.click_back_button();
		UtlityFunctionsOBJ.check_url_register();
	}

	@When("enters valid username, valid password and confirm password")
	public void enters_valid_username_valid_password_and_confirm_password() {
		RegisterOBJ.enter_valid_usename();
		RegisterOBJ.enter_valid_password();
		RegisterOBJ.enter_valid_confirm_password();	
	}

	@When("clicks register button")
	public void clicks_register_button() {
		RegisterOBJ.click_register_button();
	}

	@Then("user will navigate to home page")
	public void user_will_navigate_to_home_page() {
		UtlityFunctionsOBJ.check_url_home();
	}
	
}
