package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin = By.className("theme-btn register-btn");
	
	public WebElement getLogin() {
	return	driver.findElement(signin);
	}

}
