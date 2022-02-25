package truwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {


	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\TG1718\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.truglobal.com/");
	    driver.manage().window().maximize();
	    
	    Actions action = new Actions(driver);
	    
	    action.moveToElement(driver.findElement(By.linkText("Services"))).build().perform();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Application Engineering")).click();
	    System.out.println(driver.getTitle());
	    
	  //  driver.close();
	    
	}



}
