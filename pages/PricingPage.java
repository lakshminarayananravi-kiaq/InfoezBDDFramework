package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PricingPage extends BaseClass {
	
	@Then("It launch the Pricing page")
	public PricingPage verifyPricingPageLaunch() {
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/subscription"));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/subscription");
		return this;
			
	}
	
	
	@And("Click the free plan button")
	public PricingPage clickFreePlan() {
		
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		WebElement freePlan=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='subscribe-free']")));
		
		Actions actions=new Actions(getDriver());
		actions.scrollToElement(freePlan).perform();
		freePlan.click();
		return this;

	}
	
	@And("Click the starter plan button")
	public PricingPage clickStarterPlan() {
		
		WebDriverWait wait1=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		WebElement starterPlan=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='subscribe-starter']")));
		
		Actions actions1=new Actions(getDriver());
		actions1.scrollToElement(starterPlan).perform();
		starterPlan.click();
		return this;
	}
	
	@And("Click the pro plan button")
	public PricingPage clickProPlan() {
		
		WebDriverWait wait2=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		WebElement proPlan=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='subscribe-pro']")));

		
		Actions actions2=new Actions(getDriver());
		actions2.scrollToElement(proPlan).perform();
	    proPlan.click();
	    return this;
	}
	
	@And("Click the enterprise plan button")
	public PricingPage clickEnterprisePlan() {
		
		WebDriverWait wait3=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		WebElement enterprisePlan=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='subscribe-enterprise']")));
		
		Actions actions3=new Actions(getDriver());
		actions3.scrollToElement(enterprisePlan).perform();
	    enterprisePlan.click();
	    return this;
	}
	
	
	@Then("Display the message as subscription updated")
	public void displaySubscriptionMessage() {
		System.out.println("Subscription updated ");
		
	}

}
