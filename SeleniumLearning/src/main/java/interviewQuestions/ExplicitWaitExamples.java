package selenium.SeleniumLearning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open PHP travel login page
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
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20,1));
				
		// Click my profile link
		WebElement myProfile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a")));
		myProfile.click();
		
		//Close the browser
		driver.close();
					
	}

}
