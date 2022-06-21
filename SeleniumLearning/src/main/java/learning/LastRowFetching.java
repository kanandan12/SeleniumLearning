package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastRowFetching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Money Rediff Daily Group A web page 
		driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
		
		//No.of rows 
        List<WebElement>  rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        int totalRows = rows.size();
        System.out.println("No of rows are: " +totalRows);
        
        //No. of Columns
        List<WebElement> cols = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
        int totalColumn = cols.size();
        System.out.println("No of columns are: "+totalColumn);
        
        String Lastrow="";
        
        // Fetch the Last row data.
        for(int col=1; col<=totalColumn; col++) {
        	WebElement lastRowFetch = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+totalRows+"]/td["+col+"]"));
            Lastrow = Lastrow + "\t" + lastRowFetch.getText();
		}
        
        System.out.println("Last Row are: "+Lastrow);
        
        // Close Browser
        driver.close();
						

	}

}
