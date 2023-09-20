package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjeccts.BaseClass;

public class UtlityFunctions extends BaseClass {
	
	public static void web_element_click(By webEle) {
		chromeDriver.findElement(webEle).click();
	}
	
	public static void check_url(String actual_url, String expected_url){
		Assert.assertEquals(actual_url, expected_url);
	}
	
	public static void check_text(String actual_text, String expected_text){
		Assert.assertEquals(actual_text, expected_text);
	}
	
	public static void send_keys(By ele, String text){
		chromeDriver.findElement(ele).sendKeys(text);
	}
}
