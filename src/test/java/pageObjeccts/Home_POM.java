package pageObjeccts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Home_POM extends BaseClass{
	By getStartedLnk=By.xpath("//button[text()='Get Started']");
	By sign_in=By.partialLinkText("Sign in");
	By register =By.partialLinkText("Register");
	By sign_out=By.partialLinkText("Sign out");

	public void home(){
		chromeDriver.findElement(getStartedLnk).click();
	}
	
	public void sign_in(){
		chromeDriver.findElement(sign_in).click();
	}
	
	public void register(){
		chromeDriver.findElement(register).click();
	}
	
	public void sign_out(){
		chromeDriver.findElement(sign_out).click();
	}
	
}
