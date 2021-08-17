package SourceBase.webapp;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import resources.Base;

public class LandingPageTest extends Base {
	
	LandingPageObjects lpo; 
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		driver = initializeDriver();
		lpo = new LandingPageObjects(driver);
		
	}
	
	/*
	 * Test Casess
	 * 
	 * */
	@Test
	public void getLog_in() {
		lpo.getLogin().click();
		lpo.getLogin().sendKeys("yuvrajmu@gmail.com");
		lpo.getLogin().sendKeys("Me123@123");
		lpo.getLogin().click();
	}
	@Test
	
	public void basePageNavigation() throws IOException {
		
		lpo.getLogin().click();	
	}
	
	@Test
	public void getPageTitle() throws IOException {
		
		Assert.assertEquals(lpo.getTitle().getText(),"FEATURED COURSES");
		
	}
	
	
	
	@AfterMethod
	public void tail() {
		
		driver.quit();
	}

}
