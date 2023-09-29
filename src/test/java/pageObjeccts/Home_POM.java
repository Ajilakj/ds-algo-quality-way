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
import org.testng.Assert;

import utilities.UtlityFunctions;

public class Home_POM extends BaseClass{
	By getStartedLnk=By.xpath("//button[text()='Get Started']");
	By getStartLnk=By.xpath("//a[text()='Get Started']");
	By signoutLnk=By.xpath("//ul/a[3]"); 
	By dropdown_item =By.className("dropdown-item");
	WebDriver driver=super.driver;
//	WebDriver driver=super.geckoDriver;
//	WebDriver driver=super.geckoDriver;
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	String expected_url="";
	
	public void open_Ds_Algo(){
//		try {
//			super.setup("chrome");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver.get("https://dsportalapp.herokuapp.com/");  
	}
	
	public void home(){
		UtlityFunctionsOBJ.web_element_click(getStartedLnk);
	}
	
	public void check_url_DsAlgo_portal(){
		expected_url="https://dsportalapp.herokuapp.com/"; 
		UtlityFunctionsOBJ.check_url(expected_url);
	}
	
	public void click_DS_dropdown(){
		UtlityFunctionsOBJ.click_DS_dropdown();
	}
	
	public void click_DS_dropdown_item(){
		UtlityFunctionsOBJ.web_element_click(dropdown_item);
	}
	
	public void check_DS_size(int int1){
//		Select selEle = new Select(driver.findElement(ds));
//		List options = selEle.getOptions();
//		int ds_size=options.size();
		List options = driver.findElements(By.className("dropdown-item"));
		int ds_size=options.size();
		Assert.assertEquals(int1, ds_size);
	}
	
	public void click_get_start_lnk(){
		UtlityFunctionsOBJ.web_element_click(getStartLnk);
	}
	
	public void check_sign_in(){
		String txt=(driver.findElement(signoutLnk)).getText();
		UtlityFunctionsOBJ.check_text(txt, "Sign in");
	}
	
	public void check_not_sign_in_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "You are not logged in");
	}
	
	public void check_sign_in_url(){
		expected_url="https://dsportalapp.herokuapp.com/login"; 
		UtlityFunctionsOBJ.check_url(expected_url);
	}
	
	public void check_register_url(){
		expected_url="https://dsportalapp.herokuapp.com/register"; 
		UtlityFunctionsOBJ.check_url(expected_url);
	}
	
}
