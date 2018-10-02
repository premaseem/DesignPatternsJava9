package com.premaseem.McDonaldsMealBuilder;


public class MealBuilder {

	public Meal buildVegMeal() {
		Meal meal = new Meal();
		Wrap bottle = new Bottle();
		Wrap box = new Box();
		VegBurger veg = new VegBurger();
		veg.warp = box;
		Drink milk = new Milk();
		milk.warp=bottle;
		
		meal.addItem(veg);
		meal.addItem(milk);
		return meal;
	}

	public Meal buildNonVegMeal() {
		Meal meal = new Meal();
		Wrap bottle = new Bottle();
		Wrap box = new Box();
		Burger veg = new ChikenBurger();
		veg.warp = box;
		Drink milk = new Blood();
		milk.warp=bottle;
		
		meal.addItem(veg);
		meal.addItem(milk);
		return meal;

	}
}


