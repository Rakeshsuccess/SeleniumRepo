package day2selenium;

//import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class browseroperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open the brawser 
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver idriver = new ChromeDriver();
		// idriver.manage().window().setSize(new Dimension(500,600));

		// open app url
		idriver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// time out implicit wait
		idriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// maximaize
		idriver.manage().window().maximize();
		// minimize
		idriver.manage().window().setSize(new Dimension(500, 600));
		// verify title
		System.out.println("home page title is the app==" + idriver.getTitle());
		// clear username and enter the user name
		// refressh
		idriver.navigate().refresh();
		WebElement user = idriver.findElement(By.id("username"));
		// isdesplayed method
		System.out.println("is visiblity of username==" + user.isDisplayed());
		System.out.println("is enable or not username" + user.isEnabled());

		user.clear();
		user.sendKeys("admin");
		WebElement pass = idriver.findElement(By.id("password"));
		System.out.println("is visiblity of password==" + pass.isDisplayed());
		System.out.println("is enable or not password field" + pass.isEnabled());

		pass.clear();
		pass.sendKeys("Test@123");
		WebElement button = idriver.findElement(By.className("button"));
		button.click();
//minimise
//idriver.manage().window().setSize(new Dimension(100,50));

		WebElement but1 = idriver.findElement(By.className("userName"));
		but1.click();

		idriver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	}

}
