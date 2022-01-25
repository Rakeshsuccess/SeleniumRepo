package date2412;

import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2crincifo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open brwser
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//open url gsmarena
		driver.get("https://www.cricinfo.com/");

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// a mximaize
		// driver.manage().window().maximize();
		List<WebElement> option = driver.findElements(By.cssSelector("div[class='sticky']>nav>div>div>ul>li"));
		int count = option.size();
		System.out.println("count==" + option.size());
		for (int i = 0; i < option.size(); i++) {
			System.out.println(">>>>" + option.get(i).getText());

		}
		WebElement details = driver.findElement(By.cssSelector("div[class='sticky']>nav>div>div>ul>li:nth-of-type(5)"));
		details.click();

	}

}
