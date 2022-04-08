package selenium.SeleniumLearning;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Radio Button page
		driver.get("http://leafground.com/pages/Window.html");
		
		// Get Parent Window
		String parentWindow = driver.getWindowHandle();
		
		// First Window Options
		//Click home Button on parent Window
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
		// Get all window information
		Set<String> childWindow = driver.getWindowHandles();
		
		// Switch new Windows
		for (String newWindows : childWindow) {
			
			driver.switchTo().window(newWindows);
						
		}
		
		//Child Window Maximize
		//driver.manage().window().maximize();
		
		// Click Edit box on Child Window		
		WebElement editButton = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editButton.click();
		
		//Close the Child Window
		driver.close();
		
		// Go back to Parent Window
		driver.switchTo().window(parentWindow);
		
		// Second Windows options
		// Find the number of open window
		WebElement openMultipleWindow = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		openMultipleWindow.click();
		
		// Get the number of window size and print
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("No of Windows open: " +numberOfWindows);
		
		// Third Window options
		// Close all window except parent window
		WebElement closeChildWindow = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		closeChildWindow.click();
		
		// Get all window information
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for (String allWindows : allWindowHandles) {
			
			if(!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
			
		}
		
		// Go back to Parent Window
		driver.switchTo().window(parentWindow);
		
		// Fourth Window options
		// Wait for 5 minutes to open child window
		WebElement delayWindowHandles = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		delayWindowHandles.click();
		
		// Wait for 5 minutes to open the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// Get all window information
		Set<String> waitWindowHandles = driver.getWindowHandles();
		
		int nSize = driver.getWindowHandles().size();
		//System.out.println("Print the fourth windows size: "+nSize);
		
		for (String strWaitWindow : waitWindowHandles) {
			
			if(strWaitWindow.equals(strWaitWindow)) {
				driver.switchTo().window(strWaitWindow);
				driver.close();
			}
			
		}
		
		System.out.println("Print the fourth windows size: "+nSize);
		
		// Go back to Parent Window
		driver.switchTo().window(parentWindow);
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		// Close Parent Window
		driver.close();
					

	}

}
