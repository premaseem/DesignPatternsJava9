package com.premaseem.iterator;

import java.util.Iterator;
import java.util.List;

public class MaleEmplyeeIterator implements Iterator<Employee> {

	private List<Employee> emplyeelist;
	private int position;
	public MaleEmplyeeIterator(List<Employee> emplyeelist){
		this.emplyeelist = emplyeelist;
	}
	
	@Override
    public boolean hasNext() {
		for ( ;position < emplyeelist.size(); position++) {
			if ("m".equalsIgnoreCase ((emplyeelist.get(position)).getSex())) {
				return true;
			}
		}
		return false;
    }

	@Override
    public Employee next() {
		Employee employee = emplyeelist.get(position);
		position++;
		 return employee;
    }

	@Override
    public void remove() {
		emplyeelist.iterator().remove();
    }
}

 class FeMaleEmplyeeIterator implements Iterator<Employee> {

	private List<Employee> emplyeelist;
	private int position;
	public FeMaleEmplyeeIterator(List<Employee> emplyeelist){
		this.emplyeelist = emplyeelist;
	}
	
	@Override
    public boolean hasNext() {
		for ( ;position < emplyeelist.size(); position++) {
			if ("f".equalsIgnoreCase ((emplyeelist.get(position)).getSex())) {
				return true;
			}
		}
		return false;
    }

	@Override
    public Employee next() {
		Employee employee = emplyeelist.get(position);
		position++;
		 return employee;
    }

	@Override
    public void remove() {
		emplyeelist.iterator().remove();
    }
}


