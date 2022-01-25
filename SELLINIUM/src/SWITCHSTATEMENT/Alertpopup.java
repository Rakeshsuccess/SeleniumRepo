package SWITCHSTATEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alertpopup extends SeleniumUtils {

	static WebDriver driver;

	@Test
	void handlealert() throws InterruptedException {
		 driver=setup("chrome", "https://demoqa.com/alerts");
		

//		// to open alert popup
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(2000);
//		// switch your control to alert popup
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println("Alert Popup text: " + alertText);
//		// to accept alert or to click on ok or yes button use
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(6000);
//		String timealertname = driver.switchTo().alert().getText();
//		System.out.println("timealertname==" + timealertname);
//		driver.switchTo().alert().accept();
////	driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(2000);
//		String comfermbutton = driver.switchTo().alert().getText();
//		System.out.println("comfermbutton==" + comfermbutton);
//		driver.switchTo().alert().accept();
////	driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.id("promtButton")).click();
//		Thread.sleep(2000);
//		String promtButton = driver.switchTo().alert().getText();
//		System.out.println("promtButton==" + promtButton);
//		driver.switchTo().alert().sendKeys("selinium project");
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
////	driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		WebElement res=driver.findElement(By.id("promptResult"));
//		System.out.println("result=="+res);
	Thread.sleep(2000);
		firstmethod("accept");
	Thread.sleep(2000);
	secondmethod("accept");
		Thread.sleep(2000);
		therdmethod("accept");
		Thread.sleep(2000);
		fourthmethod("rej");	
	}
	
	void firstmethod(String alertdecision) throws InterruptedException {
		
				// to open alert popup
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		// switch your control to alert popup
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Popup text: " + alertText);
		// to accept alert or to click on ok or yes button use
	if(alertdecision.equals("accept"))	{
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
	}else {
		driver.switchTo().alert().dismiss();
	}
	}
	void secondmethod(String alertdecision) throws InterruptedException  {
	driver.findElement(By.id("timerAlertButton")).click();
	Thread.sleep(6000);
	
	String timealertname = driver.switchTo().alert().getText();
	System.out.println("timealertname==" + timealertname);
//driver.switchTo().alert().dismiss();
	if(alertdecision.equals("accept"))	{
		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
	}else {
		driver.switchTo().alert().dismiss();
	}
	
	}	
	void therdmethod(String alertdecision)  {
	driver.findElement(By.id("confirmButton")).click();
//	Thread.sleep(2000);
	String confirmButton = driver.switchTo().alert().getText();
	System.out.println("confirmButton==" + confirmButton);
//driver.switchTo().alert().dismiss();
	if(alertdecision.equals("accept"))	{
		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
	}else {
		driver.switchTo().alert().dismiss();
	}
	}
	void fourthmethod(String alertdecision) {
		driver.findElement(By.id("promtButton")).click();
//		Thread.sleep(2000);
		String promtButton = driver.switchTo().alert().getText();
		System.out.println("promtButton==" + promtButton);
		driver.switchTo().alert().sendKeys("software testing");
	//driver.switchTo().alert().dismiss();
		if(alertdecision.equals("accept"))	{
			driver.switchTo().alert().accept();
//			Thread.sleep(2000);
		}else {
			driver.switchTo().alert().dismiss();
		}	
	
	}
	}	
	
	
	
	
	

