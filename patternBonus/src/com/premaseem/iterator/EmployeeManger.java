package com.premaseem.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeManger {

	List<Employee> emplyeelist = new ArrayList<Employee>();
	Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	void addEmployee(Employee emp) {
		emplyeelist.add(emp);
	}

	boolean removeEmployee(Employee emp) {
		return emplyeelist.remove(emp);
	}

	MaleEmplyeeIterator getMaleEmployeeIterator() {
		return new MaleEmplyeeIterator(emplyeelist);
	}

	FeMaleEmplyeeIterator getFeMaleEmployeeIterator() {
		return new FeMaleEmplyeeIterator(emplyeelist);
	}

	Iterator<Employee> getAllEmployeeIterator() {
		return emplyeelist.iterator();
	}

	public Iterator<Entry<Integer, Employee>> printEmployeeMap() {
	    return employeeMap.entrySet().iterator();
    }

	void calculateEmpSalary() {

	}

}
