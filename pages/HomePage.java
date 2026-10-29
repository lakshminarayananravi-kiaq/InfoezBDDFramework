package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass {
	
	
	@Then("It should launch the HomePage")
	public HomePage verifyHomePage() {
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/"));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/");
		return this;

	}
	
	@Then("The Welcome message should be displayed")
	public void welcomeMessage() {
		//wait for the toast message
				WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
				//locate the element for the message
				WebElement welcomeMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Welcome back!']")));
				System.out.println(welcomeMessage.getText());
				
	}
	
	
	
	@When("Click on the username button")
	public HomePage ClickUsername() {
		WebDriverWait waits=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		
		 //Locate the toast message
	     By toast=By.xpath("//li[normalize-space()='Welcome back!']");
	     //locate the click button
	     By username=By.xpath("//span[@class='hidden sm:inline text-sm font-medium']");
	     //wait for the toast message to disappear
	     waits.until(ExpectedConditions.invisibilityOfElementLocated(toast));
	     //wait for the element to click
	     waits.until(ExpectedConditions.elementToBeClickable(username)).click();
	     return this;
	    

	}
	
	@When("Click on the My review button")
	public ReviewPage clickMyreviewsButton() {
		WebDriverWait waits=new WebDriverWait(getDriver(),Duration.ofSeconds(15)); 
		WebElement myReviewsButton=getDriver().findElement(By.xpath("//*[@data-testid='menu-reviews']"));
		waits.until(ExpectedConditions.elementToBeClickable(myReviewsButton)).click();
		return new ReviewPage();

	}
	
	@When("Click on the My enquiry button")
	public EnquiriesPage clickMyEnquiriesButton() {
		WebDriverWait waits1=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement myEnquiriesButton=getDriver().findElement(By.xpath("//*[@data-testid='menu-enquiries']"));
		waits1.until(ExpectedConditions.elementToBeClickable(myEnquiriesButton)).click();
		return new EnquiriesPage();

	}
	
	@When("Click on the Notification button")
	public NotificationsPage clickNotificationsButton() {
		WebDriverWait waits1=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement myEnquiriesButton=getDriver().findElement(By.xpath("//*[@data-testid='menu-notifications']"));
		waits1.until(ExpectedConditions.elementToBeClickable(myEnquiriesButton)).click();
		return new NotificationsPage();
		
	}
	
	@When("Click on the Subscription button")
	public PricingPage clickSubscriptionButton() {
		WebDriverWait waits1=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement subscriptionButton=getDriver().findElement(By.xpath("//div[text()='Subscription']"));
		waits1.until(ExpectedConditions.elementToBeClickable(subscriptionButton)).click();
		return new PricingPage();
	}
	
	
	@And("Click on the profile button")
	public ProfileCreationPage ClickProfileButton() {
		WebDriverWait waits1=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		WebElement profileButton=getDriver().findElement(By.xpath("//*[@data-testid='menu-profile']"));
		waits1.until(ExpectedConditions.elementToBeClickable(profileButton)).click();
		return new ProfileCreationPage();
	}
	
	
	@When("Click on the favourite button")
	public void clickFavouriteButton() {
		 getDriver().findElement(By.xpath("//div[@data-testid='menu-favorites']")).click(); 

	}
	
	@When("Click the pricing button")
	public PricingPage clickPricingButton() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//a[@data-testid='nav-pricing']")).click();
		return new PricingPage();

	}
	
	
	@When("Click on the explore button")
	public ExploreBusinessPage clickonExploreButton() {
		WebDriverWait waits=new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		WebElement exploreButton=waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='nav-explore']")));
		exploreButton.click();
		return new ExploreBusinessPage();

	}
	
	@When("Click on How it works option")
    public HowItWorksPage clickhowItWork() {
    	getDriver().findElement(By.xpath("//a[@data-testid='nav-how-it-works']")).click();
    	return new HowItWorksPage();
	}
	
	@And("Enter the Business in the textField")
	public HomePage enterTheSearchBusiness() {
		getDriver().findElement(By.xpath("//input[@data-testid='hero-search-query']")).sendKeys("Naga Biryani House");
		return this;

	}
	
	@And("Enter the city in the textField")
	public HomePage enterTheCity() {
		getDriver().findElement(By.xpath("//input[@data-testid='hero-search-location']")).sendKeys("Hyderabad");
		return this;

	}
	
	@When("Click the search button")
	public ExploreBusinessPage ClicktheSearchButton() {
		getDriver().findElement(By.xpath("//button[@data-testid='hero-search-submit']")).click();
		return new ExploreBusinessPage();
		

	}
	
	
	

}
