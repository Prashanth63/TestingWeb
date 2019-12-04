package webtesting;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base1Class {

	//Creating a driver object referencing WebDriver interface
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	WebDriver driver;
	 @BeforeMethod
	 public void before1Method() {
		 System.setProperty("webdriver.chrome.driver", "/Users/prashanth/Downloads/chromedriver");

		 new ChromeDriver();
    // driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	
	
}
