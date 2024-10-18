package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
	WebDriver driver;

	public DeleteAccountPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td")
	@CacheLookup
	WebElement DeleteAccountPageHeading;
	
	public String fetchDeleteAccountPageHeading()
	{
		return DeleteAccountPageHeading.getText();
		
	}
	
	

}
