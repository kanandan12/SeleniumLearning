package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Calendar Page
		// Using navigate method.
		driver.navigate().to("http://leafground.com/pages/Calendar.html");
		
		Thread.sleep(2000);
		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		//dateTextBox.sendKeys("12/10/2021"+Keys.ENTER);
		dateTextBox.click();
		
		Thread.sleep(2000);
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		Thread.sleep(2000);
		WebElement dateToSelect = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateToSelect.click();
		

	}

}
