package pageObjeccts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	static WebDriver chromeDriver;
	WebDriverWait wait;
	JavascriptExecutor js;	
	
	public void init(){
		System.setProperty("webdinput-enquiryriver.chrome.driver", "C:\\Users\\bobby\\eclipse-workspace\\HelloWorldSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeDriver=new ChromeDriver(chromeOptions);
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		wait = new WebDriverWait(chromeDriver,Duration.ofSeconds(10) );
//		js = (JavascriptExecutor)chromeDriver;			
		chromeDriver.get("https://dsportalapp.herokuapp.com/");  
		
	}
	public static void main(String[] args){
		BaseClass BaseClassObj=new BaseClass();
		BaseClassObj.init();
		Home HomeOBJ=new Home();
		HomeOBJ.home();
		HomeOBJ.register();
//		Register RegisterBJ=new Register();
//		RegisterBJ.register();
		HomeOBJ.sign_in();
		Login LoginOBJ=new Login();
		LoginOBJ.login();
		HomeOBJ.sign_out();
	}
}
