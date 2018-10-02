package com.premaseem.iterator;

import java.util.Iterator;
import java.util.List;

public class MaleEmployeeIterator implements Iterator<Employee> {

	private List<Employee> employeelist;
	private int position;
	public MaleEmployeeIterator (List<Employee> employeelist){
		this.employeelist = employeelist;
	}
	
	@Override
    public boolean hasNext() {
		for (; position < employeelist.size(); position++) {
			if ("m".equalsIgnoreCase ((employeelist.get(position)).getSex())) {
				return true;
			}
		}
		return false;
    }

	@Override
    public Employee next() {
		Employee employee = employeelist.get(position);
		position++;
		 return employee;
    }

	@Override
    public void remove() {
		employeelist.iterator().remove();
    }
}

 class FeMaleEmployeeIterator implements Iterator<Employee> {

	private List<Employee> employeelist;
	private int position;
	public FeMaleEmployeeIterator (List<Employee> employeelist){
		this.employeelist = employeelist;
	}
	
	@Override
    public boolean hasNext() {
		for (; position < employeelist.size(); position++) {
			if ("f".equalsIgnoreCase ((employeelist.get(position)).getSex())) {
				return true;
			}
		}
		return false;
    }

	@Override
    public Employee next() {
		Employee employee = employeelist.get(position);
		position++;
		 return employee;
    }

	@Override
    public void remove() {
		employeelist.iterator().remove();
    }
}


