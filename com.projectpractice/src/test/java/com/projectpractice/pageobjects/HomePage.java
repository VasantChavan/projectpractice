package com.projectpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomerLink;

	@FindBy(xpath = "//a[text()='Edit Customer']")
	WebElement editCustomerLink;

	@FindBy(xpath = "//a[text()='Delete Customer']")
	WebElement deleteCustomerLink;

	@FindBy(xpath = "//a[text()='New Account']")
	WebElement newAccountLink;

	@FindBy(xpath = "//a[text()='Edit Account']")
	WebElement editAccountLink;

	@FindBy(xpath = "//a[text()='Delete Account']")
	WebElement deleteAccountLink;

	@FindBy(xpath = "//a[text()='Deposit']")
	WebElement DepositLink;

	@FindBy(xpath = "//a[text()='Withdrawal']")
	WebElement WithdrawalLink;

	@FindBy(xpath = "//a[text()='Fund Transfer']")
	WebElement FundTransferLink;

	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement ChangePasswordLink;

	@FindBy(xpath = "//a[text()='Balance Enquiry']")
	WebElement BalanceEnquiryLink;

	@FindBy(xpath = "//a[text()='Mini Statement']")
	WebElement MiniStatementLink;

	@FindBy(xpath = "//a[text()='Customised Statement']")
	WebElement CustomisedStatementLink;

	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logoutLink;

	public NewCustomerPage clickonNewCustomerLink() {
		newCustomerLink.click();
		return new NewCustomerPage(driver);
	}

	public EditCustomerPage clickonEditCustomerLink() {
		editCustomerLink.click();
		return new EditCustomerPage(driver);
	}

	public DeleteCustomerPage clickonDeleteCustomerLink() {
		deleteCustomerLink.click();
		return new DeleteCustomerPage(driver);
	}

	public NewAccountPage clickonnewAccountLink() {
		newAccountLink.click();
		return new NewAccountPage(driver);
	}

	public EditAccountPage clickoneditAccountLink() {
		editAccountLink.click();
		return new EditAccountPage(driver);
	}

	public DeleteAccountPage clickondeleteAccountLink() {
		deleteAccountLink.click();
		return new DeleteAccountPage(driver);
	}

	public DepositPage clickonDepositLink() {
		DepositLink.click();
		return new DepositPage(driver);
	}

	public WithdrawalPage clickonWithdrawalLink() {
		WithdrawalLink.click();
		return new WithdrawalPage(driver);
	}

	public FundTransferPage clickonFundTransferLink() {
		FundTransferLink.click();
		return new FundTransferPage(driver);
	}

	public ChangePasswordPage clickonChangePasswordLink() {
		ChangePasswordLink.click();
		return new ChangePasswordPage(driver);
	}

	public BalanceEnquiryPage clickonBalanceEnquiryLink() {
		BalanceEnquiryLink.click();
		return new BalanceEnquiryPage(driver);
	}

	public MiniStatementPage clickonMiniStatementLink() {
		MiniStatementLink.click();
		return new MiniStatementPage(driver);
	}

	public CustomisedStatementPage clickonCustomisedStatementPageLink() {
		CustomisedStatementLink.click();
		return new CustomisedStatementPage(driver);
	}

	public void clickOnLogoutlink() {
		logoutLink.click();
	}

}
