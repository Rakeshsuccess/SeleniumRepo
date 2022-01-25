package d13keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();

driver.get("https://demo.actitime.com/login.do");
//IMPLICIT WAIT Manage
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement fname=driver.findElement(By.id("username"));
Thread.sleep(2000);

WebElement lname=driver.findElement(By.name("pwd"));
Thread.sleep(2000);

fname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));

Thread.sleep(8000);

fname.sendKeys(Keys.TAB);
lname.sendKeys(Keys.CONTROL,"v");

//move to get url any

driver.get("https://www.flipkart.com/");
//maximise
driver.manage().window().maximize();
//escape flipkart popup
driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
Thread.sleep(2000);
driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
Thread.sleep(2000);
driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
Thread.sleep(2000);



	}

}
