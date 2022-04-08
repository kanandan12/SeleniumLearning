package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set the username
		String username = "admin";
		
		//Set the password
		String password = "admin";
		
		//Passing username and password and URL. for Authentic Pop Up.
		//http://username:password@URL.com
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String title = driver.getTitle();
		System.out.println("The page title is "+title);
		
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println("The test present in page is ==> "+text);
		
		

	}

}
