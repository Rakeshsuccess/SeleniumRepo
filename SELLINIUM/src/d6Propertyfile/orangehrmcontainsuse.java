package d6Propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmcontainsuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.cssSelector("div[id='content']>div:nth-of-type(2)>span"));
		System.out.println("username and password" + user.getText());
		// split oeration perform due to remove perticular string i.e username and
		// password

		String usersplit = user.getText().split(" ")[3];
		String passsplit = user.getText().split(" ")[7];
		System.out.println(user.getText().split(" ").length);
		System.out.println("usernme==" + usersplit);
		// enter the username and password
		driver.findElement(By.id("txtUsername")).sendKeys(usersplit);
		driver.findElement(By.id("txtPassword")).sendKeys(passsplit);
		driver.findElement(By.id("btnLogin")).click();

	}

}
