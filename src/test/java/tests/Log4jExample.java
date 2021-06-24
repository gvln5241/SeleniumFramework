package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
	static Logger logger = LogManager.getLogger(Log4jExample.class);

	public static void main(String[] args) {
		System.out.println("hi");
		logger.info("info from 4j");
		logger.error("error from 4j");
		logger.trace("trace message");

	}

}
