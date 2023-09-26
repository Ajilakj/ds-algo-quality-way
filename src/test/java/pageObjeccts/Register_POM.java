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
	
	public void enter_same_password_as_usename(){
		UtlityFunctionsOBJ.send_keys(password1,"QualityWayABC");
		UtlityFunctionsOBJ.send_keys(password2,"QualityWayABC");
	}
	
	public void enter_password_less_than_eight(){
		UtlityFunctionsOBJ.send_keys(password1,"Quality");
		UtlityFunctionsOBJ.send_keys(password2,"Quality");
	}
	
	public void enter_password_only_numeric(){
		UtlityFunctionsOBJ.send_keys(password1,"123456789");
		UtlityFunctionsOBJ.send_keys(password2,"123456789");
	}
	
	public void password_mismatch(){
		UtlityFunctionsOBJ.send_keys(password1,"pwd_ds_algo@2ABC");
		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2ABCD");
	}
	
	public void enter_same_password_as_usename_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "Your password can’t be too similar to your other personal information.");
	}
	
	public void enter_password_less_than_eight_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "Your password must contain at least 8 characters.");
	}
	
	public void enter_password_only_numeric_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "Your password can’t be entirely numeric.");
	}
	
	public void password_mismatch_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "password_mismatch:The two password fields didn’t match.");
	}
	
	public void click_register_button(){
		UtlityFunctionsOBJ.web_element_click(regiterBtn);
	}
}
