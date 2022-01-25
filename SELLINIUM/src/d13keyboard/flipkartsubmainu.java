package d13keyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartsubmainu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	try {
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	}catch(NoSuchElementException e) {
		
	}

		List<WebElement> mainmenu = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div[2]"));
//create instance action class and passs the webdriver refernce to it constructor
		Actions action = new Actions(driver);
		for (int i = 0; i < mainmenu.size(); i++) {

			System.out.println(mainmenu.get(i).getText());
			action.moveToElement(mainmenu.get(i)).perform();
Thread.sleep(2000);
			List<WebElement> submenu = driver.findElements(By.xpath(
					"//div[@class='_37M3Pb']/div/a/div[2]/div[2]/div[2]/div/div/div[@class='_3XS_gI _7qr1OC']/a"));
		//	// div[@class='_37M3Pb']/div/a/div[2]/div[2]/div[2]/div/div/div[contains(@class,'_7qr1OC')]/a
		//	// div[@class='_37M3Pb']/div/a/div[2]/div[2]/div[2]/div/div/div[@class='_3XS_gI
		//	// _7qr1OC']/a
			System.out.println(submenu.size());

			if (submenu.size() > 0) {
				for (int j = 0; j < submenu.size(); j++) {
					action.moveToElement(submenu.get(j)).perform();
System.out.println(submenu.get(j).getText());
				}
			}

		}

	}

}
