package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public abstract class Cake {

    abstract String getIngredients();
    abstract double getCost();

}

class VanillaCake extends Cake {

    @Override
    String getIngredients () {
        return " Vanilla ";
    }

    @Override
    double getCost () {
        return 2;
    }
}

class VanillaCakeWithCandyDecoration extends Cake {

    @Override
    String getIngredients () {
        return " Vanilla and Candy ";
    }

    @Override
    double getCost () {
        return 2.4;
    }
}

class VanillaCakeWithCandyAndCartoonDecoration extends Cake {

    @Override
    String getIngredients () {
        return " Vanilla and candy and cartoon ";
    }

    @Override
    double getCost () {
        return 5.4;
    }
}

class VanillaCakeWithCartoonDecoration extends Cake {

    @Override
    String getIngredients () {
        return " Vanilla and cartoon ";
    }

    @Override
    double getCost () {
        return 4.4;
    }
}

class ChocolateCake extends Cake {

    @Override
    String getIngredients () {
        return " Chocolate ";
    }

    @Override
    double getCost () {
        return 3;
    }
}

