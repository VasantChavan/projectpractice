package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	WebDriver driver;

	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup
	WebElement ChangePasswordPageHeading;

	public String fetchChangePasswordPageHeading() {
		return ChangePasswordPageHeading.getText();
	}

	@FindBy(xpath = "/html/body/p")
	@CacheLookup
	WebElement ChangePasswordPageHomePageLink;

	public void ChangePasswordPagetoHomePage() {
		ChangePasswordPageHomePageLink.click();

	}
}
