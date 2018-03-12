package com.premaseem.observer;

public interface ShareTraderObserver {

	public void notifyCurrentPrice (Integer shareLatestPrice, String shareCompanyName);
	
}
