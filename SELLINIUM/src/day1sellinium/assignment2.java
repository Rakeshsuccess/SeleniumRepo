package day1sellinium;

//import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lounch the webbrowser
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		// open url facebook
		driver.get("https://wwww.facebook.com");
		// fetching home page title
		String title = driver.getTitle();
		System.out.println("title ==" + title);
		// verify actual title of home page with expectedtitle
		String expectedtitle = "Facebook – log in or sign up";

		if (title.contains("Facebook – log in or sign up")) {
			System.out.println("correct title is opened");
		} else {
			System.out.println("incorrect title is opened");
		}
		System.out.println("verified url");
	}

}
