package revision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksValidation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		List<WebElement> element = driver.findElements(By.xpath("//a"));
		
		ArrayList<String> hre = new ArrayList<>();
		
		int j  = 0;
		for (int i = 0; i < element.size(); i++)
		{
			if (element.get(i).getAttribute("href")!=null && element.get(i).getAttribute("href")!="null" && element.get(i).getAttribute("href")!=" ")
			{
				hre.add(j, element.get(i).getAttribute("href"));
				j++;
				System.out.println(element.get(i).getAttribute("href"));
			}	
		}
		
	}

}
