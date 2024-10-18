package com.projectpractice.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	WebDriver driver;
	
	public Helper(WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Writing a utility to capture screenshot
	public static void CaptureScreenshot(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/" + screenshotname + ".png");

		FileHandler.copy(src, target);

	}

	// Writing a utility method to handle alert pop up
	public static void HandleAlert(WebDriver driver) {
		if (isAlertPresent(driver)) {
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
		} else {
			System.out.println("Alert is not present on Webpage");

		}
	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			return false;

		}
	}

	// Writing a utility method to handle multiple tab or window
	public static void MultipleWIinOrTabs(WebDriver driver, String title) {
		String parwin = driver.getWindowHandle();
		System.out.println("parwin window id is:" + parwin);

		Set<String> windowids = driver.getWindowHandles();

		for (String ids : windowids) {
			driver.switchTo().window(ids);
			if (driver.getTitle().equals(title)) {
				return;
			}

		}

	}

	// write a utility method to handle select tag dropdown by using index, visible
	// text and value
	public static void selectDropdownByusingVisibleText(WebElement dropdown, String VisibleText) {
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(VisibleText);

	}

	public static void selectDropdownByusingValue(WebElement dropdown, String Value) {
		Select sel = new Select(dropdown);
		sel.selectByValue(Value);

	}

	public static void selectDropdownByusingIndex(WebElement dropdown, int Index) {
		Select sel = new Select(dropdown);
		sel.selectByIndex(Index);

	}

	// write a utility method to get custom date and time
	public static String getTimeStamp() {

		return new SimpleDateFormat("yyyy.MM.dd.h.MM.ss").format(new Date());
	}

	
	// write a utility method to perform mouse hover, drag and drop, double click
	public void MouseHover(WebElement ele) {
		Actions act= new Actions(driver);
		ele =driver.findElement(By.xpath(""));
		act.moveToElement(ele);
	}
		
		public void DragandDrop(WebElement ele1, WebElement ele2) {
			Actions act= new Actions(driver);
			ele1 =driver.findElement(By.xpath(""));
			ele2 =driver.findElement(By.xpath(""));
			act.dragAndDrop(ele1, ele2);
		}
			
			public void DoubleClick(WebElement ele) {
				Actions act= new Actions(driver);
				ele =driver.findElement(By.xpath(""));
				act.contextClick();
		
		
	}
	
	
	
	
	
	
	
	// write a utility method to handle bootstrap dropdown
			 public void selectOptionByVisibleText(By dropdownButtonLocator, By alloptionsLocator, String optionToSelect) {
			       
			        WebElement dropdownButton = driver.findElement(dropdownButtonLocator);
			        dropdownButton.click();

			       
			        List<WebElement> options = driver.findElements(alloptionsLocator);

			     
			        for (WebElement ele : options) {
			            if (ele.getText().equals(optionToSelect)) {
			                ele.click();
			                break;
			            }
			        }
			    }

}
