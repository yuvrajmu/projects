package SourceBase.webapp;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import pageObjects.LoginPage;
import resources.Base;

public class LoginPageTest extends Base {
	LoginPage lp;
	LandingPageObjects lpo;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		driver = initializeDriver();
		lp = new LoginPage(driver);
		
		
		}
	
	@Test(priority = 1)
	public void enterUserName() {
		
		lp.getemail().sendKeys("yuvrajmu@gmail.com");
		lp.getemail().sendKeys("Me123@123");
		lp.getemail().click();
	}
	
	@AfterMethod
	public void tail() {
		
		driver.quit();
	}
}
