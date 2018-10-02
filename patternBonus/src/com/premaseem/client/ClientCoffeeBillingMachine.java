package com.premaseem.client;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.Scanner;

import com.premaseem.decorator.AbstractCoffee;
import com.premaseem.decorator.addons.Chokos;
import com.premaseem.decorator.addons.Cream;
import com.premaseem.decorator.addons.Whip;
import com.premaseem.decorator.basecoffee.ColdCoffee;
import com.premaseem.decorator.basecoffee.HotCoffee;

public class ClientCoffeeBillingMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("Welcome to Coffee Billing Machine Project which uses Decorator Design pattern ... ");

			System.out.println("What kind of coffee would you like to have ? ");
			System.out.println("Press 1 for Hot Coffee ");
			System.out.println("Press 2 for Cold Coffee ");
			Integer coffeeType =   scan.nextInt();
			AbstractCoffee coffee;
			if(coffeeType == 1){
				coffee = new HotCoffee();
			}else{
				coffee = new ColdCoffee();
			}
			
			System.out.println("Do you want Cream ? ");
			System.out.println("Press 1 for YES and 0 for NO ");

			if(scan.nextInt() == 1){
				coffee = new Cream(coffee);
			}
			
			System.out.println("Do you want Whip ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			if(scan.nextInt() == 1){
				coffee = new Whip(coffee);
			}
			
			System.out.println("Do you want Chokos ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			if(scan.nextInt() == 1){
				coffee = new Chokos(coffee);
			}
			
			System.out.println("Your final order is");
			System.out.println(coffee.getDescription());
			System.out.println("Total cost of order is " + coffee.getCost());
			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}
}
