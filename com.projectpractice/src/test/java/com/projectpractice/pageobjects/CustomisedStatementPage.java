package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomisedStatementPage {
	WebDriver driver;

	public CustomisedStatementPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup
	WebElement CustomisedStatementPageHeading;

	public String fetchCustomisedStatementPageHeading() {
		return CustomisedStatementPageHeading.getText();
	}
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td/p/a")
	@CacheLookup
	WebElement CustomisedStatementPageHomePageLink;
	
	public void CSPagetoHomePage()
	{
		CustomisedStatementPageHomePageLink.click();
		
		
		
	}

}
