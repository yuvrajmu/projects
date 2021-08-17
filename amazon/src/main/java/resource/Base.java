package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;

	public WebDriver initializeDiver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream("E:\\selenium project\\amazon\\src\\main\\java\\resource\\data.properties");
		prop.load(fin);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {

			// execute in chrome

			System.setProperty("webdriver.chrome.driver", "E:\\selenium project\\amazon\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			// execute in firefox

			System.setProperty("webdriver.gecko.driver", "E:\\selenium project\\amazon\\Drivers\\#######.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals( "IE")) {

			// execute in IE

			System.setProperty("webdriver.ie.driver", "E:\\selenium project\\amazon\\Drivers\\########.exe");
			driver = new InternetExplorerDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
