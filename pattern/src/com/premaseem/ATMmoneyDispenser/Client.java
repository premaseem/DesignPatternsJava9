package com.premaseem.ATMmoneyDispenser;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		System.out.println("Welcome to ATM Money dispenser program designed using Chain of Responsibility");
		Scanner scan = new Scanner(System.in);
		
		MoneyChainHandler hundredDollarHandler_100 = new HundrenDollarHandler_100(100);
		MoneyChainHandler fiftyDollarHandler_50 = new FiftyDollarHandler_50(50);
		MoneyChainHandler tenDollarHandler_10 = new TenDollarHandler_10(10);
		MoneyChainHandler fiveDollarHandler_5 = new FiveDollarHandler_5(5);
		MoneyChainHandler twoDollarHandler_2 = new TwoDollarHandler_2(2);
		MoneyChainHandler oneDollarHandler_1 = new OneDollarHandler_1(1);
		
		// Setting up the change
		hundredDollarHandler_100.setNextHandler(fiftyDollarHandler_50);
		fiftyDollarHandler_50.setNextHandler(tenDollarHandler_10);
		tenDollarHandler_10.setNextHandler(fiveDollarHandler_5);
		fiveDollarHandler_5.setNextHandler(twoDollarHandler_2);
		twoDollarHandler_2.setNextHandler(oneDollarHandler_1);

		String repeatRunFlag = "y";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Please enter amount you want to withdraw eg 3450 ");
			int choice = scan.nextInt();
            hundredDollarHandler_100.handler(choice);

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
