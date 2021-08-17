package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public  WebDriver driver;
	
	//object repo
	
	By Email_Address = By.cssSelector("input[type='email']");
	By Password = By.cssSelector("input[type='password']");
	By Log_in = By.cssSelector("input[type='submit']");
	
	
	// constuctor
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//object methods
	
	public WebElement getemail() {
		
		driver.findElement(Email_Address);
		driver.findElement(Password);
		return driver.findElement(Log_in);
		 
	}
	

}
