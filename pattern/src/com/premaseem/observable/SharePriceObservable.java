package com.premaseem.observable;


import com.premaseem.observer.ShareTraderObserver;

public interface SharePriceObservable {

	 void addObserver (ShareTraderObserver shareTraderObserver);
	
	 void removeObserver (ShareTraderObserver shareTraderObserver);
	
	 void notifyObservers ();
	
	// This is just a work around to simulate the price from client side 
	public void setCurrentMarketPrice (Integer currentMarketPrice);
}
