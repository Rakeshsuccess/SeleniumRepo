package Excelreaddata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.graphbuilder.curve.Point;

import SWITCHSTATEMENT.SeleniumUtils;

public class Excelreadactime extends SeleniumUtils{
String username,pwd,expectname,url;
WebDriver driver;
	public String readdata(String filename,String sheetname,int rownum,int cellnum) throws IOException {
		// 1.create file input stream class and pass it constructor
				FileInputStream fis = new FileInputStream(filename);
				// CREATE INSTANCEOF REQUIRAD WORKBOOK

				Workbook workbook = new XSSFWorkbook(fis);
		//GET SHEET
				Sheet sheet = workbook.getSheet(sheetname);
				// get row
				Row row = sheet.getRow(rownum);		
		return row.getCell(cellnum).getStringCellValue();
	}
	@BeforeTest
	public void logindata() throws IOException {
		username=readdata(".\\EXCELDATA\\Testexelfile.xlsx","Sheet1",1,0);
		pwd=readdata(".\\EXCELDATA\\Testexelfile.xlsx","Sheet1",1,1);
		expectname=readdata(".\\EXCELDATA\\Testexelfile.xlsx","Sheet1",1,3);
		url=readdata(".\\EXCELDATA\\Testexelfile.xlsx","Sheet1",1,2);

		System.out.println(username);
		System.out.println(pwd);
		System.out.println(expectname);
		System.out.println(url);		
	}
	@BeforeMethod
	public void startlogin() {
		driver=setup("chrome",url);
	}
	@Test
	public void getlogin() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys(username,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(pwd,Keys.ENTER);
		Thread.sleep(4000);
Assert.assertEquals(driver.getTitle(),expectname,"either actitime login wrong");

	}
	@Test
	public void testPosition() {
		WebElement uname=driver.findElement(By.name("username"));
		Point cord=uname.getLocation();
		int cordx=cord.getX();
		int cordy=cord.getY();
		System.out.println("CO Ordinate username X and y::"+cordx+" "+cordy);
		WebElement pass=driver.findElement(By.name("pwd"));
	int passx=pass.getLocation().getX();
	int passy=pass.getLocation().getY();
		System.out.println("CO Ordinate pass  X::"+passx+"  "+passy);
Assert.assertTrue(cordy<passy, "condition wrong");
		
		
		
	}
}
