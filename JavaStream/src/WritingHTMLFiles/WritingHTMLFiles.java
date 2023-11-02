package WritingHTMLFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingHTMLFiles 

{
	public static void main(String[] args) throws IOException {
		
		
		// Connectivity Steam
				File f=new File("D:\\Eclipse Workspace\\Filewriting\\Test.html");
				FileWriter fw=new FileWriter(f);  // True for did not append two data with each other
				BufferedWriter Writer=new BufferedWriter(fw);
				
				
				//Read HTML file
				Writer.write("<html><body><title>Way 2 Automation</title><h1>Learning java from way2Automation</h1></body></html>");
				Writer.close();
				System.out.println("HTML File Created !!");
			}
}
