import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertshandling {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name = 'cusid']")).sendKeys("123456");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@name = 'submit']")).click();
		
		
		Alert alertPop = driver.switchTo().alert();
		
		String str = alertPop.getText();
		
		System.out.println(str);
		
		
		alertPop.accept();
		
	
		alertPop = driver.switchTo().alert();
		
		String str1 = alertPop.getText();
		
		System.out.println(str1);
		
		alertPop.accept();
	}

}
