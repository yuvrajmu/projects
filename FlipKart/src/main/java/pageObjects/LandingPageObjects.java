package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourse.Base;

public class LandingPageObjects extends Base {
	
WebDriver ldriver;
	
//initilazing the page objects	

public LandingPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//page objects
	
	@FindBy(xpath="//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[7]/div")
	WebElement popup;
	
	@FindBy (xpath="//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span")
	WebElement login;
		
	
	
	
	
	//Actions
	
	public void popuphandling() {
		
		
	}
	
	public void logingButton() {
		
		login.click();		
		
		
	}
	
	
	
	

}
