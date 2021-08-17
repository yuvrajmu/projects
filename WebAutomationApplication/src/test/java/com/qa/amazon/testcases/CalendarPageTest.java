package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;
import com.qa.amazon.pages.CalendarPage;
import com.qa.amazon.pages.CallsPage;
import com.qa.amazon.pages.CampaignsPage;
import com.qa.amazon.pages.CasesPage;
import com.qa.amazon.pages.CompaniesPage;
import com.qa.amazon.pages.ContactsPage;
import com.qa.amazon.pages.DealsPage;
import com.qa.amazon.pages.DocumentsPage;
import com.qa.amazon.pages.EmailPage;
import com.qa.amazon.pages.FormsPage;
import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LandingPage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.TasksPage;

public class CalendarPageTest extends TestBase {
	
	
	LandingPage landingPage;
	LoginPage loginpage;
	HomePage homepage;
	CalendarPage calendar;
	ContactsPage contacts;
	CompaniesPage companies;
	DealsPage deals;
	TasksPage tasks;
	CasesPage cases;
	CallsPage calls;
	DocumentsPage documents;
	EmailPage email;
	CampaignsPage campaigns;
	FormsPage forms;
	
	
	@BeforeMethod
	public void setUp() {
		
		initilizeDriver();
		landingPage = new LandingPage();
		loginpage = landingPage.loginButton();
		loginpage = new  LoginPage();
		homepage = loginpage.loginOperation(prop.getProperty("username"), prop.getProperty("password"));
		calendar = new CalendarPage();
		contacts = new ContactsPage();
		companies = new CompaniesPage(); 
		deals = new DealsPage();
		tasks = new TasksPage();
		cases = new CasesPage();
		calls = new CallsPage();
		documents = new DocumentsPage();
		email = new EmailPage();
		campaigns = new CampaignsPage();
		forms = new FormsPage();
		
	}
	
	/*
	 * TestCases
	 * 
	 * */
	
	//@Test
	//public void createNewCalendarTest() {
		
	//	calendar.calendarIcon();
		
	//}
	
	@Test
	public void createNeweventTextTest() {
		
		Assert.assertTrue(calendar.createNewEventText());
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
