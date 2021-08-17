package SourceBase.FlipKart;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import resourse.Base;

public class LoginPageTest extends Base {
	
	LandingPageObjects loginpage;
	
	@BeforeMethod()
	
	public void setUp() throws IOException  {
		
		
		loginpage = new LandingPageObjects(driver);
		loginpage. initializingDriver();
		}
	
	@Test()
	public void loginTest() {
	
		loginpage.logingButton();
		}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();	
	}
	
	
}
