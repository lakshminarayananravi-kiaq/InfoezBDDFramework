package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests {
	
//public static ChromeDriver driver;
	
	
	private static final ThreadLocal<ChromeDriver> eDriver=new ThreadLocal<ChromeDriver>();
	
	public void setDriver() {
		eDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		ChromeDriver chromeDriver=eDriver.get();
		return chromeDriver;
	}
	
public String filename;
	
	@BeforeMethod
	public void preConditions() {
		//driver=new ChromeDriver();
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("https://d2mojgetgp5xie.cloudfront.net");
		
	}
	
	@AfterMethod
	public  void postConditions() {
		getDriver().close();
		
	}
	
	@DataProvider(name="fetchData")
	public String[][] readData() throws IOException{
		
		String[][] read= ReadExcel.read(filename);
		return read;
		
	}

}
