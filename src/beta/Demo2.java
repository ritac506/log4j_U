package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Demo2 {

// Define a static logger variable so that it references the
// Logger instance named "Demo".
private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(Demo2.class.getName());
	
	public static void main(String[] args) {
		
		//logging is used to print in console
	//	log.debug("I am debugging");
		if( 5>4)
			log.info("object is present");
	
			log.error("Object is not present");
			
		
		log.fatal("it is fatal");
		
	}

}



