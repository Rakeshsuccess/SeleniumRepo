package d6Propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registerpageautomationtesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method
		// stub>http://demo.automationtesting.in/Register.html

		// TODO Auto-generated method stub
		// create fileinput stream class instance and pass the property file loaction to
		// it s constructor
		FileInputStream fis = new FileInputStream(".\\propertyfiledata\\registerpage.properties");
		// crate proprties file instance
		Properties prop = new Properties();
		// call load method and pass the fileinputstream eclass instance
		prop.load(fis);

		// read data from propertyfile
		String expectedpagetitle = prop.getProperty("loginpagetitle");
		System.setProperty(prop.getProperty("key"), prop.getProperty("value"));
		WebDriver driver = new ChromeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//div[class="form-group"]>div>label:first-child>input
		//enterfirstname
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(prop.getProperty("fname"));
		//enter lastname
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(prop.getProperty("lname"));
		//enter address
		driver.findElement(By.cssSelector("div[class='form-group']>div>textarea"))
				.sendKeys(prop.getProperty("address"));
	//	enter email
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(prop.getProperty("mailid"));
		//enter mobile number
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(prop.getProperty("mobno"));
		//gender
		driver.findElement(By.cssSelector("div[class='form-group']>div>label:first-child")).click();

		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		

		//enter langunge div[style='display: block;']>ul>li:nth-of-type(8)
			driver.findElement(By.id("msdd")).click();
			Thread.sleep(2000);

			driver.findElement(By.cssSelector("div[style='display: block;']>ul>li:nth-of-type(8)")).click();
			

		// WebElement language = driver.findElement(By.id("msdd"));

		// Select sel = new Select(language);

		// sel1.selectByVisibleText("Hindi");
		WebElement skill = driver.findElement(By.id("Skills"));
		Select sel1 = new Select(skill);
		Thread.sleep(2000);
		sel1.selectByVisibleText(prop.getProperty("skillvisibletext"));
		//sel1.selectByIndex(2);
		//country select
		WebElement country = driver.findElement(By.id("country"));
		//country.click();
		Select sel3 = new Select(country);
		sel3.selectByVisibleText("India");
		for(int i=0;i<sel3.getOptions().size();i++) {
			System.out.println(sel3.getOptions().get(i).getText());
		}
		//driver.findElement(By.cssSelector("form[id='basicBootstrapForm']")).click();
			
		// sel1.selectByVisibleText(prop.getProperty("lvisbletext"));
		driver.findElement(By.id("firstpassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("secondpassword")).sendKeys(prop.getProperty("confpassword"));

	}
}