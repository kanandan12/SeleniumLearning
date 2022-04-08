package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground HyperLinks Page
		// Using navigate method.
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		// Click Go to Home Page Link
		WebElement homePageLink = driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		
		// Go back to hyper link page
		driver.navigate().back();
		
		// Wait for 2 seconds
		Thread.sleep(2000);
		
		// Find where am supposed to go without clicking me?
		WebElement whereToGo= driver.findElement(By.partialLinkText("Find where"));
		String toGoLink = whereToGo.getAttribute("href");
		System.out.println("This Link is Going to:" +toGoLink);
		
		// Verify am i broken link or Error Link
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		// Get Title 
		String title = driver.getTitle();
		
		// Check the broken link 
		if(title.contains("404")) {
			System.out.println("Link is broken");
		}
		
		// Go back to hyper link page
		driver.navigate().back();
		
		// Wait for 2 seconds
		Thread.sleep(2000);
		
		// Go to home page Intract with same link name
		//homePageLink.click(); 
		// when we are working on the same page we can use the same webelement object 
		// However, we are using the navigate() options and coming back the home page
		// don't use the same webelement otherwise it will throw the exceptions 
		// error message: "stale element reference: element is not attached to the page document" 
		WebElement homePageLink1 = driver.findElement(By.linkText("Go to Home Page"));
		homePageLink1.click();
		
		// Go back to hyper link page
		driver.navigate().back();
		
		// Wait for 2 seconds
		Thread.sleep(2000);
		
		// How many links are avilable in the page
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int nSize = totalLinks.size();
		
		//print total links count
		System.out.println("Print the Total Links available in the page:" +nSize);
		
		/*for (WebElement webElement : totalLinks) {
			System.out.println(totalLinks.);
			
		}*/
		
		

	}

}
