package com.projectpractice.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.projectpractice.pageobjects.LoginPage;
import com.projectpractice.utility.ConfigReader;

public class TestBase {
	
	public static LoginPage lp;	
	public static WebDriver driver;
	
	public static ConfigReader configReader;
	
	@BeforeSuite
	public void init()
	{
		configReader=new ConfigReader("./Config/prop.properties");
	}

	@BeforeClass
	public void initialisePageObjects() {
		lp = new LoginPage(driver);		
	}

	
	@Parameters("browserName")
	@BeforeTest

	public void setUp(@Optional("Chrome") String browserName) {
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox"))

		{
			driver = new FirefoxDriver();

		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();

		}
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

}
