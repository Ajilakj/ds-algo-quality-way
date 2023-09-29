package pageObjeccts;

import org.openqa.selenium.By;

import junit.framework.Assert;
import utilities.UtlityFunctions;

public class Signout_POM extends BaseClass{
	
	By sign_out=By.partialLinkText("Sign out");
	By signinORsignout=By.xpath("//ul/a[3]");
	
	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
	
	public void check_sign_out(){
		String txt=(driver.findElement(signinORsignout)).getText();
		Assert.assertEquals("Sign out", txt);
	}
	
	public void check_sign_in_and_register(){
		String txt=(driver.findElement(signinORsignout)).getText();
		Assert.assertEquals("Sign in", txt);
	}
	
	public void select_sign_out(){
		driver.findElement(sign_out).click();
	}
}
