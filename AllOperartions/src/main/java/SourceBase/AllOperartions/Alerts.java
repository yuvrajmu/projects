package SourceBase.AllOperartions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project\\AllOperartions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5);
		
		
		//alert.dismiss();
		String alertmsg	= alert.getText();
		System.out.println(alertmsg);
		alert.accept();
		
		
	

	}

}
