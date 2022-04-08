package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Selectable Page
		driver.get("http://leafground.com/pages/selectable.html");
		
		// get Selectable options
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int nSize = selectable.size();
		System.out.println("Numnber of Count: " +nSize);
		
		// Action class with Key down method
		/*Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0))
									 .click(selectable.get(1))
									 .click(selectable.get(2)).build().perform();*/
		
		
		// Action class with Click and hold method
		Actions actions = new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
					
		//Close the browser
		driver.close();
	

	}

}
