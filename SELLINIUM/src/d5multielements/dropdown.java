package d5multielements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
//mange wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximaze

		driver.manage().window().maximize();
		// identify dropdown
		WebElement dropdown = driver.findElement(By.id("carselect"));
//create instance of the select class and pass drpdown to constroctor
		Select skillselect = new Select(dropdown);
		System.out.println("dropdown multiselect or not" + skillselect.isMultiple());
//check selected option
		System.out.println("check option is selected==" + skillselect.getFirstSelectedOption().getText());
//desplyed all option in a select dropdown
		List<WebElement> option = skillselect.getOptions();
		for (int i = 0; i < option.size(); i++) {
			System.out.println("all option==" + option.get(i).getText());

		}
		// select option from dropdown
		skillselect.selectByIndex(2);
		System.out.println("check option is selected by index==" + skillselect.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		skillselect.selectByValue("honda");
		System.out.println("check option is selected by value==" + skillselect.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		skillselect.selectByVisibleText("Benz");
		System.out.println(
				"check option is selected= by get visbletext method=" + skillselect.getFirstSelectedOption().getText());
//multiselect dropdown start>>>>>>>>>>>>>>>
		System.out.println("********************************start multiselect dropdown");

		WebElement mdropdown = driver.findElement(By.id("multiple-select-example"));
		
//create instance
		Select mselect = new Select(mdropdown);
		System.out.println("check multiselect or not==" + mselect.isMultiple());
		for (int i = 0; i < mselect.getOptions().size(); i++) {
			System.out.println("all drpdown option==" + mselect.getOptions().get(i).getText());
		}
		Thread.sleep(2000);
		mselect.selectByIndex(1);
		System.out.println("all drpdown option selected by index==" + mselect.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		mselect.selectByValue("apple");
		System.out.println("all drpdown option selected by value==" + mselect.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		mselect.selectByVisibleText("Peach");
		System.out.println("all drpdown option selected by visibletext==" + mselect.getFirstSelectedOption().getText());

		System.out.println("select option==+" + mselect.getAllSelectedOptions().size());

		for (int i = 0; i < mselect.getAllSelectedOptions().size(); i++) {
			System.out.println("selected options==" + mselect.getAllSelectedOptions().get(i).getText());
			Thread.sleep(2000);
			mselect.deselectAll();
			WebElement alldropdown = driver.findElement(By.id("multiple-select-example"));

		}

	}
}
