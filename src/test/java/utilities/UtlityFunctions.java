package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjeccts.BaseClass;

public class UtlityFunctions extends BaseClass {
	public static void webElementClick(By webEle) {
		chromeDriver.findElement(webEle).click();
	}
}
