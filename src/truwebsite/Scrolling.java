package truwebsite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\TG1718\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    
	   driver.get("https://www.truglobal.com/");
	   
	   driver.manage().window().maximize();
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,500)");
	   
	   driver.close();

	}

}
