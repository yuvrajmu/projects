package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		Thread.sleep(5000);
		driver.close();
		
	}

}



