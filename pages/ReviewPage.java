package pages;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ReviewPage extends BaseClass {
	
	@Then("It launch the Review page")
	public ReviewPage verifyReviewPageLaunch() {
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/my-reviews"));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/my-reviews");
		return this;
	}
	

}
