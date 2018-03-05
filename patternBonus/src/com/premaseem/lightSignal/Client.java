package com.premaseem.lightSignal;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		System.out.println("Welcome to Traffic light signal program which uses Mediator ");
		System.out.println(" Out of 3 button only 1 could be ON and others has to in OFF state ");
		Scanner scan = new Scanner(System.in);

		// Object initialization block
		LightMediator LightMediator = new LightMediator();
		Light red = new RedLight(LightMediator);
		Light yellow = new YellowLight(LightMediator);
		Light green = new GreenLight(LightMediator);
		

		// User input block
		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Which light you want to turn on  ? ");
			System.out.println("press 1 for RED");
			System.out.println("press 2 for YELLOW ");
			System.out.println("press 2 for GREEN  ");

			int choice = scan.nextInt();
			if (choice == 1) {
				red.turnON();
			} else if(choice == 2) {
				yellow.turnON();
			} else{
				green.turnON();
			}

			System.out.println("\n=============================");

			System.out.println("Press No to Exit and any other character to repeat  .... ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "no";
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.me  $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}

