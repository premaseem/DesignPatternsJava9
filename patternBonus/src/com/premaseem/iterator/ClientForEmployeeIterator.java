package com.premaseem.iterator;

import java.util.Iterator;
import java.util.Map.Entry;

public class ClientForEmployeeIterator {

	public static void main(String[] args) {
		EmployeeManger employeeManager = new EmployeeManger();

		System.out
		        .println("This is Iterator Pattern example where you can list all the male / female employee list using iterators. " +
						"The data structure details are abstracted behind the iterator interface ");

		employeeManager.addEmployee(new Employee("name1", "M"));
		employeeManager.addEmployee(new Employee("name2", "f"));
		employeeManager.addEmployee(new Employee("name3", "M"));
		employeeManager.addEmployee(new Employee("name4", "Mf"));
		employeeManager.addEmployee(new Employee("name5", "f"));
		employeeManager.addEmployee(new Employee("name6", "f"));
		employeeManager.addEmployee(new Employee("name7", "fM"));
		employeeManager.addEmployee(new Employee("name8", "m"));
		employeeManager.addEmployee(new Employee("name9", "m"));
		employeeManager.addEmployee(new Employee("name10", "f"));

		employeeManager.employeeMap.put(1,new Employee("name1", "M"));
		employeeManager.employeeMap.put(2,new Employee("name2", "F"));
		employeeManager.employeeMap.put(3,new Employee("name3", "M"));
		employeeManager.employeeMap.put(1,new Employee("name4", "F"));
		
		MaleEmployeeIterator maleEmployeeIterator = employeeManager.getMaleEmployeeIterator();
		printEmployeeList(maleEmployeeIterator);
		
		FeMaleEmployeeIterator feMaleEmployeeIterator = employeeManager.getFeMaleEmployeeIterator();
		printEmployeeList(feMaleEmployeeIterator);
		
		Iterator<Employee> allEmployeeIterator = employeeManager.getAllEmployeeIterator();
		printEmployeeList(allEmployeeIterator);
		
		printEmplyeeMap(employeeManager.printEmployeeMap());

	}

	private static void printEmplyeeMap(Iterator<Entry<Integer, Employee>> iterator) {
		System.out.println("Printing employee map ");
		while (iterator.hasNext()) {
			Entry<Integer, Employee> next = iterator.next();
			System.out.println(next);
		}
    }

	private static void printEmployeeList(Iterator iterator) {
		System.out.println("Printing the list for " + iterator.getClass().getSimpleName());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
