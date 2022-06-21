package learning;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotRobot {
	
	public void captureScreenshot(String testcase_testStep_ID) throws IOException, AWTException
	{
		try{
			
			// Instantiate the Robot Class
			Robot robotObject = new Robot();
			
			// Fetch the Details of the Screen Size
			Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			
			// Take the Snapshot of the Screen
			BufferedImage tmp = robotObject.createScreenCapture(screenSize); 
			
			// Provide the destination details to copy the screenshot
			String path="./Screenshots/"+testcase_testStep_ID+System.currentTimeMillis()+".jpg";
			
			// To copy source image in to destination path
			ImageIO.write(tmp, "jpg",new File(path));
			
		}catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			//return "";
		}
				 
				           
	}

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Open Google webpage and enter Harry Potter in search box.
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Harry Potter"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		new CaptureScreenshotRobot().captureScreenshot("TC_001_TS_002_");
		
		//close browser
		driver.close();

	}

}
