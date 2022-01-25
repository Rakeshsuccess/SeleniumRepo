package day2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broperation1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

//wait match
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//clock forgot pass word 
		WebElement forgot = driver.findElement(By.linkText("Forgot your password?"));
		forgot.click();
//Thread.sleep(000);
		System.out.println("*******************");

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(10000);
//forward
		driver.navigate().forward();
		Thread.sleep(10000);
//refresh
		driver.navigate().refresh();
//move to another url
		driver.navigate().to("https://testandquize.com/selenium/testing.html");
	}

}
