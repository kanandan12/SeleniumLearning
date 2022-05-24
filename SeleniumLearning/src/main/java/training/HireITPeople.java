package training;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HireITPeople {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Calendar Page
		// Using navigate method.
		driver.get("https://www.hireitpeople.com/resume-database/67-quality-assurance-qa-resumes/68105-qa-automation-engineer-rest-api-tester-resume-nce-confidential");
				
		Thread.sleep(3000);
		//WebElement singlePostBody = driver.findElement(By.className("single-post-body"));
		//String strBodyName = singlePostBody.getText();
		//System.out.println(strBodyName);
		
		//List<WebElement> paragraph = driver.findElements(By.xpath("//html//body//div[3]//section[2]//div//div//div//div//div[2]/Following::p"));
		List<WebElement> webParagraph = driver.findElements(By.xpath("//div[@class='single-post-body']//parent::p"));
		int paragraph = webParagraph.size();
		System.out.println(paragraph);
		
		for (int i=1; i<paragraph; i++) {
			WebElement liElement = driver.findElement(By.xpath("//div[@class='single-post-body']//child::li["+i+"]"));
			String strLiElement = liElement.getText();
			System.out.println(strLiElement);	
		}
		
		//for(int i=1; i<paragraph; i++) {
		//	WebElement liElement = driver.findElement(By.xpath("//div[@class='single-post-body']//child::li["+i+"]"));
		//	strLiElement = liElement.getText();
		//	System.out.println(strLiElement);
		//}
		
		
		
		
		
		
		

	}

}
