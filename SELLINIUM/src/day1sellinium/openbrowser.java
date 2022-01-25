package day1sellinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// open chrome browser
		ChromeDriver cdriver = new ChromeDriver();
		// set path for driver excecutable
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		// open chrome browser
		FirefoxDriver ddriver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		// open chrome browser
			// TODO Auto-generated method stub
//set path for driver excecutable
	InternetExplorerDriver iedriver = new InternetExplorerDriver();

	}

}
