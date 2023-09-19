package pageObjeccts;

import org.openqa.selenium.By;


public class Login_POM extends BaseClass {
	By username=By.id("id_username");
	By password=By.id("id_password");
	By loginBtn=By.xpath("//input[@value='Login']");
	
	public void login(){
		chromeDriver.findElement(username).sendKeys("QualityWay");
		chromeDriver.findElement(password).sendKeys("pwd_ds_algo@2");
		chromeDriver.findElement(loginBtn).click();
	}
	
}
