package pageObjeccts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Home extends BaseClass{
	

	public void home(){
		chromeDriver.findElement(By.xpath("//button[text()='Get Started']")).click();
	}
	
	public void sign_in(){
		chromeDriver.findElement(By.partialLinkText("Sign in")).click();
	}
	
	public void sign_out(){
		chromeDriver.findElement(By.partialLinkText("Sign out")).click();
	}
	
}
