package truwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\TG1718\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice");
	    driver.manage().window().maximize();
	    
	    
	driver.findElement(By.xpath("//*[@value='radio2']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@value='radio1']")).isSelected());
	
	driver.findElement(By.id("autocomplete")).sendKeys("India");
	
	
	Select dropd = new Select(driver.findElement(By.id("dropdown-class-example")));
	dropd.selectByVisibleText("Option2");
	
	driver.findElement(By.id("checkBoxOption3")).click();
	
	driver.findElement(By.xpath("//*[@id='name']")).sendKeys("truglobal");

	}

}
//*[@id="radio-btn-example"]/fieldset/label[1]/input

//*[@value='radio1']