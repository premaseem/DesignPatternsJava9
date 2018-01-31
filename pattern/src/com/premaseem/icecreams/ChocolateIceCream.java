package com.premaseem.icecreams;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class ChocolateIceCream implements IceCream {

    public ChocolateIceCream (Integer cost, Integer calories){
        this.cost =cost;
        this.calories =calories;
    }

    String brand = "";
    Integer cost = 0;
    Integer calories = 0;

    public String toString () {
        return this.getClass().getSimpleName() + " with Calories: " + getCalories() + " and cost: $" + getCost();
    }

    @Override
    public Integer getCalories () {
        return calories;
    }

    @Override
    public Integer getCost () {
        return cost;
    }

    @Override
    public String getIceCreamName () {
        return this.getClass().getSimpleName();
    }
}
