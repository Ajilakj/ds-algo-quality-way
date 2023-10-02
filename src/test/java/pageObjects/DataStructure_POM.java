package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class DataStructure_POM extends BaseClass {

	By getStartedLnkDS=By.xpath("//a[@href='data-structures-introduction']");
	By timeComplexity=By.partialLinkText("time-complexity");
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkDS);
	}
	
	public void select_time_complexity_from_left_link(){
		UtlityFunctionsOBJ.web_element_click(timeComplexity);
	}
}
