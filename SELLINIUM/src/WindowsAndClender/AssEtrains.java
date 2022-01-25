package WindowsAndClender;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//Open brower and enter the URL https://etrain.info/in
//click on "Reservation Rules /  Refund Rules"
//click on services
//click on SMS Services
//click on "www.indianrail.gov.in"
//get the text "INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY"
//come back to main page 
//in "Arrival/Departure at Station" section type pune and click on get Train button
//get all the train number and names
//finally close all the browser
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SWITCHSTATEMENT.SeleniumUtils;

public class AssEtrains extends SeleniumUtils {

	WebDriver driver;

	@Test
	public void oenbowsandgetwi() throws InterruptedException {
		driver = setup("chrome", "https://etrain.info/in");
		String homeid = driver.getWindowHandle();
		System.out.println("url=" + driver.getCurrentUrl());
		System.out.println("homeid=" + homeid);
		// click on reserwation rule
		driver.findElement(By.xpath("//a[text()='Reservation Rules']")).click();
		Thread.sleep(2000);
		Set<String> allwind = driver.getWindowHandles();
		System.out.println("allwind==" + allwind);

		allwind.remove(homeid);
		System.out.println("aftr remove allwind==" + allwind);

		String childwind = allwind.iterator().next();
		driver.switchTo().window(childwind);
		Thread.sleep(4000);
		// page down
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ESCAPE, Keys.ARROW_DOWN));
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN));
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN));
		Thread.sleep(2000);
		// click on sevices
		driver.findElement(By.xpath("//a[@data-toggle=\"collapse\"][text()='Services']")).click();
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='SMS Service']")).click();
		Thread.sleep(2000);
		WebElement card = driver.findElement(By.id("card"));
		if (driver.findElement(By.cssSelector("#dismiss-button")).equals("close")){
			driver.findElement(By.cssSelector("#dismiss-button")).click();
			// driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ESCAPE,Keys.ENTER));
			Thread.sleep(2000);
			// click omn link
			driver.findElement(By.xpath("//a[text()='www.indianrail.gov.in']")).click();
		} else {
			driver.findElement(By.xpath("//a[text()='www.indianrail.gov.in']")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Indian Railways Enquiry']")).click();
		driver.close();
String homewind=allwind.iterator().next();
		driver.switchTo().window(homewind);

	}

}
