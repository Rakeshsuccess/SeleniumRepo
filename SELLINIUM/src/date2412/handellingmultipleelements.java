package date2412;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handellingmultipleelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open brwser
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//open url
		driver.get("https://www.google.com/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// a mximaize
		driver.manage().window().maximize();

		WebElement searchinputfield = driver.findElement(By.name("q"));
		searchinputfield.sendKeys("Selenium Testing");
		// identify multiple elements
		List<WebElement> sugglist = driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]/span"));
//get count off element
		int suggcounts = sugglist.size();
		System.out.println("suggesion counts ==" + suggcounts);

		for (int i = 0; i < suggcounts; i++) {
			System.out.println(sugglist.get(i).getText());
		}
		// close current browser
		driver.close();
	}

}
