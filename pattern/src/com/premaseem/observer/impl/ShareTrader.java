package com.premaseem.observer.impl;
/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import com.premaseem.observer.ShareTraderObserver;

public class ShareTrader implements ShareTraderObserver {

	@Override
	public void notifyCurrentPrice(Integer shareLatestPrice,
			String shareCompanyName) {
		System.out.println();
		System.out.println(this.getClass().getSimpleName() +  " received notification for Price change ");
		System.out.printf("Price change notification - current price of %S Share is %d", shareCompanyName,shareLatestPrice);
		System.out.println();
	}
}
