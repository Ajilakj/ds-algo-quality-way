package pageObjeccts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Tree_POM extends BaseClass {

	By getStartedLnkTree=By.xpath("//a[@href='tree']");
	By tree=By.partialLinkText("Tree");
	By overviewOfTrees=By.partialLinkText("Overview of Trees");
	By Terminologies=By.partialLinkText("Terminologies");
	By typesOfTrees=By.partialLinkText("Types of Trees");
	By treeTraversals=By.partialLinkText("Tree Traversals");
	By traversalsIllustration=By.partialLinkText("Traversals-Illustration");
	By binaryTrees=By.partialLinkText("Binary Trees");
	By typesOfBinaryTrees=By.partialLinkText("Types of Binary Trees");
	By implementationInPython=By.partialLinkText("Implementation in Python");
	By binaryTreeTraversals=By.partialLinkText("Binary Tree Traversals");
	By implementationOfBinaryTrees=By.partialLinkText("Implementation of Binary Trees");
	By applicationsOfBinarytrees=By.partialLinkText("Applications of Binary trees");
	By binarySearchTrees=By.partialLinkText("Binary Search Trees");
	By implementationOfBST=By.partialLinkText("Implementation Of BST");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkTree);
	}
	
	public void select_tree_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(tree);
	}
	
	public void select_overview_of_trees(){
		UtlityFunctionsOBJ.web_element_click(overviewOfTrees);
	}
	
	public void select_terminologies(){
		UtlityFunctionsOBJ.web_element_click(Terminologies);
	}
	
	public void select_types_of_trees(){
		UtlityFunctionsOBJ.web_element_click(typesOfTrees);
	}
	
	public void select_tree_traversals(){
		UtlityFunctionsOBJ.web_element_click(treeTraversals);
	}
	
	public void select_traversals_illustration(){
		UtlityFunctionsOBJ.web_element_click(traversalsIllustration);
	}
	
	public void select_binary_trees(){
		UtlityFunctionsOBJ.web_element_click(binaryTrees);
	}
	
	public void select_types_of_binary_treesn(){
		UtlityFunctionsOBJ.web_element_click(typesOfBinaryTrees);
	}
	
	public void select_implementation_in_python(){
		UtlityFunctionsOBJ.web_element_click(implementationInPython);
	}
	
	public void select_binary_tree_traversals(){
		UtlityFunctionsOBJ.web_element_click(binaryTreeTraversals);
	}
	
	public void select_implementation_of_binary_trees(){
		UtlityFunctionsOBJ.web_element_click(implementationOfBinaryTrees);
	}
	
	public void select_applications_of_binary_trees(){
		UtlityFunctionsOBJ.web_element_click(applicationsOfBinarytrees);
	}
	
	public void select_binary_search_trees(){
		UtlityFunctionsOBJ.web_element_click(binarySearchTrees);
	}
	
	public void select_implementation_Of_BST(){
		UtlityFunctionsOBJ.web_element_click(implementationOfBST);
	}
}
