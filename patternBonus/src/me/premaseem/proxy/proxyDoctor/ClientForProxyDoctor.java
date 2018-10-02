package me.premaseem.proxy.proxyDoctor;

import java.util.Scanner;

public class ClientForProxyDoctor {

	public static void main(String[] args) {

		System.out.println("Welcome to Proxy Doctor Hospital ");

		Doctor doctor = new ProxyDoctor();
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			System.out.println("What do you want from doctor ");
			System.out.println(" Press 1 for general checkup");
			System.out.println(" Press 2 for Surgery and operation ");
			System.out.println(" Press 3 for testing report and surgery ");

			int type = scan.nextInt();

			switch (type) {
			case 1:
				doctor.doGeneralCheckup();
				break;
			case 2:
				doctor.doOperationAndSurgery();
				break;
			case 3:
				doctor.provideSummaryandReport();
				break;
			}
			
			System.out.println("=============================");

			System.out.println("Press 1 for further treatment and 0 for EXIT .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
