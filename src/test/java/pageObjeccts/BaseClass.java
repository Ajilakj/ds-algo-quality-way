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
		
		if(driver==null)
		{
			System.setProperty("webdinput-enquiryriver.chrome.driver", "C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\drivers\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			driver=new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		}
	}
		
}
//public class BaseClass {
//	
////	protected static WebDriver chromeDriver;
////	protected static WebDriver geckoDriver;
//	protected WebDriverWait wait;
//	JavascriptExecutor js;	
//	protected static WebDriver driver;
//	 
//	@BeforeTest
//	@Parameters("browser")
//	public void setup(String browser) throws Exception{
//	//Check if parameter passed from TestNG is 'firefox'
//	if(browser.equalsIgnoreCase("firefox")){
//	//create firefox instance
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bobby\\eclipse-workspace\\HelloWorldSelenium\\src\\test\\resources\\drivers\\geckodriver.exe");
//	driver = new FirefoxDriver();
//	}
//	//Check if parameter passed as 'chrome'
//	else if(browser.equalsIgnoreCase("chrome")){
//	//set path to chromedriver.exe
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobby\\eclipse-workspace\\HelloWorldSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
//	driver = new ChromeDriver();
//	}
//	else if(browser.equalsIgnoreCase("Edge")){
//	//set path to Edge.exe
//	System.setProperty("webdriver.edge.driver", "C:\\Users\\bobby\\eclipse-workspace\\HelloWorldSelenium\\src\\test\\resources\\drivers\\msedgedriver.exe");
//	driver = new EdgeDriver();
//	}
//	else{
//	//If no browser is passed throw exception
//	throw new Exception("Incorrect Browser");
//	}
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
////	@Test
////	public void testParameterWithXML() throws InterruptedException{
////	driver.get("https://dsportalapp.herokuapp.com/");
//
////	}
//}
