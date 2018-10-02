package com.premaseem.atc;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/


public class Flight_ {



    enum FlightStatus {
        IN_Q, IN_APPROACH, LANDED
    }
    FlightStatus flightStatus;

    public void setFlightStatus(FlightStatus fs){
         flightStatus = fs;
    }

    public void coordianteWithOtherFlight(Flight_ flight_){
  }

}
