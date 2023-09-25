package pageObjeccts;

import org.openqa.selenium.By;

import utilities.UtlityFunctions;

public class Login_POM extends BaseClass {
	By username=By.id("id_username");
	By password=By.id("id_password");
	By loginBtn=By.xpath("//input[@value='Login']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void username_empty(){
		UtlityFunctionsOBJ.send_keys(username,"");
	}
	
	public void password_empty(){
		UtlityFunctionsOBJ.send_keys(password,"");
	}
	
	public void enter_valid_usename(){
		UtlityFunctionsOBJ.send_keys(username,"QualityWay");
	}
	
	public void enter_valid_password(){
		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2");
	}
	
	public void enter_invalid_usename(){
		UtlityFunctionsOBJ.send_keys(username,"QualityWayInvalid");
	}
	
	public void enter_invalid_password(){
		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2Invalid");
	}
	
	public void click_login_button(){
		UtlityFunctionsOBJ.web_element_click(loginBtn);
	}
	
	public void invalid_username_password__msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "Invalid Username and Password");
	}
}
