package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Graph_POM extends BaseClass {

	By getStartedLnkGraph=By.xpath("//a[@href='graph']");
	By graph=By.partialLinkText("Graph");
	By graphRepresentations=By.partialLinkText("Graph Representations");
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkGraph);
	}
	
	public void select_graph_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(graph);
	}
	
	public void select_graph_from_left_link(){
		UtlityFunctionsOBJ.web_element_click(graph);
	}
	
	public void select_graph_reprsentation_from_left_link(){
		UtlityFunctionsOBJ.web_element_click(graphRepresentations);
	}
	
}
