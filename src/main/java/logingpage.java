import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logingpage {
	public static void main(String[]arg) {
	 
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.seleniumlabs.in/how-to-automate-login-functionality-using-selenium-webdriver/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.name("your-name")).sendKeys("krishnaraj");
	 driver.findElement(By.name("your-email")).sendKeys("vijaykavitha420@gmail.com");
	 driver.findElement(By.name("your-subject")).sendKeys("comming soon");
	 driver.findElement(By.linkText("div[id='wpcf7-f5-o1'] input[placeholder='Contact Number']")).sendKeys("6382564802");
	 driver.findElement(By.tagName("textarea")).sendKeys("hi");
	 	 	 			
	 			
 } 			
 }
