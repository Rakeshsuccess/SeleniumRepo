package date2412;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass4gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//open url gsmarena
		driver.get("https://www.gsmarena.com/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// a mximaize
		driver.manage().window().maximize();

		// click on samsung link present in a phone finder
		WebElement samsung = driver
				.findElement(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li:first-child>a"));
		samsung.click();
		// check whwther page has pegignation or not
		// if yes that print pegignation links name
		List<WebElement> samsungtype = driver.findElements(By.cssSelector("div[id='review-body']>div>ul>li"));

		int phonetypecount = samsungtype.size();
		System.out.println("type of samsung==" + phonetypecount);
		for (int i = 0; i < samsungtype.size(); i++) {
			System.out.println("samsung >>" + samsungtype.get(i).getText());
		}
		// clock on prticilae mobile type of samsung

		driver.findElement(By.cssSelector("div[id='review-body'] li:nth-of-type(3")).click();

	}

}
