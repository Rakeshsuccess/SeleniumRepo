package d6Propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeprop {

	public static void main(String[] args) throws IOException {
	
// create fileinput class instance and pass property file location to its constructor 
		FileInputStream refer=new FileInputStream(".\\propertyfiledata\\actitime.properties");
		//create propertiessfile class instance
		Properties prop=new Properties();
		//create load method
	prop.load(refer);
	//read data on property file
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
//System.setProperty((prop.getProperty("key")),(prop.getProperty("value"));
	//read data property file
String url=prop.getProperty("url");
String username=prop.getProperty("username");
String pass=prop.getProperty("password");
//String k=prop.getProperty("key");
//String v=prop.getProperty("value");
System.setProperty(prop.getProperty("key"),prop.getProperty("value"));

//System.getProperty(k,v);
WebDriver driver=new ChromeDriver();

driver.get(url);
driver.findElement(By.id("username")).sendKeys(username);
driver.findElement(By.name("pwd")).sendKeys(pass);
driver.findElement(By.id("loginButton")).click();
	}

}
