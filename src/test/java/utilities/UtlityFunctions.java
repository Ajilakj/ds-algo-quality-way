package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObjeccts.BaseClass;

public class UtlityFunctions extends BaseClass {
//	public  UtlityFunctions(WebDriver driver) {
//		super.chromeDriver = driver;
//		PageFactory.initElements(chromeDriver, this);
//	} 
	static By sign_in=By.partialLinkText("Sign in");
	static By register =By.partialLinkText("Register");

	public void web_element_click(By webEle) {
		chromeDriver.findElement(webEle).click();
	}
	
	public void check_url(String expected_url){
		chromeDriver.navigate().refresh();
		String current_url=chromeDriver.getCurrentUrl();
		Assert.assertEquals(current_url, expected_url);
	}
	
	public void check_text(String actual_text, String expected_text){
		Assert.assertEquals(actual_text, expected_text);
	}
	
	public void send_keys(By ele, String text){
		chromeDriver.findElement(ele).sendKeys(text);
	}
	
	public void click_sign_in(){
		web_element_click(sign_in); 
	}
	
	public void click_register(){
		web_element_click(register);
	}
	
	public void check_url_home(){
		String expected_url="https://dsportalapp.herokuapp.com/home";
		check_url(expected_url);
	}
}
