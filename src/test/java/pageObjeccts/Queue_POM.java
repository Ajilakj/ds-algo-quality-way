package pageObjeccts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import utilities.UtlityFunctions;

public class Queue_POM extends BaseClass {

	By getStartedLnkQueue=By.xpath("//a[@href='queue']");
	By queue=By.partialLinkText("Queue");
//	By graphRepresentations=By.partialLinkText("Graph Representations");
//	By practiceQuestions=By.partialLinkText("Practice Questions");
//	By code=By.className("CodeMirror-scroll"); 
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkQueue);
	}
	
	public void select_queue_from_drop_down(){
		UtlityFunctionsOBJ.web_element_click(queue);
	}
	
//	public void select_graph_from_left_link(){
//		UtlityFunctionsOBJ.web_element_click(graph);
//	}
//	
//	public void select_graph_reprsentation_from_left_link(){
//		UtlityFunctionsOBJ.web_element_click(graphRepresentations);
//	}
//	
//	public void select_practice_uestions_from_left_link(){
//		UtlityFunctionsOBJ.web_element_click(practiceQuestions);
//	}
	
}
