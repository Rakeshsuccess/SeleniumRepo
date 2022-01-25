package d13keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mausesecondop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		WebElement freeBookLink = driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
		mouseHover("target", driver, freeBookLink, null, null);
		Thread.sleep(2000);
		mouseHover("targetWithCords", driver, freeBookLink, 100, 0);
		Thread.sleep(2000);
		mouseHover("cordsOnly", driver, null, -100, 0);
		Thread.sleep(2000);
		mouseHover("targetsecondcords", driver, freeBookLink, 300, 0);
	}

	public static void mouseHover(String hoverOp, WebDriver driver, WebElement element, Integer x, Integer y) {
		Actions action = new Actions(driver);

		if (hoverOp.equalsIgnoreCase("target")) {
			action.moveToElement(element).perform();
		} else if (hoverOp.equalsIgnoreCase("targetWithCords")) {
			action.moveToElement(element, x, y).perform();
		} else {
			action.moveByOffset(x, y).perform();
		}

	}
}