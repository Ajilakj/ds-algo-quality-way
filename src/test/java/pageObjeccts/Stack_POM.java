package pageObjeccts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Stack_POM extends BaseClass {

	By getStartedLnkStack=By.xpath("//a[@href='stack']");
	By stack=By.partialLinkText("Stack");
	By operationsinStack=By.partialLinkText("Operations in Stack");
	By implementationOfStack=By.partialLinkText("Implementation");
	By applicationsOfStack=By.partialLinkText("Applications");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkStack);
	}
	
	public void select_stack_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(stack);
	}
	
	public void select_operations_in_stack(){
		UtlityFunctionsOBJ.web_element_click(operationsinStack);
	}
	
	public void select_implementation_of_stack(){
		UtlityFunctionsOBJ.web_element_click(implementationOfStack);
	}
	
	public void select_applications_of_stack(){
		UtlityFunctionsOBJ.web_element_click(applicationsOfStack);
	}
}
