package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest
{
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
	}
	

	@Test(priority = 1)
	public void getTitleTest()
	{
		String str = driver.getTitle();
		System.out.println("Title is "+str);
	}
	
	@Test(priority = 2)
	public void StoreDisplayTest()
	{
		boolean b = driver.findElement(By.linkText("Store")).isDisplayed();
		if (b == true)
			System.out.println("Store is displayed");
		else
			System.out.println("Store is not displayed");	
	}
	
	@Test(priority = 3)
	public void GmailDisplayTest()
	{
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		if (b == true)
			System.out.println("Gmail is displayed");
		else
			System.out.println("Gmail is not displayed");	
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
	
}
