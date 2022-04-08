package interviewQuestions;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Open Google webpage and enter Harry Potter in search box.
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Harry Potter"+Keys.ENTER);
		
		//Delay 5 seconds
		Thread.sleep(5000);
		
		TakesScreenshot screenShots = (TakesScreenshot) driver;
		File sourceFile = screenShots.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("./Screenshots/Screen.png"));
		
		//close browser
		driver.close();
		

	}

}
