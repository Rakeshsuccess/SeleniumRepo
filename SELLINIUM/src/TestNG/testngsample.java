package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngsample {
	WebDriver driver;

	@Test(priority=1)
	public void loginpage() {
		System.out.println("loginpage start");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// mange implicite wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	@Test(priority=2)
	public void logoutandclose() throws InterruptedException {
		System.out.println("logoutpage");
		WebElement logoutclick = driver.findElement(By.linkText("Logout"));
WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.elementToBeClickable(logoutclick));
System.out.println("page titel after login page=="+driver.getTitle());

		logoutclick.click();
		Thread.sleep(4000);
		driver.close();
	}
}
