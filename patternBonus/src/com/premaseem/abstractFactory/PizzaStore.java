package com.premaseem.abstractFactory;

public class PizzaStore {

	public Pizza orderPizza(String pizzafactory, String pizzaType) {
		AbstracePizzaFactory pizzaFactory = getPizzaFactory(pizzafactory);
		Pizza pizza = pizzaFactory.getPizzaBase(pizzaType);
		bakePizza();
		return pizza;
	}

	private AbstracePizzaFactory getPizzaFactory(String pizzafactory) {
		if (pizzafactory.equalsIgnoreCase("Jain")) {
			return new JainPizzaFactory();
		} else if (pizzafactory.equalsIgnoreCase("General")) {
			return new GeneralPizzaFactory();
		}

		return new GeneralPizzaFactory();
	}


	private void bakePizza() {
		// TODO Auto-generated method stub

	}
}
