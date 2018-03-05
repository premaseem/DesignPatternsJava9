package com.premaseem.iterator;

import java.util.Iterator;
import java.util.Map.Entry;

public class ClientForEmployeeIterator {

	public static void main(String[] args) {
		EmployeeManger employeeManager = new EmployeeManger();

		System.out
		        .println("This is Iterator Pattern example where you can list all the male / female emplyee list using iterators. The data structure details are abstraced behind the iterator interface ");

		employeeManager.addEmployee(new Employee("aseem1", "M"));
		employeeManager.addEmployee(new Employee("Meera1", "f"));
		employeeManager.addEmployee(new Employee("aseem2", "M"));
		employeeManager.addEmployee(new Employee("sony1", "Mf"));
		employeeManager.addEmployee(new Employee("Meera2", "f"));
		employeeManager.addEmployee(new Employee("Meera3", "f"));
		employeeManager.addEmployee(new Employee("Meeralast", "f"));
		employeeManager.addEmployee(new Employee("sony2", "fM"));
		employeeManager.addEmployee(new Employee("aseem1", "m"));
		employeeManager.addEmployee(new Employee("aseemlast", "m"));

		employeeManager.employeeMap.put(1,new Employee("aseem1", "M"));
		employeeManager.employeeMap.put(2,new Employee("aseem2", "F"));
		employeeManager.employeeMap.put(3,new Employee("aseem3", "M"));
		employeeManager.employeeMap.put(1,new Employee("aseem4", "F"));
		
		MaleEmplyeeIterator maleEmployeeIterator = employeeManager.getMaleEmployeeIterator();
		printEmployeeList(maleEmployeeIterator);
		
		FeMaleEmplyeeIterator feMaleEmployeeIterator = employeeManager.getFeMaleEmployeeIterator();
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
