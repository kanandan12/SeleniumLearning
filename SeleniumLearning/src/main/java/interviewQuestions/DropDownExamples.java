package selenium.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground DropDown Button page
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//Select first Drop Down button
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		
		//Select by Index value
		Select select1 = new Select(dropDown1);
		select1.selectByIndex(1);
		Thread.sleep(3000);
		
		
		//Select Second Drop Down button
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		
		//Select by Text value
		Select select2 = new Select(dropDown2);
		select2.selectByVisibleText("Appium");
		Thread.sleep(3000);
		
		//Select Third Drop Down button
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		
		//Select by Text value
		Select select3 = new Select(dropDown3);
		select3.selectByValue("3");
		Thread.sleep(3000);
		
		//Get the number of drop down options
		WebElement dropDown4 = driver.findElement(By.className("dropdown"));
		
		//Get the number of dropdown options
		Select select4 = new Select(dropDown4);
		List<WebElement> listofOptions = select4.getOptions();
		int nSize = listofOptions.size();
		System.out.println("Number of Element in Drop Down box: " +nSize);
		Thread.sleep(3000);
		
		//Use SendKeys to select the dropdown options
		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");
		Thread.sleep(3000);
		
		//Multiselect dropdown options
		WebElement multidropdown1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		//*[@id="contentblock"]/section/div[6]/select
		
		Select multiSelectBox = new Select(multidropdown1);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
	

	}

}
