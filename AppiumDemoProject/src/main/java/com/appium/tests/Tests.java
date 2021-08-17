package com.appium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends Base {

	@Test
	public void testone() {
		driver.get("https://www.google.com/");
		// driver.findElement(By.className("gLFyf gsfi")).sendKeys("automation");
		// driver.findElement(By.className("gLFyf gsfi")).sendKeys(Keys.ENTER);

		System.out.println("test one is complite");
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/a/h3")).click();
	}

}
