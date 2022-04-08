package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepVsSetSpeed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
										
		// Maximize the browser
		driver.manage().window().maximize();
				
		//Navigator Method
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dekling"+Keys.ENTER);
		
		
		//Close Browser
		driver.close();
	
	}

}
