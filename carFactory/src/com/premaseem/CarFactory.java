package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/

//Class: Factory Design pattern to generate cars based on input parameter
public class CarFactory {

    public static void main(String[] args) {
        System.out.println("Car factory creating Cars based on params ");
        Generator generator = new Generator();

        Car car = generator.factory("racecar");
        car.drive();

        car = generator.factory("Van");
        car.drive();
    }

}

class Generator{
    Car factory(String type){
        if (type.equalsIgnoreCase("racecar")){
            return new Racecar();
        }
        if (type.equalsIgnoreCase("Van")){
            return new Van();
        }
        if (type.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        return null;
    }
}
interface Car{
    void drive();
}

class Racecar implements Car{
    public void drive(){
        System.out.println("Racecar driving.");
    }
}

class Van implements Car{
    public void drive(){
        System.out.println("Van driving.");
    }
}

class SUV implements Car{
    public void drive(){
        System.out.println("SUV driving.");
    }
}


