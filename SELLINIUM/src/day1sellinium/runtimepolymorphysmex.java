package day1sellinium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class runtimepolymorphysmex {

	public static void main(String[] args) {
		
		//run time polymorphysm MODATORY  1-INHERITANCE
		//2==UPCASTING
		//3==OVERRIDING
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// open chrome browser
		WebDriver cdriver1 = new ChromeDriver();
		// set path for driver excecutable
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		// open chrome browser
		WebDriver ddriver2 = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		// open chrome browser
		// TODO Auto-generated method stub
		// set path for driver excecutable
		WebDriver driver3 = new InternetExplorerDriver();

	}

}
