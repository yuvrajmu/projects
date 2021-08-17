package com.qa.amazon.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.qa.amazon.util.TestUtil;
import com.qa.amazon.util.WebEventListener;

public class TestBase {
	
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	
	public TestBase() {
		try {
		 
			prop = new Properties();
			fis = new FileInputStream("E:\\selenium project\\WebAutomationApplication\\src\\main\\java\\com\\qa\\amazon\\config\\config.properties");
			prop.load(fis);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static  void initilizeDriver() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\selenium project\\WebAutomationApplication\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "E:\\selenium project\\WebAutomationApplication\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			
			System.out.println("driver not found");
			
		}
		
		
		
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	
		
		
		
	}
	

}
