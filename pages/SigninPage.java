package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class SigninPage extends BaseClass {
	
	@When("Click the sign in button")
	public LoginPage clickSigninButton() {
		getDriver().findElement(By.xpath("//button[@data-testid='header-signin-btn']")).click();
		return new LoginPage();
	}
	
	
}
