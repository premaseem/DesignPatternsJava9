package me.premaseem.proxy.protectiveProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class ClientForProjectiveProxy {

	public static void main(String[] args) {

		System.out.println("Welcome to Role based access system using protective proxy design pattern ");

		Employee employeeBean = new Employee();
		employeeBean.setName("premaseem");
		employeeBean.setRating(10);
		employeeBean.setSalary(1000);

		EmployeeInterface employeeProxy;
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;

		System.out.println("What is your role ? ");
		System.out.println("press 1 for Manger");
		System.out.println("press 2 for Employee");
		int functionalRole = scan.nextInt();
		
		employeeProxy = getRoleBasedAccessEmployeeProxy(employeeBean, functionalRole);

		while (repeatRunFlag == 1) {
			System.out.println("What do you want to retrieve from Employee record ");
			System.out.println(" Press 1 for get Name");
			System.out.println(" Press 2 for set Salary ");
			System.out.println(" Press 3 for get Salary  ");
			System.out.println(" Press 4 for set Rating ");
			System.out.println(" Press 5 for get Rating  ");

			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					System.out.println(employeeProxy.getName());
					break;
				case 2:
					employeeProxy.setSalary(1000);
					break;
				case 3:
					System.out.println(employeeProxy.getSalary());
					break;
				case 4:
					employeeProxy.setRating(10);
					break;
				case 5:
					System.out.println(employeeProxy.getRating());

				}
			} catch (Exception e1) {
				System.out.println("################ Access is not valid ###############");
			}
			System.out.println("=============================");

			System.out.println("Press 1 to continue and 0 for EXIT .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}

	private static EmployeeInterface getRoleBasedAccessEmployeeProxy(Employee employeeBean, int functionalRole) {
	    InvocationHandler handler = null;
	    if (functionalRole == 1) {
	    	handler= new ManagerInvocationHandler(employeeBean);
		} else {
			handler = new EmployeeInvocationHandler(employeeBean);
		}
	    return (EmployeeInterface) Proxy.newProxyInstance(employeeBean.getClass().getClassLoader(), employeeBean.getClass().getInterfaces(),
	    		handler);
    }
}
