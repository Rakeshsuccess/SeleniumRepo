package d13keyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vtigermsubmainu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
////div[@class="container-fluid"]/div[2]/div/ul/div/div/li/a
		// WRITE VTIGER MAIN MENU AND SUBMENU PRINT>>>>>>>>>>>>>>>>>>>>>>>>>
		// open brwser
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		// enter url

		driver.get("http://vtiger-demo.it-solutions4you.com/index.php");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// create action class instNCE and passing aguments webdriver instance to its
		// constructor

		Actions action = new Actions(driver);
		// idendetifie mainmenu list and store its lis of webelements
		// 1.enter signup button

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);

		List<WebElement> mainmenu = driver
				.findElements(By.xpath("//div[@class='container-fluid']/div[2]/div/div/div/span[2]"));
		System.out.println("count===>>>>" + mainmenu.size());
		for (int i = 0; i < mainmenu.size(); i++) {

			System.out.println(mainmenu.get(i).getText());
			action.moveToElement(mainmenu.get(i)).perform();

			Thread.sleep(4000);

			// submenu lisv/span
			List<WebElement> submenu = driver.findElements(
					By.xpath("//div[@class=\"container-fluid\"]/div[2]/div/ul/div/div/li/a"));
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
