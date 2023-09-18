package pageObjeccts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Home {
	WebDriver chromeDriver;
	WebDriverWait wait;
	JavascriptExecutor js;	
	

	public void init(){
		System.setProperty("webdinput-enquiryriver.chrome.driver", "C:\\Users\\bobby\\eclipse-workspace\\HelloWorldSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeDriver=new ChromeDriver(chromeOptions);
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(chromeDriver,Duration.ofSeconds(10) );
		js = (JavascriptExecutor)chromeDriver;			
		PageFactory.initElements(chromeDriver, this);
		chromeDriver.get("https://dsportalapp.herokuapp.com/");  
		
	}

//		public void test1(){
//			chromeDriver.findElement(By.xpath("//button[text()='Get Started']")).click();
//		}
		
		public static void main(String[] args){
			Home HomeOBJ=new Home();
			HomeOBJ.init();
			HomeOBJ.test1();
		}
}
