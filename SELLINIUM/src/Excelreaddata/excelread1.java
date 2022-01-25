package Excelreaddata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//import org.junit.Test;

public class excelread1 {
	@Test
	public void readdata() throws IOException {
		// file location
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		// create on instamnce of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetcount = workbook.getNumberOfSheets();
		System.out.println("count of sheet==" + sheetcount);

		System.out.println("sheet active row name" + workbook.getActiveSheetIndex());

		for (int i = 0; i < sheetcount; i++) {
			System.out.println(workbook.getSheetName(i));

		}
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	}

	@Test
	public void getrow() throws IOException {
		// file location
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		// create on instamnce of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// get sheet count
		int sheetcount = workbook.getNumberOfSheets();
		System.out.println("count of sheet==" + sheetcount);
		// get sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// get row
		int rowcount = sheet.getLastRowNum();
		// get specific row
		System.out.println("row count: " + rowcount);
		XSSFRow row = sheet.getRow(0);
	}

	@Test
	public void getcell() throws IOException {
		// file location
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		// create on instamnce of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		int rowcount = sheet.getLastRowNum();
		int cell = row.getLastCellNum();
		// for(int j=0;j<rowcount;j++) {
		for (int i = 0; i < cell; i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "    ");

		}
	}

	@Test
	public void getdifferentcellvalue() throws IOException {
		// 1.file location
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		// 2.create on instamnce of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetcount = workbook.getNumberOfSheets();
		System.out.println("count of sheet==" + sheetcount);
		// 3.get sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// 4.get row
		XSSFRow row = sheet.getRow(2);
		int rowcount = sheet.getLastRowNum();
		// int cellcount=row.getLastCellNum();
		// .5.get cell
		System.out.println("getocunt==" + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			case BLANK:
				break;
			default:
				throw new RuntimeException("there is no suppor for thes file");
			}
		}

	}

	@Test
	public void getdifferwntcelvalues_2() throws IOException {
		// 1.create file input stream class and pass it constructor
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		// CREATE INSTANCEOF REQUIRAD WORKBOOK

		Workbook workbook = new XSSFWorkbook(fis);
//GET SHEET
		Sheet sheet = workbook.getSheet("Sheet1");
		// get row
		Row row = sheet.getRow(2);
		// get cell
		System.out.println("cellcount ==" + row.getLastCellNum());

		for (int i = 0; i < row.getLastCellNum(); i++) {
			Cell cell = row.getCell(i);
			switch (cell.getCellType()) {

			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case BLANK:
				break;
			default:
				throw new RuntimeException("there is no valid input");

			}

		}

	}

	@Test
	public void geyteachrowandeachcellvalue() throws IOException {
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			int cellcount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + " \t ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + " \t ");
					break;

				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " \t ");
					break;
				case BLANK:
					break;
				default:
					throw new RuntimeException("there is invalid input data");
				}

			}
			System.out.println();
		}

	}
	@Test
	public void updateresult() throws IOException {
		FileInputStream fis = new FileInputStream(".\\EXCELDATA\\Testexelfile.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			Row row=sheet.getRow(i);
			int cellcount = row.getLastCellNum()-1;		
		row.createCell(cellcount).setCellValue("https://demo.actitime.com/login.do");
		}
		// to write the contents into file user below steps
				// 1. Create an instance of FileOutStream and
			FileOutputStream fos=new FileOutputStream(".\\EXCELDATA\\Testexelfile.xlsx");
				workbook.write(fos);
				fos.flush();
				fos.close();
			
			
}
}