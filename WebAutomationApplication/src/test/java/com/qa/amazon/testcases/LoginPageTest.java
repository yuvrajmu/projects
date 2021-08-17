package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;

import com.qa.amazon.pages.ClassicCrmUserPage;
import com.qa.amazon.pages.ForgotPasswordPage;
import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LandingPage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.SignUpPage;

public class LoginPageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginpage;
	HomePage homepage;
	ForgotPasswordPage forgotPassword;
	ClassicCrmUserPage crmpro;
	SignUpPage signUp;

	
	
	
	public LoginPageTest() {
		
		super();
	}
	
	
	@BeforeMethod
	
	public void setUp() {
		
		initilizeDriver();
		landingPage = new LandingPage();
		loginpage = landingPage.loginButton();
		 homepage = new HomePage();
		 forgotPassword = new ForgotPasswordPage();
		 crmpro = new ClassicCrmUserPage();
		 signUp = new SignUpPage();
		 
		 
		
		
		
	}
	@Test
	public void PageTitleTest() {
		
		String title = loginpage.PageTitle();
		Assert.assertEquals(title, "Cogmento CRM","Login page title not matched");
		
	}
	
	@Test(priority = 1)
	public void forgotPasswordTest() {
		forgotPassword = loginpage.forgetPasswordLinkTest();
	 
	}
	
	@Test(priority = 2)
	public void crmProClassicUserTest() {
	 crmpro = loginpage.crmProClassicUser();
		
	}
	
	@Test(priority = 3)
	public void signupLinkTest() {
		 signUp = loginpage.signup();
		
	}
	
	@Test(priority = 4)
	
	public void LoginTest() {
		
		homepage = loginpage.loginOperation(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.close(); 
	}
	
	
}
