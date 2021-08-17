package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class LoginPage extends TestBase {
	
	LandingPage LandingPage;
	
	
	
	/*
	 * PageFactory or Object Repository
	 * */
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class = 'ui fluid large blue submit button']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement forgotpassword;
	
	@FindBy(xpath = "//a[contains(text(),'Classic CRM')]")
	WebElement classicCRM;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signup;
	
	
	/*
	 * intitlization or creating constructor
	 * 
	 * */
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	/*
	 * Actions
	 * 
	 * */
	
	public String PageTitle() {
		
		return driver.getTitle();
	}
	
	public ForgotPasswordPage forgetPasswordLinkTest() {
		
		 forgotpassword.click();
		return new ForgotPasswordPage();
		
		
	}
	
	public ClassicCrmUserPage crmProClassicUser() {
		
		classicCRM.click();
		return new ClassicCrmUserPage();
	}
	
	public SignUpPage signup() {
		
		signup.click();
		return new SignUpPage();
	}

	public HomePage loginOperation(String un,String pw) {
		
		  
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbutton.click();
		return new HomePage();
		
	}
	
	
	

}
