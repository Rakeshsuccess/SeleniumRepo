package date2412;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass3gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open brwser
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
		//open url gsmarena
				driver.get("https://www.gsmarena.com/");

				// implicit wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				// a mximaize
				driver.manage().window().maximize();
				
				//get mobile phone name count from phone finder use ewelements mehod
				
			List<WebElement> phonename=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li"));
				
				int phonecount=phonename.size();
				System.out.println("totale phone type counr="+phonecount);
				
				//print mobile phone name
				for(int i=0;i<phonename.size();i++) {
					System.out.println(phonename.get(i).getText());
				}
						
	}

}
