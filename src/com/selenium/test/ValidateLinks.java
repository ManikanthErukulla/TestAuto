package com.selenium.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateLinks

{
	public ArrayList<String> validateScreenLinks(WebDriver driver) throws MalformedURLException, IOException
	{
		ArrayList<String> href = new ArrayList<>();
		
		ArrayList<String> respString = new ArrayList<>();
		
		int j = 0;
		
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		
		for (int i=0;i<all_links.size();i++)
		{
			if (all_links.get(i).getAttribute("href")!=null && !all_links.get(i).getAttribute("href").contains("javascript"))
			{
				
				href.add(j, all_links.get(i).getAttribute("href"));
				j++;
			}
		}	
		for (int k =0; k<href.size();k++)
			
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(href.get(k)).openConnection();
			connection.connect();
			String respmsg = connection.getResponseMessage();
			int respcode = connection.getResponseCode();
			connection.disconnect();
		//	System.out.println(href.get(k) + "is " + respmsg + " " + respcode);
			if (respcode > 200)
			{
				respString.add(href.get(k)+" "+respcode+" "+respmsg);
			}	
		}
		
		return respString;
	}

}
