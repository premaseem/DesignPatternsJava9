package com.premaseem.abstractFactory;

import java.util.Scanner;

public class ClientForPizzaFactory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Abstract Factory Pattern containing all ");

			System.out.println("What kind of Pizza would you like to have Jain Pizza or General Pizza ? ");
			System.out.println("Press Jain / general ");
			String pizzafactory = scan.next();

			System.out.println("Enter veg for veg pizza ");
			System.out.println("Enter corn for corn pizza ");
			String pizzaType = scan.next();
			PizzaStore pizzaStore = new PizzaStore();
			Pizza pizza = pizzaStore.orderPizza(pizzafactory, pizzaType);

			// PizzaBase pizza = PizzaFactory.getPizza(pizzaType);

			System.out.println("Your final order is");
			pizza.getDescription();
			System.out.println("Toal cost of order is " + pizza.getCost());
			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}
		}
	}
}
