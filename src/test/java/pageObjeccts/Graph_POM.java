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
	By tryHere=By.partialLinkText("Try here");
	By code=By.className("CodeMirror-scroll");

	By output=By.id("output");
	By runBtn=By.xpath("//button[text()='Run']");
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
	
	public void click_try_here(){
		UtlityFunctionsOBJ.web_element_click(tryHere);
	}
	
	public void try_editor_code(){
		UtlityFunctionsOBJ.send_keys(code, "welcome");
		UtlityFunctionsOBJ.web_element_click(runBtn);
	}
	
	public void check_output(){
		String txt=(chromeDriver.findElement(output)).getText();
		UtlityFunctionsOBJ.web_element_click(runBtn);
		UtlityFunctionsOBJ.check_text(txt,"welcome");
	}
}
