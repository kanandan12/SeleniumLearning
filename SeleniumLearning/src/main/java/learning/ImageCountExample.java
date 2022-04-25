package learning;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImageCountExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
						
		//Open Leafground Home Page
		driver.get("http://leafground.com/home.html");
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		List<WebElement> listWebImageCount = driver.findElements(By.className("wp-categories-title"));
        int i=0;
        
        for (WebElement element : listWebImageCount) {
            i = i+1;
            System.out.println(element.getTagName());
            System.out.println(element.getText());

            String link = element.getAttribute("alt");
            System.out.println(link);
            
        }
        System.out.println("total objects founds " + i);
        
        //Close Browser
        //driver.close();

	}

}
