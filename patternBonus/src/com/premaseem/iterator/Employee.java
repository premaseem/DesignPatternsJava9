package com.premaseem.iterator;

public class Employee {
	
	String name;
	String sex;
	
	public Employee(String name, String sex){
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	@Override
    public String toString() {
	    return sex + " " + name ;
    }
}
