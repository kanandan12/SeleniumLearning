package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Auto Complete Page
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		//Input the Text Box
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("S");
		
		//Wait for 3 seconds
		Thread.sleep(3000);
		
		// Get all the data from list box
		List<WebElement> listbox = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		//System.out.println(listbox.size());
		
		// find the web services in the list box
		for (WebElement webElement : listbox) {
			//System.out.println(webElement.getText());
			if(webElement.getText().equals("Rest API")) {
				webElement.click();
				break;
			}
		}
		
		// Close the browser
		driver.close();
		

	}

}
