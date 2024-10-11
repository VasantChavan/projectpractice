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
		 String exp_Title= "Guru99 Bank Home Page";
		 String act_Title= driver.getTitle();

		//Assert.assertEquals(driver.getTitle(), configdatapr.searchKey("lpTitle"));
		
		
		//Note:- For this above method to run properly, we have to comment out @BeforeClass
		//methods, in the TestBase class. This is because if that runs,it runs before this method it logs in to
		//the home page. And then when you perform above test it shows home page title 
		//instead of login page and assertion fails.
		
		//So,just for the login page test cases comment that out,for rest its fine.
	}

	@Test(dependsOnMethods = "validateLoginPageTitle()")
	public void validateLoginFunctionality() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);

		// lp.setUserName("mngr587631");
		// lp.setpassword("dEmugEs");

		//lp.setUserName(configdatapr.getUserName());
		//lp.setpassword(configdatapr.getPassword());

		lp.clickonLoginBtn();
		
		//Helper.HandleAlert(driver);

		// String exptitle= "Guru99 Bank Manager HomePage";
		// String acttitle= driver.getTitle();

		//Assert.assertEquals(driver.getTitle(), configdatapr.searchKey("hmTitle"));
		Thread.sleep(3000);
	}

}
