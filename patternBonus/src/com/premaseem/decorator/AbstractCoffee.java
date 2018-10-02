package com.premaseem.decorator;

public abstract class AbstractCoffee {

	String description = " This is HOT/COLD coffee and has xx xx ";
	String name = "HOT/COLD coffee ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract Double getCost(); 
}

