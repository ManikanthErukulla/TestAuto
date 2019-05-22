import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class handlingCalander {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.britishairways.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name = 'Continue']")).click();;
	
		
		driver.findElement(By.xpath("//*[@class='outbound date-selection']")).click();
		
		String input_date = "10-January-2020";
		
		String[] dd_mmm_yyyy = input_date.split("-");
		
		
		int curr_year = Calendar.getInstance().get(Calendar.YEAR);
		
		int input_year = Integer.parseInt(dd_mmm_yyyy[2]);
		
		int year_diff = input_year - curr_year;
		
		
	//	WebElement element = driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']//span")); 		
	//	new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
	//	click(driver, element, 15);
		
		if (year_diff > 0)
		{
		System.out.println("In if condition");	

			for (int j = 0; j < 12; j++)
			{
				Thread.sleep(2000L);
				String[] month_year = driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']")).getText().split(" ");
				if (month_year[1].equalsIgnoreCase(dd_mmm_yyyy[2]))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
				}
			}
		}
		
		for (int i = 0; i< 12; i++)
		{
			Thread.sleep(2000L);
			String calMonth =  driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']//span")).getText();
			
			if (calMonth.equalsIgnoreCase(dd_mmm_yyyy[1]))
				{
					break;
				}
			else
				{
					driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
				}
				
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='datepicker-table-dates']//td//div//span"));
		
		for (WebElement days1 : days)
		{
			if (days1.getText().equalsIgnoreCase(dd_mmm_yyyy[0]))
			{
				days1.click();
				break;
			}
		}
		
	}
	
	public static void click(WebDriver driver, WebElement element, int timeout)
	{
		System.out.println("In func");
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	//	element.click();
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	//	JavascriptExecutor js = (JavascriptExecutor) driver;  
	//	js.executeScript("document.getElementByName('searchEntry').value = 'London'; ");
		element.sendKeys(value);
	}

}
