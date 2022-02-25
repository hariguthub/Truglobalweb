package truwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\TG1718\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    
	   driver.get("https://www.truglobal.com/");
	   
	   driver.manage().window().maximize();
	   
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	 //  System.out.println(driver.getPageSource());
	   driver.close();
	   
		

	}
}