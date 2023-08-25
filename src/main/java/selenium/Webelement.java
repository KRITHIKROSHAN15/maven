package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
 public static void main(String[]aeg) {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://the-internet.herokuapp.com/upload");
	 
	 WebElement uploadfile = driver.findElement(By.id("file-upload"));
	 uploadfile.sendKeys("C:\\Users\\ELCOT\\eclipse-workspace\\practice\\src\\main\\java\\Textfile");
	 
}

	
}
	 
	
	 
	 
	 
