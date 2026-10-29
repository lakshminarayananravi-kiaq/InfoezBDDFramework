package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002ProfileCreationTestFunction extends BaseClass {
	
	
	@Test
	public void runProfileCreation() throws InterruptedException  {
		LoginPage lp=new LoginPage();
		lp.enterUsername(null)
		.enterPassword(null)
		.clickLoginButton()
		.verifyHomePage()
		.ClickUsername()
		.ClickProfileButton()
		.EnterTheName(null)
		.EnterPhoneNumber(null)
		.ClickSaveChangesButton()
		.ProfileUpdatedMessage();
			

	}

}
