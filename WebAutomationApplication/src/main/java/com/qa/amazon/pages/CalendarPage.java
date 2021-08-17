package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.amazon.base.TestBase;

public class CalendarPage extends TestBase {
	
	
	/*
	 * Object repository or Page Factory
	 * 
	 * */
	
	@FindBy(xpath = "//a[@href='/calendar']")
	WebElement calender;
	
	
	@FindBy(xpath = "//button[@class = 'ui linkedin button']")
	WebElement createCalenderButton;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement createNewEventText ;
	
	
	
	@FindBy(xpath = "//input[@name= 'title']")
	WebElement title;
	
	
	/*
	 * Initilization or creating constructor
	 * */
	
	
	public CalendarPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * Actions
	 * 
	 * */
	
	public CalendarPage calendarIcon() {
		
		Actions action = new Actions(driver);
		action.moveToElement(calender).build().perform();
		calender.click();
		createCalenderButton.click();
		return new CalendarPage();
		
	}
	
	public boolean createNewEventText() {
		
		Actions action = new Actions(driver);
		action.moveToElement(calender).build().perform();
		calender.click();
		
		createCalenderButton.click();
		return createNewEventText.isDisplayed();
		
		
		
		
	}
	
	
	
	
	
	

}
