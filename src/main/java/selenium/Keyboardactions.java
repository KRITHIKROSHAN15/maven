package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardactions {
public static void main(String[]arg) {
 	ChromeDriver driver = new ChromeDriver();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                 
 	driver.get("https://www.google.com/intl/en/inputtools/try/"); 
 	
 	 driver.findElement(By.id("demobox")).sendKeys("Hi");
 	
   driver.findElement(By.id("demobox")).sendKeys("Guys");
   driver.findElement(By.id("demobox")).sendKeys(Keys.BACK_SPACE);
   
   
   
}
}