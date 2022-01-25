package day1sellinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		// input the url
		driver1.get("http://www.google.com");
		// print the page source
		System.out.println("print the pagesouce file==" + driver1.getPageSource());
		// print current title
		String currenttitle = driver1.getTitle();
		System.out.println("current tile==" + driver1.getTitle());
		// print the current url
		System.out.println("print current url==" + driver1.getCurrentUrl());
		// close current page instance
		driver1.close();
	}

}
