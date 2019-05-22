package com.selenium.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HeaderClass {

	public WebElement container ;
	
	public List<WebElement> mainmenuValidation(WebDriver driver)
	{
		List<WebElement> l =  driver.findElements(By.xpath("//nav[@class = 'main-nav main-nav-holder']//li/child::span"));
		return l;
	}

	public List<WebElement> find_Menulist(WebDriver driver, String element)
	
	{
		Actions a = new Actions(driver);
				
		String xpath1 = "//nav[@class = 'main-nav main-nav-holder']//li//span[text() ='";
		String xpath2 = element;
		String xpath3 = "']//parent::span[@class = 'lvl-1']//following-sibling::div//li//following-sibling::li";
		String xpath4 = "']";
		a.moveToElement(driver.findElement(By.xpath(xpath1+xpath2+xpath4))).build().perform();
		List<WebElement> l =  driver.findElements(By.xpath(xpath1+xpath2+xpath3));
		return l;
	}
	
}
