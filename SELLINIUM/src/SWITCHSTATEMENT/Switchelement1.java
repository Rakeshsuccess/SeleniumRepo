package SWITCHSTATEMENT;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Switchelement1 extends SeleniumUtils {
WebDriver driver;

	@Test
	public void activelement(){
		WebDriver driver=setup("chrome","https://demo.actitime.com/login.do");
		
		WebElement element= driver.switchTo().activeElement();
		
		String act=element.getAttribute("placeholder");
		System.out.println("actual default=="+act);
		Assert.assertEquals(act,"Username","by Default control is not IN username field");
		 driver.switchTo().activeElement().sendKeys("admin");
		 driver.switchTo().activeElement().sendKeys(Keys.TAB);
		 driver.switchTo().activeElement().sendKeys("manager");
		 driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		 
		 

	}
	@Test
	public void googleenter(){
		WebDriver driver=setup("chrome","https://www.google.com");
		driver.switchTo().activeElement().sendKeys("selinum testing",Keys.ENTER);			
}		
}	
	
	
	
	
	
	
	
	

