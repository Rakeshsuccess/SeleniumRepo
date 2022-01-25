package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1loginActiTime {
	WebDriver driver;
	// List<WebElement> tasklist;

	@Test(priority = 1)
	public void openBroserAndLogin() {
		// WebDriver driver;
		System.out.println("open browser start");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// mange implicite wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	@Test(priority = 2)
	public void createAndVerifyTask() throws InterruptedException {
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

////Select s1=new Select(customer);//div[@class=\"contentWrapper \"]/div[@class=\"searchItemList\"]/div[1]/following-sibling::div[4]
//s1.selectByVisibleText("Galaxy Corporation");
		WebElement customerselect = driver.findElement(By.xpath(
				"//div[@class=\"contentWrapper \"]/div[@class=\"searchItemList\"]/div[4]"));
		customerselect.click();
		Thread.sleep(2000);
//select customer
		driver.findElement(By.xpath("//tr[@class='selectProjectRow projectSelectorRow']")).click();

		Thread.sleep(6000);
//select project android prototyping

		driver.findElement(
				By.xpath("//tr[@class=\"selectProjectRow projectSelectorRow\"]/td/div/div/div[2]/div/div/div/div[4]"))
				.click();

//create task button click//label[@class='components_checkboxContainer checkboxContainer checked']

//driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();

		driver.findElement(By.cssSelector("td[class='nameCell first']>input")).sendKeys("testing engineer9");
		Thread.sleep(2000);
//checkbox click
		driver.findElement(By.xpath("//td[@class='addToTTCell']")).click();
		Thread.sleep(2000);
		// create task and save
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(2000);
		// Assert.assertEquals(null, null)
		// WebElement taskverify= driver.findElement(By.xpath("//div[text()='testing
		// engineer5']"));
//System.out.println("task is create or not =="+taskverify.isDisplayed());
		List<WebElement> tasklist = driver.findElements(By
				.xpath("//div[@class='innerScrollableContainer']/div/div/div/table/tbody/tr/td[2]/div/div/div/div[2]"));
		String expectedtask = "testing engineer9";

		for (int j = 0; j < tasklist.size(); j++) {
			if (tasklist.get(j).getText().equals(expectedtask)) {
				System.out.println("task ceation successs");
				break;
			} else {
				System.out.println("task is not ceate");
				break;
			}
			// Assert.assertEquals(tasklist.get(j).getText(), expectedtask,"task is not
			// created");modifyAndVerifyTask
		}

	}

	@Test(priority = 3)
	public void deleteAndVerifyTask() throws InterruptedException {
		String expectedtask = "testing engineer9";
//		List<WebElement> tasklist1 = driver.findElements(By
//				.xpath("//div[@class='innerScrollableContainer']/div/div/div/table/tbody/tr/td[2]/div/div/div/div[2]"));

//		for (int k = 0; k < tasklist1.size(); k++) {
			//if (tasklist1.get(k).getText().equals(expectedtask)) {

				driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div/div[@class='img']"))
						.click();
//delete task button click
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[text()='Change Status']/following-sibling::div[1]")).click();

				Thread.sleep(2000);

//click delete button permenetly
				driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
				Thread.sleep(2000);
				List<WebElement> tasklist1 = driver.findElements(By
						.xpath("//div[@class='innerScrollableContainer']/div/div/div/table/tbody/tr/td[2]/div/div/div/div[2]"));

				for (int k = 0; k < tasklist1.size(); k++) {

				if (tasklist1.get(k).getText().equals(expectedtask)) {

				System.out.println("task not delete ");
				break;
			} else {
				System.out.println("task is  delete");
				break;
			}
		}
	}

//	@Test(priority = 4)
//	public void deleteAndVerifyTask() {
//
//	}

	@Test(priority = 4)
	public void logoutAndClose() throws InterruptedException {
		WebElement logoutclick = driver.findElement(By.linkText("Logout"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutclick));
		System.out.println("page titel after login page==" + driver.getTitle());

		logoutclick.click();
		Thread.sleep(4000);
		driver.close();
	}
}
