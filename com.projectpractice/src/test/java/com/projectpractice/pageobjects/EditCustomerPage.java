package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	WebDriver driver;

	public EditCustomerPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup
	WebElement EditCustomerPageHeading;

	public String fetcheditCustomerPageHeading() {
		return EditCustomerPageHeading.getText();
	}

	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[1]")
	@CacheLookup
	WebElement CustomerIDheading;

	public String fetchCustomerIDheading() {
		return CustomerIDheading.getText();
	}

	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/p/a")
	@CacheLookup
	WebElement EditCustomerHomePageLink;

	public void ECPagetoHomePage() {
		EditCustomerHomePageLink.click();

	}

}
