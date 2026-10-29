package pages;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class NotificationsPage extends BaseClass {
	
	
	@Then("It launch the Notification page")
		public NotificationsPage verifyEnquiryPageLaunch() {
			WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
			wait.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/notifications"));
			Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/notifications");
			return this;

	}

}
