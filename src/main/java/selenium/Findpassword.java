package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findpassword {
  public static void main(String[]arg) {
	  ChromeDriver driver = new ChromeDriver();

	  
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.manage().window().minimize();
	 WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
	 
	 username.sendKeys("Admin");
	 
	 WebElement password =driver .findElement(By.cssSelector("input[placeholder='Password']"));
	 
	 password.sendKeys("admin123");
	 
	 WebElement login=driver .findElement(By.xpath("//button[normalize-space()='Login']"));
	 
	 login.click();
	  
		

	  
	  
	  
}
}