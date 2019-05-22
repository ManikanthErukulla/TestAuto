import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nasdaq.com/markets/indices/major-indices.aspx"); 
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		
		driver.findElement(By.xpath("//a[@id = 'cookieConsentOK']")).click();
		
		//Fetching / Printing the table header and calculating the columns size
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class = 'USMN_MarketIndices']//tr//th"));
		
		for (WebElement cols1 : cols)
		{
			System.out.print(cols1.getText()+"\t");
			
		}
		int NumCols = cols.size();
		
		//Fetching all the rows and calculating the rows size
		
		int NumRows = driver.findElements(By.xpath("//table[@class = 'USMN_MarketIndices']//tbody//tr")).size();
		
		String X = "//table[@class = 'USMN_MarketIndices']//tbody//tr[";
		String Y = "]//td[";
		String Z = "]";	
	
	//	Printing the rows to the console
		
		System.out.println("\n\n");
		
		for (int i=1; i<=NumRows; i++)
		{
			for (int j=1; j<=NumCols; j++)
			{
				String xpath1 = X+i+Y+j+Z;
				WebElement td = driver.findElement(By.xpath(xpath1));
				System.out.print(td.getText()+"\t");	
			}
			System.out.println("\n\n");
		} 	
		
		
		/*Printing all the rows to the console using another method 
		 -----------------------------------------------------------
		System.out.println("");
		
		List<WebElement> rList = driver.findElements(By.xpath("//table[@class = 'USMN_MarketIndices']//tbody//tr"));
		
		for(WebElement prRow : rList)
		{
			List<WebElement> prRow1 = prRow.findElements(By.tagName("td"));
			
			for(WebElement prRow2: prRow1)
			{
				System.out.print(prRow2.getText()+"\t");
			}
			System.out.println("");
		} */
		
	}

}
