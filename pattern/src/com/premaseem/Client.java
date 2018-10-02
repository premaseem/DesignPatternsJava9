package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Flyweight design pattern using ** STAR WARS **  example");

        // Create Landscape object which is responsible to display stars
        Landscape landscape = new Landscape();

        // Factory will provide star based on param
        // Note: Factory will cache objects for reuse
        // and will create new object only when it does not exist in cache.
        Star star = StarFactory.getStar("dull");

        landscape.displayStar(star,65,87);

        // No new object needs to be created, Factory provides reusable object
        // from cache which landscape displays
        landscape.displayStar(StarFactory.getStar("bright"),34,43);
        landscape.displayStar(StarFactory.getStar("bright"),36,47);
        landscape.displayStar(StarFactory.getStar("dull"),34,43);
        landscape.displayStar(StarFactory.getStar("dim"),34,43);
        landscape.displayStar(StarFactory.getStar("dim"),34,43);




        /* OLD Scrapped code
        // Created 1000 stars with brightness level bright
        Star brightStar1 = new Star("bright");
        Star brightStar2 = new Star("bright");
        Star brightStar3 = new Star("bright");
        Star brightStar4 = new Star("bright");
        Star brightStar5 = new Star("bright");
        Star brightStar1000 = new Star("bright");

        // Created 1000 stars with brightness level dim
        Star dimStar1 = new Star("dim");
        Star dimStar2 = new Star("dim");
        Star dimStar3 = new Star("dim");
        Star dimStar4 = new Star("dim");
        Star dimStar5 = new Star("dim");
        Star dimStar1000 = new Star("dim");

        // Created 1000 stars with brightness level dull
        Star dullStar1 = new Star("dull");
        Star dullStar2 = new Star("dull");
        Star dullStar3 = new Star("dull");
        Star dullStar4 = new Star("dull");
        Star dullStar5 = new Star("dull");
        Star dullStar1000 = new Star("dull");

        // Create Landscape object which is responsible to display stars
        Landscape landscape = new Landscape();

        landscape.displayStar(brightStar1,34,45);
        landscape.displayStar(brightStar2,34,45);
        landscape.displayStar(brightStar3,23,65);
        landscape.displayStar(brightStar1000,34,45);

        landscape.displayStar(dimStar1,34,45);
        landscape.displayStar(dimStar2,54,45);
        landscape.displayStar(dimStar3,34,45);
        landscape.displayStar(dimStar4,34,45);
        landscape.displayStar(dimStar1000,34,45);

        landscape.displayStar(dullStar1,87,90);
        landscape.displayStar(dullStar2,34,45);
        landscape.displayStar(dullStar3,23,55);
        landscape.displayStar(dullStar1000,34,45);
    */
    }
}
