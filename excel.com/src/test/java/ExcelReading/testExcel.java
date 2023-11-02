package ExcelReading;

import org.apache.log4j.Logger;

public class testExcel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Logger log=Logger.getLogger("devpinoyLogger");
		
		ExcelReader excel=new ExcelReader("D:\\Eclipse Workspace\\Filewriting\\ExcelReadWriteFile.xlsx");
		String sheetName="trainer";
		
		log.debug("Getting the row count");
		
		System.out.println(excel.getRowCount(sheetName));
		
		log.debug("Getting the column count");
		System.out.println(excel.getColumnCount(sheetName));
		
		log.debug("Getting the data");
		System.out.println(excel.getCellData(sheetName, "Username", 2));
		log.debug("Getting the data");

		System.out.println(excel.getCellData(sheetName, "Username", 3));
		excel.setCellData(sheetName, "Username", 4, "Siddhant");
		excel.setCellData(sheetName, "Password", 4, "Siddhant@123");
		excel.setCellData(sheetName, "Status", 4, "Active");


	}

}
