import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindows {

	public static void main(String[] args) throws InterruptedException 
	{	
	/*
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		
		
		List<WebElement> eleList = driver.findElements(By.xpath("//*[@id='initialView']/descendant::li"));
		
		for (WebElement list1 : eleList)
		{
			list1.click();
		}
		Thread.sleep(5000L);
		System.out.println("Title is "+driver.getTitle());
		
		Set<String> allWindows = driver.getWindowHandles();
		
	/*	----------------------------------------------------------------------
	  
		//Navigation using iterators
		
		int windowCount = allWindows.size();
		
		Iterator<String> it = allWindows.iterator();
		
		for (int i=0;i< windowCount ; i++)
		{
			String windowID = it.next();
			
			driver.switchTo().window(windowID);
			
			if (driver.getTitle().contains("Terms of Service"))
			{
				List<WebElement> list2 = driver.findElements(By.xpath("//li/span[text()='Terms of Service']/parent::li//ul//li"));
				
				for(WebElement list3 : list2)
				{
					System.out.println(list3.getText());
				}
				break;
			}
		}
		
 -----------------------------------------------------------------*/
	/*
		//Navigation using List
		
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		
		for (int i =0; i<tabs.size();i++)
		{
			driver.switchTo().window(tabs.get(i));
			System.out.println(driver.getTitle());
			
			driver.close();
		}
*/
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		
		List<WebElement> list3 = driver.findElements(By.xpath("//div//p[contains(text(),'By clicking')]//a"));
		
		for (WebElement li : list3)
		{
			li.click();
		}
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<>(allWindows);
		
		for (int i=0; i< al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			if (driver.getTitle().equalsIgnoreCase("Data Policy"))
			{
				driver.findElement(By.xpath("//h2[text() = 'Data Policy']//following-sibling::a[1]")).click();
				System.out.println("Title is "+driver.getTitle());
				
				driver.findElement(By.xpath("//div[contains(text(),'Was this information')]/parent::div/descendant::input[@value = '5']")).click();
			}
			else
				driver.close();
		}
		
		
		
		
	}
		

}
