package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// MergeBase: Vulnerable Versions of Java Libraries for GRADLE
public class Main {
    public static void main(String[] args) {
        // Uses Log4j 2.15.0
        final Logger logger = LogManager.getLogger();
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");


    }
}