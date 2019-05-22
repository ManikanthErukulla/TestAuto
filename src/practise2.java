import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practise2 
{
	public static WebDriver driver;

	public practise2(String urlPath) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		driver = new ChromeDriver();
		driver.get(urlPath);	
	}
	
	
	/*Radio Selection by Name - Function below is to set a particular value by name attribute 
	 * Note - The name values are same for the radio button element
	 * First Argument - Name attribute's value
	 * Second Argument - The actual value that requires selection
	 */
	public void radioSetValueByValue(String name, String input_Value)
	
	{
		 List<WebElement>list_Value = driver.findElements(By.name(name)); 
		
		for (int i= 0;i<list_Value.size();i++)
		{
			
			if (list_Value.get(i).getAttribute("value").equalsIgnoreCase(input_Value) )
			{	
				list_Value.get(i).click();
				break;
			}
		}
		
	}
	
	/*Radio Selection by Id - Function below is to set a particular value by id attribute
	 * First Argument - Id attribute's value
	 */
	public void radioSetValueById(String id)
	{
	
		driver.findElement(By.id(id)).click();
		
	}
	
	public void setProf(String identifier, String inputProf)
	{
		List<WebElement> listProf = driver.findElements(By.xpath("//input[@name='profession']"));
		
				
		for (int i= 0;i<listProf.size();i++)
		{
			
			if (listProf.get(i).getAttribute("value").equalsIgnoreCase(inputProf) )
			{
				listProf.get(i).click();
				break;
			}
		}
		
	}
 	
	public void dropDownSelectbyValue(String name, String input_Value)
	{
		
		Select obj1 = new Select(driver.findElement(By.xpath("//select[@name='"+name+"']")));
		
	//	int options_Size = obj1.getOptions().size();
		
		obj1.selectByVisibleText(input_Value);
		
	/*	for (int i=0;i<options_Size;i++)
		{
			
			obj1.selectByIndex(i);
			
		} 
	*/
		
		
	}
}

