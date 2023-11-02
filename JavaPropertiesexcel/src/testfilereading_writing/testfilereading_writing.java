package testfilereading_writing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testfilereading_writing {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		// Apache POI is java API and which used to handle microsoft .xls and XLSX file https://prnt.sc/YaWm73ovOk8E 
		// for dealing with excel(97--2003) file format, HSSF API is used. for .xls files
		//for dealing with .xlsx file format, XSSF API is used. for .xlsx files
		
		
		
		
		//Create a file
		File file=new File("D:\\Eclipse Workspace\\Filewriting\\TestNew.txt");
		file.createNewFile();
		
		//Write inside a file
		FileWriter f1=new FileWriter(file);
		BufferedWriter filewrite=new BufferedWriter(f1);
		//System.out.println("Please add details inside a file");

		filewrite.write("Sharad khairnar"+" ");
		filewrite.write("Sarthak Joglekar");
		filewrite.flush();
		
		
		//Read form a file
		
		FileReader fr=new FileReader("D:\\Eclipse Workspace\\Filewriting\\TestNew.txt");
		BufferedReader filereader=new BufferedReader(fr);
	//	System.out.println("The data read it");
	//	System.out.println(filereader.read());
		System.out.println(filereader.readLine());

	}

}
