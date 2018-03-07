package com.premaseem.chainOfResponsibility.loggerProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientFileForLoggerProgram {

	public static void main(String[] args) {

		System.out.println("Welcome to Logger program designed using Chain of Responsibility ");
		Scanner scan = new Scanner(System.in);
		LogHandler logHandler;
		LogHandler allLogLevelHandler = new AllLogLevelHandler();
		LogHandler debugLogHandler = new DebugLogHandler();
		LogHandler errorLogHandler = new ErrorLogHandler();
		LogHandler fatalLogHandler = new FatalLogHandler();
		LogHandler criticalLogHandler = new CriticalLogHandler();

		// Setting up the chain
		allLogLevelHandler.setNextHandler(debugLogHandler);
		debugLogHandler.setNextHandler(errorLogHandler);
		errorLogHandler.setNextHandler(fatalLogHandler);
		fatalLogHandler.setNextHandler(criticalLogHandler);

		// Log level priority, high rank covers all below handlers
		List<LogHandler> logHandlers = new ArrayList<LogHandler>(10);
		logHandlers.add(0,allLogLevelHandler);
		logHandlers.add(1,debugLogHandler);
        logHandlers.add(2,errorLogHandler);
        logHandlers.add(3,fatalLogHandler);
        logHandlers.add(4,criticalLogHandler);

		String repeatRunFlag = "y";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Please enter message to be logged ");
			String message = scan.next();
			System.out.println("Please choose the level from 1 to 5 for logging ");
			System.out.println("INFO(5),		DEBUG(4),		ERROR(3),		FATAL(2),		CRITICAL(1)");
			try{
			int choice = scan.nextInt();
				logHandler = logHandlers.get(choice);
			}catch (Exception e){
				logHandler = logHandlers.get(0);
			}

			logHandler.handler(message);

			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat ....  ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "n";
			}
		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.me  $$$$$$$$$$$$$$$$$$$$$$ \n ");
	}
}
