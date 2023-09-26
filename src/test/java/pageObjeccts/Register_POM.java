package pageObjeccts;

import org.openqa.selenium.By;

import utilities.UtlityFunctions;

public class Register_POM extends BaseClass{
	By username=By.id("id_username");
	By password1=By.id("id_password1");
	By password2=By.id("id_password2");
	By regiterBtn=By.xpath("//input[@value='Register']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void username_empty(){
		UtlityFunctionsOBJ.send_keys(username,"");
	}
	
	public void password_empty(){
		UtlityFunctionsOBJ.send_keys(password1,"");
	}
	
	public void confirm_password_empty(){
		UtlityFunctionsOBJ.send_keys(password2,"");
	}
	
	public void enter_valid_usename(){
		UtlityFunctionsOBJ.send_keys(username,"QualityWayABC");
	}
	
	public void enter_valid_password(){
		UtlityFunctionsOBJ.send_keys(password1,"pwd_ds_algo@2ABC");
	}
	
	public void enter_valid_confirm_password(){
		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2ABC");
	}
	
	public void enter_invalid_password(){
		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2Invalid");
	}
	
	public void click_register_button(){
		UtlityFunctionsOBJ.web_element_click(regiterBtn);
	}
}
