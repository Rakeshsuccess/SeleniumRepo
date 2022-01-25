package day1sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iebrowseropen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		// open chrome browser
			// TODO Auto-generated method stub
//set path for driver excecutable
		InternetExplorerDriver iedriver = new InternetExplorerDriver();
	iedriver.get("https://opensource-demo.orangehrmlive.com/");
	//iedriver.findElement(By.id(id))
	Thread.sleep(2000);
	iedriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	iedriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	iedriver.findElement(By.id("btnLogin")).click();
}

}
