package com.projectpractice.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.projectpractice.pageobjects.LoginPage;
//import com.inetbanking_hybridframework.pageobjects.LoginPage;
//import com.inetbanking_hybridframework.utility.Helper;
import com.projectpractice.testbase.TestBase;

public class LoginTC extends TestBase {
	@Test
	public void validateLoginPageTitle() {
		String exp_Title = "Guru99 Bank Home Page";
		String act_Title = driver.getTitle();

		Assert.assertEquals(act_Title, exp_Title);
	}

	@Test(dependsOnMethods = "validateLoginPageTitle()")
	public void validateLoginFunctionality() throws InterruptedException {

		lp.setUserName("mngr587631");
		lp.setpassword("dEmugEs");
		lp.clickOnLoginBtn();

	}

}
