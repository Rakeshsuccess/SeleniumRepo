package d11webdrivermanager;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
//or
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();

//get urldiv[class='block block-category-navigation'] ul>li>a"
driver.get("http://demowebshop.tricentis.com/");

  List<WebElement> option=driver.findElements(By.cssSelector("div[class='block block-category-navigation'] ul>li>a"));
  
  int count=option.size();
  System.out.println("count=="+count);
  
  for(int i=0;i<option.size();i++) {
	  System.out.println("name of option=="+option.get(i).getText());
  }
	}

}
