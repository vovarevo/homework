package com.solvd.solvdTasks.files;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FileRunner {
	private static final Logger LOGGER = LogManager.getLogger(FileRunner.class);
	
	public static void main(String[] args) throws IOException {
		
		//
		try {
			File textFile = new File("src/main/resources/textfile.txt");
			MyFileUtils.countWords(textFile);
			
		} catch (IOException e) {
			LOGGER.error("Can't find some of the files",e);
		}
		
	}
}
