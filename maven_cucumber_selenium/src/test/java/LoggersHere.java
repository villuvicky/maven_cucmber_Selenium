import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggersHere {

	
	private static final Logger LOGGER = (Logger) LogManager.getLogger(LoggersHere.class.getName());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.debug("Debug Message Logged !!!");
		LOGGER.info("Info Message Logged !!!");
	}

}
