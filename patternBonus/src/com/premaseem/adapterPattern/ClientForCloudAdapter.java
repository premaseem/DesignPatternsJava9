package com.premaseem.adapterPattern;

import java.util.Scanner;

public class ClientForCloudAdapter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		

			System.out.println("This is the Cloud Broker POC which uses command pattern for provisioning for your resources on different cloud provider ");

			System.out.println("Please pick the provider to create VDC (virtual data Center) ");
			System.out.println(" Press 1 for Amazon Cloud");
			System.out.println(" Press 2 for Azure Cloud");
			System.out.println(" Press 3 for Google Cloud ");
			int vdcType = scan.nextInt();

			ClientBrokerInterface clientinterface;

			switch (vdcType) {
			case 1:
				clientinterface = new AmazonCloudAdapter();
				break;
			case 2:
				clientinterface = new AzureCloudAdapter();
				break;
			case 3:
				clientinterface = new GoogleCloudAdapter();
				break;
				default :
					clientinterface = new AmazonCloudAdapter();
			}

			
			while (repeatRunFlag == 1) {
			System.out.println(" What do you want to do ");
			System.out.println(" 1. Start a VM ");
			System.out.println(" 2. Stop a VM ");
			System.out.println(" 3. Reboot a VM");

			int taskType = scan.nextInt();
			switch (taskType) {
			case 1:
				clientinterface.start("");
				break;
			case 2:clientinterface.stop("");
				break;
			case 3:clientinterface.restart("");
				break;
			}
			System.out.println("Do you want to add more tasks before provisioning 1-yes / 0-No and trigger provisioning ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}
		}
	}
}
