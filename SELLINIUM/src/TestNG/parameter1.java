package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SWITCHSTATEMENT.SeleniumUtils;

public class parameter1 extends SeleniumUtils {
	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void tcone(String browser) {
		System.out.println(" i have use browsername is " + browser);
	}

	@Parameters({ "browser", "uname" })
	@Test
	public void tctwo(String browser, String uname) {
		System.out.println(" i have use browsername is " + browser);
		System.out.println(" i have use username is " + uname);

	}

	@Parameters({ "browser", "uname", "pwd" })
	@Test
	public void tcthree(String browser, String uname, String pwd) throws InterruptedException {

		System.out.println(" i have use browsername is " + browser);
		System.out.println(" i have use browsername is " + uname);
		System.out.println(" i have use browsername is " + pwd);

		driver = setup(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(4000);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pwd, Keys.ENTER);

	}

}
