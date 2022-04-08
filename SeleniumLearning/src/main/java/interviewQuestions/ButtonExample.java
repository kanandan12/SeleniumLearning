package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Button webpage
		driver.get("http://leafground.com/pages/Button.html");
				
		//Get Position Button
		WebElement getPositionButton = driver.findElement(By.id("position"));
		
		Point xyPoint = getPositionButton.getLocation();
		int xvalue = xyPoint.getX();
		int yvalue = xyPoint.getY();
		System.out.println("X Value:" + xvalue +"Y Value:" +yvalue);
				
		//Find Button Colors.
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Color Button"+color);
				
		//Find Button Size
		WebElement sizeButton = driver.findElement(By.id("size"));
		int nHight = sizeButton.getSize().getHeight();
		int nWidth = sizeButton.getSize().getWidth();
		System.out.println("Button Height Value: " +nHight+ "Button Width Value: " +nWidth);
				
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
				
		
	}

}
