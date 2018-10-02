package com.premaseem;

import com.premaseem.factory.PizzaBase;
import com.premaseem.factory.PizzaFactory;

import java.util.Scanner;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        while (repeatRunFlag == 1) {

            System.out.println("This is the Client Main Factory Pattern ");

            System.out.println("What kind of Pizza would you like to have ? ");
            System.out.println("Enter veg for veg pizza ");
            System.out.println("Enter non-veg for Non veg pizza ");
            System.out.println("Enter max for Non Mexican pizza ");

            String pizzaType =   scan.next();
            PizzaBase pizza = PizzaFactory.getPizza(pizzaType);

            System.out.println("Your final order is");
            System.out.println(pizza.getDescription());
            System.out.println("Toal cost of order is " + pizza.getCost());
            System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
            System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
            try{
                repeatRunFlag = scan.nextInt();
            }catch(Exception e){
                repeatRunFlag = 0;
            }
        }
    }
}
