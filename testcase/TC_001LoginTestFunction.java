package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001LoginTestFunction extends BaseClass {

	@BeforeTest
	public void setValues() {
		filename="Login";
	}
	
	@Test(dataProvider="fetchData")
	public  void runLoginTest() {
		
		LoginPage lp=new LoginPage();
		lp.enterUsername(null)
		.enterPassword(null)
		.clickLoginButton()
		.verifyHomePage();
		

	}
}
