package pageObjeccts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_definition.Login_SD;
import utilities.UtlityFunctions;

public class BaseClass {
	
	protected static WebDriver chromeDriver;
	WebDriverWait wait;
	JavascriptExecutor js;	
	
	public  BaseClass() {
		
		if(chromeDriver==null)
		{
			System.setProperty("webdinput-enquiryriver.chrome.driver", "C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\drivers\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeDriver=new ChromeDriver(chromeOptions);
			chromeDriver.manage().window().maximize();
		}
	}
	
	public void open_Ds_Algo(){
		chromeDriver.get("https://dsportalapp.herokuapp.com/");  
	}
		
	public static void main(String[] args){
//		BaseClass BaseClassObj=new BaseClass();
//		BaseClassObj.init();
//		Home HomeOBJ=new Home();
//		HomeOBJ.home();
//		HomeOBJ.register();
//		Register RegisterBJ=new Register();
//		RegisterBJ.register();
//		HomeOBJ.sign_in();
//		Login LoginOBJ=new Login();
//		LoginOBJ.login();
//		HomeOBJ.sign_out();
	}
}
