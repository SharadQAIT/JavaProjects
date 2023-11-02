package demo;

import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger=org.apache.logging.log4j.LogManager.getLogger(Log4jDemo.class);
			
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("\n   Hello World....! \n");
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		
		System.out.println("\n completed");
			
	}

}



/*
 * 
 * Step 1- Add Log4j libraries in the java project
 * 			can add jar files OR maven dependency
 * Step 2- Create reference for logger in the class
 * 			class where you want to add log statements
 * 
 * Step 3- Create log4j.xml or log4j.properties file
 * 
 * 
 */









