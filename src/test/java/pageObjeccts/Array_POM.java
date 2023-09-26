package pageObjeccts;

import org.openqa.selenium.By;

import utilities.UtlityFunctions;

public class Array_POM extends BaseClass{
	By getStartedLnkArray = By.xpath("//a[@href='array']");	
	By arraysInPython = By.xpath("//a[@href='arrays-in-python']");
	By tryEditor = By.xpath("//a[@href='/tryEditor']");
	By tryEditorBox = By.xpath("//pre[@class='CodeMirror-line']");
	By run = By.xpath("//button[@type='button']");

	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();


	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnkArray);
	}


	public void click_arrays_in_Python(){
		UtlityFunctionsOBJ.web_element_click(arraysInPython);
	}


	public void click_try_Editor(){
		UtlityFunctionsOBJ.web_element_click(tryEditor);
	}

		public void try_Editor_Box(){
			UtlityFunctionsOBJ.send_keys(tryEditorBox,"Print 1");

	}

		public void click_Run(){
			UtlityFunctionsOBJ.web_element_click(run);
	}
	}
