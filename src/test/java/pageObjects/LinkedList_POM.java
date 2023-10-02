package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class LinkedList_POM extends BaseClass {

	By getStartedLnklinkedlist=By.xpath("//a[@href='linked-list']");
	By linkedList=By.partialLinkText("linked-list");
	By Introduction=By.partialLinkText("Introduction");
	By creatingLinkedList=By.partialLinkText("creating-linked-list");
	By typesOfLinkedList=By.partialLinkText("types-of-linked-list");
	By implementLinkedListInPython=By.partialLinkText("implement-linked-list-in-python");
	By traversal=By.partialLinkText("traversal");
	By insertionInLinkedList=By.partialLinkText("insertion-in-linked-list");
	By deletionInLinkedList=By.partialLinkText("deletion-in-linked-list");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnklinkedlist);
	}
	
	public void select_tree_from_drop_down(){
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
