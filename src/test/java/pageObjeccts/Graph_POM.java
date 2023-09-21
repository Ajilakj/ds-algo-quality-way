package pageObjeccts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Graph_POM extends BaseClass{
//	public  Graph_POM(WebDriver driver) {
//		this.chromeDriver = driver;
//		PageFactory.initElements(chromeDriver, this);
//	} 
	
	By getStartedLnk=By.xpath("//a[@href='array']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions(chromeDriver);
	String expected_url="";
	
	
	
	public void click_get_start_lnk(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UtlityFunctionsOBJ.web_element_click(getStartedLnk);
	}
	
	
	
}
