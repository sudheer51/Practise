package com.retailmenot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDealsPage {

	WebDriver driver;
	public ProductDealsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public int jumptoCategory()
	{
		//clicking on Electronics Link
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//section[@id='Electronics']/div/div"));
		int count = list.size();
		return count;
	
	}
}
