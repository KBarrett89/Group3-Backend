package com.group3.data;

import java.util.logging.SimpleFormatter;

public class Log {
	public Logger logger;
	FileHandler fh;

	public Log(String UserSearchLog);throws SecurityException,IOException

	{
		File f = new File(file_name);
		if (!f.exists()) {
			f.createNewFile();
		}

		fh = new FileHandler(UserSearchLog, true);
		logger = Logger.getLogger("test");
		logger.addHandler(fh);
		SimpleFormatter farmatter = new SimpleFormatter();
		fh.setFormatter(formatter);
	}
}
