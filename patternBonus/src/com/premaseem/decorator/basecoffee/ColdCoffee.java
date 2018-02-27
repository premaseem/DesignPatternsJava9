package com.premaseem.decorator.basecoffee;

import com.premaseem.decorator.AbstractCoffee;

public class ColdCoffee extends AbstractCoffee {

	public ColdCoffee (){
		setName("Cold Coffee ");
		setDescription("Cold coffee with - ");
	}
	
	@Override
	public Double getCost() {
		return 22.0;
	}
}
