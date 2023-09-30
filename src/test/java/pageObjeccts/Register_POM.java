package pageObjeccts;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import utilities.DataDrivenExcel;
import utilities.UtlityFunctions;

public class Register_POM extends BaseClass{
	By username=By.id("id_username");
	By password1=By.id("id_password1");
	By password2=By.id("id_password2");
	By regiterBtn=By.xpath("//input[@value='Register']");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	@DataProvider(name="testdata")
	public String[][] RegisterDataExcel(){
		DataDrivenExcel configuration = new DataDrivenExcel("C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\testData\\DataDriven.xlsx");
		int rows = configuration.getRowCount(1);
		String[][]register_credentials = new String[rows][4];
	
		for(int i=0;i<rows;i++)
		{
			register_credentials[i][0] = (configuration.getData(1, i, 0)).toString();
			register_credentials[i][1] = (configuration.getData(1, i, 1)).toString();
			register_credentials[i][2] = (configuration.getData(1, i, 2)).toString();
			register_credentials[i][3] = (configuration.getData(1, i, 3)).toString();
		}
		return register_credentials;
	}
	
	public void username_empty(){
//		UtlityFunctionsOBJ.send_keys(username,"");
		UtlityFunctionsOBJ.send_keys(username,(RegisterDataExcel()[1][0]));
	}
	
	public void password_empty(){
//		UtlityFunctionsOBJ.send_keys(password1,"");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[1][1]));
	}
	
	public void confirm_password_empty(){
//		UtlityFunctionsOBJ.send_keys(password2,"");
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[1][2]));
	}
	
	public void enter_valid_usename(){
//		UtlityFunctionsOBJ.send_keys(username,"QualityWayA1B2C");
		UtlityFunctionsOBJ.send_keys(username,(RegisterDataExcel()[2][0]));
	}
	
	public void enter_valid_password(){
//		UtlityFunctionsOBJ.send_keys(password1,"pwd_ds_algo@2ABC");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[2][1]));
	}
	
	public void enter_valid_confirm_password(){
//		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2ABC");
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[2][2]));
	}
	
	public void enter_invalid_password(){
//		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2Invalid");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[3][1]));
	}
	
	public void enter_same_password_as_usename(){
//		UtlityFunctionsOBJ.send_keys(password1,"QualityWayABC");
//		UtlityFunctionsOBJ.send_keys(password2,"QualityWayABC");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[4][0]));
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[4][0]));
	}
	
	public void enter_password_less_than_eight(){
//		UtlityFunctionsOBJ.send_keys(password1,"Quality");
//		UtlityFunctionsOBJ.send_keys(password2,"Quality");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[5][1]));
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[5][2]));
	}
	
	public void enter_password_only_numeric(){
//		UtlityFunctionsOBJ.send_keys(password1,"123456789");
//		UtlityFunctionsOBJ.send_keys(password2,"123456789");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[6][1]));
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[6][2]));
	}
	
	public void password_mismatch(){
//		UtlityFunctionsOBJ.send_keys(password1,"pwd_ds_algo@2ABC");
//		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2ABCD");
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[7][1]));
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[7][2]));
	}
	
	public void enter_existing_username(){
//		UtlityFunctionsOBJ.send_keys(username,"QualityWay");
//		UtlityFunctionsOBJ.send_keys(password1,"pwd_ds_algo@2valid");
//		UtlityFunctionsOBJ.send_keys(password2,"pwd_ds_algo@2valid");
		UtlityFunctionsOBJ.send_keys(username,(RegisterDataExcel()[8][0]));
		UtlityFunctionsOBJ.send_keys(password1,(RegisterDataExcel()[8][1]));
		UtlityFunctionsOBJ.send_keys(password2,(RegisterDataExcel()[8][2]));
	}
	
	public void enter_same_password_as_usename_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
//		UtlityFunctionsOBJ.check_text(txt, "Your password can’t be too similar to your other personal information.");
		UtlityFunctionsOBJ.check_text(txt, (RegisterDataExcel()[4][3]));
	}
	
	public void enter_password_less_than_eight_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
//		UtlityFunctionsOBJ.check_text(txt, "Your password must contain at least 8 characters.");
		UtlityFunctionsOBJ.check_text(txt, (RegisterDataExcel()[5][3]));
	}
	
	public void enter_password_only_numeric_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
//		UtlityFunctionsOBJ.check_text(txt, "Your password can’t be entirely numeric.");
		UtlityFunctionsOBJ.check_text(txt, (RegisterDataExcel()[6][3]));
	}
	
	public void password_mismatch_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
//		UtlityFunctionsOBJ.check_text(txt, "password_mismatch:The two password fields didn’t match.");
		UtlityFunctionsOBJ.check_text(txt, (RegisterDataExcel()[7][3]));
	}
	
	public void enter_existing_username_msg(){
		String txt=UtlityFunctionsOBJ.get_message_from_alert();
//		UtlityFunctionsOBJ.check_text(txt, "User already exists.");
		UtlityFunctionsOBJ.check_text(txt, (RegisterDataExcel()[8][3]));
	}
	
	public void click_register_button(){
		UtlityFunctionsOBJ.web_element_click(regiterBtn);
	}
}
