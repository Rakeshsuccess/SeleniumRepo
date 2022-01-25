package d12xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ass2actitimetask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// 1. open browser and enter the url https://demo.actitime.com/login.do

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();
		// find out name user name and password
		// 2. enter the username and password as admin and manager
		// 3. click on login button
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		// 4./click on task n tab
		WebElement tab1 = driver.findElement(By.id("container_tasks"));
		tab1.click();
		Thread.sleep(2000);
		// String title=tab1.getText();
		// System.out.println("title=="+title);
		// 5. validate task page
//click on new task and create the new task
		WebElement newtask = driver.findElement(By.xpath("//div[text()='Add New']"));
		newtask.click();
		Thread.sleep(2000);

		WebElement create = driver.findElement(By.xpath("//div[@class='item createNewTasks']"));
		create.click();
		// select project name and customer
		WebElement customer = driver.findElement(By.xpath("//div[@class='comboboxButton']"));
		customer.click();
		Thread.sleep(2000);

////Select s1=new Select(customer);
//s1.selectByVisibleText("Galaxy Corporation");
		WebElement customerselect = driver
				.findElement(By.xpath("//div[text()='- New Customer -']/following-sibling::div[4]"));
		customerselect.click();
		Thread.sleep(2000);
//select customer
		driver.findElement(By.xpath("//tr[@class='selectProjectRow projectSelectorRow']")).click();

		Thread.sleep(6000);
//select project android prototyping

		driver.findElement(By.xpath("//div[text()='Android testing']/preceding-sibling::div[3]")).click();

//create task button click//label[@class='components_checkboxContainer checkboxContainer checked']

//driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();

		driver.findElement(By.cssSelector("td[class='nameCell first']>input")).sendKeys("MY second TASK CRIATION");
		Thread.sleep(2000);
//checkbox click
		driver.findElement(By.xpath("//td[@class='addToTTCell']")).click();

		Thread.sleep(2000);
//create task and save
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(2000);

//delete task select
		driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div/div[@class='img']")).click();
//delete button click
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Change Status']/following-sibling::div[1]")).click();

		Thread.sleep(2000);

//click delete button permenetly
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();

	}

}
