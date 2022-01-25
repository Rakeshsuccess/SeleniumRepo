package d12xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assacttime3taskcreate {
	WebDriver driver;
	List<WebElement> titlelist;

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

		List<WebElement> element = driver.findElements(
				By.xpath("//div[contains(text(),'Select Customer')]//following::div[@class='comboboxButton']"));
		element.get(0).click();
		List<WebElement> costemerlist = driver.findElements(By.xpath(
				"//div[div[contains(text(),'Select Customer')]]/table/tbody/tr[1]//following::div[@class='searchItemList']/div"));

		if (costemerlist.size() > 3) {
			costemerlist.get(2).click();
			element = driver.findElements(
					By.xpath("//div[contains(text(),'Select Customer')]//following::div[@class='comboboxButton']"));
			element.get(1).click();
			List<WebElement> projectlist = driver.findElements(By.xpath(
					"//div[div[contains(text(),'Select Customer')]]/table/tbody/tr[3]//following::div[@class='searchItemList']/div"));
			if (projectlist.size() >= 3) {
				projectlist.get(3).click();
			} else {
				driver.findElement(By.xpath("//body")).sendKeys(Keys.TAB);
				driver.findElement(By.xpath("//td/input[@placeholder=\"Enter Project Name\"]"))
						.sendKeys("softwareproject");

			}
		} else {
			costemerlist = driver.findElements(By.xpath(
					"//div[div[contains(text(),'Select Customer')]]/table/tbody/tr[1]//following::div[@class='searchItemList']/div"));
			costemerlist.get(0).click();
			driver.findElement(By.xpath("//td/input[@placeholder=\"Enter Customer Name\"]"))
					.sendKeys("computerengineering");
			driver.findElement(By.xpath("//td/input[@placeholder=\"Enter Project Name\"]")).sendKeys("softwareproject");
		}

		driver.findElement(By.xpath("//td/input[@placeholder='Enter task name']")).sendKeys("automation4");
		driver.findElement(By.xpath("//div[@class='taskTable']//tbody/tr[1]/td[5]")).click();
		driver.findElement(
				By.xpath("//div[@class='taskTable']//tbody/tr[1]/td[5]//div[@class=\"typeOfWorkList\"]/div[3]"))
				.click();
		driver.findElement(By.xpath("//div[@class='taskTable']//tbody/tr[1]/td[6]")).click();
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(2000);

		List<WebElement> titlelist = driver.findElements(By.cssSelector(".taskRow .title"));

		for (int i = 0; i < titlelist.size(); i++) {
			String newTaskName = titlelist.get(i).getText();

			if (newTaskName.equals("automation4")) {
				System.out.println("task is craeted");
				System.out.println("title task==" + newTaskName);
				break;
			} else {
				System.out.println("task is not created");
				break;
			}
		}
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void ModifyaAndVrifytask() throws InterruptedException {
		titlelist = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < titlelist.size(); i++) {

			List<WebElement> taskCheckBoxs = driver.findElements(By.cssSelector(".taskRow .checkbox"));
			// if (!newTaskName.equals("automation3")) {
			Thread.sleep(2000);
			taskCheckBoxs.get(i).click();
			driver.findElement(By.xpath("//div[@class='bulkOperationsPanel']/div[5]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@class='assignToDialogInnerContainer']//div[text()='New']")).click();
			Thread.sleep(2000);
			WebElement statusname = driver.findElement(By.xpath(
					"//div[@class=\"workflowStatusNode checked\"]/following-sibling::div[@class=\"workflowStatusNode\"][1]//div[text()='Planning']"));
			statusname.click();
			driver.findElement(By.xpath("//span[text()='Apply']")).click();

			Thread.sleep(2000);
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@+++++++++++++++++++++@@@@@@@@@@@@@@@@@@@@@");
			if (statusname.isDisplayed()) {
				System.out.println("task modify is success");
			} else {
				System.out.println("statusname not modified");
			}
		}
	}

	@Test(priority = 4)
	public void deleteTaskAndVerify() throws InterruptedException {
		// verified created task
		titlelist = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < titlelist.size(); i++) {
			String newTaskName = titlelist.get(i).getText();

			List<WebElement> taskCheckBoxs = driver.findElements(By.cssSelector(".taskRow .checkbox"));
			// if (!newTaskName.equals("automation3")) {
			Thread.sleep(2000);
			taskCheckBoxs.get(i).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Delete']")).click();
			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			System.out.println("Task deleted..");
			if (!newTaskName.equals("automation3")) {
				System.out.println("task delete succsess");
				break;
			} else {
				System.out.println("task is not delete");
				break;
			}
		}
		Thread.sleep(2000);
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();
		driver.close();
	}
}