package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class LinkedList_POM extends BaseClass {

	By getStartedLnklinkedlist=By.xpath("//a[@href='linked-list']");
	By linkedList=By.partialLinkText("Linked List");
	By Introduction=By.partialLinkText("Introduction");
	By creatingLinkedList=By.partialLinkText("Creating Linked LIst");
	By typesOfLinkedList=By.partialLinkText("Types of Linked List");
	By implementLinkedListInPython=By.partialLinkText("Implement Linked List in Python");
	By traversal=By.partialLinkText("Traversal");
	By insertionInLinkedList=By.partialLinkText("Insertion");
	By deletionInLinkedList=By.partialLinkText("Deletion");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnklinkedlist);
	}
	
	public void select_linked_list_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(linkedList);
	}
	
	public void select_introduction(){
		UtlityFunctionsOBJ.web_element_click(Introduction);
	}
	
	public void select_creating_linked_list(){
		UtlityFunctionsOBJ.web_element_click(creatingLinkedList);
	}
	
	public void select_types_of_linked_list(){
		UtlityFunctionsOBJ.web_element_click(typesOfLinkedList);
	}
	
	public void select_implement_of_linked_list_in_python(){
		UtlityFunctionsOBJ.web_element_click(implementLinkedListInPython);
	}
	
	public void select_traversals(){
		UtlityFunctionsOBJ.web_element_click(traversal);
	}
	
	public void select_insertion(){
		UtlityFunctionsOBJ.web_element_click(insertionInLinkedList);
	}
	
	public void select_deletion(){
		UtlityFunctionsOBJ.web_element_click(deletionInLinkedList);
	}
}
