package alpha;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Demo {

 // Define a static logger variable so that it references the
 // Logger instance named "Demo".
 private static final Logger log = (Logger) LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		
	
		
		//logging is used to print in console
	//	log.debug("I am debugging");
		if( 5>4)
			log.info("object is present");
	
			log.error("Object is not present");
			
		
		log.fatal("it is fatal");
		
	}

}
