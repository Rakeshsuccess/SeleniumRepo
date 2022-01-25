package day1sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// open chrome browser
	WebDriver cdriver = new ChromeDriver();
			cdriver.get("https://opensource-demo.orangehrmlive.com/");
  //login username password
			
WebElement use=cdriver.findElement(By.id("txtUsername"));
		use.sendKeys("Admin");
	WebElement pass=cdriver.findElement(By.id("txtPassword"));
	pass.sendKeys("admin123");
		WebElement button=cdriver.findElement(By.id("btnLogin"));
  //button.click();
	}

}
