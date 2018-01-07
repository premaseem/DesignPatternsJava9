package com.premaseem.tight;

import com.premaseem.tight.Bike;
import com.premaseem.tight.Car;
import com.premaseem.tight.Truck;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class TightCoupledTraveller {
    Car car= new Car();
    Bike bike = new Bike();
    Truck truck= new Truck();

    public Car getCar () {
        return car;
    }

    public Bike getBike () {
        return bike;
    }

    public Truck getTruck () {
        return truck;
    }

    public void startJourney (Car car){
        car.move();
    }

    public void startJourney (Bike bike){
        bike.move();
    }

    public void startJourney (Truck truck){
        truck.move();
    }



}
