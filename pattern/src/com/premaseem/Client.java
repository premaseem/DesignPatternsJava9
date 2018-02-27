package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class Client {
    public static void main (String[] args) {
        System.out.println("Decorator Pattern example with Cake decoration project");

        // Plain Object
        Cake cake = new VanillaCake();
        System.out.println("Plain cake price without decorations - "+ cake.getCost());

        // Decorated Object with addons
        cake = new CandyDecoration(cake);
        System.out.println("Cake price with Candy decoration - "+ cake.getCost());

        // Decorated Object with addons
        // Fun side, price of Cartoon decoration is more then cake itself :-)
        cake = new CartoonDecoration(cake);
        cake = new CartoonDecoration(cake);
        System.out.println("Cake price with double Cartoon decoration - "+cake.getCost());


        /* TAKE AWAY:
        1. Lean code - as its not required to create class for each option
        2. Price can be calculated dynamically
        3. Performance improvement
        4. Loose coupling.
        5. Easy to update - price of can be updated at one place without touching other classes.

         */

        /* OLD DISCARDED CODE
        // with decoration
        cake = new VanillaCakeWithCandyDecoration();
        System.out.println("Cake price with Candy decoration - "+ cake.getCost());

        // with decoration
        cake = new VanillaCakeWithCartoonDecoration();
        System.out.println("Cake price with Cartoon decoration - "+ cake.getCost());

        // with multiple decorations
        cake = new VanillaCakeWithCandyAndCartoonDecoration();
        System.out.println("Cake price with Candy and Cartoon decoration - "+ cake.getCost());
        */

        /*Take Away from Bad Code:
        1. For each combination/ option there is a static class.
        2. With less options its ok but in real cake software time application will
        blow out of proportion due to so many classes.
        3. Updating price of even one option will impact several classes.
         */

    }
}
