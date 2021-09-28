package com.group3.data;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.log4j.*;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.ConsoleAppender;

public class UserLogger {

	static final Logger logger = Logger.getLogger(UserLogger.class);

	public static void main(String[] args) {
		ConsoleAppender consoleAppender = new ConsoleAppender();
		consoleAppender.setThreshold(Level.ALL);
		consoleAppender.setLayout(new PatternLayout ("%d [%p|%c|%C{1}] %m%n"));
		consoleAppender.activateOptions();
		Logger.getRootLogger().addAppender(consoleAppender);
		Logger.getRootLogger().addAppender(new MyAppender());
		
		String username = "John Doe";
		Logger.info("User search history. (username " +username+ " )");
		Logger.error("User log error. (username \" +username+ \" )"),
		new Exception()
	};

	try

	{

	}catch(
	Exception e)
	{
		logger.warn(e.getMessage(), e);
	}
}
