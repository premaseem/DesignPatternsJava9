package com.premaseem.decorator.addons;

import com.premaseem.decorator.AbstractCoffee;

public class Whip extends AddonsOfCoffee {

	public AbstractCoffee coffee =null;
	
	public Whip(AbstractCoffee abstractCoffee){
		this.coffee = abstractCoffee;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " whip " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.28;
	}

}
