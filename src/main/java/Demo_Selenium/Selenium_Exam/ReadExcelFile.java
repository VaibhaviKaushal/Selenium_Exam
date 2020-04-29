package Demo_Selenium.Selenium_Exam;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
		
	public ReadExcelFile(String excelPath) {
		
		try
		{
			File src= new File(excelPath);
			FileInputStream fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


public String getData(int sheetNumber, int row, int column) {
	sheet1= wb.getSheetAt(0);
	String data= sheet1.getRow(row).getCell(column).getStringCellValue();
	return data;
	
}

}