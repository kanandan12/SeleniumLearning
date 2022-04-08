package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String value;
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Edit webpage
		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(2000);
		
		//Edit Method
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("mobileapptestfb@gmail.com");
		Thread.sleep(2000);
		
		//Append Method
		WebElement appendBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text Added");
		Thread.sleep(2000);
		
		//GetText Method
		WebElement getBox = driver.findElement(By.name("username"));
		value = getBox.getAttribute("value");
		System.out.println(value);
		Thread.sleep(2000);
		
		//Clear Text
		WebElement clearBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearBox.clear();
		Thread.sleep(2000);
		
		WebElement diabledBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean bValue = diabledBox.isEnabled();
		System.out.println(bValue);
	

	}

}
