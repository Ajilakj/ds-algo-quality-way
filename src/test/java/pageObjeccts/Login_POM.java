package pageObjeccts;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataDrivenExcel;
import utilities.UtlityFunctions;

public class Login_POM extends BaseClass {
	By username=By.id("id_username");
	By password=By.id("id_password");
	By loginBtn=By.xpath("//input[@value='Login']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	@DataProvider(name="testdata")
	public Object[][] loginDataExcel(){
		DataDrivenExcel configuration = new DataDrivenExcel("C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\testData\\DemoDDT.xlsx");
		int rows = configuration.getRowCount(0);
		Object[][]signin_credentials = new Object[rows][2];
	
		for(int i=0;i<rows;i++)
		{
			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;
	}
	
	
	public void username_empty(){
		UtlityFunctionsOBJ.send_keys(username,"");
	}
	
	public void password_empty(){
		UtlityFunctionsOBJ.send_keys(password,"");
	}
	
	public void enter_valid_usename(){
//		UtlityFunctionsOBJ.send_keys(username,"QualityWay");
		UtlityFunctionsOBJ.send_keys(username,(loginDataExcel()[0][0]).toString());
	}
	
	public void enter_valid_password(){
		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2");
	}
	
	public void enter_invalid_usename(){
		UtlityFunctionsOBJ.send_keys(username,"QualityWayInvalid");
	}
	
	public void enter_invalid_password(){
		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2Invalid");
	}
	
	public void click_login_button(){
		UtlityFunctionsOBJ.web_element_click(loginBtn);
	}
	
	public void invalid_username_password__msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
		UtlityFunctionsOBJ.check_text(txt, "Invalid Username and Password");
	}
}
