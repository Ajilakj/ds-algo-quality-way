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

	public void home(){
		chromeDriver.findElement(By.xpath("//button[text()='Get Started']")).click();
	}
	
	public void sign_in(){
		chromeDriver.findElement(By.partialLinkText("Sign in")).click();
	}
	
	public void login(){
		chromeDriver.findElement(By.id("id_username")).sendKeys("QualityWay");
		chromeDriver.findElement(By.id("id_password")).sendKeys("pwd_ds_algo@2");
		chromeDriver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public static void main(String[] args){
		Home HomeOBJ=new Home();
		HomeOBJ.init();
		HomeOBJ.home();
		HomeOBJ.sign_in();
		HomeOBJ.login();
//		HomeOBJ.test3();
	}
}
