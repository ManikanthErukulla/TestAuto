import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	/*	
	 * -------------------------------
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		
		
		//Below both XPATH objective is same but using different axes
		//Objective - find the siblings of SELENIUM
		
		// List<WebElement> dataset = driver.findElements(By.xpath("//h2[contains(text(),'popular courses')]/following::div[1]/following-sibling::div[@class ='rt-grid-2 rt-omega']"));
		
		
		 List<WebElement> dataset = driver.findElements(By.xpath("//h4/a[contains(text(),'SELENIUM')]/ancestor::div[@class = 'rt-grid-2 rt-omega']/following-sibling::div"));
		
		for (int i=0;i<dataset.size();i++)
		{
			System.out.println(dataset.get(i).getText());
		}
		
		driver.quit();
		*----------------------------------
		*/

		/*
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		
		//To find all the childs in the header
		driver.findElement(By.xpath("//ul[@class = 'main-menu__ul']/child::li"));
		
		//To find the "Try free" button
		
		driver.findElement(By.xpath("//ul[@class = 'main-menu__ul']/child::li/ancestor::div[@class='header__container']/a[contains(text(),'Try')]"));
		
	*/
		
/*-----------------------------------------------------
		//Below snippet sends the text 'testing' to google search text box and clicks on the 'testing circle' in the drop down
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("testing");
		Thread.sleep(2000L);
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']/child::li[@role='presentation']"));
		
		System.out.println("list size is"+list1.size());
		
		for(int i =0; i<list1.size();i++)
		{
			String str = list1.get(i).getText();
			
			if (str.equalsIgnoreCase("testing circle"))
			{
				list1.get(i).click();
				break;
			}
		}
		driver.quit();
---------------------------------------------------------------------	
	*/	
		
		
		
	}

}
