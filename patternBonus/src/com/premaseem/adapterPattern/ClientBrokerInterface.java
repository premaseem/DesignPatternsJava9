package com.premaseem.adapterPattern;

public interface ClientBrokerInterface {
/*
 * This method will help you to start your vm 	
 */
	void start(String id);
	void stop(String id);
	void restart(String id);

}
