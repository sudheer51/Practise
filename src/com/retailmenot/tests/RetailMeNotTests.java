package com.retailmenot.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.retailmenot.pages.HomePage;
import com.retailmenot.pages.ProductDealsPage;
import com.retailmenot.util.Utility;

public class RetailMeNotTests {

	WebDriver driver;
	@BeforeClass
	public void invokeBrowser()
	{
		driver = Utility.getDriverInstance();
		driver.get("http://www.retailmenot.com/");
	}
	@Test
	public void verifyCategoryCount()
	{
		HomePage hPage = new HomePage(driver);
		hPage.browseCoupons();
		ProductDealsPage dealsPage = new ProductDealsPage(driver);
		int actual = dealsPage.jumptoCategory(); 
		int expected=25;
		Assert.assertEquals(actual,expected);
	}
	@AfterClass
	public void quitBrowser()
	{
		Utility.closeBrowser();
	}
}
