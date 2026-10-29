package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessDescriptionPage extends BaseClass {
	
	@When("Click on the saved button")
	public BusinessDescriptionPage clickSavedButton() {
		WebDriverWait wait2=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
	     WebElement savedButton=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Saved']")));
	     savedButton.click();
	   //driver.findElement(By.xpath("//button[text()='Saved']")).click();
	     return this;
	}
	
	@When("Click on the save button")
	public BusinessDescriptionPage clickSaveButton() {
		getDriver().findElement(By.xpath("//button[text()='Save']")).click();
		return this;
	}
	
	@And("Click the send enquiry button")
	public BusinessDescriptionPage clickSendEnquiryButton() throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//button[@data-testid='open-enquiry-btn']")).click();
		return this;	
	}
	
	@And("Click the claim button")
	public BusinessDescriptionPage clicktheClaimButton() {
		WebDriverWait wait2=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement claimButton=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Claim']")));
		claimButton.click();
	//	getDriver().findElement(By.xpath("//button[text()='Claim']"))
		return this;
	}
	
	@And("Enter the reason")
	public BusinessDescriptionPage EntertheReason() {
		WebDriverWait wait3=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement enterReason=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@data-testid='claim-reason']")));
		//getDriver().findElement(By.xpath("//textarea[@data-testid='claim-reason']")).sendKeys("Testing");
		enterReason.sendKeys("Testing");
		return this;

	}
	
	@And("Enter URL option")
	public BusinessDescriptionPage EntertheproofURL() {
		getDriver().findElement(By.xpath("//input[@data-testid='claim-proof']")).sendKeys("proofURL");
		return this;
	}
	
	@When("Click the submit claim button")
	public BusinessDescriptionPage clickTheSubmitClaimButton() {
		getDriver().findElement(By.xpath("//button[@data-testid='claim-submit-btn']")).click();
		return this;
	}
	
	@Then("Verify the Claim submission message")
	public BusinessDescriptionPage verifytheClaimMessage() {
		System.out.println("Claim submitted message");
		return this;

	}
	
	
	@And("Enter the enquiry name")
	public BusinessDescriptionPage enterEnquiryName() {
		WebElement enquiryName=getDriver().findElement(By.xpath("//input[@data-testid='enquiry-name']"));
		enquiryName.clear();
		enquiryName.sendKeys("Lakshmin");
		return this;
	}
	
	@And("Enter the enquiry phone number")
	public BusinessDescriptionPage enterEnquiryPhonenumber() {
		WebElement enquiryPhonenumber=getDriver().findElement(By.xpath("//input[@data-testid='enquiry-phone']"));
		enquiryPhonenumber.clear();
		enquiryPhonenumber.sendKeys("7365298765");
		return this;

	}
	
	@And("Enter the message")
	public BusinessDescriptionPage entertheMessage() {
		getDriver().findElement(By.xpath("//textarea[@data-testid='enquiry-message']")).sendKeys("Testing");
		return this;

	}
	
	@When("Click the send button")
	public BusinessDescriptionPage clicksendEnquiryButton() {
		getDriver().findElement(By.xpath("//button[@data-testid='enquiry-submit-btn']")).click();
		return this;
		
	}
	
	@Then("Display the message as Enquiry submitted")
	public void displayEnquirymessageSent() {	
		System.out.println("Enquiry submitted");
		
	}
	
	@Then("Display the message as saved to favourites")
	public void savedFavouriteMessage() {
		System.out.println("Saved Business favourite");

	}
	
	@Then("Display the message as removed from favourites")
	public void RemoveFavouriteMessage() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement removeMessage=getDriver().findElement(By.xpath("//div[text()='Removed from favorites']"));
	    System.out.println(removeMessage.getText());
	}
	
	@And("Click on the review button")
	public BusinessDescriptionPage clicktheWriteReviewButton() {
		Actions actions=new Actions(getDriver());
		WebElement writereviewButton=getDriver().findElement(By.xpath("//button[text()='Write a review']"));
		actions.scrollToElement(writereviewButton).perform();
		writereviewButton.click();
		return this;
	}
	
	@And("Select the rating")
	public BusinessDescriptionPage selectTheRating() {
		getDriver().findElement(By.xpath("//button[@data-testid='review-star-4']")).click();
		return this;
	}
	
	@Given("Enter the comment")
	public BusinessDescriptionPage EnterTheComment() {
		getDriver().findElement(By.xpath("//textarea[@data-testid='review-comment']")).sendKeys("Testing");
		return this;
		

	}
	
	@When("Click the post review button")
	public BusinessDescriptionPage clickPostReviewButton() {
		getDriver().findElement(By.xpath("//button[@data-testid='review-submit-btn']")).click();
		return this;
	}
	
	@Then("Display the message as Review posted")
	public void VerifyReviewPostedMessage() {
		System.out.println("Review posted");

	}
	}


