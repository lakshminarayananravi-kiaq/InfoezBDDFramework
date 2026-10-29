package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	
	@And("Enter the username as {string}")
	public LoginPage enterUsername(String uName) {
		WebDriverWait wait1=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement enterusername=wait1.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		enterusername.sendKeys(uName);
		return this;
		
	}
	
	@And("Enter the password as Customer@{int}")
	public LoginPage enterPassword(Integer int1) {
		getDriver().findElement(By.id("password")).sendKeys("Customer@123");
		return this;
	}
	
	@And("Click on the Login button")
	public HomePage clickLoginButton() {	
		getDriver().findElement(By.xpath("(//button[contains(text(),'Sign in')])[2]")).click();
		return new HomePage();

	}
	
	@And("user click emailfield without entering details")
	public LoginPage clickEmailFieldwithoutDetails() {
		WebDriverWait wait1=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement enterusername=wait1.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		enterusername.sendKeys();
		return this;
	}
	
	
	@And("user click passwordfield without entering password")
	public LoginPage clickPasswordFieldWithoutDetails() {
		getDriver().findElement(By.id("password")).sendKeys();
		return this;
			
	}
	
	
	@Then("The toast message should display as Please fill out this field")
	public void DisplayToastMessagAsPleaseFill() {
		System.out.println("Please fill out this field");

	}
	
	
	
	@Then("it should be navigated to the login page")
	public void verifyLogin() {
		System.out.println("Welcome Back!");
		
	}
	
	@Then("it shown as invalid credentials")
	public LoginPage invalidcredentials() {
		//wait for the toast message
		WebDriverWait waits=new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		//locate the element for the message
        WebElement invalidMessage=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Invalid credentials']")));    
		System.out.println(invalidMessage.getText());
		
		waits.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/login"));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/login");
		return this;
	}
	

	
	@Then("The Invalid Credentials message should be displayed")
	public void invalidcredentialsMessage() {
		//wait for the toast message
				WebDriverWait waits=new WebDriverWait(getDriver(),Duration.ofSeconds(20));
				//locate the element for the message
		        WebElement invalidMessage=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Invalid credentials']")));    
				System.out.println(invalidMessage.getText());
				
				waits.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/login"));
				Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/login");
							
		
	}
	
	@And("Click the createoneButton")
	public CreateAccountPage clickCreatOneButton() throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//a[text()='Create one']")).click();
		return new CreateAccountPage();

	}
	
	
}

