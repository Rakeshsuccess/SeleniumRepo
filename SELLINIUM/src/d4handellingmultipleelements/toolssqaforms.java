package d4handellingmultipleelements;//https://jar-download.com/artifacts/io.github.bonigarcia/webdrivermanager

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolssqaforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();

		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Rakesh");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("gupta");
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("surywanshirakesh9897@gmail.com");

		WebElement checkbox1 = driver.findElement(By.id("gender-radio-1"));
		WebElement lable = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		lable.click();
		System.out.println("using element is only selected==" + checkbox1.isSelected() + "  " + lable.isDisplayed()
				+ "  " + lable.isEnabled());
//gender-radio-1
		lable.click();
		System.out.println("using element is only selected==" + checkbox1.isSelected() + "  " + lable.isDisplayed()
				+ "  " + lable.isEnabled());
		WebElement mobno = driver.findElement(By.id("userNumber"));
		mobno.sendKeys("1234567890");
		System.out.println("using element is only mobno==" + mobno.isDisplayed() + "  " + mobno.isEnabled());
//WebElement date=driver.findElement(By.id("DateOfBirthInput"));
//date.sendKeys("09 aug 1997");
//System.out.println("using element is only date=="+date.isDisplayed()+"  "+date.isEnabled());
//driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));

		WebElement sub = driver.findElement(By.cssSelector("div[class='subjects-auto-complete__value-container']"));
		sub.sendKeys("math");
		WebElement checkBox = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement element = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		System.out.println(element.isSelected() + ":  " + element.isDisplayed() + ": " + element.isEnabled());
		element.click();
		System.out.println("Using input for only******* selected: " + checkBox.isSelected() + ":  "
				+ element.isDisplayed() + ": " + element.isEnabled());
		element.click();
		System.out.println("Using input for only********** selected: " + checkBox.isSelected() + ":  "
				+ element.isDisplayed() + ": " + element.isEnabled());

	}

}
