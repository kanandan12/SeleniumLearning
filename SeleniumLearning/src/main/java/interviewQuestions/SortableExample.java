package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Sortaple Page
		// Using navigate method.
		driver.navigate().to("http://leafground.com/pages/sortable.html");
		
		//*[@id="sortable"]/li
		//*[@id="sortable"]/li[1]
		
		// Wait for 3 minutes
		Thread.sleep(3000);
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		WebElement fromElement = element.get(2);
		WebElement toElement = element.get(0);
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();
		
		

	}

}
