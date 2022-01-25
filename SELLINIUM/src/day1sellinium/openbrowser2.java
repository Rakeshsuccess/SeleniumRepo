package day1sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		//creaaate instance
		WebDriver obj1=new ChromeDriver();
		obj1.get("http://demo.actitime.com/login.do");
		System.out.println("pagesource desplayd=="+obj1.getPageSource());
System.out.println("CURRENT UEL DESPLAY=="+obj1.getCurrentUrl());
String title=obj1.getTitle();


//System.out.println(obj1.Length(obj1.getTitle());
//locate data username
/*WebElement username=obj1.findElement(By.id("username"));
username.sendKeys("admin");

WebElement password=obj1.findElement(By.name("pwd"));
password.sendKeys("manager");
WebElement loginbutton=obj1.findElement(By.id("loginButton"));
loginbutton.click();
System.out.println();*/












	}

}
