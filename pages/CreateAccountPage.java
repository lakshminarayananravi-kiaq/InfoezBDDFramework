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
import io.cucumber.java.en.When;

public class CreateAccountPage extends BaseClass {
	
	@And("Enter the Fullname as {string}")
	public CreateAccountPage enterTheFullname(String fname) {
		getDriver().findElement(By.xpath("//input[@data-testid='register-name']")).sendKeys("lakshmin");
		return this;

	}
	
	
	@And("Enter the Email as {string}")
	public CreateAccountPage enterTheEmail(String email1) {
		Actions actions=new Actions(getDriver());
		WebElement email=getDriver().findElement(By.xpath("//input[@data-testid='register-email']"));
		actions.scrollToElement(email).perform();
		email.sendKeys("customer@infoez.com");
		return this;
	}
	
	
	@And("Enter the Account password as Customer@{int}")
	public CreateAccountPage enterThePassword(Integer int1) {
		Actions actions=new Actions(getDriver());
		WebElement pwd=getDriver().findElement(By.xpath("//input[@data-testid='register-password']"));
		actions.scrollToElement(pwd).perform();
		pwd.sendKeys("Customer@123");
		return this;

	}
	
	@When("Click on the createaccount Button")
	public void clickCreateAccountButton() {
		getDriver().findElement(By.xpath("//button[@data-testid='register-submit-btn']")).click();
		
	}
	
	@Then("Display the message as account created")
	public void displayValidMessage() {
		System.out.println("Account created");

	}
	
	@Then("Display the message as invalid details")
	public void displayInvalidMessage() {
		System.out.println("Inavlid credentials entered");
	}
		
	@Then("launch the CreateAccountPage")
	public void verifyCreateAccountPage() {
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/register?role=business_owner"));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/register?role=business_owner");

}
}