package resourse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver driver;
	
	
	public WebDriver initializingDriver() throws IOException {
		
		Properties prop = new Properties();//connect to properties file
		FileInputStream fis = new FileInputStream(System.getProperty("E:\\selenium project\\FlipKart\\src\\main\\java\\properties\\data.properties"));
		prop.load(fis);// loading file
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\selenium project\\FlipKart\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		else if(browserName.equals("firefox")) {
			
			System.getProperty("webdriver.firefox.driver","E:\\selenium project\\FlipKart\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	
	}
	
	
}
