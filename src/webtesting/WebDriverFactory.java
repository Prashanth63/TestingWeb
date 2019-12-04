package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	
	
	static WebDriver browser(String type) {
	WebDriver driver = null;
	
	switch(type) {
	case "Firefox":
	driver=new FirefoxDriver();
	break;
	
	
	case "Chrome":
		driver=new FirefoxDriver();
		break;
		
	
	}
	
	return driver;
	
}
	

}
