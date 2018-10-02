package com.premaseem.client;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.Random;
import java.util.Scanner;

import com.premaseem.observable.SharePriceObservable;
import com.premaseem.observable.impl.AppleShares;
import com.premaseem.observable.impl.GoogleShares;
import com.premaseem.observer.ShareTraderObserver;
import com.premaseem.observer.impl.ShareTrader;

public class ClientForShareTrading {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        while (repeatRunFlag == 1) {

            System.out.println("Share trading platform designed using Observer design pattern ");
            System.out
                    .println("Notification service can be turned ON / OFF for multiple company's Share \n ");
            ShareTraderObserver shareTrader = new ShareTrader();

            SharePriceObservable appleShares = new AppleShares();
            SharePriceObservable googleShares = new GoogleShares();

            System.out
                    .println("Do you want to observe share price and get notification / updates of Apple inc. shares ? ");
            System.out.println("Press 1 for yes and 0 or other digits for no ");
            int appleShareWatch = scan.nextInt();
            if (appleShareWatch == 1) {
                appleShares.addObserver(shareTrader);
            } else {
                appleShares.removeObserver(shareTrader);
            }

            System.out
                    .println("Do you want to observe share price and get notification / updates of Google inc. shares ? ");
            System.out.println("Press 1 for yes and 0 or other digits for no ");
            int googleShareWatch = scan.nextInt();
            if (googleShareWatch == 1) {
                googleShares.addObserver(shareTrader);
            } else {
                googleShares.removeObserver(shareTrader);
            }

            System.out.println("Simulating price change in Stock Market ^^--__-_-^^  ");
            simulateSharePriceChange(appleShares);
            simulateSharePriceChange(googleShares);
            System.out.println("========================================");
            System.out
                    .println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
            repeatRunFlag = scan.nextInt();
        }
    }

    public static void simulateSharePriceChange (
            SharePriceObservable sharePriceObservable) {
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            sharePriceObservable.setCurrentMarketPrice(rnd.nextInt());
        }
    }
}

/** Lesson Learnt
 * Pooling or continuous monitoring is not required
 * Loose coupling between Share trader (client-observer)
 * and Share company (subject-observable)
 * */