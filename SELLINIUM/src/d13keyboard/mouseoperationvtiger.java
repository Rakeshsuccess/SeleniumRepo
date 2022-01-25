package d13keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperationvtiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub.
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://vtiger-demo.it-solutions4you.com/index.php");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	
		// create action class instance and pass webdriver refernce to its costructor
		// driver.findElement(By.id("gallery")).click();
		// Thread.sleep(2000);

		Actions action = new Actions(driver);
		WebElement uname = driver.findElement(By.id("username"));
		//double click an username field
//		
	action.doubleClick(uname).build().perform();
	//cutpst
	uname.sendKeys(Keys.chord(Keys.CONTROL,"x"));
	//undo
	uname.sendKeys(Keys.chord(Keys.CONTROL,"z"));

//		//right click on username field
	
		action.contextClick(uname).build().perform();
		//action.moveToElement(uname).contextClick().build().perform();
	//	Thread.sleep(2000);
	//	action.clickAndHold(uname).build().perform();
	//	action.moveToElement(uname).release().build().perform();
	}

}
