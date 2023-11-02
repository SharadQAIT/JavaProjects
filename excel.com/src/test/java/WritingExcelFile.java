

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFile 

{
	
	// https://prnt.sc/rMur-X5GOlFU - Apache POI implmentation Diagram including interface and classes
	
	public static void main(String[] args) throws IOException {
		
	
		XSSFWorkbook Workbook=new XSSFWorkbook();
		
		XSSFSheet Sheet0=Workbook.createSheet("FirstSheet");
		
	/*	Row row0=Sheet0.createRow(0);
		
		Cell cell0=row0.createCell(0);
		Cell cell1=row0.createCell(1);
		cell0.setCellValue("FirstCell");
		cell1.setCellValue("SecondCell"); 
											*/ 
		
		for(int rows=0; rows<10;rows++)
		{
			Row row=Sheet0.createRow(rows);
			
			for(int cols=0;cols<10;cols++)
			{
				
				Cell cell=row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
			
		}
				
		//Connecting Streams
		
		File f=new File("D:\\Eclipse Workspace\\Filewriting\\RandomExcelFileData.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		Workbook.write(fo);
		
		
		//Closing the steam
		fo.close();
		System.out.println("File Created !!!");

}
}
