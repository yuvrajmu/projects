package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;
import com.qa.amazon.pages.LandingPage;
import com.qa.amazon.pages.LoginPage;

public class LandingPageTest extends TestBase {
	
	LandingPage landingPage;
	LoginPage loginPage;
	
	public LandingPageTest() {
		
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		
		initilizeDriver();
		landingPage = new LandingPage();
		
	}
	
	
	
	@Test(priority = 1)
	public void pageTitleTest() {
		
	String title = 	landingPage.pageTitle();
	Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud","Landing page title not matched");
		
		
	}
	
	@Test(priority = 2)
	public void pageLogoTest() {
		
	boolean flag = 	landingPage.pageLogo();
	Assert.assertTrue(flag, "Logo img not displayed");
		
		
	}
	
	@Test(priority = 3)
	public void pageSignUpTest() {
		
	boolean flag = landingPage.signUpButton();
	Assert.assertTrue(flag, "SignUp btn not Displayed");
	}
	
	
	@Test(priority = 4)
	public void logInPageTest() {
		
		loginPage = landingPage.loginButton();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	
	}

}
