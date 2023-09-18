package pageObjeccts;

import org.openqa.selenium.By;

public class Register extends BaseClass{
	By username=By.id("id_username");
	By password1=By.id("id_password1");
	By password2=By.id("id_password2");
	By loginBtn=By.xpath("//input[@value='Register']");
	
	public void register(){
		chromeDriver.findElement(username).sendKeys("QualityWayTest");
		chromeDriver.findElement(password1).sendKeys("pwd_ds_algo@12");
		chromeDriver.findElement(password2).sendKeys("pwd_ds_algo@12");
		chromeDriver.findElement(loginBtn).click();
	}
}
