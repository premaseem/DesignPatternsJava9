package com.premaseem.McDonaldsMealBuilder;

import java.util.ArrayList;
import java.util.List;


public class Meal{
	int cost;
	List<Item> meal = new ArrayList<Item>();
	void addItem(Item item){
		cost += item.cost;
		meal.add(item);
	}
	@Override
    public String toString() {
		System.out.println("You meal is ");
		for(Item itm: meal){
			System.out.print (itm.name + " ");
		}
		System.out.println();
		System.out.println("Toal cost - " + cost);
	    return " ";
    }
}

abstract class Item{
	Wrap warp;
	int  cost =2;
	String name;
}

class Burger extends Item{
}

class VegBurger extends Burger {
	public VegBurger() {
		this.name = "VegBurger";
	}
}

class ChikenBurger extends Burger {
	public ChikenBurger() {
		this.name = "ChikenBurger";
	}
}

class Wrap {
	public String name;
}

class Bottle extends Wrap {
	public Bottle() {
		this.name = "Bottle";
	}
}

class Box extends Wrap {
	public Box() {
		this.name = "Box";
	}
}

class Drink extends Item {
}

class Milk extends Drink {
	public Milk() {
		this.name = "Milk";
		cost = 10;
	}
}

class Blood extends Drink {
	public Blood() {
		this.name = "Blood";
	}
}
