package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileCreationPage extends BaseClass{
	
	@And("Enter the name as {string}")
	public ProfileCreationPage EnterTheName(String name) {
		WebElement nameField1=getDriver().findElement(By.xpath("//*[@data-testid='profile-name']"));
		nameField1.clear();
		nameField1.sendKeys("lakshmi");
		return this;

	}
	
	@And("Enter the phonenumber as {string}")
	public ProfileCreationPage EnterPhoneNumber(String phone) {
		WebElement phonenumberField=getDriver().findElement(By.xpath("//*[@data-testid='profile-phone']"));
		phonenumberField.clear();
		phonenumberField.sendKeys("9636739812");
		return this;

	}
	
	@When("Click on the savechanges button")
	public ProfileCreationPage ClickSaveChangesButton() {
        WebElement save=getDriver().findElement(By.xpath("//button[text()='Save changes']"));
		
		Actions actions=new Actions(getDriver());
		actions.scrollToElement(save).perform();
		save.click();
		return this;

	}
	
	@Then("profile update messages should be displayed")
	public ProfileCreationPage ProfileUpdatedMessage() throws InterruptedException {
		Thread.sleep(1000);
		WebElement getupdateMessage=getDriver().findElement(By.xpath("//div[text()='Profile updated']"));
		System.out.println(getupdateMessage);
		return this;

	}

}
