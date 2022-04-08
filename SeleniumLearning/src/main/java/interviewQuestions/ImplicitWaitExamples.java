package selenium.SeleniumLearning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Implicitly Wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// Open the php travels login page						
		driver.get("https://phptravels.net/login");
		
		// Enter  with user name
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("user@phptravels.com");
		
		// Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		// Click login button
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginButton.click();
		
		// Click my profile page
		WebElement myProfile = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));
		myProfile.click();
		
		// Close the browser
		//driver.close();
		
		

	}

}
