package com.premaseem.observer.impl;

import com.premaseem.observer.ShareTraderObserver;

public class ShareTrader2 implements ShareTraderObserver {
	@Override
	public void notifyCurrentPrice(Integer shareLatestPrice,
			String shareCompanyName) {
		System.out.println();
		System.out.println(this.getClass().getSimpleName() +  ": Notified $$ ");
		System.out.printf("Latest price of %S Share is %d ", shareCompanyName,shareLatestPrice);
		System.out.println();
	}
}
