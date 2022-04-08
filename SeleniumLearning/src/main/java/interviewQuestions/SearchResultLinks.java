package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Open Google webpage and enter Harry Potter in search box.
		driver.get("https://google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Harry Potter \n");

		//Delay 5 seconds
		Thread.sleep(5000);
		
		//Collect all the link in the search page
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		
		// Print all the urls 
		for(WebElement links: totalLinks) {
			
			System.out.println(links.getAttribute("href"));
			
			
		}
			
		// Close browser
		driver.close();
		
	}

}
