package pageObjeccts;

import org.openqa.selenium.By;

import utilities.UtlityFunctions;

public class Register_POM extends BaseClass{
	By username=By.id("id_username");
	By password1=By.id("id_password1");
	By password2=By.id("id_password2");
	By regiterBtn=By.xpath("//input[@value='Register']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void enter_valid_credentials() {
		UtlityFunctionsOBJ.send_keys(username,"QualityWayAB");
		UtlityFunctionsOBJ.send_keys(password1,"pwd_ds_algo@12ABC");
		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@12ABC");
	}
	
	public void register(){
		UtlityFunctionsOBJ.web_element_click(regiterBtn);
	}
}
