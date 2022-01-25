package d12xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1demoblaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//1. open browser and enter the url https://www.demoblaze.com/

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();
//2. get all the device name and price 

		List<WebElement> name = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h4"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h5"));
//3. print them into the console

		int count = name.size();
		int num = 1;
		System.out.println("name count ==" + count);
		for (int i = 0; i < name.size(); i++) {

			System.out.println(
					num + ">> " + "phone name==" + name.get(i).getText() + "<<price>>" + price.get(i).getText());
			num++;
		}
		// 4. check whether next button is displayed or not
		// 5. if its displayed dn click on it
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("//button[@id='next2']"));
		while (click.isDisplayed()) {
			// 6. repeat step2-4
			click.click();
			System.out.println("************************************next bpage***********");
			Thread.sleep(2000);
			List<WebElement> name2 = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div//h4"));
			List<WebElement> price2 = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div//h5"));
			int count2 = name2.size();
			System.out.println("2nd page cont==" + count2);
			for (int i = 0; i < name2.size(); i++) {
				System.out.println(num + ">>" + name2.get(i).getText() + ">>>price>>" + price2.get(i).getText());
				num++;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("prev2")).click();
		Thread.sleep(4000);
		driver.close();
		
	}
}