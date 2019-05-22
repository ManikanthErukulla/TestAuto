package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBasics 
{
	
	@BeforeSuite //This is executed first
	public void setup()
	{
		System.out.println("Set up system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("Launch chrome Browser");
	}
	
	@BeforeClass //3
	public void login()
	{
		System.out.println("Login to app");
	}
	
	@BeforeMethod  //4
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	@Test //5
	public void googleTitleTest()
	{
		System.out.println("Title is Google Title");
	}
	
	@AfterMethod //6
	public void logout()
	{
		System.out.println("Log out from app");
		
	}
	
	@AfterClass //7
	public void deleteAllCookies() {
		System.out.println("Cookies deleted");
	}
	
	@AfterTest //8
	public void closeBrowser()
	{
		System.out.println("Browser Closed");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Report Generated");
	}
	
}
