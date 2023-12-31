package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import pageObjects.BaseClass;

public class UtlityFunctions extends BaseClass {

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	By sign_in=By.partialLinkText("Sign in");
	By register =By.partialLinkText("Register");
	By login =By.partialLinkText("Login");
	By ds=By.xpath("//a[text()='Data Structures']"); 
	By tryHere=By.partialLinkText("Try here");
	By code=By.xpath("//textarea[@tabindex='0']"); 
	By alertMsg =By.className("alert-primary"); 
	By output=By.id("output");
	By runBtn=By.xpath("//button[text()='Run']");
	By submitBtn=By.xpath("//input[@value='Submit']");
	By practiceQuestions=By.partialLinkText("Practice Questions");
	By editor=By.id("editor");
	
	Actions action = new Actions(driver); 
	
	@DataProvider(name="testdata")
	public String[][] TryEditorDataExcel(){
	DataDrivenExcel configuration = new DataDrivenExcel("C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\testData\\DataDriven.xlsx");
	int rows = configuration.getRowCount(2);
	String[][]try_editor_code = new String[rows][3];

	for(int i=0;i<rows;i++)
	{
		try_editor_code[i][0] = (configuration.getData(2, i, 0)).toString();
		try_editor_code[i][1] = (configuration.getData(2, i, 1)).toString();
		try_editor_code[i][2] = (configuration.getData(2, i, 2)).toString();
	}
	return try_editor_code;
}
	
	public void web_element_click(By webEle) {
		driver.findElement(webEle).click();
	}
	
	public void check_url(String expected_url){
		driver.navigate().refresh();
		String current_url=driver.getCurrentUrl();
		Assert.assertEquals(current_url, expected_url);
	}
	
	public void check_text(String actual_text, String expected_text){
		Assert.assertEquals(actual_text, expected_text);
	}
	
	public void send_keys(By ele, String text){
		driver.findElement(ele).sendKeys(text);
	}
	
	public void click_sign_in(){
		web_element_click(sign_in); 
	}
	
	public void click_register_link(){
		web_element_click(register);
	}
	
	public void click_login_link(){
		web_element_click(login);
	}
	
	public void check_url_home(){
		String expected_url="https://dsportalapp.herokuapp.com/home";
		check_url(expected_url);
	}
	
	public void check_url_login(){
		String expected_url="https://dsportalapp.herokuapp.com/login";
		check_url(expected_url);
	}
	
	public void check_url_register(){
		String expected_url="https://dsportalapp.herokuapp.com/register";
		check_url(expected_url);
	}
	
	public void check_url_try_editor(){
		String expected_url="https://dsportalapp.herokuapp.com/tryEditor";
		check_url(expected_url);
	}
	
	public void click_DS_dropdown(){
		web_element_click(ds);
	}
	
	public void click_try_here(){
		web_element_click(tryHere);
	}
	
	public void try_editor_python_code(){
		driver.navigate().refresh();
		WebElement activeElement = driver.switchTo().activeElement(); 
		action.moveToElement(activeElement).sendKeys((TryEditorDataExcel()[1][0])).perform();
		click_run_button();
	}
	
	public void try_editor_invalid_code(){
		driver.navigate().refresh();
		WebElement activeElement = driver.switchTo().activeElement(); 
		action.moveToElement(activeElement).sendKeys(TryEditorDataExcel()[1][2]).perform();
		click_run_button();
	}
	
	public void try_editor_valid_java_code(){
		driver.navigate().refresh();
		WebElement activeElement = driver.switchTo().activeElement(); 
		action.moveToElement(activeElement).sendKeys(TryEditorDataExcel()[1][1]).perform();
		click_run_button();
	}
	
	public void click_run_button(){
		wait.until(ExpectedConditions.elementToBeClickable(runBtn));
		web_element_click(runBtn);
	}
	
	public void check_python_output(){
		String outputmsg=(driver.findElement(output)).getText(); 
		check_text(outputmsg,(TryEditorDataExcel()[2][0]));
	}
	
	public void check_output_valid_java(){
		String output=(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); 
		check_text(output,(TryEditorDataExcel()[2][1]));
	}
	
	public void check_output_invalid_code(){
		String output=(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); 
		check_text(output,(TryEditorDataExcel()[2][2]));
	}
	
	public void click_back_button(){
		driver.navigate().back();
		driver.navigate().refresh();
	}
	
	public void select_practice_questions_link(){
		web_element_click(practiceQuestions);
	}
	
	public String get_message_from_alert(){
		String msg=(driver.findElement(alertMsg)).getText();
		return msg; 
	}
	
	public void get_message_from_active_window(){
		WebElement activeElement = driver.switchTo().activeElement();
		String messageFromActiveElement = activeElement.getAttribute("validationMessage");
		Assert.assertEquals(messageFromActiveElement, "Please fill out this field.");
	}
	
	public void practice_question_python_code(){
		driver.navigate().refresh();
		
		for(int i=0;i<100;i++) {
			action.sendKeys(Keys.DELETE).perform();;
		}		
		action.sendKeys(TryEditorDataExcel()[1][0]).perform();
		click_run_button();
	}
	
	public void practice_question_invalid_code(){
		practice_question_textarea_clear();
		action.sendKeys(TryEditorDataExcel()[1][2]).perform();
		click_run_button();
	}
	
	public void practice_question_valid_java_code(){
		practice_question_textarea_clear();
		action.sendKeys(TryEditorDataExcel()[1][1]).perform();
		click_run_button();
	}
	
	public void practice_question_python_code_submit(){
		practice_question_textarea_clear();
		action.sendKeys(TryEditorDataExcel()[1][0]).perform();
		click_submit_button();
	}
	
	public void practice_question_invalid_code_submit(){
		practice_question_textarea_clear();
		action.sendKeys(TryEditorDataExcel()[1][2]).perform();
		click_submit_button();
	}
	
	public void practice_question_valid_java_code_submit(){
		practice_question_textarea_clear();
		action.sendKeys(TryEditorDataExcel()[1][1]).perform();
		click_submit_button();
	}
	
	public void click_submit_button(){
		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		web_element_click(submitBtn);
	}
	
	public void check_submit_output1(){
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(output));
		String outputmsg=(driver.findElement(output)).getText().trim(); 
		check_text(outputmsg,"Error occurred during submission");
	}
	
	public void check_submit_output2(){
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(output));
		String outputmsg=(driver.findElement(output)).getText().trim(); 
		check_text(outputmsg,"No tests were collected");
	}
	
	public void practice_question_textarea_clear(){
		driver.navigate().refresh();
//		int len=editor.toString().length(); 
		for(int i=0;i<50;i++) {
			action.sendKeys(Keys.DELETE).perform();
		}		
	}
}

