package com.selenium.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class SetupClass 
{
	public WebDriver driver;

	public WebDriver setUp(String browser, String url)
	{
		if (browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "/Applications/Mani/Work/geckodriver");
	//	driver = new FirefoxeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

	
//	@AfterTest
//	public void tearDown()
//	{
//		driver.manage().deleteAllCookies();
//		driver.quit();
//	}

}
