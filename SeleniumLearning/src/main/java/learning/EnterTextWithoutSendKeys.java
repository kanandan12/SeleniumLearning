package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextWithoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leaf ground Edit web page
		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(2000);
		
		//Java Executor to Enter Text without sendKeys Method
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript ("document.getElementById('email').value='mobileapptestfb@gmail.com'");
		WebElement l = driver.findElement(By.id("email"));
		String s = l.getAttribute("value");
		System.out.println("Value entered is: " + s);
		
		//close the browser
		driver.close();
		
	}

}
