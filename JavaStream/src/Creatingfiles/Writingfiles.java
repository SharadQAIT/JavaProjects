package Creatingfiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writingfiles {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		//Steam Connectivity
		File f=new File("D:\\Eclipse Workspace\\Filewriting\\Test.csv");
		FileWriter fw=new FileWriter(f,true);  // True for did not append two data with each other
		BufferedWriter writer=new BufferedWriter(fw);
		
		//Writing inside the file
		
		writer.write("Sharad");
		writer.newLine();
		writer.write("AMC HighSchool");
		writer.newLine();
		writer.write("Infotech Company");
		
		writer.write("Ajay");
		writer.newLine();
		writer.write("MSM HighSchool");
		writer.newLine();
		writer.write("Solution Analyst Company");
		
		//Closing stream
		writer.close();
		System.out.println("File Created !!");
	}

}
