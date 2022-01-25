package date2412;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//open brwser
						System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
						ChromeDriver driver = new ChromeDriver();
				//open url gsmarena
						driver.get("https://www.flipkart.com/");

						// implicit wait
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						// a mximaize
						driver.manage().window().maximize();
					List<WebElement>foption=driver.findElements(By.cssSelector("div[id=\"container\"]>div>div:nth-of-type(2)>div>div>div"));
					int count=foption.size();
					System.out.println("count flipcart option=="+count);
					//print all option in flipkart
				for(int i=0;i<foption.size();i++)	{
					System.out.println("click f>.>>>>>>>>"+foption.get(i).getText());
				}
	}

}
