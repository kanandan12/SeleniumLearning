package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		// Maximize the browser
		driver.manage().window().maximize();
				
		//Open Leafground webpage and enter Harry Potter in search box.
		driver.get("http://leafground.com/pages/Link.html");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		

	}

}
