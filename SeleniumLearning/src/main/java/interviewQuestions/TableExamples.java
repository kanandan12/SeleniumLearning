package selenium.SeleniumLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground HyperLinks Page
		// Using navigate method.
		driver.navigate().to("http://leafground.com/pages/table.html");
		
		// Find total number of columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of Columns:" +columnCount);
		
		// Find total number of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number Of Rows: " +rowCount);
		
		// Get the progress value of 'Learn to interact with Elements
		WebElement getPercent = driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String getPercentageValue=getPercent.getText();
		System.out.println("Get the Progress Value: "+getPercentageValue);
		
		/*//checking the 80% click
		WebElement eightypercent = driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[2]/input"));
		eightypercent.click();*/
						
		
		// Check the vital task for the least completed progress.
        List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
        
        List<Integer> numberList = new ArrayList<Integer>();
               
        for (WebElement webElement : allProgress) {
        	String individualValue = webElement.getText().replace("%", "");
        	numberList.add(Integer.parseInt(individualValue));
		}
        
        System.out.println("Print all Progress values: "+numberList);
        
        int samllValue = Collections.min(numberList);
        System.out.println("Print Small value: " +samllValue);
        
        String smallValueString = Integer.toString(samllValue)+"%";
        System.out.println("Convert Integer to String: " +smallValueString);
        
        //td[normalize-space()='30%']//following::td[1]/input
        String finalXpath = "//td[normalize-space()=" + "\"" + smallValueString + "\"" + "]//following::td[1]/input";
        System.out.println(finalXpath);
        
        WebElement vitalTask = driver.findElement(By.xpath(finalXpath));
        vitalTask.click();
        
        /*String Week2 = "//td[normalize-space()=" + "\"" + smallValueString + "\"" + "]//following::td[3]";
        WebElement weekPath = driver.findElement(By.xpath(Week2));
        System.out.println(weekPath.getText());*/
        
        //WebElement thirtyPerenct = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input"));
        //thirtyPerenct.click();
        
        
        
        

	}

}
