package com.premaseem.factory;

public class PizzaFactory {

	
	static public PizzaBase getPizza(String pizzaType){
		PizzaBase pizza = null;
		
		if(pizzaType.equalsIgnoreCase("veg")){
			pizza = new VegPizza();
		}else
			if(pizzaType.equalsIgnoreCase("nonveg")){
				pizza = new NonVegPizza();
			}else
				if(pizzaType.equalsIgnoreCase("mexican")){
					pizza = new MexicanPizza();
				}else{
					pizza = new DefaultPizza();
				}
		return pizza;
	}
	
}
