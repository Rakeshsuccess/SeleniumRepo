package day2selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vtiger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1:open browser
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// enter application url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// verify loginpahe title
		System.out.println("login page title=" + driver.getTitle());
		// driver.manage().window().setSize(new Dimension(500,600));
		// clear username and enter user name
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		// clear password field and enter password
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		// verify home page title
		System.out.println("home page title==" + driver.getTitle());

		WebElement out = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// explicite time wait
		wait.until(ExpectedConditions.elementToBeClickable(out));
		out.click();
		driver.close();
	}

}
