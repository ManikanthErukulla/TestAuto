
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class practiseActions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/RedHotOffers.aspx");
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
	//	driver.findElement(By.xpath("//a[text() = 'Add-Ons']")).click();
		
		a.moveToElement(driver.findElement(By.xpath("//a[text() = 'Add-Ons']"))).build().perform();
		
		List<WebElement> li = driver.findElements(By.xpath("//a[text() = 'Add-Ons']/following-sibling::ul//li"));
		
		System.out.println("List size is"+li.size());
		Thread.sleep(3000L);
		for (WebElement li1 : li)
		{
			System.out.println("In forloop");
			System.out.println(li1.getText());

	*/
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk");
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-shop']//span[@class = 'nav-line-2']"))).build().perform();
		Thread.sleep(3000L);
		//a.moveToElement(driver.findElement(By.xpath("//span[starts-with(@class, 'nav-hasPanel')]//span[text() = 'Prime Video']"))).build().perform();
		driver.findElement(By.xpath("//span[starts-with(@class, 'nav-hasPanel')]//span[text() = 'Prime Video']")).click();
		

	}

}
