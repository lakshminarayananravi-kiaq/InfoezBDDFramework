package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ViewFavouriteListPage extends BaseClass {
	
	
	@When("Click on the business saved as favourite")
	public BusinessDescriptionPage ClicktheBusiness() {
		//Thread.sleep(1000);
				//driver.findElement(By.xpath("//img[@alt='Naga Biryani House']")).click();
				WebDriverWait wait=new WebDriverWait (getDriver(),Duration.ofSeconds(25));
			    WebElement savedBusiness=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Artisan Dental Clinic']")));
			    savedBusiness.click();
			    return new BusinessDescriptionPage();
	}
	
	
	
	
	
}
