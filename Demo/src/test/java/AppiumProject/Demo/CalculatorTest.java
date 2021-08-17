package AppiumProject.Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;
	

	public static void main(String[] args) {
	
		try {
			openCalculator();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void openCalculator() throws Throwable {
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	// this for Devices capabilities.
	cap.setCapability("deviceName","OPPOA3s" );
	cap.setCapability("udid", "c24df360");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion","8.1.0");
	
	// thhis for android application(android apk)
	
	cap.setCapability("appPackage", "com.android.vending");
	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url,cap);
	
	System.out.println("driver sucessfuly started");
	
	
	
	
	
	}

}
