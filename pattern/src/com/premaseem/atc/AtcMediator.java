package com.premaseem.atc;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class AtcMediator {

	Flight approachingFligh;

	enum FlightStatus {
		IN_Q, IN_APPROACH, LANDED
	}

	public void grantLandingPermission(Flight flight) {
		if (approachingFligh == null) {
			approachingFligh = flight;
			flight.status = FlightStatus.IN_APPROACH;
			System.out.printf(" Landing Permission Granted to %s , START APPROACHING .... ", flight.name);

		} else {
			if (!approachingFligh.name.equalsIgnoreCase(flight.name)) {
				System.out.printf(" Landing Permission Not Granted to %s as other filght (%s) has blocked the run way", flight.name, approachingFligh.name);
			} else {
				System.out.printf(" %S you already have the permission - ", flight.name);
			}
		}
	}

	void landFlight(Flight flight) {
		if (flight.status.equals(FlightStatus.IN_APPROACH)) {
			System.out.printf("Congratulation for safe Landing %s . . . ", flight.name);
			flight.status = FlightStatus.LANDED;
			approachingFligh = null;
		} else if (flight.status.equals(FlightStatus.IN_Q)) {
			System.out.printf(" Grand permission before landing - WARNING to %s ", flight.name);
		} else {
			System.out.printf("Flight %s is already grounded  ", flight.name);
		}

	}

}
