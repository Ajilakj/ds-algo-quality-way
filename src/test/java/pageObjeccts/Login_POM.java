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
	
	public void enter_valid_credentials(){
		UtlityFunctionsOBJ.send_keys(username,"QualityWay");
		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2");
	}
	
	public void click_login_button(){
		UtlityFunctionsOBJ.web_element_click(loginBtn);
	}
}
