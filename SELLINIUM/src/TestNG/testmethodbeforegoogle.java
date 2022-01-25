package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testmethodbeforegoogle {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void closedbrowser() {
		driver.close();
		
		
	}
	@Test(priority=2)
	public void testgooglelandingsearchfield() {
	WebElement search=driver.findElement(By.name("q"));

	System.out.println("searchfield is desplayed or not==="+search.isDisplayed());
	System.out.println("searchfield is enable or not==="+search.isEnabled());
	search.sendKeys("Sql qustions",Keys.ENTER);

	System.out.println("after searchtitle=="+driver.getTitle());

}
	@Test(priority=1)
	public void testgooglelanding() {
		System.out.println("title==="+driver.getTitle());
	String expectedtitle="Google";
		String actultitle=driver.getTitle();
		Assert.assertEquals(expectedtitle, actultitle,"actual title is not eligible");
		
		System.out.println("finish google page test");
		
	}
	
}
