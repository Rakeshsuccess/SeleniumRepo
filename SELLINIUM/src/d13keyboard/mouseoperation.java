package d13keyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		// switch to frame
		// driver.switchTo().frame(0);

		// create action class instance and pass webdriver refernce to its costructor
		// driver.findElement(By.id("gallery")).click();
		// Thread.sleep(2000);

		Actions action = new Actions(driver);

		// switch to frame
		// driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));

		// Thread.sleep(2000);

		WebElement drag1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement drag2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		WebElement drag3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		WebElement drag4 = driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));

		WebElement drop = driver.findElement(By.id("trash"));
		// [class='ui-widget-content ui-state-default ui-droppable']
		Thread.sleep(2000);
		action.dragAndDrop(drag1, drop).build().perform();
		Thread.sleep(2000);

		action.dragAndDrop(drag2, drop).build().perform();
		Thread.sleep(2000);

		action.dragAndDrop(drag3, drop).build().perform();
		Thread.sleep(2000);

		action.dragAndDrop(drag4, drop).build().perform();

		// Thread.sleep(2000);

//		for(int i=0;i<drag1.size();i++) {
//			action.dragAndDrop(get(i), drop)
//		}
//action.dragAndDrop(drag1, drop).build().perform();
//Thread.sleep(2000);
//WebElement drag2= driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
//action.dragAndDrop(drag2, drop).build().perform();
//Thread.sleep(2000);
//WebElement drag3= driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));

	}

}
