package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import com.premaseem.icecreams.IceCream;
import com.premaseem.milkshake.MilkShake;

import java.util.Scanner;

public class Client {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ice cream Abstract factory example ");


        System.out.println("What you would like to order ... ");
        System.out.println("Icecream");
        System.out.println("Milkshake");
        String choice = scan.next();

        System.out.println("Please enter your ice cream flavor ... ");
        System.out.println("Strawberry");
        System.out.println("Chocolate");
        String flavor = scan.next();

        System.out.println("Please enter the Brand of Ice cream ... ");
        System.out.println("Dairy Queen");
        System.out.println("Amul");
        String brand = scan.next();

        AbstractIceCreamFactory factory = FactoryCreator.getFactory(brand);

        // Virtual constructor ( takes care of configuration )
        if ( choice.equalsIgnoreCase("icecream")) {
            IceCream iceCream = factory.createIceCream(flavor);
            System.out.println(iceCream);
        }else {
            MilkShake milkShake = factory.createMilkShake(flavor);
            System.out.println(milkShake);
        }

        // Family of similar products with different brands. ( Tight couple)
//        DairyQueenStrawberryIceCream dairyQueenStrawberryIceCream =null;
//        DairyQueenChocolateIceCream dairyQueenChocolateIceCream = null;
//        AmulStrawberryIceCream amulStrawberryIceCream =null;
//        AmulChocolateIceCream amulchocolateIceCream = null;

//        // Sphegati code with if else ladder
//        if (iceCreamBrand.equalsIgnoreCase("Amul")
//                && iceCreamChoice.equalsIgnoreCase("Strawberry")){
//            amulStrawberryIceCream = new AmulStrawberryIceCream();
//
//        }else if (iceCreamBrand.equalsIgnoreCase("Amul") &&
//                iceCreamChoice.equalsIgnoreCase("Chocolate")){
//            amulchocolateIceCream = new AmulChocolateIceCream();
//
//        }else if (iceCreamBrand.equalsIgnoreCase("Dairy Queen")
//                && iceCreamChoice.equalsIgnoreCase("Strawberry")){
//            dairyQueenStrawberryIceCream = new DairyQueenStrawberryIceCream();
//
//        }else if (iceCreamBrand.equalsIgnoreCase("Dairy Queen") &&
//                iceCreamChoice.equalsIgnoreCase("Chocolate")){
//            dairyQueenChocolateIceCream = new DairyQueenChocolateIceCream();
//        }
//
//        // Ice cream of your choice is :
//        System.out.print("Ice cream of your choice is ");
//        if (amulStrawberryIceCream != null){
//            System.out.println(amulStrawberryIceCream);
//        }
//        if (amulchocolateIceCream != null){
//            System.out.println(amulchocolateIceCream);
//        }
//        if (dairyQueenStrawberryIceCream != null){
//            System.out.println(dairyQueenStrawberryIceCream);
//        }
//        if (dairyQueenChocolateIceCream != null){
//            System.out.println(dairyQueenChocolateIceCream);
//        }

    }
}
