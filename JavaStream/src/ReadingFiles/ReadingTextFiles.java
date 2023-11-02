package ReadingFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingTextFiles 

{
	public static void main(String[] args) throws IOException {
		
	
	// Connectivity Steam
			File f=new File("D:\\Eclipse Workspace\\Filewriting\\Test.txt");
			FileReader fw=new FileReader(f);  // True for did not append two data with each other
			BufferedReader reader=new BufferedReader(fw);
			
			
			//Read Text file
			String line=null;
			while((line=reader.readLine())!=null)	
			{
			System.out.println(line);
			}

			System.out.println("File Read it !!");
		}

}
