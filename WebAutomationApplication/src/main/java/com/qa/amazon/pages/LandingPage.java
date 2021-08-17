package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class LandingPage extends TestBase{
	
	
	
	
	
	/*
	 * Page factory , Object repository
	 * 
	 * */
	
	
	@FindBy(xpath = "//h11")  // exception occured
	WebElement logo;
	
	@FindBy(xpath="//a[@class = 'btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement signup;
	
	@FindBy(xpath="//a[@class = 'btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement login;
	
	
	
	/*
	 * Initilaization or creating constructor
	 * 
	 * */
	
	public LandingPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	/*
	 * Actions
	 * 
	 * */
	
	public String pageTitle() {
		
		return	driver.getTitle();
	}
	
	public boolean pageLogo() {
		 
		return	logo.isDisplayed();
	}
	
	public boolean signUpButton() {
		
		return signup.isDisplayed();
	}
	
	/*
	 * Navigate to login
	 */
	public LoginPage loginButton() {
		
		login.click();
		return new LoginPage();
	}
 
}
