package SWITCHSTATEMENT;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class framejquery1 extends SeleniumUtils {
	WebDriver driver;
	Actions action;

	@Test
	public void frame() throws InterruptedException {
		driver = setup("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("tags")).sendKeys("ja");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[@class='logo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id=\"content\"]//iframe")));
		action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		action.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//h2[@class='logo']")).click();
		Thread.sleep(2000);

	}

	@Test
	public void sortable() throws InterruptedException {
		driver = setup("chrome", "https://jqueryui.com/");
		action = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));

		List<WebElement> item = driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
		item.get(0);
		for (int i = item.size() - 1; i >= 0; i--) {

			action.dragAndDrop(item.get(i), item.get(0)).build().perform();
        System.out.println("name-"+item.get(i).getText());
		}
///or		
//		WebElement drag1 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(1)"));
//		WebElement drag2 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(2)"));
//		WebElement drag3 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(3)"));
//		WebElement drag4 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(4)"));
//		WebElement drag5 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(5)"));
//		WebElement drag6 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(6)"));
//		WebElement drag7 = driver.findElement(By.cssSelector("#sortable>li:nth-of-type(7)"));
//
//		action.dragAndDrop(drag7, drag1).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(drag6, drag1).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(drag5, drag1).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(drag4, drag1).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(drag3, drag1).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(drag2, drag1).build().perform();
//		Thread.sleep(2000);
//		// action.dragAndDrop(drag1, drag2).build().perform();

	}

}
