package selenium.SeleniumLearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilesExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Upload Files Page
		driver.get("http://leafground.com/pages/upload.html");
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20,1));
				
		// Click Choose File button
		WebElement uploadFileButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("filename")));
		uploadFileButton.click();
				
//		WebElement a = driver.findElement(By.name("filename"));
//		a.click();
		/*Actions action = new Actions(driver);
		// Perform click-and-hold action on the element
		action.click().build().perform();
		//clickAndHold(a).build().perform();
		a.click();*/
		
		
		
		// Paste the file loaction 
		String fileName = "C:\\Users\\kamal\\Downloads\\testleaf.xlsx";
		
		//StringSelection is used to convert string to plain text 
		StringSelection selection = new StringSelection(fileName);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		 
	}

}
