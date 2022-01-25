package day1sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//path select 
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver drivera = new ChromeDriver();
		// drivera.get("https:.//demo.actitime.com/login.do");
		// locate the username and password
		// By is predifine class in seleium and all its method is static is also known
		// as "locator"
		// select suuport following locator
		// ID.name,classname.tagname,linktext,partiallinktext,csssector,xpath>>>>>>>>>>>>>>>>>
		// is done
		// enter url
		drivera.get("http://demo.actitime.com/login.do");

		// locate username
		WebElement inputusername = drivera.findElement(By.id("username"));
		// locate usernsme

		inputusername.sendKeys("admin");

		// locate password
		WebElement inputpasssword = drivera.findElement(By.name("pwd"));
		inputpasssword.sendKeys("nager");
		// locate click on button
		WebElement inputloginbutton = drivera.findElement(By.id("loginButton"));
		inputloginbutton.click();
		//drivera.close();
	}

}
