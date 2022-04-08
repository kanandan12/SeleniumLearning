package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Radio Button page
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement langCheckBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		langCheckBox.click();
		
		WebElement confirmCheckBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		boolean confirmstatus = confirmCheckBox.isSelected();
		System.out.println(confirmstatus);
		
		WebElement deselectCheckBox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		
		if(deselectCheckBox1.isSelected()) {
			deselectCheckBox1.click();
		}
		
		WebElement deselectCheckBox2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		
		if(deselectCheckBox2.isSelected()) {
			deselectCheckBox2.click();
		}
		
		
		

	}

}
