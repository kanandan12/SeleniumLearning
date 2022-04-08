package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Tool Tips Page
		driver.get("http://leafground.com/pages/tooltip.html");
		
		// get tool tips text value
		WebElement titleName = driver.findElement(By.id("age"));
		String tooltiptext = titleName.getAttribute("title");
		System.out.println(tooltiptext);
		
		// close the browser
		driver.close();
	

	}

}
