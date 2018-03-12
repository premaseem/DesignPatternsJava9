package com.premaseem.observable.impl;
/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.ArrayList;

import com.premaseem.observable.SharePriceObservable;
import com.premaseem.observer.ShareTraderObserver;

public class AppleShares implements SharePriceObservable {

    public ArrayList<ShareTraderObserver> shareTraders = new ArrayList<ShareTraderObserver>();
    private Integer currentMarketPrice = 0;

    @Override
    public void addObserver (ShareTraderObserver shareTraderObserver) {
        shareTraders.add(shareTraderObserver);

    }

    @Override
    public void removeObserver (ShareTraderObserver shareTraderObserver) {
        shareTraders.remove(shareTraderObserver);

    }

    @Override
    public void notifyObservers () {
        for (ShareTraderObserver shareBroker : shareTraders) {
            shareBroker.notifyCurrentPrice(getCurrentMarketPrice(), " Apple Inc.  ");
        }

    }

    public Integer getCurrentMarketPrice () {
        return currentMarketPrice;
    }

    public void setCurrentMarketPrice (Integer currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
        notifyObservers();
    }
}
