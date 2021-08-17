package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPageObjects extends Base{
	
	public WebDriver driver;
	
	//object repo
	
		By signin = By.cssSelector("a[href*='sign_in']");
		By title = By.xpath("//*[@id=\"content\"]/div/div/h2");
		By Email_Address = By.cssSelector("input[type='email']");
		By Password = By.cssSelector("input[type='password']");
		By Log_in = By.cssSelector("input[type='submit']");
		
		/*
		 * 
		 * 
		 * 
		 * */
	
	//constructor
		public LandingPageObjects(WebDriver driver) {
			
			this.driver=driver;
			
		}

	//object methods

	public WebElement getLogin() {
		
		driver.findElement(signin);
		driver.findElement(Email_Address);
		driver.findElement(Password);
		return driver.findElement(Log_in);
		
	}
	
	public WebElement getTitle() {
		
		return driver.findElement(title);
	}
	

}
