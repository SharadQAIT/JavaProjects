package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testcase1 

{
	public static void main(String[] args) throws IOException 
	{
		Properties obj=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		obj.load(fis);
		System.out.println(obj.getProperty("Name"));
		System.out.println(obj.getProperty("Age"));
		System.out.println(obj.getProperty("Course"));
		System.out.println(obj.getProperty("Salary"));
		System.out.println(System.getProperty("user.dir"));

		
	/*
	 * 		FileInputStream fis=new FileInputStream("D:\\Eclipse Workspace\\Java_Tutorials\\JavaPropertiesexcel\\src\\config\\object.properties");
	 *		File path is above given
	 *		We can fetch automatically file name from system. When file will run on other system then call this command system.getproperty("user.dir").
	 *	
	 */

	}

}
