package com.premaseem.decorator.addons;

import com.premaseem.decorator.AbstractCoffee;

public class Cream extends AddonsOfCoffee {

	public AbstractCoffee coffee =null;
	
	public Cream(AbstractCoffee abstractCoffee){
		this.coffee = abstractCoffee;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " cream " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.15;
	}

}
