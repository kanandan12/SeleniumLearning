package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
												
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Navigator Method
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Game of Thrones");
		
		Thread.sleep(5000);
		List<WebElement> searchSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		for (WebElement webElement : searchSuggestion) {
			String text = webElement.getText();
			System.out.println(text);
			
			if( text.contains("books")) {
				webElement.click();
				break;
				
			}
		}
				
				
		//Close Browser
		driver.close();

	}

}
