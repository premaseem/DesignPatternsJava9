package com.premaseem.chainOfResponsibility.loggerProgram;

public abstract class LogHandler {

	
	public enum LOG_LEVEL {
		INFO(5),
		DEBUG(4),
		ERROR(3),
		FATAL(2),
		CRITICAL(1);
		
		Integer priority =1;
		 LOG_LEVEL(int priorityLevel){
			 priority = priorityLevel;
		}
	}
	
	LogHandler nextHandler = null;

	public void setNextHandler(LogHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void handler(String message) {
			System.out.printf(" %s console is printing message = %S \n " , this.getClass().getSimpleName(), message );
		if(nextHandler !=null){
			nextHandler.handler(message);
		}
	}
}

class AllLogLevelHandler extends LogHandler{
	
}

class DebugLogHandler extends LogHandler{
	
}

class ErrorLogHandler extends LogHandler{
	
}

class FatalLogHandler extends LogHandler{
	
}

class CriticalLogHandler extends LogHandler{
	
}
