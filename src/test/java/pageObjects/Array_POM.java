package pageObjects;

import org.openqa.selenium.By;

import utilities.UtlityFunctions;

public class Array_POM extends BaseClass{
	By getStartedLnkArray=By.xpath("//a[@href='array']");
	By array=By.partialLinkText("Array");
	By arraysInPython=By.partialLinkText("Arrays in Python");
	By arraysUsingList=By.partialLinkText("Arrays Using List");
	By basicOperationsInLists=By.partialLinkText("Basic Operations in Lists");
	By applicationsOfArray=By.partialLinkText("Applications of Array");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkArray);
	}
	
	public void select_array_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(array);
	}
	
	public void select_arrays_in_python(){
		UtlityFunctionsOBJ.web_element_click(arraysInPython);
	}
	
	public void select_arrays_using_list(){
		UtlityFunctionsOBJ.web_element_click(arraysUsingList);
	}
	
	public void select_basic_operations_in_list(){
		UtlityFunctionsOBJ.web_element_click(basicOperationsInLists);
	}
	
	public void select_applications_of_arrays(){
		UtlityFunctionsOBJ.web_element_click(applicationsOfArray);
	}
}
