package ReadingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public static void main(String[] args) throws IOException, OpenXML4JException 
	{
		File src = new File("D:\\Eclipse Workspace\\Filewriting\\SampleExcel.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		
		Row row=sheet1.getRow(1);
		Cell cel0=row.getCell(0);
		System.out.println("Username is"+" "+cel0);
		
		Row row1=sheet1.getRow(2);
		Cell cel1=row.getCell(1);
		System.out.println("Password is"+" "+cel1);
		
		
		fis.close();
		}
		
 
}

