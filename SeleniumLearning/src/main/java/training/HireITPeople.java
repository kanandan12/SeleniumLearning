package training;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HireITPeople {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
				
		//Create File In Desktop  
		String TestFile = "C:\\Users\\koush\\OneDrive\\Desktop\\Temp.txt";
		File FC = new File(TestFile);//Created object of java File class.
		FC.createNewFile();//Create file.
		  
		//Writing In to file.
		//Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);
		
		//Open Hire IT People Web Page
		// Using get method.
		//driver.get("https://www.hireitpeople.com/resume-database/67-quality-assurance-qa-resumes/68105-qa-automation-engineer-rest-api-tester-resume-nce-confidential");
		driver.get("https://www.hireitpeople.com/resume-database/82-quality-assurance-resumes/69195-api-test-engineer-resume");
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		List<WebElement> childParagraph = driver.findElements(By.xpath("//*[@class='single-post-body']//parent::p"));
		int childPara = childParagraph.size();
		System.out.println("Total Web Paragraph: "+childPara);
				
		for(int i=1; i<=childPara; i++){
			
			WebElement childParagraphElement = driver.findElement(By.xpath("//*[@class='single-post-body']/p["+i+"]"));
			String strPragraphElement = i+": "+childParagraphElement.getText();
			System.out.println(strPragraphElement);	
			BW.write(strPragraphElement); //Writing In To File.
			BW.newLine();//To write next string on new line.
		}
		
		System.out.println("\n-------------------------------------------------------------\n");
		BW.write("\n-------------------------------------------------------------\n"); //Writing In To File.
		BW.newLine();//To write next string on new line.
		
		List<WebElement> childULParagraph = driver.findElements(By.xpath("//*[@class='single-post-body']//parent::ul"));
		int childUL = childULParagraph.size();
		System.out.println("Child UL Paragraph: "+childUL);
		
		for(int i=1; i<=childUL; i++){
			List<WebElement> LiElement = driver.findElements(By.xpath("//*[@class='single-post-body']/ul["+i+"]/li"));
			System.out.println(LiElement.size());
			
			for (int j = 1; j<=LiElement.size(); j++) {
				WebElement childliElement = driver.findElement(By.xpath("//*[@class='single-post-body']/ul["+i+"]/li["+j+"]"));
				String liname = j+": "+childliElement.getText();
				System.out.println(liname);
				
				BW.write(liname); //Writing In To File.
				BW.newLine();//To write next string on new line.
			}	
			
		}
				
		//close Browser
		//driver.close();
		BW.write("-----------------------------------------------------------------------\n"); //Writing In To File.
		BW.close();
		

	}

}
