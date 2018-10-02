/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/2014/10/04/mediator-design-pattern/
*/

package com.premaseem.atc;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		System.out.println("Welcome to Air Traffic Control program which uses Mediator design based architecture");
		Scanner scan = new Scanner(System.in);

		// Object initialization block
		AtcMediator atcMediator = new AtcMediator();
		Flight inOperationFlight;
		Flight flight1 = new Flight(atcMediator, "Air India ");
		Flight flight2 = new Flight(atcMediator, "American Air Lines ");
		Flight flight3 = new Flight(atcMediator, "British Air ways ");

		// User input block
		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Which flight do you want to operate  ? ");
			System.out.println("press 1 for Air India");
			System.out.println("press 2 for American Air Lines ");
			System.out.println("press 3 for British Air ways ");

			int choice = scan.nextInt();
			if (choice == 1) {
				inOperationFlight = flight1;
			} else if (choice == 2) {
				inOperationFlight = flight2;
			} else {
				inOperationFlight = flight3;
			}

			// Flight should not land directly before taking grant from ATC
            // Decision making logic / algorithm resides in Mediator class
			System.out.println("What do you want to do with the flight " + inOperationFlight.name);
			System.out.println(" Press 1 to Grant landing permission ");
			System.out.println(" Press 2 to Land the Flight ");

			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					inOperationFlight.grantLandingPermission();
					break;
				case 2:
					inOperationFlight.landFlight();
					break;

				}
			} catch (Exception e1) {
				System.out.println("################ Access is not valid ###############");
			}
			System.out.println("\n=============================");

			System.out.println("Press No to Exit and any other character to Continue flight operations  .... ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "no";
			}

		}

        // Lessons Learnt
        // Classes are loosely coupled with Client
        // Core decision making logic is centralized in Mediator class
        // Decision making process is fast and effective

		/*** BEFORE CODE ***
		System.out.println("Welcome to Air Traffic Control program ");

		// Create flight objects
		Flight_ flight1 = new Flight_();
		Flight_ flight2 = new Flight_();
		Flight_ flight3 = new Flight_();

		// Set objects status and communicate to other classes
		flight1.setFlightStatus(Flight_.FlightStatus.IN_APPROACH);
		flight1.coordianteWithOtherFlight(flight2);
		flight1.coordianteWithOtherFlight(flight3);

		flight2.setFlightStatus(Flight_.FlightStatus.IN_Q);
		flight2.coordianteWithOtherFlight(flight1);
		flight2.coordianteWithOtherFlight(flight3);

		flight3.setFlightStatus(Flight_.FlightStatus.IN_APPROACH);
		flight3.coordianteWithOtherFlight(flight1);
		flight3.coordianteWithOtherFlight(flight2);

		System.out.println("Current Fight informs other flights of its current position /status " );
		System.out.println("In case of clashes, one on one communication might delay decisions and cause accidents ");

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.me  $$$$$$$$$$$$$$$$$$$$$$ \n ");


		// $$$ Lesson Learnt - BEFORE CODE $$$
		// Tight coupling, Client needs to know about each flight.
		// When number of objects are more, code becomes complex and confusing
		// Communication between classes is not effective,
*/

	}
}
