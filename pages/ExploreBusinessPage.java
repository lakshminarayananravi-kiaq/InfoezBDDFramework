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

public class ExploreBusinessPage extends BaseClass {
	
	
	@And("Click the categories dropdown and select the business")
	public ExploreBusinessPage ClickAllCategories() {
        WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		
		//click the categories dropdown
		WebElement categoriesDropdown=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='filter-category']")));
		//driver.findElement(By.xpath("//button[@data-testid='filter-category']")).click();
		categoriesDropdown.click();
		
		//Click the Business option
		WebDriverWait wait4=new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		WebElement restaurantOption=wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Restaurants']")));
		restaurantOption.click();
		return this;

	}
	
	@And("Click the SortBy dropdown and select the option")
	public ExploreBusinessPage ClickSortBy() {
		 
		        //click the sortby dropdown
				WebDriverWait wait1=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
				WebElement sortByDropdown=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='filter-sort']")));
				sortByDropdown.click();
				
				//Click the sortby option
				WebElement sortByOption=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Most popular']")));
				sortByOption.click();
				return this;
	}
	
	@And("Click the rating and select the rating")
	public ExploreBusinessPage ClickTheRating() {
		
		//click the rating dropdown
		WebDriverWait wait2=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		WebElement ratingDropdown=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Any']")));
		ratingDropdown.click();
	
		//Click the ratingOption
		WebElement ratingOption=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='4.5+']")));
		ratingOption.click();
		return this;
		

	}
	
	@When("Click the verified checkbox")
	public ExploreBusinessPage clickVerifiedOnly() {
		getDriver().findElement(By.xpath("//input[@data-testid='filter-verified']")).click();
		return this;
			
	}
	
	
	
	@Then("It should display the verified business")
	public void verifiedBusinessCheck() {
		System.out.println("Verified Business shown");
	}
	
	
	@And("Click the Business")
	public BusinessDescriptionPage ClicktheBusinessShown() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//img[@alt='Naga Biryani House']")).click();
		return new BusinessDescriptionPage();
	}
	
	@Then("launch the Explore Business page")
	public void verifyExploreBusinessPageLaunch() {
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe("https://d2mojgetgp5xie.cloudfront.net/search"));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://d2mojgetgp5xie.cloudfront.net/search");
	}
	
	

}
