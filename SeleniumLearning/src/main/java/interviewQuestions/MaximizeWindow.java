package selenium.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Chrome Options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.navigate().to("https://www.google.com/");
												
		// Maximize the browser
		//driver.manage().window().maximize();
		
		// Set Size Method
		/*Dimension dimension = new Dimension(1920,1080);
		
		driver.manage().window().setSize(dimension);*/
		
		//Close Browser
		//driver.close();
		
	}

}
