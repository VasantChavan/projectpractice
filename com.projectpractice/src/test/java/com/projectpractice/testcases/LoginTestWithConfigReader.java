package com.projectpractice.testcases;

import org.testng.annotations.Test;

import com.projectpractice.testbase.TestBase;

public class LoginTestWithConfigReader extends TestBase {
	@Test
	public void verifyLoginFunctionality() {
		lp.setUserName(configReader.getUserId());
		lp.setpassword(configReader.getPassword());
		lp.clickOnLoginBtn();
		
	}

}
