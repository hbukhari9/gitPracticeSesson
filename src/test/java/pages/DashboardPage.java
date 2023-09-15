package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class DashboardPage {
	public DashboardPage() {
	    PageFactory.initElements(Driver.getDriver(), this);
	}  
	
	@FindBy (linkText = " Dashboard")
	public WebElement dashboard_tab;
	
	@FindBy (xpath = "//a[text()=' Customers']")
	public WebElement customers_tab;
	
	@FindBy (xpath = "//a[text()=' Items']")
	public WebElement items_tab;
	
	@FindBy (xpath = "//p[text()='Logged in successfully.']")
	public WebElement loggedInSuccess_message;
	
	@FindBy (xpath = "//span[text()='Amount Due']")
	public WebElement dashboard_page_AmountDue_Button;
	
	@FindBy (xpath = "//span[text()='Customers']")
	public WebElement dashboard_page_Customers_Button;
	
	@FindBy (xpath = "//span[text()='Invoices']")
	public WebElement dashboard_page_Invoices_Button;
	
	@FindBy (xpath = "//span[text()='Estimates']")
	public WebElement dashboard_page_Estimates_Button;
}
