package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public abstract class Decoration extends Cake{
    Cake cake;

    @Override
    String getIngredients () {
        return "decoration using different addon items";
    }
}

class CandyDecoration extends Decoration{

    Cake baseCake;

    public CandyDecoration (Cake cake) {
        baseCake = cake;
    }

    @Override
    double getCost () {
        return baseCake.getCost() + .12;
    }

    @Override
    String getIngredients () {
        return "decoration using candies";
    }
}

class CartoonDecoration extends Decoration{

    Cake baseCake;

    public CartoonDecoration (Cake cake) {
        baseCake = cake;
    }

    @Override
    double getCost () {
        return baseCake.getCost() + 2.32;
    }

    @Override
    String getIngredients () {
        return "decoration using candies";
    }
}