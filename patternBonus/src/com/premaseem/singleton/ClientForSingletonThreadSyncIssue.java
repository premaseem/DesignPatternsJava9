package com.premaseem.singleton;

import java.util.Scanner;

public class ClientForSingletonThreadSyncIssue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Singleton Thread issue, there is a fair chance of multiple instiances creation by multiple threads  ");

			Thread thread1 = new Thread() {
				public void run() {
					System.out.println("Thread1 Running");
					SingletonSyncInstance.getInstance().doCounting();
					;
				}
			};
			thread1.start();

			Thread thread2 = new Thread() {
				public void run() {
					System.out.println("Thread2 Running");
					SingletonSyncInstance.getInstance().doCounting();
				}
			};
			thread2.start();

			Thread thread3 = new Thread() {
				public void run() {
					System.out.println("Thread3 Running");
					SingletonSyncInstance.getInstance().doCounting();
					;
				}
			};
			thread3.start();

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
