package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day15_Log4J2 {

/*

    2. Create a class : Day_Log4j
    3. Create Logger object:
        private static Logger logger = LogManager.getLogger(Demo1.class.getName());
    4. User logger object to add info
                     logger.debug("This is debug logger");
            logger.info("This is info logger");
            logger.error("This is error logger");
            logger.fatal("This is fatal logger");
    5. Check the console for logs. By default logger logs error or fatal        */



    //Create Logger object:
    private static Logger logger = LogManager.getLogger(Day15_Log4J2.class.getName());
    //Logger-->choose from -->org.apache.logging.log4j
    //select LogManager from org.apache.logging.log4j


    @Test
    public void log4JTest() {

        //User logger object to log/print information
        logger.fatal("Fatal log !!!");
        logger.error("Error Log !!!");
        logger.warn("Warning Log !!!");
        logger.debug("Debug Log !!!");
        logger.info("Info Log !!!");

        //Standart Level : off-fatal-error-warn-info-debug-trace-all   -->resources-->log4j2.xml-->choose the level

    }
}
