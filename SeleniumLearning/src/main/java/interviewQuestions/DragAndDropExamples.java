package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Drag and Drop Page
		driver.get("http://leafground.com/pages/drop.html");
		
		// Finding from and to frames.
		WebElement fromFrame = driver.findElement(By.id("draggable"));
		WebElement toFrame = driver.findElement(By.id("droppable"));
		
		// wait for 3 minutes
		Thread.sleep(3000);
		
		// Mouse movement from to locations.
		Actions actions = new Actions(driver);
		//actions.clickAndHold(fromFrame).moveToElement(toFrame).build().perform();
		
		//Drag and Drop options
		actions.dragAndDrop(fromFrame, toFrame).build().perform();
		
		// Close the browser
		driver.close();

	}

}
