package com.premaseem.loose;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main (String[] args) {
        LooselyCoupledTraveller traveller = new LooselyCoupledTraveller();

        // Here client does not need to know about implementor

        Vehicle car= traveller.getCar();
        Vehicle bike = traveller.getBike();
        Vehicle truck= traveller.getTruck();
        // Easy to add any other vehicle without
        // Vehicle plane= traveller.getPlane();

        traveller.startJourney(car);
        // Polymorphism in full force
        traveller.startJourney(bike);
        traveller.startJourney(truck);

    // Take Away:
    // Class needs not to be modified or changes, compiled or retested
    // when any sub class needs to be added or changed.
    // All classes are independent

    }
}
