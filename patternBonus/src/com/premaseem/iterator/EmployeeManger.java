package com.premaseem.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeManger {

	List<Employee> employeelist = new ArrayList<Employee>();
	Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	void addEmployee(Employee emp) {
		employeelist.add(emp);
	}

	boolean removeEmployee(Employee emp) {
		return employeelist.remove(emp);
	}

	MaleEmployeeIterator getMaleEmployeeIterator() {
		return new MaleEmployeeIterator(employeelist);
	}

	FeMaleEmployeeIterator getFeMaleEmployeeIterator() {
		return new FeMaleEmployeeIterator(employeelist);
	}

	Iterator<Employee> getAllEmployeeIterator() {
		return employeelist.iterator();
	}

	public Iterator<Entry<Integer, Employee>> printEmployeeMap() {
	    return employeeMap.entrySet().iterator();
    }

	void calculateEmpSalary() {

	}

}
