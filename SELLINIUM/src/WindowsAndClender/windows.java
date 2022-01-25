package WindowsAndClender;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SWITCHSTATEMENT.SeleniumUtils;

public class windows extends SeleniumUtils{
WebDriver driver;

@Test
public void testwindows() {	
	driver=setup("chrome","https://demoqa.com/browser-windows");
	//to get current url
	System.out.println("url=="+driver.getCurrentUrl());
	//to get current window id
	String homewind=driver.getWindowHandle();
	System.out.println("homewindow id=="+homewind);
	//click on new window button
	driver.findElement(By.id("windowButton")).click();
	//get all windwos id
	Set<String> allwind=driver.getWindowHandles();
	System.out.println("allwind=="+allwind);//2 id 
	
	//remove home id ad get child id because set is not index 
	allwind.remove(homewind);
	System.out.println("allwind=="+allwind);//1 child id 
//Iterator<String> itr=allwind.iterator();
// String childwind=itr.next();
	String childwind=allwind.iterator().next();
	System.out.println(childwind);
	//get child window 
	driver.switchTo().window(childwind);
	System.out.println("child window url========"+driver.getCurrentUrl());
	//perform operation done close the child window 
	driver.close();
	
	//get homwewindow
	driver.switchTo().window(homewind);
	System.out.println("home window url========"+driver.getCurrentUrl());
	driver.close();
	//to close all driver instance
////	driver.quit();
	
}
}
