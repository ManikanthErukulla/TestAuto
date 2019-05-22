import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class webTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Below snippet writes the whole table onto the console
		
	/*	System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> rowsList = driver.findElements(By.xpath("//*[@id='content']//tbody//tr"));
		
		for(WebElement rList : rowsList)
		{
			List<WebElement> rData1 = rList.findElements(By.tagName("th"));
			
			for (WebElement rD1 : rData1)
			{
				System.out.print(rD1.getText());
				System.out.print("\t");
			}
			List<WebElement> rData2 = rList.findElements(By.tagName("td"));
			
			for (WebElement rD2 : rData2)
			{
				System.out.print(rD2.getText());
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		*/
		
		//Using for loops from the website - http://www.software-testing-tutorials-automation.com/2014/05/how-to-extract-table-dataread-table.html
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html"); 
		
		//Get number of rows In table.
		 int Row_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr")).size();
		 System.out.println("Number Of Rows = "+Row_count);
		 
		 //Get number of columns In table.
		 int Col_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size();
		 System.out.println("Number Of Columns = "+Col_count);
		 
		 //divided xpath In three parts to pass Row_count and Col_count values.
		 String first_part = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		 String second_part = "]/td[";
		 String third_part = "]";
		 
		 //Used for loop for number of rows.
		 for (int i=1; i<=Row_count; i++)
		 {
		  //Used for loop for number of columns.
		  for(int j=1; j<=Col_count; j++)
		  {
		   //Prepared final xpath of specific cell as per values of i and j.
		   String final_xpath = first_part+i+second_part+j+third_part;
		   //Will retrieve value from located cell and print It.
		   String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
		   System.out.print(Table_data +"  ");   
		  }
		   System.out.println("");
		   System.out.println("");  
		 } 
		
		
	}

}
