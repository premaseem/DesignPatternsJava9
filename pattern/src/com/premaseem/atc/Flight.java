package com.premaseem.atc;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import com.premaseem.atc.AtcMediator.FlightStatus;

public class Flight {

	FlightStatus status;
	AtcMediator atcMediator=null;
	public String name;

	public Flight(AtcMediator atcMediator, String flightName) {
		status = FlightStatus.IN_Q;
		name = flightName;
		this.atcMediator = atcMediator;
	}

	void grantLandingPermission(){
		atcMediator.grantLandingPermission(this);
	}

	void landFlight(){
		atcMediator.landFlight(this);
	}
}
