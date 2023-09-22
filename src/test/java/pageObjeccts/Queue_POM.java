package pageObjeccts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Queue_POM extends BaseClass {

	By getStartedLnkQueue=By.xpath("//a[@href='queue']");
	By queue=By.partialLinkText("Queue");
	By queueInPython=By.partialLinkText("Implementation of Queue in Python");
	By queueUsingCollections=By.partialLinkText("Implementation using collections");
	By queueUsingArray=By.partialLinkText("Implementation using array");
	By queueOperations=By.partialLinkText("Queue Operations");
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkQueue);
	}
	
	public void select_queue_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(queue);
	}
	
	public void select_queue_in_python(){
		UtlityFunctionsOBJ.web_element_click(queueInPython);
	}
	
	public void select_queue_using_collections(){
		UtlityFunctionsOBJ.web_element_click(queueUsingCollections);
	}
	
	public void select_queue_using_arrays(){
		UtlityFunctionsOBJ.web_element_click(queueUsingArray);
	}
	
	public void select_queue_operations(){
		UtlityFunctionsOBJ.web_element_click(queueOperations);
	}
}
