package com.premaseem.observable.impl;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.ArrayList;

import com.premaseem.observable.SharePriceObservable;
import com.premaseem.observer.ShareTraderObserver;

public class GoogleShares implements SharePriceObservable{

	public ArrayList<ShareTraderObserver> shareBrokers = new ArrayList<ShareTraderObserver>();
	private Integer currentMarketPrice=0;
	
	@Override
	public void addObserver(ShareTraderObserver shareTraderObserver) {
		shareBrokers.add(shareTraderObserver);
		
	}

	@Override
	public void removeObserver(ShareTraderObserver shareTraderObserver) {
		shareBrokers.remove(shareTraderObserver);
		
	}

	@Override
	public void notifyObservers() {
	for(ShareTraderObserver shareBroker :shareBrokers){
		shareBroker.notifyCurrentPrice(getCurrentMarketPrice()," Google Inc. ");
	} 
		
	}

	public Integer getCurrentMarketPrice() {
		return currentMarketPrice;
	}

	public void setCurrentMarketPrice(Integer currentMarketPrice) {
		this.currentMarketPrice = currentMarketPrice;
		notifyObservers();
	}
}
