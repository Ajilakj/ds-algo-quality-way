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
	By searchTheArray=By.partialLinkText("Search the array");
	By maxConsecutiveOnes=By.partialLinkText("Max Consecutive Ones");
	By evenNumberOfDigits=By.partialLinkText("Find Numbers with Even Number of Digits");
	By squaresOfASortedArray=By.partialLinkText("Squares of a Sorted Array");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkArray);
	}
	
	public void select_array_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(array);
	}
	
	public void select_search_arrays(){
		UtlityFunctionsOBJ.web_element_click(searchTheArray);
	}
	
	public void select_max_consecutive_ones(){
		UtlityFunctionsOBJ.web_element_click(maxConsecutiveOnes);
	}
	
	public void select_even_number_of_digitst(){
		UtlityFunctionsOBJ.web_element_click(evenNumberOfDigits);
	}
	
	public void select_applications_of_arrays(){
		UtlityFunctionsOBJ.web_element_click(applicationsOfArray);
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
	
	public void select_squares_of_sorted_array(){
		UtlityFunctionsOBJ.web_element_click(squaresOfASortedArray);
	}
}


