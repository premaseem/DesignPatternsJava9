package com.premaseem.tight;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main (String[] args) {
        TightCoupledTraveller traveller = new TightCoupledTraveller();

        Car car= traveller.getCar();
        Bike bike = traveller.getBike();
        Truck truck= traveller.getTruck();

        traveller.startJourney(car);
        traveller.startJourney(bike);
        traveller.startJourney(truck);
    }
}
