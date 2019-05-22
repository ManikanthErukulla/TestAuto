
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handingFrames 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		
		int j = findFrameNum(driver,By.xpath("//h2[@class = 'heading' and text() = 'Frame2']"));
		
		driver.switchTo().frame(j);
		
		String str = driver.findElement(By.xpath("//h2[@class = 'heading' and text() = 'Frame2']//following-sibling::h2")).getText();
		
		System.out.println(str);
		
		driver.switchTo().defaultContent();
		
		j = findFrameNum(driver,By.xpath("//input[@name = 'First_Name']"));
		
		driver.switchTo().frame(j);
		
		driver.findElement(By.xpath("//input[@name = 'First_Name']")).sendKeys("Manikanth");
		
		driver.findElement(By.xpath("//input[@name = 'Last_Name']")).sendKeys("Erukulla");
		
		Select day = new Select (driver.findElement(By.xpath("//select[@name = 'Birthday_day']")));
		
		List<WebElement> day_options = day.getOptions();
		
		for (WebElement day_options1 : day_options)
		{
			System.out.println(day_options1.getText());
		}
		
		
	}
	
	public static int findFrameNum(WebDriver driver, By by)
	{
		int i;
		
		int numFrames = driver.findElements(By.tagName("iframe")).size();
		
		
		for (i = 0; i < numFrames; i++)
		{
	
			driver.switchTo().frame(i);
			
			int eleCount = driver.findElements(by).size();
			
			if (eleCount > 0)
			{
				break;
			}	
			driver.switchTo().defaultContent();
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
