package com.premaseem.abstractFactory;

// Example of Abstract Factory Pattern
public abstract class AbstracePizzaFactory {

	// Example of Factory method pattern
	public abstract Pizza createPizzaBase(String PizzaType);
	public Pizza getPizzaBase(String pizzaType) {
		 return createPizzaBase(pizzaType);
    }
}

class JainPizzaFactory extends AbstracePizzaFactory{
	@Override
    public Pizza createPizzaBase(String pizzaType) {
		// Example of Simple Factory pattern
		Pizza pizza = null;
		if(pizzaType.equalsIgnoreCase("veg")){
			pizza = new JainVegPizza();
		}else
			if(pizzaType.equalsIgnoreCase("corn")){
				pizza = new JainCornPizza();
			}
		return pizza;
    }
}

class GeneralPizzaFactory extends AbstracePizzaFactory{
	@Override
    public Pizza createPizzaBase(String pizzaType) {
		Pizza pizza = null;
		if(pizzaType.equalsIgnoreCase("veg")){
			pizza = new VegPizza();
		}else
			if(pizzaType.equalsIgnoreCase("corn")){
				pizza = new CornPizza();
			}
		return pizza;
    }
}