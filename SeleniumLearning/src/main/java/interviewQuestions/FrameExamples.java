package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Frame Page
		driver.get("http://leafground.com/pages/frame.html");
		
		// Switch to first frame
		driver.switchTo().frame(0);
		
		// Click First Frame Button page
		WebElement firstFrame = driver.findElement(By.id("Click"));
		firstFrame.click();
		
		// To confirm get text name from the button
		String firstFrameName = driver.findElement(By.id("Click")).getText();
		System.out.println(firstFrameName);
		
		// Switch to default frame
		driver.switchTo().defaultContent();
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		// Switch to second Frame i.e., Nested frame button
		driver.switchTo().frame(1);
		
		// Switch to nested Frame
		driver.switchTo().frame("frame2");
		
		// Click the second frame button
		WebElement secondFrame = driver.findElement(By.id("Click1"));
		secondFrame.click();
		
		// To confirm the second frame button get the text value.
		String secondFrameName = driver.findElement(By.id("Click1")).getText();
		System.out.println(secondFrameName);
		
		// Switch to default frame
		driver.switchTo().defaultContent();
				
		// Get the total number of frames.
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int nSize = totalFrames.size();
		System.out.println("Total number of Frames: " +nSize);
		
		// Close the browser
		driver.close();
		
		
	}

}
