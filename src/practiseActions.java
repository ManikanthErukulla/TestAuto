import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class practiseActions {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		HttpURLConnection huc = null;
		String url = "";
		int respcode = 200;
		
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='nav-tools']//a//span[contains(text(),'Hello,')]"));
		
		a.moveToElement(ele).build().perform();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//*[contains(text(),'Sign')]"));
		signin.click(); 
		
		driver.findElement(By.id("ap_email")).sendKeys("manikanth.e@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("XXXXXX");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='nav-tools']//a//span[contains(text(),'Hello,')]"));
		
		a.moveToElement(ele1).build().perform(); 
		
		
		
	// WebElement container = driver.findElement(By.xpath("//*[@id='nav-al-container']"));
		
		WebElement container = driver.findElement(By.xpath("//*[@id='nav-flyout-yourAccount']"));
		
		
		List<WebElement> links = container.findElements(By.tagName("a"));
		
	//	List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();
		
		System.out.println("No of links in the container with tag a "+links.size());
		
		
		for (int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
			url = it.next().getAttribute("href");
			
			URL link = new URL(url);
			
			huc = (HttpURLConnection)link.openConnection();
			
			huc.setConnectTimeout(2000);
			
			huc.connect();
			respcode = huc.getResponseCode();
			
			System.out.print("Resp code is "+respcode);
			
            if(respcode >= 400){
                System.out.println(" is a broken link");
            }
            else{
                System.out.println(" is a valid link");
            }

			
		}	
		
		
	}

}
