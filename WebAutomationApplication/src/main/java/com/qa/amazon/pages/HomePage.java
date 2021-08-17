package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	/*
	 * Page factory or OR:
	 * 
	 * */
	
	@FindBy(xpath = "//a[@href='/home']")
	WebElement home;
	
	
	@FindBy(xpath = "//a[@href='/calendar']")
	WebElement calendar;
	
	
	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contacts;
	
	
	@FindBy(xpath = "//a[@href='/companies']")
	WebElement companies;
	
	
	@FindBy(xpath = "//a[@href='/deals']")
	WebElement deals;
	
	
	@FindBy(xpath = "//a[@href='/tasks']")
	WebElement tasks;
	
	@FindBy(xpath = "//a[@href='/cases']")
	WebElement cases;
	
	@FindBy(xpath = "//a[@href='/calls']")
	WebElement calls;
	
	@FindBy(xpath = "//a[@href='/documents']")
	WebElement documents;
	
	@FindBy(xpath = "//a[@href='/email']")
	WebElement email;
	
	@FindBy(xpath = "//a[@href='/campaigns']")
	WebElement campaigns;
	
	@FindBy(xpath = "//a[@href='/forms']")
	WebElement forms;
	
	@FindBy(xpath = "//*[@class='user-display']")
	WebElement username;
	
	


	
	/*
	 * Initilization or creating constuctor
	 * 
	 * */
	
	public  HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	/*
	 * Actions 
	 * 
	 * 
	 * */
	
	public String homePageatitleTest() {
		
		return driver.getTitle();
	}
	public HomePage homeLink() {
		
		 home.click();
		 return new HomePage();
	}
	
	public CalendarPage calendarLink() {
		
		calendar.click();
		return new CalendarPage();
	}
	
	public ContactsPage contactsLink() {
		
		
		contacts.click();
		return new ContactsPage();
	}
	
	public CompaniesPage companiesLink() {
		
		
		companies.click();
		return new CompaniesPage();
	}
	
	public DealsPage dealsLink() {
		
		
		deals.click();
		return new DealsPage();
	}
	
	public TasksPage tasksLink() {
		
		
		tasks.click();
		return new TasksPage();
	}
	
	public CasesPage casesLink() {
		
		
		cases.click();
		return new CasesPage();
	}
	
	public CallsPage callsLink() {
		
		
		calls.click();
		return new CallsPage();
	}
	
	public DocumentsPage documentsLink() {
		
		
		documents.click();
		return new DocumentsPage();
	}
	
	public EmailPage emailLink() {
		
		
		email.click();
		return new EmailPage();
	}
	public CampaignsPage campaignsLink() {
		
		
		campaigns.click();
		return new CampaignsPage();
	}
	
	public FormsPage formsLink() {
		
		
		forms.click();
		return new FormsPage();
	}
	
	public boolean useNameDisplay() {
		
	return	username.isDisplayed();
		
	}
	
	
}
