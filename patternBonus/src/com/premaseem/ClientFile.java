package com.premaseem;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Party host example which uses visitor pattern ");
		Scanner scan = new Scanner(System.in);
		Party party;
		CookVisitorI visitorCook;
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			System.out.println("Which party do you want to host ");
			System.out.println("press 1 for Loud party ");
			System.out.println("press 2 for Silent party ");
			int tvType = scan.nextInt();
			if (tvType == 1) {
				party = new LoudParty();
			} else {
				party = new CalmParty();
			}

			System.out.println("How would you want to manage cooking of food  ");
			System.out.println(" Press 1 for a visitor Veg Cook ");
			System.out.println(" Press 2 for a visitor Non- Veg Cook  ");
			System.out.println(" Press 3 for in house cooking (no visitor) ");

			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					visitorCook = new VegCookVisitor();
					party.accept(visitorCook);
					break;
				case 2:
					visitorCook = new NonVegCookVisitor();
					party.accept(visitorCook);
					break;
				case 3:
					party.cookInHouse();
					break;
				}
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("=============================");
			System.out.println("Press 1 to Repeat .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}
	}
}
