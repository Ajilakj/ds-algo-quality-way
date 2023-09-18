package pageObjeccts;

import org.openqa.selenium.By;


public class Login extends BaseClass {
	By username=By.id("id_username");
	By password=By.id("id_password");
	By loginBtn=By.xpath("//input[@value='Login']");
	
	public void test1(){
		chromeDriver.findElement(username).sendKeys("QualityWay");
		chromeDriver.findElement(password).sendKeys("pwd_ds_algo@2");
		chromeDriver.findElement(loginBtn).click();
	}
	
//	public static void main(String[] args){
//		Login LoginOBJ=new Login();
//		LoginOBJ.test1();
//	}
}
