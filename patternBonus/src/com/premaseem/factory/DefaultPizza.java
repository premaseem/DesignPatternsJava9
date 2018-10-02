package com.premaseem.factory;

public class DefaultPizza implements PizzaBase {

	@Override
    public double getCost() {
	    // TODO Auto-generated method stub
	    return 5;
    }

	@Override
    public String getDescription() {
	    // TODO Auto-generated method stub
	    return "complementry pizza as order item is not available right now with us";
    }

}
