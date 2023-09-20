package pageObjeccts;

import org.openqa.selenium.By;
import utilities.UtlityFunctions;

public class Login_POM extends BaseClass {
	By username=By.id("id_username");
	By password=By.id("id_password");
	By loginBtn=By.xpath("//input[@value='Login']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void enter_valid_credentials(){
		chromeDriver.findElement(username).sendKeys("QualityWay");
		chromeDriver.findElement(password).sendKeys("pwd_ds_algo@2");
	}
	
	public void login(){
		chromeDriver.findElement(loginBtn).click();
	}
	
	public void check_url_home(){
		String actual_url=chromeDriver.getCurrentUrl();
		String expected_url="https://dsportalapp.herokuapp.com/home";
		UtlityFunctionsOBJ.check_url(actual_url, expected_url);
	}
}
