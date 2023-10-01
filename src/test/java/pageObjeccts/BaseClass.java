package pageObjeccts;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import step_definition.Login_SD;
import utilities.UtlityFunctions;
public class BaseClass {
	
	protected static WebDriver driver;
	protected WebDriverWait wait;
	JavascriptExecutor js;	
	
	public  BaseClass() {
		try {
//			browserSetup("chrome");
//			browserSetup("firefox");
			browserSetup("edge");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@BeforeTest
	@Parameters("browser")
	public void browserSetup(String browser) throws Exception{
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdinput-enquiryriver.chrome.driver", "C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\drivers\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				driver=new ChromeDriver(chromeOptions);
			}
			
			else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge")){
				System.setProperty("webdriver.edge.driver", "C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		}
	}
}

