package com.premaseem.decorator.basecoffee;

import com.premaseem.decorator.AbstractCoffee;

public class HotCoffee extends AbstractCoffee {

	public HotCoffee (){
		setName("Hot Coffee ");
		setDescription(" Hot coffee with - ");
	}
	
	
	@Override
	public Double getCost() {
		return 10.0;
	}

}
