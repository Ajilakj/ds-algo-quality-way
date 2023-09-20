package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjeccts.BaseClass;

public class UtlityFunctions extends BaseClass {
	
	public static void webElementClick(By webEle) {
		chromeDriver.findElement(webEle).click();
	}
	
	public static void checkUrl(String actual_url, String expected_url){
		Assert.assertEquals(actual_url, expected_url);
	}
	
	public static void checText(String actual_text, String expected_text){
		Assert.assertEquals(actual_text, expected_text);
	}
}
