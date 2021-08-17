package com.qa.amazon.testcases;

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

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	
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
	
	public HomePageTest() {
		
		super();
	}
	
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
	
	@Test(priority = 1)
	public void homePageatitleTest() {
		
		String homepagetitle = homepage.homePageatitleTest();
		System.out.println(homepagetitle);
		Assert.assertEquals(homepagetitle, "Cogmento CRM");
		
	}
	
	
	@Test(priority = 2)
	public void homeLinkTest() {
		
		homepage = homepage.homeLink();
		
	}
	
	@Test(priority = 3)
	public void calendarLinkTest() {
		
		calendar = homepage.calendarLink();
		
	}
	
	@Test(priority = 4)
	public void contactsLinkTest() {
		
		contacts = homepage.contactsLink();
	}
	
	@Test(priority = 5)
	public void companiesLinkTest() {
		
		companies = homepage.companiesLink();
	}
	
	@Test(priority = 6)
	public void dealsLinkTest() {
		
		deals = homepage.dealsLink();
	}
	
	@Test(priority = 7)
	public void tasksLinkTest() {
		
		tasks = homepage.tasksLink();
		
	}
	
	@Test(priority = 8)
	public void casesLinkTest() {
		
		cases = homepage.casesLink();
		
	}
	
	@Test(priority = 9)
	public void callsLinkTest() {
		
		calls = homepage.callsLink();
		
	}
	
	@Test(priority = 10)
	public void documentsLinkTest() {
		
		documents = homepage.documentsLink();
		
	}
	
	@Test(priority = 11)
	public void emailLinkTest() {
		
		email = homepage.emailLink();
	}
	
	@Test(priority = 12)
	public void campaignsLinkTest() {
		
		campaigns = homepage.campaignsLink();
	}
	
	@Test(priority = 13)
	public void formsLinkTest() {
		
		forms = homepage.formsLink();
	}
	
	@Test(priority = 14)
	public void userNameTest() {
		
		 Assert.assertTrue(homepage.useNameDisplay());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
