package Tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.DashboardPage;
import Pageobject.LoginPage;

public class Userlogintest {
	 public static void main(String[] args) {


	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


	        LoginPage loginPage = new LoginPage(driver);
	        DashboardPage dashboardPage = new DashboardPage(driver);


	        loginPage.fillUsername("ram.k");
	        loginPage.fillPassword("admin123");
	        loginPage.clickLogin();


	        dashboardPage.verifyDashboard();



	        driver.quit();

	    }
	}

