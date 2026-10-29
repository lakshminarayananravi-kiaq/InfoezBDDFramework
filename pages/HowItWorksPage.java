package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HowItWorksPage extends BaseClass{
	
	@And("Click on the Start exploring Button")
	public ExploreBusinessPage clickStartExploringButton() {
		getDriver().findElement(By.xpath("//a[text()='Start exploring']")).click();
		return new ExploreBusinessPage();
			
	}
	
	@And("Click on the List your Business Button")
	public CreateAccountPage clickListYourBusinessButton() {
		getDriver().findElement(By.xpath("//a[text()='List your business']")).click();
		return new CreateAccountPage();	
	}
	
	@Then("launch the How Infoez works page")
	public void VerifyHowInfoezWorksPage() {
		System.out.println("How Infoez works Page launched");
	}
	

}
