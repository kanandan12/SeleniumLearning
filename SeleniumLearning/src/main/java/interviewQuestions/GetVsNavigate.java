package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Get Method
		/*driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Agni");*/
		
		//Navigator Method
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HarryPotter");
		//driver.navigate().back();
		

	}

}
