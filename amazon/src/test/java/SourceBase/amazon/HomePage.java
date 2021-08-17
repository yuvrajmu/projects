package SourceBase.amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import resource.Base;

public class HomePage extends Base {
	
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initializeDiver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		LandingPage l = new LandingPage();
		l.getLogin().click();
	}

}
