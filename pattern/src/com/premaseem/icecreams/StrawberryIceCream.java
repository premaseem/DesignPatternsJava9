package com.premaseem.icecreams;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class StrawberryIceCream implements IceCream {

    String brand;
    Integer cost;
    Integer calories;

    public StrawberryIceCream(String brand, Integer cost,Integer calories){
        this.brand=brand;
        this.cost =cost;
        this.calories =calories;
    }

    public String toString () {
        return this.getClass().getSimpleName() + "of Brand " + brand +
                " with Calories: " + getCalories() + " and cost: $" + getCost();
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
    public String getBrand () {
        return brand;
    }

}
