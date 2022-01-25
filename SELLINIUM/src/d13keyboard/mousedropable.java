package d13keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousedropable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		// Switch to frame
		driver.switchTo().frame(0);
		// S1: Create an instance of Actions class and pass webdriver instance as an
		// argument to its constructor
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
//call drag and drop action() class
		action.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		// call dragAndDropBy() of actions class
//		action.dragAndDropBy(drag, 150, 50).build().perform();
//		Thread.sleep(2000);
//
//		action.dragAndDropBy(drag, 20, -100).build().perform();

		System.out.println("done");
	}

}
