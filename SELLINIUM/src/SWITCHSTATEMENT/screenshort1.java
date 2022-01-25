package SWITCHSTATEMENT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class screenshort1 extends SeleniumUtils{
@Test
public void screenshort() throws IOException {
	WebDriver driver=setup("chrome","https://www.google.com");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("./Screenshort/GoogleSearchPage.jpg"));
	//Utils.getScreenShot(driver, "./screenshots/GoogleSearchPage2.png");
}

}
