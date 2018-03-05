/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

package com.premaseem.atc;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
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


	}
}
