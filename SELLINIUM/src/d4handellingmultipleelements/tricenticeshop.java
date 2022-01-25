package d4handellingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tricenticeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		List<WebElement> catoption = driver
				.findElements(By.cssSelector("div[class='block block-category-navigation'] ul>li>a"));
		System.out.println("catoption count==" + catoption.size());

		for (int i = 0; i < catoption.size(); i++) {
			System.out.println("name of catoption==" + catoption.get(i).getText());
		}
	}

}