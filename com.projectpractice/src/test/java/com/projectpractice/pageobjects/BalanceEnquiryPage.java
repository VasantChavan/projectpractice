package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalanceEnquiryPage {
	WebDriver driver;

public BalanceEnquiryPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
@CacheLookup
WebElement BalanceEnquiryPageHeading;

public String fetchBalanceEnquiryPageHeading() {
	return BalanceEnquiryPageHeading.getText();
}

@FindBy(xpath = "/html/body/table/tbody/tr/td/p/a")
@CacheLookup
WebElement BalanceEnquiryPageHomePageLink;

public void BalanceEnquiryPagetoHomePage() {
	BalanceEnquiryPageHomePageLink.click();

}

}
