package d6Propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeappcontainceuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();
		// find out name user name and password
		WebElement username = driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:first-child>td:last-child"));
		String name = username.getText();
		//or
//	System.out.println("name=="+name);
//	String[] splitname=name.split(" ");
//	System.out.println("array first [0]="+splitname[0]);
//	System.out.println("array 2nd [1]="+splitname[1]);
//   
//	System.out.println(username.getText().split(" ")[1]);
		//or
		String n = username.getText().split(" ")[1];
		System.out.println("n=" + n);
		// enter the username its remaining username

		driver.findElement(By.id("username")).sendKeys(n);
//find out password in htmlcode

		WebElement pass = driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(2)>td"));
		String password = pass.getText();

		System.out.println("password=>>>>>>>>>>" + password);
		// split the 2 words and use saperate word

		String p = pass.getText().split(" ")[1];
		// enter the password

		driver.findElement(By.name("pwd")).sendKeys(p);
		// click on checbox
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		// click on logib button
		driver.findElement(By.id("loginButton")).click();

	}

}
