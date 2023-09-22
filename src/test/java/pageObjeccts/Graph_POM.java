package pageObjeccts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Graph_POM extends BaseClass {

	By getStartedLnk=By.xpath("//a[@href='graph']");
//	By graphOption=By.partialLinkText("Graph");
//	By graphLink=By.partialLinkText("Graph"); 
	By graph=By.partialLinkText("Graph");
	By graphRepresentations=By.partialLinkText("Graph Representations");
	By practiceQuestions=By.partialLinkText("Practice Questions");
//	By code=By.className("CodeMirror-scroll"); 
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnk);
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
	
	public void select_practice_uestions_from_left_link(){
		UtlityFunctionsOBJ.web_element_click(practiceQuestions);
	}
	
}
