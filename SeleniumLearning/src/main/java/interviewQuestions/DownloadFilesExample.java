package selenium.SeleniumLearning;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Download Files Page
		driver.get("http://leafground.com/pages/download.html");
		
		// Find and click the download link files
		WebElement downloadExcelFile = driver.findElement(By.linkText("Download Excel"));
		downloadExcelFile.click();
		
		// Wait for 3 seconds
		Thread.sleep(300);
		
		//Find the download files
		File fileloaction = new File("C:\\Users\\kamal\\Downloads");
		File[] TotalFiles = fileloaction.listFiles();
		
		for (File file : TotalFiles) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("Excel File downloaded");
				break;
			}
		}
		
		//Close the browser
		driver.close();
		
		

	}

}
