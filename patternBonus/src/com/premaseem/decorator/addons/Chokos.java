package com.premaseem.decorator.addons;

import com.premaseem.decorator.AbstractCoffee;

public class Chokos extends AddonsOfCoffee {

	public AbstractCoffee coffee =null;
	
	public Chokos(AbstractCoffee abstractCoffee){
		this.coffee = abstractCoffee;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " chocolate " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.17;
	}

}
