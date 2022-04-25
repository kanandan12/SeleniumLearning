package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFileExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open demo Guru 99 Upload Files Page
		String baseURL = "http://demo.guru99.com/test/upload/";
		driver.get(baseURL);
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30,1));
				
		// Click Choose File button
		WebElement uploadFileButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadfile_0")));
		

        // enter the file path onto the file-selection input field
        uploadFileButton.sendKeys("C:\\Testleaf\\testleaf.xlsx");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        
       

	}

}
