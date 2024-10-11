package com.projectpractice.testbase;

//import java.io.File;
//import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.projectpractice.pageobjects.LoginPage;

//import com.inetbanking_hybridframework.pageobjects.HomePage;
//import com.inetbanking_hybridframework.pageobjects.LoginPage;
//import com.inetbanking_hybridframework.utility.ConfigDataProvider;
//import com.inetbanking_hybridframework.utility.ExcelDataProvider;
//import com.inetbanking_hybridframework.utility.Helper;

public class TestBase {
	//public static LoginPage lp;
	//public static HomePage hm;
//public static ExcelDataProvider exceldataprovider;
	public static WebDriver driver;

	//public static ConfigDataProvider configdatapr;

	@BeforeSuite
	public void init() {
		//configdatapr = new ConfigDataProvider("config");
		//exceldataprovider= new ExcelDataProvider("inetBankingTestData");
	}

	@BeforeClass
	public void initialisePageObjects() {
		lp = new LoginPage(driver);

		//lp.setUserName(configdatapr.getUserName());
		//lp.setpassword(configdatapr.getPassword());
		
		//lp.setUserName(exceldataprovider.getStringCellData("Login", 1, 0));
		//lp.setpassword(exceldataprovider.getStringCellData("Login", 1, 1));

		//hm = lp.clickonLoginBtn();

	}

	@BeforeTest
	@Parameters("browserName")

	public void setUp(@Optional("Chrome") String browserName) {
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox"))

		{
			driver = new FirefoxDriver();

		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();

		}
		//driver.get(configdatapr.getAppURL());
		driver.manage().window().maximize();

		// driver.get("https://demo.guru99.com/v4/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

	//public static String captureScreenshot(String tname) throws WebDriverException, IOException {
		//String screenshotPath = System.getProperty("user.dir") + "//Screenshots//" + tname + " " + Helper.getTimeStamp()+ ".png";

		//FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(screenshotPath));

		//return screenshotPath;
	//}


}
