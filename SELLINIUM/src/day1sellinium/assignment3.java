package day1sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lounch the webbrowser
				System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");

				WebDriver driver = new FirefoxDriver();
				// open url facebook
				driver.get("https://demosite.executeautomation.com/Login.html");
				// fetching home page title
		String title=driver.getTitle()	;
		
System.out.println("title=="+driver.getTitle());
System.out.println("length=="+title.length());

/*System.out.println("pagge url=="+driver.getCurrentUrl());
//enter username and password
WebElement usrename=driver.findElement(By.id("input"));

usrename.sendKeys("execution");
WebElement pass=driver.findElement(By.name("text"));
pass.sendKeys("admin");
WebElement login=driver.findElement(By.id("loginButton"));
login.click();*/


	}

}
