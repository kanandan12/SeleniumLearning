package selenium.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSetProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Add your Chrome or Firefox driver
		// in system properties --> Envrionment variables 
		// under system variable --> Select Path and Edit
		// Add your driver location without drivername.exe
		// For example C:\Selenium\drivers
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
				
		//Navigator Method
		driver.navigate().to("https://www.google.com/");

	}

}
