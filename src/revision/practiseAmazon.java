package revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiseAmazon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		WebElement element = driver.findElement(By.xpath("//a[@class = 'nav-a nav-a-2']//span[contains(text(),'Shop by')]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(element).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@class=\"nav-template nav-flyout-content nav-tpl-itemList\"]//span[contains(text(),\"Amazon Music\")]"))).build().perform();
		
		List<WebElement> element1 = driver.findElements(By.xpath("//div[@class='nav-template nav-subcat nav-tpl-itemList nav-colcount-2 nav-colcount-0']//span[contains(text(),'Stream Music')]//ancestor::div[@class='nav-template nav-subcat nav-tpl-itemList nav-colcount-2 nav-colcount-0']//span[@class = 'nav-text']"));
		
	//	List<WebElement> elements2 = element1.findElements(By.xpath("//span[@class = 'nav-text']"));
		
		for(int i=0;i<element1.size();i++)
		{
			System.out.println(element1.get(i).getText());
		}
		
		
	}

}
