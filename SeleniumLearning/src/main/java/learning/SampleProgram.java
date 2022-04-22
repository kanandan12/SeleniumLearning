package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Google Frame Page
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		// Switch to first frame
		driver.switchTo().frame(0);
		
		// Click First Frame No Thanks Button page 
		WebElement firstFrame = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button"));
		String firstFrameName = firstFrame.getText();
		System.out.println(firstFrameName); 
		firstFrame.click();
		 
		
		/*
		 * // Click First Frame Sign in Button page WebElement firstFrame =
		 * driver.findElement(By.linkText("Sign in")); String firstFrameName =
		 * firstFrame.getText(); System.out.println(firstFrameName); firstFrame.click();
		 */
		
		// Switch to default frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Harry Potter");
		search.click();
		
		//Close Browser
		driver.close();
		
	}

}
