package com.premaseem.ambulanceBuilder;

import java.util.Scanner;


public class ClientForAmbulanceBuilder {

	public static void main(String[] args) {

		System.out.println("Welcome to Abmulance Builder project  ");
		Scanner scan = new Scanner(System.in);

		int repeatRunFlag = 1;
		AmbulanceBuilder ambulanceBuilder = new AmbulanceBuilder();
		Ambulance ambulance = null;
		while (repeatRunFlag == 1) {
			System.out.println("What kind of Ambulance you want ? ");
			System.out.println("press 1 for 4 Wheeler");
			System.out.println("press 2 for 6 Wheeler ");
			System.out.println("press 3 for 8 Wheeler ");
			
			int numberOfWheel = scan.nextInt();
			
			System.out.println("What kind lable you want for Ambulance ? ");
			String label = scan.next();
			
				ambulance = ambulanceBuilder.buildAmbulance(numberOfWheel, label);

			
			System.out.println("Ambulanc is build " + ambulance);
			System.out.println("=============================");

			System.out.println("Press 1 to Repeat .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");	

	}



}
