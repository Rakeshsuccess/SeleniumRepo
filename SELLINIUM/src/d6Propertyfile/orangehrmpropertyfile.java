package d6Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmpropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//create fileinput stream class instance and pass the property file loaction to it s constructor
		FileInputStream fis=new FileInputStream(".\\propertyfiledata\\orangehrm.properties");
		//crate proprties file instance
		Properties prop=new Properties();
		//call load method and pass the fileinputstream eclass instance
		prop.load(fis);
		
		//read data from propertyfile 
		String expectedpagetitle=prop.getProperty("loginpagetitle");
		System.setProperty(prop.getProperty("key2"), prop.getProperty("value2"));
		WebDriver driver=new ChromeDriver();
		//manage time
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		driver.get(prop.getProperty("url2"));
		System.out.println(">>>>>"+driver.getTitle());
		if(driver.getTitle().equals(expectedpagetitle)) {
			System.out.println("login page despalyed");
		}else {
			System.out.println("login page not desplayed");
		}
		//login orange hrm app
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("uname"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.id("btnLogin")).click();


	}

}
