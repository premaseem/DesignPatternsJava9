package com.premaseem.singleton;


import java.util.Scanner;


public class ClientForSingletonEagerInstance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Singleton eager instance ");

			SingletonEagerInstance.uniqueInstance.doCounting();
			SingletonEagerInstance.uniqueInstance.doCounting();
			SingletonEagerInstance.uniqueInstance.doCounting();
			
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
