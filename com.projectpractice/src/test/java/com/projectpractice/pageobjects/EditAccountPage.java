package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
	WebDriver driver;

	public EditAccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup
	WebElement EditAccountPageHeading;
	
	public String fetcheditAccountPageHeading()
	{
		return  EditAccountPageHeading.getText();
	}
	
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")
	@CacheLookup
	WebElement AccountNoheading;
	
	public String fetchAccountNoheading()
	{
		return AccountNoheading.getText();
	}
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td/p/a")
	@CacheLookup
	WebElement EditAccountHomePageLink;
	
	public void EAPagetoHomePage()
	{
		EditAccountHomePageLink.click();
		
		
		
	}

}
