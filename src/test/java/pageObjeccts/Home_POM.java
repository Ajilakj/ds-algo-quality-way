package pageObjeccts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.UtlityFunctions;
import org.testng.Assert;
public class Home_POM extends BaseClass{
	By getStartedLnk=By.xpath("//button[text()='Get Started']");
	By sign_in=By.partialLinkText("Sign in");
	By register =By.partialLinkText("Register");
	By sign_out=By.partialLinkText("Sign out");
	By ds=By.xpath("//a[text()='Data Structures']"); 
	By getStartLnk=By.xpath("//a[text()='Get Started']");
	By signoutLnk=By.xpath("//ul/a[3]"); 
	By alert =By.className("alert-primary");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	String actual_url="";
	String expected_url="";
	public void home(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnk);
	}
	
	public void check_url_DsAlgo_portal(){
		actual_url=chromeDriver.getCurrentUrl();
		expected_url="https://dsportalapp.herokuapp.com/"; 
		UtlityFunctionsOBJ.check_url(actual_url, expected_url);
	}
	public void check_url_home(){
		actual_url=chromeDriver.getCurrentUrl();
		expected_url="https://dsportalapp.herokuapp.com/home";
		UtlityFunctionsOBJ.check_url(actual_url, expected_url);
	}
	public void click_DS_dropdown(){
		UtlityFunctionsOBJ.web_element_click(ds);
	}
	
	public void check_DS_size(int int1){
//		Select selEle = new Select(chromeDriver.findElement(ds));
//		List options = selEle.getOptions();
//		int ds_size=options.size();
		List options = chromeDriver.findElements(By.className("dropdown-item"));
		int ds_size=options.size();
		Assert.assertEquals(int1, ds_size);
	}
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartLnk);
	}
	
	public void check_sign_in(){
		String txt=(chromeDriver.findElement(signoutLnk)).getText();
		UtlityFunctionsOBJ.check_text(txt, "Sign in");
	}
	
	public void check_not_sign_in_msg(){
		String txt=(chromeDriver.findElement(alert)).getText();
		UtlityFunctionsOBJ.check_text(txt, "You are not logged in");
	}
	
	public void sign_in(){
		chromeDriver.findElement(sign_in).click(); 
	}
	
	public void check_sign_in_url(){
		actual_url=chromeDriver.getCurrentUrl();
		expected_url="https://dsportalapp.herokuapp.com/login"; 
		UtlityFunctionsOBJ.check_url(actual_url, expected_url);
	}
	
	public void register(){
		chromeDriver.findElement(register).click();
	}
	public void check_register_url(){
		actual_url=chromeDriver.getCurrentUrl();
		expected_url="https://dsportalapp.herokuapp.com/register"; 
		UtlityFunctionsOBJ.check_url(actual_url, expected_url);
	}
	
	public void sign_out(){
		chromeDriver.findElement(sign_out).click();
	}
	
}
