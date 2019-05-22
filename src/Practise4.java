import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise4 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Applications/Mani/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		
		String heading = driver.getTitle();
		

		
		if (heading.equalsIgnoreCase("Amazon.co.uk:"))
			System.out.println("matched");
		else
			System.out.println("Not matched");
		driver.quit();

	}

}
