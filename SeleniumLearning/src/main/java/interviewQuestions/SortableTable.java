package selenium.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class SortableTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open The Internet Herokuapp table page
		driver.get("http://the-internet.herokuapp.com/tables");
		
		Thread.sleep(3000);
				
		//WebElement tableName = driver.findElement(By.id("table1"));
		//System.out.println(tableName.getText());
		//System.out.println(tableName.getAttribute("Class"));
		
		WebElement t1LastName = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[1]"));
		t1LastName.click();
		System.out.println(t1LastName.getText());
		String strLastName = t1LastName.getAttribute("class");
		
		if( strLastName.contains("headerSortDown")| strLastName.contains("headerSortUp")) {
			System.out.println("This table is sortable table");
		}
			
			
		
		WebElement t1FirstName = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[2]"));
		System.out.println(t1FirstName.getText());
		System.out.println(t1FirstName.getAttribute("class"));
		
		WebElement t1EmailAddress = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[3]"));
		System.out.println(t1EmailAddress.getText());
		System.out.println(t1EmailAddress.getAttribute("class"));
		
		WebElement t1DueAmount = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]"));
		System.out.println(t1DueAmount.getText());
		System.out.println(t1DueAmount.getAttribute("class"));
		
		WebElement t1WebSite = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[5]"));
		System.out.println(t1WebSite.getText());
		System.out.println(t1WebSite.getAttribute("class"));
		
		WebElement t1Action = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[6]"));
		System.out.println(t1Action.getText());
		System.out.println(t1Action.getAttribute("class"));
		
		//code changed
		
		
		

	}

}
