package SWITCHSTATEMENT;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtils {
public WebDriver driver;

	public WebDriver setup(String browsername, String url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public void getscreenshots(String filename) throws IOException {
		TakesScreenshot  ts=(TakesScreenshot)driver;
	
	File file=ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils .copyFile(file, new File(filename));

	
	
	}
	
}	
//	@Test
//	public void sample() {
//		// TODO Auto-generated method stub
//		WebDriver driver = setUp("chrome", "https://demo.actitime.com/login.do");
//	}
//	
//public void getScreenShot(String fileName) {
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file, new File(fileName));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
