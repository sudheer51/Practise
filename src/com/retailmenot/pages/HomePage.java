package com.retailmenot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
//sss
	WebDriver driver;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void browseCoupons()
	{
		
		driver.findElement(By.linkText("Coupons")).click();
		driver.findElement(By.linkText("Product Deals")).click();
		

	}

}
