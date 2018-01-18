package com.premaseem.loose;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class LooselyCoupledTraveller {
    Vehicle car= new Car();
    Vehicle bike = new Bike();
    Vehicle truck= new Truck();

    public Vehicle getCar () {
        return car;
    }

    public Vehicle getBike () {
        return bike;
    }

    public Vehicle getTruck () {
        return truck;
    }

    public void startJourney (Vehicle car){
        car.move();
    }

}
