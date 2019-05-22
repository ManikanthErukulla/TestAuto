import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practise2main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	/*	practise2 obj = new practise2("https://www.toolsqa.com/automation-practice-form/");
		
		obj.radioSetValueByValue("sex","Female");

		obj.radioSetValueByValue("exp", "6");
		
		obj.radioSetValueById("exp-4");
		
		obj.dropDownSelectbyValue("continents", "Europe");
	 
	 */
		
	/*	
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		Select country = new Select(driver.findElement(By.xpath("//*[contains(@class,'vRMGwf oJeWuf')]")));
		
		country.selectByVisibleText("Italiano");
		
	//	Select obj1 = new Select(driver.findElement(By.xpath("//select[@name='"+name+"']")));
		
		*/
			
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://5elementslearning.com/iframe-practice-page.php");
		
		driver.manage().window().maximize();
		
		/*  List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		int count = frame.size();
		
		System.out.println("Count is "+count);
		*/
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@class = 'icon-align-justify']")).click();
		
		WebElement container = driver.findElement(By.xpath("//*[@class = 'phone-menu-wrapper unstyled']"));
		List<WebElement> list1 = container.findElements(By.tagName("a"));
		
		container.findElement(By.xpath("//*[contains(text(),'Training')]//i")).click();
		
	/*	Iterator<WebElement> it = list1.iterator();
		
		while (it.hasNext())
		{
			WebElement it1 = it.next();
			System.out.println(it1.getAttribute("href"));
			if(it1.getAttribute("href").contains("Training"))
			{
				it1.click();
				break;
			}	
					
		} */
		
		driver.switchTo().defaultContent();
	}

}
