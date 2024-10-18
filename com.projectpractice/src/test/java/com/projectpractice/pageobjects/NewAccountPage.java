package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	WebDriver driver;
	

	public NewAccountPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup
	WebElement NewAccountPageHeading;
	
	public String fetchNewAccountPageHeading()
	{
		return  NewAccountPageHeading.getText();
	}
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[1]")
	@CacheLookup
	WebElement CustomerIDheading;
	
	public String fetchCustomerIDheading()
	{
		return CustomerIDheading.getText();
	}
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[1]")
	@CacheLookup
	WebElement AccountTypeheading;
	
	public String fetchAccountTypeheading()
	{
		return AccountTypeheading.getText();
	}
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")
	@CacheLookup
	WebElement InitialDepositheading;
	
	public String fetchInitialDepositheading()
	{
		return InitialDepositheading.getText();
	}
	
	
	
	
	@FindBy(xpath= "/html/body/p/a")
	@CacheLookup
	WebElement NewAccountHomePageLink;
	
	public void NAPagetoHomePage()
	{
		NewAccountHomePageLink.click();
		
		
		
	}

}
