package SourceBase.AllOperartions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

public class PopUps_WindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\selenium project\\\\AllOperartions\\\\Drivers\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String	pagetitle = driver.getTitle();
	    System.out.println(pagetitle);
	    
	    
	    
	    //Windows handling
	    
	    
	   String parent = driver.getWindowHandle();
	   System.out.println("Parent window is "+parent);
	   
	   
	   driver.findElement(By.xpath("//button[@id='openwindow']")).click(); //it will opening new window
	   
	   Set<String> allwindow = driver.getWindowHandles();
	   
	   int count = allwindow.size();
	   System.out.println("Total window:     "+count);
	   
	   
	   for(String child:allwindow) {
		   
		   if(!parent.equalsIgnoreCase(child)){
			   
			   driver.switchTo().window(child);
			   
			   driver.findElement(By.xpath("//div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")).click();
			   
			   System.out.println(driver);
			   //driver.findElement(By.linkText("Practice"));
			   driver.getTitle();
			   System.out.println("Window title is    :   "+driver.getTitle());
			 
			   driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[5]/a")).click();
			   driver.manage().window().maximize();
			   driver.findElement(By.xpath("//input[@value='radio1']")).click();
		   }
	   }
	   
	   
	}

}
