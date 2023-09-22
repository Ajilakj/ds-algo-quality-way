package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjeccts.BaseClass;

public class UtlityFunctions extends BaseClass {
//	public  UtlityFunctions(WebDriver driver) {
//		super.chromeDriver = driver;
//		PageFactory.initElements(chromeDriver, this);
//	} 
	WebDriverWait wait=new WebDriverWait(chromeDriver,Duration.ofSeconds(20));
	By sign_in=By.partialLinkText("Sign in");
	By register =By.partialLinkText("Register");
	By ds=By.xpath("//a[text()='Data Structures']"); 
	By tryHere=By.partialLinkText("Try here");
	By code=By.xpath("//textarea[@tabindex='0']"); 
//	By code=By.xpath("//div[@class='CodeMirror-lines']");
//	By code=By.className("cm-variable");
	By output=By.id("output");
	By runBtn=By.xpath("//button[text()='Run']");
	
	public void web_element_click(By webEle) {
		chromeDriver.findElement(webEle).click();
	}
	
	public void check_url(String expected_url){
		chromeDriver.navigate().refresh();
		String current_url=chromeDriver.getCurrentUrl();
		Assert.assertEquals(current_url, expected_url);
	}
	
	public void check_text(String actual_text, String expected_text){
		Assert.assertEquals(actual_text, expected_text);
	}
	
	public void send_keys(By ele, String text){
		chromeDriver.findElement(ele).sendKeys(text);
	}
	
	public void click_sign_in(){
		web_element_click(sign_in); 
	}
	
	public void click_register(){
		web_element_click(register);
	}
	
	public void check_url_home(){
		String expected_url="https://dsportalapp.herokuapp.com/home";
		check_url(expected_url);
	}
	
	public void click_DS_dropdown(){
		web_element_click(ds);
	}
	
	public void click_try_here(){
		web_element_click(tryHere);
	}
	
	public void try_editor_code(){
//		wait.until(ExpectedConditions.elementToBeClickable(code));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		send_keys(code, "print 'welcome'");
//		wait.until(ExpectedConditions.elementToBeClickable(runBtn));
		web_element_click(runBtn);
	}
	
	public void check_output(){
		String txt=(chromeDriver.findElement(output)).getText();
		check_text(txt,"welcome");
	}
	
	public void click_back_button(){
		chromeDriver.navigate().back();
		chromeDriver.navigate().refresh();
	}
	
//	public void click_back_button_twice(){
//		chromeDriver.navigate().back();
//		chromeDriver.navigate().refresh();
//		chromeDriver.navigate().back();
//		chromeDriver.navigate().refresh();
//	}
}

