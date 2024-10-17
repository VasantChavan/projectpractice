package com.projectpractice.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.projectpractice.testbase.TestBase;

public class LoginTestWithConfigReader extends TestBase {
	@Test
	public void verifyLoginFunctionality() {
		lp.setUserName(configReader.getUserId());
		lp.setpassword(configReader.getPassword());
		lp.clickOnLoginBtn();
		
		//Assert page title after login
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		//Assert element after login
		Assert.assertTrue(driver.findElement(By.xpath("//marquee[text()=\"Welcome To Manager's Page of Guru99 Bank\"]")).isDisplayed());
		
	}

}
