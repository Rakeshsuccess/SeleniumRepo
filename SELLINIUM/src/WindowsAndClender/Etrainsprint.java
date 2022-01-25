package WindowsAndClender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SWITCHSTATEMENT.SeleniumUtils;

public class Etrainsprint extends SeleniumUtils {
	WebDriver driver;

	@Test
	public void oenbowsandgetwi() throws InterruptedException {
		driver = setup("chrome", "https://etrain.info/in");
		String homeid = driver.getWindowHandle();

		driver.findElement(By.cssSelector("#rsfi2")).sendKeys("pune");
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
		Thread.sleep(2000);
		driver.findElement(By.id("stnsbmtbtn")).click();

		List<WebElement> numlist = driver.findElements(By.xpath(
				"//div[@class=\"trainlist rnd5\"]/table[@class=\"myTable data nocps nolrborder bx4_brm\"]/tbody/tr/td[1]/a"));
		List<WebElement> namelist = driver.findElements(By.xpath(
				"//div[@class=\"trainlist rnd5\"]/table[@class=\"myTable data nocps nolrborder bx4_brm\"]/tbody/tr/td[2]/a"));
		for (int i = 0; i < numlist.size(); i++) {

			System.out.println(numlist.get(i).getText() + ">>>>>" + namelist.get(i).getText());

		}
	}
}