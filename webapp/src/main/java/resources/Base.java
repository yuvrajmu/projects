package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
		
	
	public WebDriver driver;
	
		
		
		public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\selenium project\\webapp\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName =  prop.getProperty("browser");
		
		//chrome browser
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\selenium project\\webapp\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//FireFox browser
		
		else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\selenium project\\webapp\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
}
