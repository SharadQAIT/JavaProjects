package demo;

import org.apache.logging.log4j.Logger;

public class Log4jEmail {

	private static Logger log=org.apache.logging.log4j.LogManager.getLogger(Log4jEmail.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("\n   Hello World....! \n");
		log.debug("This is trace message");
		log.info("This is information message");
		log.error("This is an error message");

	//	System.out.println("\n completed");
			
		// Also the mail is not recevied after configured.
	}

}
