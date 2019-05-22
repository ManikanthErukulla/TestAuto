package com.selenium.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPHP
{
	public WebDriver driver;
	public HeaderClass hc;
	
	SetupClass set = new SetupClass();
	@Test (groups = {"setup"} )
	@Parameters({"browser", "url"})
	
	public void initiateBrowserTest(String browser, String url)
	{
		driver = set.setUp(browser, url);
		String str = driver.getCurrentUrl();
		Assert.assertEquals(str, "https://phptravels.com/demo/");

	}
	
	@Test (dependsOnMethods = {"initiateBrowserTest"} , groups = {"setup"}  )
	public void setupPage() throws InterruptedException
	{
		
		Thread.sleep(3000L);	
		driver.findElement(By.xpath("//button[@id = 'onesignal-popover-cancel-button']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class = 'mc-closeModal']")).click();
	}
	
	@Test (dependsOnMethods = {"setupPage"} , groups = {"setup"} )
	public void testTitle()
	{
		String str = driver.getTitle();
		Assert.assertEquals(str, "PHPTRAVELS | Demo");	
	}
	
	@Test(dependsOnGroups = {"setup"}, groups = {"headertest"})
	public void testMenu()
	{
		hc = new HeaderClass();
		List<WebElement> li = hc.mainmenuValidation(driver);
		Assert.assertEquals(li.get(0).getText(), "DEMO");
		Assert.assertEquals(li.get(1).getText(), "PRICING");
		Assert.assertEquals(li.get(2).getText(), "FEATURES");
		Assert.assertEquals(li.get(3).getText(), "PRODUCT");
		Assert.assertEquals(li.get(4).getText(), "HOSTING");
		Assert.assertEquals(li.get(5).getText(), "SERVICES");
		Assert.assertEquals(li.get(6).getText(), "COMPANY");	
	}
	
	@Test(dependsOnMethods = {"testMenu"}, groups = {"headertest"})
	public void testSubMenu_Features()
	{
		List<WebElement> li = hc.find_Menulist(driver, "Features");
			
		Assert.assertEquals(li.get(0).getText(), "Hotels Module");	
		Assert.assertEquals(li.get(1).getText(), "Flights Module");
		Assert.assertEquals(li.get(2).getText(), "Tours Module");
		Assert.assertEquals(li.get(3).getText(), "Cars Module");
		Assert.assertEquals(li.get(4).getText(), "Offers Module");
		Assert.assertEquals(li.get(5).getText(), "Blog Module");
		Assert.assertEquals(li.get(6).getText(), "Newsletter Module");
		Assert.assertEquals(li.get(7).getText(), "CMS Module");
		
	}
	
	@Test(dependsOnMethods = {"testMenu"}, groups = {"headertest"})
	public void testSubMenu_Product()
	
	{
		List<WebElement> li = hc.find_Menulist(driver, "Product");
			
		Assert.assertEquals(li.get(0).getText(), "Documentation");	
		Assert.assertEquals(li.get(1).getText(), "Features");
		Assert.assertEquals(li.get(2).getText(), "Technology");
		Assert.assertEquals(li.get(3).getText(), "Requirements");
		Assert.assertEquals(li.get(4).getText(), "Changelog");
		Assert.assertEquals(li.get(5).getText(), "Updates");
		Assert.assertEquals(li.get(6).getText(), "Desktop App");
		Assert.assertEquals(li.get(7).getText(), "Mobile App");
		Assert.assertEquals(li.get(8).getText(), "How to Start");	
		
	}
	
	@Test(dependsOnMethods = {"testMenu"}, groups = {"headertest"})
	public void testSubMenu_Hosting()
	{
		List<WebElement> li = hc.find_Menulist(driver, "Hosting");
		
		Assert.assertEquals(li.get(0).getText(), "Shared Hosting");	
		Assert.assertEquals(li.get(1).getText(), "VPS Hosting");
		Assert.assertEquals(li.get(2).getText(), "Dedicated Servers");
	
	}
	
	@Test(dependsOnGroups = {"setup"})
	public void validateScreenLinks() throws MalformedURLException, IOException
	{
		ValidateLinks vl = new ValidateLinks();
		ArrayList<String> respString = vl.validateScreenLinks(driver);
		
		System.out.println("Below links are having the issues::::");
		for (int i=0;i<respString.size();i++)
		{
			System.out.println(respString.get(i));
		}
		

	
	}
	
}
