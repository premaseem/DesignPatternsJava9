package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/

import com.premaseem.icecreams.ChocolateIceCream;
import com.premaseem.icecreams.IceCream;
import com.premaseem.icecreams.StrawberryIceCream;

import java.util.Scanner;

public class Client {
    public static void main (String[] args) {
        System.out.println("Ice cream factory example ");
        System.out.println("Please enter your ice cream choice");
        System.out.println("Strawberry");
        System.out.println("Chocolate");

        Scanner scan = new Scanner(System.in);
        String iceCreamChoice =   scan.next();

//        Tight coupling
//        StrawberryIceCream strawberryIceCream =null;
//        ChocolateIceCream chocolateIceCream = null;

        // Loose coupling using interface
        IceCream iceCream = null;

//        Sphegati code with if else ladder
//        if (iceCreamChoice.equalsIgnoreCase("Strawberry")){
//            strawberryIceCream = new StrawberryIceCream();
//        }else if (iceCreamChoice.equalsIgnoreCase("Chocolate")){
//            chocolateIceCream = new ChocolateIceCream();
//        }

        // Crisp, reusable, centralized code using factory
        // IceCreamFactory iceCreamFactory = new IceCreamFactory();

        // Virtual constructor ( takes care of configuration )
        iceCream = IceCreamFactory.createIceCream(iceCreamChoice);

//        Repeatative code to even print
//        System.out.print("Ice cream of your choice is ");
//        if (strawberryIceCream != null){
//            System.out.println(strawberryIceCream);
//        }
//
//        if (chocolateIceCream != null){
//            System.out.println(chocolateIceCream);
//        }

        System.out.print("Ice cream of your choice is "+ iceCream.getIceCreamName());
        System.out.println(iceCream);

        System.out.println("Lessons Learnt");
        System.out.println("Creation is easy and simplified with virtual constructor");
        System.out.println("Centralized code easy to maintain and extend");
        System.out.println("Loosely coupled code with interface");
        System.out.println("Polymorphism in full force");

    }
}
