package day2selenium;

import java.util.concurrent.TimeUnit;
//import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//browser open 
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// lounch url
		driver.get("https://demo.actitime.com/login.do");
		// get page title
		System.out.println("grt actual page title" + driver.getTitle());
		// implicit time wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// enter username and password
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
//explicite time wait

		System.out.println("get after the login page then verify home page title" + driver.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		logoutLink.click();

	}

}
