package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testchrome extends Base1Class{
	
        @Test
	    public void Setmorelaunch() throws InterruptedException {
	        
	        //Using get() method to open a webpage
	        driver.get("http://my.setmore.com");
	        Thread.sleep(10000);
	        //Closing the browser
	        driver.close();
	 
	    }
        
        
        @Test
 public void googlelaunch() throws InterruptedException {
	        
	        //Using get() method to open a webpage
	        driver.get("http://google.com");
	        Thread.sleep(15000);
	        //Closing the browser
	        driver.close();
	 
	    }
        
        
        
	 
	}

