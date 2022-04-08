package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Image Files Page
		driver.get("http://leafground.com/pages/Image.html");
		
		// Click the First Image
		WebElement clickFirstImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		clickFirstImage.click();
		
		// Wait for 3 seconds
		Thread.sleep(3000);
				
		// Image page go back to home page
		// Again clicking the image button and coming back to image page
		WebElement clickImageButton = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a/img"));
		clickImageButton.click();
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		// Find the second image is broken
		WebElement findBrokenImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		
		// Check the natuaralWidth is zero or not
		if(findBrokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is broken");
			
		}
		else
		{
			System.out.println("The image is not broken");
		}
		
		
		//Close the browser
		//driver.close();
		
		
		

	}

}
