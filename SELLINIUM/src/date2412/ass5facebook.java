package date2412;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ass5facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open brwser
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//open url gsmarena
		driver.get("https://www.facebook.com/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// a mximaize
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.cssSelector("form[class='_9vtf']>div:nth-of-type(5)>a"));
		account.click();
		// enter forstname
		driver.findElement(By.name("firstname")).sendKeys("rakesh");
//enter last name
		driver.findElement(By.name("lastname")).sendKeys("suryawanshi");

//nter email
		driver.findElement(By.name("reg_email__")).sendKeys("rakesh9897@gmail.com");
//reenter email reg_email_confirmation__
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rakesh9897@gmail.com");

//enter passward
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234567890");
//dropdown
		WebElement day = driver.findElement(By.id("day"));

		Select s = new Select(day);
		s.selectByIndex(8);
		System.out.println("enable or not ==" + day.isEnabled() + "is deplayed or not==" + day.isDisplayed());

//dropdown month
		WebElement month = driver.findElement(By.id("month"));

		Select s1 = new Select(month);
		s1.selectByIndex(8);
		System.out.println("enable or not ==" + month.isEnabled() + "is deplayed or not==" + month.isDisplayed());
//dropdown year
		WebElement year = driver.findElement(By.id("year"));

		Select s2 = new Select(year);
		s2.selectByValue("1997");
		System.out.println("enable or not ==" + year.isEnabled() + "is deplayed or not==" + year.isDisplayed());
//button select 
		
		driver.findElement(By.cssSelector("span[class='_5k_3']>span:nth-of-type(2)>label")).click();
		//signup
		driver.findElement(By.name("websubmit")).click();
		
	}

}
