package selenium.SeleniumLearning;


import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWays {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
										
		// Maximize the browser
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Agni");
		
		//Refresh Command
		driver.navigate().refresh();
		
		//Get Current URL
		//driver.get(driver.getCurrentUrl());
		
		//JavaScriptExecutor
		/*JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload()"); //history.go(0)
*/		
		
		// Robot Class F5
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);*/
	
		
		//Close the browser
		//driver.close();
		
	}

}
