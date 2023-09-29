package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjeccts.BaseClass;

public class UtlityFunctions extends BaseClass {
//	public  UtlityFunctions(WebDriver driver) {
//		super.driver = driver;
//		PageFactory.initElements(driver, this);
//	} 
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	By sign_in=By.partialLinkText("Sign in");
	By register =By.partialLinkText("Register");
	By login =By.partialLinkText("Login");
	By ds=By.xpath("//a[text()='Data Structures']"); 
	By tryHere=By.partialLinkText("Try here");
	By code=By.xpath("//textarea[@tabindex='0']"); 
//	By code=By.xpath("//div[@class='CodeMirror-lines']");
//	By code=By.className("cm-variable");
//	By code=By.className("CodeMirror-scroll"); 
	By alert =By.className("alert-primary"); 
	By output=By.id("output");
	By runBtn=By.xpath("//button[text()='Run']");
	By practiceQuestions=By.partialLinkText("Practice Questions");
	
	Actions action = new Actions(driver);
	
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
	
	public void click_register(){
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
		action.moveToElement(activeElement).sendKeys("print 'welcome'").perform();
//		send_keys(code, "print 'welcome'");
		wait.until(ExpectedConditions.elementToBeClickable(runBtn));
		web_element_click(runBtn);
	}
	
	public void try_editor_invalid_code(){
		driver.navigate().refresh();
		WebElement activeElement = driver.switchTo().activeElement();
		action.moveToElement(activeElement).sendKeys("System.out.println 'welcome'").perform();
		wait.until(ExpectedConditions.elementToBeClickable(runBtn));
		web_element_click(runBtn);
	}
	
	public void try_editor_valid_java_code(){
		WebElement activeElement = driver.switchTo().activeElement();
		action.moveToElement(activeElement).sendKeys("System.out.println('welcome');").perform();
		wait.until(ExpectedConditions.elementToBeClickable(runBtn));
		web_element_click(runBtn);
	}
	
	public void check_python_output(){
		String outputmsg=(driver.findElement(output)).getText();
		check_text(outputmsg,"welcome");
	}
	
	public void check_output_valid_java(){
		String output=(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		check_text(output,"NameError: name 'System' is not defined on line 1");
	}
	
	public void check_output_invalid_code(){
		String output=(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		check_text(output,"SyntaxError: bad input on line 1");
	}
	public void click_back_button(){
		driver.navigate().back();
		driver.navigate().refresh();
	}
	
	public void select_practice_questions_link(){
		web_element_click(practiceQuestions);
	}
	
	public String get_message_from_alert(){
		String msg=(driver.findElement(alert)).getText();
		return msg; 
	}
	
	public void get_message_from_active_window(){
		WebElement activeElement = driver.switchTo().activeElement();
		String messageFromActiveElement = activeElement.getAttribute("validationMessage");
		Assert.assertEquals(messageFromActiveElement, "Please fill out this field.");
	}
	
//	public void click_back_button_twice(){
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().refresh();
//	}
}

