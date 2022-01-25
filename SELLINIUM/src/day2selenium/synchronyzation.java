package day2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronyzation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open browser
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.saucedemo.com/");
		
		
		System.out.println("before login title=="+fdriver.getTitle());
		System.out.println("before login url print =="+fdriver.getCurrentUrl());
		
		WebDriverWait wait=new WebDriverWait(fdriver,20);
	//	wait.until(ExpectedConditions.textToBePresentInElementValue(locator, text))
		fdriver.findElement(By.id("user-name")).sendKeys("problem_user");
		fdriver.findElement(By.id("password")).sendKeys("secret_sauce");
		fdriver.findElement(By.id("login-button")).click();
		System.out.println("after logintitle=="+fdriver.getTitle());
		System.out.println("after login url print =="+fdriver.getCurrentUrl());
		
	}

}
