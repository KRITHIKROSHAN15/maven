package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser{
	public static void main(String[]arg) {
		
	 ChromeDriver driver = new ChromeDriver();
	// EdgeDriver driver = new EdgeDriver();
//	 FirefoxDriver drive = new FirefoxDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		
	}
}