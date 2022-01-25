package d5multielements;

import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();
		List<WebElement> mainuoption = driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("mainmainu count==" + mainuoption.size());

		/*
		 * for(int i=0;i<mainuoption.size();i++) {
		 * System.out.println("maini mainu option name =="+mainuoption.get(i).getText())
		 * ; }
		 */
		for (int i = 0; i < mainuoption.size(); i++) {
			if (mainuoption.get(i).isDisplayed()) {
				System.out.println("desplay option name=" + mainuoption.get(i).getText());
			} else {
				System.out.println("with inner html attribute==" + mainuoption.get(i).getAttribute("innerHTML"));
			}
		}
	}

}// https://jar-download.com/artifacts/io.github.bonigarcia/webdrivermanager
