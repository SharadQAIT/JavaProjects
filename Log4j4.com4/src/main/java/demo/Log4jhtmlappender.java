package demo;

import org.apache.logging.log4j.Logger;

public class Log4jhtmlappender {

	private static Logger log=org.apache.logging.log4j.LogManager.getLogger(Log4jhtmlappender.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("\n   Hello World....! \n");
		log.debug("This is trace message");
		log.info("This is information message");
		log.error("This is an error message");

	//	System.out.println("\n completed");
			
	// The HTML file appender is not succesfully executed. 

	}

}
