package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Alert Message page
		driver.get("http://leafground.com/pages/Alert.html");
		
		//Click Plain Alert Box
		WebElement alertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertBox.click();
		Thread.sleep(3000);
		
		//Handling Plain Alert Message
		Alert PlainAlert = driver.switchTo().alert();
		PlainAlert.accept();
		
		//Click Confirm Alert Box
		WebElement confirmBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmBox.click();
		Thread.sleep(3000);
		
		//Handling Confirm Alert Message
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//Prompt Alert Box
		WebElement promptBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promptBox.click();
				
		//Handling Prompt Alert Message
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Testing Message");
		Thread.sleep(3000);
		promptAlert.accept();
		
		//Close Browser
		driver.close();
		
	}

}
