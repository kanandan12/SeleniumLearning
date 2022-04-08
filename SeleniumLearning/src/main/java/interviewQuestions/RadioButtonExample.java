package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Radio Button page
		driver.get("http://leafground.com/pages/radio.html");
		
		// Select Yes No Radio Button
		WebElement yesButton = driver.findElement(By.xpath("//*[@id='first']/label[1]"));
		yesButton.click();
		
		// Find Default Section Radio Button
		WebElement unCheckedButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
		boolean status1 = unCheckedButton.isSelected();
		
		WebElement checkedButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		boolean status2 = checkedButton.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		// Select age group radio button
		WebElement above40 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[3]"));
		above40.click();
	
	}

}
