package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithdrawalPage {
	WebDriver driver;

	public WithdrawalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	@CacheLookup
	WebElement WithdrawalPageHeading;

	public String fetchWithdrawalPageHeading() {
		return WithdrawalPageHeading.getText();
	}

	@FindBy(xpath = "/html/body/table/tbody/tr/td/p/a")
	@CacheLookup
	WebElement WithdrawalPageHomePageLink;

	public void WithdrawalPagetoHomePage() {
		WithdrawalPageHomePageLink.click();

	}

}
