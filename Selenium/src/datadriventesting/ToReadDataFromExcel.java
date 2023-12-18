package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/testdatascript.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String Url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	    System.out.println(Url);
	    WebDriver driver = new ChromeDriver();
	    driver.get(Url);
	    
	   /*LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	   System.out.println(date);
	   Month month = date.getMonth();
	   int day = date.getDayOfMonth();
	   int year = date.getYear();
	   System.out.println(month);
	   System.out.println(day);
	   System.out.println(year);
	   int number = (int) workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	   System.out.println(number);
	   boolean status =  workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();*/
	   
	   
	    

	}

}

